/*
  10. escreva um programa que calcule o perimetro e a area de um triangulo,
  utilizando as formulas p = a + b + c e A = (b * h)/ 2, onde a,b e c
  são lados do triangulo e h é a altura relativa ao lado b
*/

let ladoA = parseFloat(prompt("digite o valor do lado a:"));
let ladoB = parseFloat(prompt("digite o valor do lado b:"));
let ladoC = parseFloat(prompt("digite o valor do lado c:"));
let altura = parseFloat(prompt("digite o valor da altura triangulo (lado b)"));

let perimetro = ladoA + ladoB + ladoC;

let area = (ladoB * altura) / 2;

console.log("o perimetro do triangulo é:", perimetro);
console.log("a area do triangulo é:", area)