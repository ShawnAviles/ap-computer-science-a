public class Student extends Person{
    public final static int FRESHMAN = 1;
	public final static int SOPHOMORE = 2;
	public final static int JUNIOR = 3;
	public final static int SENIOR = 4;
    private int status;

    /** constructs Student Object with specified name, address, phone number, emnail and status */
    public Student(String name, String address, String phone, String email, int status){
        super(name, address, phone, email);
        this.status = status;
    }

    /** setter/ accessor */
    public void setStatus(int status){
        this.status = status; 
    }

    /** getter/ mutator */
    public String getStatus(){
        switch (status) {
            case 1 : return "Freshman"; 
            case 2 : return "Sophomore"; 
            case 3 : return "Junior"; 
            case 4 : return "Senior";
            default : return "Unknown"; 
        }
    }

    /** method returns string discription of class */
    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
}