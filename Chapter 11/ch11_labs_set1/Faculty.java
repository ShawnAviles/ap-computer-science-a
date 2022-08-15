public class Faculty extends Employee {
	private String officeHours;
	private String rank;

	/** construct Faculty object with specified name, address, phone,
	    email address, office, salary, office hours and rank */
	public Faculty(String name, String address, String phone, String email, 
		int office, double salary, String officeHours, String rank) {
		super(name, address, phone, email, office, salary);
		this.officeHours = officeHours;
		this.rank = rank;
	}

	/** getters/ accessors */
	public String getOfficeHours() {
		return officeHours;
	}

	public String getRank() {
		return rank;
	}

	/** setters/ mutators */
	public void setRank(String rank) {
		this.rank = rank;
	}

	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	}

	/** method returns string discription of class */
	public String toString() {
		return super.toString() + "\nOffice hours: " + officeHours + "\nRank: " + rank;
	}
}