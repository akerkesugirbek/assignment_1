// Transport interface
interface Transport {
    void deliver();
}

// Truck class
class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by land using a truck.");
    }
}

// Ship class
class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by water using a ship.");
    }
}

// Drone class
class Drone implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivery by air using a drone.");
    }
}

// Factory Method pattern
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

// Test class
public class FactoryMethod {
    public static void main(String[] args) {
        TransportFactory factory;

        // Example: Water delivery
        factory = new WaterTransportFactory();
        Transport transport = factory.createTransport();
        transport.deliver();  // Output: Delivery by water using a ship.

        // Example: Land delivery
        factory = new LandTransportFactory();
        transport = factory.createTransport();
        transport.deliver();  // Output: Delivery by land using a truck.

        // Example: Air delivery
        factory = new AirTransportFactory();
        transport = factory.createTransport();
        transport.deliver();  // Output: Delivery by air using a drone.
    }
}
