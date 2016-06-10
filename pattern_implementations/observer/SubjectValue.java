public class SubjectValue extends Observer {
    
    private Subject sub;
    
    public SubjectValue(Subject s) {
        this.sub = s;
        this.sub.attach(this);
    }

    public void update() {
        System.out.format("%s", sub.getState());
    }
}
