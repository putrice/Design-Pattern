package adapterPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Test {
	public static int m,n,k,q,i=0,c=0;
    public static int errorflag = 0;
    public static int array[];
    public static int rotated[];
    public static Scanner in = new Scanner(System.in);
	
	public static int[] getArray(int n){
        array = new int[n];
        for(i=0;i<n;i++){
            array[i] = in.nextInt();
        }       
        return(array);
    }

    public static int[] rotate(int[] original){
        int[] rotated = new int[original.length];
        for(i=0;i<original.length;i++){
            rotated[(i+k)%original.length] = original[i];
        }
        return(rotated);
    }
	
	public static void main(String[] args) {
		int f=1, i=2;
		while(++i<5)
		   f*=i;
		System.out.println(f);
    }
}
