package gr.aueb.cf.ch15;

public class GenericSpeakingSchool {
    private final ISpeakable iSpeakable;

    /**
     * Dependency Injection (DI) - IoC - Inversion of Control
     * @param iSpeakable
     */
    public GenericSpeakingSchool(ISpeakable iSpeakable) {
        this.iSpeakable = iSpeakable;
    }

    public void learnToSpeak() {
        iSpeakable.speak();
    }
}
