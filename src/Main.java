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
        Main main = new Main();
        Functional operator = new Functional();
        Scanner input = new Scanner(System.in);

        String s = null;
        Pattern p = Pattern.compile("[0-5]");
        Matcher l = null;
        System.out.println("Hi! You are in the datebase of students.");

        do {
            System.out.print( "\n  Menu:\n 1 - Add student \n 2 - Delete student" +
                    "\n 3 - Show list of students \n 4 - Replace two student in the list \n 5 - Show student info \n" +
                    " 0 - Exit\n" );
            do  { System.out.print("Your choice: " );
                s = input.nextLine();
                l = p.matcher(s);
            } while  (!l.matches());
            num = Integer.parseInt(s);

            switch (num) {
                case 1:
                    operator.addStudent();
                    break;
                case 2:
                    operator.deleteStudent();
                    break;
                case 3:
                    operator.showFullList();
                    break;
                case 4:
                    operator.replaceStudent();
                    break;
                case 5:
                    operator.showStudentInfo();
                    break;
                case 0:
                    break;
            }
        } while (num!=0);
        System.exit(0);

    }

}


