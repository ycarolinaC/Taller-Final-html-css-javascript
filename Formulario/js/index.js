const enviar=()=>{
    let nombre = document.querySelector("#nombreC"); 
    let email= document.getElementById("email"); 
    let asunto= document.getElementById("asunto"); 
    let mensaje= document.getElementById("mensaje"); 
    let formulario = document.querySelector("#formulario");    
    formulario.addEventListener("submit",function(e){
        e.preventDefault();
        console.log("Nombre: ",nombre.value);
        console.log("e-mail: ",email.value);
        console.log("Asunto: ",asunto.value);
        console.log("Mensaje:",mensaje.value);
        window.alert("Mensaje enviado");     
    });
}



 