package fr.pcsoft.wdjava.database.hf.requete.parsing;

public enum EWDOptionRequete {
    TYPE_SOUS_REQUETE,
    OPERATEUR_SOUS_REQUETE,
    TRI,
    INDEX_RUB,
    SELECT,
    NOT_BETWEEN,
    NOT_LIKE,
    NOT_IN,
    NOT_NULL,
    LIKE_COMMENCE_PAR,
    LIKE_FINI_PAR,
    LIKE_CONTIENT,
    LIKE_CASE_SENSITIVE,
    LIKE_CARACT_ECHAP,
    NB_EXPRESSIONS_IN,
    MATCH_AGAINST_ALL,
    TYPE_CAST;

    /* renamed from: z */
    private static String m6096z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 103;
                    break;
                case 1:
                    i2 = 68;
                    break;
                case 2:
                    i2 = 117;
                    break;
                case 3:
                    i2 = 56;
                    break;
                default:
                    i2 = 117;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6097z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 117);
        }
        return toCharArray;
    }
}
