package p184n22;

import static p184n22.Money.*;

public class Main {
    public static void main(String[] args) {
        PurchasingPower euro = new PurchasingPower(EURO.name());
        euro.money();
        PurchasingPower rubl = new PurchasingPower(RUBLES.name());
        rubl.money();

    }
}
class PurchasingPower{
    Money purchasingPower;
    PurchasingPower (String purchasingPower){
        this.purchasingPower = Money.valueOf(purchasingPower);
    }
    void money(){
        System.out.println("Purchasing power ");
        switch (purchasingPower){
            case LIRA:
                System.out.println("super low");
                break;
            case RUBLES:
                System.out.println("low");
                break;
            case EURO:
            case DOLLARS:
            case FRANC:
            case POUND:
            default:
                System.out.println("strong");
        }
    }
}
