package Punto1.Subjects;

public class Notification {
    protected String message,course;

    public Notification(String message, String course){
        this.message = message;
        this.course = course;
    }

    @Override
    public String toString() {
        return "the new course about: " + this.course + " Is now available!!." + "\nDetails -> " + this.message;
    }
    
    public String getMessage(){
        return message;
    }
    public void setMessage(String newMessage){
        this.message = newMessage;
    }
    public String getCourse(){
        return course;
    }
    public void setCourse(String newCourse){
        this.course = newCourse;
    }
}
