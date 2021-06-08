class BMI {
    double bmi;
    BMI(double weight, double height){
        bmi  =  weight/Math.pow(height/100,2);
    }
    public String getStatus(){
        if (bmi < 18.5){
            return  "seriously underweight";
        }

        if (18.5 <= bmi && bmi < 23){
            return  "normal weight";
        }

        if (23 <= bmi && bmi  < 25){
            return "Obesity level 1";
        }

        if (25 <= bmi && bmi  < 30){
            return "Obesity level 2";
        }

        return "Obesity level 3";
    }
}
public class ko4 {
    public static void main(String[] args) {
        BMI bmi1 = new BMI(69, 179);
        System.out.println(bmi1.getStatus());

        BMI bmi2 = new BMI(62, 155);
        System.out.println(bmi2.getStatus());
    }
}
