/***
 * 
 * 
 * 53. faça um programa que calcule e exiba a soma dos numeros
 * pares de 1 a 100 utilizando um laco de repetição
 * 
 * 
 */

let soma = 0;

for(let i = 2; i <= 100; i += 2) {
  soma += i;
}

console.log("a soma dos numeros pares de 1 a 100 é: "+soma)