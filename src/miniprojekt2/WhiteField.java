package miniprojekt2;

/**
 * Implements a white field.
 *
 * @author Marcus
 */
public class WhiteField extends Field { // TODO: change inheritance hierarchy

    /**
     * Creates a new white field at the specified position.
     *
     * @param x The x coordinate of the position.
     * @param y The y coordinate of the position.
     */


    public WhiteField(int x, int y) {
        super(x, y);

    }

    @Override
    public String getColor() {
        return null;
    }

    /**
     * Returns the string "w".
     *
     * @return The string "w".
     */
    // TODO: override getColor


}
