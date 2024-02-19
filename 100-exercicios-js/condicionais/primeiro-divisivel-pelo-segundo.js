/**
 * 
 * 45. faça um programa que solicite dois numeros e
 * exiba se o primeiro é divisivel pelo segundo
 * 
 */
let numero1 = parseInt(prompt("digite o primeiro numero : "));
let numero2 = parseInt(prompt("digite o segundo numero : "));

if(numero1 % numero2 === 0) {
  console.log(numero1, " é divisivel por ", numero2)
} else {
  console.log(numero1, " não é divisivel por ", numero2)
}