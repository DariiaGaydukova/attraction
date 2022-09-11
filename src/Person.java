public class Person {

    private String name;
    private String surname;
    private int ticketCount;

    public Person(String name, String surname, int ticketCount) {
        this.name = name;
        this.surname = surname;
        this.ticketCount = ticketCount;
    }
    public String toString() { return name + " "+ surname;}

    public int getTicketCount () {
        return ticketCount;
    }

    public void setTicketCount (int ticketCount) {
        this.ticketCount = ticketCount;

    }

}
