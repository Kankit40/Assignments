public class Parttime {
    public static void main(String[] args) {

        int Empwage = 8;

        int a = (int)(Math.random() * 3);

        if (a == 1){
            System.out.println("Employee is Present");
            int Perdaywage = Empwage * 1;
            System.out.println("The employee wage is " + Perdaywage + " INR");
        } else if (a == 2) {

            System.out.println("Employee is doing Halfday");
            int Parttimewage = Empwage / 2;
            System.out.println("The employee wage is " + Parttimewage + " INR");

        } else {
            System.out.println("Employee is Absent");
            int Perdaywage1 = Empwage * 0;
            System.out.println(" Employee Wage is " + Perdaywage1 + " INR");
        }

    }
}
