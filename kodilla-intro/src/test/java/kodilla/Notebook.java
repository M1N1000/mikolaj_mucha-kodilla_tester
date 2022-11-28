package kodilla;

public class Notebook {
    int weight;
    int price;

    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public  void checkPrice(){
        if (this.price < 600) {
            System.out.println("This notebook is  very cheap.");
        }else if (this.price  > 600 || this.price < 1000) {
            System.out.println("The price is good.");
        } else if (this.price > 1000){
            System.out.println("This notebook is expensive.");
        }
    }
    public void checkWeight() {
        if (this.weight < 800) {
            System.out.println("This notebook is light");
        } else if (this.weight > 800 || this.weight < 1500) {
            System.out.println("This notebook is medium weight");
        } else if (this.weight > 1500) {
            System.out.println("This notebook is heavy");
        }
    }

    public void checkQuality(){
        if (this.price > 2000 || this.year < 2010) {
            System.out.println("This notebook is inviable.");
        } else if (this.price > 1200 || this.year > 2010) {
            System.out.println("This notebook is viable.");
        } else if (this.price <1200 || this.year > 2018) {
            System.out.println("This notebook is the most viable");
        }else {
            System.out.println("This notebook is ok");
        }



    }


    }













