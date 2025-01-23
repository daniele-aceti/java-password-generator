import java.util.Random;

public class randomPassowrd {
    public static void main(String[] args) {
        Random number = new Random();
            int max = 35;
            String text = "abcdefghilmnopqrstuvz0123456789-/@!";
            for(int i = 0; i <= 10; i++){
                int numTest = number.nextInt(max);  
                char charRandom = text.charAt(numTest);
                System.out.print(charRandom);
            }
        }
    }

