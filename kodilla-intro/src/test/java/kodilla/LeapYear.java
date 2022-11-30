package kodilla;

public class LeapYear {
    public static void main(String[] args){

        int rok = 1900;



        if (rok % 4 ==0 || rok % 100 ==0 || rok% 400 == 0 ){
            System.out.println(rok + " jest rokiem przestepnym");
        }else  {
            System.out.println(rok + " nie jest rokiem przestepnym");
        }

        }

    }







