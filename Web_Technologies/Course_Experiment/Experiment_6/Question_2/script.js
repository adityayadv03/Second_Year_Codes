let but1EL=document.getElementById("but1");
let but2EL=document.getElementById("but2");
let but3EL=document.getElementById("but3");


but1EL.addEventListener("click",function changeback(){
    let color=prompt("Enter Any Valid Color to Change");
    let eleEL=document.getElementById("el1");
    eleEL.style.backgroundColor=color;
});
but2EL.addEventListener("click",function changeback(){
    let color=prompt("Enter Any Valid Color to Change");
    let eleEL=document.getElementById("el2");
    eleEL.style.backgroundColor=color;
});
but3EL.addEventListener("click",function changeback(){
    let color=prompt("Enter Any Valid Color to Change");
    let eleEL=document.getElementById("el3");
    eleEL.style.backgroundColor=color;
});

function changeback(ele){
    let color=prompt("Enter Any Valid Color to Change");
    let eleEL=document.getElementById(ele);
    eleEL.style.backgroundColor=color;
}