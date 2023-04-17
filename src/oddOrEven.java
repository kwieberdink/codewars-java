public class oddOrEven {
    public static void main(String[] args) {
        System.out.println("Sum of given array is " + sum());
    }

    static int arr[] = {2,5,34,6};
    int sum;

    static int sum() {
        int sum = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if(sum % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        return sum;
    }

}
