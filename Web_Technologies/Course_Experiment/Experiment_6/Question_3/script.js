let dropEL=document.getElementById("age");
for(let i=12 ; i<=50 ; i++){
    dropEL.innerHTML+="<option>"+i+"</option>";
}

let nameEL=document.getElementById("name");
let ageEl=document.getElementById("age");
let messEl=document.getElementById("mess");
let passEL=document.getElementById("pass");

function validFill(){
    let flag=false;
    if(nameEL.value!=="" && ageEl.value!==""){
        flag=true;
    }
    else{
        messEl.textContent="Please Enter the Name and Age Before Submitting";
        butEL.disabled=true;
    }
    return flag;
}

function validAge(){
    let flag=false;
    if(ageEl.value>=18 && ageEl.value<=30){
        flag=true;
    }
    else{
        messEl.textContent="Age is Not in the Range 18-30 . ";
        butEL.disabled=true;
    }
    return flag;
}

function validPass(){
    let flag=false;
    let password=passEL.value;
    if(password.length>=6){
        flag=true;
    }
    else{
        messEl.textContent="Password is To Small . ";
        butEL.disabled=true;
    }
    return flag;
}

let butEL=document.getElementById("sub");
butEL.addEventListener("click",function check(){
    if(validFill()===true && validAge()===true && validPass()===true){
        document.write("Thank You For Submittion . ");
    }
    setTimeout(()=>{
        butEL.disabled=false;
    },5000);
})