/***
 * 
 * 
 * 63. escreva um programa que solicite ao usuario uma lista de numeros, 
 * ate o usuario digitar o numero zero, e exiba o maior e o menor numero
 * desta lista
 * 
 * 
 */

let min = Infinity;
let max = -Infinity;
let number;

do {
  number = parseFloat(prompt("digite um numero (ou zero para encerrar) : "));

  if(number !== 0) {
    if(number < min) {
      min = number;
    }

    if(number > max) {
      max = number;
    }
  }

} while(number !== 0);


if(min !== Infinity && max !== -Infinity) {
  console.log("o menor numero é :", min);
  console.log("o maior numero é : ", max)
} else {
  console.log("nenhum numero foi digitado")
}