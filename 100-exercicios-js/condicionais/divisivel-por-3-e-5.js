/**
 * 
 * escreva um programa que solicite um numero inteiro
 * e verifique se é divisivel por 3 e por 5 ao mesmo
 * tempo
 * 
 */

let numero = parseInt(prompt("digite um numero inteiro : "));

if(numero % 3 === 0 && numero % 5 === 0) {
  console.log(numero, " é divisivel por 3 e por 5");
} else {
  console.log(numero, " não é divisivel por 3 e por 5");
}