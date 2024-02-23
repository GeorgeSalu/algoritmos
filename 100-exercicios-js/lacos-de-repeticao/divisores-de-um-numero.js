/***
 * 
 * 
 * 67. escreva um programa que solicite ao usuario um
 * numero é exiba os seus divisoeres
 * 
 * 
 * 
 */

const numero = parseInt(prompt("digite um numero : "));

console.log("divisores de "+numero+" :");

for(let i = 1;i <= numero; i++) {
  if(numero % i === 0) {
    console.log(i)
  }
}