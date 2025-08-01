
class Ticket {
    int ticketNo;
    double price;
    String bookedDate;
    String passengerName;
    String contactNumber;

    int getTicketNo() {
        return ticketNo;
    }
    void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    double getPrice() {
        return price;
    }
    void setPrice(double price) {
        this.price = price;
    }

    String getBookedDate() {
        return bookedDate;
    }
    void setBookedDate(String bookedDate) {
        this.bookedDate = bookedDate;
    }

    String getPassengerName() {
        return passengerName;
    }
    void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    String getContactNumber() {
        return contactNumber;
    }
    void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    Ticket() {
        this.ticketNo = 0;
        this.price = 0.0;
        this.bookedDate = "not given";
        this.passengerName = "not given";
        this.contactNumber = "not given";
    }

    Ticket(int ticketNo, double price, String bookedDate, String passengerName, String contactNumber) {
        this.ticketNo = ticketNo;
        this.price = price;
        this.bookedDate = bookedDate;
        this.passengerName = passengerName;
        this.contactNumber = contactNumber;
    }

    void display() {
        System.out.println(this.ticketNo);
        System.out.println(this.price);
        System.out.println(this.bookedDate);
        System.out.println(this.passengerName);
        System.out.println(this.contactNumber);
    }
}

// Subclass: TrainTicket
class TrainTicket extends Ticket {
    String coachType;
    String berthType;

    String getCoachType() {
        return coachType;
    }
    void setCoachType(String coachType) {
        this.coachType = coachType;
    }

    String getBerthType() {
        return berthType;
    }
    void setBerthType(String berthType) {
        this.berthType = berthType;
    }

    TrainTicket() {
        super();
        this.coachType = "not given";
        this.berthType = "not given";
    }

    TrainTicket(int ticketNo, double price, String bookedDate, String passengerName, String contactNumber, String coachType, String berthType) {
        super(ticketNo, price, bookedDate, passengerName, contactNumber);
        this.coachType = coachType;
        this.berthType = berthType;
    }

    void display() {
        super.display();
        System.out.println(this.coachType);
        System.out.println(this.berthType);
    }
}

// Subclass: MovieTicket
class MovieTicket extends Ticket {
    String movieName;
    String showTime;

    String getMovieName() {
        return movieName;
    }
    void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    String getShowTime() {
        return showTime;
    }
    void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    MovieTicket() {
        super();
        this.movieName = "not given";
        this.showTime = "not given";
    }

    MovieTicket(int ticketNo, double price, String bookedDate, String passengerName, String contactNumber, String movieName, String showTime) {
        super(ticketNo, price, bookedDate, passengerName, contactNumber);
        this.movieName = movieName;
        this.showTime = showTime;
    }

    void display() {
        super.display();
        System.out.println(this.movieName);
        System.out.println(this.showTime);
    }
}

// Subclass: BusTicket
class BusTicket extends Ticket {
    String boardingPoint;
    String destinationPoint;

    String getBoardingPoint() {
        return boardingPoint;
    }
    void setBoardingPoint(String boardingPoint) {
        this.boardingPoint = boardingPoint;
    }

    String getDestinationPoint() {
        return destinationPoint;
    }
    void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    BusTicket() {
        super();
        this.boardingPoint = "not given";
        this.destinationPoint = "not given";
    }

    BusTicket(int ticketNo, double price, String bookedDate, String passengerName, String contactNumber, String boardingPoint, String destinationPoint) {
        super(ticketNo, price, bookedDate, passengerName, contactNumber);
        this.boardingPoint = boardingPoint;
        this.destinationPoint = destinationPoint;
    }

    void display() {
        super.display();
        System.out.println(this.boardingPoint);
        System.out.println(this.destinationPoint);
    }
}

// Demo class
public class TicketDemo {
    public static void main(String[] args) {
        Ticket t1 = new Ticket();
        t1.display();

        TrainTicket train1 = new TrainTicket(101, 750.0, "2025-07-09", "Pooja", "9876543210", "Sleeper", "Lower");
        train1.display();

        MovieTicket movie1 = new MovieTicket(202, 300.0, "2025-07-10", "Sahil", "9876543211", "3 Idiots", "6:30 PM");
        movie1.display();

        BusTicket bus1 = new BusTicket(303, 450.0, "2025-07-11", "Ravi", "9876543212", "Pune", "Mumbai");
        bus1.display();
    }
}

