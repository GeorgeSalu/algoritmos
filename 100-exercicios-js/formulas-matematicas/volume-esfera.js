let raio = parseFloat(prompt("digite o valor do raio da esfera:"));

let volume = (4 / 3) * Math.PI * Math.pow(raio, 3);

console.log("o volume da esfera é:", volume.toFixed(2));