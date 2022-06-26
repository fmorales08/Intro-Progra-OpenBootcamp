public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente();
        cliente1.edad = 25;
        cliente1.nombre = "Juan";
        cliente1.telefono = 955341212;
        cliente1.credito = 1500000;
        
        
        System.out.println("Nombre Cliente: " + cliente1.nombre);
        System.out.println("Edad: " + cliente1.edad);
        System.out.println("N° telefonico: " + cliente1.telefono);
        System.out.println("Credito : " + cliente1.credito);
        
        Trabajador trabajador1 = new Trabajador();
        trabajador1.edad = 32;
        trabajador1.nombre = "Maria";
        trabajador1.telefono = 959431342;
        trabajador1.salario = 9000;
        
        System.out.println("Nombre Trabajador(a): " + trabajador1.nombre);
        System.out.println("Edad: " + trabajador1.edad);
        System.out.println("N° telefonico: " + trabajador1.telefono);
        System.out.println("Salario: " + trabajador1.salario);
    }
}


class persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends persona {
    int credito;    
}

class Trabajador extends persona {
    int salario;    
}
