# Calculadora en Java (consola)

Calculadora interactiva por consola desarrollada en Java. Permite realizar las cuatro operaciones básicas con validación de entradas y manejo de errores.

## Características

- Menú interactivo con suma, resta, multiplicación y división.
- Validación de entradas: si el usuario ingresa texto en lugar de un número, el programa vuelve a pedir el dato en lugar de cerrarse.
- Acepta decimales con punto o con coma (`2.5` y `2,5`).
- Control de división por cero.
- Código organizado en métodos de una sola responsabilidad.
- Uso de sintaxis moderna de Java: `var`, bloques de texto y `switch` con flechas.

## Requisitos

- Java 21 o superior (JDK)

## Cómo ejecutarla

```bash
git clone https://github.com/franco-perdomo/calculadora-java-consola.git
cd calculadora-java-consola
javac Calculadora.java
java Calculadora
```

## Ejemplo de uso

```
*** Calculadora en Java ***
Operaciones que puedes realizar:
1. Suma
2. Resta
3. Multiplicacion
4. Division
5. Salir
Escoge una opcion: 4
Ingresa el valor 1: 10
Ingresa el valor 2: 0
Error: Division por cero.
```

## Estructura del código

| Método | Responsabilidad |
|---|---|
| `main` | Controla el bucle principal del programa |
| `mostrarMenu` | Imprime el menú de opciones |
| `leerEntero` / `leerDecimal` | Leen y validan la entrada del usuario |
| `ejecutarOperacion` | Selecciona y realiza la operación |
| `imprimirResultado` | Da formato a la salida |


## Autor

**Franco Perdomo**: [LinkedIn](https://linkedin.com/in/franco-perdomo)