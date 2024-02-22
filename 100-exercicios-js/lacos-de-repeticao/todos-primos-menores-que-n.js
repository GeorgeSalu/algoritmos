/***
 * 
 * 
 * 56. escreva um programa que solicite ao usuario um
 * numero N e exiba todos os numeros primos menores que
 * N
 * 
 * 
 */
let numero = parseInt(prompt("digite um numero : "));

console.log("numeros primos menores que "+numero+" :");

for(let i = 2; i < numero; i++) {
  let isPrimo = true;
  for(let j = 2; j < i; j++) {
    if(i % j === 0) {
      isPrimo = false;
      break;
    }
  }
  if(isPrimo) {
    console.log(i)
  }
}