/***
 * 
 * 
 * 57. crie um programa que exiba os primeiros N numeros
 * primos, onde N é informado pelo usuario, utilizando um
 * laço de repetição
 * 
 * 
 */

let N = parseInt(prompt("digite um numero : "));

function isPrimo(num) {
  if(num < 2) {
    return false;
  }
  for(let i = 2;i <= Math.sqrt(num); i++) {
    if(num % i === 0) {
      return false;
    }
  }
  return true;
}

console.log("os primeiros "+N+" numeros primos são : ");
let count = 0;
let i = 2;
while(count < N) {
  if(isPrimo(i)) {
    console.log(i);
    count++;
  }
  i++;
}