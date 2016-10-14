package main.java.title.classifier;

import edu.stanford.nlp.classify.LinearClassifier;
import edu.stanford.nlp.ling.Datum;
import edu.stanford.nlp.stats.Counter;

public class AnalyseService {

    /**
     * Takes a sentence and a model and returns the sentence analysis
     * based on the given model
     *
     * @param sentence
     * @param model
     * @return
     */
    public static Analysis eval(String sentence, Model model){
        Datum<String, String>  datum = model.getColumnDataClassifier()
                .makeDatumFromLine("\t"+sentence);
        String value = (String) model.getClassifier().classOf(datum);
        if(value != null){
            Counter<String> counter = ((LinearClassifier) model.getClassifier()).probabilityOf(datum);
            return new Analysis(sentence, value, counter.getCount(value));
        }
        return new Analysis(sentence, "", 0);
    }
}
