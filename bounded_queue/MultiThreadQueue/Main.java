public class Main {
    public static void main(String[] args) {
        MultiThreadQueue<String> q = new MultiThreadQueue<String>(16);
        // q.setDebug(true);
        final int AMOUNT_CLIENTS_TO_ACCEPT = 200;
        Runnable characterRunner = new CharProducer('x', q, 100);
        Runnable integerRunner = new IntProducer(1, q, 100);
        Runnable consumerRunner = new AsciiConsumer(q, AMOUNT_CLIENTS_TO_ACCEPT);
        Thread one = new Thread(characterRunner);
        Thread two = new Thread(integerRunner);
        Thread three = new Thread(consumerRunner);
        try {
            one.start();
            Thread.sleep(100);
            two.start();
            Thread.sleep(100);
            three.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
