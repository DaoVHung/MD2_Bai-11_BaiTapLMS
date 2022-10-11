import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> aStack = new Stack<>();
        Stack<Character> bStack = new Stack<>();
        System.out.println("Nhập vào 1 biểu thức : ");
        String inputText = sc.nextLine();
        char[]chars=inputText.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if('(' == chars[i]){
                aStack.push(chars[i]);
            }
            if (chars[i]==')'){
                bStack.push(chars[i]);
            }
        }
        String check = "";
            if (aStack.size()==bStack.size()){
                check= "Biểu thức đúng !";
            }else {
                check = "Biểu thức sai !";
            }
        System.out.println(check);
        }
    }
