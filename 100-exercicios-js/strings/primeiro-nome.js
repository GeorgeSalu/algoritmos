/**
 * 
 * 22. escreva um programa que receba um nome completo e exiba
 * somente o primeiro nome
 * 
 */

let nomeCompleto = prompt("digite o seu nome completo:");

let partesNome = nomeCompleto.split(" ");

let primeiroNome = partesNome[0];

console.log("o primeiro nome é :", primeiroNome)