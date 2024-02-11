/*
  escreva um programa que calcule o perimetro e a area
  de um retangulo
*/

let largura = parseFloat(prompt("digite a largura do retangulo:"));
let comprimento = parseFloat(prompt("digite o comprimento do retangulo:"));

let perimetro = 2 * (largura + comprimento);

let area = largura * comprimento;

console.log("o perimetro do retangulo é :", perimetro);
console.log("a area do retangulo é :", area)