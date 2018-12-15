package fr.pcsoft.wdjava.database.hf.requete.parsing;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.C0833j;

/* renamed from: fr.pcsoft.wdjava.database.hf.requete.parsing.d */
public class C0869d extends C0867b {
    private static final String[] yc = new String[]{C0869d.m6136z(C0869d.m6137z("\rjXv\u0004=v\bEypDrQ*v\b_m\u0014Z|3J6}\btÍ+ú\u0006")), C0869d.m6136z(C0869d.m6137z("\r\\x3"))};

    public C0869d(C0833j c0833j) {
        super(c0833j);
    }

    /* renamed from: z */
    private static String m6136z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 89;
                    break;
                case 1:
                    i2 = 19;
                    break;
                case 2:
                    i2 = 40;
                    break;
                case 3:
                    i2 = 19;
                    break;
                default:
                    i2 = 36;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6137z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 36);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public String mo3180a(Limit limit) throws WDInvalidSQLException {
        switch (limit.getType()) {
            case 1:
                String codeSQL;
                m6127a((Clause) limit);
                Parametre paramNbEnregs = limit.getParamNbEnregs();
                if (paramNbEnregs != null) {
                    codeSQL = paramNbEnregs.getCodeSQL(this);
                    try {
                        if (C0808l.m4053k(codeSQL)) {
                            return null;
                        }
                    } catch (WDInvalidSQLException e) {
                        throw e;
                    }
                }
                codeSQL = String.valueOf(limit.getNbEnregs());
                return yc[1] + codeSQL;
            case 3:
            case 4:
                throw new WDInvalidSQLException(yc[0]);
            default:
                return super.mo3180a(limit);
        }
    }
}
