
class Shop {
    String name;
    String location;
    String ownerName;
    String openingHours;

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    String getLocation() {
        return location;
    }
    void setLocation(String location) {
        this.location = location;
    }

    String getOwnerName() {
        return ownerName;
    }
    void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    String getOpeningHours() {
        return openingHours;
    }
    void setOpeningHours(String openingHours) {
        this.openingHours = openingHours;
    }

    Shop() {
        this.name = "not given";
        this.location = "not given";
        this.ownerName = "not given";
        this.openingHours = "not given";
    }

    Shop(String name, String location, String ownerName, String openingHours) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
        this.openingHours = openingHours;
    }

    void display() {
        System.out.println(this.name);
        System.out.println(this.location);
        System.out.println(this.ownerName);
        System.out.println(this.openingHours);
    }
}

// Subclass: ClothShop
class ClothShop extends Shop {
    int noOfBrands;
    boolean isTrialRoom;

    int getNoOfBrands() {
        return noOfBrands;
    }
    void setNoOfBrands(int noOfBrands) {
        this.noOfBrands = noOfBrands;
    }

    boolean getIsTrialRoom() {
        return isTrialRoom;
    }
    void setIsTrialRoom(boolean isTrialRoom) {
        this.isTrialRoom = isTrialRoom;
    }

    ClothShop() {
        super();
        this.noOfBrands = 0;
        this.isTrialRoom = false;
    }

    ClothShop(String name, String location, String ownerName, String openingHours, int noOfBrands, boolean isTrialRoom) {
        super(name, location, ownerName, openingHours);
        this.noOfBrands = noOfBrands;
        this.isTrialRoom = isTrialRoom;
    }

    void display() {
        super.display();
        System.out.println(this.noOfBrands);
        System.out.println(this.isTrialRoom);
    }
}

// Subclass: GroceryShop
class GroceryShop extends Shop {
    boolean deliveryAvailable;
    boolean isFreshItem;

    boolean getDeliveryAvailable() {
        return deliveryAvailable;
    }
    void setDeliveryAvailable(boolean deliveryAvailable) {
        this.deliveryAvailable = deliveryAvailable;
    }

    boolean getIsFreshItem() {
        return isFreshItem;
    }
    void setIsFreshItem(boolean isFreshItem) {
        this.isFreshItem = isFreshItem;
    }

    GroceryShop() {
        super();
        this.deliveryAvailable = false;
        this.isFreshItem = false;
    }

    GroceryShop(String name, String location, String ownerName, String openingHours, boolean deliveryAvailable, boolean isFreshItem) {
        super(name, location, ownerName, openingHours);
        this.deliveryAvailable = deliveryAvailable;
        this.isFreshItem = isFreshItem;
    }

    void display() {
        super.display();
        System.out.println(this.deliveryAvailable);
        System.out.println(this.isFreshItem);
    }
}

// Subclass: ElectronicShop
class ElectronicShop extends Shop {
    String gadgetType;
    boolean warrantyService;

    String getGadgetType() {
        return gadgetType;
    }
    void setGadgetType(String gadgetType) {
        this.gadgetType = gadgetType;
    }

    boolean getWarrantyService() {
        return warrantyService;
    }
    void setWarrantyService(boolean warrantyService) {
        this.warrantyService = warrantyService;
    }

    ElectronicShop() {
        super();
        this.gadgetType = "not given";
        this.warrantyService = false;
    }

    ElectronicShop(String name, String location, String ownerName, String openingHours, String gadgetType, boolean warrantyService) {
        super(name, location, ownerName, openingHours);
        this.gadgetType = gadgetType;
        this.warrantyService = warrantyService;
    }

    void display() {
        super.display();
        System.out.println(this.gadgetType);
        System.out.println(this.warrantyService);
    }
}

// Demo class
public class ShopDemo {
    public static void main(String[] args) {
        Shop s1 = new Shop();
        s1.display();

        ClothShop cs1 = new ClothShop("Fashion Hub", "Mumbai", "Pooja", "10 AM - 9 PM", 15, true);
        cs1.display();

        GroceryShop gs1 = new GroceryShop("Daily Needs", "Pune", "Raj", "8 AM - 10 PM", true, true);
        gs1.display();

        ElectronicShop es1 = new ElectronicShop("Tech World", "Hyderabad", "Sahil", "10 AM - 8 PM", "Mobile, Laptop", true);
        es1.display();
    }
}

