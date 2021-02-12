
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> personsInRoom;

    public Room() {
        this.personsInRoom = new ArrayList<>();
    }

    public void add(Person person) {
        this.personsInRoom.add(person);
    }

    public boolean isEmpty() {
        return this.personsInRoom.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.personsInRoom;
    }

    public Person shortest() {
        if (this.isEmpty()) {
            return null;
        }

        Person shortestPerson = this.personsInRoom.get(0);
        for (Person person : this.personsInRoom) {
            if (shortestPerson.getHeight() > person.getHeight()) {
                shortestPerson = person;
            }
        }
        return shortestPerson;
    }

    public Person take() {
        if (this.isEmpty()) {
            return null;
        }
        Person shortestPerson = this.shortest();
        this.personsInRoom.remove(shortestPerson);
        return shortestPerson;
    }
}
