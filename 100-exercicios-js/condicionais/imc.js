let altura = parseFloat(prompt("digite a altura em metros : "));
let peso = parseFloat(prompt("digite o peso em kg : "));  

let imc = peso / (altura * altura);

if(imc < 18.5) {
  console.log("seu imc é : ", imc.toFixed(2));
} else if(imc < 25) {
  console.log("seu imc é : ", imc.toFixed(2));
} else if(imc < 30) {
  console.log("seu imc é : ", imc.toFixed(2));
} else if(imc < 35) {
  console.log("seu imc é : ", imc.toFixed(2));
} else {
  console.log("seu imc é : ", imc.toFixed(2));
}

