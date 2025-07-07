# Proyecto POO – Ampliación de Contenidos Audiovisuales

## Descripción
Este proyecto en Java ejemplifica conceptos avanzados de Programación Orientada a Objetos (POO) mediante una serie de clases que modelan distintos tipos de contenido audiovisual. Incluye herencia, asociación, agregación y composición, así como la incorporación de subclases especializadas para ilustrar extensión de la jerarquía base.

## Objetivos
- **Refactorizar** un proyecto de ejemplo para reforzar la estructura de paquetes y la separación de responsabilidades.  
- **Implementar** nuevas clases de dominio (`Actor`, `Temporada`, `Investigador`) y relacionarlas correctamente con las clases base (`Pelicula`, `SerieDeTV`, `Documental`).  
- **Extender** la jerarquía con subclases adicionales (`Trailer`, `ClipMusical`), cada una con atributos y comportamientos propios.  
- **Demostrar** el funcionamiento completo mediante una clase de prueba que instancia y despliega detalles de cada objeto.


## Requisitos
- Java Development Kit (JDK) 8 o superior  
- IDE compatible con Java (Eclipse, IntelliJ IDEA, NetBeans, etc.)  
- Git (opcional, para control de versiones)

## Instrucciones de uso
1. Clona el repositorio en tu entorno local.  
2. Importa el proyecto en tu IDE, asegurándote de que las carpetas `src/uni1a` y `src/poo` estén marcadas como fuentes.  
3. Compila el proyecto para verificar que no existen errores de sintaxis ni de paquete.  
4. Ejecuta la clase `PruebaAudioVisual` para ver en consola la salida de todos los contenidos audiovisuales y sus atributos.

## Buenas prácticas y mejoras futuras
- Uso de listas tipadas para relaciones uno-a-muchos (por ejemplo, varios actores en una película).  
- Encapsulación mediante getters y setters para cada atributo.  
- Documentación con comentarios estilo Javadoc en clases, métodos y atributos.  
- Posible extensión: integración de pruebas unitarias, carga de datos desde archivos o base de datos, y creación de nuevas subclases especializadas.