// Shawn Aviles 3/21/2021

// program tests the revised Course Class 
public class lab10_9 {
    public static void main(String[] args) {
        // create course
        Course APCompSci = new Course("AP Computer Science AB");

        // add three students
        APCompSci.addStudent("Shawn");
        APCompSci.addStudent("John");
        APCompSci.addStudent("Bob");

        // remove one student
        APCompSci.dropStudent("John");

        // display results and exit program
        System.out.println("The students in " + APCompSci.getCourseName() + ":");
        for (int i = 0; i < APCompSci.getStudents().length; i++){
            System.out.println(APCompSci.getStudents()[i]);
        }
        System.exit(0);
    }
}
