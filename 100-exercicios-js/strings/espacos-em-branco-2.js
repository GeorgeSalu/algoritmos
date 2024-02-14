/**
 * 
 * 23. faça um programa que receba uma frase e exiba a
 * quantidade de espaços em branco presentes na mesma
 * (sem utilizar laco de repeticao) 
 */

let frase = prompt("digite uma frase:");

let palavras = frase.split(" ");

let quantidadeEspacos = palavras.length - 1;

console.log("a frase possui ", quantidadeEspacos, " espacos em branco");