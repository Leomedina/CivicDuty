package co.leomedina.model;

import java.lang.Character;

public class Senator {
    private String mFirstName;
    private String mLastName;
    private String mState;
    private char mParty;

    public Senator(String firstName, String lastName, String state, char party) {
        this.mFirstName = firstName;
        this.mLastName = lastName;
        this.mState = state;
        if(isValidParty(party)) {
            this.mParty = party;
        } else {
            System.out.println("Invalid Party, Please use R,D, or I. %n No Party Set");
        }
    }

    public String getmFirstName() {
        return mFirstName;
    }

    public String getmLastName() {
        return mLastName;
    }

    public char getmParty() {
        return mParty;
    }

    public String getmState() {
        return mState;
    }

    private boolean isValidParty(Character party) {
        return Character.toLowerCase(party) == 'r' ||
                Character.toLowerCase(party) == 'd' ||
                Character.toLowerCase(party) == 'i';
    }
}
