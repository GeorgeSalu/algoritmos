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

function isPrimo(num) {
  if( num <= 1) {
    return false;
  }
  for(let i = 2;i <= Math.sqrt(num); i++) {
    if(num % i === 0) {
      return false;
    }
  }
  return true;
}

console.log("numeros primos menores que "+numero+" :");
for(let i = 2; i < numero;i++) {
  if(isPrimo(i)) {
    console.log(i)
  }
}