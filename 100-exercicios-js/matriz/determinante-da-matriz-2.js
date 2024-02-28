/***
 * 
 * 
 * 
 * 
 * 87. faça um programa que leia uma matriz 3x3
 * e calcule o determinante da matriz
 * 
 * 
 * 
 * 
 * 
 * 
 */
const matriz = [];
for(let i = 0;i < 3;i++) {
  matriz[i] = [];
  for(let j = 0;j < 3; j++) {
    matriz[i][j] = parseInt(prompt(`digite em (${i + 1}, ${j + 1})`));
  }
}

console.log("matriz : ");
for(let i = 0;i < 3;i++) {
  console.log(matriz[i].join(" "));
}

const determinante = calculaDeterminante(matriz);
console.log("determinante : ", determinante)


function calculaDeterminante(matriz) {
  let determinante = 0;

  for(let i = 0; i < 3; i++) {
    let termoPrincipal = 1;
    let termoSecundario = 1;

    for(let j = 0;j < 3; j++) {
      termoPrincipal *= matriz[j][(i + j) % 3];
      termoSecundario *= matriz[j][(i - j + 3) % 3];
    }

    determinante += termoPrincipal - termoSecundario;
  }

  return determinante;
}