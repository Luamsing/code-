package net.jeedup.nlp;

import java.util.Set;

import static net.jeedup.common.collection.CollectionUtil.set;

/**
 * TODO
 * Created by zack on 9/14/18.
 */
public class Phrase {

    public String text;
    public Set<Phrase> relatedPhrases = set();

    public Phrase() { }

    public Phrase(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Phrase{" +
                "text='" + text + '\'' +
                ", relatedPhrases=" + relatedPhrases +
                '}';
    }
}
