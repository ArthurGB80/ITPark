public class Pratice5Ex1 {

    public static void main(String[] args) {
        
        double km = 10;
        System.out.println(String.format("The Distance in the day 1 is 10,00 km"));

        for (int i = 1; i <= 9; i++) {
            km = km + (km * 0.1);
            System.out.println(String.format("The Distance in the day %d is %.2f km", i+1, km));
                
        }   
        
        System.out.println("");
        System.out.println(String.format("Total Distance: %.2f km " , km));
    }
        
}
