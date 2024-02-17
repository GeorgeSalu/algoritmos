/***
 * 
 * 35. faça um programa que leia tres numeros e 
 * informe qual é o maior e qual o menor
 * 
 */

let num1 = parseFloat(prompt("digite o primeiro numero: "));
let num2 = parseFloat(prompt("digite o segundo numero: "));
let num3 = parseFloat(prompt("digite o terceiro numero: "));

let maior = num1;

if(num2 > maior) {
  maior = num2;
}

if(num3 > maior) {
  maior = num3;
}

let menor = num1;
if(num2 < menor) {
  menor = num2;
}
if(num3 < menor) {
  menor = num3;
}

console.log("o maior numero é : ", maior);
console.log("o menor numero é : ", menor)