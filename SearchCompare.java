import java.util.Random;
class SearchCompare{

    public int linearSearch(int[] arr, int targetVal){
        long startTime = System.nanoTime();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetVal)
                return i;
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("\n linear saearch search time " + totalTime);

        return -1;
    }//Time compexty is O(n) because the worst case senario that the code will
    // go pass the entrire array
    //space complexty is O(1) because the array is a input array

    int binarySearch(int arr[], int x)
    {
        long startTime = System.nanoTime();

        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return x;

            if (arr[mid] < x)
                low = mid + 1;

            else
                high = mid - 1;
        }

        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("binary search time " + totalTime);
        return -1;}
        // the time complexity is O(log n) because the algrothm dvid itself
        // and the space complexity is O(1) because the array is a input array
public static void main(String[] args) {
    int[] randomArray = new int[5];
         Random random = new Random();
        for(int i = 0; i < 4; i++){
            randomArray[i] = random.nextInt(10); 
            System.out.print(randomArray[i] + " ");
        }
    SearchCompare obj = new SearchCompare();
    System.out.println(obj.linearSearch(randomArray, 3));
    System.out.println(obj.binarySearch(randomArray, 5));


}}
