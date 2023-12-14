

public class QSortTest {
    
public static void quickSort(String[] arr, int lowIndex, int highIndex) {
        
        if (lowIndex >= highIndex) {
            return;
        }
        
        String pivot = arr[highIndex];
        int leftPtr = lowIndex;
        int rightPtr = highIndex - 1; 
        
        while (leftPtr <= rightPtr) {
            
            while (leftPtr <= rightPtr && arr[leftPtr].compareTo(pivot) <= 0) {
                leftPtr++;
            }
            
            while (leftPtr <= rightPtr && arr[rightPtr].compareTo(pivot) >= 0) {
                rightPtr--;
            }
            
            if (leftPtr < rightPtr) {
                swap(arr, leftPtr, rightPtr);
            }
        }
        
        swap(arr, leftPtr, highIndex);
        
        quickSort(arr, lowIndex, leftPtr - 1);
        quickSort(arr, leftPtr + 1, highIndex);
    }
    public static void swap(String[] arr, int leftPtr, int rightPtr) {
        String temp = arr[leftPtr];
        arr[leftPtr] = arr[rightPtr];
        arr[rightPtr] = temp;
    }

    public static void main(String[] args) {
        String[] array = {"Alice", "Cindy", "Bob", "Dove", "Ann", "Mary", "Sam", "Eric", "Jack", "Ralph"};
        
        System.out.println("Quick sort..!");
        quickSort(array, 0, array.length - 1);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

