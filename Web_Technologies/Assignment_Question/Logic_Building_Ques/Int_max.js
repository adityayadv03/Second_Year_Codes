let object=require("readline-sync");
let str=object.question("Enter Array Element :- ");
let arr=str.split(" ");
console.log(arr);
function intMax(arr){
    let max=0;
    for(let i=0 ; i<arr.length ; i++){
        arr[i]=parseInt(arr[i]);
        if(max<arr[i]){
            max=arr[i];
        }
    }
    console.log("Max Element is :- "+max);
}
intMax(arr);