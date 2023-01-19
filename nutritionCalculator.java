//calculator methods will do math on foodProperties object (sent as parameter)
public class nutritionCalculator {
    private FoodItem food;
    private double userServingSize;
    private double caloriesResult, proteinResult, fatResult, carbsResult;

    //GETTERS
    public double getCaloriesResult() {
        return caloriesResult;
    }

    public double getProteinResult() {
        return proteinResult;
    }

    public double getFatResult() {
        return fatResult;
    }

    public double getCarbsResult() {
        return carbsResult;
    }

    //SETTERS

    public void setCaloriesResult(double caloriesResult) {
        this.caloriesResult = caloriesResult;
    }

    public void setProteinResult(double proteinResult) {
        this.proteinResult = proteinResult;
    }

    public void setFatResult(double fatResult) {
        this.fatResult = fatResult;
    }

    public void setCarbsResult(double carbsResult) {
        this.carbsResult = carbsResult;
    }


    //CONSTRUCTOR: using a FoodItem passed to the calculator and user's portion size
    public nutritionCalculator(FoodItem food, double userServingSize) {
        this.food = food;
        this.userServingSize = userServingSize;
        calculateAllNutrition();
    }

    //CALCULATIONS FOR NUTRITION
    public void caloriesCalculation() {
        caloriesResult = (userServingSize / food.getServingSize()) * food.getCalories();
    }

    public void proteinCalculation() {
        proteinResult = (userServingSize / food.getServingSize()) * food.getProtein();
    }

    public void fatCalculation() {
        fatResult = (userServingSize / food.getServingSize()) * food.getFat();
    }

    public void carbsCalculation() {
        carbsResult = (userServingSize / food.getServingSize()) * food.getCarbs();
    }
    //////////////////////////////////

    public NutritionLog calculateAllNutrition() {
        //this makes calculator do the method using parameter passed to it in constructor
        //returns a NutritionLog to be stored in hashmap
        this.caloriesCalculation();
        this.proteinCalculation();
        this.fatCalculation();
        this.carbsCalculation();

        return new NutritionLog(caloriesResult, proteinResult, fatResult, carbsResult);
    }

}


//latest note: 1/18/23:
//MAKE A NEW CLASS: 4 food properties: cals, prot, fat, carbs
//calculator will send RESULTS variables to an instance of this class
//those class values plus DATE will be added to hash table for calendar of eating habits
