/**
 * 
 * crie um programa que leia tres numeros e verifique
 * se a soma deles é positiva, negativa ou zero
 * 
 */

let num1 = parseFloat(prompt("digite o primeiro numero : "));
let num2 = parseFloat(prompt("digite o segundo numero : "));
let num3 = parseFloat(prompt("digite o terceiro numero : "));

let soma = num1 + num2 + num3;

if(soma > 0) {
  console.log("a soma dos numeros é positiva");
} else if(soma < 0) {
  console.log("a soma dos numeros é negativa");
} else {
  console.log("a soma dos numeros é igual a zero");
}