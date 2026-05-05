package Tema8.Exercitiul5;

public class Main {

    public static void main() {

        Course course = new Course("QA Tester", 7);
        course.details();

        OnlineCourse onlineCourse = new OnlineCourse("QA Tester", 7, "Google Meet");
        onlineCourse.details();
        onlineCourse.displayInfo();
    }
}
