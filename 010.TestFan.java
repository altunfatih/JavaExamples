public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setColor("Yellow");
        fan1.setSpeed(fan1.getFast());
        fan1.setOn(true);
        fan1.setRadius(10);

        Fan fan2 = new Fan(2,false,5,"Blue");

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }