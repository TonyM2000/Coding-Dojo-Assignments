function buttonclick(element) {
    console.log(typeof parseFloat(element.innerText));
    element.innerText = parseFloat(element.innerText)+1;
}
function deletebut(element) {
    element.remove();
}
function changebut(element) {
    if (element.innerText =="Logout"){
        element.innerText ="Login";
    }else{
        element.innerText ="Logout";
    }

}