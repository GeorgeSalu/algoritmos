/*
  13. escreva um programa que calcule o trabalho realizado por uma força
  que atua sobre um objeto, utilizando a formula T = F * d, onde T é
  o trablaho, F é a forca aplicada e d é a distancia percorrida pelo objeto
*/
let forca = parseFloat(prompt("digite a força aplicada (F):"));
let distancia = parseFloat(prompt("digite a distancia percorrida (d):"));

let trabalho = forca * distancia;

console.log("o trabalho realizado pela forca é:", trabalho)