public class SubjectMinusOne extends Observer {
    
    private Subject sub;
    
    public SubjectMinusOne(Subject s) {
        this.sub = s;
        this.sub.attach(this);
    }

    public void update() {
        System.out.format("%s", sub.getState() - 1);
    }
}
