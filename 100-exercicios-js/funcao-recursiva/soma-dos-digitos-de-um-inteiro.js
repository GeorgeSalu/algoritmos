function somaDigitos(numero) {

  if(numero < 10) {
    return numero
  }

  const resto = numero % 10;
  const quociente = Math.floor(numero / 10);
  return resto + somaDigitos(quociente);
}

const numero = 12345;
const resultado = somaDigitos(numero);
console.log(`a soma dos digitos de ${numero} é ${resultado}`)