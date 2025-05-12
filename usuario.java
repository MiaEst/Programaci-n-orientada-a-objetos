public class usuario {

    //Propiedades del 
     String nombre;
    static String apellidos;
    static int edad;
    static int fechaNacimiento;

    public usuario(String nombre, String apellidos, int edad, int fechaNacimiento) {
        this.nombre= nombre;
        this.apellidos= apellidos;
        this.edad= edad; 
        this.fechaNacimiento= fechaNacimiento;
    }

    //métodos gets
    public int getEdad(){
        return this.edad;
    }
    public int getNacimiento(){
        return this.fechaNacimiento;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellidos(){
        return this.apellidos;
    }

    //Métodos sets
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public static void setApellidos(String apellidos) {
        usuario.apellidos = apellidos;
    }
    public static void setEdad(int edad) {
        usuario.edad = edad;
    }
    public static void setFechaNacimiento(int fechaNacimiento) {
        usuario.fechaNacimiento = fechaNacimiento;
    }
    //metodos 
    public void mostrarDatos () {
        System.out.println("Nombre :" + nombre);
        System.out.println("Apellidos:" + apellidos);
        System.out.println("Edad: " + edad);
    System.out.println("Fecha de Nacimiento" + fechaNacimiento);
        
    

    }







} 