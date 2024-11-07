package p254n12;

class Hamster extends Rodent {
    Hamster(){
        System.out.println("БУ. ИСПУГАЛСЯ, НЕ БОЙСЯ. Я ДРУГ! ПОДОЙДИ КО МНЕ.");
    }
     @Override
     void voice() {
         System.out.println("Какой звук, я от любого звука кони двигаю");
     }

     @Override
     public String toString() {
         return "Hamster";
     }

     @Override
     void eat() {
         System.out.println("Ну я крутой, я ем деньги");
     }
 }
