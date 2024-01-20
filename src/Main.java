import java.io.File;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MainFrame main = new MainFrame();
        List<Person> people = FilePersonLoader.with("hw_25000.tsv").load();
        double[] data = people.stream().mapToDouble(Main::toDouble).toArray();

        main.getHistogramDisplay().show(
                "Weight",
                "People",
                data,
                20
        );
        main.setVisible(true);
    }

    private static double toDouble(Person person){
        return person.getWeight();
    }
}