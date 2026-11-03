import models.Cat;
import utils.PrintUtil;
import utils.catCollection;
import utils.catManager;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Cat> Cats = catCollection.readCats("data/Cats.json");

        catManager catmanager = new catManager(Cats);



        String rowFormat = "| %-3s | %-5s | %-8s | %-5s | %-5s | %-5s | %-5s | %n";
        System.out.println("------+-------+----------+---------+------------+----------+---------------+--");
        System.out.printf(rowFormat, "#", "Имя", "Возраст", "Сытость", "Настроение", "Здоровье", "Общий уровень" );
        System.out.println("------+-------+----------+---------+------------+----------+---------------+--");
        PrintUtil.printCats(catmanager.sortedByAverage());

        catCollection.writeCats(catmanager.getCats(), "data/Cats.json");
    }
}
