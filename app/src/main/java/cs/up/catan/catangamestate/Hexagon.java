package cs.up.catan.catangamestate;

public class Hexagon {
    private String resourceType;
    private int chitValue;

    /**
     * Hexagon constructor AW
     *
     * @param resourceType - resourceType type of hexagon
     * @param chitValue    - dice value of hexagon
     */
    public Hexagon(String resourceType, int chitValue) {
        this.resourceType = resourceType;
        this.chitValue = chitValue;
    }

    /**
     * @return
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * @return
     */
    public int getChitValue() {
        return chitValue;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append("Hexagon{ ");
        sb.append("resourceType: ");
        sb.append(resourceType);
        sb.append(", chitValue: ");
        sb.append(chitValue);
        sb.append("}");

        return sb.toString();
    }
}
