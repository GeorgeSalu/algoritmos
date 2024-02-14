/**
 * 
 * 23. faça um programa que receba uma frase e exiba a
 * quantidade de espaços em branco presentes na mesma
 * 
 */

let frase = prompt("digite uma frase:");

let quantidadeEspacos = 0;

for(let i = 0; i < frase.length; i++) {
  if(frase[i] === " ") {
    quantidadeEspacos++;
  }
}

console.log("a frase possui ", quantidadeEspacos," espacos em branco")