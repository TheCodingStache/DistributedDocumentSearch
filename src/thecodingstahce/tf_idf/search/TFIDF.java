package thecodingstahce.tf_idf.search;

import thecodingstahce.tf_idf.model.DocumentData;

import java.util.List;

public class TFIDF {
    public static double calcTermFrequency(List<String> words, String term) {
        long counter = 0;
        for (String word : words) {
            if (term.equalsIgnoreCase(word)) {
                counter++;
            }
        }
        return (double) counter / words.size();
    }

    public static DocumentData createDocumentData(List<String> words, List<String> terms) {
        DocumentData documentData = new DocumentData();
        for (String term : terms) {
            double termFreq = calcTermFrequency(words, term);
            documentData.putTermFrequency(term, termFreq);
        }
        return documentData;
    }
}
