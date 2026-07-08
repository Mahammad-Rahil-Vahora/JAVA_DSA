public class waveArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int n = arr.length;
        System.out.println("Real Array:");
        print(arr);
        System.out.println(" ");
        for(int i = 0; i < n-1; i+=2){
            /* why n-1 bcz if loop goes to n then arr[i+1] element is not present and
            indexoutofbound error throw so that we continue loop to n-1 */
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr [i+1] = temp;
        }
        System.out.println("Final Array:");
        print(arr);
    }

    public static void print(int [] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
