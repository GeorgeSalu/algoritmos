/*
  20. faça um programa que leia uma palavra e verifique
  se a mesma é um palindromo (se pode ser lida da mesma 
  forma de tras para frente) (usando laco de repeticao)
*/

let palavra = prompt("digite uma palavra");

palavra = palavra.toLowerCase();

let palavraInvertida = "";

for(let i = palavra.length - 1;i >= 0; i--) {
  palavraInvertida += palavra[i]
}

if(palavra === palavraInvertida) {
  console.log("a palavra é um palindromo")
} else {
  console.log("a palavra nã é um palindromo")
}