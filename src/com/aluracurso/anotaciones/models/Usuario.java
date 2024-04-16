package com.aluracurso.anotaciones.models;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.Period;

public class Usuario {
    private String nombre;
    private String identidad;
    @EdadMinima(valor = 18)
    private LocalDate fechaNacimiento;

    public Usuario(String nombre, String identidad, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.identidad = identidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentidad() {
        return identidad;
    }

    public void setIdentidad(String identidad) {
        this.identidad = identidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean usuarioValido(Usuario usuario){
        if(!usuario.getNombre().matches("[a-zA-Záàâãéèêíïóôõöúçñ\\s]+")){
            return false;
        }
        if(!usuario.getIdentidad().matches("[^0-9]+")){
            return false;
        }
        return Period.between(usuario.getFechaNacimiento(), LocalDate.now()).getYears() >= 18;
    }
    /**uso de Generics permitirá recibir un objeto de cualquier tipo*/
    public static <T> boolean validador( T objeto ) throws IllegalAccessException {
        //operar la clase referente al tipo del objeto recibido
        Class <?> clase = objeto.getClass();
        //iteraremos sobre los atributos de la clase utilizando el método getDeclaredFields():
        for (Field field : clase.getDeclaredFields()){
            /*averiguar qué campo está anotado con nuestra anotación. isAnnotationPresent(): este método comprueba si el campo
            * contiene la anotación pasada y devuelve un boolean*/
            if (field.isAnnotationPresent(EdadMinima.class));
                //recoger nuestra anotacion con getAnnotation()
                EdadMinima edadMinima = field.getAnnotation(EdadMinima.class);
                try{
                    //Obtener edad pasada por el usuarios
                    field.setAccessible(true);
                    // se recibe la fecha de nacimiento
                    LocalDate fechaNacimiento = (LocalDate) field.get(objeto);
                    /**Between(): toma como parámetro dos fechas para ser comparadas,
                     * el método now() para obtener la fecha actual y
                     * el método getYears():para saber el valor del período en años **/
                    return Period.between(fechaNacimiento, LocalDate.now()).getYears() >= edadMinima.valor();

                }catch (IllegalAccessException e){
                    e.printStackTrace();
                }
        }
        return false;
    }


}


