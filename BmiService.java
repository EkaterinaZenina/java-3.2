public class BmiService {
    public void calculate(double bmi,double weight,double height) {
        bmi = (weight)/(height * height);
        System.out.println("Your BMI is " + bmi);

    }
}
