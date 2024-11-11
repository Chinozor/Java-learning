package p255n15;

class Hamster extends Rodent {
    private static int count = 0;
    private final int id = count++;
    private Voice voice = new Voice("Я хомяк " + id);
    Hamster(){
        System.out.println("Бу! Испугался? Не бойся, я друг, я тебя не обижу. " +
                "Иди сюда, иди ко мне, сядь рядом со мной, посмотри мне в глаза." +
                " Ты видишь меня? Я тоже тебя вижу." +
                " Давай смотреть друг на друга до тех пор, пока наши глаза не устанут." +
                " Ты не хочешь? Почему? Что-то не так?");
    }
    private Eat eat = new Eat("Корм");
 }
