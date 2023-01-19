# NutritionTracker
Allows user to input their serving size and the nutirtional info for a food. Nutrional values will be calculated and stored with corresponding dates for when the items were logged.  
  
FoodItem.java:  
  - object that contains nutritional data for a food item  
NutritionCalclator.Java:  
  - contains methods for calculating nutritional values based on serving size and nutrtional data of a given FoodItem   
NutritionLog.java:  
  - object that contains the results of a nutrition calculation done by NutritionCalculator   
  - a NutritionLog will be saved to a hashmap along with the selected calendar date   
Controller.java:  
  - GUI controller that will call appropriate methods   
    
Hashmap still needs to be implemented, as well as testing and compensating for user input errors.
