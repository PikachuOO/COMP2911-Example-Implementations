public class AsciiConsumer implements Runnable {
    private MultiThreadQueue<String> q;
    private int amountToAccept;

    public AsciiConsumer(MultiThreadQueue<String> q, int amount) {
        this.q = q;
        this.amountToAccept = amount;
    }

    public void run() {
        try {
            int i = 0;
            System.out.println("consumer is starting");
            while (i < this.amountToAccept) {
                String current = this.q.pop();
                System.out.format("Reading: %s --- size: %d\n", current, this.q.size());
                i++;
                Thread.sleep(300);
            }
        } catch (Exception e) {e.printStackTrace();}
    }
}
