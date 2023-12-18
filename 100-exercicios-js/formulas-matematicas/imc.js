let peso = parseFloat(prompt("digite o seu peso em kg:"));
let altura = parseFloat(prompt("digite a altura em metros:"));

let imc = peso / (altura * altura);

console.log("o imc é:", imc.toFixed(2))