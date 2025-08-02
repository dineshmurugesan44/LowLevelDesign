package prototypeModel;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private static Map<String, Student> StudentRegistry = new HashMap<String, Student>();

    public static void add_register(String constant_name, Student student) {
        if (!StudentRegistry.containsKey(constant_name)) {
            StudentRegistry.put(constant_name, student);
        }
    }

    public static Student initiateRegistry(){
        Student student = new Student();
        student.setAge(10);
        student.setBatchName("Backend evening");
        student.setInstructor("yash");

        StudentRegistry.put("JAVA_STUDENT", student);

        return student;


    }


    public static Student getStudentCopy(String key) {
        return StudentRegistry.get(key).Clone();
    }
}
