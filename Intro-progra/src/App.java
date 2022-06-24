public class App {
    public static void main(String[] args) {
        suma(4, 8, 2);
    }

    public static void suma(int a, int b, int c){
        int result;
        result = a + b + c;

        System.out.println(result);
    }
}

class Coche {
    int cantidadPuertas;
    public void addPuertas(){
        cantidadPuertas ++;
        
    }
    
    public static void main(String[] args){
        Coche miCoche = new Coche();

        miCoche.cantidadPuertas = 1;

        miCoche.addPuertas();

        System.out.println(miCoche.cantidadPuertas);
        
    
}

}