package main.java.title.classifier;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

import edu.stanford.nlp.classify.Classifier;
import edu.stanford.nlp.classify.ColumnDataClassifier;
import edu.stanford.nlp.classify.Dataset;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ModelProvider {


    /**
     * Takes a list of training examples and returns a model
     *
     * @param data
     * @return
     */
    public static Model buildModel(List<CustomDatum> data) throws IOException {
        Properties props = classifierProperties();
        ColumnDataClassifier cdc = new ColumnDataClassifier(props);
        Dataset dataset = new Dataset<String, String>();
        for (CustomDatum datum : data) {
            dataset.add(cdc.makeDatumFromLine(datum.getValue() + "\t" + datum.getSentence()));
        }
        Classifier<String, String> classifier = cdc.makeClassifier(dataset);
        return new Model(classifier, cdc);
    }

    /**
     * Loads a previous model from DB or a serialized model
     *
     * @return
     */
    public static Model loadModel(){
        throw new NotImplementedException();
    }

    /**
     * generates ColumnDataClassifier properties
     * @return
     */
    private static Properties classifierProperties() throws IOException {
        Properties properties = new Properties();
        properties.load(ModelProvider.class.getClassLoader().getResourceAsStream("intentClassifier.prop"));
        return properties;
    }
}
