/**
 * 
 * 38. faça um programa que leia o ano de nascimento 
 * de uma pessoa e informe se ela esta apta a votar
 * (idade maior ou igual a 16 anos)
 * 
 */
let anoAtual = new Date().getFullYear();

let anoNascimento = parseInt(prompt("digite o ano de seu nascimento"));

let idade = anoAtual - anoNascimento;

if(idade >= 16) {
  console.log("vc esta apto a votar");
} else {
  console.log("vc ainda nao pode voltar")
}