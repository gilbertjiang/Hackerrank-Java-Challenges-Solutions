//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class hashMap{
    public static void main(String []argh){
        HashMap<String,Integer> hm=new HashMap<String,Integer>(); 
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hm.put(name,phone);
            // Write code here
        }
        while(in.hasNext()){
            String s = in.next();
            
            if (hm.containsKey(s))
            {
                System.out.println(s+"="+hm.get(s));
            }
            else
                System.out.println("Not found");    
            // Write code here
        }
        in.close();
    }
}