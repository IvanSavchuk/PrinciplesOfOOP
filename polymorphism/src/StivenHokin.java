public class StivenHokin extends Human {
    String favoriteFood;
    String language;
    boolean buttonIsPressed;

    public void eat() {
        System.out.println("Eat " + favoriteFood);
    }

    public void walk() {
        return;
    }

    public void speak() {
        if (buttonIsPressed) {
            System.out.println("Say something in " + language);
        } else {
            System.out.println("tssssssss");
        }
    }
}