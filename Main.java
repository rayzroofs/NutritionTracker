import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;
import java.util.Stack;

public class Main extends Application {
    Stage window;
    Scene scene1, scene2;
    Button button; //declared outside methods so they can use it

    //MAIN METHOD
    public static void main(String[] args) {
        //method from Application class, sets up program as a JavaFX application
        //sets it up and class START method, which is overridden below
        launch(args);

/*
        //scanner for user input
        Scanner reader = new Scanner(System.in);

        double userServingSize;
        double servingSize;
        double calories;
        double protein;
        double fat;
        double carbs;


        System.out.println("One Serving size (grams):");
        servingSize = reader.nextInt();
        System.out.println("Your serving size (grams) :");
        userServingSize = reader.nextInt();
        System.out.println("Calories per serving:");
        calories = reader.nextInt();
        System.out.println("Protein per serving:");
        protein = reader.nextInt();
        System.out.println("Fat per serving:");
        fat = reader.nextInt();
        System.out.println("Carbs per serving:");
        carbs = reader.nextInt();


        //make FoodItem using user's input for nutrition properties
        FoodItem userFood = new FoodItem(servingSize, userServingSize, calories, protein, fat, carbs);

        //creating CALCULATOR instance using
        nutritionCalculator calc = new nutritionCalculator(userFood);
        calc.calculateAllNutrition();

 */

    }

    //overridden because it's from the Application class
    @Override
    public void start(Stage primaryStage) throws Exception {
        //FoodItem userFood = new FoodItem();

        Parent root = FXMLLoader.load(getClass().getResource("mainWindow.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}