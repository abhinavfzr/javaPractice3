package com.stackroute.p3;

public class StudentMarksCheck {
    //Create a class called StudentMarks, which prompts user for the number of students, reads it
    //from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
    //grades of each of the students and saves them in an int array called stuGrades. Your program shall
    //check that the grade is between 0 and 100 else has to trow an error message.
    boolean StudentMarks(int numOfStudents, int stuGrades[]) //1st question
    {
        boolean flag = true;
        for (int i = 0; i < numOfStudents; i++) {
            int g = stuGrades[i];
            if (g > 100 || g < 0) {
                flag = false;
            }

        }
        return flag;

    }

}
