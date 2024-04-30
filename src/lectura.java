import java.util.Scanner;

public class lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Cual es su peli favorita?");
        String pelicula = teclado.nextLine();

        System.out.println("ahora escribe su fecha de lanzamiento");
        int fechaDeLanzamiento = teclado.nextInt();

        System.out.println("dinos qué calificacón le dar a la peli");
        double calificacion = teclado.nextDouble();

        System.out.println("pelicula");
        System.out.println("fechaDeLanzamiento");
        System.out.println(calificacion);
  ;  }
}
