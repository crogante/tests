Alice y Bob crearon cada uno un problema para HackerRank. Un revisor califica los dos desafíos, otorgando puntos en una escala del 1 al 100 para tres categorías: claridad del problema , originalidad y dificultad .

La calificación del desafío de Alice es el triplete a = (a[0], a[1], a[2]) , y la calificación del desafío de Bob es el triplete b = (b[0], b[1], b [2]) .

La tarea es encontrar sus puntos de comparación comparando a[0] con b[0] , a[1] con b[1] y a[2] con b[2] .

Si a[i] > b[i] , Alice recibe 1 punto.
Si a[i] < b[i] , Bob recibe 1 punto.
Si a[i] = b[i] , entonces ninguna persona recibe un punto.
Los puntos de comparación son los puntos totales que ganó una persona.

Dados a y b , determine sus respectivos puntos de comparación.

Ejemplo

a = [1, 2, 3]
b = [3, 2, 1]
Para los elementos *0*, Bob recibe un punto porque a[0] .
Para los elementos iguales a[1] y b[1] , no se obtienen puntos.
Finalmente, para los elementos 2 , a[2] > b[2] así que Alice recibe un punto.
La matriz de retorno es [1, 1] con la puntuación de Alice primero y la de Bob en segundo lugar.

Función descriptiva

Complete la función compareTriplets en el editor a continuación.

compareTriplets tiene los siguientes parámetros:

int a[3] : Calificación de desafío de Alice
int b[3] : Calificación de desafío de Bob
Devolver

int[2] : la puntuación de Alice está en la primera posición y la puntuación de Bob está en la segunda.
Formato de entrada

La primera línea contiene 3 enteros separados por espacios, a[0] , a[1] y a[2] , los valores respectivos en el triplete a .
La segunda línea contiene 3 enteros separados por espacios, b[0] , b[1] y b[2] , los valores respectivos en el triplete b .

Restricciones

1 ≤ un[i] ≤ 100
1 ≤ segundo[i] ≤ 100
Entrada de muestra 0

5 6 7
3 6 10
Salida de muestra 0

1 1
Explicación 0

En este ejemplo:

Ahora, comparemos cada puntaje individual:

, entonces Alice recibepunto.
, por lo que nadie recibe un punto.
, entonces Bob recibepunto.
La puntuación de comparación de Alice es, y la puntuación de comparación de Bob es. Por lo tanto, devolvemos la matriz.

Entrada de muestra 1

17 28 30
99 16 8
Salida de muestra 1

2 1
Explicación 1

Comparando elelementos,entonces Bob recibe un punto.
Comparando elyelementos,yentonces Alice recibe dos puntos.
La matriz de retorno es.