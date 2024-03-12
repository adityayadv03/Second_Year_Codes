let but1EL=document.getElementById("but1");
let but2EL=document.getElementById("but2");
let but3EL=document.getElementById("but3");
let but4EL=document.getElementById("but4");
let but5EL=document.getElementById("but5");
let but6EL=document.getElementById("but6");


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
but4EL.addEventListener("click",function changewebcolor(){
    let color=prompt("Enter Any Valid Color to Change ");
    let eleEL=document.getElementById("body");
    eleEL.style.backgroundColor=color;
})
but5EL.addEventListener("click",function change(){
    let color=prompt("Enter Any Valid Color to Change ");
    let eleEL=document.getElementsByClassName("center");
    for(let i=0 ; i<eleEL.length ; i++){
        eleEL[i].style.backgroundColor=color;
    }
})
but6EL.addEventListener("click",function alertbut(){
    alert("Hey User Alert Message Show!");
})