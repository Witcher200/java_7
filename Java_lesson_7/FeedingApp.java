package Java_lesson_7;

public class FeedingApp {

public static void main (String[] args){
    Cat Vaska = new Cat("Vaska", 12);
    Cat Aksel = new Cat("Aksel", 7);
    Cat Matroskin = new Cat("Matroskin", 10);

    Cat[] cats = {Vaska, Aksel, Matroskin};

    Plate plate1 = new Plate(25);
   // Plate plate2 = new Plate(3);
    // Plate plate3 = new Plate(15);

    Plate[] plates = {plate1};//, plate2, plate3};

    for (Cat cat : cats) {
        cat.eat(plates);
        System.out.println(cat);
    }


/* for (int i = 0; i <11; i++) {
        System.out.println(i);
        Vaska.eat(plates);
        Aksel.eat(plates);
        Matroskin.eat(plates);

        System.out.println(plate1);
        System.out.println(plate2);
        System.out.println(plate3);
        System.out.println(Vaska);
        System.out.println(Aksel);
        System.out.println(Matroskin);
    }
*/

    System.out.println(plate1);
  //  System.out.println(plate2);
   // System.out.println(plate3);
    }
}
