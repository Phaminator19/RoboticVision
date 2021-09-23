import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public App() {
    }

    public static void main(String[] args) {
        try {
            File input = new File("input.txt");
            Scanner data_file = new Scanner(input);

            while(data_file.hasNextLine()) {
                String line_string = data_file.nextLine();
                String[] parts = line_string.split(" ");
                int age = Integer.parseInt(parts[0]);
                double height = Double.parseDouble(parts[1]);
                System.out.println("This is " + age + " and " + height + "\n");
            }

            data_file.close();
        } catch (FileNotFoundException var8) {
            var8.printStackTrace();
        }

    }

    public int distance_between_two_persons(int x_1, int x_2, int y_1, int y_2) {
        return Math.abs(x_1 - x_2) + 10 * Math.abs(y_1 - y_2);
    }
}