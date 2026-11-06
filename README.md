# Mundo Animal

Práctica de Programación Orientada a Objetos en Java: herencia, clase abstracta, interfaz y polimorfismo.

## Estructura

- `Animal`: clase abstracta con `nombre`, `edad`, `mostrarInformacion()` y el método abstracto `hacerSonido()`.
- `Perro`, `Gato`, `Vaca` y `Velociraptor` (extra): heredan de `Animal` e implementan `Movible`.
- `Movible`: interfaz con el método `moverse()`.
- `Main`: recorre un arreglo `Animal[]` y llama los métodos de cada animal.

## Salida

```
Nombre: Max | Edad: 3 | Sonido: Guau | Movimiento: Corre
Nombre: Luna | Edad: 2 | Sonido: Miau | Movimiento: Camina
Nombre: Lola | Edad: 5 | Sonido: Muuu | Movimiento: Camina
Nombre: Blue | Edad: 4 | Sonido: Grrraaa | Movimiento: Corre a 60 km/h
```

## Preguntas de reflexión

**1. ¿Qué se reutiliza al heredar de Animal?**

El papá de Perro es Animal. Perro sale de Animal, de ahí saca el nombre, la edad y mostrarInformacion(), por eso no tuve que escribirlos otra vez en Perro.

**2. ¿Qué hace super(nombre, edad)?**

Le pasa el nombre y la edad a Animal, que es el papá. Perro no tiene dónde guardarlos, así que super se los manda al constructor de Animal y Animal los guarda.

**3. ¿Para qué sirve @Override?**

Sirve para sobrescribir. Es como si el papá (Animal) les dijera a sus hijos "hagan un sonido", y cada hijo escribe su propia versión con su sonido único. El @Override va arriba del método para avisar que esa es la versión del hijo.

**4. ¿Por qué el mismo método hacerSonido() produce resultados distintos?**

Porque en el Main, animal.hacerSonido() solo es la orden de "hagan un sonido", y ya dentro de cada clase cada animal tiene el sonido que va a decir. Eso es polimorfismo: la misma orden, pero cada quien hace lo suyo.

**5. ¿Cuál es la diferencia entre una clase abstracta y una interfaz?**

La clase abstracta (Animal) es el papá: ya trae cosas hechas, guarda los datos de los hijos y funciona. Solo puedes tener un papá, como en la vida. La interfaz (Movible) es un contrato que no trae nada hecho, solo dice "debes moverte" y cada hijo decide cómo. Puedes firmar varios contratos, como un hijo que además de lo que heredó de su papá decide ser veterinario, piloto o chef.
