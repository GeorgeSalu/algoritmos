/*
  21. crie um programa que leia duas palavras e verifique
  se a segunda palavra é um anagrama da primeira
*/

let palavra1 = prompt("digite a primeira palavra");
let palavra2 = prompt("digite a segunda palavra");

palavra1 = palavra1.toLowerCase();
palavra2 = palavra2.toLowerCase();

let arrayPalavra1 = palavra1.split("");
let arrayPalavra2 = palavra2.split("");

arrayPalavra1.sort();
arrayPalavra2.sort();

if(arrayPalavra1.join("") === arrayPalavra2.join("")) {
  console.log("a segunda palavra é um anagrama da primeira");
} else {
  console.log("a segunda palavra não é um anagrama da primeira");
}