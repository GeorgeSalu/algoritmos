/*
  12. escreva um programa que calcule a energia cinetica de um objeto
  em movimento, utilizando a formula E=(mv²)/2, onde E é a energia cinetica,
  m é a massa do objeto e v é a velocidade
*/

let massa = parseFloat(prompt("digite a massa do objeto (m):"));
let velocidade = parseFloat(prompt("digite a velocidade do objeto (v):"));

let energiaCinetica = (massa * velocidade ** 2)/2;

console.log("a energia cinetica do objeto é :", energiaCinetica)