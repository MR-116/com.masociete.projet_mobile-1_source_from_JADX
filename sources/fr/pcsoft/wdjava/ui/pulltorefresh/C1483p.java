package fr.pcsoft.wdjava.ui.pulltorefresh;

import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.image.WDChampImage;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.p */
class C1483p extends WDChampImage {
    private static final String[] Bd = new String[]{C1483p.m10323z(C1483p.m10324z("\u00168k)\b\r9@6\u000f\u00043F<\u000e\t\nU7\u0014\fj")), C1483p.m10323z(C1483p.m10324z("%'[0\u0019A\u0006U7\u000e")), C1483p.m10323z(C1483p.m10324z("(\u0018s\u0006*9\nr\u00158\"\u001dq")), C1483p.m10323z(C1483p.m10324z("Wg\u0006lJP`\rj"))};
    final GWDFIFI_PULL_TO_REFRESH_EXPRESS this$0;

    C1483p(GWDFIFI_PULL_TO_REFRESH_EXPRESS gwdfifi_pull_to_refresh_express) {
        this.this$0 = gwdfifi_pull_to_refresh_express;
    }

    /* renamed from: z */
    private static String m10323z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 97;
                    break;
                case 1:
                    i2 = 85;
                    break;
                case 2:
                    i2 = 52;
                    break;
                case 3:
                    i2 = 89;
                    break;
                default:
                    i2 = 125;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10324z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 125);
        }
        return toCharArray;
    }

    public void activerEcoute() {
    }

    public void initialiserObjet() {
        super.initialiserObjet();
        super.setFenetreInterne(this.this$0.getWDFenetreInterneThis());
        super.setQuid(2548521529188906805L);
        super.setChecksum(Bd[3]);
        super.setNom(Bd[2]);
        super.setType(30001);
        super.setLibelle(WDChaineMultilangue.getString("", ""));
        super.setMenuContextuelSysteme();
        super.setNote(WDChaineMultilangue.getString("", ""));
        super.setNavigable(false);
        super.setEtatInitial(0);
        super.setPositionInitiale(16, 90);
        super.setTailleInitiale(36, 36);
        super.setValeurInitiale(Bd[0]);
        super.setPlans(new int[]{1, 2});
        super.setTailleMin(0, 0);
        super.setTailleMax(Integer.MAX_VALUE, Integer.MAX_VALUE);
        super.setVisibleInitial(true);
        super.setAltitude(2);
        super.setAncrageInitial(5, 1000, 1000, 500, 500, 0);
        super.setTransparence(1);
        super.setParamImage(6, 0, true, 100);
        super.setSymetrie(0);
        super.setZoneClicage(true);
        super.setPCodeMultitouch(false);
        super.setChargementEnTacheDeFond(false);
        super.setOrientationExif(false);
        super.setParamAnimation(1, 1, false, 50, false, false);
        super.setAnimationInitiale(true);
        super.setPresenceLibelle(false);
        super.setStyleLibelle(16777215, creerPolice_GEN(Bd[1], -9.0d, 0), -1, 0, 0);
        super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 1644825, 0, -1, 4, 4));
        activerEcoute();
        super.terminerInitialisation();
    }
}
