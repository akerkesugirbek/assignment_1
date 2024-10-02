class House {
    private final int numRooms;
    private final int numFloors;
    private final boolean hasPool;
    private final boolean hasGarage;

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

    static class HouseBuilder {
        private int numRooms;
        private int numFloors;
        private boolean hasPool;
        private boolean hasGarage;


        public HouseBuilder setNumRooms(int numRooms) {
            this.numRooms = numRooms;
            return this;
        }

        public HouseBuilder setNumFloors(int numFloors) {
            this.numFloors = numFloors;
            return this;
        }

        public HouseBuilder setHasPool(boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public HouseBuilder setHasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }
}


public class Builder {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .setNumRooms(3)
                .setNumFloors(2)
                .setHasPool(true)
                .setHasGarage(false)
                .build();

        System.out.println(house);
    }
}
