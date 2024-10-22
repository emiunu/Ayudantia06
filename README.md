# Cadena de Tiendas Nacional

Una cadena de tiendas de alcance nacional está en busca de un sistema que gestione sus
operaciones en distintos niveles. El sistema debe manejar la información de las tiendas
distribuidas en varias ciudades y regiones del país, así como gestionar a los empleados,
productos, clientes y las compras realizadas. A continuación, se presenta una descripción
detallada de los componentes que deben ser considerados. A partir de esta información, se
solicita el diseño de un diagrama de clases UML que modele el sistema completo:
1. **Territorio**: La cadena opera en un solo país, dividido en varias regiones, cada una
   de ellas compuesta por múltiples ciudades. Cada ciudad tiene un nombre y un
   código postal que la identifica.
2. **Tiendas**: En cada ciudad puede haber una o más tiendas. Cada tienda posee un
   nombre, una dirección y un horario de atención, y está encargada de vender una
   amplia variedad de productos. Además, las tiendas cuentan con empleados que se
   encargan de atender a los clientes y gestionar las operaciones diarias.
3. **Empleados**: Cada empleado tiene un nombre, un número de identificación único y
   un cargo dentro de la tienda en la que trabaja. Un empleado solo puede estar
   asignado a una tienda a la vez, aunque cada tienda puede contar con varios
   empleados.
4. **Clientes**: Los clientes que realizan compras en las tiendas son identificados por su
   nombre y número de cliente. Un cliente puede efectuar múltiples compras en
   distintas tiendas de la cadena, y el sistema debe registrar cada una de las compras
   que realiza a lo largo del tiempo.
5. **Compras**: Cada vez que un cliente efectúa una compra, se registra un número de
   compra, la fecha, el total y la forma de pago utilizada. Las compras están vinculadas
   a una tienda específica y están compuestas por varios productos, cuya cantidad y
   precio deben ser registrados individualmente.
6. **Productos e inventario**: Los productos disponibles en las tiendas pueden variar
   según la ciudad, y cada uno tiene un código único, una descripción, un precio y
   pertenece a una categoría (comestible, electrodoméstico, etc). Además, es
   necesario llevar un registro del inventario de cada tienda, de modo que se conozca
   la cantidad disponible de cada producto en cada local.

 ###  Funcionalidades
   El sistema deberá implementar las siguientes funcionalidades.
1. **Territorio (Regiones y Ciudades)**:

   ○ *Agregar región*: Permitir la creación de una nueva región con su respectiva
   lista de ciudades.

   ○ *Modificar/Eliminar región*: Habilitar la actualización de información o la
   eliminación de una región existente.

   ○ *Agregar ciudad*: Registrar nuevas ciudades dentro de una región,
   especificando el nombre y código postal.

   ○ *Modificar/Eliminar ciudad*: Cambiar datos de una ciudad o eliminarla si es
   necesario.

   ○ *Consultar regiones/ciudades*: Obtener la lista de regiones y sus respectivas
   ciudades.
2. **Tiendas**:

   ○ *Agregar tienda*: Registrar una nueva tienda, con su nombre, dirección y
   horario de atención, dentro de una ciudad.

   ○ *Modificar/Eliminar tienda*: Actualizar los datos de una tienda o eliminarla.

   ○ *Asignar empleados a tienda*: Asociar empleados a una tienda específica.

   ○ *Consultar tiendas*: Obtener una lista de tiendas, filtradas por ciudad o
   región.

3. **Empleados**:

   ○ *Agregar empleado*: Permitir el registro de empleados con nombre,
   identificación única y cargo.

   ○ *Modificar/Eliminar empleado*: Cambiar la información o eliminar un
   empleado del sistema.

   ○ *Consultar empleados*: Obtener la lista de empleados de una tienda o
   realizar búsquedas por ID.

4. **Clientes**:

   ○ *Registrar cliente*: Permitir la creación de un perfil de cliente con nombre y
   número de cliente único.

   ○ *Modificar/Eliminar cliente*: Actualizar o eliminar un cliente del sistema.

   ○ *Consultar clientes*: Visualizar el historial de compras de un cliente
   específico o buscar clientes por nombre o ID.

5. **Compras**:

   ○ *Registrar compra*: Almacenar la información de una compra, incluyendo
   número de compra, fecha, total y forma de pago.

   ○ *Agregar productos a la compra*: Permitir asociar varios productos a una
   compra, registrando la cantidad y precio de cada uno.

   ○ *Actualizar inventario tras la compra*: Descontar automáticamente del
   inventario de la tienda la cantidad de productos adquiridos.

   ○ *Consultar compras*: Mostrar el historial de compras de un cliente, una
   tienda o una región.

6. **Productos e Inventario**:

   ○ *Agregar producto*: Registrar un nuevo producto en el inventario, con su
   código, descripción, precio y categoría.

   ○ *Modificar/Eliminar producto*: Cambiar la información o eliminar un
   producto.

   ○ *Actualizar inventario*: Registrar las entradas o salidas de productos en el
   inventario de cada tienda.

   ○ *Consultar productos*: Listar productos disponibles en una tienda o realizar
   búsquedas por categoría, código o descripción.

   ○ *Consultar inventario*: Obtener la cantidad disponible de un producto en
   cada tienda.

###   Consideraciones:
   El código deberá contar con buenas prácticas de programación, asegurando un manejo
   correcto de errores y excepciones. Además, se deben implementar las pruebas unitarias
   correspondientes para cada funcionalidad descrita, validando su correcto funcionamiento.