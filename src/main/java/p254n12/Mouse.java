package p254n12;

class Mouse extends Rodent {
    Mouse(){
        System.out.println("Я танк, что я здесь забыл?");
    }
    private  Voice voice = new Voice("Я пищу");
    private Eat eat = new Eat("Я ем сыр");
}
