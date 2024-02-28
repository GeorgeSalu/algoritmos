/**
 * 
 * 
 * 
 * 
 * 88. faça um programa que preencha uma matriz 4x4 
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

// calcula a soma das colunas
console.log("soma das colunas : ");
for(let j = 0;j < 4; j++) {
  let somaColuna = 0;
  for(let i = 0;i < 4;i++) {
    somaColuna += matriz[i][j];
  }
  console.log(`coluna ${j + 1}: ${somaColuna}`)
}

function gerarNumeroAleatorio(min, max) {
  return Math.floor(Math.random() * (max - min + 1) + min);
}