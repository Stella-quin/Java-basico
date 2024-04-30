import java.util.Scanner;

public class evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        while (nota != -1) {
            System.out.println("escribe la nota que le darias a Matrix: ");
            nota = teclado.nextDouble();

            if (nota != -1){
                mediaEvaluaciones += nota;
                totalEvaluaciones++;
            }
        }
        System.out.println("la media de evaluciones para matrix es: " + mediaEvaluaciones / totalEvaluaciones);
    }
}

