import java.io.*;
import java.util.*;

class WorkoutRepository {

    static void saveWorkouts(List<Workout> workouts) {
        try {
            FileWriter fw = new FileWriter("workouts.txt");
            for (Workout w : workouts) {
                fw.write(w.name + "," + w.duration + "\n");
            }
            fw.close();
        } catch (Exception e) {
            System.out.println("Error saving data");
        }
    }

    static List<Workout> loadWorkouts() {
        List<Workout> list = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("workouts.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                list.add(new CardioWorkout(data[0], Integer.parseInt(data[1])));
            }

            br.close();
        } catch (Exception e) {
            System.out.println("No previous data found");
        }

        return list;
    }
}
