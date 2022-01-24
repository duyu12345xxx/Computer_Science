public class ClassNameHere{
    public static int max(int[] m)
    {
        int max_value = m[0];
        int length_m = m.length;
        int i = 0;
        
        for(i = 1;i < length_m; i = i + 1)
        {
            if(max_value < m[i])
            {
                max_value = m[i];
            }
        }
        return max_value;
    }

    public static int WhileSum(int[] a)
    {
        int sum = 0;
        int i = 0;
        while(i < a.length)
        {
            sum = sum + a[i];
            i = i + 1;
        }
        return sum;
    }

    public static int ForSum(int[] a)
    {
        int sum = 0;
        int i = 0;
        for(i = 0; i < a.length;i = i + 1)
        {
            sum = sum + a[i];
        }

        return sum;
    }
    public static void main(String[] args){
        int[] numbers = new int[]{9,2,15,2,22,10,6};
        int max_value = max(numbers);
        System.out.println("max valud is " + max_value);
        int Whilesum = WhileSum(numbers);
        System.out.println("sum of array is " + Whilesum);
        int Forsum = ForSum(numbers);
        System.out.println("sum of array is " + Forsum);

    }
}