package hometask7.fellowship;

public class Aspirant extends Student {
    private boolean scienceWork;

    public Aspirant(String firstName, String lastName, String group, double averageMark, boolean scienceWork) {

        super(firstName, lastName, group, averageMark);
        this.scienceWork = scienceWork;


    }

    @Override
    public int getFellowship() {
        if (averageMark >= 5) {
            return 2 * super.getFellowship();
        } else {
            return super.getFellowship();


        }


    }
}
