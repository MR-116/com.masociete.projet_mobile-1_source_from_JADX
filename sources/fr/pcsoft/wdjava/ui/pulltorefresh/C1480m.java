package fr.pcsoft.wdjava.ui.pulltorefresh;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.libelle.WDLibelle;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.m */
class C1480m extends WDLibelle {
    private static final String[] Lc = new String[]{C1480m.m10317z(C1480m.m10318z("{0(NXÇ2&UJZ4#YW]q+R\u0019J>;NJ\u0007`")), C1480m.m10317z(C1480m.m10318z("e\u0018\fcnq\u000e\u001cy{\u0014\u001dt")), C1480m.m10317z(C1480m.m10318z("\u001fc|\u000b\u000f\u001ch|\r")), C1480m.m10317z(C1480m.m10318z("m#!U]\t\u0002/RJ")), C1480m.m10317z(C1480m.m10318z("{4(N\\Z9nUW\t!<S^[4=O\u0017\u0007"))};
    final GWDFIFI_PULL_TO_REFRESH_EXPRESS this$0;

    C1480m(GWDFIFI_PULL_TO_REFRESH_EXPRESS gwdfifi_pull_to_refresh_express) {
        this.this$0 = gwdfifi_pull_to_refresh_express;
    }

    /* renamed from: z */
    private static String m10317z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 41;
                    break;
                case 1:
                    i2 = 81;
                    break;
                case 2:
                    i2 = 78;
                    break;
                case 3:
                    i2 = 60;
                    break;
                default:
                    i2 = 57;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10318z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 57);
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
        super.setNom(Lc[1]);
        super.setType(3);
        super.setTypeSaisie(0);
        super.setMasqueSaisie(new WDChaineU(WDChaineMultilangue.getString("0", "0")));
        super.setLibelle(WDChaineMultilangue.getString(Lc[0], Lc[4]));
        super.setNote(WDChaineMultilangue.getString("", ""));
        super.setEtatInitial(0);
        super.setPositionInitiale(16, 94);
        super.setTailleInitiale(36, 252);
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
        super.setStyleLibelle(C0607n.Xv, -1, creerPolice_GEN(Lc[3], -9.0d, 0), 3, 0, 0);
        super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 1644825, 0, -1, 4, 4));
        activerEcoute();
        super.terminerInitialisation();
    }
}
