package Pratice3;

import java.text.DecimalFormat;

public class Pratice3Ex1 {
    public static void main(String[] args) {
        double e = Math.E;
        DecimalFormat dfe = new DecimalFormat("#.##");
        System.out.println("e = " + dfe.format(e));

        double pi = Math.PI;
        DecimalFormat dfPi = new DecimalFormat("#.###");
        System.out.println("pi = " + dfPi.format(pi));
    }
}
