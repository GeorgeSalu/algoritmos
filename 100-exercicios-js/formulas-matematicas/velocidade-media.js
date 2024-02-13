/*
  11. escreva um programa que calcule a velocidade media de um objeto, utilizando
  a formula v = deltaS/deltaT, onde v é a velocidade media, deltaS é a variação
  de espaço e deltaT é a variação de tempo
*/

let variacaoDeEspaco = parseFloat(prompt("digite a variacao de espaco:"));
let variacaoDeTempo = parseFloat(prompt("digite a variacao de tempo:"));

let velocidadeMedia = variacaoDeEspaco / variacaoDeTempo;

console.log("a velocidade media do objeto :", velocidadeMedia)