/***
 * 
 * 
 * 64. escreva um programa que solicite ao usuario uma 
 * frase e exiba a quantidade de vogais na frase;
 * 
 * 
 */

const frase = prompt("digite uma frase : ");
const vogais = frase.match(/[aeiou]/gi);

if(vogais !== null) {
  const quantidadeVogais = vogais.length;
  console.log("a quantidade de vogais na frase é : "+quantidadeVogais);
} else {
  console.log("a frase nao contem vogais")
}