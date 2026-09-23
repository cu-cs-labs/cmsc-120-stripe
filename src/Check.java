// Pyret's `is`, for Java.
//
// Given: keep this file beside yours and do not edit it. In main, write
//
//     Check.is(stripeWidth(10), 60);
//
// once per example, and Check.done() as the last line. A check that fails
// prints what it got and what it expected; done() prints the count.

class Check {
    static int passed = 0;
    static int failed = 0;

    static void is(int got, int expected)         { record(got == expected, "" + got, "" + expected); }
    static void is(double got, double expected)   { record(got == expected, "" + got, "" + expected); }
    static void is(boolean got, boolean expected) { record(got == expected, "" + got, "" + expected); }
    static void is(String got, String expected)   { record(got.equals(expected), got, expected); }

    static void record(boolean ok, String got, String expected) {
        if (ok) {
            passed = passed + 1;
        } else {
            failed = failed + 1;
            IO.println("FAIL check " + (passed + failed) + ": got " + got + ", expected " + expected);
        }
    }

    static void done() {
        if (failed == 0) {
            IO.println("Looks shipshape, all " + passed + " checks passed");
        } else {
            IO.println(passed + " passed, " + failed + " FAILED");
        }
    }
}
