/**
 * 
 * 
 * 93. crie uma função recursiva para
 * verificar se um numero é primo
 * 
 * 
 * 
 */


function isPrimo(n, divisor = 2) {
  if(n <= 1) {
    return false;
  }

  if(divisor === n) {
    return true;
  }

  if(n % divisor === 0) {
    return false;
  }

  return isPrimo(n, divisor + 1);
}

const numero = 17;
const resultado = isPrimo(numero);
console.log(`o numero ${numero} é primo ? ${resultado} `)