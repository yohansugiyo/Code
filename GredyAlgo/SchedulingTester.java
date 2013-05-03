/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yohan Sugiyo
 */
public class SchedulingTester {
    private int arr[][];
    
    public SchedulingTester(){
    }

    /**
     * @return the arr
     */
    public int[][] getArr() {
        return arr;
    }

    /**
     * @param arr the arr to set
     */
    public void setArr(int[][] arr) {
        this.arr = arr;
    }
    
    public String calc(){
        String s = new String();
        s+= "Acara pernikaha yang dipilih: ";
        int temp=0;
        for(int c=0;c<arr.length;c++){
            if(arr[c][0]==temp || arr[c][0]>temp){
                s+= c + " ";
                temp = arr[c][1];
            }
        }
        return s;
    }
}
