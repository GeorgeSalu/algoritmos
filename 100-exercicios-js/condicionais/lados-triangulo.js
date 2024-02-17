/***
 * 
 * 37. faça um programa que leia tres numeros e informe se eles 
 * podem ser lados de um triangulo (a soma de dois lados deve ser
 * sempre maior que o terceiro lado)
 * 
 */
let lado1 = parseFloat(prompt("digite o primeiro lado do triangulo : "));
let lado2 = parseFloat(prompt("digite o terceiro lado do triangulo : "));
let lado3 = parseFloat(prompt("digite o terceiro lado do triangulo : "));

if(lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
  console.log("os numeros podem ser lados de um triangulo");
} else {
  console.log("os numeros nao podem formar um triangulo")
}