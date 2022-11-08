package persona;
/**
@author GbR
*/
public class Persona {
    public static void main(String[] args) {
        Personas persona1 = new Personas();
        
        persona1.setEdad(38);
        persona1.setNombre("Gabriel");
        persona1.setPhone(26165677);
        System.out.println("nombre: "+persona1.getNombre()+", edad: "+persona1.getEdad()+", tel: "+persona1.getPhone());
        
        
    }    
}
class Personas {
    private int edad;
    private String nombre;
    private int phone;

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setPhone(int phone) {
            this.phone = phone;
        }

        public int getEdad() {
            return edad;
        }

        public String getNombre() {
            return nombre;
        }

        public int getPhone() {
            return phone;
        }
    }