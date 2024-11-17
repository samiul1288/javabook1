package samiuljava;

import java.util.Scanner;

public class ch1ex6 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number: ");
    int n=scanner.nextInt();
    int sum=0;
    for(int i=1;i<=n;i++)
    {
        sum=sum+i;
    }
    System.out.println("The sum: "+sum);
}
}
