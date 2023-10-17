# Backend de la Aplicación

Este es el backend de la aplicación desarrollada con Spring Boot y Spring Expression Language (SpEL). A continuación, se presenta una descripción del sistema, seguido de un diseño de ingeniería que incluye un diagrama del framework Spring Boot.

## Descripción del Sistema

Este proyecto se desarrolló utilizando Spring Boot y SpEL para habilitar la asignación dinámica de valores en tiempo de ejecución. El backend se centra en la gestión de clientes y productos a través de operaciones CRUD (Crear, Leer, Actualizar y Eliminar). Proporciona una interfaz de programación de aplicaciones (API) para que el frontend interactúe y administre datos eficientemente.

## Diseño de Ingeniería

### Diagrama del Framework Spring Boot

![Diagrama del Framework Spring Boot](https://springframework.guru/wp-content/uploads/2015/04/spring-overview.png)

### Explicación del Diagrama

El diagrama representa la estructura de nuestro sistema backend desarrollado con Spring Boot y SpEL, relacionando los componentes clave:

- **Controladores**: En Spring Boot, los controladores gestionan las solicitudes HTTP y definen las rutas de la API. Utilizamos controladores para manejar las operaciones CRUD en clientes y productos.

- **Servicios**: Los servicios son componentes que realizan la lógica de negocio y procesan las solicitudes del controlador. En nuestra aplicación, los servicios utilizan SpEL para asignar valores dinámicamente.

- **Persistencia de Datos**: Spring Boot facilita la interacción con una base de datos, lo que nos permite almacenar y recuperar datos de manera eficiente. Utilizamos JPA (Java Persistence API) para interactuar con la base de datos.

Este diseño de ingeniería garantiza una separación clara de responsabilidades y una arquitectura escalable para nuestra aplicación Spring Boot.

## Uso del Sistema

Para poner en marcha el backend de la aplicación, sigue estos pasos:

1. Asegúrate de tener Java y Maven instalados en tu sistema.

2. Ejecuta `mvn spring-boot:run` en la raíz del proyecto para iniciar el servidor de desarrollo.

3. La API estará disponible en `http://localhost:8080/`. Puedes utilizar herramientas como Postman o curl para interactuar con la API y realizar operaciones CRUD en clientes y productos.

## Pruebas

- Puedes ejecutar pruebas unitarias utilizando el marco de pruebas proporcionado por Spring Boot.

- Para realizar pruebas de integración, asegúrate de configurar una base de datos de prueba y ajustar la configuración de prueba en `src/test/resources/application.properties`.

## Obtener Más Ayuda

Si necesitas más ayuda o información sobre el uso de Spring Boot o SpEL, consulta la [documentación oficial de Spring Boot](https://spring.io/projects/spring-boot) y [Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/docs/3.2.x/reference/html/expressions.html).
