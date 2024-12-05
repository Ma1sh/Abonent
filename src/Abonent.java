public class Abonent {
    private String number;
    private String lastName;
    private String name;
    private String secondName;
    private String address;
    private int time;
    private int creditCardNumber;
    private int dolg;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public int getDolg() {
        return dolg;
    }

    public void setDolg(int dolg) {
        this.dolg = dolg;
    }

    public Abonent(String number, String lastName, String name, String secondName, String address, int time, int creditCardNumber, int dolg) {
        this.number = number;
        this.lastName = lastName;
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.time = time;
        this.creditCardNumber = creditCardNumber;
        this.dolg = dolg;
    }


    public Abonent(String lastName, String name, String secondName, String address) {
        this.lastName = lastName;
        this.name = name;
        this.secondName = secondName;
        this.address = address;
    }
    @Override
    public String toString() {
        if (number != null) {
            return "abonent:" +
                    "Номер = " + number +
                    ", Фамилия ='" + lastName + '\'' +
                    ", Имя = '" + name + '\'' +
                    ", Отчество = '" + secondName + '\'' +
                    ", Адрес = '" + address + '\'' +
                    ", Общее время разговора = " + time +
                    ", Номер кредитной карточки = " + creditCardNumber +
                    ", Дебет = " + dolg;
        }
        else {
            return "abonent:" +
                    "Фамилия ='" + lastName + '\'' +
                    ", Имя = '" + name + '\'' +
                    ", Отчество = '" + secondName + '\'' +
                    ", Адрес = '" + address + '\'' ;
        }
    }
}