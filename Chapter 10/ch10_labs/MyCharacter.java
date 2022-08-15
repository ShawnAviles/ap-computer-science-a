public class MyCharacter {
    private char c;

    /** construct character object */
    public MyCharacter(char c) {
        this.c = c;
    }
    
    /** accessor method */
    public char getChar() {
        return c;
    }

    /** method returns boolean whether or not the character is a digit  */
    public static boolean isDigit(char c) {
        return (c >= '0' && c <= '9');
    }

    /** method returns boolean whether or not the character is Lowercase  */
    public static boolean isLowerCase(char c) {
        return (c >= 'a' && c <= 'z');
    }

    /** method returns boolean whether or not the character is Uppercase  */
    public static boolean isUpperCase(char c) {
        return (c >= 'A' && c <= 'Z');
    }

    /** method returns boolean whether or not the character is a letter  */
    public static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z' ) || (c <= 'Z' && c >= 'A');
    }

    /** method returns boolean whether or not the character is a digit or letter */
    public static boolean isLetterOrDigit(char c) {
        return isLetter(c) || isDigit(c);
    }

    /** method returns the character as an Uppercase, or itself if it is not a letter or already uppercase */
    public static char toUpperCase(char c) {
        if (isLowerCase(c)) {
            return (char) (c - 'a' + 'A');
        } else {
            return c;
        }
    }

    /** method returns the character as Lowercase, or itself if it is not a letter or already lowercase */
    public static char toLowerCase(char c) {
        if (isUpperCase(c)) {
            return (char) (c - 'A' + 'a');
        } else {
            return c;
        }
    }

    /** object is needed to call these methods (unlike the previous static ones) */
    /** method returns boolean whether the character is a digit or not */
    public boolean isDigit() {
        return isDigit(c);
    }

    /** method returns boolean whether the character is a letter or not */
    public boolean isLetter() {
        return isLetter(c);
    }

    /** method returns integer comparing the characters' ASCII value */
    public int compareTo(MyCharacter c) {
        return this.c - c.getChar();
    }

    /** method returns boolean comparing the characters */
    public boolean equals(MyCharacter c) {
        return this.c == c.getChar();
    }
}