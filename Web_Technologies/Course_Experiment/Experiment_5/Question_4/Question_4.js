// Author :- Aditya Yadav
let str=prompt("Enter any String :- "); //Taking Input from Prompt
str=str.split(" "); //Spliting Each Word having space in between
let idx=-1 //Created a Variable to Store the index of longest String
let paraEL=document.getElementById("para-el");
for(let i=0 ; i<str.length ; i++){ //Traverse the Split String Array
    if(i==0 || str[idx].length<str[i].length){ //Check the Condition and words having high length
        idx=i; //Storing it in idx
    }
}
paraEL.innerHTML="<p style='display:inline'>The Longest Word in the String is :- </p>"
paraEL.innerHTML+="<h3 style='display:inline'>"+str[idx]+"</h3>" //Printing to the Web Page
