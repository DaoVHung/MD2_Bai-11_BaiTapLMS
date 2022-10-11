import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 1 số : ");

        Stack<Integer> stack = new Stack<>();
        int inputNumber = Integer.parseInt(sc.nextLine());
        System.out.print("Dãy nhị phân của dãy " + inputNumber + " là : ");
        int balance;
        do {
            balance = inputNumber % 2;
            stack.push(balance);
            inputNumber=inputNumber/2;
        } while ( inputNumber > 0);

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}