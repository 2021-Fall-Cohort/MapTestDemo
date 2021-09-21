import java.util.HashMap;

public class MapTestDemo{
    private HashMap<Integer,Person> students;

    public MapTestDemo() {
        students = new HashMap<Integer, Person>();
    }

    public void addStudent(Person student) {
        students.put(student.getId(),student);
    }

    public Person retrieveStudentById(int id) {
        return students.get(id);
    }

    public int numberOfStudents() {
        return students.size();
    }

    public void removeStudentById(int id) {
        students.remove(id);
    }

    public void removeAll() {
        students.clear();
    }
}
