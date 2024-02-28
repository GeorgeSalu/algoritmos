/**
 * 
 * 
 * 
 * 86. faça um programa que preencha uma matriz 4x4 
 * com valores aleatorios e exiba seu valor
 * 
 * 
 * 
 * 
 */

const matriz = [];
for(let i = 0;i < 4;i++) {
  matriz[i] = [];
}

// popula  matriz com numeros aleatorios
for(let i = 0;i < 4;i++) {
  for(let j = 0;j < 4;j++) {
    matriz[i][j] = gerarNumeroAleatorio(1, 10);
  }
}

// exibe matriz
console.log("matriz : ");
for(let i = 0;i < 4; i++) {
  console.log(matriz[i].join(" "))
}



function gerarNumeroAleatorio(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}