public class Lab {
    public static void main(String[] args){
        String[][] seatingChart = {{"Abby", "Don", "George", "Kim"}, {"Brian", "Elenor", "Harry", "Lenny"}, {"Cathy", "Fred", "Jill", "Matt"}};

        seatingChart[1][2] = "Paul";

        String temp = seatingChart[2][3];
        seatingChart[2][3] = seatingChart[0][0];
        seatingChart[0][0] = temp;

        String[] temp1 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp1;

        for(String[] array : seatingChart){
            for(String str : array){
                System.out.print(str + " ");
            }
            System.out.println();
        }
        
        int[][] arr1 = new int[2][3];
        String[][] arr2 = new String[4][2];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        for(int[] array : arr1){
            for(int integer : array){
                System.out.print(integer + " ");
            }
            System.out.println();
        }

        arr2[0][0] = "a";
        arr2[0][1] = "b";
        arr2[1][0] = "c";
        arr2[1][1] = "d";
        arr2[2][0] = "e";
        arr2[2][1] = "f";
        arr2[3][0] = "g";
        arr2[3][1] = "h";


        for(String[] array : arr2){
            for(String str : array){
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
