const inputEL=document.getElementById("inp");
const strEL=document.getElementById("str");
const endEL=document.getElementById("end");
const extEL=document.getElementById("ext");
const evaEL=document.getElementById("eva");
const errorEL=document.getElementById("error");

evaEL.addEventListener("click",()=>{
    let str=inputEL.value;
    let startindx=strEL.value;
    let endindx=endEL.value;
    let valid=str.length;
    if(startindx<0 || endindx>=valid){
        errorEL.textContent+="Invalid Index"
        setTimeout(() => {
            inputEL.value="";
            strEL.value="";
            endEL.value="";
            errorEL.textContent="";
        }, 3000);
    }else{
        extEL.textContent="";
        for(let i=startindx ; i<=endindx ; i++){
            extEL.textContent+=str.charAt(i);
        }
    }
})