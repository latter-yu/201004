import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 给定一个字符串，你的任务是计算这个字符串中有多少个回文子串（回文串是一个正读和反读都一样的字符串）。
        // 具有不同开始位置或结束位置的回文串，即使是由相同的字符组成，也会被计为是不同的子串。

        // 输入描述:
        // 输入仅包含一个字符串，长度不会超过 1000。
        // 输出描述:
        // 输出仅包含一个非负整数， 代表输入字符串有多少个回文子串。

        // 示例:
        // 输入
        // abc
        // 输出
        // 3
        // 示例
        // 输入
        // aaa
        // 输出
        // 6

        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        //longestPalindrome(s);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                list.add(s.substring(i,j+1));
            }
        }
        int cnt = 0;
        for(String temp : list) {
            if(isPalindrome(temp))cnt++;
        }
        System.out.println(cnt);
    }
    public static boolean isPalindrome(String s) {
        if(s.length() ==  1)
            return true;

        StringBuilder sb = new StringBuilder(s);

        return sb.toString().equals(sb.reverse().toString());
    }
}
