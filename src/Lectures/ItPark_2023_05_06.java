package Lectures;

public class ItPark_2023_05_06 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        byte b = scanner.nextByte();
//        System.out.println(b);

        /*
        int i = 0;
        if (i > 0)//; // se eu tenho um ";" depois do if eu mudo a maneira que o codigo segue.
            System.out.println(1);
        System.out.println(2);*/

//        int i = 0;
//        if (i > 0) //Dessa maneira eh mais adequado escrever
//            System.out.println(1);
//        else
//            System.out.println(2);

//        int i = 0;
//        if (i > 0) { //existe diferenca colocando o bloco de operacao // professor aconselhou sempre usar "{"
//            System.out.println(1);
//            System.out.println(2);
//        } //{
//        else {
//            System.out.println(3);
//            System.out.println(4);
//        } //}
//
//        int i = 1; // fez exemplos mudando o valor de i
//        if (i > 0)
//            System.out.println(1);
//        if (i > 1)
//            System.out.println(2);
//        else
//            System.out.println(3);
//        System.out.println(4);


//        int i = 0; // fez exemplos mudando o valor de i
//        if (i > 0) { // {
//            System.out.println(1);
//            if (i > 1)
//                System.out.println(2);
//        } //}
//        else
//            System.out.println(3);
//        System.out.println(4);


//        byte i = new Scanner(System.in).nextByte(); // adicionando o return fica otimizado
//        if (i <1 || i > 7)
//        {
//            System.out.println("number not correct");
//            return;
//        }
//        if (i == 1) { // tem que colocar as chaves
//            System.out.println("Monday");
//            return;
//        }
//        if (i == 2){
//            System.out.println("Tuesday");
//            return;
//        }
//        if (i == 3) {
//            System.out.println("Wednesday");
//            return;
//        }
//        if (i == 4) {
//            System.out.println("Thursday");
//            return;
//        }
//        if (i == 5) {
//            System.out.println("Friday");
//            return;
//        }
//        if (i == 6) {
//            System.out.println("Saturday");
//        }
//        if (i == 7) {
//            System.out.println("Sunday");
//            return;
//        }
//        System.out.println("Program completed");

/*
        byte i = new Scanner(System.in).nextByte();
        switch (i) { // nao funciona com variavel tipo long
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not correct number");
        }
        System.out.println("The End");
    }*/


//        for (int i = 0; i < 10; i++) {
//            System.out.print(i);
//        }
//        System.out.println();


//        for (; ; ) { // sem fim
//            System.out.println("*");
//            break;


//        int i;
//        for (i = 0; i < 10; i++) {
//            System.out.print(i);
//        }
//        System.out.println();
//        System.out.println(i);


//        int i = 0; // podemos fazer assim tbm
//        for (; i < 10; i++) { // nao posso retirar o ;
//            System.out.print(i);
//        }
//        System.out.println();
//        System.out.println(i);

//
//        int i = 0;  // da para escrever assim, mas nao eh o padrao e nao deve ser feito assim
//        for (;;) {
//            System.out.print(i++);
//            if (i > 9) break;
//        }
//        System.out.println();
//        System.out.println(i);


//        int i = 0;  // da para escrever assim, mas nao eh o padrao e nao deve ser feito assim tambem
//        for (;;) {
//            System.out.print(i);
//            if (++i > 9) break;
//        }
//        System.out.println();
//        System.out.println(i);


        //    int s = 0;
        //    for (int i = 0; i < 101; i++) {
        //        s += i;
        //    }
        //    System.out.println(s);


//        double s = 1; // nem o long funciona aqui precisa usar o double por causa da notação cientifica
//        for (int i = 1; i < 101; i++) {
//            s *= i;
//        }
//        System.out.println(s);


        for (int i = 1; i < 10; i++) {     // __4
            for (int j = 1; j < 10; j++)   // _72
                //System.out.print(i * j + " ");
                //System.out.print("\t" + i * j);
                System.out.printf("%3s", i * j);
            System.out.println();
        }


        //    int i = 1;
        //    while (i < 10)
        //        System.out.print(i++ + " ");

        //    int i = 1;
        //    while (i < 10)
        //        System.out.println(i + " ");
        //    i++;

        //    int i = 1;
        //    while (i < 10) {
        //        System.out.print(i + " ");
        //        i++;
        //    }
//        System.out.println();

//        int j = 1; // a mesma coisa q o de cima
//        do {
//            System.out.print(j + " ");
//            j++;
//        }
//        while (j<10);


        //    Random random = new Random();
        //    int n, s = 0;
        //    while (s < 100) {
        //        n = random.nextInt(101);
        //        System.out.print(n + " ");
        //        s += n;
        //    }
        //    System.out.println(s);

        // Random random = new Random();
        // int n, s = 0;
        // do {
        //     n = random.nextInt(101);
        //     System.out.print(n + " ");
        //     s += n;
        // }
        // while (s < 100);
        // System.out.println(s);

    }

}








