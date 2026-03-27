class StrengthWorkout extends Workout {
    StrengthWorkout(String name, int duration) {
        super(name, duration);
    }

    int calculateCalories() {
        return duration * 5;
    }
}