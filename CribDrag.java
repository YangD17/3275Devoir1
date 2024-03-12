import java.util.ArrayList;
import java.util.Scanner;

public class aaaaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String asdf = input.nextLine();
        ArrayList<Character> string1 = new ArrayList<>();
        ArrayList<Character> string2 = new ArrayList<>();
        ArrayList<Character> string3 = new ArrayList<>();
        while (!asdf.equals("asdf")) {
            for (char c : asdf.toCharArray()) {
                if (c == '1') {
                    string1.add('1');
                }
                if (c == '0') {
                    string1.add('0');
                }
            }
            asdf = input.nextLine();
        }
        asdf = "";
        while (!asdf.equals("asdf")) {
            for (char c : asdf.toCharArray()) {
                char[] chars = new char[8];
                for(int i=0;i<8;i++){
                    chars [7-i] =(char) ((c%2)+'0');
                    c/=2;
                }
                for(char i: chars){
                    string2.add(i);
                }
            }
            asdf = input.nextLine();
        }


        for(int k=0;k<string2.size();k+=8){
            for(int i=k;i<=string1.size()-string2.size();i+=string2.size()){
                for (int z=0;z<string2.size();z+=8){
                    int c=0;
                    for(int j=0;j<8;j++) {
                        c= c*2+    (((string1.get(i+j+z)-'0') ^ (string2.get(j+z)-'0')));
                    }
                    string3.add((char) c);
                }
            }
            string3.add('\n');
            string3.add('\n');
            string3.add('\n');
            string3.add('\n');
            string3.add('\n');
            string3.add('\n');
            string3.add('\n');
        }

        for (char c : string3) {
            System.out.print(c);
        }
        System.out.println();
    }
}
