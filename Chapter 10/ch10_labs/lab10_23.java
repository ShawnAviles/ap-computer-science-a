// Shawn Aviles 2/20/2021

// this program tests the MyString2 Class
public class lab10_23{
    public static void main(String[] args) {
        // create a new MyString2 object
        MyString2 test1 = new MyString2("BergenCountyAcademies");
        MyString2 test2 = new MyString2("Shawn");

        // display result and exit program
        // test compare
		System.out.println("Compare test1 to \"BergenCountyAcademies\":");
		System.out.println(test1.compare("BergenCountyAcademies"));

		// test substring
		System.out.println("\nSubstring beginning at index 11:");
		print(test1.substring(12));

		// test toUpperCase
		System.out.println("\nConvert test2 to upper case:");
		print(test2.toUpperCase());

		// rest valueOf
		System.out.println("\nBoolean true as MyStirng2 object:");
		print(MyString2.valueOf(true)); 
    }

    // display MyString2 object */
	public static void print(MyString2 str) {
		print(str.toChars());
	}

	// method displays arrays
	public static void print(char[] chars) {
		for (int i = 0; i < chars.length; i++) {
			System.out.print(chars[i]);
		}
		System.out.println();
	}
}