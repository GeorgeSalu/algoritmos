let ladoA = parseFloat(prompt("digite o valor do lado a:"));
let ladoB = parseFloat(prompt("digite o valor do lado b:"));
let ladoC = parseFloat(prompt("digite o valor do lado c:"));
let altura = parseFloat(prompt("digite o valor da altura triangulo (lado b)"));

let perimetro = ladoA + ladoB + ladoC;

let area = (ladoB * altura) / 2;

console.log("o perimetro do triangulo é:", perimetro);
console.log("a area do triangulo é:", area)