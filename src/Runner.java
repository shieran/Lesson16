import java.util.Collections;
import java.util.Comparator;

public class Runner {
    public static void main(String[] args) {
        ElkaToy toy = new Round("kruzhok", Colour.RED);
        Figure dedMoroz = new Figure("dedmoroz", Colour.RED, true);
        Star star1 = new Star("zvezda", Colour.WHITE);
        ElkaToy star2 = new Star("zvezda 2", Colour.BLACK);
        Elka elka = new Elka("elka");

        elka.addToy(toy);
        elka.addToy(dedMoroz);
        elka.addToy(star1);
        elka.addToy(star2);

        System.out.println(elka.countToysOfColour(Colour.RED));

        Collections.sort(elka.getToys());//сортировка коллекции дефолтным методом, необходимо переопределить comparable в ЕлкаТой

        Comparator<ElkaToy> coloursComporator = new Comparator<ElkaToy>() {
            @Override
            public int compare(ElkaToy o1, ElkaToy o2) {
                if (o1 == null && o2 == null){
                    return 0;
                }
                if (o1 != null && o2 == null){
                    return 1;
                }
                if (o1 == null && o2 != null){
                    return -1;
                }
                return o1.getColour().compareTo(o2.getColour());
            }
        };





    }
}
