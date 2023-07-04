package DSAInJAVA.OOPSOne;

public class DynamicArray {
    private int data[];
    private int nextElementIndex;

    public DynamicArray() {
        data = new int[5];
        nextElementIndex = 0;
    }

    public void add(int element) {
        if(nextElementIndex== data.length){
            doubleArray();
        }
        data[nextElementIndex] = element;
        nextElementIndex++;
    }

    private void doubleArray() {
        int temp[] = data;
        data = new int[2*data.length];
        for(int i=0;i<temp.length;i++){
            data[i] = temp[i];
        }
    }

    public int size() {
        return nextElementIndex;
    }
    public int get(int index) {
        if(index>nextElementIndex){
            return -1;
        }
        return data[index];
    }
    public void set(int index, int num) {
        if(index>=nextElementIndex){
            return;
        }
        data[index] = num;
    }
    public boolean isEmpty() {
        return nextElementIndex==0;
    }
    public int removeLast() {
        if(nextElementIndex==0){
            return -1;
        }
        int lastElement = data[nextElementIndex-1];
        nextElementIndex--;
        return lastElement;

    }
    public void addNew(int index, int element) {
        if(index>=nextElementIndex){
            return;
        }
        int temp[] = data;
        data = new int[2*data.length];
        for(int i=0;i<temp.length;i++){
            if(i==index){
                data[i] = element;
            }
            else {
                data[i] = temp[i];
            }
        }
    }

    //getters and setters
    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getNextElementIndex() {
        return nextElementIndex;
    }

    public void setNextElementIndex(int nextElementIndex) {
        this.nextElementIndex = nextElementIndex;
    }
}
