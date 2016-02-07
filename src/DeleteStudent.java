import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DeleteStudent {
    Main body = new Main();

    public void deleteStudent(){
        String s = null;
        Integer k = null;
        Pattern p = Pattern.compile("[\\d+]");
        Matcher l = null;
        Scanner input = new Scanner(System.in);

        do  { System.out.print("\nInput number of student to delete: ");
            s = input.nextLine();
            l = p.matcher(s);
        } while  (!l.matches());
        k = Integer.parseInt(s);

        //Поставить try на indexOutOfArrayList!
        body.FirstName.remove(k);
        body.SecondName.remove(k);
        body.Job.remove(k);
        body.Weight.remove(k);

        System.out.print("Student complete deleted!\n");
    }
}
