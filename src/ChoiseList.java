public enum ChoiseList {
    RECTANGLE(1),
    CIRCLE(2),
    TRIANGLE(3),
    EXIT(0);

    private int action;

    public int getAction() {
        return action;
    }

    public void setAction(int action) {
        this.action = action;
    }

    ChoiseList(int choose){
        action = choose;
    }


}
