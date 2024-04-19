original_string="Hey User The Quote for aa the day is aa apple keeps the Doctor Away";
modified_string=original_string.replace(/a{2,}/g,'b');

console.log("Original String:", original_string);
console.log("Modified String:", modified_string);
