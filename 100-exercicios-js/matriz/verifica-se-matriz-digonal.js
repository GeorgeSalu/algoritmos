/**
 * 
 * 
 * 
 * 
 * 89. faça um programa que leia uma matriz 4x4 e verifique 
 * se ela é uma matriz diagonal. isto é. se todos os elementos
 * fora da diagonal principal são iguais a zero
 * 
 * 
 * 
 * 
 * 
 */

function criaMatriz(linhas, colunas) {
  const matriz = [];
  for(let i = 0; i < linhas; i++) {
    matriz.push([]);
    for(let j = 0; j < colunas; j++) {
      matriz[i].push(0)
    }
  }
  return matriz;
}



function lerMatriz(matriz) {
  const linhas = matriz.length;
  const colunas = matriz[0].length;
  for(let i = 0;i < linhas; i++) {
    for(let j = 0;j < colunas; j++) {
      matriz[i][j] = parseInt(prompt(`Informe o elemento [${i + 1}][${j + 1}] da matriz`))
    }
  }
}

function verificaMatrizDiagonal(matriz) {
  const linhas = matriz.length;
  const colunas = matriz[0].length;

  for(let i = 0;i < linhas; i++) {
    for(let j = 0;j < colunas; j++) {
      if(i !== j && matriz[i][j] !== 0) {
        return false;
      }
    }
  }
  return true;
}

const matriz = criaMatriz(4,4);

lerMatriz(matriz);

const isDiagonal = verificaMatrizDiagonal(matriz);

if(isDiagonal) {
  console.log("a matriz é uma matriz diagonal")
} else {
  console.log("a matriz não é uma matriz diagonal")
}