package co.leomedina.model;

import java.util.List;

public class Senate {
    private List<Senator> usSenate;

    public Senate(List<Senator> usSenate) {
        this.usSenate = usSenate;
    }

    public void addSenator(Senator senator){
        usSenate.add(senator);
    }

    public int getSenateCount() {
        return usSenate.size();
    }
}
