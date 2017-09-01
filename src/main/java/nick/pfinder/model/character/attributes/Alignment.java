package nick.pfinder.model.character.attributes;

/**
 * Created by nickyrayray on 8/24/17.
 */
public enum Alignment {

    LawfulGood(AlignmentAxes.Lawful, AlignmentAxes.Good),
    NeutralGood(AlignmentAxes.Neutral, AlignmentAxes.Good),
    ChaoticGood(AlignmentAxes.Chaotic, AlignmentAxes.Good),
    LawfulNeutral(AlignmentAxes.Lawful, AlignmentAxes.Neutral),
    TrueNuetral(AlignmentAxes.Neutral, AlignmentAxes.Neutral),
    ChaoticNeutral(AlignmentAxes.Chaotic, AlignmentAxes.Neutral),
    LawfulEvil(AlignmentAxes.Lawful, AlignmentAxes.Evil),
    NeutralEvil(AlignmentAxes.Neutral, AlignmentAxes.Evil),
    ChaoticEvil(AlignmentAxes.Chaotic, AlignmentAxes.Evil);

    AlignmentAxes lawfulChaotic;
    AlignmentAxes goodEvil;

    Alignment(AlignmentAxes lawfulChaotic, AlignmentAxes goodEvil){
        this.lawfulChaotic = lawfulChaotic;
        this.goodEvil = goodEvil;
    }

    public AlignmentAxes getLawfulChaoticAxis(){
        return this.lawfulChaotic;
    }

    public AlignmentAxes getGoodEvilAxis(){
        return this.goodEvil;
    }

}
