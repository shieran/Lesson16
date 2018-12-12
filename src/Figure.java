public class Figure extends ElkaToy {
    private final boolean isFigureOfMan;


    public Figure(String name, Colour colour, boolean isFigureOfMan) {
        super(name, colour, Shape.FIGURE);
        this.isFigureOfMan = isFigureOfMan;
    }

    public boolean isFigureOfMan() {
        return isFigureOfMan;
    }

}
