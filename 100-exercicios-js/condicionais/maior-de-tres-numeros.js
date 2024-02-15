/**
 * 
 * 28. faça um programa que leia tres numeros e 
 * informe qual o maior
 * 
 */

let numero1 = prompt("digite o primeiro numero: ");
let numero2 = prompt("digite o segundo numero: ");
let numero3 = prompt("digite o terceiro numero: ");

numero1 = parseFloat(numero1);
numero2 = parseFloat(numero2);
numero3 = parseFloat(numero3);

let maior = numero1;

if(numero2 > maior) {
  maior = numero2;
}

if(numero3 > maior) {
  maior = numero3;
}

console.log("o maior numero é :",maior)