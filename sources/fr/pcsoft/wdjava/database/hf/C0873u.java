package fr.pcsoft.wdjava.database.hf;

/* renamed from: fr.pcsoft.wdjava.database.hf.u */
public enum C0873u {
    FICHIER,
    RUBRIQUE,
    REQUETE,
    CONNEXION;
    
    /* renamed from: a */
    private static final C0873u[] f2359a = null;

    static {
        FICHIER = new C0873u(C0873u.m6162z(C0873u.m6163z("_;5h-\\ ")), 0);
        RUBRIQUE = new C0873u(C0873u.m6162z(C0873u.m6163z("K'4r-H'3")), 1);
        REQUETE = new C0873u(C0873u.m6162z(C0873u.m6163z("K7'u!M7")), 2);
        CONNEXION = new C0873u(C0873u.m6162z(C0873u.m6163z("Z=8n!A;9n")), 3);
        f2359a = new C0873u[]{FICHIER, RUBRIQUE, REQUETE, CONNEXION};
    }

    /* renamed from: z */
    private static String m6162z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 25;
                    break;
                case 1:
                    i2 = 114;
                    break;
                case 2:
                    i2 = 118;
                    break;
                case 3:
                    i2 = 32;
                    break;
                default:
                    i2 = 100;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6163z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 100);
        }
        return toCharArray;
    }
}
