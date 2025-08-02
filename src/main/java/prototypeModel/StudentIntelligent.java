package prototypeModel;

public class StudentIntelligent extends Student{
    private float iq;

    //default constructor
    public StudentIntelligent() {
    }

    private StudentIntelligent(StudentIntelligent copy) {
        super(copy);
        this.iq = copy.iq;
    }

    public float getIq() {
        return iq;
    }
    public void setIq(float iq) {
        this.iq = iq;
    }

    @Override
    public StudentIntelligent Clone() {
        return new StudentIntelligent(this);
    }


}
