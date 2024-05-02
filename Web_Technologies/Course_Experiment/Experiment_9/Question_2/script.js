const nameEL=document.getElementById("name");
const mailEl=document.getElementById("mail");
const sapEL=document.getElementById("Sap");
const submitEL=document.getElementById("submit");

submitEL.addEventListener("click",(event)=>{
    let name=nameEL.value;
    let sap=sapEL.value;
    let mail=mailEl.value;
    if(name==="" || sap==="" || mail===""){
        console.log("Fields are Empty");
    }else if(isValidfield(mail)!==true){
        event.preventDefault();
    }
});

function isValidfield(ch){
    let space=/[ ]/;
    if(space.test(ch)===true){
        return false;
    }else{
        return true;
    }
}