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
let fraseInvertidae = "";

for(let i = frase.length - 1; i >= 0; i--) {
  fraseInvertidae += frase[i];
}

console.log("frase invertidade : "+fraseInvertidae)