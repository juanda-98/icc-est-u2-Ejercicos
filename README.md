# Práctica: Estructuras de Datos - Stack y Queue
 
## Integrantes
 
- Juan Cedillo
- Andy Uyaguari
 
 
## Descripción general del proyecto
 
Este proyecto consiste en el desarrollo de una aplicación en Java donde se aplican estructuras de datos como **Stack (Pila)** y **Queue (Cola)**.
 
Se desarrollaron tres ejercicios:
 
- Validación de signos usando Stack.
- Ordenamiento de un Stack usando únicamente Stacks adicionales.
- Validación de palíndromos utilizando Queue.
 
 
## Ejercicio 01: Validación de signos usando Stack
 
### Descripción
 
Este ejercicio consiste en verificar si una cadena de texto contiene signos correctamente balanceados.
 
Se utilizan estructuras tipo **Stack** para almacenar los símbolos de apertura como:
 
- (
- [
- {
 
Cuando se encuentra un símbolo de cierre, se compara con el último símbolo almacenado en la pila.
 
### Código principal
![alt text](/src/assets/image.png)

## Ejercicio 02: Ordenamiento de un Stack usando Stacks adicionales
 
### Descripción
 
Este ejercicio consiste en ordenar los elementos almacenados dentro de una estructura **Stack (Pila)** sin utilizar arreglos ni otras estructuras de datos.
 
Para resolverlo se utiliza una segunda pila auxiliar que permite comparar los valores.
 
El funcionamiento es el siguiente:
 
1. Se extrae un elemento de la pila principal utilizando `pop()`.
2. Ese elemento se guarda temporalmente en una variable.
3. Se compara con los elementos de la pila auxiliar.
4. Si la pila auxiliar tiene valores mayores, estos regresan a la pila original.
5. Finalmente el elemento se coloca en la pila auxiliar en la posición correcta.
6. Al terminar, los elementos de la pila auxiliar vuelven a la pila original ya ordenados.
 
De esta manera se logra ordenar la pila utilizando únicamente estructuras tipo Stack.
 
 
### Código principal
![alt text](/src/assets/image-1.png)
## Ejercicio 03: Validación de Palíndromo usando Queue
 
### Descripción
 
En este ejercicio se verifica si una palabra o frase es un **palíndromo** utilizando la estructura de datos **Queue (Cola)**.
 
Un palíndromo es una palabra o frase que se puede leer de la misma manera de izquierda a derecha y de derecha a izquierda.
 
Ejemplos:
 
- "la ruta no natural" → Es palíndromo.
- "la ruta si natural" → No es
 
 
### Código principal
![alt text](/src/assets/image-2.png)

# Salida de consola
![alt text](/src/assets/image-3.png)