/***
 * 
 * 
 * 66. escreva um programa que leia uma sequencia 
 * de caracteres e indique se a mesma é um palindromo 
 * ou não (usando uma função)
 * 
 * 
 * 
 */

function verificarPalindromo(texto) {
  texto = texto.replace(/\s/g, '').toLowerCase();

  for(let i = 0; i < texto.length / 2; i++) {
    if(texto[i] !== texto[texto.length -1 - i]) {
      return false;
    }
  }

  return true;
}

const sequencia = prompt("digite uma sequencia de caracteres : ");

if(verificarPalindromo(sequencia)) {
  console.log("a sequencia é um palindromo")
} else {
  console.log("a sequencia não é um palindromo")
}