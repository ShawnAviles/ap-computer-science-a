// Shawn Aviles 4/13/2021

// program tests the Person, Student, Employee, Facutly, and Staff Classes
public class lab11_2 {
    public static void main(String[] args) {
        // create person object
        Person person = new Person("Bob", "5 Wood ave", "1112223333", "bobwood@gmail.com");

        // create employee object
        Employee employee = new Employee("John", "200 Hackensack ave", "5554443333", 
            "johndoe@gmail.com", 102, 100000); 

        // create student object
        Student student = new Student("Shawn", "174 Town street", "2223334444", "shaavi21@bergen.org", 
            Student.SENIOR);
        
        
        // create faculty object
        Faculty faculty = new Faculty("Jacob", "47 Roar street", "6667778888", "jacob47@gmail.com", 
            24, 60000, "9am - 5pm", "Literature Professor");
        
        // create staff object
        Staff staff = new Staff("Bertha", "67 Country road", "2030000000",
			"berthaa56@gmail.com", 38, 70000, "Secretary");

        // display results and exit program
        String result = person.toString() + "\n" +
            employee.toString() + "\n" +
            student.toString() + "\n" + 
            faculty.toString() + "\n" + 
            staff.toString();
        System.out.println(result);
        System.exit(0);
    }
}
