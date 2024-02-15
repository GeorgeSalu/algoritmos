/**
 * 
 * 25. escreva um programa que receba um nome
 * completo e exiba o sobrenoma (ultimo nome) primeiro
 * 
 */

let nomeCompleto = prompt("digite seu nome completo:");

let partesNome = nomeCompleto.split(' ');

let sobrenome = partesNome.pop();

partesNome.unshift(sobrenome);

let nomeInvertido = partesNome.join(' ');

console.log("nome invertido", nomeInvertido);