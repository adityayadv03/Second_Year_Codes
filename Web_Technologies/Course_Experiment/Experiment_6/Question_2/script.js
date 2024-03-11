let but1EL=document.getElementById("but1");
let but2EL=document.getElementById("but2");
let but3EL=document.getElementById("but3");


but1EL.addEventListener("click",changeback("el1"));
but2EL.addEventListener("click",changeback("el2"));
but3EL.addEventListener("click",changeback("el3"));

function changeback(ele){
    let color=prompt("Enter Any Valid Color to Change");
    let eleEL=document.getElementById(ele);
    eleEL.style.backgroundColor=color;
}