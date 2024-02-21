/***
 * 
 * 52. escreva um programa que solicite ao usuario
 * um numero N e exiba a soma de todos os numeros 
 * de 1 a N
 * 
 * 
 */
const N = parseInt(prompt("digite um numero : "));

if(isNaN(N) || N < 1) {
  console.log("numero invalido! digite um numero inteiro positivo");
} else {
  let soma = 0;
  for(let i = 1; i <= N;i++) {
    soma += i;
  }
  console.log(`a soma dos numeros de 1 a ${N} é ${soma}`)
}