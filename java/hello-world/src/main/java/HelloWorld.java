public final class HelloWorld {

    static String hello(final String name) {
        final String whom = isBlank(name) ? "World" : name;
        return "Hello, " + whom + "!";
    }

    private static boolean isBlank(final String string) {
        return string == null || "".equals(string);
    }
}