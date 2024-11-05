package p222n14;

public class Car {
    public Engine engine = new Engine();
    public Wheel[] wheels = new Wheel[4];
    public Door left = new Door();
    public Door right = new Door();
    public Car(){
        for (int i = 0; i < 4; i++) {
            wheels[i] = new Wheel();
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.left.window.rollup();
        car.wheels[0].inflate(72);
        car.engine.service();
    }
}
class Engine{
    public void start(){
        System.out.println("Заупстить");
    }
    public void rev(){
        System.out.println("Переключить");
    }
    public void stop(){
        System.out.println("Остановить");
    }
    public void service(){
        System.out.println("Обслужить");
    }
}
class Wheel{
    public void inflate(int i){
        System.out.println("Накачать" + i);
    }
}
class Window{
    public void rollup(){
        System.out.println("Поднять");
    }
    public void rolldown(){
        System.out.println("Опустить");
    }
}
class Door{
    public Window window = new Window();
    public void open(){
        System.out.println("Открыть");
    }
    public void close(){
        System.out.println("Закрыть");
    }
}
