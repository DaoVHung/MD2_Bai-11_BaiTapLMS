import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();
        Stack<String> myStack = new Stack<>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào một dãy từ : ");
        String inputText = sc.nextLine();
        char[] chars = inputText.trim().toUpperCase().replace(" ", "").toCharArray();
        for (char aChar : chars) {
            myQueue.add(String.valueOf(aChar));
            myStack.push(String.valueOf(aChar));
        }
        String check = "";
        while (!myStack.isEmpty()) {
            if (Objects.equals(myStack.pop(), myQueue.remove())) {
                check = " Đối Xứng!";
            } else {
                check = " Không đối xứng!";
            }
        }
        System.out.println(check);
    }
}
