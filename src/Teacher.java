public class Teacher extends Person {


    String workPlace;
    String experience;
    Students student[] = new Students[Students.count];


    Teacher(String name, String surname, int age, String workPlace, String experience, Students student[]) {
        super(name, surname, age);
        this.workPlace = workPlace;
        this.experience = experience;
        this.student = student;

    }

    void displayStudentsByGroupName(String group) {

        for (int i = 0; i < student.length; i++) {

            if (student[i].group.equals(group)) {
                System.out.println(student[i].name + " " + student[i].surname + student[i].university + " " + student[i].faculty);
            }
        }


    }

}
