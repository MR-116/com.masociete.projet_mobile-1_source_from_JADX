package fr.pcsoft.wdjava.ui.pulltorefresh;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.jauge.WDJaugeInfinie;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.r */
class C1485r extends WDJaugeInfinie {
    private static final String[] Gc = new String[]{C1485r.m10327z(C1485r.m10328z("\u000fg\u0000{\u001f\u0000g\u0003|")), C1485r.m10327z(C1485r.m10328z("t\u0006\u0011\u001eE\\9]miU2")), C1485r.m10327z(C1485r.m10328z("w4E$[\\\u0016X?NL9P$_\\"))};
    final GWDFIFI_PULL_TO_REFRESH_EXPRESS this$0;

    C1485r(GWDFIFI_PULL_TO_REFRESH_EXPRESS gwdfifi_pull_to_refresh_express) {
        this.this$0 = gwdfifi_pull_to_refresh_express;
    }

    /* renamed from: z */
    private static String m10327z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 57;
                    break;
                case 1:
                    i2 = 85;
                    break;
                case 2:
                    i2 = 49;
                    break;
                case 3:
                    i2 = 77;
                    break;
                default:
                    i2 = 45;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10328z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 45);
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
        super.setChecksum(Gc[0]);
        super.setNom(Gc[2]);
        super.setType(113);
        super.setLibelle(WDChaineMultilangue.getString("", ""));
        super.setNote(WDChaineMultilangue.getString("", ""));
        super.setEtatInitial(0);
        super.setPositionInitiale(10, 41);
        super.setTailleInitiale(48, 48);
        super.setPlan(3);
        super.setTailleMin(0, 0);
        super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
        super.setVisibleInitial(true);
        super.setAltitude(4);
        super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);
        super.setPresenceLibelle(false);
        super.setStyleLibelle(0, creerPolice_GEN(Gc[1], -11.0d, 0), -1, 0, 0);
        super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, (int) C0607n.Bj, (int) C0607n.dq, -1, 4, 4));
        activerEcoute();
        super.terminerInitialisation();
    }
}
