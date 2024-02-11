let a = parseFloat(prompt("digite o valor de a:"));
let b = parseFloat(prompt("digite o valor de b:"));
let c = parseFloat(prompt("digite o valor de c:"));

let discriminante = Math.pow(b, 2) - 4 * a * c;

// verifica o valor do discriminante
if(discriminante > 0) {

  // calcula as raizes
  let raiz1 = (-b + Math.sqrt(discriminante)) / (2 * a);
  let raiz2 = (-b - Math.sqrt(discriminante)) / (2 * a);

  console.log("as raizes reais são :", raiz1, " e ", raiz2);
} else if(discriminante === 0) {

  // calcula raiz unica
  let raiz = -b / (2 * a);

  console.log("a raiz real é:",raiz);
} else {
  console.log("a equação não possui raiz real")
}