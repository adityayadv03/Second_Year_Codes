// Author :- Aditya Yadav

let str=prompt("Enter Any String :- "); //Taking String from the webpage using prompt function
let arrstr=str.split(" "); //Spliting string using spilt function
let paraEL=document.getElementById("para-el"); //Targetting the para-el to display the result on the web page

function cap(word){ //Function to convert each word first character into uppercase
    let newstr="" //To Store the result
    for(let i=0 ; i<word.length; i++){ //Loop to iterate the complete word
        let ch=word.charAt(i); //Taking a character from the word
        if(i==0){ //if the i is 0 then adding to answer by converting it to uppercase
            newstr+=ch.toUpperCase();
        }else{
            newstr+=ch; //otherwise adding it directly
        }
    }
    return newstr; //Returning the Capitalize word
}

for(let i=0 ; i<arrstr.length ; i++){
    paraEL.innerHTML+=cap(arrstr[i])+" " //Printing the answer to web page using DOM 
}