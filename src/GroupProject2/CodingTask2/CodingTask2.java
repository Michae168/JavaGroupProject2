package GroupProject2.CodingTask2;

public class CodingTask2 {
    /*
    2. We have to calculate the average of marks obtained in three subjects by student A and by student B.
    Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
    Provide implementation of abstract method in classes 'A' and 'B'.
    The constructor of student A takes the marks in three subjects as its parameters
    and the marks in four subjects as its parameters for student B.
    Test your code
     */
}

// Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
abstract class Marks {
    abstract double getPercentage();
}

// The constructor of student A takes the marks in three subjects as its parameters
class StudentA extends Marks {
    private double mathMarks;
    private double englishMarks;
    private double historyMarks;

    StudentA(double mathMarks, double englishMarks, double historyMarks) {
        this.mathMarks = mathMarks;
        this.englishMarks = englishMarks;
        this.historyMarks = historyMarks;
    }

    @Override
    double getPercentage() {
        return (mathMarks + englishMarks + historyMarks) / 3;
    }
}

//The constructor of student B takes the marks in four subjects as its parameters
class StudentB extends Marks {
    private double mathMarks;
    private double englishMarks;
    private double historyMarks;
    private double scienceMarks;

    public StudentB(double mathMarks, double englishMarks, double historyMarks, double scienceMarks) {
        this.mathMarks = mathMarks;
        this.englishMarks = englishMarks;
        this.historyMarks = historyMarks;
        this.scienceMarks = scienceMarks;
    }

    @Override
    double getPercentage() {
        return (mathMarks + englishMarks + historyMarks + scienceMarks) / 4;
    }
}

class MarksTester {
    public static void main(String[] args) {
        // Test your code
        StudentA studentA = new StudentA(98, 91, 93);
        System.out.println("The average of Student A's marks is " + studentA.getPercentage() + ".");

        StudentB studentB = new StudentB(98, 91, 93, 87);
        System.out.println("The average of Student B's marks is " + studentB.getPercentage() + ".");
    }
}

