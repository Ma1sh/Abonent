import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Abonent> abonents = new ArrayList<>();
        abonents.add(new Abonent("1", "Баранцев", "Иван", "Иванович", "Пушкина", 37243, 234343434, 1));
        abonents.add(new Abonent("2", "Нагабедян", "Аркадий", "Робертович", "Сосамбо", 21, 23434, 43));
        abonents.add(new Abonent("3", "Титоренко", "Илья", "Георгиевич", "Кирова", 13, 2333332, 334));
        abonents.add(new Abonent("4", "Евдошенко ", "Никита", "Нету", "Мира", 3431, 211111111, -75));
        abonents.add(new Abonent("5", "Золо", "Иван", "2004", "Москва", 121, 26456354, -283));
        abonents.add(new Abonent("Петров", "Иван", "Иванович", "Пушкина"));

        for (int i = 0; i < abonents.size(); i++) {
            if (abonents.get(i).getTime() >=50) {
                System.out.println(abonents.get(i));
            }
        }
    }
}