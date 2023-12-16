/*
  crie um programa que calcule e exiba a media
  artimetica de tres notas informadas pelo usario
*/

let nota1 = parseFloat(prompt("digite a primira nota:"));
let nota2 = parseFloat(prompt("digite a segunda nota:"));
let nota3 = parseFloat(prompt("digite a terceira nota:"));

let media = (nota1+nota2+nota3) / 3;

console.log("a media das notas é : ", media)