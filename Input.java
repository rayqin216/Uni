import java.util.*;

public class Input
{
    public char acceptCharInput(String Message, int ninput)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(Message);
        String input = console.nextLine();
        return input.charAt(ninput);
    }

    public double acceptDoubleInput(String Message)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(Message);
        Double input = Double.parseDouble(console.nextLine());
        return input;

    }

    public int acceptIntegerInput(String Message)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(Message);
        int input = Integer.parseInt(console.nextLine());
        return input;

    }

    public String acceptStringInput(String Message)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(Message);
        String input = console.nextLine();
        return input;

    }
}
