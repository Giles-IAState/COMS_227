import java.util.Scanner;

public class TenNumbers {

    public static void main(String[] args){

        boolean play;
        int rand;
        int input = 0;
        Scanner s = new Scanner(System.in);

        System.out.print("TEN NUMBERS GAME\nDo you wish to PLay? Enter 1 to play, enter 0 to quit.");
        input = s.nextInt();
        if(input == 1)
            play = true;
        else
            play = false;

        while(play){
            rand = (int)(Math.random() * 1000);

            for(int i = 1; i <= 20; i++){
                System.out.println(i + ".");
            }

            play = false;
        }


    }
}
