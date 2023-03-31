FileSystemItem.java:

- Principio de Resposabilidad unica: Separamos la manejabilidad de archivos y directorios en dos interfaces "File" y "Directory"
- FileAccess puede manejar la apertura, cierre, lectura y escritura de archivos
- Principio de Segregacion de Interfaz: Dividimos la interfaz, en interfaces mas específicas.
- Las clases "*Impl" son implementaciones de las interfaces