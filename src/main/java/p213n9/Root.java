package p213n9;

public class Root {
    Component1 c1Root;
    Component2 c2Root;
    Component3 c3Root;
    Root(){
        System.out.println("Root()");
    }
}
class Component1{
    Component1(){
        System.out.println("Component1");
    }
}
class Component2{
    Component2(){
        System.out.println("Component2");
    }
}
class Component3{
    Component3(){
        System.out.println("Component3");
    }
}