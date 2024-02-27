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
const quantidade = parseInt(prompt("digite a quantiade de elementos do vetor : "));

const vetor = [];

for(let i = 0; i < quantidade; i++) {
  const numero = parseInt(prompt(`digite o elemento ${i + 1} do vetor : `));
  vetor.push(numero);
}

const impares = vetor.filter(numero => numero % 2 !== 0);

if(impares.length === 0) {
  console.log("todos os elementos do vetor sao pares")
} else {
  console.log("o velor contem elementos impares")
}