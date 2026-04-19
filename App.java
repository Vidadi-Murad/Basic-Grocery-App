// Basic Grocery App

// Libraries
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args){
     
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); 
        
        // Products && Variables
        double apple = 3.90;
        double banana = 5.20;
        double pear = 2.80;
        double tomato = 9.00;
        double cucumber = 6.80;
        double aplleK;
        double bananaK;
        double pearK;
        double tomatoK;
        double cucumberK;
        double lastResult;
        
        // Labels
        System.out.print("How many kilos of bananas:");
        bananaK = scanner.nextDouble();
        System.out.print("How many kilos of apples:");
        aplleK = scanner.nextDouble();
        System.out.print("How many kilos of pears:");
        pearK = scanner.nextDouble();
        System.out.print("How many kilos of tomato:");
        tomatoK = scanner.nextDouble();
        System.out.print("How many kilos of cucumber:");
        cucumberK = scanner.nextDouble();

        // Operations

        lastResult = (apple * aplleK) + (tomato + tomatoK) + (pear + pearK) + (banana * bananaK) + (cucumber * cucumber);

        // Result
        System.out.println("---------------------------");
        System.out.printf("The Price is: %.2f$\n",lastResult);
        System.out.println("---------------------------");

        scanner.close();

    }
}
