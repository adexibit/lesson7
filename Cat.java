import sun.text.normalizer.UTF16;

import java.util.Random;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullness;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.fullness =false;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
        this.fullness =true;
    }
    public  void setAppetite(int appetite)
    {
        this.appetite = appetite;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
    public boolean getfullness()
    {
        return fullness;
    }
}

class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int appetite) {
        if (this.food>=appetite)this.food -= appetite;
        else addFood();
    }
    public void addFood(){
        this.food = 100;
        System.out.println("Насыпали");
    }

}

class Main {

    public static void main(String[] args) {
        Cat[] catParty = new Cat[10];
        for (int i = 0; i <catParty.length ; i++) {
            Random rand = new Random();
            StringBuilder strBuild = new StringBuilder();
            for (int j = 0; j <new Random().nextInt(10) ; j++) {
                strBuild.append((char)(rand.nextInt(30)+'а'));
            }

            catParty[i] = new Cat(strBuild.toString(),rand.nextInt(20));

        }
        Plate plate = new Plate( 00);

        for (int i = 0; i <catParty.length ; i++) {
            catParty[i].eat(plate);
            System.out.println(catParty[i].getName() + " ел?:" + catParty[i].getfullness());
        }

        plate.info();





    }
}
