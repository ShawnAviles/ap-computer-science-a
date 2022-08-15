public class MyString2 {
    private String s;
    
    /** construct string object */
    public MyString2(String s){
        this.s = s;
    }

    /** method returns integer >, <, or == to 0 indicating how another string compares to s */
    public int compare(String s){
        int comparison = 0;
		
        // offset comparison value if Strings are not same length
        if (this.s.length() < s.length())
			comparison = -1;
		if (s.length() < this.s.length())
			comparison = 1; 

        // compare string character by character
		for (int i = 0; i < this.s.length(); i++) {
            if (this.s.charAt(i) > s.charAt(i))
				comparison = i + 1;
			if (this.s.charAt(i) < s.charAt(i))
				comparison = -(i + 1);
		}
		return comparison;
    }

    /** method returns new MyString2 object that is substring beginning with specified index */
    public MyString2 substring(int begin){
        String sub = "";
        // create new string adding the needed characters to it
		for (int i = begin; i < s.length(); i++) {
			sub += s.charAt(i) + "";
		}
		return new MyString2(sub);
    }
    
    /** method returns new MyString2 object that is the string but all uppercase */
    public MyString2 toUpperCase(){
        String upper = "";
		// go through string and captilize each letter character by character
        // unless not a letter or already uppercase
        for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') 
                upper += String.valueOf((char)(s.charAt(i) - 32));
			else upper += String.valueOf(s.charAt(i));
		}
		return new MyString2(upper);
    }

    /** method returns an array of characters*/
    public char[] toChars(){
        char[] chArray = new char[s.length()];

		for (int i = 0; i < s.length(); i++) {
			chArray[i] = s.charAt(i);
		}
		return chArray;
    }

    /** method returns boolean value as a new MyString2 Object */
    public static MyString2 valueOf(boolean b){
        return b ? new MyString2("true") : new MyString2("false");
    }
}
