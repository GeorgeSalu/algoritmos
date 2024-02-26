/**
 * 
 * 
 * 
 * 76. escreva um programa que leia um vetor de numeros 
 * inteiros e exiba os elementos na ordem inversa. 
 * 
 * 
 * 
 * 
 */
const quantiadde = parseInt(prompt("digite a quantidade de elementos do vetor : "));

const vetor = [];

for(let i = 0; i < quantiadde; i++) {
  const numero = parseInt(prompt(`digite o elemento ${i + i} do vetor : `));
  vetor.push(numero);
}

const vetorInverso = [];

for(let i = quantiadde - 1; i >= 0; i--) {
  vetorInverso.push(vetor[i]);
}

console.log("vetor original : ", vetor);
console.log("vetor inverso  : ", vetorInverso)