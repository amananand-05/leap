class Sort {
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        System.out.print("bubble: ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            if (minIndex != i) {
                arr[minIndex] = arr[minIndex] + arr[i];       // this way of swaping doesn't work if trying to swap on the same index
                arr[i] = arr[minIndex] - arr[i];
                arr[minIndex] = arr[minIndex] - arr[i];
            }
        }
        System.out.print("selection: ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.print("insertion: ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    static void mergeSortedArray(int[] arr, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] larr = new int[n1];
        int[] rarr = new int[n2];

        for (int i = 0; i < n1; i++) larr[i] = arr[i + l];
        for (int i = 0; i < n2; i++) rarr[i] = arr[i + m + 1];

        int i = 0;
        int j = 0;
        while (i < n1 && j < n2) {
            if (larr[i] < rarr[j]) {
                arr[l] = larr[i];
                i++;
            } else {
                arr[l] = rarr[j];
                j++;
            }
            l++;
        }
        while (i < n1) {
            arr[l] = larr[i];
            i++;
            l++;
        }

        while (j < n2) {
            arr[l] = rarr[j];
            j++;
            l++;
        }
    }

    static void mSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mSort(arr, l, m);
            mSort(arr, m + 1, r);
            mergeSortedArray(arr, l, m, r);
        }
    }

    static void mergeSort(int[] arr) {
        mSort(arr, 0, arr.length - 1);
        System.out.print("merge: ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static int qPartition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int k = low;
        for (int i = low; i <= high; i++) {
            if (arr[i] < pivot) {
                swap(arr, k, i);
                k++;
            }
        }
        swap(arr, k, high);
        return k;
    }

    static void qSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = qPartition(arr, low, high);
            qSort(arr, low, pi - 1);
            qSort(arr, pi + 1, high);
        }
    }

    static void quickSort(int[] arr) {
        qSort(arr, 0, arr.length - 1);
        System.out.print("quick: ");
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}

class Sorting {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 3, 2, 56, 7, 5, 4, 7, 8, 7, 5, 6, 7, 8, 9, 4, 32, 7, 0, 0, 0};
        for (int i : arr) System.out.print(i + " ");
        System.out.println();
        Sort.bubbleSort(arr.clone());
        Sort.selectionSort(arr.clone());
        Sort.insertionSort(arr.clone());
        Sort.mergeSort(arr.clone());
        Sort.quickSort(arr.clone());

    }
}