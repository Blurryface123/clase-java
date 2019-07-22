console.log(window.localStorage.getItem('palabra_alamcenada'));
let amigosRetStr=window.localStorage.getItem('lista_amigos');
let amigosRet=JSON.parse(amigosRetStr);

document.getElementById('amigos').innerHTML=(function(){
    let html='';
    amigosRet.forEach(element => {
        html+=`<li>${element.name} | ${element.email}</li>`
    });
    return html;
})();