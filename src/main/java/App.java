import java.util.InputMismatchException;

public class App
{
    public static void main(String[] args) {

        try{
            Calculator.startCalculator();
        } catch (InputMismatchException e){
            System.out.println("\nYou pass wrong numbers");
        }
    }
}
