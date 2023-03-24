package GenericInterface;

public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent() {
        return new Home(); //리턴타입이 반드시 Home이어야 함
    }
}
