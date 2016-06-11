public class IntProducer implements Runnable {
    
    private int data;
    private MultiThreadQueue<String> q;
    private int amountOfSubmissions;
    
    public IntProducer(int data, MultiThreadQueue<String> q, int amount) {
        this.data = data;
        this.q = q;
        this.amountOfSubmissions = amount;
    }

    public void run() {
        try {
            int i = 0;
            while (i < this.amountOfSubmissions) {
                if (!this.q.isFull()) {
                    System.out.format("Adding: %d\n", this.data);
                    this.q.add("(INT) " + i + ": " + this.data);
                }
                i++;
                Thread.sleep(500);
            }
        } catch(Exception e) {e.printStackTrace();}
    }
}
