package Home_Work_3;

public class DataException extends Exception{
    public DataException() {
    }

    public void dataException(String i) {
        System.out.println("Ошибка: DataNotCorrectFormat");
        System.out.printf("Некорректные данные: %s", i);
        System.out.println();
    }
}
