package p301n12;

public class VeryBadVampire {
    Vampire vampire(){
        return new Vampire() {
            @Override
            public void kill() {
                System.out.println("Я убийца");
            }

            @Override
            public void drinkBlood() {
                System.out.println("Я пью кровь");
            }

            @Override
            public void destroy() {
                System.out.println("Я разрушитель");
            }

            @Override
            public void menace() {
                System.out.println("ЬЬЬЬЬ");
            }
        };
    }
}
