

public class Patterns {

    public void rectangularSquarePattern(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rightAngledTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Patterns p = new Patterns();


        //p.rectangularSquarePattern(5);
        p.rightAngledTriangle(5);
    }
}
