package prototypeModel;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String email;
    private String pwd;
    private String Instructor;
    private String batchName;
    //default constructor
    public Student(){

    }
    //copy constructor
    public Student(Student copy) {
        this.name = copy.name;
        this.age = copy.age;
        this.email = copy.email;
        this.pwd = copy.pwd;
        this.Instructor = copy.Instructor;
        this.batchName = copy.batchName;
    }
    //getter and setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;

    }
    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public String getInstructor() {
        return Instructor;
    }
    public void setInstructor(String instructor) {
        Instructor = instructor;

    }
    public String getBatchName() {
        return batchName;
    }
    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }
    public String toString(){
       return "student [name=" + name + ", age=" + age + ", email=" + email + ", pwd="
               + pwd + ", Instructor=" + Instructor + ", batchName=" + batchName + "]";
    }

    //clone method


    @Override
    public Student Clone() {
        return new Student(this);
    }
}
