/**
 * 
 * 
 * 
 * 
 * 79. escreva um programa que leia dois vetores de numeros
 * inteiros com o mesmo tamanho e exiba um novo vetor com os 
 * elementos resultantes da multiplicação dos elementos corres-
 * pondentes dos dois vetores.
 * 
 * 
 * 
 * 
 */
const quantidade = parseInt(prompt("digite a quantidade de elementos do vetor : "));

const vetor1 = [];
const vetor2 = [];

for(let i = 0;i < quantidade; i++) {
  const numero1 = parseInt(prompt(`digite o elemento ${i + 1} do primeiro vetor : `));
  vetor1.push(numero1);

  const numero2 = parseInt(prompt(`digite o elemento ${i + 1} do segundo vetor : `));
  vetor2.push(numero2);
}

const vetorResultado = [];

for(let i = 0; i < quantidade ; i++) {
  const resultado = vetor1[i] * vetor2[i];
  vetorResultado.push(resultado);
}

console.log(`vetor resultado : ${vetorResultado}`)