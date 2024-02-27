/**
 * 
 * 
 * 
 * crie é imprima uma matriz
 * 
 * 
 * 
 */


// cria uma matriz vazia com 3 linhas e 3 colunas
const matriz = [];
for(let i = 0;i < 3 ; i++) {
  matriz[i] = [];
}

// preenche a matriz com valores informados pelo usuario
for(let i = 0;i < 3;i++) {
  for(let j = 0;j < 3;j ++) {
    const valor = parseInt(prompt(`digite o valor da posicao [${i}|${j}] : `));
    matriz[i][j] = valor;
  }
}

console.table(matriz)