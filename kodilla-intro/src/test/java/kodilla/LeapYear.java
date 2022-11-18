package kodilla;

public class LeapYear {
    public static void main(String[] args){

        int rok = 2000;
        boolean flag = false;

        if(rok % 400 == 0) {
            flag = true;
        } else if (rok % 100 == 0) {
            flag = false;
        } else if (rok % 4 == 0) {
            flag = true;
        }else {
            flag = false;
        }
        if (flag) {
            System.out.println(rok + " jest rokiem przestepnym");
        }else {
            System.out.println(rok + " nie jest rokiem przestepnym");
        }

        }

    }







