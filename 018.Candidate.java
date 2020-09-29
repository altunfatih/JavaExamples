public abstract class Candidate {
    private int turkish;
    private int math;
    private int literature;
    private int physics;
    private String name;

    public Candidate(int turkish, int math, int literature, int physic, String name) {
        this.turkish = turkish;
        this.math = math;
        this.literature = literature;
        this.physics = physics;
        this.name = name;
    }

    abstract int gradeCalculation();

    public int getTurkish() {
        return turkish;
    }

    public void setTurkish(int turkish) {
        this.turkish = turkish;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getLiterature() {
        return literature;
    }

    public void setLiterature(int literature) {
        this.literature = literature;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
