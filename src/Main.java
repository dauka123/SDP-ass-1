public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();
        Object.getInstance();

        System.out.println(human.ido());
        System.out.println(animal.ido());
        Object.showCreature();
    }
}