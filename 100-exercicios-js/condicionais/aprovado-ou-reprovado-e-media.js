/***
 * 
 * 32. faça um programa que leia as notas de duas provas,
 * calcule a media aritmetica simples, e informe se o aluno
 * foi aprovado (media maior ou igual a 6) ou reprovado 
 * (media menor que 6)
 * 
 */

let nota1 = parseFloat(prompt("digite a nota da primeira prova : "));
let nota2 = parseFloat(prompt("digite a nota da segunda prova : "));

let media = (nota1 + nota2)/2;

if(media >= 6) {
  console.log("o aluno foi aprovado com media", media.toFixed(2));
} else {
  console.log("o aluno foi reprovado com media", media.toFixed(2));
}