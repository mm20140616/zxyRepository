import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class test {

    public static void main(String[] args) {
        Random rand = new Random();
        Integer[] array = new Integer[3];
        for (int i=0;i<array.length;i++) {
            int randNum = rand.nextInt(49) + 1;
            array[i] = randNum;
            if (i > 0 && array[i-1] == array[i]) {
                i = i-1;
                continue;
            }

        }
        System.out.println(array.length+","+array[0]+","+array[1]+","+array[2]);
    }

}
