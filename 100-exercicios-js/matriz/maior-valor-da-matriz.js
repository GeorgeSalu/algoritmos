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

for(let i = 0;i < 5; i++) {
  for(let j = 0; j < 5; j++) {
    matriz[i][j] = parseInt(prompt(`digite o valor da posicao [${i}]|[${j}] : `));
  }
}

let maiorValor = matriz[0][0];
let posicaoMaiorValor = [0,0];

for(let i = 0; i < 5; i++) {
  for(let j = 0;j < 5; j++) {
    if(matriz[i][j] > maiorValor) {
      maiorValor = matriz[i][j];
      posicaoMaiorValor = [i, j];
    }
  }
}

console.log("o maior valor da matriz é "+maiorValor);
console.log(` se encntra na posicao : [${posicaoMaiorValor[0]}] [${posicaoMaiorValor[1]}]`)