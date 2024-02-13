/*
  14. escreva um programa que leia a posição x e y de dois pontos no plano
  cartesiano, e calcule a distancia entre ambos
*/

let x1 = parseFloat(prompt("digite a coordenada x do primeiro ponto:"));
let y1 = parseFloat(prompt("digite a coordenada y do primeiro ponto:"));

let x2 = parseFloat(prompt("digite a coordenada x do segundo ponto:"));
let y2 = parseFloat(prompt("digite a coordenada y do segundo plano:"));

let diffX = x2 - x1;
let diffY = y2 - y1;

let distancia = Math.sqrt(Math.pow(diffX, 2) + Math.pow(diffY, 2));

console.log("distancia entre os ponto é ", distancia)
