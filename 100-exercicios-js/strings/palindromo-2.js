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