import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        List<Integer> lista = new ArrayList<Integer>();
        int control = 0;

        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int j=0; j<n; j++){
                if(j==0){
                    control += (a + (int)(Math.pow(2,j)*b));
                }else{
                    control += (int)(Math.pow(2,j)*b);
                }
                lista.add(control);
            }

            for(int k=0; k<lista.size(); k++){
                System.out.print(lista.get(k) + " ");
            }

            control=0;
            lista.clear();
            System.out.println();
        }
        in.close();
    }
}
