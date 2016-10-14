package main.java.title.classifier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import main.java.title.classifier.AnalyseService;
import main.java.title.classifier.Analysis;
import main.java.title.classifier.CustomDatum;
import main.java.title.classifier.Model;
import main.java.title.classifier.ModelProvider;

public class MainTest {

    private static final String ANDROID = "ANDROID";
    private static final String IPHONE = "IPHONE";

    public static void main(String[] args) throws IOException {
        List<CustomDatum> corpus = new ArrayList<CustomDatum>(10);
        corpus.add(new CustomDatum("Iphone 7", IPHONE));
        corpus.add(new CustomDatum("samsung g5", ANDROID));
        corpus.add(new CustomDatum("Iphone 4s", IPHONE));
        corpus.add(new CustomDatum("htc m8", ANDROID));
        corpus.add(new CustomDatum("wiko", ANDROID));
        corpus.add(new CustomDatum("iphone 5", IPHONE));

        Model model = ModelProvider.buildModel(corpus);

        System.out.println(AnalyseService.eval("Iphone 5s", model));
        System.out.println(AnalyseService.eval("samsung galaxy", model));
        System.out.println(AnalyseService.eval("htc", model));
    }
}
