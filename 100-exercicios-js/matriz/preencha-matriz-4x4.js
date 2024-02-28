/**
 * 
 * 
 * 
 * 82. faça um programa que preencha uma matriz 4x4 
 * com valores aleatorios e imprima
 * 
 * 
 * 
 * 
 */

const matriz = [];
for(let i = 0;i < 4;i++) {
  matriz[i] = []
}

for(let i = 0; i < 4; i++) {
  for(let j = 0;j < 4; j++) {
    matriz[i][j] = Math.floor(Math.random() * 100);
  }
}

console.log("matriz original");
console.table(matriz)