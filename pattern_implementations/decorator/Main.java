public class Main {
    public static void main (String[] args) {
        Liquid coffee = new Coffee();
        Liquid water = new Water();
        Liquid tea = new Tea();
        // describe them!
        coffee.describe();
        water.describe();
        tea.describe();
    }
}
