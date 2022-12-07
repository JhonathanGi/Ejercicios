public class Tema9 {

    public static void main(String[] args) {
        
        //objeto Cliente
        Cliente cliente = new Cliente();
        cliente.setNombre("Jhonathan");
        cliente.setEdad(40);
        cliente.setTelefono("3205912323");
        cliente.credito = 900.50;

        //objeto Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Paulo");
        trabajador.setEdad(45);
        trabajador.setTelefono("3122624450");
        trabajador.salario = 500.50;

        System.out.println("::Datos Cliente::\nNombre: "+cliente.getNombre()+"\nEdad: "+cliente.getEdad()+"\nTelefono: "+cliente.getTelefono()+"\nCredito: "+cliente.credito+"\n\n::Datos Trabajador::\nNombre: "+trabajador.getNombre()+"\nEdad: "+trabajador.getEdad()+"\nTelefono: "+trabajador.getTelefono()+"\nSalario: "+trabajador.salario);
    }
}

class Persona {
    //propiedades de la clase padre
    private int edad;
    private String nombre;
    private String telefono;

    //SET
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    //GET
    public int getEdad(){
        return this.edad;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getTelefono(){
        return this.telefono;
    }



}

//clase hijo Cliente
class Cliente extends Persona {
    double credito;
}

//clase hijo Trabajador
class Trabajador extends Persona {
    double salario;
}