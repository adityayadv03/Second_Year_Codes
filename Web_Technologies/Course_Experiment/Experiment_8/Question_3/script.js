const express=require('express');
const app=express();
const port=3000;

app.get('/',(req,res)=>{
    res.send('Welcome to the Basic Calculator!');
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

app.listen(port,()=>{
    console.log(`Server running at ${port}`);
});