/***
 * 
 * 40. faça um programa que leia tres notas de um aluno
 * e informe se ele foi aprovado (nota final maior ou 
 * igual a 7), reprovado (nota final menor que 4) ou 
 * ficou de recuperacao (nota final entre 4 e 7)
 * 
 */

let nota1 = parseFloat(prompt("digite a primeira nota : "));
let nota2 = parseFloat(prompt("digite a segunda nota : "));
let nota3 = parseFloat(prompt("digite a terceira nota : "));

let media = (nota1 + nota2 + nota3) / 3;

if(media  >= 7) {
  console.log("aluno provado");
} else if(media < 4) {
  console.log(" aluno reprovado");
} else {
  console.log("aluno em recuperacao")
}