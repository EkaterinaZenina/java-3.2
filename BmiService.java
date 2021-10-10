public class BmiService {
    public void calculate(double bmi) {
        double weight = 0.0;
        double height = 0.0;
        bmi = (weight)/(height * height);
        System.out.println("Your BMI is " + bmi);

    }

}
