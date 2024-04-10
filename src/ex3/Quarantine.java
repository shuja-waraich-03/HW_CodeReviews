package ex3;

import java.util.HashSet;
import java.util.Set;


public class Quarantine {

private Set<Person> set;

    public Quarantine() {
        set=new HashSet<>(); //does not count duplicates
    }

    public void addPerson(Person person) {
        set.add(person);
    }

    public int query() {
        return set.size();
    }

    public String toString() {
        return set.toString();
    }

}