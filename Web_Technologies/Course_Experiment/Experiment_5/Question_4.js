let str=prompt("Enter any String :- ");
str=str.split(" ");
let idx=-1
let paraEL=document.getElementById("para-el");
for(let i=0 ; i<str.length ; i++){
    if(i==0 || str[idx].length<str[i].length){
        idx=i;
    }
}
paraEL.innerHTML="<p style='display:inline'>The Longest Word in the String is :- </p>"
paraEL.innerHTML+="<h3 style='display:inline'>"+str[idx]+"</h3>"
console.log(str[idx]);
console.log(str);