# DepositoAutomatizado

Patrones Aplicados:

**Patrón state en Robot:**
Para modificar el comportamiento del Robot, si está "ocupado", al decirle que busque una mercaderia no realiza acción alguna, luego de terminar sus tareas se libera para poder buscar otra mercadería. 

Esto proporciona:
- Mayor cohesión a la clase Robot. 
- Mayor mantenibilidad, debido a que el comportamiento por cada estado es fácilmente localizable.
- Extensibilidad para incoporar nuevos estados (nuevos comportamientos).

**Patrón command dentro de la clase Recorrido:**
- Permite enviar órdenes para que alguien las realice en ese momento o en un momento posterior, sin interesar quién es el receptor de éstas.

En este caso no interesa si es un Clark o un Drone. Los dos interpretarán las ordenes de manera distinta.

Cumple con las condiciones de: 
- Se requiere configurar en momento de ejecución una serie de acciones a realizar en un momento posterior al de configuración, formando una cola.
- Se requiere seguir adelante con el diseño e implementación sabiendo qué se quiere hacer, pero sin saber exactamente cómo hacerlo o quién lo hará.

Esto proporciona:
- Mayor mantenibilidad debido a que el comportamiento de las acciones es facilmente localizable.
- Alta cohesión en los comandos concretos.
- Extensibilidad y facilidad para agregar nuevos comandos/acciones.

**Patrón Template Method en las clase Robot:**
Permite:
- Varias abstracciones tienen los mismos pasos y orden para realizar una acción, pero cada una de ellas los implementa de forma diferente.
- Utilizar de forma polimórfica dos o más objetos que pueden ejecutar el mismo algoritmo, respetando sus pasos, pero con implementaciones distintas para cada uno de éstos.

En este caso Drone y Clark implementan los métodos: desplazarHacia, dejarMercadería, recogerMercaderia, volverAInicio de forma distinta.

**Pendiente:**

- Resolver como repartir la mercadería a entregar entre los robots disponibles en el depósito.
- Agregar uso de Patrón Observer en robot para chequear cuando esta libre y asignarle tarea.

