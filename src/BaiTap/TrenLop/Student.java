package BaiTap.TrenLop;

public class Student extends User {
    String subject;

    public Student(String userName, String password, String id, String subject) {
        super(userName, password, id);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "subject='" + subject + '\'' +
                '}';
    }

    @Override
    public void displayData() {
        super.displayData();
        System.out.println("subject : " + this.subject);
    }

    public void displayStudent() {
            System.out.println("Student {" +
                    "name ='" + super.getUserName() + '\'' +
                    ", id =" + super.getId() +
                    ", password ='" + super.getPassword() + '\'' +
                    "subject='" + this.subject + '\'' +
                    "}");
    }
}
