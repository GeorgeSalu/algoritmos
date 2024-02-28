/**
 * 
 * 
 * 
 * 
 * 83. faça um programa que leia duas matrizes
 * 2x2 e exiba a soma das duas matrizes
 * 
 * 
 * 
 * 
 */
console.log("digite os elementos da primeira matriz : ");
const matriz1 = lerMatriz();

console.log("digite os elementos da segunda matriz : ");
const matriz2 = lerMatriz();

console.log("matriz 1");
exibirMatriz(matriz1);

console.log("matriz 2");
exibirMatriz(matriz2)


const matrizSoma = [];
for(let i = 0; i < 2;i++) {
  matrizSoma[i] = [];
  for(let j = 0;j < 2; j++) {
    matrizSoma[i][j] = matriz1[i][j] + matriz2[i][j];
  }
}

console.log("soma das matrizes");
exibirMatriz(matrizSoma)


function lerMatriz() {
  const matriz = [];
  for(let i = 0;i < 2; i++) {
    matriz[i] = [];
    for(let j = 0;j < 2;j++) {
      matriz[i][j] = parseInt(prompt(`digite o valor da possicao [${i}]|[${j}] : `));
    }
  }
  return matriz;
}

function exibirMatriz(matriz) {
  for(let i = 0;i < 2;i++) {
    console.log(matriz[i].join(" "))
  }
}