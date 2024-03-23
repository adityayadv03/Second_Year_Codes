const inputEL=document.getElementById("in");
const messEL=document.getElementById("message");
var old;
inputEL.addEventListener("keydown",(event)=>{
    messEL.textContent+=event.key+" ";
    if(old==='C' && event.key==="Enter"){
        messEL.textContent="";
        inputEL.value="";
    }else if(old==='R' && event.key==="Enter"){
        messEL.textContent="You Have Typed :- ";
        inputEL.value="";
    }else if(old==="Enter" && event.key==="Enter"){
        let opi=prompt("What to Stay or Leave [S/L]");
        if(opi==='L'){
            location.replace("Thank_You.html");
        }else{
            inputEL.value="";
        }
    }
    old=event.key;
});