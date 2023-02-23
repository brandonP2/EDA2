package edai.tema1;
public class Person implements Comparable<Person>{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }


    public int compareTo(Person other) {
    	return this.id - other.id;
    }
}
