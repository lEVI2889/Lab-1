import java.util.Arrays;

//Task 02: Container with Most Water
class Task2{

    //Complete this method so that it gives the Expected Output
    public static void mostWater( Integer[] height ){

        //TO DO
        int[] areas = new int[height.length*(height.length-1)/2];
        int idx = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int reqheight = 0;
                if(height[i]<=height[j]){
                    reqheight = height[i];
                }
                else if(height[i]>height[j]){
                    reqheight = height[i]-(height[i]-height[j]);
                }
                areas[idx++] = (j-i)*reqheight;
            }

        }
        int maxArea = 0;
        for (int i = 0; i < areas.length; i++) {
            if(areas[i]>maxArea){
                maxArea = areas[i];
            }
        }
        System.out.println(maxArea);

    }

    //DO NOT CHANGE ANY DRIVER CODE BELOW THIS LINE
    public static void main(String[] args){
        Integer[] array = {1,8,6,2,5,4,8,3,7};
        System.out.println("Given Array: ");
        Arr.print(array);
        System.out.println("\nExpected Output:");
        System.out.print("49");
	System.out.print("\nYour Output:\n");
        mostWater( array );

    }
}
