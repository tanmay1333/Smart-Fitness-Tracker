public class Main {
    public static void main(String[] args) {
        CardioWorkout c = new CardioWorkout("Running", 30);
        StrengthWorkout s = new StrengthWorkout("Gym", 40);

        System.out.println("Cardio Calories: " + c.calculateCalories());
        System.out.println("Strength Calories: " + s.calculateCalories());
    }
}