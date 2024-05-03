const express=require('express');
const mongoose=require('mongoose');
const path=require('path');
const port=3000;

const  app=express();
app.use(express.static(__dirname))
app.use(express.urlencoded({extended:true}))

mongoose.connect('mongodb://127.0.0.1:27017/students');
const db=mongoose.connection
db.once('open',()=>{
    console.log("Mongodb connection successful");
})

const userSchema = new mongoose.Schema({
    name:String,
    Sap:Number,
    mail:String
});

const Users = mongoose.model("data",userSchema)

app.get('/',(req,res)=>{
    res.sendFile(path.join(__dirname,'index.html'))
});

app.post('/post',async(req,res)=>{
    const {name,Sap,mail}=req.body;
    const user = new Users({
        name,
        Sap,
        mail
    })
    await user.save()
    console.log(user)
    res.send("Form Submitted");
});

app.listen(port,()=>{
    console.log("Server Started");
});