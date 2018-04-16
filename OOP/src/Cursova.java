public class Cursova {
    private String name;
    private int x;

    public Cursova(String name, int x) {
        this.name = name;
        this.x = x;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void status(String name,int x){
        if (x > 6){
            System.out.println(name + " " + "Здав!");
        } else {
            System.out.println(name + " " + "Не здав!");
        }
    }
}

