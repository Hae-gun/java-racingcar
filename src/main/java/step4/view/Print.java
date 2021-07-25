package step4.view;

import step4.model.Car;

import java.util.List;

public class Print {

    public static void print(String message){
        System.out.println(message);
    }

    public static void print(List list){
        for(Object item : list){
            print(item.toString());
        }
    }

    public static void print(Integer... count){
        for (Integer integer : count) {
            print(ToDash.positionToDash(integer));
        }
    }

    public static void print(Car... cars){
        for(Car car : cars){
            print(car);
        }
    }

}
