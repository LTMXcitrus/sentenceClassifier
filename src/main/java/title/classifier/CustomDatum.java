package main.java.title.classifier;

public class CustomDatum {
    private String sentence;
    private String value;

    public CustomDatum(final String sentence, final String value) {
        this.sentence = sentence;
        this.value = value;
    }

    public String getSentence() {
        return sentence;
    }

    public String getValue() {
        return value;
    }
}
