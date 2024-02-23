// Author :- Aditya Yadav
let paraEL=document.getElementById("para-el")

function is_prime(x){
    let re=true
    if(x<=1){
        re=false
    }else{
        for(let i=2 ; i<=x/2 ; i+=1){
            if(x%i===0){
                re=false
            }
        }
    }
    return re
}

let lower=parseInt(prompt("Enter the Lower Limit :- "))
let upper=parseInt(prompt("Enter the Upper Limit :- "))

if(lower>0 && upper<100000){
    paraEL.innerHTML+="Prime Number :- "
    while(lower<=upper){
        if(is_prime(lower)===true){
            paraEL.textContent+=lower+" "
        }
        lower+=1
    }
}else{
    alert("Wrong Input .");
}