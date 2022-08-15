public class Course {
	private String courseName;
	private String[] students = new String[1];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

    /** accessors/ getters */
	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public String getCourseName() {
		return courseName;
	}

    /** method automatically increases array size if there's no room to add */
    public void addStudent(String student) {
		// increase array
        if (numberOfStudents == students.length) {
			String[] temp = new String[students.length + 1];
			for (int i = 0; i < numberOfStudents; i++) {
				temp[i] = students[i];
			}
			students = temp;
		}
        // add student to array and increase number of students
		students[numberOfStudents] = student;
		numberOfStudents++;
	}

    /** method validates if student is in course, returns index if found, otherwise -1 */
	private int findStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				return i;
			}
		}
		return -1;
	}

	/** method deletes a Student using their index in the array */
	private void dropStudent(int index) {
		String[] temp = new String[students.length - 1];
		for (int i = 0, j = 0; i < temp.length; i++, j++) {
			if (i == index) {
				j++;
			}
			temp[i] = students[j];
		}
		this.students = temp;
		numberOfStudents--;
	}

    /** method removes a student from a course using the students name */
	public void dropStudent(String student) {
		int i = findStudent(student);
		if (i >= 0) {
			dropStudent(i);
		}
		else {
			System.out.println(student + " is not in the course, " + courseName);
		}
	}

	/** removes all students from the course */
	public void clear() {
		students = new String[1];
		numberOfStudents = 0;
	}
}