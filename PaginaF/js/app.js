const mostrar=(lista)=>{  
    var num =document.querySelectorAll(`#${lista} > li`);
    //console.log(nombreClase);
    num.forEach((element, index) => {
        //console.log(element.className)
        let num1= index+1;
        //console.log(num1)
        if(num1%2==0){
            if(element.classList.contains("style1")){
                element.classList.remove("style1")
            }else{
                element.classList.add("style1")
            }
        }else{
            if(element.classList.contains("style2")){
                element.classList.remove("style2")
            }else{
                element.classList.add("style2")
            }
        }
    });
   
}