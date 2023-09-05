import java.util.ArrayList;

public class Course {
    private String subject;
    private ArrayList<Student> students;
    private Teacher teacher;

    public String getSubject() {
        return subject;
    }
    public ArrayList<Student> getStudents() {
        return students;
    }
    public Teacher getTeacher() {
        return teacher;
    }
    public void setSubject(String aSubject) {
        subject = aSubject;
    }
    public void setStudents(ArrayList<Student> aStudents) {
        students = aStudents;
    }
    public void setTeacher(Teacher aTeacher) {
        teacher = aTeacher;
    }
}
