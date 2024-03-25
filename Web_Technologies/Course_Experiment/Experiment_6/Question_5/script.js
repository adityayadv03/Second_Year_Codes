const promptEL=document.getElementById("prompt");
const alertEL=document.getElementById("alert");
const confirmEL=document.getElementById("confirm");
const buttonEL=document.getElementById("button1");

buttonEL.addEventListener("click",()=>{
    let pro=promptEL.checked;
    let ale=alertEL.checked;
    let con=confirmEL.checked;
    if(pro===true){
        let name=prompt("What's your Name");
        alert("Hey! "+name);
    }else if(ale===true){
        alert("Hey User!");
    }else if(con===true){
        if(confirm("Wanna Leave the Page .")){
            location.replace("../Question_4/Thank_You.html");
        }else{
            alert("Thank You for Staying");
        }
    }
});