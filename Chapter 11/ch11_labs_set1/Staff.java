public class Staff extends Employee {
	private String title;

	/** Construct a Staff object */
	public Staff(String name, String address, String phone, String email, int office, double salary, String title) {
		super(name, address, phone, email, office, salary);
		this.title = title;
	}

	/** getter/ accessor */
	public String getTitle() {
		return title;
	}

	/** setter/ mutator */
	public void setTitle(String title) {
		this.title = title;
	}

	/** method returns string discription of class */
	public String toString() {
		return super.toString() + "\nTitle: " + title;
	}
}