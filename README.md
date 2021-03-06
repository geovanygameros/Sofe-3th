# Git
Git es un sistema de control de versiones distribuidas de código abierto y libre diseñado para manejar desde proyectos pequeños hasta muy grandes con velocidad y eficiencia.

Puedes encontrar la documentacion en la siguiente liga
 - [https://git-scm.com/docs](https://git-scm.com/docs)

Puedes descargarlo aqui
 - [https://git-scm.com/downloads](https://git-scm.com/downloads)

Los comandos a utilizar para esta face, serian los siguientes

 - `git clone URL`: Clona un repositorio completo a tu maquina para poder trabajar.

 - `git add all`: Cuando tengas cambios que subir a tu repositorio, necesitas decirle cuales, para esto, puedes agregar todos los que modificaste.
    
 - `git commit -m "MESSAGE - Equipo N"`: Despues de agregarlos, necesitas agregar un comentario para los cambios que hayas hecho, aqui es tu desicion que poner.
Solamente te pedimos que le agregues `- Equipo ` y el numero de equipo en el que estas, por ejemplo `Este es un comentario - Equipo 5`

 - `git push`: Despues de cometer la accion anterior, necesitas hacer un push para que se queden guardados en tu repositorio en GitHub.



# TDD
Test Driven Development es un proceso de desarrollo de software que se basa en la repetición de un ciclo de desarrollo muy corto.

En primer lugar, el desarrollador escribe un caso de prueba (que inicialmente falla) que define una mejora deseada o una nueva función, luego produce la cantidad mínima de código para pasar esa prueba y finalmente refactoriza el nuevo código a estándares aceptables.

Generalmente se sigue los siguientes pasos:

 - Añadir una prueba
 - Ejecutar todas las pruebas y ver si la nueva falla
 - Escribir un código
 - Ejecutar pruebas
 - Refactorizar codigo
 - Repetir



# Problema 1
##### Almost Increasing Sequence

Dada una secuencia de enteros como un array, determinar si se puede obtener una secuencia estrictamente en incremento, removiendo no mas de un elemento del array.
###### Ejemplos
 - Para sequence = [1, 3, 2, 1], la salida deberia de ser:
almostIncreasingSequence(sequence) = false;

    No hay ningun elemento en el array que pueda ser removido para asi obtener una secuencia estrictamente en incremento
    
 - Para sequence = [1, 3, 2], la salida deberia de ser:
almostIncreasingSequence(sequence) = true;
    
    Es posible remover el numero 3 y asi obtener la secuencia [1, 2], la cual va en estricto incremento.
De manera alterna, tambien es posible remover el numero 2, obteniendo la secuencia [1, 3], la cual tambien va en incremento.



# Problema 2
##### Reverse parenthesis
Tienes una cadena que consiste de cualquier combinacion de palabras u oraciones, espacios en blancos y hasta caracteres especiales.
Es obligatorio que te topes con palabras dentro de parentesis.

Tu tarea es voltear la cadena al revez, contenida en cada par de parentesis, empezando por los parentesis mas internos que te encuentres.
El resultado no debera de contener ningun parentesis.

###### Ejemplo:
 - String s = "a(bc)de";
    Segun lo dicho anteriormente, debes de voltear la cadena que esta entre parentesis.
    En este caso las letras b y c.
    Dicho esto, la salida seria:
 - reverseParenthesis = "acbde".

    Otro ejemplo
 - String s = "a(bc(de)fg(hi)jk)"

    Dicho la explicacion, necesitas empezar por los parentesis mas internos.
    Los cuales son (de) & (hi).
    Al ponerlos al revez, tu primera cadena seria la siguiente
 
 - reverseParenthesis = "a(bcedfgihjk)"
 
    Notese que todavia te quedan parentesis que evaluar.
    Tendrias que poner al revez la cadena que esta entre esos parentesis de nuevo y tu salida final seria la siguiente
    
 - reverseParenthesis = "akjhigfdecb";
 

 
# Problema 3
##### Max Path Count
Se tiene un arbol binario como este:

<img src="https://raw.githubusercontent.com/NSnflores/Sofe-3th/master/tree.png" width="300" height="250" />

Podemos notar que si seguimos cualquier camino desde el nodo padre, hasta cualquier hoja, sumando los valores de los nodos que recorremos, la mayor suma que podemos obtener es **4**.
Esta suma de **4** la podemos obtener con **3** caminos diferentes, esta cantidad de veces que se repite la mayor suma desde el nodo padre hasta cualquier hoja, es lo que llamamos **Max Path Count**.

La funcion que se te pide toma un objeto de tipo **TreeNode**, el cual tiene la siguiente estructura:
```
TreeNode {
    Left: TreeNode (puede ser null)
    Right: TreeNode (puede ser null)
    Value: int
}
```
Este nodo recibido, representa el nodo padre del arbol a determinar su **Max Path Count**.


# Problema Extra
##### Traveler
Se tiene un grafo no dirigido como este:

<img src="https://raw.githubusercontent.com/NSnflores/Sofe-3th/master/graph.png" width="300" height="250" />

El cual, tiene esta [matriz de adyacencia](https://es.wikipedia.org/wiki/Matriz_de_adyacencia):
```
{{0, 2, 2},
 {2, 0, 4},
 {2, 4, 0}}
```
Si queremos pasar por todos los nodos exactamente **una** vez y volver al origen, tenemos que recorrer una distancia de **6**, en este grafo solo existe una forma de realizarlo.

En este problema la funcion a realizar toma una matriz de adyacencia de grafos con muchisimos caminos, hay que retornar la distancia **minima** a recorrer, pasando exactamente una vez por cada nodo y volver al origen.
En las pruebas de este problema, se incluye un grafo con 12 nodos, esto quiere decir **479,001,600** rutas diferentes, asi que recorrer **todos** los caminos no es muy buena idea.


