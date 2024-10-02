// House class
class House {
    private final int numRooms;
    private final int numFloors;
    private final boolean hasPool;
    private final boolean hasGarage;

    // Private constructor to restrict instantiation
    private House(HouseBuilder builder) {
        this.numRooms = builder.numRooms;
        this.numFloors = builder.numFloors;
        this.hasPool = builder.hasPool;
        this.hasGarage = builder.hasGarage;
    }

    @Override
    public String toString() {
        return "House{" +
                "numRooms=" + numRooms +
                ", numFloors=" + numFloors +
                ", hasPool=" + hasPool +
                ", hasGarage=" + hasGarage +
                '}';
    }

    // Builder class
    static class HouseBuilder {
        private int numRooms;
        private int numFloors;
        private boolean hasPool;
        private boolean hasGarage;

        // Method to set the number of rooms
        public HouseBuilder setNumRooms(int numRooms) {
            this.numRooms = numRooms;
            return this;
        }

        // Method to set the number of floors
        public HouseBuilder setNumFloors(int numFloors) {
            this.numFloors = numFloors;
            return this;
        }

        // Method to set if it has a pool
        public HouseBuilder setHasPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        // Method to set if it has a garage
        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        // Build method to create the House object
        public House build() {
            return new House(this);
        }
    }
}

// Test class
public class Builder {
    public static void main(String[] args) {
        // Create a House using the Builder
        House house = new House.HouseBuilder()
                .setNumRooms(3)
                .setNumFloors(2)
                .setHasPool(true)
                .setHasGarage(false)
                .build();

        // Print the created House
        System.out.println(house);
    }
}
