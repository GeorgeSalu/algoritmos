/***
 * 
 * 
 * 60. escreva um programa que leia numeros do usuario 
 * ate que seja digitado um numero negativo e exxiba a 
 * soma dos numeros positivos
 * 
 * 
 */

let numero;
let soma = 0;

do {
  numero = parseInt(prompt("digite um numero negativo para sair : "));

  if(numero >= 0) {
    soma += numero;
  }

} while(numero >= 0)

console.log("a soma dos numeroes positivos é : "+soma)