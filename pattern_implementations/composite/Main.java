public class Main {
    public static void main (String[] args) {
        Assembly car = new Car();
        car.addAssembly(new Body());
        for (int wheelCount = 0; wheelCount < 4; wheelCount++) {
            car.addAssembly(new Wheel());
        }
        car.addAssembly(new Engine());
        car.addAssembly(new Glass());
        Interior inside = new Interior();
        inside.addAssembly(new Seat());
        inside.addAssembly(new Seat());
        System.out.format("%s\n", inside.toString());
        car.addAssembly(inside);
        System.out.format("%s\n", car.toString());
    }
}
