public enum Colour {
    BLACK("black"),
    RED("red"),
    BLUE("blue"),
    WHITE("white");

    private String name;

    Colour(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
