package fr.pcsoft.wdjava.ui.pulltorefresh;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.jauge.WDJaugeInfinie;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.q */
class C1484q extends WDJaugeInfinie {
    private static final String[] Gc = new String[]{C1484q.m10325z(C1484q.m10326z("l6KfPD\t\u0007\u0015|M\u0002")), C1484q.m10325z(C1484q.m10326z("o\u0004\u001f\\ND&\u0002G[T\t\n\\JD")), C1484q.m10325z(C1484q.m10326z("\u0017WZ\u0003\n\u0018WY\u0004"))};
    final GWDFIFI_PULL_TO_REFRESH this$0;

    C1484q(GWDFIFI_PULL_TO_REFRESH gwdfifi_pull_to_refresh) {
        this.this$0 = gwdfifi_pull_to_refresh;
    }

    /* renamed from: z */
    private static String m10325z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 33;
                    break;
                case 1:
                    i2 = 101;
                    break;
                case 2:
                    i2 = 107;
                    break;
                case 3:
                    i2 = 53;
                    break;
                default:
                    i2 = 56;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10326z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 56);
        }
        return toCharArray;
    }

    public void activerEcoute() {
    }

    protected int getTypeJauge() {
        return 1;
    }

    public void initialiserObjet() {
        super.initialiserObjet();
        super.setFenetreInterne(this.this$0.getWDFenetreInterneThis());
        super.setQuid(2564474261787225628L);
        super.setChecksum(Gc[2]);
        super.setNom(Gc[1]);
        super.setType(113);
        super.setLibelle(WDChaineMultilangue.getString("", ""));
        super.setNote(WDChaineMultilangue.getString("", ""));
        super.setEtatInitial(0);
        super.setPositionInitiale(41, 10);
        super.setTailleInitiale(48, 48);
        super.setPlan(3);
        super.setTailleMin(0, 0);
        super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
        super.setVisibleInitial(true);
        super.setAltitude(4);
        super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);
        super.setPresenceLibelle(false);
        super.setStyleLibelle(0, creerPolice_GEN(Gc[0], -11.0d, 0), -1, 0, 0);
        super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, (int) C0607n.Bj, (int) C0607n.dq, -1, 4, 4));
        activerEcoute();
        super.terminerInitialisation();
    }
}
