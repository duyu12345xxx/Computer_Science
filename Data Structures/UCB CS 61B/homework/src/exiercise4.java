public class exiercise4 {

    public static void windowPosSum(int[] a, int n)
    {
        int[] a_new = new int[a.length];
        int[] b = new int[a.length + n];
        int temp = 0;

        /*read the input array to a longer array called b,the element missed use zeros to fill*/
        for(int i = 0;i < a.length; i += 1)
        {
            b[i] = a[i];
        }

        for(int i = a.length; i < a.length + n;i += 1)
        {
            b[i] = 0;
        }


        for(int i = 0;i < a.length; i += 1)
        {
            if(a[i] >= 0)
            {
                temp = 0;
                for(int j = 0;j <= n;j += 1)
                {
                    temp = temp + b[i+j];
                }
                a_new[i] = temp;
                System.out.println(a_new[i]);
                a[i] = a_new[i];
            }
        }
        /*return a_new;*/
       // a = a_new;
    }
    public static void main(String[] args)
    {
        int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
    }
    
}
