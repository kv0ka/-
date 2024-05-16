import java.util.LinkedHashMap;
import java.util.Map;

class Dnevnik {
    private LinkedHashMap<String, Day> dnevnik;
    public Dnevnik() {
        dnevnik = new LinkedHashMap<>();
    }
    public void addDay(String date) {
        dnevnik.put(date, new Day());
    }
    public void removeDay(String date) {
        dnevnik.remove(date);
    }
    public void addExercise(String date, String name, int count) {
        if (dnevnik.containsKey(date)) {
            dnevnik.get(date).addExercise(name, count);
        } else {
            System.out.println("Нет такой даты в дневнике.");
        }
    }
    public void removeExercise(String date, String name) {
        if (dnevnik.containsKey(date)) {
            dnevnik.get(date).removeExercise(name);
        } else {
            System.out.println("Нет такой даты в дневнике.");
        }
    }
    public void printDnevnik() {
        for (Map.Entry<String, Day> entry : dnevnik.entrySet()) {
            System.out.println("Дата: " + entry.getKey());
            System.out.println("Упражнения:");
            System.out.println(entry.getValue());
        }
    }
    public String getDnevnik(String date) {
        if (dnevnik.containsKey(date)) {
            return dnevnik.get(date).toString();
        } else {
            return "Нет такой даты в дневнике.";
        }
    }
}
