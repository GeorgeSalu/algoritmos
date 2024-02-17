/***
 * 
 * 31. faça um programa que leia as notas de duas provas
 * e informe se o aluno foi aprovado (nota maior ou igual a 6)
 * ou reprovado (nota menor que 6) em cada uma das provas
 * 
 */

let nota1 = parseFloat(prompt("digite a nota da primeira prova:"));
let nota2 = parseFloat(prompt("digite a nota da segunda prova:"));

if(nota1 >= 6) {
  console.log("o aluno foi aprovado na primeira prova");
} else {
  console.log("o aluno foi reprovado na primeira prova")
}

if(nota2 >= 6) {
  console.log("o aluno foi reprovado na segunda prova");
} else {
  console.log("o aluno foi reprovado na segunda prova")
}