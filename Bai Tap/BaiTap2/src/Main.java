import java.awt.*;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String , Integer> treeMap = new TreeMap<>();
        System.out.println("Nhập một dãy chữ ! : ");
        String word = sc.nextLine();
        String[]strings= word.split("\\s");
        for (int i = 0; i < strings.length; i++) {
            if(treeMap.containsKey(strings[i])){
                treeMap.put(strings[i],treeMap.get(strings[i])+1);
            }else {
                treeMap.put(strings[i], 1);
            }
        }
        System.out.println(treeMap);
    }
}