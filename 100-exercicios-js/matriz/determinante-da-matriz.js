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
  const a = matriz[0][0];
  const b = matriz[0][1];
  const c = matriz[0][2];
  const d = matriz[1][0];
  const e = matriz[1][1];
  const f = matriz[1][2];
  const g = matriz[2][0];
  const h = matriz[2][1];
  const i = matriz[2][2];

  const termoPrincipal = a * e * i + b * f * g + c * d * h;
  const termoSecundario = c * e * g + a * f * h + b * d * i;

  const determinante = termoPrincipal - termoSecundario;
  return determinante;
}