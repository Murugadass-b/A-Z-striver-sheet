

public class Patterns {

    public void rectangularSquarePattern(int n){

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rightAngledTriangleStar(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rightAngledTriangleNumbers(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void invertedRightAngledTriangleStar(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void invertedRightAngledTriangleNumber(int n){
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void pyramid(int n){
        for(int i = 0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            for(int s=0;s<i;s++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void invertedPyramid(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print("*");
            }
            for(int s=i-1;s>0;s--){
                System.out.print("*");
            }
            // System.out.print('*');
            System.out.println();
        }
    }

    public void diamond(Patterns p,int n){
        p.pyramid(n);
        p.invertedPyramid(n);
    }

    public void halfDiamond(int n){
        for(int i=0;i<n;i++){

            for(int j=0;j<=n+i-n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int k=n;k>0;k--){
            for(int s=k-1;s>0;s--){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Patterns p = new Patterns();


        //p.rectangularSquarePattern(5);
        // p.rightAngledTriangleStar(5);
        // p.rightAngledTriangleNumbers(5);
        // p.invertedRightAngledTriangleStar(5);
        // p.invertedRightAngledTrian1gleNumber(5);
        // p.pyramid(5);
        // p.invertedPyramid(5);
        // p.diamond(p,5);
        p.halfDiamond(5);
    }
}
