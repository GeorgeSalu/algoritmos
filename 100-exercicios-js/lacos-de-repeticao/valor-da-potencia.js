/***
 * 
 * 
 * 54. escreva um programa qua calcule e exiba o valor
 * da potencia de um numero informado pelo usuario elevado 
 * a um expoente também informado pelo usuario. utilizando
 * laços de repetição
 * 
 * 
 */

let base = parseInt(prompt("digite o valor da base : "));
let expoente = parseInt(prompt("digite o valor do expoente : "));
let resultado = 1;

for(let i = 0; i < expoente; i++) {
  resultado += base;
}

console.log(base+" elevado a "+expoente+" é: "+resultado)