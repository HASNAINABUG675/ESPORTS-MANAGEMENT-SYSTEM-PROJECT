public class Player {
    private String name;
    private int age;

    public Player(String name, int age) throws InvalidInputException {
        if (age <= 0) {
            throw new InvalidInputException("Invalid Input");
        }

        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Player: " + name + " | Age: " + age);
    }
}
