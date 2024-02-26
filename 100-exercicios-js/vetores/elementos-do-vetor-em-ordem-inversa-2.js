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
const quantidade = parseInt(prompt("digite a quantidade de elementos do vetor : "));

const vetor = [];

for(let i = 0;i < quantidade; i++) {
  const numero = parseInt(prompt(`digite o elemento ${i + 1} do vetor : `));
  vetor.push(numero);
}

vetor.reverse();

console.log("vetor invertido : ", vetor)