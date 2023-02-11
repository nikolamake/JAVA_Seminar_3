package Seminar_6;


import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Notebook lenovoIPGaming3 = new Notebook(81.5, "Lenovo",
                15.6, "1920x1080", "IPS"
                , "AMD Ryzen", 5.46,
                6, " NVIDIA ", 4,
                8, "DDR4", 2, "SSD",
                256, "HDMI");
        Notebook acerNitro_5 = new Notebook(67.2, "Acer",
                15.6, "1920x1080", "IPS"
                , " Intel Core i5", 4.5,
                4, " NVIDIA ", 4,
                8, "DDR4", 2, "SSD",
                512, "HDMI");
        Notebook HP_15s_fq = new Notebook(37.4, "HP",
                15.6, "1920x1080", "IPS"
                , " Intel Core i3", 3.7,
                4, " NaN", 0,
                8, "DDR4", 2, "SSD",
                256, "HDMI");
        Notebook acerAspir_7 = new Notebook(68.2, "Acer",
                15.6, "1920x1080", "IPS"
                , " Intel Core i5", 4.1,
                4, " NVIDIA ", 4,
                8, "DDR4", 2, "SSD",
                256, "HDMI");
        Notebook acerVivoBook = new Notebook(57.4, "Acer",
                15.6, "1920x1080", "TN"
                , " Intel Pentium 4417U ", 2.3,
                2, " NVIDIA ", 2,
                4, "DDR4", 1, "SSD",
                256, "NaN");

//        List<Notebook> notebooks = List.of(lenovoIPGaming3,
//                acerNitro_5, HP_15s_fq, acerAspir_7, acerVivoBook);
//        for (Notebook notebook : notebooks) {
//            notebook.printInfo();
//        }
//        Stream<Notebook> notebookStream = Stream.of(lenovoIPGaming3,
//                acerNitro_5, HP_15s_fq, acerAspir_7, acerVivoBook);
//        notebookStream.filter(p->p.getPrice() < 67).forEach(p->System.out.println(p.printInfo())); // выводить данные по стоимости менее 67 тыс.руб

        Stream<Notebook> notebook1Stream = Stream.of(lenovoIPGaming3,
                acerNitro_5, HP_15s_fq, acerAspir_7, acerVivoBook);
        notebook1Stream.filter(p->p.getDiskSize() > 256).forEach(p->System.out.println(p.printInfo())); // объём диска больше 256
    }
}
