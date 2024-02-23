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
let fraseInvertida = "";

for(let i = frase.length - 1; i >= 0; i--) {
  fraseInvertida += frase[i];
}

console.log("frase invertidade : "+fraseInvertida)