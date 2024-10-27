package P99n3;
class LevelCapacity {
    float watt;
}
public class P99n3 {
    static void capacity(LevelCapacity levelCapacity){
        levelCapacity.watt = 1300.0F;
    }
    public static void main(String[] args) {
        LevelCapacity max = new LevelCapacity();
        max.watt = 1200.0F;
        System.out.println("Capacity level = " + max.watt + " MW");
        capacity(max);
        System.out.println("Capacity level = " + max.watt + " MW");
    }
}
