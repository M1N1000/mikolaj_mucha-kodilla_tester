package kodilla;

public class FirstCalss{
    public static void main(String[] args){
        Notebook heavyNotebook = new Notebook(2000,800 );
        System.out.println("heavyNotebook weight: " +heavyNotebook.weight);
        System.out.println("heavyNotebook price " + heavyNotebook.price);
        heavyNotebook.checkPrice();

        Notebook oldNotebook = new Notebook(1200, 300);
        System.out.println("oldNotebook weight: " + oldNotebook.weight);
        System.out.println("oldNotebook price " + oldNotebook.price);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price );
        oldNotebook.checkPrice();

        Notebook notebook = new Notebook(600,1000 );
        System.out.println("notebook weight: " + notebook.weight);
        System.out.println("notebook price " + notebook.price);
        notebook.checkPrice();





        }

   }


