public class Field {
    private int sizeX;
    private int sizeY;

    private Fieldable[][] field;

    public Field(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        field = new Fieldable[sizeX][sizeY];
    }

    public int getSizeX() {
        return sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }

    public void setFieldable(int x, int y, Fieldable fieldable) {
        field[x][y] = fieldable;
    }

    public Fieldable getFieldable(int x, int y) {
        return field[x][y];
    }

    public void showField() {
        System.out.println("-----");

        for (int i = 0; i < sizeX; i++) {
            System.out.println();

            for (int j = 0; j < sizeY; j++) {
                System.out.println(field[i][j].getSymbol());
            }
        }
        System.out.println();
    }
}
