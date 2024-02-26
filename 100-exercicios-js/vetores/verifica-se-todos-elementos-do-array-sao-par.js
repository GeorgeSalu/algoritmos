/**
 * 
 * 
 * 
 * 
 * 80. crei um programa que leia um vetor de numeros 
 * inteiros e verifique se todos os elementos são pares.
 * 
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

let todosPares = true;
for(let i = 0; i < quantidade; i++) {
  if(vetor[i] % 2 !== 0) {
    todosPares = false;
    break;
  }
}

if(todosPares) {
  console.log("todos os elementos do vetor são pares")
} else {
  console.log("o vetor contem elementos impares")
}