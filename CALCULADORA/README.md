# Calculadora académica

Aplicación de escritorio en Java Swing para operaciones aritméticas y funciones elementales. El proyecto usa Maven y puede abrirse desde NetBeans con **File > Open Project**, seleccionando esta carpeta (`CALCULADORA`). Requiere JDK 17 o posterior.

## Ejecución

- En NetBeans, abre el proyecto Maven y ejecuta `calculadora.Main`.
- Desde una terminal con Maven instalado: `mvn clean package` y luego `mvn exec:java`.
- La clase `com.mycompany.calculadora.CALCULADORA` se conserva como punto de entrada compatible con el archivo inicial.

## Organización

- `calculadora.modelo`: contrato, clases base y operaciones; aquí reside toda la lógica matemática.
- `calculadora.vista`: ventana Swing y métodos para leer entradas y presentar resultados.
- `calculadora.controlador`: valida entradas, selecciona la operación del modelo y actualiza la vista.
- `calculadora.Main`: crea y conecta los componentes en el hilo de eventos Swing.

Las operaciones binarias y unarias heredan de sus respectivas clases abstractas. Ambas implementan `OperacionMatematica`, que el controlador utiliza polimórficamente. La división por cero, los dominios inválidos, las entradas vacías y los valores no numéricos se reportan en la interfaz.

## Flujo de ramas y Pull Requests

Para desarrollar y entregar cambios en GitHub, trabaja en ramas de funcionalidad derivadas de `main`, conserva commits pequeños que describan cambios reales, y abre un Pull Request por rama hacia `main`. Cada rama de entrega debe contar con al menos cinco commits sustantivos antes de solicitar revisión. No se deben crear commits vacíos ni dividir un mismo cambio solo para alcanzar un número. La creación y fusión del Pull Request se realiza en GitHub.
