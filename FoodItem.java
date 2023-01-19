public class FoodItem {
    private double servingSize;
    private double calories;
    private double protein;
    private double fat;
    private double carbs;


    public FoodItem() {

    }
    //CONSTRUCTOR: note: make more later for absences of certain info
    public FoodItem(double servingSize, double calories, double protein, double fat, double carbs) {
        this.servingSize = servingSize;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
    }

    //SETTERS
    public void setServingSize(double servingSize) {
        this.servingSize = servingSize;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }




    //GETTERS
    public double getServingSize() {
        return servingSize;
    }


    public double getCalories() {
        return calories;
    }

    public double getProtein() {
        return protein;
    }

    public double getFat() {
        return fat;
    }

    public double getCarbs() {
        return carbs;
    }
}



