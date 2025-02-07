import java.util.Random;
class SearchCompare{

    public int linearSearch(int[] arr, int targetVal){

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == targetVal)
                return i;
        }
    

        return -1;
    }//Time compexty is O(n) because the worst case senario that the code will
    // go pass the entrire array
    //space complexty is O(1) because the array is a input array
    public void bubbleSort(int[] arr){
        int n = arr.length;
        for(int x = 0; x<arr.length - 1; x++){
            for(int y = 0; y<arr.length - 1 - x; y++){
                if(arr[y] > arr[y+1]){
                    int z = arr[y];
                    arr[y] = arr[y+1];
                    arr[y +1] = z;
                }
                
            }
        }
    }
    int binarySearch(int arr[], int x)
    {
        bubbleSort(arr);
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x)
                return arr[mid];

            if (arr[mid] < x)
                low = mid + 1;

            else
                high = mid - 1;
        }

        return -1;}
        // the time complexity is O(log n) because the algrothm dvid itself
        // and the space complexity is O(1) because the array is a input array
public static void main(String[] args) {
    int[] randomArray = new int[5];
         Random random = new Random();
        for(int i = 0; i < 5; i++){
            randomArray[i] = random.nextInt(10); 
            System.out.print(randomArray[i] + " ");
        }System.out.println();
    SearchCompare obj = new SearchCompare();
    long startTime = System.nanoTime();
    System.out.println(obj.linearSearch(randomArray, 3));
    long endTime   = System.nanoTime();
    long totalTime = endTime - startTime;
    System.out.println("total time linear: "+ totalTime);

    long startTimeBinary = System.nanoTime();
    System.out.println(obj.binarySearch(randomArray, 3));
    long endTimeBinary   = System.nanoTime();
    long totalTimeBinary = endTimeBinary - startTimeBinary;
    System.out.println("total time binary: " + totalTimeBinary);

}}
