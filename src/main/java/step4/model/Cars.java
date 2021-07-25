package step4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars{

    private List<Car> carList;
    private CarsStrategy carsMethod;

    public Cars(CarsStrategy carsMethod) {
        this.carsMethod = carsMethod;
    }

    public void makeCars(int carCount) {
        carList = new ArrayList<Car>();

        for (int i = 0; i < carCount; i++) {
            carList.add(new Car());
        }
    }

    public void makeCars(String[] cars) {
        carList = new ArrayList<Car>();

        for(String name : cars){
            carList.add(new Car(name));
        }
    }

    public List<Car> getCarList() {
        stateCheck();
        return this.carList;
    }

    public void moveCars() {
        stateCheck();
        carsMethod.move(this);
    }

    public void stateCheck() {
        if (carList == null || carList.size() == 0) {
            throw new IllegalStateException("자동차를 먼저 생성해 주세요.");
        }
    }

    public List<Car> arrangeCars() {
        stateCheck();
        carList = this.carsMethod.arrange(this.carList);
        return carList;
    }
}
