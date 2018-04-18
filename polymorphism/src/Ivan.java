public class Ivan extends Human {
    String favoriteFood;
    String language;

    public void eat() {
        System.out.println("Люблю їсти " + favoriteFood);
    }

    public void walk() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Run Ivan run");
        }
    }

    public void speak() {
        System.out.println("Говоріть державною мовою!");
        System.out.println("Найкраща мова - " + language);
    }
}