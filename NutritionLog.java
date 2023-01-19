//Nutrition Calculator will create an instance of this with calculated info

public class NutritionLog {
    private double calories;
    private double protein;
    private double fat;
    private double carbs;

    public NutritionLog(double calories, double protein, double fat, double carbs) {
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }
}
