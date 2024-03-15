let nameEL=document.getElementById("name");
let ageEl=document.getElementById("age");
let messEl=document.getElementById("mess");

function valid(){
    let flag=false;
    if(nameEL.value!=="" && ageEl.value!==""){
        flag=true;
    }
    else{
        messEl.textContent="Please Enter the Name and Age Before Submitting";
    }
    return flag;
}

let butEL=document.getElementById("sub");
butEL.addEventListener("click",function check(){
    if(valid()===true){
        document.write("Thank You For Submittion . ");
    }
})