let notas = [
    { nombre: 'do', sonido: './wav/c1.wav', tono: true },
    { nombre: 'dos', sonido: './wav/c1s.wav', tono: false },
    { nombre: 're', sonido: './wav/d1.wav', tono: true },
    { nombre: 'res', sonido: './wav/d1s.wav', tono: false },
    { nombre: 'mi', sonido: './wav/e1.wav', tono: true },
    { nombre: 'fa', sonido: './wav/f1.wav', tono: true },
    { nombre: 'fas', sonido: './wav/f1s.wav', tono: false },
    { nombre: 'sol', sonido: './wav/g1.wav', tono: true },
    { nombre: 'sols', sonido: './wav/g1s.wav', tono: false },
    { nombre: 'la', sonido: './wav/a1.wav', tono: true },
    { nombre: 'las', sonido: './wav/a1s.wav', tono: false },
    { nombre: 'si', sonido: './wav/b1.wav', tono: true },
];

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

}
generateStructure(notas, 'piano');

