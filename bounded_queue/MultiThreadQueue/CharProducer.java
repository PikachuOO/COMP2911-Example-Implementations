public class CharProducer implements Runnable {
    
    private MultiThreadQueue<String> q;
    private int amountOfSubmissions;
    private char data;
    
    public CharProducer(char c, MultiThreadQueue<String> q, int amount) {
        this.data = c;
        this.q = q;
        this.amountOfSubmissions = amount;
    }

    public void run() {
        try {
            int i = 0;
            while (i < amountOfSubmissions) {
                if (!this.q.isFull()) {
                    System.out.format("Adding: %c\n", this.data);
                    q.add("(CHAR) " + i + ": " + this.data);
                    i++;
                }
                Thread.sleep(500);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
