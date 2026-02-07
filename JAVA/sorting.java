public class sorting{

    static int binarySearch(int[] arr,int key){
        int low =0, high = arr.length-1;
        while(low<=high){

            int mid = low + (high - low)/2;

            if (arr[mid]==key)
                return mid;

            else if (arr[mid]<key)
                low=mid+1;

            else
                high = mid-1;

        }
        return -1;
    }



    public static void main(String[] args){
            sorting bs = new sorting();
            int[] arr = {11,13,15,17,19};
            int k=15;

            int res=binarySearch(arr,k);

            if (res==-1)
                System.out.println("Element not found");
            else
                System.out.println("Element found at Index:"+ res);

    }
}




    

