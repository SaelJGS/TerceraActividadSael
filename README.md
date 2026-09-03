# 🧩 Actividad: Implementación de un Diagrama UML en Java

## 📌 Descripción

En esta actividad se realizó la implementación en **Java** de las clases representadas en el diagrama UML proporcionado en clase.

El objetivo principal fue reforzar conceptos fundamentales de **Programación Orientada a Objetos (POO)**, especialmente el **encapsulamiento**, la declaración de atributos y métodos, el uso de modificadores de acceso y la creación de objetos a partir de las clases implementadas.

Además, se desarrolló una clase `Main` para probar el funcionamiento de las clases y comprobar que los métodos implementados trabajan correctamente.

---


## 💻 Implementación

Las clases indicadas en el diagrama UML fueron implementadas utilizando Java, respetando los nombres, tipos de datos, atributos y métodos establecidos.

Los atributos fueron declarados como `private` cuando el diagrama indicaba el símbolo `-`, mientras que los métodos fueron declarados como `public` cuando estaban representados mediante el símbolo `+`.

### Estructura del proyecto

```text
📦 TerceraActividad_TV
 ┣ 📂 src
 ┃ ┣ 📄 Main.java
 ┃ ┗ 📄 TV.java
 ┗ 📄 README.md
```

> Los nombres de las clases deben sustituirse por los nombres exactos que aparecen en el diagrama UML.

---

## ▶️ Pruebas en `Main`

Para comprobar que la implementación funcionara correctamente, se creó una clase `Main`.

En ella se realizaron las siguientes pruebas:

1. Creación de los objetos correspondientes.
2. Asignación de valores mediante los métodos disponibles.
3. Invocación de los métodos implementados.
4. Impresión de resultados en consola.
5. Comprobación de que los valores obtenidos fueran los esperados.

Ejemplo de estructura:

```java
public class Main {
    public static void main(String[] args) {

        // Crear una TV con:
        // Apagada  Canal: 350  Volumen: 60 
        TV tv1 = new TV(350, 60, false);

        System.out.println("===== PRUEBA DE LA TV =====");

        System.out.println("\nEncendiendo la TV...");
        tv1.turnOn();

        System.out.println("Subiendo un canal...");
        tv1.upChannel();

        System.out.println("Bajando un canal...");
        tv1.downChannel();

        System.out.println("Cambiando al canal 344...");
        tv1.setChannel(344);

        System.out.println("Bajando el volumen...");
        tv1.volumeDown();

        System.out.println("Subiendo el volumen...");
        tv1.volumeUp();

        System.out.println("Intentando encender la TV nuevamente...");
        tv1.turnOn();

        System.out.println("Apagando la TV...");
        tv1.turnOff();

        System.out.println("\n===== FIN DE LA PRUEBA =====");
    }
}
```

La finalidad de `Main` no fue solamente ejecutar el programa, sino comprobar que las clases implementadas a partir del diagrama realmente funcionan como se esperaba.

---

## 🖥️ Evidencia de funcionamiento

A continuación se muestran las capturas de pantalla correspondientes a la ejecución del programa.

### Ejecución del programa

> 📷 **Agregar aquí una captura de la consola mostrando el resultado de la ejecución.**

<img width="930" height="608" alt="image" src="https://github.com/user-attachments/assets/ad40a9ff-8546-479d-916f-b50baa77861f" />


---

## ✅ Conclusión

Esta actividad permitió reforzar conocimientos fundamentales de **Programación Orientada a Objetos** mediante la implementación práctica de un diagrama UML en Java.

La realización de las clases y las pruebas en `Main` ayudó a comprender que conceptos como el encapsulamiento, los modificadores de acceso y la interacción entre objetos son fundamentales para construir programas organizados y fáciles de mantener.

Además, la actividad sirvió como práctica para poder interpretar diagramas UML y trasladarlos a código Java, habilidad que será importante para futuras actividades y evaluaciones de la materia.

---

## 👤 Autor

**Nombre:** Sael De Jesus Garduza Santos
**Materia:** POO
**Actividad:** TERCERA ACTIVIDAD: TV
**Lenguaje:** Java
**Repositorio:** https://github.com/SaelJGS/TerceraActividadSael

---

## 📚 Tecnologías utilizadas

* ☕ Java
* 🧩 UML
* 💻 IDE utilizado: IntelliJ IDEA 
* 🌐 GitHub

## Uso de IA

Solo para poner el **README.md** bonito
