public class Lion{
    private String name;
    private int age;
    
    // constuctors
    Lion(String newName, int newAge){
        name = newName;
        age = newAge;
    }

    Lion(){
        name = "";
        age = 0;
    }

    // methods
    public void introduce(){
        System.out.println("Hello everyone, my name is " + name + " and I am a " + age + "-year-old Lion at the zoo");
    } //introduce()
    
    public void roar(){
        System.out.println("Roar! Roar!");
    } //roar()
} //Lion