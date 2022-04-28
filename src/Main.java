import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Students student1 = new Students(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.next());
        Students student2 = new Students(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.next());

        Students students[] = new Students[2];
        students[0] = student1;
        students[1] = student2;


        Teacher teacher = new Teacher(sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.next(), students);

        teacher.displayStudentsByGroupName(student1.group);
        student1.getObjectCount();

    }
}
