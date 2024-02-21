/**
 * 
 * 49. escreva um programa que exiba os numeros 
 * pares de 1 a 50 e os numeros impares de 51 a 
 * 100 utlizando um laço de repetição
 * 
 */

let num = 1;
while (num <= 100) {
  if(num <= 50 && num % 2 === 0) {
    console.log(num+" (par)");
  } else if(num > 50 && num % 2 !== 0) {
    console.log(num+" impares")
  }
  num++;
}