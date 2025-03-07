import java.util.ArrayList;

public class Algorithm2DArrays{
    public static int sumForRow(int[][] arr, int row){
        int total = 0;
        for(int num : arr[row]){
            total += num;
        }
        return total;
    }
   /** Return the sum of all elements of arr that are in the one particular column 
   *
   *  PRECONDITION:  0 <= col < arr[0].length (i.e. col is valid)
   *
   *  @param arr  2D array of ints
   *  @param col  the column to add up
   *  @return  the sum of all elements in column
   */
    public static int sumForColumn(int[][] arr, int col){
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i][col];
        }
        return total;
    }
    
    public static int replaceEvensWithZero(int[][] arr){
        int numofChanges = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] % 2 == 0 ){
                    arr[i][j] = 0;
                    numofChanges++;
                }
            }
        }
        return numofChanges;
    }

    public static ArrayList<String> findStringsOfLength(String[][] wordChart, int len) {
        ArrayList<String> result = new ArrayList<>();
        for(String[] row : wordChart){
            for(String str : row){
                if(str.length() == len){
                    result.add(str);
                }
            }
        }
        return result;
    }

    /** calculates and returns the average class grade as a double for a
     *  all Students in the 2D array seatingChart
     *
     *  PRECONDITION:  seatingChart contains at least one element with at least
     *                 one student (i.e. no need to worry about division by 0)
     *  
     *  @param seatingChart  2D array of Student objects
     *  @return  the average grade of all Students in seatingChart, as a double
     */
    public static double classAverage(Student[][] seatingChart){
        double total = 0;
        for(Student[] row : seatingChart){
            for(Student student : row){
                total+= student.getGrade();
            }
        }
        return total / (seatingChart.length * seatingChart[0].length);
    }
    
    /** Returns true if any two consecutive elements, horizontally or vertically,
   *  are equal, false otherwise.  You do not need to check for "wrap around"
   *  consecutiveness, such as if the last element in a row is the same as
   *  the first:
   *  
   *  For example, if arr is:
   *      1, 2, 3, 4
   *      2, 7, 3, 5
   *      3, 4, 5, 6
   *
   *  then this method returns true because there is a pair of consecutive
   *  numbers (vertically)
   *
   *  As another example, if arr is:
   *      1, 2, 3, 4
   *      2, 7, 8, 5
   *      3, 4, 4, 6
   *
   *  then this method returns true because there is a pair of consecutive
   *  numbers (horizontally)
   *
   *  As another example, if arr is:
   *      1, 2, 3, 8
   *      2, 7, 8, 5
   *      3, 2, 5, 3
   *
   *  then this method returns false because there are not two consecutive
   *  numbers, vertically or horizontally, that are equal.
   *
   *  NOTE: do not consider "wrap around" consecutive numbers, in other words,
   *  the 3's and 6's below are not considered consecutive:
   *      1, 6, 3, 8
   *      2, 7, 8, 5
   *      3, 6, 5, 3
   *
   *  Similarly, equal numbers on a diagonal are not considered consecutive,
   *  so the 8's below are not consecutive:
   *      1, 2, 3, 8
   *      2, 7, 8, 5
   *      3, 2, 5, 3
   *
   *  @param arr  2D array of ints
   */
    public static boolean consecutive(int[][] arr){
        for(int[] row : arr){
            for(int i = 0; i < row.length - 1; i++){
                if(row[i] == row[i+1]){
                    return true;
                }
            }
        }

        for(int col = 0; col < arr[0].length; col++){
            for(int i = 0; i< arr.length - 1; i++){
                if(arr[i][col] == arr[i + 1][col]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean magicSquare(int[][] arr){
        ArrayList<Integer> ints= new ArrayList<>();
        for(int i = 0; i < arr.length; i ++){
            for(int j = 0; j < arr[0].length; j++){
                ints.add(arr[i][j]);
            }
        }

        for(int i = 0; i < ints.size(); i++){
            for(int j = i + 1; j < ints.size(); j++){
                if(ints.get(i) == ints.get(j)){return false;}
            }
        }

        int value = 0;
        for(int i = 0; i< arr[0].length; i++){
            value += arr[0][i];
        }
        for(int i = 1; i < arr.length; i++){
            int total = 0;
            for(int j = 0; j<arr[i].length; j++){
                total += arr[i][j];
            }
            if(total != value){
                return false;
            }
        }
        for(int i = 0; i < arr[0].length; i++){
            int total = 0;
            for(int j = 0; j<arr.length; j++){
                total += arr[j][i];
            }
            if(total != value){
                return false;
            }
        }

        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i][i];
        }
        if(total != value){
            return false;
        }
        total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i][arr.length - 1 - i];
        }
        if(total != value){
            return false;
        }
        return true;
    }


}