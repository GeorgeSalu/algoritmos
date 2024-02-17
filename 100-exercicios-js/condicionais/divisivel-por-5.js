/**
 * 
 * 33. faça um programa que leia tres numeros, e 
 * informe se a soma deles é divisivel por 5 ou não
 * 
 */

let num1 = parseInt(prompt("digite o primeiro numero: "));
let num2 = parseInt(prompt("digite o segundo numero: "));
let num3 = parseInt(prompt("digite o terceiro numero: "));

let soma = num1 + num2 + num3;

if(soma % 5 === 0) {
  console.log("a soma dos numeros é divisivel por 5");
} else {
  console.log("a soma dos numeros não é divisivel por 5");
}