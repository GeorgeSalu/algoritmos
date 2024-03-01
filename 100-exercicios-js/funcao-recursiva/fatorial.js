function calculaFatorial(numero) {
  if(numero === 0) {
    return 1;
  }

  return numero * calculaFatorial(numero - 1)
}

const numero = 5;
const fatorial = calculaFatorial(numero);
console.log(`o fatorial de ${numero} é ${fatorial}`)