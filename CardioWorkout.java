class CardioWorkout extends Workout {

    CardioWorkout(String name, int duration) {
        super(name, duration);
    }

    int calculateCalories() {
        return duration * 8;
    }
}
