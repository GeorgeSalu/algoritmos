const numero1 = parseInt(prompt("digite o primeiro numero : "));
const numero2 = parseInt(prompt("digite o segundo numero : "));

let menorNumero;
if(numero1 < numero2) {
  menorNumero = numero1;
} else {
  menorNumero = numero2;
}

let mdc = 1;

for(let i = 1; i <= menorNumero;i++) {
  if(numero1 % i === 0 && numero2 % i === 0) {
    mdc = i;
  }
}

console.log("o mdc de "+numero1+" e "+numero2+" é "+mdc)