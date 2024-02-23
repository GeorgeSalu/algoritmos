/**
 * 
 * 
 * 
 * 65. escreva um programa que solicite ao usuario uma frase
 * e exiba a frase de tras para frente.
 * 
 * 
 * 
 */
const frase = prompt("digite uma frase : ");
const fraseInvertida = frase.split('').reverse().join('');

console.log("a frase invertida : ", fraseInvertida)