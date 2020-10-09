package com.company;

class HeapSort {
    public static int heapSize;
    public static void sort (int[] a){
        buildHeap(a);
        while (heapSize>1){
            swap(a,0, heapSize-1);
            heapSize--;
            heapfy(a, 0);
        }


    }
    public static void buildHeap(int[]a){
        heapSize = a.length;
        for (int i = a.length/2; i >=0; i--) {
            heapfy(a,i);

        }
    }

    public static void heapfy(int[]a, int i){
        int l = left(i);
        int r = right(i);
        int largest = i;
        if (l< heapSize && a[i]< a[l]){
            largest = l;
        }
        if(r<heapSize && a[largest] < a[r]){
            largest = r;
        }
        if(i!=largest){
            swap(a,i,largest);
            heapfy(a, largest);
        }
    }
    private static int right(int i){
        return 2 * i + 2;
    }
    private static int left(int i){
        return 2 * i + 1;
    }
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a [j];
        a[j] = temp;
    }
}
