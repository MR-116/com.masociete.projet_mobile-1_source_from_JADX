package fr.pcsoft.wdjava.ui.champs.fenetre;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.i */
public enum C1155i {
    MODALE,
    NON_MODALE,
    FILLE,
    APPLET,
    UTILISE,
    WIDGET;
    
    /* renamed from: a */
    private static final C1155i[] f3508a = null;

    static {
        MODALE = new C1155i(C1155i.m8371z(C1155i.m8372z("Qp\u001bYgY")), 0);
        NON_MODALE = new C1155i(C1155i.m8371z(C1155i.m8372z("Rp\u0011GfS{\u001eTn")), 1);
        FILLE = new C1155i(C1155i.m8371z(C1155i.m8372z("Zv\u0013Tn")), 2);
        APPLET = new C1155i(C1155i.m8371z(C1155i.m8372z("]o\u000fTnH")), 3);
        UTILISE = new C1155i(C1155i.m8371z(C1155i.m8372z("Ik\u0016TbOz")), 4);
        WIDGET = new C1155i(C1155i.m8371z(C1155i.m8372z("Kv\u001b_nH")), 5);
        f3508a = new C1155i[]{MODALE, NON_MODALE, FILLE, APPLET, UTILISE, WIDGET};
    }

    /* renamed from: z */
    private static String m8371z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 28;
                    break;
                case 1:
                    i2 = 63;
                    break;
                case 2:
                    i2 = 95;
                    break;
                case 3:
                    i2 = 24;
                    break;
                default:
                    i2 = 43;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8372z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 43);
        }
        return toCharArray;
    }
}
