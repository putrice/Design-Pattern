package main;

public class Main {

    public static void main(String[] args) {
        MusicProducer shapeFactory = new MusicProducer();
        Music rock = shapeFactory.getMusic("rock");
        rock.createMusic();
        Music metal = shapeFactory.getMusic("metal");
        metal.createMusic();
        Music pop = shapeFactory.getMusic("pop");
        pop.createMusic();
    }

}
