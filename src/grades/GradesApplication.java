package grades;
import util.Input;
import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
//        System.out.println((char)27 + "[31m" + "ERROR MESSAGE IN RED");
//        System.out.println((char)27 + "[34m" + "BLUE");
//        System.out.println((char)27 + "[35mMAGENTA");
//        System.out.println((char)27 + "[33mYELLOW");
        HashMap<String, Student> students = new HashMap<>();
        populateStudentHashMaps(students);
        promptUser(students);
    }

    public static void addGradesForStudent(Student s){
        s.addGrade((int)Math.floor(Math.random() * 100));
        s.addGrade((int)Math.floor(Math.random() * 100));
        s.addGrade((int)Math.floor(Math.random() * 100));
        s.addGrade((int)Math.floor(Math.random() * 100));
    }

    public static String generateAttendence() {
        int a = (int) (Math.floor(Math.random() * 2) + 1);
        if (a > 1){
            return "P";
        } else {
            return "A";
        }
    }

    public static void addAttendance(Student s){
        s.attendence.put("01-01-2017", generateAttendence());
        s.attendence.put("01-02-2017", generateAttendence());
        s.attendence.put("01-03-2017", generateAttendence());
        s.attendence.put("01-04-2017", generateAttendence());
        s.attendence.put("01-05-2017", generateAttendence());
    }

    public static void populateStudentHashMaps(HashMap<String, Student> map){
        Student s1 = new Student("Ben");
        Student s2 = new Student("John");
        Student s3 = new Student("BoboTheDoggo");
        Student s4 = new Student("Robbie");
        Student s5 = new Student("Jeff");
        Student s6 = new Student("Bob");

        addAttendance(s1);
        addAttendance(s2);
        addAttendance(s3);
        addAttendance(s4);
        addAttendance(s5);
        addAttendance(s6);

        addGradesForStudent(s1);
        addGradesForStudent(s2);
        addGradesForStudent(s3);
        addGradesForStudent(s4);
        addGradesForStudent(s5);
        addGradesForStudent(s6);

        map.put("bahodge", s1);
        map.put("squiggles", s2);
        map.put("borkin-bobo", s3);
        map.put("cafebabe", s4);
        map.put("cool-Guy", s5);
        map.put("derpington", s6);
    }

    public static void printHashMapKey(HashMap<String, Student> map){
        for (String name: map.keySet()){
            System.out.printf("| %8s ", name);
        }
        System.out.println("|");
    }

    public static void printStudentDetails(HashMap<String, Student> map, String u){
        System.out.printf("Username: %s - Student Name: %s \n", u, map.get(u).getName());
        System.out.println("Grades: " + map.get(u).grades);
        System.out.println("Average Grade: " + map.get(u).getGradeAverage());
        System.out.println("Average Attendance: " + map.get(u).getAttendanceAverage() + "%");
        System.out.println("Missed # of Days: " + map.get(u).getMissedDays());
        System.out.println("Missed dates: " + map.get(u).getMissedDates());
        System.out.println();
    }

    public static void promptUser (HashMap<String, Student> map){
        Input input = new Input();
        String searchUsername;
        do {
            System.out.println("\n");
            printHashMapKey(map);
            System.out.println("\n");
            searchUsername = input.getString("Enter username or to view all [all]: ");
            if (map.containsKey(searchUsername)){
                //Display Student Details
                printStudentDetails(map, searchUsername);

            } else if (searchUsername.equalsIgnoreCase("all")){
                for (String username : map.keySet()){
                    printStudentDetails(map, username);
                }
            }
            else {
                System.out.println("Invalid Key");
            }
        } while (input.getString("Continue?: [y/n]  ").equalsIgnoreCase("y"));
    }
}
