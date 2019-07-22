let amigos = [
    { name: 'Jose', email: 'jose.barealpz@gmail.com' },
    { name: 'Paco', email: 'paco.lopez@gmail.com' },
    { name: 'Lara', email: 'lara.garcia@gmail.com' },
    { name: 'Javi', email: 'javi.barreiro@gmail.com' },
    { name: 'Luisa', email: 'luisa.gonzalez@gmail.com' }
];
//Parsear

function parseaamigos(liamigos) {
    let listaul = document.getElementById('listamigos');
    for (let index = 0; index < liamigos.length; index++) {
        listaul.innerHTML += `<li>
        <div>${liamigos[index].name}</div>
        <div>${liamigos[index].email}</div>
        <div><button class='saluda' data-value="${liamigos[index].name + ': ' + liamigos[index].email}">Saludar</button></div>
       </li >`;

    }
    botones('saluda', 'data-value');
}


//Procesar
function greetins(classboton, attrib) {
    let saludos = document.getElementById(say_hello);
    for (let index = 0; index < saludos.length; index++) {
        saludos[index].onclick = function () {
            alert(this.getAttribute(attrib));
        }

    }
}

parseaamigos(amigos);


