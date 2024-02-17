let idade1 = parseInt(prompt("digite a idade da primeira pessoa : "));
let idade2 = parseInt(prompt("digite a idade da segunda pessoa : "));
let idade3 = parseInt(prompt("digite a idade da terceira pessoa : "));


if(idade1 >= 18 && idade2 >= 18 && idade3 >= 18) {
  console.log("todas as pessoas são maiores de idade");
} else if(idade1 < 18 && idade2 < 18 && idade3 < 18) {
  console.log("todas as pessoas são menores de idade")
} else {
  console.log("alguma das pessoas e maior de idade")
}