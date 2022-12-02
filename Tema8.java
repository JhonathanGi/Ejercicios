public class Tema8 {

    public static void main(String[] args) {

    // Objeto
        Persona persona = new Persona();
        persona.setNombre("Jhonathan");
        persona.setEdad(40);
        persona.setTelefono("320 5913033");

        System.out.println("Los datos de la persona son:\nNombre: "+persona.getNombre()+"\nEdad: "+persona.getEdad()+"\nTeléfono: "+persona.getTelefono());
    }
}

class Persona {
    //Propiedades privadas
    private String nombre;
    private int edad;
    private String telefono;

    //Funcion SET
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    //Funcion GET
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getTelefono(){
        return this.telefono;
    }
}
