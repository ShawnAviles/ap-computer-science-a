public class Person {
	private String name = "Unknown";
	private String address = "Unknown";
	private String phone = "Unknown";
	private String email = "Unknown";

	/** default Person object constructor */
	public Person() {
	}

	/** construct Person object with specified name, address, phone and email */
	public Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	} 

	/** getter/ accessor methods */
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public String getEmail() {
		return email;
	}

    /** setters/ mutator methods */
	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	/** method returns string discription of class */
	public String toString() {
		return "\nName: " + name + "\nAddress: " + address + "\nPhone number: " + phone + "\nEmail address: " + email;
	}
}