/**
 * 
 * 
 * 
 * 
 * 86. faça um programa que preencha uma matriz 4x4 
 * com numeros aleatorios e exiba a soma dos valores
 * preseentes em cada linha e em cada coluna.
 * 
 * 
 * 
 * 
 * 
 */
const matriz = [];
for(let i = 0; i < 4; i++) {
  matriz[i] = [];
}

// popula matriz com numeros aleatorios
for(let i = 0; i < 4; i++) {
  for(let j = 0; j < 4; j++) {
    matriz[i][j] = gerarNumeroAleatorio(1,10);
  }
}

// exibe a matriz
console.log("matriz :");
for(let i = 0;i < 4; i++) {
  console.log(matriz[i].join(" "));
}

// calcula a soma das linhas
console.log("soma das linhas : ");
for(let i = 0;i < 4; i++) {
  let somaLinha = 0;
  for(let j = 0;j < 4; j++) {
    somaLinha += matriz[i][j];
  }
  console.log(`linha ${i + 1}: ${somaLinha}`)
}

function gerarNumeroAleatorio(min, max) {
  return Math.floor(Math.random() * (max - min + 1) + min);
}