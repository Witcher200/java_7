package Javaaa1_lesson_7;

public class Cat {
    private String name;
    private int appetite;

    public boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }



    public void eat(Plate[] plates) {
        if (satiety){
            System.out.println( "Кот " + name + " не голоден");
        } else {
            for (Plate plate : plates) {
                if (plate.getFoodAmount() >= appetite) {
                    //Если в тарелки достаточно еды для кота
                    plate.decreaseFood(appetite);
                    satiety = true;
                    System.out.println(name + " поел");
                    break;
                }
            }
        }
    }

    @Override
    public String toString(){
        return "Cat{" + name
                + " Сытость: " + satiety +
                '}';
    }

}

