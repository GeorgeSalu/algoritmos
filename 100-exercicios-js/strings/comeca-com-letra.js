/*
  19. escreva um programa que receba um nome e
  verifique se o mesmo começa com a letra "A"
*/

let nome = prompt("digite um nome:");

if(nome.charAt(0).toUpperCase() === "A") {
  console.log("o nome comeca com a letra A")
} else {
  console.log("o nome não comeca com a letra A")
}