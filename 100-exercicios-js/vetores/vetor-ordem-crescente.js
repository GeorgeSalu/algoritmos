/**
 * 
 * 
 * 
 * 75. faça um programa que leia um vetor de numeros 
 * inteiros e verifique se ele esta em ordem crescente.
 * 
 * 
 * 
 */
const quantidade = parseInt(prompt("digite a quantidade de elementos do vetor : "));

const vetor = [];

for(let i = 0; i < quantidade; i++) {
  const numero = parseInt(prompt(`digite o elemento ${i + 1} do vetor : `));
  vetor.push(numero);
}

let emOrdemCrescente = true;

for(let i = 0; i < quantidade - 1; i++) {
  if(vetor[i] > vetor[i + 1]) {
    emOrdemCrescente = false;
    break;
  }
}

if(emOrdemCrescente) {
  console.log("o vetor esta em ordem crescente");
} else {
  console.log("o vetor não esta em ordem crescente")
}