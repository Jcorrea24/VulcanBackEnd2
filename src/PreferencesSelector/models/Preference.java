package PreferencesSelector.models;

public class Preference {
    private String studentName;
    private String subject;
    private int priority; // 1-10

    public Preference(){}

    public Preference(String studentName, String subject, int priority){
        this.studentName = studentName;
        this.subject = subject;
        this.priority = priority;
    }

    // Getters
    public String getStudentName() {
        return studentName;
    }

    public String getSubject() {
        return subject;
    }   

    public int getPriority() {
        return priority;
    }

    // Setters
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}