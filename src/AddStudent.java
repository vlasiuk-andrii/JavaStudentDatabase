import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddStudent {
    Main body = new Main();

    public void addStudent() {
        String s = null;
        Integer k = null;
        Double d = null;
        Pattern p1 = Pattern.compile("[A-Za-z]{1,20}");
        Pattern p2 = Pattern.compile("[1-3]{1}");
        Pattern p3 = Pattern.compile("((\\d+)|(\\d+.\\d+))");
        Matcher l = null;
        Scanner input = new Scanner(System.in);

        do  { System.out.print("Input first name: ");
            s = input.nextLine();
            l = p1.matcher(s);
        } while  (!l.matches());
        body.FirstName.add(s);

        do  { System.out.print("Input second name: ");
            s = input.nextLine();
            l = p1.matcher(s);
        } while  (!l.matches());
        body.SecondName.add(s);

        do  { System.out.print("Input profession[1-3]: ");
            s = input.nextLine();
            l = p2.matcher(s);
        } while  (!l.matches());
        k = Integer.parseInt(s);
        body.Job.add(k);

        do  { System.out.print("Input weight: ");
            s = input.nextLine();
            l = p3.matcher(s);
        } while  (!l.matches());
        d = Double.parseDouble(s);
        body.Weight.add(d);

        System.out.println("Student complete added!");
    }
}