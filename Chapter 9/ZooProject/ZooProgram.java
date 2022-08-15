public class ZooProgram {
    public static void main(String[] args){
        Lion leo = new Lion();
        leo.roar();

        Lion leo2 = new Lion("Leo2", 17);
        leo2.introduce();
        leo2.roar();

        Bird parrot = new Bird();
        parrot.chirp();

        Wolf bob = new Wolf();
        bob.howl();
    } //main
} //ZooProgram
