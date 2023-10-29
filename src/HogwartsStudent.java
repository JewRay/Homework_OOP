public abstract class HogwartsStudent {
    private String name;
    private String surname;
    private int powerOfMagic;
    private int transgression;

    public HogwartsStudent(String name, String surname, int powerOfMagic, int transgression) {

        this.name = name;
        this.surname = surname;
        this.powerOfMagic = powerOfMagic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    private int sumOfProperties() {
        return powerOfMagic + transgression;
    }

    public void compareTo(HogwartsStudent hogwartsStudent) {
        int sumOfProperties1 = this.sumOfProperties();
        int sumOfProperties2 = hogwartsStudent.sumOfProperties();
        if (sumOfProperties1 > sumOfProperties2) {
            System.out.println("Студент " + name + " " + surname + " 'Сумма характеристик: " + sumOfProperties1 + "'" +
                    " лучше студента " + hogwartsStudent.name + " " + hogwartsStudent.surname + " 'Сумма характеристик: " + sumOfProperties2 + "'");
        } else if (sumOfProperties1 < sumOfProperties2) {
            System.out.println("Студент " + hogwartsStudent.name + " " + hogwartsStudent.surname + " 'Сумма характеристик: " + sumOfProperties2 + "'" +
                    " лучше студента " + name + " " + surname + " 'Сумма характеристик: " + sumOfProperties1 + "'");
        } else {
            System.out.println("Студент " + hogwartsStudent.name + " " + hogwartsStudent.surname + " 'Сумма характеристик: " + sumOfProperties2 + "'" +
                    " равен студенту " + name + " " + surname + " 'Сумма характеристик: " + sumOfProperties1 + "'");
        }
    }
}
