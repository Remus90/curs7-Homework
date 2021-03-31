package ro.fasttrackit.curs7;

public class Bottle {
    private int totalCapacity;
    private int availableLiquid;
    private boolean open;

    public Bottle(int totalCapacity, int availableLiquid, boolean open) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.open = open;
    }

    public boolean moreLiquid() {
        if (availableLiquid > totalCapacity) {
            return true;
        } else return false;
    }

    public int getAvailableLiquid() {

        return availableLiquid;
    }

    public int emptyCapacity() {

        return totalCapacity - availableLiquid;
    }

    public String openBottle() {
        open = true;
        return "Bottle is opened";
    }

    public String closeBottle() {
        open = false;
        return "Bottle is closed";

    }

    public void setAvailableLiquid(int availableLiquid) {
        this.availableLiquid = availableLiquid;
    }

    public int drinksLiquid(int drink) {
        int drinkamount = availableLiquid - drink;
        setAvailableLiquid(drinkamount);
        return drinkamount;
    }

    public static void main(String[] args) {
        Bottle Bottle1 = new Bottle(100, 100, false);
        System.out.println(Bottle1.drinksLiquid(30));
        System.out.println(Bottle1.drinksLiquid(30));
        System.out.println(Bottle1.moreLiquid());
        System.out.println(Bottle1.getAvailableLiquid());
        System.out.println(Bottle1.emptyCapacity());
        System.out.println(Bottle1.closeBottle());
    }
}
