package Tema8.Exercitiul5;

public class OnlineCourse extends Course {

    // Exercitiul 5
    //Creează:
    //- Course → private courseName, duration + constructor
    //- OnlineCourse extinde Course → atribut platform
    //- creează obiect și afișează datele

    private String platform;

    public OnlineCourse(String courseName, int duration, String platform){
        super(courseName,duration);
        this.platform = platform;
    }

    public void displayInfo(){
        System.out.println("Platform: " + platform);
    }

}
