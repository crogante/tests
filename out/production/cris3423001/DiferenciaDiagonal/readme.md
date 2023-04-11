Dada una matriz cuadrada, calcule la diferencia absoluta entre las sumas de sus diagonales.

Por ejemplo, la matriz cuadradase muestra a continuación:

1 2 3
4 5 6
9 8 9  
La diagonal de izquierda a derecha =. La diagonal de derecha a izquierda =. Su diferencia absoluta es.

Función descriptiva

Completar lafunción en el editor a continuación.

diagonalDifference toma el siguiente parámetro:

int arr[n][m] : una matriz de enteros
Devolver

int : la diferencia diagonal absoluta
Formato de entrada

La primera línea contiene un solo entero,, el número de filas y columnas en la matriz cuadrada.
cada uno de los siguienteslíneas describe una fila,, y consta deenteros separados por espacios.

Restricciones

Formato de salida

Devuelve la diferencia absoluta entre las sumas de las dos diagonales de la matriz como un solo número entero.

Entrada de muestra

3
11 2 4
4 5 6
10 8 -12
Salida de muestra

15
Explicación

La diagonal principal es:

11
5
-12
Suma a lo largo de la diagonal principal: 11 + 5 - 12 = 4

La diagonal secundaria es:

     4
5
10
Suma a lo largo de la diagonal secundaria: 4 + 5 + 10 = 19
Diferencia: |4 - 19| = 15

Nota: |x| es el valor absoluto de x