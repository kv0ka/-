class Exercise {
    private String name;
    private int count;
    public Exercise(String name, int count) {
        this.name = name;
        this.count = count;
    }
    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }
    @Override
    public String toString() {
        return name + ": " + count;
    }
}