public class insertionSort {

    static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int k=arr[i];
            int j=i-1;

            while (j>=0&& arr[j]>k){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=k;
    }
    }

    public static void main(String[] args){
                int[] arr = {64,25,32,22,11};
                insertionSort s = new insertionSort();
                s.insertionSort(arr);
                System.out.println("Sorted array:");
                for (int x : arr) {
                System.out.print(x + " ");
                }
    
}
}
