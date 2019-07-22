let amigos = [
    { name: 'Jose', email: 'jose.barealpz@gmail.com' },
    { name: 'Paco', email: 'paco.lopez@gmail.com' },
    { name: 'Lara', email: 'lara.garcia@gmail.com' },
    { name: 'Javi', email: 'javi.barreiro@gmail.com' },
    { name: 'Luisa', email: 'luisa.gonzalez@gmail.com' }
];


window.localStorage.setItem('palabra_almacenada',"Valor de la palabra");
window.localStorage.setItem('lista_amigos',JSON.stringify(amigos));