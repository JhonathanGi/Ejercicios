public class Ciclos {

    
    public static void main(String[] args){

        System.out.println("\n::CONDICIONAL IF::");

        int numeroIf = 9;

        if (numeroIf > 0) {
            System.out.println("El número "+numeroIf+" es positivo");
        }else if (numeroIf < 0) {
            System.out.println("El número "+numeroIf+" es negativo");
        }else{
            System.out.println("El número es 0");
        }

        System.out.println("\n::CICLO WHILE::");

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1; 
        }

        System.out.println("\n::CICLO DO WHILE::");

        int numeroDoWhile = 3;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroDoWhile + 1;
        } while (numeroDoWhile < 3);

        System.out.println("\n::CICLO FOR::");

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("\n::SWITCH::");

        String estacion = "verano";
        switch (estacion) {
            case "invierno":
            System.out.println("Estamos en invierno, usa abrigo\n");
                break;
            
            case "primavera":
            System.out.println("Llegó la primavera, cuidado con las alérgias\n");
                break;

            case "verano":
            System.out.println("Ha vuelto el verano, a disfrutar de la playa\n");
                break;

            case "otoño":
            System.out.println("Es otoño, recuerda lipiar el jardín\n");
                break;

            default:
            System.out.println("Esto no es una estación\n");
                break;
        }
    }


}