// Which Java is this? Run it and copy what it prints into the setup quiz.
//
// The lines around println are Java's older spelling of "start here"; you
// meet it later in the course. It is written this way so that it runs on any
// Java, old or new, which is the point of asking.
class Version {
    public static void main(String[] args) {
        System.out.println("Java " + System.getProperty("java.version")
                           + " (" + System.getProperty("java.vendor") + ")");
        System.out.println(System.getProperty("os.name") + " "
                           + System.getProperty("os.version"));
    }
}
