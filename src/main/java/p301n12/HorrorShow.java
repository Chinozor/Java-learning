package p301n12;

public class HorrorShow {
    static void u(Monster b){
        b.menace();
    }
    static void  v(DangerousMonster d){
        d.menace();
        d.destroy();
    }
    static void w(Lethal l){
        l.kill();
    }

    public static void main(String[] args) {
        DragonZilla b = new DragonZilla();
        DangerousMonster barney = b.dangerousMonster();
        u(barney);
        v(barney);
        VeryBadVampire v = new VeryBadVampire();
        Vampire vlad= v.vampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
