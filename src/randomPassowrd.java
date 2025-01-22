import java.util.Random;

public class randomPassowrd {
    public static void main(String[] args) {
        Random number = new Random();
        int max = 20;
        String [] letterSymbol = {"a","b","c","d","e","f","g","h","i","l","m","n","o","u","v","z","!","_","-"};
            for(int i = 1; i <=5; i++){
            int numberRandom = number.nextInt(max);    
            String randomText = letterSymbol[numberRandom];
            String randomPassword = (randomText + numberRandom);
            System.out.print(randomPassword);
            }
        }
    }

