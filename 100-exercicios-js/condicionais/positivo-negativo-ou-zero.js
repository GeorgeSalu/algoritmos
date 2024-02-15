/**
 * 
 * 30. faça um programa que leia um numero e informe 
 * se ele é positivo, negativo ou zero
 * 
 */

let numero = prompt("digite um numero:");

numero = parseFloat(numero);

if(numero > 0) {
  console.log("o numero é positivo");
} else if(numero < 0) {
  console.log("o numero é negativo");
} else {
  console.log("o numero é zero")
}