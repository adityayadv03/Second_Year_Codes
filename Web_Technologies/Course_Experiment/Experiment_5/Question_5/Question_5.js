// Author :- Aditya Yadav
let lowEL=document.getElementById("low");
let highEL=document.getElementById("high");
let evenansEL=document.getElementById("evenans");
let oddansEL=document.getElementById("oddans");

function validinput(){
    let low=lowEL.value;
    let high=highEL.value;
    let flag=true;
    if(low<0 || low>1000 || high<0 || high>1000 || high<low){
        flag=false;
        document.getElementById("mess").textContent="Invalid Input";
        butEL.disabled=true;
    }else{
        flag=true
        document.getElementById("mess").textContent="";
    }
    return flag;
}

function printIt(){
    let iseven=document.getElementById("even").checked;
    let isodd=document.getElementById("odd").checked;
    for(let i=lowEL.value ; i<=highEL.value ; i++){
        if(i%2==0 && iseven==true){
            oddansEL.textContent="";
            evenansEL.textContent+=i+" ";
            console.log(i);
        }else if(isodd==true){
            evenansEL.textContent="";
            oddansEL.textContent+=i+" ";
            console.log(i);
        }
    }
}

let butEL=document.getElementById("but1");
butEL.addEventListener("click",()=>{
    if(validinput()==true){
        oddansEL.textContent="Odd Number :- ";
        evenansEL.textContent="Even Number :- ";
        printIt();
    }else{
        setTimeout(()=>{
            butEL.disabled=false;
        },3000);
    }
})