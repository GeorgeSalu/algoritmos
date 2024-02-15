/**
 * 
 * 29. faça um programa que leia um numero
 * e informe se ele é par ou impar
 * 
 */

let numero = prompt("digite um numero:");

numero = parseInt(numero);

if(numero % 2 === 0) {
  console.log("o numero é par");
} else {
  console.log("o numero é impar")
}