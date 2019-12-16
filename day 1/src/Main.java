import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader((new FileReader("src/input.txt")));
        String module = reader.readLine();

        int sum = 0;
        int mass;
        int fuel = 0;

        while (module != null) {
            mass = Integer.parseInt(module);
            sum += mass / 3 - 2;

            while (mass / 3 - 2 > 0) {
                mass = mass / 3 - 2;
                fuel += mass;
            }

            module = reader.readLine();
        }

        System.out.println(sum);
        System.out.println(fuel);
    }
}
