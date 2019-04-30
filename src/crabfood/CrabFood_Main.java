package crabfood;

/**
 *
 * @author Afiq
 */
public class CrabFood_Main {

    public static void main(String[] args) {
        Generator crab = new Generator();
        crab.createMap();
        crab.printMap();
        crab.getOrder();
    }
}
