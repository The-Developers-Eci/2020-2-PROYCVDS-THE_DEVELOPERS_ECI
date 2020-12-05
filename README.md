# ***THE_DEVELOPERS***
## ***THE-DEVELOPERS Labinfo***

  - **Periodo Acedemico**: 2020-2
  - **curso**: Ciclos de Vida y Desarrollo de Software
  - **Profesor**: Julian Velasco Briseño
  
  
- **Integrantes**:
  - Paula Guevara
  - Fabian Ramírez
  - Federico Barrios

### Asignación de roles:
![texto cualquiera por si no carga la imagen](https://github.com/The-Developers-Eci/2020-2-PROYCVDS-THE_DEVELOPERS_ECI/blob/main/Imagenes/roles%20proy%20labinfo.png)
 
 ### Descripción del Producto
  #### Descripción General
  
Es un herramienta desarrollada por el grupo de desarrolladores “THE_DEVELOPERS_ECI” la cual se encarga de mejorar el servicio que presta el personal de laboratorio de informática (Labinfo), de la escuela colombiana de ingeniería Julio Garavito. En la plataforma podemos encontrar varias funcionalidades que se usan en la día a día del laboratorio y que son necesarios para prestar un buen servicio a la comunidad de estudiantes. Entre ellas encontramos funciones como registrar elementos, equipos, así como registrar todos los laboratorios de informática requeridos en una semana cualquiera. Adicional a eso contamos con sistema que permite adjuntar las novedades que realizan cada uno de estos elementos y equipos, logrando así una mejor distribución de equipos del laboratorio de sistemas.
    
  ### Manual de Usuario
  #### 1. **Acceso al sitio web**
  - Ingrese al navegador de preferencia y escriba en la barra de direcciones el siguiente URL de acceso:
      https://thedeveloperseci.herokuapp.com/faces/index.xhtml
  
  #### 2.	**Inicio de Sesión**
  - Para el inicio de sesión, en la pagina principal debemos irnos a la esquina superior derecha, en donde encontraremos un botón LOGIN. 
  - Al dar clic en el botón, nos redirigirá al menú de acceso, en donde nos solicitara en los espacios en blanco un Correo y una contraseña,     al ingresar dichos datos procedemos a darle INGRESAR.
  - Existen un tipo de usuario llamado: Amdinistrador
  - Este usuario cuenta con todos los privilegios para acceder a la página y así mismo realizar cambios.
  
  #### 3. **Menú de elementos**
  - Al presionar el botón de ELEMENTOS podremos acceder a estas diferentes opciones:
  1. Registrar elementos
  2. Reportar elementos
  3. Consulta de elementos.
  4. Asociar elementos-Equipo.

  #### 4. **Menú de equipos**
  
  - Al presionar el botón de EQUIPOS podremos acceder a estas diferentes opciones:
  1. Registrar equipo
  2. Consultar equipo
  
  #### 5. **Registro de equipos**
  
  - Esta opciones permiten realizar las siguientes funciones como:
  
  1. Ingresar equipo
  2. Tipo Mouse
  3. Tipo Teclado
  4. Tipo Monitor
  5. Tipo CPU.
  
  - En cada una le podremos poner el nombre de cada uno de estos artículos, y por último de le damos en la opción de REGISTRAR.
  
  #### 6. **Consulta de novedades**
  
  - Al presionar el botón de NOVEDADES podremos acceder a una tabla, con la información de los tipos de novedades y a que equipo se encuentran asociadas.
  
  #### 7. **Registro de novedades**
  
  - AL presionar el botón de REGISTRAR, se tendrá acceso a la pagina de ingreso de solicitudes nuevas para registrar una novedad.
  - En ella encontraremos dos tipos de opciones:
  
  1. Registrar novedad de elementos.
  2. Registrar novedad de equipos.
  
  - En donde se podrá registrar en detalle la novedad, con campos como: tipo, detalle, Elemento/Equipo Y el autor del mismo.
  
  #### 8. **Asociar elementos a equipo**
  
  - Al dar click en el botón de asociar elementos, nos dará la opción de registrar el elemento correspondiente, así como su equipo.
  
  #### 9. **Consulta de elementos**
  
  - Al darle clic en la opción de CONSULTA ELEMENTOS, tendremos las opción de ingresar el elemento, buscarlo y mostrar el historial completo de todos los elementos.
  
  #### 10. **Consulta de equipos**
  
  - En consultar equipos podemos hacer uso del historial de todos los equipos que tiene el laboratorio y su estado de actividad. 
  
  
  ### Funcionalidades mas importantes
  
  - El personal del laboratorio podra:
  
  #### **Agregar**
  
  - El personal del laboratorio podrá agregar nuevas novedades, equipos, elementos y laboratorios. Esta función consiste en completar los campos necesarios del elemento que nos pidan, con el fin de completar todos los campos y que el tipo de elemento o equipo pueda ser agregado de forma exitosa. Una restricción que existe es que se debe contar con 4 elementos que lo componen, para así completar el proceso de agregado de forma exitosa.
  
  #### **Asociar**
  
  - El personal del laboratorio contara con otra función muy importante que es la de asociar **elementos** y **equipos**, esta le permitirá asociar cada uno de estos al laboratorio especifico necesario y darles de baja en el momento de que sea necesario. Esto con el fin de que no se mezclen los elementos y equipos y después no se puedan identificar a que laboratorio pertenecen.
  
### **Arquitectura y Diseño Detallado**
#### Modelo E-R
![texto cualquiera por si no carga la imagen](https://github.com/The-Developers-Eci/2020-2-PROYCVDS-THE_DEVELOPERS_ECI/blob/main/Imagenes/Captura%20de%20pantalla%202020-11-13%20214917.png)
#### Diagrama de clase
![texto cualquiera por si no carga la imagen](https://github.com/The-Developers-Eci/2020-2-PROYCVDS-THE_DEVELOPERS_ECI/blob/main/Imagenes/Digrama%20de%20clase%20Historial%20De%20Equipos.png)

### **Tecnologías Utilizadas**

- **Prime Faces(FRONT)**: Fue la librería utilizada para todos los componentes relacionados con el Front-End de la plataforma. Esta fue utilizada ya que es una librería ligera y que esta encapsulada en un único JAR, el que no requiere que se haga instalación de terceros para que esta sea puesta en marcha.

- **Guice(BACK)**: Es el framework utilizado para la inyección de dependencias en Google Guice, permitiendo integrar aplicativos de Java ya hechos.

- **QuickTheories**: Son propiedades basadas en testeo para Java 8, la cual soporta ambos procesos, como lo son la automaticidad y la búsqueda usando información cubierta.

- **PostgresSQL**: Fue nuestro Principal y único servidor de base de datos usado para el proyecto, pues fue utilizado para todo el manejo de datos he información como tal, haciendo utilización de herencias , tipos de datos, funciones, restricciones y reglas de integridad útiles para el manejo de equipos y elementos del laboratorio de informática.


## CircleCI
>[![CircleCI](https://circleci.com/gh/The-Developers-Eci/2020-2-PROYCVDS-THE_DEVELOPERS_ECI.svg?style=svg)](https://app.circleci.com/pipelines/github/The-Developers-Eci/2020-2-PROYCVDS-THE_DEVELOPERS_ECI)

## HerokuApp
>[![Deployed to Heroku](https://www.herokucdn.com/deploy/button.png)](https://thedeveloperseci.herokuapp.com/)


## **Descripción del proceso**:

#### **Integrantes**:

- Federico Barrios Menenes,
- Paula Guevara Sanchez.
- Fabián Ramírez Pinto.

### **Descripcion de la metodologia**

La planeación de los sprint se realizó en la primera reunión oficial de comienzo del proyecto, en donde se planteó los Sprint a trabajar y una generalidades del proyecto. Luego de eso, en la semana siguiente se comenzó a definir Sprint por Sprint de cada una de las tareas y se realizó una estimación de cuando tiempo tomaría la realización del proyecto y en cuanto tiempo se tendría si se cumpliera con todas las actividades del Sprint en las fechas establecidas.

En total fueron 3 Sprint, y todo el grupo se puso de acuerdo para la asiganacion de tareas y cuáles de ellas se deberían hacer primero. Estableciendo tareas que se deberían realizar antes y que no saldrían si no se hicieran unas antes. Así fue como se estableció el orden y como se desarrolló el proyecto.	


##**Taiga**

Mediante este enlace se podra acceder a la Herramienta Taiga y conocer el proceso del Proyecto. [Taiga THE-DEVELOPERS-Labinfo](https://tree.taiga.io/project/federico29-historial-de-equipos-labinfo/timeline/).


### ***SPRINTS y release-burndown chart***

### **SPRINT 1**

Para este Sprint se usuaron las siguientes historias de usuario propuestas, con el fin de comenzar la estructuracion del proyecto:

- Inicio de sesión
- Registrar Elemento
- Registrar Equipo.
- Registrar Novedad.


EL Sprint 1 comenzó a medias, debido que la definición de las tareas descritas anteriormente comenzó a generar problema, lo que causo que se generaran problemas en la implementación. Mas se sacaron adelante, entre los tres integrantes, cada uno atacando un problema diferente he intentado culminar todas las tareas en el tiempo menor posible.

#### ***Burdown Chart***

![texto cualquiera por si no carga la imagen](https://github.com/The-Developers-Eci/2020-2-PROYCVDS-THE_DEVELOPERS_ECI/blob/main/Imagenes/sprint%201%20Burdown%20chart.jpg)

#### ***Backlog***

![texto cualquiera por si no carga la imagen](https://github.com/The-Developers-Eci/2020-2-PROYCVDS-THE_DEVELOPERS_ECI/blob/main/Imagenes/sprint%201%20backlog.jpg)


### **SPRINT 2**

Para este Sprint se usuaron las siguientes historias de usuario propuestas, con el fin de comenzar la estructuracion del proyecto:

- Corrección del Sprint 1
- Reporte historico de novedades
- Reporte de equipos.
- Reporte de laboratorios.
- Reporte de elementos



#### ***Burdown Chart***

![texto cualquiera por si no carga la imagen](https://github.com/The-Developers-Eci/2020-2-PROYCVDS-THE_DEVELOPERS_ECI/blob/main/Imagenes/sprint%202%20burdown%20chart.jpg)

#### ***Backlog***

![texto cualquiera por si no carga la imagen](https://github.com/The-Developers-Eci/2020-2-PROYCVDS-THE_DEVELOPERS_ECI/blob/main/Imagenes/sprint%202%20backlog.jpg)


