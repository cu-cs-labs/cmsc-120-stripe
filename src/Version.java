// Which Java is this? Run it and copy the line it prints into the setup quiz.
//
// The lines around println are Java's older spelling of "start here"; you
// meet it later in the course. It is written this way so that it runs on any
// Java, old or new, which is the point of asking.
class Version {
    public static void main(String[] args) {
        System.out.println("Java " + System.getProperty("java.version"));
    }
}
