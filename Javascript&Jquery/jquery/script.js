console.log($("#holabtn").html)
$("#holabtn").click(function(){
    alert("Hola!");
});

$("h1").html("Hola!!").click(function(){alert("Este es el titulo");});

let amigos = [
    { name: 'Jose', email: 'jose.barealpz@gmail.com' },
    { name: 'Paco', email: 'paco.lopez@gmail.com' },
    { name: 'Lara', email: 'lara.garcia@gmail.com' },
    { name: 'Javi', email: 'javi.barreiro@gmail.com' },
    { name: 'Luisa', email: 'luisa.gonzalez@gmail.com' }];

$("#amigos").html(function(){
    let htmlAmigos="";
    amigos.forEach(unAmigo => {
        htmlAmigos += `<li>
        <div>${unAmigo.name}</div>
        <div>${unAmigo.email}</div>
        <div><button class="saludaBtn" data-value="$(unAmigo.name">Saludar</button> </div>
        </li>`;
        

    })

    return htmlAmigos;
});
$(`#amigos`).

$(`.saludaBtn`).click(function(){alert("hola "+$(this).attr(`data-value`)+ "!!");})

