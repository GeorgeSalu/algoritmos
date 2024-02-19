/**
 * 
 * 44. crie um programa que solicite a idade de uma pessoa 
 * e exiba se ela é criança (0-12anos), adolescente (13-17anos)
 * adulto(18-59anos) ou idoso (60 anos ou mais)
 * 
 */

let idade = parseInt(prompt("digite a sua idade"));

if(idade >=0 && idade <= 12) {
  console.log("vc é uma crianca")
} else if(idade >= 13 && idade <= 17) {
  console.log("vc é um adolescente")
} else if(idade >= 18 && idade <= 59) {
  console.log("vc é um adulto")
} else {
  console.log("vc é um idoso")
}