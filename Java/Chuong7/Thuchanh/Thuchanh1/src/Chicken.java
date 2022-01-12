public class Chicken extends Animal implements Edible{
    @Override
    public String makeSound() {
        return "CLuck - Cluck";
    }

    @Override
    public String howToEat() {
        return "Could be Fried";
    }
}
