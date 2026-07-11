public class countPositiveNegativeZero {
    public static void main(String[] args) {
        int [] arr ={1,-7,20,6,0,-25,-10,12,0};
        int [] ans = count(arr);

        System.out.println("Positive numbers: " + ans[0]);
        System.out.println("Negative numbers: " + ans[1]);
        System.out.println("Zero numbers: " + ans[2]);
    }

    public static int [] count(int [] arr){
        int n = arr.length;
        int nOfPositive = 0;
        int nOfNegativie = 0;
        int nOfZeros = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] > 0) nOfPositive++;
            else if(arr[i] < 0) nOfNegativie++;
            else nOfZeros++;
        }
        int [] reslut = {nOfPositive,nOfNegativie,nOfZeros};
        return reslut;
    }
}
