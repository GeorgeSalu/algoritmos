let nota1 = parseFloat(prompt("digite a nota da primeira prova : "));
let nota2 = parseFloat(prompt("digite a nota da segunda prova : "));

let media = (nota1 + nota2)/2;

if(media >= 6) {
  console.log("o aluno foi aprovado com media", media.toFixed(2));
} else {
  console.log("o aluno foi reprovado com media", media.toFixed(2));
}