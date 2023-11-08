public class sorting {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static int[] printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        return arr;

    }

    public static void slectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];
        }

        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];

    }

    public static void merge2(int[] arr, int l, int mid, int r) {

        int n1 = mid - 1 + l;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++)
            left[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];
        int i = 0, j = 0, k = l;

        while (i < n1 && j < n2) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];

        }
        while (i < n1)
            arr[k++] = left[i++];
        while (j < n2)
            arr[k++] = right[j++];

    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l == r)
            return;
        int mid = (l + r) / 2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        merge(arr, l, mid, r);

    }
    static void swap(int[]arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void mergeNazim(int[] arr, int l, int mid, int r) {

        int n1 = mid - l + 1; // size of left array , divided by recursion

        int n2 = r - mid; // size of right array , divided by recursion

        int[] left = new int[n1];
        int[] right = new int[n2];

        int i, j, k;

        // smajha n aaya sala

        for (i = 0; i < n1; i++)
            left[i] = arr[l + i]; // for fill the elem in right arr

        for (j = 0; j < n2; j++)
            right[j] = arr[mid + 1 + j];

        i = 0; // left ke 0th index ko point kar raha
        j = 0; // right ke 0th index ko point kar raha
        k = l; // k array ke 0th index ko indicate karega

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }

        }

        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (i < n2) {
            arr[k++] = right[j++];

        }

    }

    public static int pivot(int[] arr, int st, int end) {
        int pivot = arr[st];
        int count = 0;

        for(int i = st+1; i<=end; i++){
            if(arr[i]<=pivot) count++;

        }
        int pivotIndex = st+count;
        swap(arr, st,pivotIndex);

        int i =st, j = end;

        while(i<pivotIndex&&j>pivotIndex){
            if(arr[i]<=pivot) i++;
            if(arr[j]>pivot)j--;

            if(i<pivotIndex&&j>pivotIndex){
                swap(arr,i, j);

            }
        }


        return pivotIndex;




    }



    
    public static void quickSort(int[] arr, int st, int end) {
        if(st>=end) return;
        int pi = pivot(arr, st, end);
        quickSort(arr, st, pi - 1);
        quickSort(arr, pi + 1, end);

    }

    public static void main(String[] args) {

        int[] arr = { 13,5,6,2,4,8,14,13,5,6 };
        quickSort(arr, 0, arr.length-1);
        System.out.println(printArray(arr));

    }

}
