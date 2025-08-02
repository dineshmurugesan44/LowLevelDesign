package prototypeModel;

public class Client {
    public static void main(String[] args) {
       /* Student s1 = new Student();
        s1.setAge(25);
        Student s2 = s1.Clone();
        System.out.println(s1.getAge());
        System.out.println(s2.getAge());

        StudentIntelligent other = new StudentIntelligent();
        other.setAge(27);
        other.setIq(100);
        StudentIntelligent copy = other.Clone();
        copy.getIq();
        other.setIq(50);
        copy.getIq();

        System.out.println(copy.getIq());

        System.out.println(other.getIq());

        System.out.println(copy.getIq());*/

        //registry implemetation
        Student origina_student = StudentRegistry.initiateRegistry();

        System.out.println("original student:"+ origina_student.getBatchName());

        Student copied_student = StudentRegistry.getStudentCopy("JAVA_STUDENT");

        System.out.println("Java copied_student:"+ copied_student.getBatchName());

        Student Python_student = StudentRegistry.getStudentCopy("JAVA_STUDENT");
        Python_student.setBatchName("Python Morning BATCH");


        StudentRegistry.add_register("Python Student", Python_student);

        Student python_copy = StudentRegistry.getStudentCopy("Python Student");

        System.out.println("Python copied_student:"+ python_copy.getBatchName());


    }
}
