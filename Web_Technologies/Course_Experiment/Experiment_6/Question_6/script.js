const inputEL=document.getElementById("inp");
const strEL=document.getElementById("str");
const endEL=document.getElementById("end");
const extEL=document.getElementById("ext");
const evaEL=document.getElementById("eva");

evaEL.addEventListener("click",()=>{
    let str=inputEL.value;
    let startindx=strEL.value;
    let endindx=endEL.value;
    extEL.textContent=str+startindx+endindx;
})