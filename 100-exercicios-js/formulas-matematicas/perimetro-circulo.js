/*
  crie um programa que calcule e exiba o perimetro
  de um circulo, solicitando o raio ao usuario
*/

let raio = parseFloat(prompt("digite o raio do circulo"));

let perimetro = 2 * Math.PI * raio;

console.log("o perimetro do circulo é:", perimetro.toFixed(2))