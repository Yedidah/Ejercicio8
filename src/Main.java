public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setNombre("Nombre es"+ " " + "Yedidah");
        String nombre = persona.getNombre();
        System.out.println(nombre);

        persona.setEdad(31);
        int edad = persona.getEdad();
        System.out.println("Edad es" + " " + edad);

        persona.setTelefono(31874898);
        int telefono = persona.getTelefono();
        System.out.println("Telefono es" + " "+telefono);
    }

    static class Persona {
        private String nombre;
        private int edad;
        private int telefono;

        public void setTelefono (int telefono){
            this.telefono = telefono;
        }
        public int getTelefono (){
            return this.telefono;
        }

        public void setEdad (int edad) {
            this.edad = edad;
        }
        public int getEdad () {
            return this.edad;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getNombre() {
            return this.nombre;
        }


    }
}