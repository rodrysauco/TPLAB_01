# TPLAB_01
A job implementing threads

1. Dependiendo de quien ingrese primero, puede variar la cantidad de consumidores que ingresen. A mayor cantidad de consumidores mas rapido se va a agotar el recurso compartido ya que las posibilidades de que ingrese el productor disminuirian.

2. Los bloques synchronized se utilizan en secciones criticas del codigo para evitar que dos procesos accedan al mismo tiempo a un recurso en comun (Concurrencia). 

3. El recurso compartido (de ahora en mas RC) es un recurso al cual intentan acceder todos los hilos. En este caso el RC es un entero al cual el productor cuando pueda tener acceso a el va a incrementar su valor hasta llegar a donde mas pueda o 100 (que es el tope de stock). A su vez el consumidor va a intentar acceder al RC para disminuir su valor hasta, en lo posible, llegar a 0, siempre y cuando haya stock.

Podemos instanciar un Thread mediante

     ~NEW de Thread.

     ~Implementar la Interfaz Runnable e implementar el metodo run.

     ~Extender la Clase Thread y sobre escribir el metodo run.
