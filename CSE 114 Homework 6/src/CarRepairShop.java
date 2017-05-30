// Daniel Garcia
// SBU ID: *********
// CSE 114
// Homework 6

public class CarRepairShop {

    private int carCount = 0;
    private int ticketCount = 0;
    private Car[] vehicles = new Car[carCount + 1];
    private Ticket[] tickets = new Ticket[ticketCount + 1];

    public int addNewCar(String vin, String make, int year) {
        int i;
        Car[] temp = new Car[vehicles.length + 1];
        for (i = 0; i<vehicles.length; i++) {
            Car car = vehicles[i];
            if (car != null) {
                temp[i] = new Car(car);
            }
        }
        String VIN;
        for (i = 0; i<vehicles.length; i++) {
            if (vehicles[i] != null) {
                VIN = vehicles[i].getVin();
                if (VIN.equals(vin)) {
                    return -1;
                }
            }
        }
        temp[carCount] = new Car(vin, make, year);
        carCount++;
        vehicles = new Car[carCount + 1];
        for (i = 0; i<vehicles.length; i++) {
            Car car = temp[i];
            if (car != null) {
                vehicles[i] = new Car(car);
            }
        }
        return carCount;
    }

    public int addRepairTicket(String vin, double cost, String description) {
        int i, tempCount = 0;
        Ticket[] temp = new Ticket[tickets.length + 1];
        for (i = 0; i<tickets.length; i++) {
            Ticket ticket = tickets[i];
            if (ticket != null) {
                temp[i] = new Ticket(ticket);
            }
        }
        String VIN;
        for (i = 0; i<vehicles.length; i++) {
            if (vehicles[i] != null) {
                VIN = vehicles[i].getVin();
                if (VIN.equals(vin)) {
                    tempCount++;
                }
            }
        }
        if (tempCount==0) return -1;
        temp[ticketCount] = new Ticket(vin, cost, description);
        ticketCount++;
        tickets = new Ticket[ticketCount + 1];
        for (i = 0; i<tickets.length; i++) {
            Ticket ticket = temp[i];
            if (ticket != null) {
                tickets[i] = new Ticket(ticket);
            }
        }
        return ticketCount;
    }

    public double getRepairCost(int ticketNum) {
        if (ticketNum > tickets.length) return -1;
        if (ticketNum <= 0) return -1;
        if (tickets[ticketNum-1] != null)  {
            double cost = tickets[ticketNum - 1].getCost();
            return cost;
        }
        else return -1;
    }

    public double getTotalRepairCosts(String vin) {
        int noCarCheck = 0, i;
        for (i = 0; i<vehicles.length - 1; i++) {
            if (vehicles[0] == null) {
                if (vehicles[i].getVin().equals(vin)) {
                    noCarCheck++;
                }
            }
        }
        if (noCarCheck == 0) return -1;
        double cost = 0;
        for (i = 0; i<tickets.length - 1; i++) {
            if (tickets[i] != null) {
                if (tickets[i].getVin().equals(vin)) {
                    cost += tickets[i].getCost();
                }
            }
        }
        return cost;
    }

    public String getWorstCarMake() {
        int carCheck = 0, i, count = 0, j, tempCount;
        String vin, element = "", tempElement, make = "";
        String[] ticketArray = new String[tickets.length - 1];
        for (i = 0; i<vehicles.length - 1; i++) {
            if (vehicles[i] != null) carCheck++;
        }
        if (carCheck == 0) return null;
        for (i = 0; i<tickets.length - 1; i++) {
            if (tickets[i] != null) {
                vin = tickets[i].getVin();
                ticketArray[i] = vin;
            }
        }
        for (i = 0; i<ticketArray.length; i++) {
            tempElement = ticketArray[i];
            tempCount = 0;
            for (j = 0; j<ticketArray.length; j++) {
                if (ticketArray[j].equals(tempElement)) tempCount++;
            }
            if (tempCount > count) {
                element = tempElement;
                count = tempCount;
            }
        }
        for (i = 0; i<vehicles.length - 1; i++) {
            if (vehicles[i] != null) {
                String VIN = vehicles[i].getVin();
                if (VIN.equals(element)) {
                    make = vehicles[i].getMake();
                    break;
                }
            }
        }
        return make;
    }

    public boolean updateRepairCost(int ticketNum, double newCost) {
        if (ticketNum > tickets.length) return false;
        if (ticketNum <= 0) return false;
        if (tickets[ticketNum - 1] != null) {
            tickets[ticketNum - 1].setCost(newCost);
            return true;
        }
        else return false;
    }

    public boolean deleteRepair(int ticketNum) {
        if (ticketNum > tickets.length) return false;
        if (ticketNum <= 0) return false;
        if (tickets[ticketNum - 1] != null) {
            tickets[ticketNum - 1] = null;
            return true;
        }
        else return false;
    }

    public boolean deleteAllRepairsForCar(String VIN) {
        int noCarCheck = 0, i;
        for (i = 0; i<vehicles.length - 1; i++) {
            if (vehicles[0] == null) {
                if (vehicles[i].getVin().equals(VIN)) {
                    noCarCheck++;
                }
            }
        }
        if (noCarCheck == 0) return false;
        for (i = 0; i<tickets.length - 1; i++) {
            if (tickets[i] != null) {
                if (tickets[i].getVin().equals(VIN)) {
                    tickets[i] = null;
                }
            }
        }
        return true;
    }

    public boolean deleteCarAndRepairs(String VIN) {
        int noCarCheck = 0, i;
        for (i = 0; i<vehicles.length - 1; i++) {
            if (vehicles[i] != null) {
                if (vehicles[i].getVin().equals(VIN)) {
                    noCarCheck++;
                }
            }
        }
        if (noCarCheck == 0) return false;
        for (i = 0; i<vehicles.length - 1; i++) {
            if (vehicles[i] != null) {
                if (vehicles[i].getVin().equals(VIN)) {
                    vehicles[i] = null;
                }
            }
        }
        for (i = 0; i<tickets.length - 1; i++) {
            if (tickets[i] != null) {
                if (tickets[i].getVin().equals(VIN)) {
                    tickets[i] = null;
                }
            }
        }
        return true;
    }
}

class Car {

    private String vin;
    private String make;
    private int year;

    public Car(String vin, String make, int year) {
        this.vin = vin;
        this.make = make;
        this.year = year;
    }

    public String getVin() {
        return vin;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public Car(Car car) {
        this(car.getVin(), car.getMake(), car.getYear());
    }

}

class Ticket {

    private String vin;
    private double cost;
    private String description;

    public Ticket(String vin, double cost, String description) {
        this.vin = vin;
        this.cost = cost;
        this.description = description;
    }

    public void setCost(double newCost) {
        cost = newCost;
    }

    public String getVin() {
        return vin;
    }

    public double getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }

    public Ticket(Ticket ticket) {
        this(ticket.getVin(), ticket.getCost(), ticket.getDescription());
    }

}
