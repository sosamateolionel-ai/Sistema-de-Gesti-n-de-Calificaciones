# Sistema de Gestión de Calificaciones

## Descripción

Este proyecto implementa una clase `LibretaCalificaciones` en Java que permite registrar y administrar las notas de un estudiante y calcular su promedio. Se utiliza el encapsulamiento para proteger la lista de calificaciones y garantizar que las notas se incorporen únicamente mediante un método que valida los valores ingresados.

## Funcionamiento

El programa crea una libreta de calificaciones para una estudiante y registra notas válidas e inválidas para comprobar el funcionamiento del sistema.

* **Creación de la libreta:** almacena el nombre del estudiante e inicializa una lista vacía de notas.
* **Registro de calificaciones:** permite agregar notas comprendidas entre 0.0 y 10.0, inclusive.
* **Validación de notas:** rechaza las calificaciones inferiores a 0.0 o superiores a 10.0.
* **Cálculo del promedio:** suma todas las notas registradas y divide el resultado por la cantidad de calificaciones.
* **Control de lista vacía:** si todavía no existen notas, muestra un aviso y devuelve `0`.
* **Protección de los datos:** la lista es privada y no se proporciona un método para modificarla directamente desde otras clases.

## Clases principales

### `LibretaCalificaciones`

Representa la libreta de un estudiante y administra sus calificaciones.

**Atributos:**

* `nombreEstudiante`: almacena el nombre del estudiante.
* `notas`: lista privada que contiene las calificaciones registradas.

**Métodos principales:**

* `getNombreEstudiante()`: devuelve el nombre del estudiante.
* `agregarNota(double nota)`: valida la nota y la incorpora a la lista si es correcta.
* `obtenerPromedio()`: calcula y devuelve el promedio de todas las notas registradas.

### `Main`

Contiene el método `main`, crea una libreta, registra distintas calificaciones y muestra el promedio final del estudiante.

## Conceptos de programación utilizados

* **Programación orientada a objetos (POO):** representación de una libreta de calificaciones mediante una clase.
* **Encapsulamiento:** protección de los atributos mediante el modificador `private`.
* **Colecciones:** utilización de `ArrayList` y `List` para almacenar una cantidad variable de notas.
* **Validación de datos:** comprobación de que cada nota esté dentro del rango permitido.
* **Ciclo `for-each`:** recorrido de la lista para sumar las calificaciones.
* **Métodos con retorno:** devolución de resultados mediante valores `double` y `boolean`.
* **Control de casos especiales:** comprobación de que la lista no esté vacía antes de calcular el promedio.

## Tecnologías utilizadas

* Java
* IntelliJ IDEA
* Git y GitHub

## Ejecución

<img width="573" height="361" alt="image" src="https://github.com/user-attachments/assets/1df92f20-669c-4682-832b-2182d0303879" />

## Resultado esperado

La libreta registra correctamente las notas `8.0`, `6.5` y `9.0`. Las notas `11.0` y `-2.0` son rechazadas porque están fuera del rango permitido.

El promedio final de Sofía Ramírez es:

**Promedio: 7.83**

## Objetivo del ejercicio

Aplicar los principios de encapsulamiento, validación de datos y uso de colecciones en Java mediante una clase que permita administrar calificaciones y calcular promedios sin exponer directamente la lista interna de notas.
