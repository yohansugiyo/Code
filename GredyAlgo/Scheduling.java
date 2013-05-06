/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yohan Sugiyo
 */
import java.util.Scanner;
public class Scheduling {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int kasus = sc.nextInt();
        int n=0;
        int t1=0;
        int t2=0;
        SchedulingTester sch = new SchedulingTester();
        for(int c=0;c<kasus;c++){
            n = sc.nextInt();
            int time[][] = new int[n][2];
            for(int i=0;i<n;i++){
                t1=sc.nextInt();
                t2=sc.nextInt();
                time[i][0]=t1;
                time[i][1]=t2;
            }
        }
    }
}
//no 2 ASD2
