package Revision.OOPS;

public class DynamicArray {
    private int [] arr ;
    private int nextElement ;
    public DynamicArray(){
        arr = new int[5];
        nextElement = 0;
    }
    public int get(int index) {
        if(index >= nextElement)return -1;
        return arr[index];
    }
    public int size() {return nextElement;}
    public boolean isEmpty() {return nextElement == 0;}
    public void set(int pos,int num) {
        while(pos>=nextElement){return;}
        arr[pos] = num;
    }
    public void add(int element) {
        if(nextElement==arr.length){doubleArray();}
        arr[nextElement]=element;
        nextElement++;
    }
    public void adds(int index, int element) {
        if (index >= nextElement) {
            return;
        }
        int temp[] = arr;
        arr = new int[2 * arr.length];
        for (int i = 0; i < temp.length; i++) {
            if (i == index) {
                arr[i] = element;
            } else {
                arr[i] = temp[i];
            }
        }
    }
    public int removeLast() {
        if (nextElement==0){
            return -1;
        }
        int numb = arr[nextElement-1];
        nextElement--;
        return numb;
    }
    private void doubleArray() {
        int[] temp = arr;
        arr = new int[2*arr.length];
        System.arraycopy(temp, 0, arr, 0, temp.length);
    }
}
