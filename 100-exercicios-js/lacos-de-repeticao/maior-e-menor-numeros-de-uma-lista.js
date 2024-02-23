let min = Infinity;
let max = -Infinity;
let number;

do {
  number = parseFloat(prompt("digite um numero : "));

  if(number !== 0) {
    if(number < min) {
      min = number;
    }

    if(number > max) {
      max = number;
    }
  }

} while(number !== 0);


if(min !== Infinity && max !== -Infinity) {
  console.log("o menor numero é :", min);
  console.log("o maior numero é : ", max)
} else {
  console.log("nenhum numero foi digitado")
}