import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MapTest {
//    Unit Tests For Hashmap:
//
//    Write a test to check for the existence of a class and the ability to add to its map!
//    Write a test to check whether or not something has been added to the map!
//    Write a test to check whether or not you can retrieve the correct element from a map using its key!
//    Write a test to check whether or not you can remove the correct element from a map using its key!
//    Write a test to check whether or not you can remove all elements from the collection!

    MapTestDemo underTest;
    Person student1;
    Person student2;
    @BeforeEach
    void setup(){
        underTest = new MapTestDemo();
        student1 = new Person(1, "Rex");
        student2 = new Person(2, "Dave");
    }

    @Test
    void shouldCreateClassAndAddToItsMap(){

        underTest.addStudent(student1);
        //assertEquals("Rex",underTest.retrieveStudentById(1).getName());
        assertEquals(student1, underTest.retrieveStudentById(1));
    }

    @Test
    void shouldAddStudentToMap(){
        underTest.addStudent(student1);
        //int numOfStudents = underTest.numberOfStudents();
        underTest.addStudent(student2);
        assertEquals(2, underTest.numberOfStudents());
    }
    @Test
    void shouldReturnStudentByKey(){
        underTest.addStudent(student1);
        underTest.addStudent(student2);
        assertEquals(student2, underTest.retrieveStudentById(2));
    }
    @Test
    void shouldRemoveStudentByKey(){
        underTest.addStudent(student1);
        underTest.addStudent(student2);
        int numOfStudents = underTest.numberOfStudents();
        underTest.removeStudentById(student2.getId());
        assertEquals(numOfStudents-1,underTest.numberOfStudents());
        assertEquals(student1, underTest.retrieveStudentById(1));
        assertNull(underTest.retrieveStudentById(2));
    }
    @Test
    void shouldRemoveAllStudentsFromMap(){
        underTest.addStudent(student1);
        underTest.addStudent(student2);
        underTest.removeAll();
        assertEquals(0,underTest.numberOfStudents());
    }

}
