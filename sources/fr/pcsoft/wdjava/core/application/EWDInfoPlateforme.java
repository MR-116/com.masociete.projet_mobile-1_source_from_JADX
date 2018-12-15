package fr.pcsoft.wdjava.core.application;

public enum EWDInfoPlateforme {
    DPI_ECRAN,
    HAUTEUR_BARRE_SYSTEME,
    HAUTEUR_BARRE_TITRE,
    HAUTEUR_ACTION_BAR,
    HAUTEUR_BARRE_BAS,
    HAUTEUR_ECRAN,
    LARGEUR_ECRAN;

    /* renamed from: z */
    private static String m2540z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 25;
                    break;
                case 1:
                    i2 = 102;
                    break;
                case 2:
                    i2 = 6;
                    break;
                case 3:
                    i2 = 116;
                    break;
                default:
                    i2 = 115;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2541z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 115);
        }
        return toCharArray;
    }
}
