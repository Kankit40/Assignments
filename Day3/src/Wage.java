public class Wage {
    public static void main(String[] args) {

        int Empwage = 8;

        int a = (int)(Math.random() * 2);

        if (a == 1){
            System.out.println("Employee is Present");
            int Perdaywage = Empwage * 1;
            System.out.println("The employee wage is " + Perdaywage + "INR");
        }
        else {
            System.out.println("Employee is Absent");
            int Perdaywage1 = Empwage * 0;
            System.out.println(" Employee Wage is " + Perdaywage1 + "INR");
        }

    }
}
