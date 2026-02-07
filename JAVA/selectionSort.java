class SelectionSort {
        static void selectionSort(int[] arr){
                int n = arr.length;

                for (int i = 0; i < n - 1 ; i++){
                        int minIndex = i;

                        for (int j = i+1 ; j<n ; j++){
                                if(arr[j] < arr[minIndex])
                                        minIndex = j;

                        }

                        int temp = arr[minIndex];
                        arr[minIndex] = arr[i];
                        arr[i] = temp;
                }
        }

        public static void main(String[] args){
                int[] arr = {64,25,32,22,11};
                SelectionSort s = new SelectionSort();
                s.selectionSort(arr);
                System.out.println("Sorted array:");
                for (int x : arr) {
                System.out.print(x + " ");
                }


        }
}