public class BmiService {
    public void calculate(double bmi) {
        double weight = 0.0;
        double height = 0.0;
        bmi = (weight)/(height * height);
        System.out.println("Your BMI is " + bmi);
        System.out.println("BMI VALUES");
        System.out.println("Underweight: Under 18.5");
        System.out.println("Normal: 18.5-24.9 ");
        System.out.println("Overweight: 25-29.9");
        System.out.println("Obese: 30 or over");
    }

}
