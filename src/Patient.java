public class Patient {
    /**id пацієнта*/
    private int id;
    /**Прізвище пацієнта*/
    private String surname;
    /**Ім'я пацієнта*/
    private String name;
    /**по батькові пацієнта*/
    private String patronymic;
    /**адреса пацієнта*/
    private String address;
    /**номер телефону пацієнта*/
    private String number;
    /**Номер медичної карти пацієнта*/
    private int cardId;
    /**Діагноз пацієнта*/
    private String diagnosis;


    /**Геттер для поля id
     * @return id пацієнта*/
    public int getId(){return id;}

    /**Сеттер для поля id
     * @param id - id пацієнта*/
    public void setId(int id) {this.id=id;}

    /**Геттер для поля surname
     * @return Прізвище пацієнта*/
    public String getSurname(){return surname;}

    /**Сеттер для поля surname
     * @param surname - Прізвище пацієнта*/
    public void setSurname(String surname){this.surname=surname;}

    /**Геттер для поля name
     * @return Ім'я пацієнта*/
    public String getName(){return name;}

    /**Сеттер для поля surname
     * @param name - Ім'я пацієнта*/
    public void setName(String name){this.name=name;}

    /**Геттер для поля patronymic
     * @return По батькові пацієнта*/
    public String getPatronymic(){return patronymic;}

    /**Сеттер для поля patronymic
     * @param patronymic - По батькові пацієнта*/
    public void setPatronymic(String patronymic){this.patronymic=patronymic;}

    /**Геттер для поля address
     * @return Адресу пацієнта*/
    public String getAddress(){return address;}

    /**Сеттер для поля address
     * @param address - Адреса пацієнта*/
    public void setAddress(String address){this.address=address;}

    /**Геттер для поля number
     * @return Перший елемент номеру пацієнта*/
    public String getNumber(){return number;}

    /**Сеттер для поля number
     * @param number - Номер телефону пацієнта*/
    public void setNumber(String number) {this.number=number;}

    /**Геттер для поля cardId
     * @return Номер медичної карти пацієнта*/
    public int getCardId(){return cardId;}

    /**Сеттер для поля cardId
     * @param cardId - Номер медичної картки пацієнта*/
    public void setCardId(int cardId) {this.cardId=cardId;}

    /**Геттер для поля diagnosis
     * @return Діагноз пацієнта*/
    public String getDiagnosis(){return diagnosis;}

    /**Сеттер для поля diagnosis
     * @param diagnosis - Діагноз пацієнта*/
    public void setDiagnosis(String diagnosis){this.diagnosis=diagnosis;}

    /**Конструктор без параметрів*/
    public Patient(){}


    /**Метод toString
     * @return параметри у форматі String*/
    public String toString()
    {
        return "Пацієнт:"+id+ " Прізвище: "+surname+ " Ім'я: "+name+ " По батькові: "+patronymic+ " Адреса: " +address+
                " Телефон: "+number+ " Номер медичної карти: "+cardId+ " Діагноз: "+diagnosis;
    }
}
