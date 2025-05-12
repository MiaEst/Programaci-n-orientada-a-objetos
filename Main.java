public class Main {
    public static void main(String[] args) {
      //Usuarios
      usuario usuario1 = new usuario("Mia Estrada", "Estrada C", 16, 2008);
      usuario usuario2 = new usuario("Christopher", "Fonseca", 16, 2008);
    //Métodos del objeto
    usuario1.setNombre("Nelson");
    usuario1.mostrarDatos();
    usuario2.mostrarDatos();

    System.out.println(usuario1.getEdad());
    System.out.println(usuario1.getNombre());
    System.out.println(usuario1.getApellidos());
    System.out.println(usuario1.getNacimiento());

    if (usuario1.getEdad() >= 18){
      System.out.println("Mayor de Edad");
    }
    }}