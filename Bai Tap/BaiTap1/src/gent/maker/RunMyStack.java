package gent.maker;
import java.util.Scanner;
import java.util.Stack;
public class RunMyStack {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println("myStack : " + myStack );
        System.out.println(myStack.size());

        while (!myStack.empty()){

                System.out.println("myStack2: " + myStack.pop());


        }

        Stack<Character> wStack = new Stack<>();
        System.out.println("Nhập vào một dãy chữ : ");
        Scanner sc = new Scanner(System.in);
        String mWord = sc.nextLine();
        char[]chars=mWord.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            wStack.push(chars[i]);
        }
            for (int i = 0; i < chars.length; i++) {
                System.out.println("wStack : " + wStack.pop());
            }
        }
    }

