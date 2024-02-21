/***
 * 
 * 51. escreva um programa que imprima na tela 
 * a tabuada de todos os numeros de 1 a a10
 * 
 */

for(let i = 1;i <= 10; i++) {
  console.log(`tabuada do ${i}`);
  for(let j = 1;j <= 10;j++) {
    const resultado = i * j;
    console.log(`${i} X ${j} = ${resultado}`);
  }
  console.log("")
}