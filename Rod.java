class Rod {
    boolean red;
    boolean blue;
    boolean green;

    public Rod() {
        this.red = false;
        this.blue = false;
        this.green = false;
    }

    public void setRingColor(char color) {
        if (color == 'B')
            blue = true;
        if (color == 'G')
            green = true;
        if (color == 'R')
            red = true;
    }

    public boolean getHas3Rings() {
        return (green && blue && red);
    }
}