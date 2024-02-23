/***
 * 
 * 
 * 62. escreva um programa que leia numeros dos usuario ate
 * que seja digitado zero e exiba a media dos numeros digitados
 * 
 * 
 */

let sum = 0;
let count = 0;
let number;

do {
  number = parseFloat(prompt("digite um numero (ou zero para sair) : "));

  if(number !== 0) {
    sum += number;
    count++;
  }

} while(number !== 0)

if(count !== 0) {
  let average = sum / count;
  console.log("a media dos numeros digitados é : ", average);
} else {
  console.log("nenhum numero foi digitado : ");
}