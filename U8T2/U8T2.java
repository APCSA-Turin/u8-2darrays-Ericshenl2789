public class U8T2 {
    public static void main(String[] args) {
        System.out.println("PROBLEM 1:");
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        
        System.out.println("---------");
        
        // write code here
        for(int[] row : nums){
            for(int num : row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        // write code here
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j <nums[i].length; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------");
        
        // write code here
        for(int i = 0; i < nums[0].length; i++){
            for(int j = 0; j <nums.length; j++){
                System.out.print(nums[j][i] + " ");
            }
            System.out.println();
        }

        String[][] animals = {
            {"anteater", "bird"},
            {"camel", "dog"},
            {"elephant", "giraffe"},
            {"hyena", "jackal"}
        };

        // write code here
        for(int i = 0; i < animals.length; i++){
            for(int j = 0; j < animals[i].length; j++){
                animals[i][j] = animals[i][j] + "s";
            }
        }
       
        // write code here
        for(int i = 0; i < animals[0].length; i++){
            for(int j = 0; j <animals.length; j++){
                System.out.print("| " + animals[j][i] + " |");
            }
            System.out.println();
        }
        
    }
}
