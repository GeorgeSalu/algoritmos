/**
 * 
 * 
 * 59. escreva um programa que solicite ao usuario dois numeros
 * A e B e exiba todos os numeros entre A e B
 * 
 * 
 */

let A = parseInt(prompt("digite o numero A : "));
let B = parseInt(prompt("digite o numero B : "));

if(A < B) {
  for(let i = A + 1; i < B; i++) {
    console.log(i)
  }
} else if(A > B) {
  for(let i = A - 1; i > B; i++) {
    console.log(i);
  }
} else {
  console.log("os numeros são iguais não ha numeros entre eles")
}