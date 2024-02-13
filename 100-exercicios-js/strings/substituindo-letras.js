/*
  18. crie um programa que receba uma frase e substitua
  todas as letras "a" por "e"
*/

let frase = prompt("digite uma frase");

let novaFrase = frase.replace(/a/g, "e");

console.log("nova frase :", novaFrase)