/***
 * 
 * 
 * 66. escreva um programa que leia uma sequencia 
 * de caracteres e indique se a mesma é um palindromo 
 * ou não
 * 
 * 
 * 
 */
const sequencia = prompt("digite uma sequancia de caractres : ");

const texto = sequencia.replace(/\s/g, '').toLocaleLowerCase();

let ehPalindromo = true;
for(let i = 0;i < texto.length / 2; i++) {
  if(texto[i] !== texto[texto.length - 1 -i]) {
    ehPalindromo = false;
    break;
  }
}

if(ehPalindromo) {
  console.log("a sequencia é um palindromo");
} else {
  console.log("a sequencia não é um palindromo");
}