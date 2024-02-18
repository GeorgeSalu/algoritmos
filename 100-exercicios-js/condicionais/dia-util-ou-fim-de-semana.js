/**
 * 
 * 41. faça um programa que solicite o nome de um dia
 * da semana e exiba se é um dia util (segunda a sexta-feira)
 * ou um dia de fim de semana (sabado   e domingo)
 * 
 */

let dia = prompt("digite o nome de um dia da semana : ").toLowerCase();

if(dia === "sabado" || dia === "domingo") {
  console.log("é um dia de fim de semana");
} else if(dia === "segunda" || dia === "terca" || dia === "quarta" || dia === "quinta" || dia === "sexta"){
  console.log("é um dia util");
} else {
  console.log("dia invalido")
}