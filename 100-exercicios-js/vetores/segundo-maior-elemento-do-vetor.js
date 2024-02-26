/**
 * 
 * 
 * 
 * 77. crie um programa que leia um vetor de numeros inteiros
 * e encontre o segundo maior elemento presente no vetor
 * 
 * 
 * 
 * 
 */

const quantidade = parseInt(prompt("digite a quantidade de elementos do vetor : "));

const vetor = [];

for(let i = 0;i < quantidade; i++) {
  const numero = parseInt(prompt(`digite o elemento ${i + 1} do vetor : `));
  vetor.push(numero);
}

let maior = vetor[0];

for(let i = 1;i < vetor.length; i++) {
  if(vetor[i] > maior) {
    maior = vetor[i];
  }
}

let segundoMaior = -Infinity;

for(let i = 0; i < vetor.length; i++) {
  if(vetor[i] !== maior && vetor[i] > segundoMaior) {
    segundoMaior = vetor[i];
  }
}

console.log("segundo maior elemento : ",segundoMaior)