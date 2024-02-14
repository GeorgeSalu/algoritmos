let palavra = prompt("digite uma palavra");

palavra = palavra.toLowerCase();

let quantidadeVogais = 0;

for(let i = 0; i < palavra.length; i++) {
  let letra = palavra[i];
  
  if(letra === "a" || letra === "e" || letra === "i" || letra === "o" || letra === "u") {
    quantidadeVogais++; 
  }
  
}

console.log("a palavra possui ", quantidadeVogais, " vogais ")