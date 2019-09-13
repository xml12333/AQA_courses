public class arrays {
    public static void main(String[] args) {
        int arrayLength = 5;
        int[] ourFirstArray = new int[arrayLength];
        int[] ourSecondArray = {1, 2, 3, 5, 6};
        int[] ourThirdArray = new int[]{2, 3, 1, 22, 67};

        System.out.println(ourFirstArray);

        System.out.println("Length of array: " + ourThirdArray.length);

        for (int i = 0; i < ourThirdArray.length; i++) {
            System.out.println("Element of array with index " + i + " is :" + ourThirdArray[i]);
        }

//        System.out.println(Arrays.toString(ourSecondArray));

//        int[][] ourForthArray = new int[2][4];
//        System.out.println(ourForthArray[0].length);
//        ourForthArray[0] = new int[]{2, 3, 4, 5, 6};
//        System.out.println(ourForthArray[0].length);
//
//        System.out.println(ourForthArray[1].length);
//        ourForthArray[1] = new int[]{12, 13, 14, 15, 16};
//        System.out.println(ourForthArray[1].length);
//
//        for (int i = 0; i < ourForthArray.length; i++) {
//            System.out.println("Array " + (i + 1) + ": ");
//            for (int j = 0; j < ourForthArray[i].length; j++) {
//                System.out.println(ourForthArray[i][j]);
//            }
     //   }
    }
}
