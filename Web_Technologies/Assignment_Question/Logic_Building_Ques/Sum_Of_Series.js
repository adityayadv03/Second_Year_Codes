// Author :- Aditya Yadav
//Aim :- To Print the Sum of Following Series
// x/1!+(x*x)/2!+(x*x*x)/3!+.....+(x^n)/n!

let obj=require("readline-sync")
let x=obj.question("Enter the Value of X :- ")
let n=obj.question("Enter the Value of N :- ")

function fac(val){
    if(val===1 || val===0){
        return 1
    }else{
        return val*fac(val-1)
    }
}

let mul=1
let sum=0
let div
for(let i=1 ; i<=n ; i++){
    for(let j=1 ; j<=i ; j++){
        mul*=x
    }
    div=mul/fac(i)
    sum+=div
    mul=1
    div=0
}
console.log("The Sum of Series :- "+sum)
