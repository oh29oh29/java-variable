public class ArrayStudy {

    public static void main(String[] args) {
        int[] oneArray = new int[]{1, 2, 3};
        int[] cloneOneArray = oneArray.clone();
        System.out.println("oneArray reference: " + oneArray);
        System.out.println("cloneOneArray reference: " + cloneOneArray);
        System.out.println("oneArray == cloneOneArray: " + (oneArray == cloneOneArray));

        int[][] multiArray = new int[][]{ {1, 2}, {3, 4} };
        int [][] cloneMultiArray = multiArray.clone();
        System.out.println("multiArray reference: " + multiArray);
        System.out.println("cloneMultiArray reference: " + cloneMultiArray);
        System.out.println("multiArray == cloneMultiArray: " + (multiArray == cloneMultiArray));
        System.out.println("multiArray[0] reference: " + multiArray[0]);
        System.out.println("cloneMultiArray[0] reference: " + cloneMultiArray[0]);
        System.out.println("multiArray[0] == cloneMultiArray[0]: " + (multiArray[0] == cloneMultiArray[0]));
    }
}
