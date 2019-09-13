package generic;

import java.util.Arrays;

public class GenericMain {
    public static void main(String[] args) {

        GenericHolder<String> strHolder = new GenericHolder<>();
        strHolder.setData("Hello");
        //strHolder.setData(new int[] {10, 20, 30});

        String str = strHolder.getData();
        System.out.println(str);

        GenericHolder<int []> intHolder = new GenericHolder<>();
        intHolder.setData(new int[] {10, 20, 30});

        int [] arr = intHolder.getData();
        System.out.println(Arrays.toString(arr));
    }
}
