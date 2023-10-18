public class SumOfN{
    public static void main(String args[]){
        int sum= sumOfNumber(10);
        System.out.print(sum);
    }

    static int sumOfNumber(int high){
        int sum=0;
        for(int i=high; i>=1;i--){
            sum+=i;
        }
        return sum;
    }
}