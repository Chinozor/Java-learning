package p254n12;

class Hamster extends Rodent {
    private Voice voice = new Voice("Я хомяк");
    Hamster(){
        System.out.println("Бу! Испугался? Не бойся, я друг, я тебя не обижу. " +
                "Иди сюда, иди ко мне, сядь рядом со мной, посмотри мне в глаза." +
                " Ты видишь меня? Я тоже тебя вижу." +
                " Давай смотреть друг на друга до тех пор, пока наши глаза не устанут." +
                " Ты не хочешь? Почему? Что-то не так?");
    }
    private Eat eat = new Eat("Корм");
 }