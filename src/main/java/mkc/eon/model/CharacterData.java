package main.java.mkc.eon.model;

import java.util.List;

import javax.naming.directory.BasicAttributes;

public class CharacterData {

    private BasicCharacterInformation mInformation;
    private BasicAttributes mBasicAttributes;
    private DerivedAttributes mDerivedAttributes;
    private List<Ability> mCombatAbilities;
    private List<Ability> mMovementAbilities;
    private List<Ability> mMysticsAbilities;
    private List<Ability> mSocialAbilities;
    private List<Ability> mKnowledgeAbilities;
    private List<Ability> mWildernessAbilities;
    private List<Ability> mOtherAbilities;
    private List<Ability> mLanguageAbilities;


    public BasicCharacterInformation getInformation() {
        return mInformation;
    }
    public void setInformation(BasicCharacterInformation information) {
        mInformation = information;
    }
}
