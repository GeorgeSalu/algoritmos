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

// solicite ao usuario a quantidade de elementos dos vetores
const quantidade = parseInt(prompt("digite a quantidade de elementos dos vetores : "));

//c ria dois vetores vazios
const vetor1 = [];
const vetor2 = [];

// preenche os vetores com os numeros informados pelo usuario
for(let i = 0;i < quantidade; i++) {
  const numero1 = parseInt(prompt(`digite o elemento ${i + 1} do vetor 1 :`));
  vetor1.push(numero1);

  const numero2 = parseInt(prompt(`digite o elemento ${i + 1} do vetor 2 :`));
  vetor2.push(numero2);
}

// cria um vetor para armazenar a soma dos elementos correspondentes dos dois vetores
const vetorSoma = [];


// calcula a soma dos elementos correspondentes dos dois vetores
for(let i = 0; i < quantidade; i++) {
  const soma = vetor1[i] + vetor2[i];
  vetorSoma.push(soma)
}

// exibe o vetor com a soma dos elementos correspondentes
console.log(`vetor com a soma dos elementos corespondentes : ${vetorSoma}`)