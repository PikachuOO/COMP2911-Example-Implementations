import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Subject s = new Subject();
        Observer minus = new SubjectMinusOne(s);
        Observer normal = new SubjectValue(s);
        Observer plus = new SubjectPlusOne(s);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            s.setState(Integer.valueOf(scanner.nextInt()));
            System.out.format("\n");
        }
    }
}
