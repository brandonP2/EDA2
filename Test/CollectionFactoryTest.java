import edai.tema1.CollectionFactory;
import edai.tema1.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CollectionFactoryTest {
	private CollectionFactory<Person> factory;
	private Person[] persons;

	@BeforeEach
	void setUp() throws Exception {
		factory = new CollectionFactory<Person>();
		persons = new Person[] {
				new Person(10, "Juan"),
				new Person(50, "Patricia"),
				new Person(1, "Peter"),
				new Person(6, "John"),
				new Person(3, "Daniel")
		};
	}

	@Test
	void testCreateAscSortedCollection() {
		final Collection<Person> collection = factory.createAscSortedCollection();
		for (final Person person : persons) {
			collection.add(person);
		}
		Object[] expected = {persons[2], persons[4], persons[3], persons[0], persons[1]};
		assertArrayEquals(expected, collection.toArray());
	}

	@Test
	void testCreateDescSortedCollection() {
		final Collection<Person> collection = factory.createDescSortedCollection();
		for (final Person person : persons) {
			collection.add(person);
		}
		Object[] expected = {persons[1], persons[0], persons[3], persons[4], persons[2]};
		assertArrayEquals(expected, collection.toArray());
	}
}
