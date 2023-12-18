/*
  escreva um programa que calcule a media geometrica
  entre tres numeros informados pelo usuario
*/

let num1 = parseFloat(prompt("digite o primeiro numero:"));
let num2 = parseFloat(prompt("digite o segundo numero:"));
let num3 = parseFloat(prompt("digite o terceiro numero:"));

let mediaGeometrica = Math.pow(num1 * num2 * num3, 1/3);

console.log("a media geometrica dos numeros é :", mediaGeometrica)