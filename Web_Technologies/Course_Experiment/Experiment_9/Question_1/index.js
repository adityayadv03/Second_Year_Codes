const express=require('express');
const mongoose=require('mongoose');
const port=3000;
const app=express();

mongoose.connect('mongodb://localhost:27017/employees')

const dataschema= new mongoose.Schema({
    item:String,
    qty:Number
});

const usermodel=mongoose.model("products",dataschema)

app.get('/details',(req,res)=>{
    usermodel.find({}).then(function(products){
        res.json(products)
    }).catch(function(err){
        console.log(err);
    });
});

app.listen(port,()=>{
    console.log(`Server Listening at ${port}`);
});