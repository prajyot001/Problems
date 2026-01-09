
package ArrayList;

import java.io.*;
import java.util.*;

public class Problem1 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        
        ArrayList<ArrayList> arrayLists=new ArrayList<>();
        
        while(n-- >0){
            int n1=in.nextInt();
            ArrayList<Integer> arraylist=new ArrayList<>();
            while(n1-->0){
                arraylist.add(in.nextInt());
            }
            arrayLists.add(arraylist);
        }

        int q=in.nextInt();
        while(q-- >0){
            int x=in.nextInt();
            int y=in.nextInt();
            try{
                System.out.println(arrayLists.get(x-1).get(y-1));
            }catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
