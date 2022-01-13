public class InsertSort {
    void insertSort(int [] a) {
        int tmp;
        int n = a.length;
        for (int i=1; i<n; i++) {
            int j=i;
            while ((j>0) && (a[j]<a[j-1])) {
                tmp = a[j];
                a[j] = a[j-1];
                a[j-1]=tmp;
                j--;
                
                for (int k=0; k<n;k++) {
                    System.out.print(" "+ a[k]);
                }
                System.out.println();
            }
        }
    }
}
