public class Ravenclaw extends HogwartsStudent {

    private int smart;
    private int wise;
    private int witty;
    private int creative;

    public Ravenclaw(String name, String surname, int powerOfMagic, int transgression, int smart, int wise, int witty, int creative) {
        super(name, surname, powerOfMagic, transgression);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public String toString() {
        return "Студент Когтеврана " + getName() + " " + getSurname() +
                " Сила магии: " + getPowerOfMagic() + " " +
                " Pасстояние трансгрессии: " + getTransgression() + " " +
                " Ум: " + getSmart() + " " +
                " Мудрость: " + getWise() + " " +
                " Остроумность: " + getWitty() +
                " Творчество: " + getCreative();
    }

    private int sumOfProperties() {
        return creative + wise + witty + smart;
    }

    public void compareTo(Ravenclaw ravenclaw) {
        int sumOfProperties1 = this.sumOfProperties();
        int sumOfProperties2 = ravenclaw.sumOfProperties();
        if (sumOfProperties1 > sumOfProperties2) {
            System.out.println("Студент Когтеврана " + getName() + " " + getSurname() + " 'Сумма характеристик: " + sumOfProperties1 + "'" +
                    " лучше студента Когтеврана " + ravenclaw.getName() + " " + ravenclaw.getSurname() + " 'Сумма характеристик: " + sumOfProperties2 + "'");
        } else if (sumOfProperties1 < sumOfProperties2) {
            System.out.println("Студент Когтеврана " + ravenclaw.getName() + " " + ravenclaw.getSurname() + " 'Сумма характеристик: " + sumOfProperties2 + "'" +
                    " лучше студента Когтеврана" + getName() + " " + getSurname() + " 'Сумма характеристик: " + sumOfProperties1 + "'");
        } else {
            System.out.println("Студент Когтеврана " + ravenclaw.getName() + " " + ravenclaw.getSurname() + " 'Сумма характеристик: " + sumOfProperties2 + "'" +
                    " равен студенту Когтеврана" + getName() + " " + getSurname() + " 'Сумма характеристик: " + sumOfProperties1 + "'");
        }
    }
}
