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

const quantidade = parseInt(prompt("digite a quantiade de elementos do vetor : "));

const vetor = [];

for(let i = 0;i < quantidade; i++) {
  const numero = parseInt(prompt(`digite o elemento ${i + 1} do vetor : `));
  vetor.push(numero);
}

vetor.sort((a, b) => a - b);

if(vetor.length >= 2) {
  const segundoMaior = vetor[vetor.length - 2];
  console.log("segundo maior elemento : ", segundoMaior);
} else {
  console.log("o vetor precisa ter pelo menos dois elementos")
}