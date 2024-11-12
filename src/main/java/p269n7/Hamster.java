package p269n7;

class Hamster implements Rodent {
     @Override
     public void voice() {
         System.out.println("Какой звук, я от любого звука кони двигаю");
     }

     @Override
     public String toString() {
         return "Hamster";
     }

     @Override
     public void eat() {
         System.out.println("Ну я крутой, я ем деньги");
     }
 }
