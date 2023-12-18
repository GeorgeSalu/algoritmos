/*
  escreva um programa que calcule a area do um 
  circulo a partir do raio, utilizando a formula a=PIr
*/

let raio = parseFloat(prompt("digite o raio do circulo:"));

let area = Math.PI * Math.pow(raio, 2);

console.log("area do circulo é:", area.toFixed(2))