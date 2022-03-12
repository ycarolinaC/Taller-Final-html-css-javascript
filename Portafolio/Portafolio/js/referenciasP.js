const recibir=()=>{
    let datos =localStorage.getItem("valor1");   
    console.log("vamos por buen camino ",datos);   
    var contenedorC = document.getElementById("contenedor");
    contenedorC.className=datos;
    var datos1 =localStorage.getItem("valor2");  
    console.log("vamos por buen camino ",datos1); 
    let contenedorP = document.getElementById("botonA");
    contenedorP.className=datos1;
}

const mostrar=(id)=>{
    if(document.querySelector(`#${id}`).classList.contains("mostrar")){
        document.querySelector(`#${id}`).classList.remove("mostrar");
    }else{
        document.querySelector(`#${id}`).classList.add("mostrar");
    }
}