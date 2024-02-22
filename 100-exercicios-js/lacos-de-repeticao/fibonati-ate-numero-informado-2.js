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
let number = parseInt(prompt("digite um numero : "));

let sequencia = [0,1];

while(sequencia[sequencia.length - 1] <= number) {
  let nexNumber = sequencia[sequencia.length - 1] + sequencia[sequencia.length - 2];
  sequencia.push(nexNumber);
}

console.log("sequencia de fibonacci ate : "+number+" :");

for(let i = 0; i < sequencia.length; i++) {
  console.log(sequencia[i])
}