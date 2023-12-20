/* POPULATE TABLA ROLES (DATOS PRUEBA)*/
INSERT INTO roles (nombre) VALUES ('ADMINISTRADOR');
INSERT INTO roles (nombre) VALUES ('DOCENTE');
INSERT INTO roles (nombre) VALUES ('ESTUDIANTE');




/* POPULATE TABLA CLIENTES (DATOS PRUEBA)*/
-- Estudiantes
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000001', 'MARIA', 'VAZCONES', 'MARIA.VASCONEZ.REA@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000002', 'ARIEL', 'RAURA', 'ARIEL.RAURA@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000003', 'CARLOS', 'GUAGRILLA', 'CARLOS.GUAGRILLA@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000004', 'MARTIN', 'ZUMARRAGA', 'MARTIN.ZUMARRAGA@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000005', 'GUILLERMO', 'ALVAREZ', 'GUILLERMO.ALVAREZ@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000006', 'ANDRES', 'LOZA', 'ANDRES.LOZA.CHACON@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000007', 'GABRIEL', 'ERAZO', 'GABRIEL.ERAZO.MERINO@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000008', 'ENRIQUE', 'MERIZALDE', 'ENRIQUE.MERIZALDE@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000009', 'MATEO', 'ENCALADA', 'MATEO.ENCALADA@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000010', 'MAURO', 'SALGUERO', 'MAURO.SALGUERO@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000011', 'PAULO', 'GUERRA', 'PAULO.GUERRA.CHAMBA@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000012', 'JULISSA', 'RUALES', 'JULISSA.RUALES@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000013', 'DANIEL', 'VIZCARRA', 'DANIEL.VIZCARRA@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000014', 'JOSSUE', 'JATIVA', 'JOSSUE.JATIVA@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000015', 'MATEO', 'CARTAGENA', 'MATEO.CARTAGENA@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000016', 'JUAN', 'RAMÍREZ', 'JUAN.RAMIREZ.FREIRE@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000017', 'JUAN', 'ARISTIZABAL', 'JUAN.ARISTIZABAL@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000018', 'JOSE', 'CARRERA', 'JOSE.CARRERA.MONTESDEOCA@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000019', 'CAMILA', 'CABRERA', 'CAMILA.CABRERA.TAPIA@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000020', 'OSCAR', 'ALBUJA', 'OSCAR.ALBUJA@UDLA.EDU.EC', 4, CURRENT_DATE);
INSERT INTO clientes (cedula, nombre, apellido, email, semestre_cursado, create_at) VALUES ('1720000021', 'MARÍA', 'JIMÉNEZ', 'MARIACRISTINA.JIMENEZ@UDLA.EDU.EC', 4, CURRENT_DATE);


/* POPULATE TABLA CLIENTES (DATOS PRUEBA)*/

-- Asociar estudiantes con el rol ESTUDIANTE
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (1, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (2, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (3, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (4, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (5, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (6, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (7, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (8, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (9, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (10, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (11, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (12, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (13, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (14, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (15, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (16, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (17, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (18, 3);
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (19, 3);
-- Asociar OSCAR ALBUJA con el rol ADMINISTRADOR
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (20, 3);
-- Asociar MARÍA JIMÉNEZ con el rol DOCENTE
INSERT INTO cliente_roles (cliente_id, rol_id) VALUES (21, 2);


/* POPULATE TABLA INTERESES */
-- Área de Interés
INSERT INTO intereses (nombre) VALUES ('Desarrollo de aplicaciones móviles');
INSERT INTO intereses (nombre) VALUES ('Seguridad de la información');
INSERT INTO intereses(nombre) VALUES ('Inteligencia artificial y aprendizaje automático');
INSERT INTO intereses (nombre) VALUES ('Arquitectura de software');

-- Metodología de Desarrollo
INSERT INTO intereses (nombre) VALUES ('Agile');
INSERT INTO intereses (nombre) VALUES ('Waterfall');
INSERT INTO intereses (nombre) VALUES ('Scrum');
INSERT INTO intereses (nombre) VALUES ('Kanban');

-- Lenguaje de Programación
INSERT INTO intereses (nombre) VALUES ('Java');
INSERT INTO intereses (nombre) VALUES ('C Sharp');
INSERT INTO intereses (nombre) VALUES ('Python');
INSERT INTO intereses (nombre) VALUES ('JavaScript');

-- Herramientas de Desarrollo
INSERT INTO intereses (nombre) VALUES ('Visual Studio');
INSERT INTO intereses (nombre) VALUES ('Eclipse');
INSERT INTO intereses (nombre) VALUES ('NetBeans');
INSERT INTO intereses (nombre) VALUES ('IntelliJ IDEA');

-- Opinión sobre el Trabajo en Equipo
INSERT INTO intereses (nombre) VALUES ('Esencial para el éxito del proyecto');
INSERT INTO intereses (nombre) VALUES ('Importante pero no crucial');
INSERT INTO intereses (nombre) VALUES ('No es necesario en absoluto');
INSERT INTO intereses (nombre) VALUES ('No tengo experiencia trabajando en equipo');

-- Habilidades y Conocimientos a Mejorar
INSERT INTO intereses (nombre) VALUES ('Programación en lenguajes específicos');
INSERT INTO intereses (nombre) VALUES ('Diseño de software y arquitectura');
INSERT INTO intereses (nombre) VALUES ('Metodologías ágiles y de gestión de proyectos');
INSERT INTO intereses (nombre) VALUES ('Seguridad de la información y privacidad de datos');

-- Intereses en Colaborar
INSERT INTO intereses (nombre) VALUES ('Desarrollo de aplicaciones para organizaciones sin fines de lucro');
INSERT INTO intereses (nombre) VALUES ('Participación en hackathons o competencias de programación');
INSERT INTO intereses (nombre) VALUES ('Investigación en inteligencia artificial y aprendizaje automático');
INSERT INTO intereses (nombre) VALUES ('Participación en programas de mentoría');

-- Herramientas Necesarias para el Desempeño en Software
INSERT INTO intereses (nombre) VALUES ('Acceso a cursos y tutoriales en línea');
INSERT INTO intereses (nombre) VALUES ('Participación en comunidades de desarrolladores');
INSERT INTO intereses (nombre) VALUES ('Acceso a herramientas de desarrollo y software profesional');
INSERT INTO intereses (nombre) VALUES ('Asesoramiento y mentoría de profesionales experimentados');

-- Eventos de Interés para Asistir
INSERT INTO intereses (nombre) VALUES ('Conferencias y seminarios');
INSERT INTO intereses (nombre) VALUES ('Talleres y sesiones de formación');
INSERT INTO intereses (nombre) VALUES ('Jornadas de puertas abiertas y eventos de networking');
INSERT INTO intereses (nombre) VALUES ('Programas de intercambio y viajes de estudio');

-- Colaboración e Intercambio de Conocimiento
INSERT INTO intereses (nombre) VALUES ('Intercambio de experiencias y prácticas en proyectos');
INSERT INTO intereses (nombre) VALUES ('Mentoría y tutoría mutua');
INSERT INTO intereses (nombre) VALUES ('Compartir recursos y herramientas útiles');
INSERT INTO intereses (nombre) VALUES ('Participar en proyectos de investigación o desarrollo colaborativo');

/* INSERTs para cliente ID 1: MARIA VAZCONES */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (1, 3, 10);  -- Inteligencia artificial y aprendizaje automático
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (1, 5, 9);   -- Agile
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (1, 9, 7);   -- Java
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (1, 15, 3);  -- NetBeans (Corregido de 13 a 15)
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (1, 17, 3);  -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (1, 24, 2);  -- Seguridad de la información y privacidad de datos (Corregido de 21 a 24)
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (1, 26, 5);  -- Participación en hackathons o competencias de programación (Corregido de 25 a 26)
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (1, 29, 3);  -- Acceso a cursos y tutoriales en línea
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (1, 33, 6);  -- Conferencias y seminarios
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (1, 38, 1);  -- Mentoría y tutoría mutua (Correcto)



/* INSERTs para cliente ID 2: ARIEL RAURA */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (2, 4, 7);  -- Arquitectura de software
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (2, 7, 8);  -- Scrum
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (2, 11, 7); -- Python (Corregido de 10 a 11)
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (2, 13, 5); -- Visual Studio (Corregido de 14 a 13)
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (2, 17, 7); -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (2, 22, 2); -- Diseño de software y arquitectura (Corregido de 20 a 22)
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (2, 26, 10); -- Participación en hackathons o competencias de programación (Corregido de 25 a 26)
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (2, 31, 8); -- Acceso a herramientas de desarrollo y software profesional (Corregido de 30 a 31)
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (2, 35, 4); -- Jornadas de puertas abiertas y eventos de networking (Corregido de 34 a 35)
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (2, 39, 5); -- Compartir recursos y herramientas útiles (Corregido de 38 a 39)

/* INSERTs para cliente ID 3: CARLOS GUAGRILLA */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (3, 4, 10); -- Arquitectura de software
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (3, 7, 4);  -- Scrum
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (3, 11, 3); -- Python (Corregido)
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (3, 14, 7); -- Visual Studio
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (3, 17, 2); -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (3, 20, 3); -- Diseño de software y arquitectura
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (3, 25, 6); -- Participación en hackathons o competencias de programación
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (3, 30, 3); -- Acceso a herramientas de desarrollo y software profesional
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (3, 35, 6); -- Jornadas de puertas abiertas y eventos de networking
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (3, 38, 1); -- Compartir recursos y herramientas útiles

/* INSERTs para cliente ID 4: MARTIN ZUMARRAGA */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (4, 1, 4);  -- Desarrollo de aplicaciones móviles
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (4, 6, 3);  -- Waterfall
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (4, 9, 4);  -- Java
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (4, 13, 10); -- Visual Studio
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (4, 17, 5); -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (4, 21, 2); -- Programación en lenguajes específicos
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (4, 25, 9); -- Desarrollo de aplicaciones para organizaciones sin fines de lucro
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (4, 29, 10); -- Acceso a cursos y tutoriales en línea
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (4, 33, 6); -- Conferencias y seminarios
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (4, 37, 6); -- Intercambio de experiencias y prácticas en proyectos

/* INSERTs para cliente ID 5: GUILLERMO ALVAREZ */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (5, 3, 10); -- Inteligencia artificial y aprendizaje automático
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (5, 6, 3);  -- Waterfall
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (5, 9, 8);  -- Java
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (5, 13, 2); -- Visual Studio
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (5, 17, 4); -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (5, 23, 9); -- Metodologías ágiles y de gestión de proyectos
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (5, 25, 8); -- Desarrollo de aplicaciones para organizaciones sin fines de lucro
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (5, 29, 5); -- Acceso a cursos y tutoriales en línea
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (5, 33, 2); -- Conferencias y seminarios
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (5, 38, 5); -- Mentoría y tutoría mutua

/* INSERTs para cliente ID 6: ANDRES LOZA */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (6, 3, 1);  -- Inteligencia artificial y aprendizaje automático
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (6, 5, 5);  -- Agile
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (6, 11, 10); -- Python
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (6, 13, 3); -- Visual Studio
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (6, 17, 3); -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (6, 21, 10); -- Programación en lenguajes específicos
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (6, 27, 4); -- Investigación en inteligencia artificial y aprendizaje
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (6, 29, 1); -- Acceso a cursos y tutoriales en línea
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (6, 36, 7); -- Programas de intercambio y viajes de estudio
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (6, 39, 4); -- Compartir recursos y herramientas útiles

/* INSERTs para cliente ID 7: GABRIEL ERAZO */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (7, 3, 6);  -- Inteligencia artificial y aprendizaje automático
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (7, 5, 3);  -- Agile
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (7, 10, 10); -- Python
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (7, 14, 5); -- Visual Studio
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (7, 17, 8); -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (7, 22, 1); -- Programación en lenguajes específicos
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (7, 26, 8); -- Desarrollo de aplicaciones para organizaciones sin fines de lucro
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (7, 29, 7); -- Acceso a cursos y tutoriales en línea
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (7, 35, 6); -- Talleres y sesiones de formación
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (7, 38, 3); -- Mentoría y tutoría mutua

/* INSERTs para cliente ID 8: ENRIQUE MERIZALDE */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (8, 3, 5);  -- Inteligencia artificial y aprendizaje automático
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (8, 7, 6);  -- Scrum
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (8, 9, 3);  -- Java
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (8, 15, 3); -- NetBeans
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (8, 18, 2); -- Importante pero no crucial
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (8, 23, 1); -- Metodologías ágiles y de gestión de proyectos
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (8, 25, 10); -- Desarrollo de aplicaciones para organizaciones sin fines de lucro
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (8, 29, 6); -- Acceso a cursos y tutoriales en línea
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (8, 35, 9); -- Jornadas de puertas abiertas y eventos de networking
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (8, 37, 9); -- Intercambio de experiencias y prácticas en proyectos

/* INSERTs para cliente ID 9: MATEO ENCALADA */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (9, 4, 2);  -- Arquitectura de software
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (9, 7, 9);  -- Scrum
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (9, 12, 1); -- JavaScript
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (9, 15, 9); -- NetBeans
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (9, 18, 4); -- Importante pero no crucial
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (9, 21, 4); -- Programación en lenguajes específicos
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (9, 28, 10); -- Participación en programas de mentoría
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (9, 29, 5); -- Acceso a cursos y tutoriales en línea
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (9, 34, 1); -- Talleres y sesiones de formación
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (9, 39, 8); -- Compartir recursos y herramientas útiles

/* INSERTs para cliente ID 10: MAURO SALGUERO */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (10, 2, 5); -- Seguridad de la información
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (10, 6, 4); -- Waterfall
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (10, 10, 5); -- C Sharp
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (10, 15, 8); -- NetBeans
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (10, 17, 2); -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (10, 21, 7); -- Programación en lenguajes específicos
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (10, 26, 5); -- Participación en hackathons o competencias de programación
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (10, 30, 9); -- Participación en comunidades de desarrolladores
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (10, 34, 10); -- Talleres y sesiones de formación
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (10, 37, 1); -- Intercambio de experiencias y prácticas en proyectos

/* INSERTs para cliente ID 11: PAULO GUERRA */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (11, 2, 5); -- Seguridad de la información
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (11, 7, 7); -- Scrum
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (11, 9, 6); -- Java
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (11, 15, 8); -- NetBeans
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (11, 17, 5); -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (11, 24, 2); -- Seguridad de la información y privacidad de datos
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (11, 26, 2); -- Participación en hackathons o competencias de programación
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (11, 31, 10); -- Acceso a herramientas de desarrollo y software profesional
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (11, 35, 2); -- Jornadas de puertas abiertas y eventos de networking
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (11, 37, 2); -- Intercambio de experiencias y prácticas en proyectos

/* INSERTs para cliente ID 12: JULISSA RUALES */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (12, 3, 6); -- Inteligencia artificial y aprendizaje automático
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (12, 7, 5); -- Scrum
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (12, 10, 4); -- C Sharp
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (12, 13, 8); -- Visual Studio
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (12, 17, 4); -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (12, 21, 8); -- Programación en lenguajes específicos
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (12, 26, 7); -- Participación en hackathons o competencias de programación
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (12, 29, 6); -- Acceso a cursos y tutoriales en línea
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (12, 35, 7); -- Jornadas de puertas abiertas y eventos de networking
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (12, 40, 3); -- Participar en proyectos de investigación o desarrollo colaborativo

/* INSERTs para cliente ID 13: DANIEL VIZCARRA */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (13, 3, 6);  -- Inteligencia artificial y aprendizaje automático
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (13, 7, 4);  -- Scrum
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (13, 10, 3); -- C Sharp
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (13, 13, 5); -- Visual Studio
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (13, 17, 8); -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (13, 21, 6); -- Programación en lenguajes específicos
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (13, 26, 7); -- Participación en hackathons o competencias de programación
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (13, 30, 2); -- Participación en comunidades de desarrolladores
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (13, 35, 3); -- Jornadas de puertas abiertas y eventos de networking
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (13, 37, 1);  -- Intercambio de experiencias y prácticas en proyectos

/* INSERTs para cliente ID 14: JOSSUE JATIVA */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (14, 3, 10); -- Inteligencia artificial y aprendizaje automático
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (14, 7, 9);  -- Scrum
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (14, 10, 7); -- C Sharp
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (14, 13, 3); -- Visual Studio
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (14, 17, 5); -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (14, 22, 2); -- Diseño de software y arquitectura
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (14, 26, 1); -- Participación en hackathons o competencias de programación
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (14, 31, 8); -- Acceso a herramientas de desarrollo y software profesional
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (14, 35, 4); -- Jornadas de puertas abiertas y eventos de networking
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (14, 38, 5); -- Mentoría y tutoría mutua

/* INSERTs para cliente ID 15: MATEO CARTAGENA */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (15, 2, 2); -- Seguridad de la información
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (15, 7, 8); -- Scrum
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (15, 11, 5); -- Python
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (15, 15, 10); -- NetBeans
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (15, 17, 7); -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (15, 24, 8); -- Seguridad de la información y privacidad de datos
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (15, 27, 10); -- Investigación en inteligencia artificial y aprendizaje
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (15, 29, 3); -- Acceso a cursos y tutoriales en línea
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (15, 36, 6); -- Programas de intercambio y viajes de estudio
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (15, 38, 3); -- Mentoría y tutoría mutua

/* INSERTs para cliente ID 16: JUAN RAMÍREZ */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (16, 4, 9); -- Arquitectura de software
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (16, 5, 1); -- Agile
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (16, 10, 7); -- C Sharp
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (16, 13, 1); -- Visual Studio
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (16, 18, 2); -- Importante pero no crucial
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (16, 22, 2); -- Diseño de software y arquitectura
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (16, 26, 7); -- Participación en hackathons o competencias de programación
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (16, 30, 1); -- Participación en comunidades de desarrolladores
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (16, 34, 8); -- Talleres y sesiones de formación
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (16, 39, 1); -- Compartir recursos y herramientas útiles

/* INSERTs para cliente ID 17: JUAN ARISTIZABAL */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (17, 3, 6); -- Inteligencia artificial y aprendizaje automático
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (17, 7, 3); -- Scrum
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (17, 11, 9); -- Python
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (17, 13, 2); -- Visual Studio
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (17, 17, 2); -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (17, 21, 2); -- Programación en lenguajes específicos
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (17, 27, 7); -- Investigación en inteligencia artificial y aprendizaje
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (17, 29, 3); -- Acceso a cursos y tutoriales en línea
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (17, 36, 6); -- Programas de intercambio y viajes de estudio
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (17, 37, 10); -- Intercambio de experiencias y prácticas en proyectos

/* INSERTs para cliente ID 18: JOSE CARRERA */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (18, 1, 5); -- Desarrollo de aplicaciones móviles
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (18, 5, 2); -- Agile
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (18, 9, 8); -- Java
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (18, 15, 2); -- NetBeans
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (18, 18, 9); -- Importante pero no crucial
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (18, 22, 3); -- Diseño de software y arquitectura
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (18, 25, 6); -- Desarrollo de aplicaciones para organizaciones sin fines de lucro
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (18, 31, 1); -- Acceso a herramientas de desarrollo y software profesional
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (18, 34, 6); -- Talleres y sesiones de formación
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (18, 37, 10); -- Intercambio de experiencias y prácticas en proyectos

/* INSERTs para cliente ID 19: CAMILA CABRERA */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (19, 1, 2); -- Desarrollo de aplicaciones móviles
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (19, 5, 10); -- Agile
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (19, 9, 1); -- Java
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (19, 15, 9); -- NetBeans
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (19, 18, 6); -- Importante pero no crucial
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (19, 22, 2); -- Diseño de software y arquitectura
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (19, 25, 9); -- Desarrollo de aplicaciones para organizaciones sin fines de lucro
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (19, 29, 9); -- Acceso a cursos y tutoriales en línea
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (19, 33, 10); -- Conferencias y seminarios
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (19, 38, 9); -- Mentoría y tutoría mutua

/* INSERTs para cliente ID 20: OSCAR ALBUJA */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (20, 3, 8); -- Inteligencia artificial y aprendizaje automático
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (20, 6, 8); -- Waterfall
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (20, 11, 5); -- Python
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (20, 14, 5); -- Eclipse
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (20, 18, 7); -- Importante pero no crucial
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (20, 23, 7); -- Metodologías ágiles y de gestión de proyectos
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (20, 26, 6); -- Participación en hackathons o competencias de programación
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (20, 32, 7); -- Asesoramiento y mentoría de profesionales experimentados
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (20, 35, 9); -- Jornadas de puertas abiertas y eventos de networking
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (20, 38, 10); -- Mentoría y tutoría mutua

/* INSERTs para cliente ID 21: MARÍA JIMÉNEZ */
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (21, 3, 10); -- Inteligencia artificial y aprendizaje automático
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (21, 7, 6); -- Scrum
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (21, 11, 5); -- Python
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (21, 15, 1); -- NetBeans
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (21, 17, 5); -- Esencial para el éxito del proyecto
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (21, 24, 7); -- Seguridad de la información y privacidad de datos
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (21, 25, 4); -- Desarrollo de aplicaciones para organizaciones sin fines de lucro
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (21, 31, 5); -- Acceso a herramientas de desarrollo y software profesional
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (21, 33, 2); -- Conferencias y seminarios
INSERT INTO cliente_intereses (cliente_id, interes_id, ponderacion) VALUES (21, 39, 4); -- Compartir recursos y herramientas útiles
