/**
 * 
 * 
 * 
 * 
 * 85. faça um programa que leia uam matriz 3x3 e 
 * calcule a media dos valores presentes nas posições
 * pares (soma dos indices par) da matriz
 * 
 * 
 * 
 * 
 */
const matriz = [];
for(let i = 0;i < 3; i++) {
  matriz[i] = [];
}

// preenche a matriz
for(let i = 0;i < 3;i++) {
  for(let j = 0; j < 3; j++) {
    matriz[i][j] = parseInt(prompt(`digite o valor da posicao [${i}]|[${j}] : `));
  }
}

let soma = 0;
let contador = 0;

for(let i = 0; i < 3; i++) {
  for(let j = 0; j < 3; j++) {
    if((i + j) % 2 === 0) {
      soma += matriz[i][j];
      contador++;
    }
  }
}

const media = soma / contador;

console.log("matriz")
console.table(matriz)
console.log(`resultado ${media.toFixed(2)}`)