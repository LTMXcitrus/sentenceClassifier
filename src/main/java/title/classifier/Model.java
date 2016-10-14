package main.java.title.classifier;

import edu.stanford.nlp.classify.Classifier;
import edu.stanford.nlp.classify.ColumnDataClassifier;

public class Model {
    private Classifier classifier;
    private ColumnDataClassifier columnDataClassifier;


    public Model(final Classifier classifier, final ColumnDataClassifier columnDataClassifier) {
        this.classifier = classifier;
        this.columnDataClassifier = columnDataClassifier;
    }

    public Classifier getClassifier() {
        return classifier;
    }

    public ColumnDataClassifier getColumnDataClassifier() {
        return columnDataClassifier;
    }
}
