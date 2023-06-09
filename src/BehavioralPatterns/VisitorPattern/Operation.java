package BehavioralPatterns.VisitorPattern;

public interface Operation {
    void apply(HeadingNode headingNode);

    void apply(AnchorNode anchorNode);

}
