# Backend de la Aplicación

Este es el backend de la aplicación desarrollada con Spring Boot y Spring Expression Language (SpEL), con una base de datos MySQL. A continuación, se presenta una descripción del sistema, seguido de un diseño de ingeniería que incluye un diagrama del framework Spring Boot.

## Descripción del Sistema

Este proyecto fue desarrollado utilizando Spring Boot y SpEL para habilitar la asignación dinámica de valores en tiempo de ejecución. El backend se enfoca en la gestión de clientes y productos a través de operaciones CRUD (Crear, Leer, Actualizar y Eliminar). Proporciona una interfaz de programación de aplicaciones (API) para que el frontend interactúe y administre datos eficientemente, utilizando una base de datos MySQL para almacenar y recuperar información.

## Diseño de Ingeniería

### Diagrama del Framework Spring Boot

![Diagrama del Framework Spring Boot](https://springframework.guru/wp-content/uploads/2015/04/spring-overview.png)

### Diagrama de Secuencia: Backend con Spring Boot y MySQL

![Diagrama de Secuencia](https://showme.redstarplugin.com/d/d:20KsZDqt)

#### Explicación del Diagrama

El diagrama representa la estructura del sistema backend desarrollado con Spring Boot y SpEL, relacionando los componentes clave:

- **Controladores**: En Spring Boot, los controladores gestionan las solicitudes HTTP y definen las rutas de la API. Se utilizan controladores para manejar las operaciones CRUD en clientes y productos.

- **Servicios**: Los servicios son componentes que realizan la lógica de negocio y procesan las solicitudes del controlador. En la aplicación, los servicios utilizan SpEL para asignar valores dinámicamente.

- **Persistencia de Datos**: Spring Boot facilita la interacción con una base de datos MySQL, lo que permite almacenar y recuperar datos de manera eficiente. Se utiliza JPA (Java Persistence API) para interactuar con la base de datos.

Este diseño de ingeniería garantiza una separación clara de responsabilidades y una arquitectura escalable para la aplicación Spring Boot.

## Uso del Sistema

Para poner en marcha el backend de la aplicación, se deben seguir estos pasos:

1. Asegurarse de tener Java y Maven instalados en el sistema.
2. Configurar una base de datos MySQL y ajustar la configuración de conexión en `src/main/resources/application.properties`.
3. Ejecutar `mvn spring-boot:run` en la raíz del proyecto para iniciar el servidor de desarrollo.
4. La API estará disponible en `http://localhost:8080/`. Se pueden utilizar herramientas como Postman o curl para interactuar con la API y realizar operaciones CRUD en clientes y productos.

## Pruebas

- Se pueden ejecutar pruebas unitarias utilizando el marco de pruebas proporcionado por Spring Boot.
- Para realizar pruebas de integración, se debe configurar una base de datos de prueba y ajustar la configuración de prueba en `src/test/resources/application.properties`.

## Obtener Más Ayuda

Si se necesita más ayuda o información sobre el uso de Spring Boot, SpEL o MySQL, se puede consultar la [documentación oficial de Spring Boot](https://spring.io/projects/spring-boot), [Spring Expression Language (SpEL)](https://docs.spring.io/spring-framework/docs/3.2.x/reference/html/expressions.html) y [MySQL](https://www.mysql.com/).
