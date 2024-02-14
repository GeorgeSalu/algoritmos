let palavra = prompt("digite uma palavra");

palavra = palavra.toLowerCase();

let palavraInvertida = palavra.split("").reverse().join("");

if(palavra === palavraInvertida) {
  console.log("a palavra "+palavra+" é um palindrome");
} else {
  console.log("a palavra "+palavra+" não é um palindorme")
}