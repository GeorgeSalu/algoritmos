/**
 * 
 * 24. crie um programa que leia uma palavra e exiba a 
 * quantidade de vogais presentes na mesma 
 * 
 */

let palavra = prompt("digite uma palavra");

let vogais = ['a','e','i','o','u'];

let vogaisEncontradas = palavra.split('').filter(letra => vogais.includes(letra.toLowerCase()));

let quantidadeVogais = vogaisEncontradas.length;

console.log("a palavra possui ", quantidadeVogais, " vogais")