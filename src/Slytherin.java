public class Slytherin extends HogwartsStudent {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, String surname, int powerOfMagic, int transgression, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, surname, powerOfMagic, transgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    public String toString() {
        return "Студент Слизерина " + getName() + " " + getSurname() +
                " Сила магии: " + getPowerOfMagic() + " " +
                " Pасстояние трансгрессии: " + getTransgression() + " " +
                " Хитрость " + getTrick() + " " +
                " Решительность: " + getDetermination() + " " +
                " Амбициозность: " + getAmbition() +
                " Жажда власти: " + getLustForPower() +
                " Находчивость: " + getResourcefulness();
    }

    private int sumOfProperties() {
        return trick + determination + ambition + resourcefulness + lustForPower;
    }

    public void compareTo(Slytherin slytherin) {
        int sumOfProperties1 = this.sumOfProperties();
        int sumOfProperties2 = slytherin.sumOfProperties();
        if (sumOfProperties1 > sumOfProperties2) {
            System.out.println("Студент Слизерина " + getName() + " " + getSurname() + " 'Сумма характеристик: " + sumOfProperties1 + "'" +
                    " лучше студента Слизерина " + slytherin.getName() + " " + slytherin.getSurname() + " 'Сумма характеристик: " + sumOfProperties2 + "'");
        } else if (sumOfProperties1 < sumOfProperties2) {
            System.out.println("Студент Слизерина " + slytherin.getName() + " " + slytherin.getSurname() + " 'Сумма характеристик: " + sumOfProperties2 + "'" +
                    " лучше студента Слизерина" + getName() + " " + getSurname() + " 'Сумма характеристик: " + sumOfProperties1 + "'");
        } else {
            System.out.println("Студент Слизерина " + slytherin.getName() + " " + slytherin.getSurname() + " 'Сумма характеристик: " + sumOfProperties2 + "'" +
                    " равен студенту Слизерина" + getName() + " " + getSurname() + " 'Сумма характеристик: " + sumOfProperties1 + "'");
        }
    }
}
