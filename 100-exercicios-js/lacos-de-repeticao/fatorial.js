/***
 * 
 * 
 * 58. crie um programa que exiba o fatorial de N, onde
 * N é informado pelo usuario, utilizando um laço de repetição
 * 
 * 
 */

let N = parseInt(prompt("digite um numero : "));

let fatorial = 1;

for(let i = 2; i <= N; i++) {
  fatorial *= i;
}

console.log("o fatorial de N é "+fatorial)