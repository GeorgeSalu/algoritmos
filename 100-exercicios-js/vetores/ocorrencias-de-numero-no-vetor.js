/**
 * 
 * 
 * 
 * 
 * 78. faça um programa que leia um vetor de numeros inteiros e exiba 
 * quantas vezes um numero especifico aparece no vetor.
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

const numeroBuscado = parseInt(prompt(`digite um numero a ser buscado : `));

let contador = 0;

for(let i = 0;i < vetor.length; i++) {
  if(vetor[i] === numeroBuscado) {
    contador++;
  }
}

console.log(`o vetor :`+vetor)
console.log(`o numero ${numeroBuscado} aparece ${contador} vezes no vetor`)