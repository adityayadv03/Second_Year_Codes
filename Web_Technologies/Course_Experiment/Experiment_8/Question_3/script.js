const express=require('express');
const app=express();
const port=3000;

app.get('/',(req,res)=>{
    res.send(`
    <h2>Welcome to the Basic Calculator!</h2>
    <h4>To Perform Operation you to add the following to the url</h4>
    <h4>For Addition :- /add?num1=5&num2=10</h4>
    <h4>For Subtraction :- /subtract?num1=10&num2=5</h4>
    <h4>For Multiplication :- /mul?num1=5&num2=10</h4>
    <h4>For Division :- /divide?num1=50&num2=10</h4>
`);
});

app.get('/add',(req,res)=>{
    let {num1,num2}=req.query;
    num1=parseInt(num1);
    num2=parseInt(num2);
    let result=num1+num2;
    res.send(`Addition Result:${result}`);
});

app.get('/subtract',(req,res)=>{
    let {num1,num2}=req.query;
    num1=parseInt(num1);
    num2=parseInt(num2);
    let result=num1-num2;
    res.send(`Subtraction Result:${result}`);
});

app.get('/mul',(req,res)=>{
    let {num1,num2}=req.query;
    num1=parseInt(num1);
    num2=parseInt(num2);
    let result=num1*num2;
    res.send(`Multiplication Result:${result}`);
});

app.get('/divide',(req,res)=>{
    let {num1,num2}=req.query;
    num1=parseInt(num1);
    num2=parseInt(num2);
    if(num2!=0){
        let result=num1/num2;
        res.send(`Division Result:${result}`);
    }
    else{
        res.send("Denominator Can't be Zero");
    }
});

app.listen(port,()=>{
    console.log(`Server running at ${port}`);
});