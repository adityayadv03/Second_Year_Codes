let dobEL=document.getElementById("dob");

const ageEL=document.getElementById("age");

const butEL=document.getElementById("but");
butEL.addEventListener('click',()=>{
    let today=new Date();
    let dateofbirth=dobEL.value;
    let dob=new Date(dateofbirth);
    let year=dob.getUTCFullYear();
    let age=Math.abs(year-today.getFullYear());
    ageEL.textContent="Your Age is :- "+age;
});
