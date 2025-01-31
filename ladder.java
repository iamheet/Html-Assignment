import java.util.*;
public class ladder {
    public static void main(String args[]){

       int a,b,c,d;
       Scanner ds=new Scanner(System.in);
       System.out.println("Enter the value of A");
       a=ds.nextInt();
        System.out.println("Enter the value of B");
        b=ds.nextInt();
        System.out.println("Enter the value of C");
        c=ds.nextInt();
        System.out.println("Enter the value of D");
        d=ds.nextInt();


        if(a>b) {

            if (a > c) {

                if (a > d) {
                    System.out.println("A is max");
                } else {
                    System.out.println("D is Max");
                }
            }
        }

        else {

            if(b>c){


                if(b>c){
                    System.out.println("B is Max");
                }

                else{
                    System.out.println("C is Max");
                }
            }

            else {

                if(c>d){
                    System.out.println("C is max");
                }
                else{
                    System.out.println(" D is Max");
                }
            }
        }


















    }





















}
