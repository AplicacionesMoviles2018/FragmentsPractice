package com.itesm.kotasek.tarea_03;


public class Data {

    private String matricula;
    private String nombre;

    public Data(){
        this.matricula = "A00000000";
        this.nombre = "DEFAULT";
    }

    public Data(String mat, String nom){
        setMatricula(mat);
        setNombre(nom);
    }

    @Override
    public String toString() {
        return "Alumno --> { \n\tMatrícula: " + getMatricula() + "\n" +
                "\tNombre: " + getNombre() + "}\n\n";
    }

    // ******************************************
    // get / set
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
