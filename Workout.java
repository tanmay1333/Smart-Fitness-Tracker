abstract class Workout {
    String name;
    int duration;

    Workout(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    abstract int calculateCalories();
}
