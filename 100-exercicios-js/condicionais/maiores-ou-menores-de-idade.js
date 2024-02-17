/**
 * 
 * 36. faça um programa que leia a idade de tres pessoas e 
 * informe se alguma delas é maior de idade (idade maior
 * ou igual a 18), se todas são maiores de idade, ou se todas
 * são menores de idade (idade inferior a 18 anos)
 * 
 */

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