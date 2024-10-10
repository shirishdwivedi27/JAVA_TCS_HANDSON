import java.util.*;

public class courseProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course[] course = new Course[4];

        for (int i = 0; i < course.length; i++) {
            int cid = sc.nextInt();
            sc.nextLine();
            String cname = sc.nextLine();
            String cadmin = sc.nextLine();
            int quiz = sc.nextInt();
            sc.nextLine();
            int handon = sc.nextInt();
            sc.nextLine();

            course[i] = new Course(cid, cname, cadmin, quiz, handon);
        }

        String admin = sc.nextLine(); // Input the admin name for quiz filtering

        // Calculate average quiz score by admin
        int ans = findAvgOfQuizByAdmin(course, admin);
        if (ans != 0) {
            System.out.println("Average Quiz: " + ans);
        } else {
            System.out.println("No Course Found");
        }

        // Input the handson threshold
        int handon = sc.nextInt();

        // Sort and find courses with hands-on scores less than given value
        Course[] ans2 = sortCourseByHandsOn(course, handon);
        if (ans2 != null) {
            for (Course c : ans2) {
                System.out.println(c.getCname());
            }
        } else {
            System.out.println("No Course found with mentioned attribute.");
        }
    }

    // Method to find average quiz score by admin
    public static int findAvgOfQuizByAdmin(Course[] course, String admin) {
        int sum = 0;
        int count = 0;
        for (Course c : course) {
            if (c.getCadmin().equalsIgnoreCase(admin)) {
                sum += c.getQuiz();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }

    // Method to sort courses by hands-on threshold
    public static Course[] sortCourseByHandsOn(Course[] course, int hand) {
        Course[] obj = new Course[0]; // Create an empty array
        for (Course c : course) {
            if (c.getHandson() < hand) {
                obj = Arrays.copyOf(obj, obj.length + 1); // Increase the array size
                obj[obj.length - 1] = c; // Add course to array
            }
        }

        // Sort based on the hands-on score
        Arrays.sort(obj, Comparator.comparingInt(Course::getHandson));

        return obj.length > 0 ? obj : null;
    }
}

// Course class definition
class Course {
    private int courseid, quiz, handson;
    String courseName, courseAdmin;

    public Course(int courseid, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseid = courseid;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCid() {
        return courseid;
    }

    public void setCid(int cid) {
        this.courseid = cid;
    }

    public String getCname() {
        return courseName;
    }

    public void setCname(String cname) {
        this.courseName = cname;
    }

    public String getCadmin() {
        return courseAdmin;
    }

    public void setCadmin(String cadmin) {
        this.courseAdmin = cadmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public int getHandson() {
        return handson;
    }

    public void setQuiz(int quiz) {
        this.quiz = quiz;
    }

    public void setHandson(int handson) {
        this.handson = handson;
    }
}
