import java.util.Random;

public class App {
    public static int getRandom() {
        Random random = new Random();
        int r = random.nextInt(100) + 1;
        return r;
    }

    public static void main(String[] args) {
        Gryffindor student1 = new Gryffindor("Гарри", "Поттер", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Gryffindor student2 = new Gryffindor("Гермиона", "Грейнджер", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Gryffindor student3 = new Gryffindor("Рон", "Уизли", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());

        Hufflepuff student4 = new Hufflepuff("Захария", "Смит", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Hufflepuff student5 = new Hufflepuff("Седрик", "Диггори", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());
        Hufflepuff student6 = new Hufflepuff("Джастин", "Финч-Флетчли", getRandom(), getRandom(), getRandom(), getRandom(), getRandom());

        Ravenclaw student7 = new Ravenclaw("Чжоу", "Чанг", getRandom(), getRandom(), getRandom(), getRandom(),getRandom(), getRandom());
        Ravenclaw student8 = new Ravenclaw("Падма", "Патил", getRandom(), getRandom(), getRandom(),getRandom(), getRandom(), getRandom());
        Ravenclaw student9 = new Ravenclaw("Маркус", "Белби", getRandom(), getRandom(), getRandom(), getRandom(),getRandom(), getRandom());

        Slytherin student10 = new Slytherin("Драко", "Малфой", getRandom(), getRandom(),getRandom(),getRandom(), getRandom(), getRandom(), getRandom());
        Slytherin student11 = new Slytherin("Грэхэм", "Монтегю", getRandom(), getRandom(),getRandom(),getRandom(), getRandom(), getRandom(), getRandom());
        Slytherin student12 = new Slytherin("Грегори", "Гоил", getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom(), getRandom());

        System.out.println(student1.toString());
        System.out.println(student10.toString());
        student1.compareTo(student10);
        student1.compareTo(student2);


    }
}