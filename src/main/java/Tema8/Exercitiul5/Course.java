package Tema8.Exercitiul5;

public class Course {

    // Exercitiul 5
    //Creează:
    //- Course → private courseName, duration + constructor
    //- OnlineCourse extinde Course → atribut platform
    //- creează obiect și afișează datele

    private String courseName;
    private int duration;

    public Course(String courseName,int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void details(){
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " months");
    }

}
