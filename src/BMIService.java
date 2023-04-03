public class BMIService {
    public double calculate (int weight, double height){
        double bmi = weight / (height*height); // подсчет
        return bmi; // возвращаем рассчитанный индекс массы тела
    }
}