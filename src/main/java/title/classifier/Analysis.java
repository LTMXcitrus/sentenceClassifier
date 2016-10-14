package main.java.title.classifier;

public class Analysis {

    String sentence;
    String value;
    double probability;

    public Analysis(final String sentence, final String value, final double probability) {
        this.sentence = sentence;
        this.value = value;
        this.probability = probability;
    }

    public String getSentence() {
        return sentence;
    }

    public String getValue() {
        return value;
    }

    public double getProbability() {
        return probability;
    }

    public String toString(){
        return "sentence: "+sentence +", seems to be a: "+ value +", with a probability of: " + probability;
    }
}
