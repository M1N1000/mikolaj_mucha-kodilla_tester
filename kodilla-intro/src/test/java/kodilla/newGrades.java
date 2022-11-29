package kodilla;

public class newGrades {
    public static void main(String[] args){
        Grades grades = new Grades();
        grades.add(3);
        grades.add(2);
        grades.add(5);
        grades.add(2);
        grades.add(2);
        grades.add(5);
        System.out.println(grades.lastGrade());
        System.out.println(grades.avarges());

    }
}
