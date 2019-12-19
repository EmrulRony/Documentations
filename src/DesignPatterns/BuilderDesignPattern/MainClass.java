package DesignPatterns.BuilderDesignPattern;

class Mobile {

    String RAM;
    String Storage;
    boolean isBluetoothEnabled;
    boolean isNFCEnabled;

    public Mobile(){

    }

    public Mobile(MobileBuilder builder) {
        this.RAM = builder.RAM;
        this.Storage = builder.Storage;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isNFCEnabled = builder.isNFCEnabled;
    }

    public void printMobile() {
        System.out.println(" RAM: " + RAM + "\n Storage: " + Storage + "\n isBluetoothEnabled: " + isBluetoothEnabled
                + "\n isNFCEnabled: " + isNFCEnabled);
    }

    static class MobileBuilder {
        String RAM;
        String Storage;
        boolean isBluetoothEnabled;
        boolean isNFCEnabled;

        MobileBuilder(String RAM, String Storage) {
            this.RAM = RAM;
            this.Storage = Storage;
        }

        public MobileBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public MobileBuilder setNFCEnabled(boolean isNFCEnabled) {
            this.isNFCEnabled = isNFCEnabled;
            return this;
        }

        public Mobile build() {
            return new Mobile(this);
        }
    }
}

public class MainClass {
    public static void main(String[] args) {
        // Mobile mobile = new Mobile.MobileBuilder("8GB", "128GB").setBluetoothEnabled(true).setNFCEnabled(true).build();
        // mobile.printMobile();

        Mobile mobile = new Mobile.MobileBuilder("8GB", "128GB").setBluetoothEnabled(true).setNFCEnabled(true).build();
        mobile.printMobile();

    }
}