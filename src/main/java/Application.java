import java.util.Map;

import static java.util.Map.entry;

public class Application {

    public static String getDecimalMask(String mask) {
        final Map<String, String> DECIMAL_MASK = Map.ofEntries(
                entry("0", "0.0.0.0"),
                entry("1", "128.0.0.0"),
                entry("2", "192.0.0.0"),
                entry("3", "224.0.0.0"),
                entry("4", "240.0.0.0"),
                entry("5", "248.0.0.0"),
                entry("6", "252.0.0.0"),
                entry("7", "254.0.0.0"),
                entry("8", "255.0.0.0"),
                entry("9", "255.128.0.0"),
                entry("10", "255.192.0.0"),
                entry("11", "255.224.0.0"),
                entry("12", "255.240.0.0"),
                entry("13", "255.248.0.0"),
                entry("14", "255.252.0.0"),
                entry("15", "255.254.0.0"),
                entry("16", "255.255.0.0"),
                entry("17", "255.255.128.0"),
                entry("18", "255.255.192.0"),
                entry("19", "255.255.224.0"),
                entry("20", "255.255.240.0"),
                entry("21", "255.255.248.0"),
                entry("22", "255.255.252.0"),
                entry("23", "255.255.254.0"),
                entry("24", "255.255.255.0"),
                entry("25", "255.255.255.128"),
                entry("26", "255.255.255.192"),
                entry("27", "255.255.255.224"),
                entry("28", "255.255.255.240"),
                entry("29", "255.255.255.248"),
                entry("30", "255.255.255.252"),
                entry("31", "255.255.255.254"),
                entry("32", "255.255.255.255")
                );
        return DECIMAL_MASK.get(mask);
    }
}
