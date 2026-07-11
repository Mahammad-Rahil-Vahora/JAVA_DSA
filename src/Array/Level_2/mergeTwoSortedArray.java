public class mergeTwoSortedArray {
    public static void main(String[] args) {
        int [] a = {1,3,4,6,12,25,80};
        int [] b = {2,3,5,7,10};
        int [] c = new int[a.length + b.length];
        merge(a,b,c);
        for (int k = 0; k < c.length; k++){
            System.out.print(c[k] + " ");
        }
    }

    public static void merge (int [] a, int [] b,int [] c ){
        int m = a.length;
        int n = b.length;
        int l = c.length;
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < m && j < n){
            if(a[i] <= b[j]){
                c[k] = a[i];
                i++;
                k++;
            }
            else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        while(i < m){
            c[k] = a[i];
            i++;
            k++;
        }
        while (j < n){
            c[k] = b[j];
            j++;
            k++;
        }
    }
}
