public class App {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        persona1.setEdad(28); 
        persona1.setNombre("Valentina"); 
        persona1.setTelefono(966974522);
        
        persona1.getNombre();
        persona1.getEdad();
        persona1.getTelefono();
        
        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("N° telefonico: " + persona1.getTelefono());
    }
    
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
}