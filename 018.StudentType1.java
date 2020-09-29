public class StudentType1 extends Candidate{

    public StudentType1(int turkish, int math, int literature, int physics, String name) {
        super(turkish, math, literature, physics, name);
    }

    @Override
    public int gradeCalculation() {
        return getTurkish() * 5 + getMath() * 5 + getPhysics() * 1 + getLiterature() * 4;
    }
}
