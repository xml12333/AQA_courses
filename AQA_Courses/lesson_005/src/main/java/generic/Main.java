package generic;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ObjectHolder holder = new ObjectHolder();
        holder.setData((new int[]{10, 20, 30}));

        int[] arr = (int[]) holder.getData();
        System.out.println(Arrays.toString(arr));

        String str =(String) holder.getData();
        System.out.println(str);
    }
}
