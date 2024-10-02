interface Transport {
    void deliver();
}

class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by land using a truck.");
    }
}

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by water using a ship.");
    }
}

class Drone implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by air using a drone.");
    }
}

abstract class TransportFactory {
    public abstract Transport createTransport();
}

class LandTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

class WaterTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}

class AirTransportFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Drone();
    }
}

public class FactoryMethod {
    public static void main(String[] args) {
        TransportFactory factory;


        factory = new WaterTransportFactory();
        Transport transport = factory.createTransport();
        transport.deliver();


        factory = new LandTransportFactory();
        transport = factory.createTransport();
        transport.deliver();


        factory = new AirTransportFactory();
        transport = factory.createTransport();
        transport.deliver();
    }
}
