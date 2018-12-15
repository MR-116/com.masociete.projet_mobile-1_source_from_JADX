package fr.pcsoft.wdjava.ui.pulltorefresh;

import fr.pcsoft.wdjava.core.types.WDChaineMultilangue;
import fr.pcsoft.wdjava.ui.cadre.WDCadreFactory;
import fr.pcsoft.wdjava.ui.champs.image.WDChampImage;

/* renamed from: fr.pcsoft.wdjava.ui.pulltorefresh.o */
class C1482o extends WDChampImage {
    private static final String[] Bd = new String[]{C1482o.m10321z(C1482o.m10322z("B`\u0003X\u001aSr\u0002K\bHe\u0001")), C1482o.m10321z(C1482o.m10322z("|@\u001bw8gA0h?nK6b>cr%i$f\u0012")), C1482o.m10321z(C1482o.m10322z("O_+n)+~%i>")), C1482o.m10321z(C1482o.m10322z("=\u001fv2z:\u0018}4"))};
    final GWDFIFI_PULL_TO_REFRESH this$0;

    C1482o(GWDFIFI_PULL_TO_REFRESH gwdfifi_pull_to_refresh) {
        this.this$0 = gwdfifi_pull_to_refresh;
    }

    /* renamed from: z */
    private static String m10321z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 11;
                    break;
                case 1:
                    i2 = 45;
                    break;
                case 2:
                    i2 = 68;
                    break;
                case 3:
                    i2 = 7;
                    break;
                default:
                    i2 = 77;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10322z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 77);
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
        super.setNom(Bd[0]);
        super.setType(30001);
        super.setLibelle(WDChaineMultilangue.getString("", ""));
        super.setMenuContextuelSysteme();
        super.setNote(WDChaineMultilangue.getString("", ""));
        super.setNavigable(false);
        super.setEtatInitial(0);
        super.setPositionInitiale(90, 16);
        super.setTailleInitiale(36, 36);
        super.setValeurInitiale(Bd[1]);
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
        super.setStyleLibelle(16777215, creerPolice_GEN(Bd[2], -9.0d, 0), -1, 0, 0);
        super.setCadreExterieur(WDCadreFactory.creerCadre_GEN(1, 1644825, 0, -1, 4, 4));
        activerEcoute();
        super.terminerInitialisation();
    }
}
