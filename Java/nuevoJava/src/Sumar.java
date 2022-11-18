public class Sumar {

    public static void main(String[] args){

        //Invocar funcion suma
        int resultado;
        resultado = suma(3, 5, 7);
        System.out.println(resultado);
    }

    //Funcion de tres parametros
    public static int suma(int a, int b, int c){
        return a + b + c;
    }

    
}