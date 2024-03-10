function random(){
    let random=Math.floor(Math.random()*100);
    let textEL=document.getElementById("text");
    textEL.textContent="The Randomly Generated Number is :- "+random;
}
random();