public class merge2SortedArray {
    public static void main(String[] args) {
        int [] a = {2,4,7,9};
        int [] b = {1,3,5,6,8};
        int [] c = new int[a.length + b.length];

        merge(a,b,c);
        System.out.print("Output is: ");
        for(int ele : c){
            System.out.print(ele + " ");
        }
    }

    public static void merge(int [] a,int [] b,int [] c){
        int i = 0; // Array a pointer
        int j = 0; // Array b pointer
        int k = 0; // Array c pointer

        while(i < a.length && j < b.length ){
            if(a[i] < b[j]){
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
        while(i < a.length){
            c[k] = a[i];
            i++;
            k++;
        }
        while(j < b.length){
            c[k] = b[j];
            j++;
            k++;
        }

    }
}
