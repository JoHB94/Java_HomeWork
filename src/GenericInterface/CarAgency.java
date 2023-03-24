package GenericInterface;

public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent() {
        return new Car(); //리턴타입이 받느시 Car 여야 함
    }
}
