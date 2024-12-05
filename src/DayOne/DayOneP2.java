package DayOne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class DayOneP2 {
    static File data = new File("files/DayOne/data.txt");
    static String[] temp;
    static int finalNum = 0;
    static int count;
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
        //Arr1.sort(null);
        //Arr2.sort(null);

        for (Integer value : Arr1) {
            count = 0;
            for (Integer integer : Arr2) {
                //System.out.println(value);
                //System.out.println(integer);
                if (Objects.equals(value, integer)) {
                    count++;
                }
            }
            finalNum += (value * count);
        }
        System.out.println(finalNum);
    }
}
