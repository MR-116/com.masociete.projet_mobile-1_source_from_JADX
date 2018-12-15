package fr.pcsoft.wdjava.ui.pulltorefresh;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.libelle.WDLibelle;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.n */
class C1481n extends WDLibelle {
    private static final String[] Lc = new String[]{C1481n.m10319z(C1481n.m10320z("\u0013\u0007EGU\u0016\u0002@E")), C1481n.m10319z(C1481n.m10320z("q\\\u0005\u0017\u0017\u0005E\u0018\u0007\u0017\u0005G\u0016\u0014\u0017DÛ\u0014\u001a\fW")), C1481n.m10319z(C1481n.m10320z("aG\u0018\u001b\u0001\u0005f\u0016\u001c\u0016")), C1481n.m10319z(C1481n.m10320z("u@\u001b\u001eEQZW\u0000\u0000CG\u0012\u0001\r")), C1481n.m10319z(C1481n.m10320z("i|5-2}j#;7`g(  it4: w"))};
    final GWDFIFI_PULL_TO_REFRESH_EXPRESS this$0;

    C1481n(GWDFIFI_PULL_TO_REFRESH_EXPRESS gwdfifi_pull_to_refresh_express) {
        this.this$0 = gwdfifi_pull_to_refresh_express;
    }

    /* renamed from: z */
    private static String m10319z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 37;
                    break;
                case 1:
                    i2 = 53;
                    break;
                case 2:
                    i2 = 119;
                    break;
                case 3:
                    i2 = 114;
                    break;
                default:
                    i2 = 101;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10320z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 101);
        }
        return toCharArray;
    }

    public void activerEcoute() {
    }

    public void initialiserObjet() {
        super.initialiserObjet();
        super.setFenetreInterne(this.this$0.getWDFenetreInterneThis());
        super.setQuid(2548521529188841269L);
        super.setChecksum(Lc[0]);
        super.setNom(Lc[4]);
        super.setType(3);
        super.setTypeSaisie(0);
        super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
        super.setLibelle(WDChaineMultilangue.getString(Lc[1], Lc[3]));
        super.setNote(WDChaineMultilangue.getString("", ""));
        super.setEtatInitial(0);
        super.setPositionInitiale(23, 128);
        super.setTailleInitiale(22, C0607n.Dt);
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
        super.setStyleLibelle(C0607n.Xv, -1, creerPolice_GEN(Lc[2], -9.0d, 0), 3, 0, 0);
        super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 1644825, 0, -1, 4, 4));
        activerEcoute();
        super.terminerInitialisation();
    }
}
