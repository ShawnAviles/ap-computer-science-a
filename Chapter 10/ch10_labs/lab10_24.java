// Shawn Aviles 2/20/2021

// this program tests the MyCharacter Class
public class lab10_24 {
    public static void main(String[] args) {
        // create character object
        MyCharacter test = new MyCharacter('c');
        
        // display result and exit program
        String result = "character = " + test.getChar() + 
        "\nIs leter?: " + test.isLetter() + 
        "\nIs digit?: " + test.isDigit() + 
        "\nEquals 'c'?: " + test.equals(new MyCharacter('c')) +
        "\nCompare to 'c': " + test.compareTo(new MyCharacter('c'));
        System.out.println(result);
        System.exit(0);
    }
}
