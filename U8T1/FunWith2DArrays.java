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

    public static double average(int[][] array){
        double total = 0;
        for(int[] row : array){
            for(int num : row){
                total += num;
            }
        }
        return total/ (array.length * array[0].length);
    }

    public static int edgeSum(int[][] array){
        int total = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i].equals(array[0]) || array[i].equals(array[array.length - 1])){
                for(int num : array[i]){
                    total += num;
                }
            } else{
                total += array[i][0];
                total += array[i][array[i].length - 1];
            }
        }
        return total;
    }

    public static int[] indexFound(String[][] array, String target){
        int[] result = {-1, -1};
        for(int i = 0; i < array[0].length; i++){
            for(int j = 0; j <array.length; j++){
                if(array[j][i].equals(target)){
                    result[0] = j;
                    result[1] = i;
                    return result;
                }
            }
        }
        return result;
    }

    public static int[][] split(int[][] array, int rowNum, int columnNum){
        if(rowNum >= array.length || columnNum >= array[0].length){
            return new int[0][0];
        }

        int[][] result = new int[rowNum + 1][columnNum + 1];
        for(int i = 0; i <= rowNum ; i++){
            for(int j = 0; j <= columnNum; j++){
                result[i][j] = array[i][j];
            }
        }
        return result;
    }
    
    public static int[][] invert(int[][] array){
        int[][] result = new int[array[0].length][array.length];

        for(int i = 0; i <array[0].length; i++){
            for(int j = 0; j < array.length; j ++){
                result[i][j] = array[j][i];
            }
        }
        return result;
    }
}