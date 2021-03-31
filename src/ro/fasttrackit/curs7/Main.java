package ro.fasttrackit.curs7;

public class Main {
    public static void main(String[] args) {
        Clock myClock = new Clock(18,54);

        System.out.println(myClock.readTime());
        System.out.println(myClock.getHour());
        System.out.println(myClock.getMinutes());
        myClock.setMinutes((myClock.getMinutes() + 1));
        System.out.println(myClock.getMinutes());


        Clock secondClock = new Clock(10);
        System.out.println(secondClock.readTime());
        System.out.println(secondClock.readTime());

        Clock brokenClock = new Clock(99, 99);
        System.out.println(brokenClock.readTime());
        brokenClock.setMinutes(-9);
        System.out.println(brokenClock.readTime());


        secondClock.addMinutes(10);
        System.out.println(secondClock.readTime());
        secondClock.addMinutes(60);
        System.out.println(secondClock.readTime());
        System.out.println(Clock.TIP);




    }

}
