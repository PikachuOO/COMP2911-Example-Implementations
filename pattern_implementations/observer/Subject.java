public class Subject {
    private Observer observers[];
    private int amtObservers;
    private int state;

    public Subject() {
        this.observers = new Observer[10];
        this.amtObservers = 0;
        this.state = 0;
    }

    public void attach(Observer o) {
        this.observers[this.amtObservers] = o;
        this.amtObservers++;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int newState) {
        this.state = newState;
        notifyObservers();
    }

    public void notifyObservers() {
        for (int counter = 0; counter < this.amtObservers; counter++) {
            this.observers[counter].update();
        }
    }
}
