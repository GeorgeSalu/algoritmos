/**
 * 
 * 
 * 
 * 72. faça um programa que leia um vetor de numeros inteiros
 * e exiba o maior elemento presente no vetor
 * 
 * 
 * 
 */
const quantidade = prompt("digite a quantidade de elementos do vetor : ");

const vetor = [];

for(let i = 0;i < quantidade; i++) {
  const numero = parseInt(prompt(`digite o elemento ${i + 1} : `));
  vetor.push(numero)
}

let maior = vetor[0];

for(let i = 1;i < vetor.length; i++) {
  if(vetor[i] > maior) {
    maior = vetor[i];
  }
}

console.log("o maior elemento do vetor é : "+maior)