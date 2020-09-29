public class StudentType2 extends Candidate {

    public StudentType2(int turkish, int math, int literature, int physics, String name) {
        super(turkish, math, literature, physics, name);
    }

    @Override
    public int gradeCalculation() {
        return getTurkish() * 5 + getMath() * 5 + getPhysics() * 4 + getLiterature() * 1;
    }
}
