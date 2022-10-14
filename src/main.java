import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class main {
    public static void main(String[] args) {
        var patients = setPatients();
        /*SearchDiagn(patients);
        SearchCardId(patients);*/
        FirstNumb(patients);
    }

    /**Метод для створення та заповнення об'єкту типу Patient
     * @return об'єкт типу Patient*/
    public static Patient setPatient()
    {
        Scanner scanner = new Scanner(System.in);
        Patient patient = new Patient();

        System.out.print("Введіть ID ");
        patient.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Введіть прізвище ");
        patient.setSurname(scanner.nextLine());

        System.out.print("Введіть ім'я ");
        patient.setName(scanner.nextLine());

        System.out.print("Введіть по бітькові ");
        patient.setPatronymic(scanner.nextLine());

        System.out.print("Введіть адресу ");
        patient.setAddress(scanner.nextLine());

        System.out.print("Введіть телефон ");
        patient.setNumber(scanner.nextLine());

        System.out.print("Введіть номер медичної карти ");
        patient.setCardId(scanner.nextInt());
        scanner.nextLine();

        System.out.print("Введіть діагноз ");
        patient.setDiagnosis(scanner.nextLine());

        return patient;
    }

    /**Метод заповення масиву даних
     * @return масив об'єктів*/
    public static Patient[] setPatients()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість пацієнтів ");
        var patients = new Patient[scanner.nextInt()];
        for(int i=0; i< patients.length; i++)
        {
            Patient patient=setPatient();
            patients[i]=patient;
        }
        return patients;
    }

    /** Метод для знаходження списку пацієнтів, які мають вказаний діагноз
     * @param patients - масив об'єктів*/
    public static void SearchDiagn(Patient[] patients)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведіть діагноз який хочете знайти ");
        String d = scanner.nextLine();
        for (Patient patient : patients)
            if (d.equals(patient.getDiagnosis()))
                System.out.print(patient + "\n");
    }

    /** Метод для знаходження списку пацієнтів, номер медичної карти у яких знаходиться в заданому інтервалі
     * @param patients - масив об'єктів*/
    public static void SearchCardId(Patient[] patients)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведіть інтервал ");
        System.out.print("\nВід ");
        int n=scanner.nextInt();
        System.out.print("До ");
        int m=scanner.nextInt();
        for (Patient patient : patients)
            if (patient.getCardId() > n && patient.getCardId() < m)
                System.out.print(patient + "\n");
    }

    /** Метод для знаходження кількості та списку пацієнтів, номер телефону яких починається з вказаної цифри
     * @param patients - масив об'єктів*/
    public static void FirstNumb(Patient[] patients)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведіть першу цифру номеру ");
        String k=scanner.next();
        Pattern pattern = Pattern.compile(k+".+" + "|\\+380"+ k +".+" +"|0"+ k +".+");
        for (Patient patient : patients) {
            if (Pattern.matches(pattern + "",patient.getNumber()) )
                System.out.print(patient + "\n");
        }
    }
}
