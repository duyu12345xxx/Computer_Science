public class triangle{
    public static void main(String[] args){
        /*循环次数*/
        int N = 5;

        int i = 0;
        int j = 0;
        for(i = 0; i < N ; i = i + 1){
            for(j = 0;j < i + 1; j = j + 1){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}