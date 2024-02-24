let length=parseInt(prompt("Enter The String length :- "))

let paraEL=document.getElementById("para-el")
console.log(paraEL)

const characters="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdeghijklmnopqqrstuvwxyz0123456789"
function generatestr(length){
    let res=" "
    for(let i=0 ; i<length ; i+=1){
        res+=characters.charAt(Math.floor(Math.random()*62)) //Here 62 is the length of characters var we can use characters.length but it can create confusion thats why directly use the value
    }
    paraEL.textContent+=res
}

generatestr(length)
