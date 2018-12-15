package fr.pcsoft.wdjava.ui.pulltorefresh;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.libelle.WDLibelle;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.k */
class C1478k extends WDLibelle {
    private static final String[] Lc = new String[]{C1478k.m10313z(C1478k.m10314z("v0,\b\u001cb&<\u0012\rh<=\u001f")), C1478k.m10313z(C1478k.m10314z("~\u000b\u0001>/\u001a*\u000f98")), C1478k.m10313z(C1478k.m10314z("\fK\\`}\u000f@\\f")), C1478k.m10313z(C1478k.m10314z("h\u0018\b%*Ô\u001a\u0006>8I\u001c\u00032%NY\u000b9kY\u0016\u001b%8\u0014W@")), C1478k.m10313z(C1478k.m10314z("h\u001c\b%.I\u0011N>%\u001a\t\u001c8,H\u001c\u001d$e\u0014W"))};
    final GWDFIFI_PULL_TO_REFRESH this$0;

    C1478k(GWDFIFI_PULL_TO_REFRESH gwdfifi_pull_to_refresh) {
        this.this$0 = gwdfifi_pull_to_refresh;
    }

    /* renamed from: z */
    private static String m10313z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 58;
                    break;
                case 1:
                    i2 = 121;
                    break;
                case 2:
                    i2 = 110;
                    break;
                case 3:
                    i2 = 87;
                    break;
                default:
                    i2 = 75;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10314z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 75);
        }
        return toCharArray;
    }

    public void activerEcoute() {
    }

    public void initialiserObjet() {
        super.initialiserObjet();
        super.setFenetreInterne(this.this$0.getWDFenetreInterneThis());
        super.setQuid(2548521529189103413L);
        super.setChecksum(Lc[2]);
        super.setNom(Lc[0]);
        super.setType(3);
        super.setTypeSaisie(0);
        super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
        super.setLibelle(WDChaineMultilangue.getString(Lc[3], Lc[4]));
        super.setNote(WDChaineMultilangue.getString("", ""));
        super.setEtatInitial(0);
        super.setPositionInitiale(94, 16);
        super.setTailleInitiale(252, 36);
        super.setPlan(3);
        super.setCadrageHorizontal(0);
        super.setCadrageVertical(1);
        super.setTailleMin(0, 0);
        super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
        super.setVisibleInitial(true);
        super.setAltitude(3);
        super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);
        super.setEllipse(0);
        super.setPresenceLibelle(true);
        super.setStyleLibelle(C0607n.Xv, -1, creerPolice_GEN(Lc[1], -9.0d, 0), 3, 0, 0);
        super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 1644825, 0, -1, 4, 4));
        activerEcoute();
        super.terminerInitialisation();
    }
}
