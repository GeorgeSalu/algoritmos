/**
 * 
 * 
 * 61. faça um programa que solicite ao usuario um numero 
 * e exiba a sequancia de fibonacci ate o numero informado 
 * utlizando um laço de repetição
 * 
 * 
 * 
 */

let numero = parseInt(prompt("digite um numero : "));

let numeroAnterior = 0;
let numeroAtual = 1;

console.log("sequencia de fibonacci ate "+numero+" :");

while(numeroAtual <= numero) {
  console.log(numeroAtual);

  let proximoNumero = numeroAnterior + numeroAtual;
  numeroAnterior = numeroAtual;
  numeroAtual = proximoNumero;
}