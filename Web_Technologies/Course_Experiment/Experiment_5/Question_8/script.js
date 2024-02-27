let ageEL=document.getElementById("age-el")

function ageoption(){
    for(let i=1 ; i<1000 ; i++){
        ageEL.innerHTML+="<option>"+i+"<option>"
    }
}
ageoption()