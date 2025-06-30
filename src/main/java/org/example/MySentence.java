package org.example;

import de.htw_berlin.fb4.ossd.prose.Sentence;

public class MySentence implements Sentence {

    @Override
    public String get() {
        return "This is Gabriela's contribution to the collaborative prose.";
    }
}
