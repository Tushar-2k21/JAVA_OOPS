
import java.util.Scanner;

class Student{

    String[] students  =new String[4];

    String[] Roll_no = new String[4];
    float[] height = new float[4];

    int i=0;
    void setRoll_no(String s) {
        Roll_no[i]=s;
        i++;
    }
    int j=0;
    void setHeight(float s) {
        height[j]=s;
        j++;
    }
    int k=0;
    void setStudents(String s) {
        students[k]=s;
        k++;
    }

    void display(String s) {
        int idx=0;
        int m = 0;
        for (String i : students) {
            m++;
            if (i.equals(s)) {
                idx = m;
                break;
            }
        }

        System.out.println("The roll no. of " + s + "  is " + Roll_no[idx-1] + " and the height is " + height[idx-1]);
    }

       void get_average()
        {
          double avg = 0;
            for(float i : height)
            {
              avg=avg+i;
            }
            avg = avg/5;
            System.out.println(" The average height of all students is : " + avg);
        }



}


public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student iiita = new Student();

        System.out.println("ENTER DETAILS OF THREE STUDENTS : ");
        for(int i =0;i<3;i++)
        {
            System.out.println("Enter name first name :");
            String xx = sc.next();
            iiita.setStudents(xx);

            System.out.println("Enter roll no . of " + xx);
           String yy = sc.next();
            iiita.setRoll_no(yy);

            System.out.println("Enter height of " + xx);
           float rr = sc.nextFloat();
            iiita.setHeight(rr);
        }
        System.out.println("ENTER THE NAME OF STUDENT WHOSE DETAIL YOU WANT TO KNOW :");
        String ii = sc.next();
        iiita.display(ii);
        iiita.get_average();

    }
}
