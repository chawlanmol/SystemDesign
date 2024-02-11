package Utilities;
import DesignPatterns.Adapter.AdapterPatternDemo;
import DesignPatterns.BuilderPattern.DogBuilderDemo;
import DesignPatterns.CommandPattern.User;
import DesignPatterns.Decorator.PizzaDecorator.DecoratorDemo;
import DesignPatterns.ObserverPattern.ObserverStoreDemo;
import DesignPatterns.ProxyDesignPattern.ProxyPatternDemo;
import DesignPatterns.Stratergy.VehicleExample.VehicleDemo;
import DesignPatterns.StateDesingPattern.DesignAtm.AtmRoom;
import Problems.DesignHashMap.HashMapDemo;
import Problems.SnakeAndLadder.GameDemo;

public class DemoUtil {

   public static void invokeAdapterPatternDemo() {
        AdapterPatternDemo adapterPatternDemo = new AdapterPatternDemo();
        adapterPatternDemo.Demo();
    }
    public static void  invokeDecoratorpattern() {
        DecoratorDemo decoratorDemo = new DecoratorDemo();
        decoratorDemo.Demo();
    }
    public static void invokeStratergyPatternDemo() {
        HashMapDemo hashMapDemo = new HashMapDemo();
        hashMapDemo.Demo();
    }

    public static void invokeAtmDesignStatePattern() {
        AtmRoom atmRoom = new AtmRoom();
        atmRoom.Demo();;
    }

    public static void dogBuilderDemo() {
        DogBuilderDemo dogBuilderDemo = new DogBuilderDemo();
        dogBuilderDemo.Demo();
    }

    public static void vehicleStratergyPattern(){
        VehicleDemo vehicleDemo = new VehicleDemo();
        vehicleDemo.Demo();;
    }

    public static void ObserverPatternDemo(){
        ObserverStoreDemo observerStoreDemo = new ObserverStoreDemo();
        observerStoreDemo.Demo();
    }

    public static void CommandPatterDemo() {
        User user = new User();
        user.Demo();
    }

    public static void snakeAndLadder() {
        GameDemo gameDemo = new GameDemo();
        gameDemo.Demo();
    }

    public static void ProxyPattern() {
        new ProxyPatternDemo().Demo();;
    }
}
