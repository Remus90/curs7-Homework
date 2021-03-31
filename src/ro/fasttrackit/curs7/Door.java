package ro.fasttrackit.curs7;

public class Door {
    private boolean open;
    private boolean lock;

    public Door() {
        this.open = false;
        this.lock = true;
    }

    public void open() {
        if (lock) {
            System.out.println("Usa este incuiata, nu se poate deschide");
        } else {
            this.open = true;

        }
    }

    public void close() {
        this.open = false;
    }

    public void lock() {
        if (open) {
            System.out.println("Usa este deschisa nu poate fi incuiata");
        } else {
            this.lock = true;
        }
    }
    public void unlock(){
        this.lock = false;
    }
    public boolean isOpen(){
        return open;
    }
    public boolean isLock(){
        return lock;
    }
    
}