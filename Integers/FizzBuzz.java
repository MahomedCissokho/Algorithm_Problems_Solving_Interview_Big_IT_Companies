import java.util.ArrayList;
import java.util.Scanner;

public class FizzBuzz{
    public static void main(String[] args) {
        ArrayList<String> finalList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter the number of terms: ");
        int numTerms = scanner.nextInt();

        finalList = FizzBuzzSolution(numTerms);

        System.out.println(finalList);

        scanner.close();
    }

    public static ArrayList<String> FizzBuzzSolution(int n) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0)
                list.add("FizzBuzz");
            else if( i % 3 == 0)
                list.add("Fizz");
            else if( i % 5 == 0)
                list.add("Buzz");
            else
                list.add(Integer.toString(i));
        }
        return list;
    }
}