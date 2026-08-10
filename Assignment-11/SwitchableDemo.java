interface Switchable {

    void turnOn();
}

class Light implements Switchable {

    String name;

    Light(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + ": Light is ON");
    }
}

class Fan implements Switchable {

    String name;

    Fan(String name) {
        this.name = name;
    }

    public void turnOn() {
        System.out.println(name + ": Fan is ON");
    }
}

public class SwitchableDemo {

    public static void main(String[] args) {

        Light light1 = new Light("Living Room Light");
        Light light2 = new Light("Bedroom Light");
        Fan fan1 = new Fan("Ceiling Fan");

        System.out.println("Device Status:");

        light1.turnOn();
        light2.turnOn();
        fan1.turnOn();
    }
}