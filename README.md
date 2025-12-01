📌 EconomiApi - Backend
EconomiApi es una aplicación backend desarrollada con Spring Boot y Spring Data JDBC para ayudar a individuos y familias a gestionar su economía personal. Permite registrar ingresos y gastos, crear categorías, definir objetivos de ahorro, realizar simulaciones financieras y generar informes.

✅ Características principales

Gestión de usuarios con autenticación segura.
Registro de transacciones (ingresos y gastos).
Creación y administración de categorías.
Definición de objetivos de ahorro.
Ejecución de simulaciones (ahorro e inversión).
API REST lista para integrarse con un frontend (Angular, React, etc.).


🛠️ Tecnologías utilizadas

Java 17
Spring Boot 4
Spring Data JDBC
Spring Security
SQL Server (Base de datos)
Maven (Gestión de dependencias)


📂 Estructura del proyecto
src/main/java/com/economi/
    ├── modelo/           # Entidades (Usuario, Categoria, Transaccion, etc.)
    ├── repositorio/      # Interfaces de acceso a datos
    ├── servicio/         # Lógica de negocio (CRUD)
    ├── controlador/      # Controladores REST
src/main/resources/
    ├── application.properties  # Configuración del proyecto
    ├── data.sql                # Datos iniciales (opcional)


⚙️ Configuración
1. application.properties
Plain Textproperties no es totalmente compatible. El resaltado de sintaxis se basa en Plain Text.server.port=8080spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=economi;encrypt=falsespring.datasource.username=TU_USUARIOspring.datasource.password=TU_PASSWORDspring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriverspring.sql.init.mode=alwaysspring.sql.init.platform=sqlserverlogging.level.org.springframework.jdbc.core=DEBUGMostrar más líneas
2. Dependencias clave en pom.xml
XML<dependency>    <groupId>org.springframework.boot</groupId>    <artifactId>spring-boot-starter-data-jdbc</artifactId></dependency><dependency>    <groupId>org.springframework.boot</groupId>    <artifactId>spring-boot-starter-security</artifactId></dependency><dependency>    <groupId>com.microsoft.sqlserver</groupId>    <artifactId>mssql-jdbc</artifactId>    <version>12.2.0.jre11</version></dependency><dependency>    <groupId>org.springframework.boot</groupId>    <artifactId>spring-boot-starter-validation</artifactId></dependency>Mostrar más líneas

🚀 Cómo ejecutar el proyecto

Clona el repositorio:
Shellgit clone https://github.com/tuusuario/EconomiApi.gitMostrar más líneas

Configura la base de datos SQL Server y actualiza application.properties.
Compila y ejecuta:
Shellmvn clean installmvn spring-boot:runMostrar más líneas

Accede a la API en:
http://localhost:8080/api




🔗 Endpoints principales
Usuarios

POST /api/usuarios → Crear usuario
GET /api/usuarios → Listar usuarios
GET /api/usuarios/{id} → Obtener usuario por ID

Categorías

POST /api/categorias → Crear categoría
GET /api/categorias → Listar categorías
GET /api/categorias/tipo/{tipo} → Buscar por tipo

Transacciones

POST /api/transacciones → Crear transacción
GET /api/transacciones/usuario/{idUsuario} → Buscar por usuario

Objetivos de ahorro

POST /api/objetivos → Crear objetivo
GET /api/objetivos/estado/{estado} → Buscar por estado

Simulaciones

POST /api/simulaciones → Crear simulación
GET /api/simulaciones/tipo/{tipo} → Buscar por tipo


✅ Próximos pasos

Implementar Spring Security con JWT.
Añadir validaciones en los modelos.
Crear tests unitarios y de integración.
Preparar Docker Compose para despliegue.


📜 Licencia
Este proyecto está bajo la licencia MIT.
