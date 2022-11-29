package novemberTasks.day24_Tasks;

public class Task9_IsContained {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int num = 55;
        boolean isContaine = isIntegerContained(arr,num);
        System.out.println(isContaine);
    }
    public static boolean isIntegerContained(int[] arr, int num) {
        boolean isContaine = false;
        for (int eachElement : arr) {
            if (eachElement == num) {
                isContaine = true;
            }
        } return isContaine;
    }
}

/*
9. Create a method named contains that passes one integer array and one integer parameters,
the method returns true if the given integer is contained in the given array, otherwise returns false
									Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;
					contains(arr, num) ===> false
 */