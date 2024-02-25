/**
 * 
 * 
 * 
 * 
 * 74. crie um programa que leia doi vetores de numeros 
 * inteiros com o mesmo tamanho e exiba um novo vetor com
 * a soma dos elementos correspondentes dos dois vetores
 * 
 * 
 * 
 * 
 */
const quantidade = parseInt(prompt("digite a quantidade de elementos dos vetores : "));

const vetor1 = [];
const vetor2 = [];

for(let i = 0;i < quantidade; i++) {
  const numero1 = parseInt(prompt(`digite o elemento ${i + 1} do vetor 1 :`));
  vetor1.push(numero1);

  const numero2 = parseInt(prompt(`digite o elemento ${i + 1} do vetor 2 :`));
  vetor2.push(numero2);
}

const vetorSoma = [];

for(let i = 0; i < quantidade; i++) {
  const soma = vetor1[i] + vetor2[i];
  vetorSoma.push(soma)
}

console.log(`vetor com a soma dos elementos corespondentes : ${vetorSoma}`)