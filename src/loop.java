import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("escribe la nota que le darias a Matrix: ");
            nota = teclado.nextDouble();
            mediaEvaluaciones = mediaEvaluaciones + nota;
        }
        System.out.println("la media de evaluciones para matrix es: "+ mediaEvaluaciones / 3);
    
    }
}
