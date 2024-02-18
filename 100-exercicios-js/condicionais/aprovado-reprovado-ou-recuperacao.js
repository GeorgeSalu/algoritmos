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