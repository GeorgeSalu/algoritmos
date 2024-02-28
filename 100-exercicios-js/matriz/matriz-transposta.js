/**
 * 
 * 
 * 
 * 82. faça um programa que preencha uma matriz 4x4
 * com valores aleatorios e exiba a matriz transposta
 * 
 * 
 * 
 * 
 */
const matriz = [];
for(let i = 0;i < 4;i++) {
  matriz[i] = [];
}

// preenche com valores aleatorios 
for(let i = 0; i < 4;i++) {
  for(let j = 0; j < 4; j++) {
    matriz[i][j] = Math.floor(Math.random() * 100);
  }
}

// exibe a matriz transposta
console.log("matriz original : ");
for(let i = 0; i < 4;i++) {
  console.log(matriz[i].join(" "));
}

// obtem a matriz transposta
const transposta = [];
for(let i = 0;i < 4; i++) {
  transposta[i] = [];
  for(let j = 0; j < 4; j++) {
    transposta[i][j] = matriz[j][i];
  }
}

//exiba a matriz transposta
console.log("matriz transposta")
for(let i = 0;i < 4;i++) {
  console.log(transposta[i].join(" "))
}