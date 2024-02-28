/**
 * 
 * 
 * 
 * 
 * 84. faça um programa que preencha uma matriz 
 * 5x5 com valores inteiros
 * 
 * 
 * 
 * 
 * 
 */
const matriz = [];
for(let i = 0; i < 5; i++) {
  matriz[i] = [];
}

// preenche matriz
for(let i = 0; i < 5; i++) {
  for(let j = 0; j < 5; j++) {
    matriz[i][j] = parseInt(prompt(`digite o valor da posicao [${i}]|[${j}] : `));
  }
}

console.table(matriz)