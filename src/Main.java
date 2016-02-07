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
        Scanner input = new Scanner(System.in);

        String s = null;
        Pattern p = Pattern.compile("[0-5]");
        Matcher l = null;

        System.out.print( "Hi! You are in the datebase of students. \n 1 - Add student \n 2 - Delete student" +
                "\n 3 - Show full list of students \n 4 - Replace two student in the list \n 5 - Show student info \n" +
                " 0 - Exit\n" );
        do {
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
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                case 4:
                    System.out.println("4");
                    break;
                case 5:
                    System.out.println("5");
                    break;
                case 0:
                    break;
            }
        } while (num!=0);
        System.exit(0);

    }

}


