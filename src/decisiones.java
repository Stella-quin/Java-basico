public class decisiones {
    public static void main(String[] args) {

        int fechaDeLanzamiento = 1999;
        boolean IncluidoEnPlan = false;
        double notaDePelicula = 8.2;
        String TipoPlan = "plus";

        if (fechaDeLanzamiento >= 2022){
            System.out.println("Peliculas más populares");
        }
        else {
            System.out.println("Peliculas que aun valen la pena ver");
        }

        if (IncluidoEnPlan || TipoPlan.equals("plus")){
            System.out.println("Dsifrute de su peli");
        }
        else {
            System.out.println("Pelicula no disponible para su plan");
        }
    }
}
