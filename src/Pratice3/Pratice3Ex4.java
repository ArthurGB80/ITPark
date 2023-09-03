import java.text.DecimalFormat;
import java.util.Scanner;

public class Pratice3Ex4 {
    public static void main(String[] args) {

        // Este programa calcula o perimetro de um triangulo retangulo

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину первого катета: ");
        double a = sc.nextDouble();

        System.out.println("Введите длину второго катета: ");
        double b = sc.nextDouble();

        DecimalFormat df = new DecimalFormat("#.##");
        double hipotenus = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        String formattedHipotenus = df.format(hipotenus);
        if (formattedHipotenus.contains(",")) {
            formattedHipotenus = formattedHipotenus.replace(",", ".");
        }

        double perimeter = a + b + Double.parseDouble(formattedHipotenus);

        System.out.println("\nДлина первого катета: " + a + ", Длина второго катета: "
                + b + ", Длина гипотенузы: " + Double.parseDouble(formattedHipotenus));

        System.out.println("\nПериметр треугольника равен: " + perimeter);
    }

}
