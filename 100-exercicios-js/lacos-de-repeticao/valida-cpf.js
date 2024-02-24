let cpfNumeros = prompt("digite um cpf para verificacao de integridade : ");

console.log(cpfNumeros)
// verifica se o cpf tem 11 digitos
if(cpfNumeros.length !== 11) {
  console.log("cpf invalido, o cpf deve ter 11 digitos")
} else {
  // verifica se todos os digitos sao iguais
  if(/^(\d)\1+$/.test(cpfNumeros)) {
    console.log("cpf invalido todos os digitos são iguais")
  } else {
    // calcula digito verificador
    let soma = 0;
    for(let i = 0; i < 9;i++) {
      soma += parseInt(cpfNumeros.charAt(i)) * (10 - i);
    }
    let digitoVerificador1 = 11 - (soma % 11);

    // verifica o primiero digito verificador
    if(digitoVerificador1 > 9) {
      digitoVerificador1 = 0;
    }
    if(parseInt(cpfNumeros.charAt(9)) !== digitoVerificador1) {
      console.log("cpf invalido primeiro digito verificador incorreto");
    } else {
      // calcula segundo digito verificador
      soma = 0;
      for(let i = 0; i < 10;i++) {
        soma += parseInt(cpfNumeros.charAt(i)) * (11 -i);
      }
      let digitoVerificador2 = 11 - (soma % 11);

      // verifica o segundo digito verificador
      if(digitoVerificador2 > 9) {
        digitoVerificador2 = 0;
      }

      if(parseInt(cpfNumeros.charAt(10)) !== digitoVerificador2) {
        console.log("cpf invalido")
      } else {
        console.log("cpf valido")
      }
    }
  }
}