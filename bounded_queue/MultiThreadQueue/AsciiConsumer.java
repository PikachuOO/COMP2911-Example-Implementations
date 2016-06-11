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
            while (i < this.amountToAccept) {
                String current = this.q.pop();
                System.out.format("Reading: %s\n", current);
                i++;
                Thread.sleep(600);
            }
        } catch (Exception e) {e.printStackTrace();}
    }
}
