package lab.bjes.enums;

public enum EnumLab {
    LAB("labbma"), ENUMVAL("enum123"), VALUE("stringValue");

    final String enumValue;

    EnumLab(String s) {
        this.enumValue = s;
    }

    String getEnumValue() {
        return enumValue;
    }
}
