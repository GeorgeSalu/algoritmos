/***
 * 
 * 
 * 64. escreva um programa que solicite ao usuario uma 
 * frase e exiba a quantidade de vogais na frase;
 * 
 * 
 */

const frase = prompt("digite uma frase : ");
const vogais = ["a", "e", "i", "o", "u"];
let quantidadeVogais = 0;

for(let i = 0;i < frase.length;i++) {
  const caractere =frase[i].toLowerCase();

  if(vogais.includes(caractere)) {
    quantidadeVogais++;
  }

}

console.log("a quantidade de vogais na frase é :"+quantidadeVogais)