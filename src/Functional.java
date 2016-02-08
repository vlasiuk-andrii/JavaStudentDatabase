import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Functional extends Main {

    public void addStudent() {

        String s = null;
        Integer k = null;
        Double d = null;
        Pattern p1 = Pattern.compile("[A-Za-z]{1,20}");
        Pattern p2 = Pattern.compile("[1-3]{1}");
        Pattern p3 = Pattern.compile("((\\d+)|(\\d+.\\d+))");
        Matcher l = null;
        Scanner input = new Scanner(System.in);

        do  { System.out.print("\nInput first name: ");
            s = input.nextLine();
            l = p1.matcher(s);
        } while  (!l.matches());
        super.FirstName.add(s);

        do  { System.out.print("Input second name: ");
            s = input.nextLine();
            l = p1.matcher(s);
        } while  (!l.matches());
        super.SecondName.add(s);

        do  { System.out.print("Input profession[1-3]: ");
            s = input.nextLine();
            l = p2.matcher(s);
        } while  (!l.matches());
        k = Integer.parseInt(s);
        super.Job.add(k);

        do  { System.out.print("Input weight: ");
            s = input.nextLine();
            l = p3.matcher(s);
        } while  (!l.matches());
        d = Double.parseDouble(s);
        super.Weight.add(d);

        System.out.println("Student complete added! ID="+super.Weight.lastIndexOf(d));
    }

    public void deleteStudent(){
        String s = null;
        int k = -1;
        Pattern p = Pattern.compile("[\\d+]");
        Matcher l = null;
        Scanner input = new Scanner(System.in);

        do  { System.out.print("\nID of student: ");
            s = input.nextLine();
            l = p.matcher(s);
        } while  (!l.matches());
        k = Integer.parseInt(s);

        try {
            super.FirstName.remove(k);
            super.SecondName.remove(k);
            super.Job.remove(k);
            super.Weight.remove(k);
        } catch (IndexOutOfBoundsException ioe) {
            System.out.println("Wrong ID");
        }

        
        System.out.print("Student with ID="+k+" complete deleted!\n");
    }

    public void showFullList() {
        System.out.print("\n #  "+"SecondName\n");
        if (super.FirstName.size() == 0){
            System.out.println("   --empty list--  ");
        } else {
            for (int i=0; i<super.FirstName.size(); i++){
                System.out.print(" "+i+". "+super.SecondName.get(i));
                System.out.println();
            }
        }

    }
    public void replaceStudent() {
        String s = null;
        int k1 = -1;
        int k2 = -1;
        Pattern p = Pattern.compile("[\\d+]");
        Matcher l = null;
        Scanner input = new Scanner(System.in);

        do  { System.out.print("ID of first student: ");
            s = input.nextLine();
            l = p.matcher(s);
        } while  (!l.matches());
        k1 = Integer.parseInt(s);

        do  { System.out.print("ID of second student: ");
            s = input.nextLine();
            l = p.matcher(s);
        } while  (!l.matches());
        k2 = Integer.parseInt(s);

        String bufer1 = new String();
        bufer1 = super.FirstName.get(k1);
        super.FirstName.set(k1, super.FirstName.get(k2));
        super.FirstName.set(k2, bufer1);

        String bufer2 = new String();
        bufer2 = super.SecondName.get(k1);
        super.SecondName.set(k1, super.SecondName.get(k2));
        super.SecondName.set(k2, bufer2);

        int bufer3 = -1;
        bufer3 = super.Job.get(k1);
        super.Job.set(k1, super.Job.get(k2));
        super.Job.set(k2, bufer3);

        double bufer4 = -1;
        bufer4 = super.Weight.get(k1);
        super.Weight.set(k1, super.Weight.get(k2));
        super.Weight.set(k2, bufer4);

        System.out.println("Students with ID="+k1+" and ID="+k2+" have been successful replaced!");

    }

    public void showStudentInfo() {
        String s = null;
        int k = -1;
        Pattern p = Pattern.compile("[\\d+]");
        Matcher l = null;
        Scanner input = new Scanner(System.in);

        do  { System.out.print("\nID of student: ");
            s = input.nextLine();
            l = p.matcher(s);
        } while  (!l.matches());
        k = Integer.parseInt(s);

        System.out.print(" # "+"FirstName"+"  "+"SecondName"+"  "+"Job"+"  "+"Weight\n");
        System.out.print(" "+k+". "+super.FirstName.get(k)+"   ");
        System.out.print(super.SecondName.get(k)+"   ");
        System.out.print(super.Job.get(k)+"   ");
        System.out.print(super.Weight.get(k));
        System.out.println();
    }
}
