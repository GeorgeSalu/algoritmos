/**
 * 
 * 24. crie um programa que leia uma palavra e exiba a 
 * quantidade de vogais presentes na mesma 
 * 
 */
let palavra = prompt("digite uma palavra");

let vogais = palavra.match(/[aeiou]/gi);

let quantidadeVogais = vogais ? vogais.length : 0;

console.log("a palara possui ", quantidadeVogais, "  vogais")