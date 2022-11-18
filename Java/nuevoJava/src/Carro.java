public class Carro {
    //Atributos
    String color;
    String marca;
    int puertas;
    int ruedas;

    //Funcion añadir puerta
    public int añade(int a){
        return puertas + a;
    }

    public static void main(String[] args){
        //Objeto
        Carro miCarro = new Carro();

        miCarro.color = "Blanco";
        miCarro.marca = "Toyota";
        miCarro.puertas = 4;
        miCarro.ruedas = 4;

        //llama la funcion y suma una puerta al objeto
      System.out.println("Ahora miCarro tiene:\n "+miCarro.añade(1)+" puertas");
    }
        
  
}

