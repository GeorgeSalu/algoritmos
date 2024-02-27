/**
 * 
 * 
 * 
 * 81. faça um programa que preencha uma matriz 3x3 
 * com valores informados pelo usuario e exiba a soma 
 * dos valores da diagonal principal
 * 
 * 
 * 
 * 
 */
const matriz = [];
for(let i = 0; i < 3;i++) {
  matriz[i] = [];
}


for(let i = 0;i < 3;i++) {
  for(let j = 0;j < 3;j++) {
    const valor = parseInt(prompt(`digite o valor para a posicao [${i}|${j}] : `));
    matriz[i][j] = valor;
  }
}


// calcula a soma da digonal
let soma = 0;
for(let i = 0; i < 3; i++) {
  soma += matriz[i][i];
}

console.log("a soma da digonal é "+soma)