public class Gryffindor extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, String surname, int powerOfMagic, int transgression, int nobility, int honor, int bravery) {
        super(name, surname, powerOfMagic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public String toString() {
        return "Студент Гриффендора " + getName() + " " + getSurname() +
                " Сила магии: " + getPowerOfMagic() + " " +
                " Pасстояние трансгрессии: " + getTransgression() + " " +
                " Благородство: " + getNobility() + " " +
                " Честь: " + getHonor() + " " +
                " Храбрость: " + getBravery();
    }

    private int sumOfProperties() {
        return nobility + honor + bravery;
    }

    public void compareTo(Gryffindor gryffindor) {
        int sumOfProperties1 = this.sumOfProperties();
        int sumOfProperties2 = gryffindor.sumOfProperties();
        if (sumOfProperties1 > sumOfProperties2) {
            System.out.println("Студент Гриффендора " + getName() + " " + getSurname() + " 'Сумма характеристик: " + sumOfProperties1 + "'" +
                    " лучше студента Гриффендора " + gryffindor.getName() + " " + gryffindor.getSurname() + " 'Сумма характеристик: " + sumOfProperties2 + "'");
        } else if (sumOfProperties1 < sumOfProperties2) {
            System.out.println("Студент Гриффендора " + gryffindor.getName() + " " + gryffindor.getSurname() + " 'Сумма характеристик: " + sumOfProperties2 + "'"
                    + " лучше студента Гриффендора " + getName() + " " + getSurname() + " 'Сумма характеристик: " + sumOfProperties1 + "'");
        } else {
            System.out.println("Студент Гриффендора " + gryffindor.getName() + " " + gryffindor.getSurname() + " 'Сумма характеристик: " + sumOfProperties2 + "'"
                    + " равен студенту Гриффендора " + getName() + " " + getSurname() + " 'Сумма характеристик: " + sumOfProperties1 + "'");
        }
    }
}
