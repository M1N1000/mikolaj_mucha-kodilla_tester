package kodilla;

class Object {
    String name;
    double age;
    double height;

    public Object(String name, double age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public void checkObject(){
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and taller than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }

    public static void main(String[] args){
        Object adam = new Object("Adam", 40.5, 178);
        adam.checkObject();


    }

}
