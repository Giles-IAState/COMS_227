package lab7;

import java.io.File;

public class CountStuff {

    public static void main(String[] args) {

        File rootDirectory = new File("C:\\Users\\colea\\OneDrive\\Desktop\\IntelliJ Projects\\Project7");
        System.out.println(countFiles(rootDirectory));
//        int result = countPatterns(4);
//        System.out.println(result);
    }

    public static int countFiles(File f) {

        if(!f.isDirectory()) {
            return 1;
        }
        else {
            int count = 0;
            for(File files : f.listFiles()) {

                count += countFiles(files);
            }
            return count;
        }
    }

    public static int countPatterns(int n) {
        return 0;
    }
}

