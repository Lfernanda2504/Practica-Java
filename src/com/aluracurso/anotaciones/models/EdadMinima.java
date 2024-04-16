package com.aluracurso.anotaciones.models;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**Se ejecuta cuando el usuario envia datos
 ** Verifica si el usuario tiene una edad suficiente
 contexto de nuestra anotación**/
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface EdadMinima {
     int valor();
}
