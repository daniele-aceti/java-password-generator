import java.util.Random;

public class randomPassowrd {
    public static void main(String[] args) {
        Random number = new Random();

        //TEST 1
        System.out.println("TEST-1");
        int max = 20;
        String [] letterSymbol = {"a","b","c","d","e","f","g","h","i","l","m","n","o","u","v","z","!","_","-"};
            for(int i = 1; i <=5; i++){
            int numberRandom = number.nextInt(max);    
            String randomText = letterSymbol[numberRandom];
            String randomPassword = (randomText + numberRandom);
            System.out.print(randomPassword);
            }

            System.out.println("");
            System.out.println("TEST-2");



            //TEST 2
            int max2 = 35;
            String text = "abcdefghilmnopqrstuvz0123456789-/@!";
            for(int i = 0; i <= 10; i++){
                int numTest2 = number.nextInt(max2);  
                char charRandom = text.charAt(numTest2);
                System.out.print(charRandom);
            }
        }
    }

