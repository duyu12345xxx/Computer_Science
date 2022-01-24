public class DrawTriangle {

    /*method*/
    public static void drawTriangle(int N){

        int i = 0;
        int j = 0;
        for(i = 0; i < N ; i = i + 1){
            for(j = 0;j < i + 1; j = j + 1){
                System.out.print("*");
            }
            System.out.println("");
        }

    }


    /*main method*/
    public static void main(String[] args){

        int N = 10;
        drawTriangle(N);

    } 
    
}
