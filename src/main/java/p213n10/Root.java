package p213n10;

public class Root {
    Component1 c1Root;
    Component2 c2Root;
    Component3 c3Root;
    Root(int i){
        System.out.println("Root()");
    }
}
class Component1{
    Component1(int i){
        System.out.println("Component1");
    }
}
class Component2{
    Component2(int i){
        System.out.println("Component2");
    }
}
class Component3{
    Component3(int i){
        System.out.println("Component3");
    }
}