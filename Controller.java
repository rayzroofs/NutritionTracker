import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Controller {
    double userServingSize; //user's serving size not in a FoodItem, as it's not part of nutritional info
    FoodItem userFood = new FoodItem();
    nutritionCalculator calc;
    NutritionLog calculatedNutritionLog;
    LocalDate dateSelected;

    HashMap<LocalDate, ArrayList> calendarLog = new HashMap<>(); //array list of NutritionLogs for the specified date

    @FXML
    private DatePicker dateSelector;
    @FXML
    private TextField servingSizeBox, userServingSizeBox, calorieBox, proteinBox, fatBox, carbsBox;
    @FXML
    private Button submitButton;


    @FXML
    public void getDate(ActionEvent event) {
        dateSelected = dateSelector.getValue();
        System.out.print(dateSelected);
    }

    @FXML
    public void servingSizeInput(ActionEvent event) {
        double servingSize = Double.parseDouble(servingSizeBox.getText());
        userFood.setServingSize(servingSize);

    }

    @FXML
    public void userServingSizeBoxInput(ActionEvent event) {
        //double userServingSize = Double.parseDouble(userServingSizeBox.getText());
        //userFood.setUserServingSize(userServingSize);
        userServingSize = Double.parseDouble(userServingSizeBox.getText());
    }

    @FXML
    public void caloriesInput(ActionEvent event) {
        double cals = Double.parseDouble(calorieBox.getText());
        userFood.setCalories(cals);

    }

    @FXML
    public void proteinInput(ActionEvent event) {
        double protein = Double.parseDouble(proteinBox.getText());
        userFood.setProtein(protein);
    }

    @FXML
    public void fatInput(ActionEvent event) {
        double fat = Double.parseDouble(fatBox.getText());
        userFood.setFat(fat);
    }

    @FXML
    public void carbsInput(ActionEvent event) {
        double carbs = Double.parseDouble(carbsBox.getText());
        userFood.setCarbs(carbs);
    }

    //SUBMIT BUTTON: sets the user's food item properties that have been typed out
    //calls all the input methods
    //also FINALIZES the result, and puts the entire foodItem into data structure for the day
    @FXML
    public void submitInfo(ActionEvent event) {
        try {
            servingSizeInput(event);
            userServingSizeBoxInput(event);
            caloriesInput(event);
            proteinInput(event);
            fatInput(event);
            carbsInput(event);
            //printFoodInfo(event);
        } catch (NumberFormatException e) {
            System.out.println("numbers only");
            //userFood = new FoodItem();  //makes a new instance so it doesn't save some data if some fields don't throw exception
            //sets all values to zero if there is ANY exception for any field
            //if all values are 0, then the FoodItem will not be added to storage
            userFood.setCalories(0);
            userFood.setProtein(0);
            userFood.setCarbs(0);
            userFood.setFat(0);
            userFood.setServingSize(0);
        } catch (Exception e) {
            System.out.println("some error");
            //userFood = new FoodItem();  //makes a new instance so it doesn't save some data if some fields don't throw exception
            userFood.setCalories(0);
            userFood.setProtein(0);
            userFood.setCarbs(0);
            userFood.setFat(0);
            userFood.setServingSize(0);
        }

        //if user's food portion is not 0
        if(userServingSize>0 && dateSelected!=null ){
            //send user's food item input to calculator for this instance
            calc = new nutritionCalculator(userFood, userServingSize);

            //calculates results and logs them
            calculatedNutritionLog = calc.calculateAllNutrition();

            //store calculatedNutritionLog into ArrayList and add that list to hashtable using dateSelected?
            //what if I want to add another for the day? need to modify list within table.
            //I think can GET list from the hashmap, and then add another item or remove items based on user input
            ArrayList<NutritionLog> dayLog = new ArrayList<>();
            //add a food log to the date/day
            dayLog.add(calculatedNutritionLog);

            //add logged item to currently selected date/day
            //calendarLog exists outside of methods, can have more and more added to it.
            calendarLog.put(dateSelected, dayLog);
            //System.out.print(calendarLog.get(dateSelected));

            //get array list from the selected date
            //declare new arraylist here and iterate through it to print?
           // calendarLog.get(dateSelected);
        }


    }

    public void printFoodInfo(ActionEvent event) {
        System.out.println("Your Serving Size (g): " + userServingSize + "\n");
        System.out.println("One Serving Size (g): " + userFood.getServingSize() + "\n");
        System.out.println("Calories: " + userFood.getCalories() + "\n");
        System.out.println("Protein: " + userFood.getProtein() + "\n");
        System.out.println("Fat: " + userFood.getFat() + "\n");
        System.out.println("Carbs: " + userFood.getCarbs() + "\n");
    }

}
