/***
 * 
 * 
 * 55. escreva um programa que solicite ao usuario um numero N 
 * e diga se o mesmo é primo ou não
 * 
 * 
 */
let numero = parseInt(prompt("digite um numero : "));

let primo = true;

for(let i = 2; i <= numero / 2;i++) {
  if(numero % i === 0) {
    primo = false;
    break;
  }
}

if(primo) {
  console.log(numero+" é um numero primo ")
} else {
  console.log(numero+" não é um numero primo ")
}