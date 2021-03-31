package ro.fasttrackit.curs7;

public class DoorMain {
    public static void main(String[] args) {
        Door myDor = new Door();
        myDor.open();
        System.out.println(myDor);
        myDor.unlock();
        myDor.open();
        System.out.println(myDor.isLock());
        System.out.println(myDor.isOpen());
    }
}
