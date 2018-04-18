import java.util.ArrayList;

public class Dispatcher {
    public static void main(String[] args) {
        Ivan ivan = new Ivan();
        StivenHokin stivenHokin = new StivenHokin();
//        init ivan
        ivan.favoriteFood = "Грузинський хліб";
        ivan.language = "Українська";

//        init stivenHokin
        stivenHokin.favoriteFood = "soup through the tubule";
        stivenHokin.language = "10101010";
        stivenHokin.buttonIsPressed = true;

        ArrayList<Human> peoples = new ArrayList<>();
        peoples.add(ivan);
        peoples.add(stivenHokin);

        for (Human p:peoples) {
            p.eat();
            p.speak();
            p.walk();
        }
    }
}
