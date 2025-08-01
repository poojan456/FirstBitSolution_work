package p1;
import java.util.*;

interface DeviceInterface {
    void turnOn(int time);
    void turnOff();
    String getStatus();
}

abstract class Device implements DeviceInterface {
    String name;
    boolean isOn;
    int totalTime;

    Device(String name) {
        this.name = name;
        this.isOn = false;
        this.totalTime = 0;
    }

    public void turnOn(int time) {
        if (isOn==false) {
            isOn = true;
            totalTime += time;
        }
    }

    public void turnOff() {
        if (isOn==true) 
        	isOn = false;
    }

    public String getStatus() {
        if (isOn==true) {
            return name + " is ON for " + totalTime + " mins.";
        } else {
            return name + " is OFF.";
        }
    }
}

class Fan extends Device {
    int speed;

    Fan(String name) {
        super(name);
        this.speed = 0;
    }

    @Override
    public void turnOn(int time) {
        super.turnOn(time);
        this.speed = 3;
    }

    @Override
    public void turnOff() {
        super.turnOff();
        this.speed = 0;
    }

    @Override
    public String getStatus() {
        return isOn ? name + " is ON at speed " + speed : name + " is OFF.";
    }
}

class Light extends Device {
    Light(String name) {
        super(name);
    }
}

class AC extends Device {
    int temperature;
    String mode;

    AC(String name) {
        super(name);
        this.temperature = 24;
        this.mode = "Cool";
    }

    @Override
    public void turnOn(int time) {
        super.turnOn(time);
        this.temperature = 22;
        this.mode = "Cool";
    }

    @Override
    public String getStatus() {
        return isOn ? name + " is ON at " + temperature + "°C in " + mode + " mode." : name + " is OFF.";
    }
}

class TV extends Device {
    String channel;

    TV(String name) {
        super(name);
        this.channel = "News";
    }

    @Override
    public void turnOn(int time) {
        super.turnOn(time);
        this.channel = "Pogo";
    }

    @Override
    public String getStatus() {
        return isOn ? name + " is ON showing " + channel + "." : name + " is OFF.";
    }
}

class WifiRouter extends Device {
    int speed;

    WifiRouter(String name) {
        super(name);
        this.speed = 0;
    }

    @Override
    public void turnOn(int time) {
        super.turnOn(time);
        this.speed = 100;
    }

    @Override
    public void turnOff() {
        super.turnOff();
        this.speed = 0;
    }

    @Override
    public String getStatus() {
        return isOn ? name + " is ON with speed " + speed + " Mbps." : name + " is OFF.";
    }
}

class Gyser extends Device {
    Gyser(String name) {
        super(name);
    }
}

class WashingMachine extends Device {
    WashingMachine(String name) {
        super(name);
    }
}

class Room {
    String name;
    ArrayList<Device> devices = new ArrayList<Device>();

    Room(String name) {
        this.name = name;
    }

    void addDevice(Device d) {
        devices.add(d);
    }
    void showDevices() {
        int i = 1;
        for (Device d : devices) {
            System.out.println(i + ". " + d.name);
            i++;
        }
    }

    
    Device getDevice(int i) {
        return devices.get(i);
    }
}

public class SmartApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Room bedroom = new Room("Bedroom");
        bedroom.addDevice(new Light("Light"));
        bedroom.addDevice(new AC("AC"));
        bedroom.addDevice(new Fan("Fan"));

        Room kitchen = new Room("Kitchen");
        kitchen.addDevice(new Light("Light"));
        kitchen.addDevice(new Fan("Fan"));

        Room hall = new Room("Hall");
        hall.addDevice(new TV("TV"));
        hall.addDevice(new Fan("Fan"));
        hall.addDevice(new Light("Light"));
        hall.addDevice(new AC("AC"));
        hall.addDevice(new WifiRouter("WiFi Router"));

        Room washroom = new Room("Washroom");
        washroom.addDevice(new Gyser("Gyser"));
        washroom.addDevice(new Light("Light"));
        washroom.addDevice(new WashingMachine("Washing Machine"));

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(bedroom);
        rooms.add(kitchen);
        rooms.add(hall);
        rooms.add(washroom);

        while (true) {
            System.out.println("Choose Room:");
            for (int i = 0; i < rooms.size(); i++) {
                System.out.println((i + 1) + ". " + rooms.get(i).name);
            }
            System.out.println("0. Exit");
            int roomChoice = sc.nextInt();
            if (roomChoice == 0) 
            	break;

            Room selectedRoom = rooms.get(roomChoice - 1);
            while (true) {
                System.out.println("\nDevices in " + selectedRoom.name + ":");
                selectedRoom.showDevices();
                System.out.println("0. Go back to rooms");
                int deviceChoice = sc.nextInt();
                if (deviceChoice == 0) break;
                Device d = selectedRoom.getDevice(deviceChoice - 1);
                System.out.println("1. View Status\n2. Turn ON\n3. Turn OFF\n0. Back");
                int action = sc.nextInt();
                if (action == 1) {
                    System.out.println(d.getStatus());
                } else if (action == 2) {
                    System.out.print("Enter time in mins: ");
                    int t = sc.nextInt();
                    if (!d.isOn) {
                        d.turnOn(t);
                        System.out.println(d.name + " turned ON.");
                    } else {
                        System.out.println(d.name + " is already ON.");
                    }
                }else if (action == 3) {
                    if (d.isOn) {
                        d.turnOff();
                     
                        System.out.println(d.name + " turned OFF.");
                    } else {
                        System.out.println(d.name + " is already OFF.");
                    }
                }
            }
        }
        
    }
}

