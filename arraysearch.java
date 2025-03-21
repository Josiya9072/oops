import java.util.Scanner;
class arraysearch {
    public static void main(String[] args) {
        
        int[] array = {15, 25, 35, 45, 55, 65, 75, 85, 95};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();

        int index = linearSearch(array, target);

        if (index == -1) {
            System.out.println("Element " + target + " not found in the array.");
        } else {
            System.out.println("Element " + target + " found at index " + index + ".");
        }

        scanner.close();
    }

    public static int linearSearch(int[] array, int target) {
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 
    }
}

