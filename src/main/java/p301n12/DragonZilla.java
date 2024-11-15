package p301n12;

public class DragonZilla {
    DangerousMonster dangerousMonster(){
        return new DangerousMonster() {
            @Override
            public void menace() {
                System.out.println("RRRRRRR");
            }
            public void destroy(){
                System.out.println("AAAAAAAA");
            }
        };
    }
}
