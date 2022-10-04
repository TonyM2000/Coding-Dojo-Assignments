var searchforitem = document.querySelector("#searchitem");

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
function setsearch(element) {
    console.log(element.value);
}
function searchit() {
    console.log("Searching for " + searchforitem.value);
    alert("Searching for " + searchforitem.value);
}
function add1(element) {
    var count = element.parentNode.querySelector(".likecount")
    count.innerText++
}