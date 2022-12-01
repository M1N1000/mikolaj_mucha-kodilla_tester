package kodilla;

public class LeapYear {
    public static void main(String[] args) {

        int rok = 2000;


        if (rok % 4 == 0) {
            if (rok % 100 == 0) {
                if (rok % 400 == 0) {
                    System.out.println(rok + " jest rokiem przestepnym");


                } else {
                    System.out.println(rok + " nie jest rokiem przestepnym");
                }

            }

        }
    }
}







