package lab5;

import java.util.Scanner;

public class LabFive {

    public static void main(String[] args){

        Scanner s = new Scanner("Cole Giles");
        System.out.println("Initials: " + getInitials(s));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String input = sc.next();
        System.out.println();
        System.out.print("Index of first vowel: " + getIndex(input));


    }
    public static String getInitials(Scanner name){

        String initials = "";
        String current;
        while(name.hasNext()){
            current = name.next();
            initials += current.charAt(0);
        }
        return initials;
    }

    public static int getIndex(String word){
        int index;
        for(int i = 0; i < word.length(); i++){

            if("aeiouAEIOU".indexOf(word.charAt(i)) >= 0){
                index = "aeiouAEIOU".indexOf(word.charAt(i));
                return index;
            }
        }
        return -1;
    }
}
