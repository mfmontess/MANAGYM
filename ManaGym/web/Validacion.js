function Validar (forma){
    var idejercicio = forma.idejercicio;
    if(idejercicio.value =="" || idejercicio.value>999999999999 || idejercicio.value<100){
        alert("Escriba un ID valido...!");
        idejercicio.focus();
        idejercicio.select();
        return false;
    }
    
}
