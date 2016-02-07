import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    ArrayList<String> SecondName = new ArrayList<String>();
    ArrayList<String> FirstName = new ArrayList<String>();
    ArrayList<Integer> Job = new ArrayList<Integer>();
    ArrayList<Double> Weight = new ArrayList<Double>();


    public static void main(String[] args) {
        int num = -1;
        AddStudent addStudentObject = new AddStudent();
        DeleteStudent deleteStudentObject = new DeleteStudent();
        ShowFullList showFullListObject = new ShowFullList();
        ReplaceStudents replaceStudentsObject = new ReplaceStudents();
        ShowStudentInfo showStudentInfoObject = new ShowStudentInfo();
        Scanner input = new Scanner(System.in);

        String s = null;
        Pattern p = Pattern.compile("[0-5]");
        Matcher l = null;

        do {
            System.out.print( "Hi! You are in the datebase of students. \n 1 - Add student \n 2 - Delete student" +
                    "\n 3 - Show full list of students \n 4 - Replace two student in the list \n 5 - Show student info \n" +
                    " 0 - Exit\n" );
            do  { System.out.print("\nMenu. Please input number from the list: " );
                s = input.nextLine();
                l = p.matcher(s);
            } while  (!l.matches());
            num = Integer.parseInt(s);

            switch (num) {
                case 1:
                    addStudentObject.addStudent();
                    break;
                case 2:
                    deleteStudentObject.deleteStudent();
                    break;
                case 3:
                    showFullListObject.showFullList();
                    break;
                case 4:
                    replaceStudentsObject.replaceStudent();
                    break;
                case 5:
                    showStudentInfoObject.showStudentInfo();
                    break;
                case 0:
                    break;
            }
        } while (num!=0);
        System.exit(0);

    }

}


