package DayOne;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class DayOne {
    static File data = new File("files/DayOne/data.txt");
    static String[] temp;
    static int finalNum = 0;
    static ArrayList<Integer> Arr1 = new ArrayList<>();
    static ArrayList<Integer> Arr2 = new ArrayList<>();
    static String regex = " ";

    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(data);

            while( scanner.hasNextLine()){
                String line = scanner.nextLine();
                temp = line.split(regex);
                Arr1.add(Integer.valueOf(temp[0]));
                Arr2.add(Integer.valueOf(temp[3]));
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        Arr1.sort(null);
        Arr2.sort(null);

        for(int i = 0; i < Arr1.size(); i++){
            finalNum += (Math.abs(Arr1.get(i) - Arr2.get(i)));
        }

        System.out.println(finalNum);
    }
}