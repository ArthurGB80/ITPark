public class ItPark_2023_05_13 {
    public static void main(String[] args) {
       /* 
        int a = 5, b = -3, c = 0;
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(c);
        }
        if (b > c) {
            System.out.println(c);
        } else {
            System.out.println(b);
        }
    }*/



        /*
        short sYear = 2023;
        byte sMonth = 5;
        short rYear = 2000;
        byte rMonth = 9;
        int vorzrast = rMonth > sMonth
                ? sYear - rYear - 1
                : sYear - rYear;

        System.out.println(vorzrast);*/

 /*
        int vozrast = sYear - rYear;
        if (rMonth > sMonth) vozrast--;
        System.out.println();
 */

        /*
        short n = 256;
        n %= 7;
        if (n == 6 || n == 7)
            System.out.println("выходно");
        else
            System.out.println("rabotoi day"); */

//        byte n = 3;
//        switch (n) {
//            case 12:
//                case 1;
//        }

        /*
        int i;
        for (i = 0; i < 10; i++) {
            if (i == 5) continue; // break; // return; // agora entendi!
            System.out.println(i + "");
        }
        System.out.println(i);

         */

//        Scanner scanner = new Scanner(System.in);

//        int n;
//        while (true) {
//            n = scanner.nextInt();
//            System.out.println(n);
//            if (n == 0) break;
//        }


//        int n; // mais bonito esse do que o de cima, por causa do break
//        do {
//            n = scanner.nextInt();
//            System.out.println(n);
//        }
//        while (n != 0);

//        int n = 276;
//        System.out.println(276 / 10); // qual a diferenca
//        System.out.println(n / 100);
//
//        System.out.println(276 % 10);
//        System.out.println(n % 100 / 10);
//        System.out.println(n / 10 % 10);
//
//        System.out.println(276 % 10);
//        System.out.println(n % 10);


//        int n = 276; // 0
//        n =Math.abs(n); //if (n < 0) n++; // verificacao
//        while (n > 0)
//        {
//            System.out.println(n % 10);
//            n /= 10;
//        }


//        int n = 123456;
//        n =Math.abs(n); //if (n < 0) n++; // verificacao
//        do
//        {
//            System.out.println(n % 10);
//            n /= 10;
//        }
//        while (n > 0);

//
//        Scanner scanner = new Scanner(System.in);
//        final int size = 4;
//        int[] n = new int[size]  ;  // int n[];
//        for (int i = 0; i < size; i++) {
//            n[i] = scanner.nextInt();
//        }


//        Scanner scanner = new Scanner(System.in);
//
//        int[] n = new int[4];
//        for (int i = 0; i < n.length; i++) {
//            n[i] = scanner.nextInt();
//        }

//        Scanner scanner = new Scanner(System.in);
//
//        int[] n = new int[4];
//        for (int i = 0; i < n.length; i++) {
//            n[i] = i + 1;
//            System.out.println(n[i]);
//        }
        // System.out.println(n); // output [I@17a7cec2 // [I array type integer
        // int 4 byte


//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println(scanner);
//        int[] n = new int[4];
//        for (int i = 0; i < n.length; i++) {
//            n[i] = random.nextInt();
//            System.out.println(n[i]);
//        }

//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println(scanner);
//        int[] n = {1, 2, 3, 4};
//        for (int i = 0; i < n.length; i++) {
//           // n[i] = random.nextInt();
//            System.out.println(n[i]);
//        }


//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println(scanner);
//
//        int [][] a = new int[2][];
//        a[0] = new int[5];
//        a[1] = new int[2];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = random.nextInt(10); // random.nextInt(5, 10)
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();


//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println(scanner);
//        int [][] a =
//                {{7, 2, 5, 9, 4},
//                        {2},
//                        {12,3}};
//
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//               System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }


//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println(scanner);
//
//        int [][] a = new int[7][7];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = random.nextInt(10); // random.nextInt(5, 10)
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if (i == j)
//                    System.out.print(a[i][j] + " ");
//            }
//        }
//        System.out.println();
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                if (i + j == a.length - 1)
//                    System.out.print(a[i][j] + " ");
//            }
//        }


//
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println(scanner);
//
//        int [][] a = new int[7][7];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = random.nextInt(10); // random.nextInt(5, 10)
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        int[][] b = new int[7][7];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                b[i][j] = a[j][i];
//                    System.out.print(b[i][j] + " ");
//            }
//            System.out.println();
//        }


//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        System.out.println(scanner);
//
//        int [][] a = new int[7][7];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = random.nextInt(10); // random.nextInt(5, 10)
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < a.length; i++) {
//            for (int j = a[i].length -1; j > -1; j--) {
//                a[i][j] = a[j][i];
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }


//
//        Scanner scanner = new Scanner(System.in); // igual a situacao de cima
//        Random random = new Random();
//        System.out.println(scanner);
//
//        int [][] a = new int[7][7];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = random.nextInt(10);
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int i = 0; i < a.length; i++) {
//            for (int j = a[i].length; j > 0; j--) {
//                a[i][j] = a[j][i];
//                System.out.print(a[i][j - 1] + " ");
//            }
//            System.out.println();
//        }


//        Scanner scanner = new Scanner(System.in); // igual a situacao de cima
//        Random random = new Random();
//        System.out.println(scanner);
//
//        int [][] a = new int[7][7];
//        // int max = 0, min = 0;
//        int max = Integer.MIN_VALUE; // deve ser feito assim
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = random.nextInt(10,100);
//                System.out.print(a[i][j] + " ");
//                if (a[i][j] > max)
//                    max = a[i][j];
//                if (a[i][j] < min)
//                    min = a[i][j];
//            }
//            System.out.println();
//        }
//
//        System.out.println("\n" + max);
//        System.out.println("\n" + min);


/*
          Scanner scanner = new Scanner(System.in);
          char[] c = {'s', 't', 'r', 'i', 'n', 'g' };
          String s = "string";
          // c = s; assim nao funciona
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
              }
        System.out.println();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println("a" + 1);

          s = Arrays.toString(c);  // =
          s = String.valueOf(c);  // =
          c = s.toCharArray();   // =

 */

 /*
        Scanner scanner = new Scanner(System.in);
        Object o = new Object();
        // o.equals(null); // tentar entender o processo // nao entendi na aula (hashCode?)
        System.out.println(o.hashCode());
        String s1 = "string";
        String s2 = "string";
        String s3 = scanner.nextLine();
//        System.out.println(s1 == s2); // true
  //      System.out.println(s1 == s3); // false // pq o output e diferente? essa eh uma pergunta que pode ter em entrevistas

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));  // para evitar erros o melhor eh sempre usar .equals()
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

        // objetos sempre devem ser utilizados com .equals()... nao entendi completamente
        // qual o prolema java tem com datas e tempo?

        */
    }


}






