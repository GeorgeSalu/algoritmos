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

console.log("os primeiros "+N+" numeros primos são");
let count = 0;
let num = 2;

while(count < N) {
  let isPrimo = true;

  for(let i = 2; i <= Math.sqrt(num); i++) {
    if(num % i === 0) {
      isPrimo = false;
      break;
    }
  }

  if(isPrimo) {
    console.log(num);
    count++;
  }

  num++;
}