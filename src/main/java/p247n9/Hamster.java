package p247n9;

 class Hamster extends Rodent {
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
