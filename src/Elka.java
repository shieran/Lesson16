import java.util.ArrayList;
import java.util.List;

public class Elka {
    private String name;
    private List<ElkaToy> toys = new ArrayList<>();

    public Elka(String name, List<ElkaToy> toys) {
        this.name = name;
        this.toys = toys;
    }

    public Elka(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<ElkaToy> getToys() {
        return toys;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setToys(List<ElkaToy> toys) {
        this.toys = toys;
    }

    public void addToy(ElkaToy toy){
        toys.add(toy);
    }
     public int countToysOfColour(Colour colour){
        int counter = 0;
        for (ElkaToy toy: toys){
            if (colour == toy.getColour()){
                counter++;
            }
        }
        return counter;
     }
}
