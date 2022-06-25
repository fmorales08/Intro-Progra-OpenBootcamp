public class App {
    public static void main(String[] args) {
        //condicional if
        int numeroIf = 0;
        if (numeroIf > 0){
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0){
            System.out.println("El nnumero es negativo");
        } else {
            System.out.println("El numero es 0");
        }
        //bucle While
        int numeroWhile = 0;
        while (numeroWhile < 3 ){
            numeroWhile ++;
            System.out.println(numeroWhile);
        }
        //bucle do While
        int numeroDoWhile = 0;
        do {numeroDoWhile ++;
            System.out.println(numeroDoWhile);
        }while (numeroDoWhile < 1 );
        //bucle for
        for(int numeroFor = 0; numeroFor <= 3;numeroFor++){
            System.out.println(numeroFor);
        }
        String Estacion = "primavera";
        switch(Estacion) {
            case"verano":
                System.out.println("Es verano");
                break;
            case"otoño":
                System.out.println("Es otoño");
                break;
            case"invierno":
                System.out.println("Es invierno");
                break;
            case"primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("Esta no es una estacion del año");            
        }

    }
}
    


