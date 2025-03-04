public class FunWith2DArrays{

    public static int totalElements(int[][] array){
        return array[0].length * array.length;
    }

    public static void fourCorners(String[][] array){
        System.out.println(array[0][0]);
        System.out.println(array[0][array[0].length - 1]);
        System.out.println(array[array.length - 1][0]);
        System.out.println(array[array.length - 1][array[0].length - 1]);
    }

    public static void swapFrontAndBackRows(String[][] array){
        String[] temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp; 
    }
}