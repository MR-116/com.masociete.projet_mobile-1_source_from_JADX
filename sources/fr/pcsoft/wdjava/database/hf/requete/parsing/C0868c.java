package fr.pcsoft.wdjava.database.hf.requete.parsing;

import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.C0833j;

/* renamed from: fr.pcsoft.wdjava.database.hf.requete.parsing.c */
public class C0868c extends C0867b {
    private static final String[] yc = new String[]{C0868c.m6133z(C0868c.m6134z("\u001c)\u0014\u0017")), C0868c.m6133z(C0868c.m6134z("\u001c\u001f4R4,\u0003d[uh\u0005(Va;\u0003d{]\u0005/\u0010\u0017z'\bdPý:j"))};

    public C0868c(C0833j c0833j) {
        super(c0833j);
    }

    /* renamed from: z */
    private static String m6133z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 72;
                    break;
                case 1:
                    i2 = 102;
                    break;
                case 2:
                    i2 = 68;
                    break;
                case 3:
                    i2 = 55;
                    break;
                default:
                    i2 = 20;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6134z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 20);
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
                return yc[0] + codeSQL;
            case 3:
            case 4:
                throw new WDInvalidSQLException(yc[1]);
            default:
                return super.mo3180a(limit);
        }
    }
}
