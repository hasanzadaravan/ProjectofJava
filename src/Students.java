public class Students extends Person {

    String university;
    int gpa;
    String faculty;
    String group;
    static int count = 0;


    Students(String name, String surname, int age, String university, int gpa, String faculty, String group) {
        super(name, surname, age);
        this.university = university;
        this.gpa = gpa;
        this.faculty = faculty;
        this.group = group;
    }

    void getObjectCount() {
        count++;
        System.out.println(count);
    }


}
