public class Main {
    public static void main(String[] args) {
        Dnevnik dnevnik;
        dnevnik = new Dnevnik();
        dnevnik.addDay("Понедельник");
        dnevnik.addExercise("Понедельник", "Отжимания", 50);
        dnevnik.addExercise("Понедельник", "Подтягивания", 20);
        dnevnik.addDay("Вторник");
        dnevnik.addExercise("Вторник", "Приседания", 100);
        dnevnik.addDay("Среда");
        dnevnik.addExercise("Среда", "Подъём ног", 30);
        dnevnik.addDay("Четверг");
        dnevnik.addExercise("Четверг", "Бег", 500);
        dnevnik.addDay("Пятница");
        dnevnik.addExercise("Пятница", "Подтягивания", 20);


        // Вывод дней в порядке добавления
        System.out.println("Дневник спортсмена:");
        dnevnik.printDnevnik();
        System.out.println();
        // Удаление упражнения
        dnevnik.removeExercise("Понедельник", "Подтягивания");
        // Удаление дня
        dnevnik.removeDay("Четверг");
        // Вывод дней после удаления
        System.out.println("Дневник после удалений:");
        dnevnik.printDnevnik();
    }
}
