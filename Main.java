import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Workout> workouts = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Cardio Workout");
            System.out.println("2. Add Strength Workout");
            System.out.println("3. View Total Calories");
            System.out.println("4. Exit");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter duration: ");
                int d = sc.nextInt();
                workouts.add(new CardioWorkout("Cardio", d));
            } 
            else if (choice == 2) {
                System.out.print("Enter duration: ");
                int d = sc.nextInt();
                workouts.add(new StrengthWorkout("Strength", d));
            } 
            else if (choice == 3) {
                int total = 0;
                for (Workout w : workouts) {
                    total += w.calculateCalories(); // polymorphism
                }
                System.out.println("Total Calories: " + total);
            } 
            else {
                break;
            }
        }
    }
}
