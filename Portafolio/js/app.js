const mostrar=(id)=>{  
    if(document.querySelector(`#${id}`).classList.contains("mostrar")){
        document.querySelector(`#${id}`).classList.remove("mostrar");
    }else{
        document.querySelector(`#${id}`).classList.add("mostrar");
    }
}