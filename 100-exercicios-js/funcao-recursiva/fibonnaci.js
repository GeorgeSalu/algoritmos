/**
 * 
 * 
 * 
 * 
 * 92. implemente uma função recursiva para calcular a 
 * sequencia de fibonacci ate um determinado numero
 * 
 * 
 * 
 * 
 * 
 */
function fibonacci(n) {
  if(n === 0 || n === 1) {
    return n;
  }

  return fibonacci(n - 1) + fibonacci(n - 2);
}

const numero = 6;
const resultado = fibonacci(numero);
console.log(`o valor de fibonacci para ${numero} é ${resultado}`)