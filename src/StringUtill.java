

import java.util.Arrays;
import java.util.stream.Collectors;

public final class StringUtill {
    private StringUtill() {}

    // Reverse a string safely (handles null)
    public static String reverse(String s) {
        if (s == null) return null;
        return new StringBuilder(s).reverse().toString();
    }

    // Convert sentence to Title Case ("hello world" -> "Hello World")
    public static String toTitleCase(String s) {
        if (s == null) return null;
        return Arrays.stream(s.split("\\s+"))//
                .map(part -> {
                    if (part.isEmpty()) return part;
                    return part.substring(0, 1).toUpperCase() + part.substring(1).toLowerCase();
                })
                .collect(Collectors.joining(" "));
    }

    // Check if a string is numeric (integers or decimals)
    public static boolean isNumeric(String s) {
        if (s == null || s.isBlank()) return false;
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // Join non-null, non-empty parts with a delimiter
    public static String joinNonEmpty(String delimiter, String... parts) {
        if (delimiter == null) delimiter = "";
        return Arrays.stream(parts == null ? new String[0] : parts)
                .filter(p -> p != null && !p.isBlank())
                .collect(Collectors.joining(delimiter));
    }
}
