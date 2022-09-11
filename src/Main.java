import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue queuePassengers = new LinkedList(generateClients());

        while (!queuePassengers.isEmpty()) {

            Person nextPassenger = (Person) queuePassengers.poll();
            System.out.println(nextPassenger + " прокатился на аттракционе");

            int ticketCount = nextPassenger.getTicketCount();

            if (ticketCount > 1) {
                queuePassengers.offer(nextPassenger);
                nextPassenger.setTicketCount(ticketCount - 1);
            }
        }
    }

    public static List<Person> generateClients() {

        Person person1 = new Person("Ivan", "Ivanov", 1);
        Person person2 = new Person("Petr", "Romanov", 4);
        Person person3 = new Person("Katya", "Velikaya", 1);
        Person person4 = new Person("Vladimir", "Lenin", 1);
        Person person5 = new Person("Margaret", "Tatcher", 2);


        List<Person> passengers = new LinkedList<>();
        passengers.add(person1);
        passengers.add(person2);
        passengers.add(person3);
        passengers.add(person4);
        passengers.add(person5);


        return passengers;
    }
}