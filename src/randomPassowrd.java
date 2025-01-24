import java.util.Random;

public class randomPassowrd {
    public static void main(String[] args) {
        Random number = new Random();
            String text = "abcdefghilmnopqrstuvz0123456789-/@!";
            int max = text.length();//cosi da ottenere la lunghezza della stringa
            for(int i = 0; i <= 10; i++){
                int numTest = number.nextInt(max);  
                char charRandom = text.charAt(numTest);
                System.out.print(charRandom);
            }
        }
    }

