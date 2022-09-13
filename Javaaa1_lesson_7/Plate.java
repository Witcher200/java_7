package Javaaa1_lesson_7;

public class Plate {
    private int foodAmount;

    public Plate(int foodAmount){
        this.foodAmount = foodAmount;
    }
    public void addFood(int amount){
        // Добавляет еду в тарелку
        foodAmount += amount;
    }

    public void decreaseFood(int amount){
        foodAmount -= amount;
    }

    @Override
    public String toString(){
        return "Plate{" +
                "foodAmount=" + foodAmount +
                '}';
    }

    public void info() {
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}
