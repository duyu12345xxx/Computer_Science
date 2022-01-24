public class exercise4_1 {
    public static void windowPosSum(int[] a, int n)
    {
        for(int i = 0;i < a.length; i += 1){
            int temp = a[i];
            if(a[i] < 0)
            continue;

            for(int j = i+1;j < i + n + 1;j += 1){
                if(j >= a.length){
                    System.out.println("kkk");
                    break;
                }
                
                temp = temp + a[j];        
            }
            a[i] = temp;
            
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, -3, 4, 5, 4};
        int n = 3;
        windowPosSum(a, n);
    
        // Should print 4, 8, -3, 13, 9, 4
        System.out.println(java.util.Arrays.toString(a));
      }
    
}
