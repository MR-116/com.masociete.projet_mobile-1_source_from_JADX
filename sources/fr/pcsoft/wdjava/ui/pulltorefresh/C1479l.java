package fr.pcsoft.wdjava.ui.pulltorefresh;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.libelle.WDLibelle;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.l */
class C1479l extends WDLibelle {
    private static final String[] Lc = new String[]{C1479l.m10315z(C1479l.m10316z("$\u000e\b\u0018JP\u0017\u0015\bJP\u0015\u001b\u001bJ\u0011\u0019\u0015Q\u0002")), C1479l.m10315z(C1479l.m10316z("4\u0015\u0015\u0014\\P4\u001b\u0013K")), C1479l.m10315z(C1479l.m10316z(" \u0012\u0016\u0011\u0018\u0004\bZ\u000f]\u0016\u0015\u001f\u000eP")), C1479l.m10315z(C1479l.m10316z("<.8\"o(8.4j55%/}<&95}\"")), C1479l.m10315z(C1479l.m10316z("FUHH\bCPMJ"))};
    final GWDFIFI_PULL_TO_REFRESH this$0;

    C1479l(GWDFIFI_PULL_TO_REFRESH gwdfifi_pull_to_refresh) {
        this.this$0 = gwdfifi_pull_to_refresh;
    }

    /* renamed from: z */
    private static String m10315z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 112;
                    break;
                case 1:
                    i2 = 103;
                    break;
                case 2:
                    i2 = 122;
                    break;
                case 3:
                    i2 = 125;
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
    private static char[] m10316z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 56);
        }
        return toCharArray;
    }

    public void activerEcoute() {
    }

    public void initialiserObjet() {
        super.initialiserObjet();
        super.setFenetreInterne(this.this$0.getWDFenetreInterneThis());
        super.setQuid(2548521529188841269L);
        super.setChecksum(Lc[4]);
        super.setNom(Lc[3]);
        super.setType(3);
        super.setTypeSaisie(0);
        super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
        super.setLibelle(WDChaineMultilangue.getString(Lc[0], Lc[2]));
        super.setNote(WDChaineMultilangue.getString("", ""));
        super.setEtatInitial(0);
        super.setPositionInitiale(128, 23);
        super.setTailleInitiale(C0607n.Dt, 22);
        super.setPlans(new int[]{1, 2});
        super.setCadrageHorizontal(0);
        super.setCadrageVertical(1);
        super.setTailleMin(0, 0);
        super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
        super.setVisibleInitial(true);
        super.setAltitude(1);
        super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);
        super.setEllipse(0);
        super.setPresenceLibelle(true);
        super.setStyleLibelle(C0607n.Xv, -1, creerPolice_GEN(Lc[1], -9.0d, 0), 3, 0, 0);
        super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 1644825, 0, -1, 4, 4));
        activerEcoute();
        super.terminerInitialisation();
    }
}
