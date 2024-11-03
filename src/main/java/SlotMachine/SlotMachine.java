package SlotMachine;
import java.lang.*;
import java.util.Arrays;
public class SlotMachine {
    int random;
    int[] array = new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,4,4,4,4,4,4,4,4,4,4,5,5,5,5,5};
    static int[] slot = new int[5];
    static int counter = 1;
    public void slotMachine() {
        for (int i = 0; i < 5; i++) {
            random = (int) (Math.random()*100);
            slot[i]= array[random];
        }
        System.out.println(Arrays.toString(slot));
    }
    void winningCheck(){
        for (int i = 1; i < slot.length; i++) {
            if (slot[i] == slot[i - 1] && slot[i] == slot[0] ) {
                counter++;
            }
            if(slot[i] != slot[0])
                break;
        }

    }
}

