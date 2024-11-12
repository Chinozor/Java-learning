package p281n17;

public class MyName implements Name {
    String newName = "Женя";
}
class MyyName{
    void NewName(){
        System.out.println(Name.name);
        //System.out.println(MyName.newName); Не можем вывести, так как не является static.
        //Name.name = "Женя"; Не можем поменять, так как является final.
    }

    public static void main(String[] args) {
        MyyName yura = new MyyName();
        yura.NewName();
    }
}
//Сначала недооценивал, но прикольная легкая задачка