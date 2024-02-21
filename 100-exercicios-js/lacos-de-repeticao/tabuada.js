/***
 * 
 * 
 * 50. crie um programa que solicite ao usuario 
 * um numero e exiba a tabuada desse numero
 * 
 * 
 */
const numero = prompt("digite um numero : ");

console.log(`Tabuada do ${numero}`);

for(let i = 1; i <= 10; i++) {
  const resultado = numero * i;
  console.log(`${numero} X ${i} = ${resultado}`)
}