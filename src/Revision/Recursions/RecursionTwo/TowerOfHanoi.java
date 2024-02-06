package Revision.Recursions.RecursionTwo;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int disks = 3;
        char source = 'A';
        char auxiliary = 'B';
        char destination = 'C';
        towerOfHanoi(disks,source,auxiliary,destination);
    }
    public static void towerOfHanoi(int disks, char source, char auxiliary, char destination){
        if(disks==0) {
            return;
        }
        if(disks==1){
            System.out.println("Move" + " 1st from " + source + " to " + destination);
            return;
        }
        towerOfHanoi(disks-1,source,destination,auxiliary);
        System.out.println("Move " + disks+ "st from " + source + " to " + destination);
        towerOfHanoi(disks-1,auxiliary,source,destination);
    }
}
