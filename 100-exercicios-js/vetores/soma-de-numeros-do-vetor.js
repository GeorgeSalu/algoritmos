/**
 * 
 * 
 * 
 * 71. crie um programa que leia um vetor de numeros inteiros
 * e exiba a soma de todos os elementos
 * 
 * 
 * 
 */

const quantidade = prompt("digite a quantidade de elementos do vetor : ");

const vetor = [];

for(let i = 0;i < quantidade;i++) {
  const numero = parseInt(prompt(`digite o elemento ${i + 1} : `));
  vetor.push(numero);
}

let soma = 0;
for(let i = 0;i < vetor.length; i++) {
  soma += vetor[i];
}

console.log("a soma dos elementos é : "+soma)