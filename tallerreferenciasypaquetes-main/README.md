# tallerreferenciasypaquetes
PREDICCION ETAPA2
prediccion l1.estaDisponible() → false: l2 apunta al mismo libro que l1, así que prestarlo con l2 también lo cambia en l1.
l3.estaDisponible() → true: l3 es otro libro creado con new y nadie lo prestó.
l1 == l2 → true: las dos variables apuntan al mismo objeto.
l1 == l3 → false: tienen los mismos datos, pero son objetos distintos.

ETAPA 3 MENSAJE DE ERROR : Exception in thread "main" java.lang.NullPointerException: Cannot invoke "biblioteca.modelo.libro.mostrarInformacion()" because "l4" is null

ETAPA 4 ERROR EN LA LINEA: error: titulo has private access in libro

PARTE B <img width="1560" height="900" alt="diagrama_clases_parteB" src="https://github.com/user-attachments/assets/bc762e30-f6fb-40b2-a4e7-f118adda6c7d" />


PREGUNTAS
1. ¿Qué guarda una variable int y qué guarda una variable libro?
Una variable int guarda el número directamente, por ejemplo un 19. Una variable libro no guarda el libro completo, guarda una referencia, que es como la dirección de dónde está el objeto en memoria. Si no apunta a ningún objeto, vale null.

2. ¿Por qué prestar con l2 cambió l1 pero no l3?
Porque al hacer libro l2 = l1; no se crea otro libro, solo se copia la referencia. Entonces l1 y l2 son dos nombres para el mismo objeto, y un cambio hecho con una se ve en la otra. En cambio, l3 lo creé con new, así que es otro libro distinto, aunque tenga el mismo título y autor.

3. ¿Por qué el compilador no detectó la NullPointerException?
Porque la línea l4.mostrarInformacion(); está bien escrita: la clase libro sí tiene ese método. El compilador solo revisa que el código esté bien escrito, no sabe qué valor va a tener l4 cuando el programa corra. El problema aparece al ejecutar, cuando Java intenta usar el punto sobre l4 y se da cuenta de que es null y no hay ningún objeto.

4. ¿Qué diferencia hay entre modificar el objeto que recibe un método y asignarle uno nuevo a su parámetro?
Java pasa los parámetros por valor, pero con objetos lo que se copia es la referencia. Por eso, si el método modifica el objeto que recibió (como cuando prestarLibro llama a prestar()), el cambio se nota afuera, porque el parámetro y la variable original apuntan al mismo objeto. Pero si el método le asigna un objeto nuevo al parámetro, solo cambia la copia de la referencia y la variable original sigue apuntando al objeto de antes.

5. ¿Qué invariantes protege libro y cómo las protege?
Protege dos cosas. La primera es que el título nunca sea null ni esté vacío: setTitulo rechaza esos valores y muestra “Título inválido”, y el constructor usa ese mismo método, así que un libro nunca se crea con un título malo (queda como “Sin título”). La segunda es que la disponibilidad solo cambie de forma controlada: no hay setDisponible, solo se cambia con prestar() y devolver(). Y todo esto funciona porque los atributos son private, así que ninguna otra clase puede saltarse las reglas.
