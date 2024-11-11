package p255n15;

class Mouse extends Rodent {
    private static int count = 0;
    private final int id = count++;
    Mouse(){
        System.out.println("Я танк, что я здесь забыл? " + id);
    }
    private Voice voice = new Voice("Я пищу");
    private Eat eat = new Eat("Я ем сыр");
}
