package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    protected String name;
    //This student has its own array list of Grades
    protected ArrayList<Integer> grades = new ArrayList<>();
    protected ArrayList<String> missedDaysArray = new ArrayList<>();
    //Student attendance
    protected HashMap<String, String> attendance = new HashMap<>();



    public Student(String name) {
        this.name = name;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    };
    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    };
    // returns the average of the students grades
    public double getGradeAverage(){
        double total = 0;
        for (int grade : grades){
            total += grade;
        }
        return total / grades.size();
    }

    public double getAttendanceAverage(){
        double daysAttended = 0;
        for (String att : attendance.values()){
            if (att.equalsIgnoreCase("p")){
                daysAttended++;
            }
        }
        return (daysAttended/5) * 100;
    }

    public String getMissedDates(){
        String datesMissed = "";
        for (String key : attendance.keySet()){
            if (attendance.get(key).equalsIgnoreCase("a") ){
                datesMissed += " |  " + key;
            }
        }
        return datesMissed;
    }

    public int getMissedDays() {
        int daysMissed = 0;
        for (String att : attendance.values()){
            if (att.equalsIgnoreCase("a")){
                daysMissed++;
            }
        }
        return daysMissed;
    }



}
