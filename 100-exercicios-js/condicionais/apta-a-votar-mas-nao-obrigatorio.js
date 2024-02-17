/**
 * 
 * 39. faça um programa que leia a idade de uma pessoa
 * e informe se ela não esta apta a votar (idade inferior
 * a 16anos), e se esta apta a votar, porem não é obrigada
 * (16 e 17anos, ou idade igual ou superior a 70anos ), ou
 * se é obrigada (18 a 69anos)
 * 
 */

let idade = parseInt(prompt("digite a sua idade"));

if(idade < 16) {
  console.log("vc não esta apto a votar")
} else if(idade >= 16 && idade <= 17 || idade >= 70) {
  console.log("vc esta apto a votar mas não é obrigatorio")
} else {
  console.log("vc esta apto a votar e é obrigatorio")
}