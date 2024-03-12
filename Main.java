import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String asdf = input.nextLine();
        ArrayList<Character> string1 = new ArrayList<>();
        ArrayList<Character> string2 = new ArrayList<>();
        ArrayList<Character> string3 = new ArrayList<>();
        while(!asdf.equals("asdf")){
            for(char c : asdf.toCharArray()){
                if(c=='1'){
                    string1.add('1');
                }
                if(c=='0'){
                    string1.add('0');
                }
            }
            asdf = input.nextLine();
        }
        int size = string1.size()/2;
        for(int i=0;i<size;i++){
            string2.add(string1.remove(size));
        }

        /*for (int i=0;i<string1.size() && i<string2.size();i+=8){
            int c=0;
            for(int j=0;j<8;j++){
                c= c*2+    (((string1.get(i+j)-'0') ^ (string2.get(i+j)-'0')));
            }
            string3.add((char) c);
        }*/
        for (int i=0;i<string1.size() && i<string2.size();i++){
            int c=0;
            string3.add((char) (((string1.get(i)-'0') ^ (string2.get(i)-'0'))+'0'));
        }

        for (char c :string3){
            System.out.print(c);
        }
        System.out.println();
/*
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            for(char c : string3){

            }
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }*/
    }
}