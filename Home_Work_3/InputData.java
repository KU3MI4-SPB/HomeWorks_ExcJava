package Home_Work_3;
import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Введите данные пользователя в формате Ф.И.О, дата рождения, номер телефона цифрами, пол - f/m \nПример: Kuznetsov Aleksandr Vyacheslavovich 22.04.1980 79991234567 f");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Ошибка: недостаточное количество данных");
            } else System.out.println("Ошибка: введены личшние данные");
        }

    }
}
