/*
  18. crie um programa que receba uma frase e substitua
  todas as letras "a" por "e"
*/

let frase = prompt("digite uma frase");

let caracteres = frase.split("");

for(let i = 0;i < caracteres.length; i++) {
  if(caracteres[i].toLowerCase() === "a") {
    caracteres[i] = "e"
  }
}

let novaFrase = caracteres.join("");

console.log("nova frase: ", novaFrase)