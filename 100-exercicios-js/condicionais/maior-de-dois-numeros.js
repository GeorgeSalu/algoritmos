let numero1 = prompt("digite o primeiro numero: ");
let numero2 = prompt("digite o segundo numero: ");

numero1 = parseFloat(numero1);
numero2 = parseFloat(numero2);

if(numero1 > numero2) {
  console.log("o primieiro numero é maior ", numero1);
} else if(numero2 > numero1) {
  console.log("o segundo numero é maior ", numero2);
} else {
  console.log("os numeros são iguais")
}