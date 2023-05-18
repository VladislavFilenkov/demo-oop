public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();

        Tail tail1 = new Tail();
        tail1.isTail = true;
        tail1.lenght = 30;
        tail1.color = "red";
        animal1.tail = tail1;

        Paw paw1 = new Paw();
        paw1.fingers = 5;
        paw1.color = "red";
        animal1.paw = paw1;
    }
}
