import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random number between 0 (inclusive) and 100 (exclusive)
        int randomNumber = random.nextInt(9);

        System.out.println(  randomNumber);
    }
}
                