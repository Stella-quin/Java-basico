public class Main {
    public static void main(String[] args){
        System.out.printf("Bienvenido a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean IncluidoEnPlan = true;
        double notaDePelicula = 8.2;
        double media = (9.2 + 3.5 + 8 + 4.3)/4;

        System.out.printf("Matrix es una paradoja. la mejor pelicula del fin del milenio. fue lanzada en: %d%n", fechaDeLanzamiento);

        int calificacion = (int) (media / 2);
        System.out.printf("el numero de estrellas son %d%n", calificacion);
    }
}

