package Pratice1;
import java.util.Scanner;

public class Pratice1Ex3 {
    public static void main(String[]args){
        System.out.println("Этот программа конвертер температур в градусах Цельсия и градусах Фаренгейта и Кельвина.");
        System.out.println("Введите температуру в градусах Цельсия: ");
        Scanner scanner = new Scanner(System.in);
        double TempInCelsius = scanner.nextDouble();
        scanner.nextLine();

        double TempToFahrenheit = TempInCelsius * 1.8 + 32;
        double TempToKelvin = TempInCelsius + 273.15;
        scanner.close();

        System.out.println("Температура в градусах Цельсия: " + TempInCelsius);
        System.out.println("");
        System.out.println("Температура в градусах Фаренгейта: " + TempToFahrenheit);
        System.out.println("");
        System.out.println("Температура в градусах Кельвина: " + TempToKelvin);


    }
    
}
