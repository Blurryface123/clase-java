 





$('#piano').click(function () {
 
    $.ajax({
        url: "http://www.mocky.io/v2/5bd88500310000bc3c474eef",
    }).done(function (dataNotas) {
        console.log(dataNotas);
        //INYECTAR dataNotas en el html
        generarHtml(dataNotas, "piano1");
 
 
 });



function generateStructure(arrNotes, divN) {
    let finalHtml = '';

    arrNotes.forEach(function (element) { //función callback
        finalHtml += element.tono ? `<div class="note" data-snd="${element.sonido}"></div>` : `<div class="note semi" data-snd="${element.sonido}"></div>`; //note y semi son dos clases diferentes
    });

    document.getElementById(divN).innerHTML = finalHtml;
    associateAndPlayNotes();
}
function associateAndPlayNotes() {
    let player = document.getElementById('player');

    document.querySelectorAll('.note').forEach(element => {
        element.onclick = function () {
            player.src = this.getAttribute('data-snd');
            player.play();
        }
    });
    generateStructure(notas, "piano1");
}

