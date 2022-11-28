package kodilla;

public class FirstCalss{
    public static void main(String[] args){
        Notebook heavyNotebook = new Notebook(2000,1500, 2015 );
        System.out.println("heavyNotebook");
        System.out.println(" weight: " +heavyNotebook.weight);
        System.out.println(" price " + heavyNotebook.price);
        System.out.println(" year " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkQuality();
        System.out.println("  ");



        Notebook oldNotebook = new Notebook(1200, 2200, 2000);
        System.out.println("oldNotebook");
        System.out.println(" weight: " + oldNotebook.weight);
        System.out.println(" price " + oldNotebook.price);
        System.out.println(" year " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkQuality();
        System.out.println("  ");

        Notebook notebook = new Notebook(600,1000, 2022 );
        System.out.println("Notebook");
        System.out.println(" weight: " + notebook.weight);
        System.out.println(" price " + notebook.price);
        System.out.println(" year " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkQuality();






        }

   }


