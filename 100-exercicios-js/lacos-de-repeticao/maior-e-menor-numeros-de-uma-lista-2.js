/***
 * 
 * 
 * 63. escreva um programa que solicite ao usuario uma lista de numeros, 
 * ate o usuario digitar o numero zero, e exiba o maior e o menor numero
 * desta lista (utilizando array)
 * 
 * 
 */

let numbers = [];
let number;

do {
  number = parseFloat(prompt("digite um numero : "));

  if(number !== 0 && !isNaN(number)) {
    numbers.push(number);
  }

}while(number !== 0)

if(numbers.length > 0) {
  let min = numbers[0];
  let max = numbers[0];

  for(let i = 1; i < numbers.length; i++) {
    let num = numbers[i];

    if(num < min) {
      min = num;
    }

    if(num > max) {
      max = num;
    }
  }

  console.log("o menor numero : "+min);
  console.log("o maior numero é :"+max);

} else {
  console.log("nenhum numero foi digitado")
}