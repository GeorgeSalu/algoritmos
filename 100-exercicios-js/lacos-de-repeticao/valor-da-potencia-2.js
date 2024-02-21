/***
 * 
 * 
 * 54. escreva um programa qua calcule e exiba o valor
 * da potencia de um numero informado pelo usuario elevado 
 * a um expoente também informado pelo usuario. 
 * 
 * 
 */
let base = parseFloat(prompt("digite o numero da base : "));
let expoente = parseInt(prompt("digite o expoente : "));

let resultado = Math.pow(base, expoente);

console.log(base + " elevado a "+expoente+" é:  "+resultado)