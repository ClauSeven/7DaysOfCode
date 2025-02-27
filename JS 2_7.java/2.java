// ¿Cuál es tu nombre?
let nombre = prompt("¿Cuál es tu nombre");

// ¿Cuántos años tienes?
let edad = prompt("¿Cuántos años tienes");

// ¿Qué lenguaje de programación estás estudiando?
let lenguaje = prompt("¿Qué lenguaje de programación estás estudiando");

//mostar el mensaje final
console.log('Hola ${nombre}, tienes ${edad} tienes ${años}, y ya estás aprendiendo ${lenguaje}!');

// Mostrar el mensaje final en una alerta 
alert('Hola ${nombre}, tienes ${edad}, ${años}, aprendiendo ${lenguaje}!');

const nombre = prompt("¿Cuál es tu nombre?");
const edad = prompt("¿Cuántos años tienes?");
const lenguaje = prompt("¿Qué lenguaje de programación estás estudiando?");
const mensaje = "Hola ${nombre}, tienes ${edad} años y ya estás aprendiendo ${lenguaje}!";

alert(mensaje);

const gusta = prompt("¿Te gusta estudiar ${Lenguaje}? Responde con el número 1 - SÍ o 2 -NO")
if (gusta == 1){
    alert ("¡Muy bien! Sigue estudiando y tendrás mucho éxito.");
}
if (gusta == 2) {
    alert("Oh, qué pena... ¿Has intentado aprender atros lenguajes?");
    
}