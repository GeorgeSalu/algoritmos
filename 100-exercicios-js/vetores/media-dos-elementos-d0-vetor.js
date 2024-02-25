/**
 * 
 * 
 * 
 * 73, escreva um programa que leia um vetor de numeros 
 * inteiros e exiba a media aritmetica dos elementos.
 * 
 * 
 * 
 */
const quantidade = parseInt(prompt("digite a quantidade de elementos do vetor : "));

const vetor = [];

for(let i = 0;i < quantidade;i++) {
  const numero = parseInt(prompt(`digite o valor do elemento ${i + 1} : `));
  vetor.push(numero);
}

let soma = 0;
for(let i = 0; i < vetor.length; i++) {
  soma += vetor[i];
}

const media = soma / vetor.length;

console.log(`a media dos elementos do vetor é : ${media}`)