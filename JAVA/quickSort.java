public class quickSort {
    static void quickSort(int[] arr, int low, int high){

        if (low<high){
            int p = partition(arr,low,high);

            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);

        }
    }
//recursion uses stack memory
    static int partition(int[] arr,int low, int high){

        int pivot = arr[high];
        int i = low - 1;

        for(int j=low;j<high;j++){

            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1; // pivot position 


    }

     public static void main(String[] args){
                int[] arr = {64,25,32,22,11};
                quickSort s = new quickSort();
                s.quickSort(arr,0, arr.length-1);
                System.out.println("Sorted array:");
                for (int x : arr) {
                    System.out.print(x + " ");
                }
    }
}


