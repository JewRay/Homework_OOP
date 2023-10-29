public class Hufflepuff extends HogwartsStudent {
    private int honesty;
    private int hardworking;
    private int loyal;

    public Hufflepuff(String name, String surname, int powerOfMagic, int transgression, int honesty, int hardworking, int loyal) {
        super(name, surname, powerOfMagic, transgression);
        this.honesty = honesty;
        this.hardworking = hardworking;
        this.loyal = loyal;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public String toString() {
        return "Студент Пуффендуя " + getName() + " " + getSurname() +
                " Сила магии: " + getPowerOfMagic() + " " +
                " Pасстояние трансгрессии: " + getTransgression() + " " +
                " Трудолюбие: " + getHardworking() + " " +
                " Верность: " + getLoyal() + " " +
                " Честность: " + getHonesty();
    }

    private int sumOfProperties() {
        return honesty + loyal + hardworking;
    }

    public void compareTo(Hufflepuff hufflepuff) {
        int sumOfProperties1 = this.sumOfProperties();
        int sumOfProperties2 = hufflepuff.sumOfProperties();
        if (sumOfProperties1 > sumOfProperties2) {
            System.out.println("Студент Пуффендуя " + getName() + " " + getSurname() + " 'Сумма характеристик: " + sumOfProperties1 + "'" +
                    " лучше студента Пуффендуя " + hufflepuff.getName() + " " + hufflepuff.getSurname() + " 'Сумма характеристик: " + sumOfProperties2 + "'");
        } else if (sumOfProperties1 < sumOfProperties2) {
            System.out.println("Студент Пуффендуя " + hufflepuff.getName() + " " + hufflepuff.getSurname() + " 'Сумма характеристик: " + sumOfProperties2 + "'" +
                    " лучше студента Пуффендуя " + getName() + " " + getSurname() + " 'Сумма характеристик: " + sumOfProperties1 + "'");
        } else {
            System.out.println("Студент Пуффендуя " + hufflepuff.getName() + " " + hufflepuff.getSurname() + " 'Сумма характеристик: " + sumOfProperties2 + "'"
                    + " равен студенту Пуффендуя " + getName() + " " + getSurname() + " 'Сумма характеристик: " + sumOfProperties1 + "'");
        }
    }
}

