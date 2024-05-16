import java.util.ArrayList;
import java.util.List;


class Day {
    private List<Exercise> exercises;
    public Day() {
        exercises = new ArrayList<>();
    }
    public void addExercise(String name, int count) {
        Exercise exercise = new Exercise(name, count);
        exercises.add(exercise);
    }
    public void removeExercise(String name) {
        exercises.removeIf(exercise -> exercise.getName().equals(name));
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (Exercise exercise : exercises) {
            builder.append(exercise).append("\n");
        }
        return builder.toString();
    }
}