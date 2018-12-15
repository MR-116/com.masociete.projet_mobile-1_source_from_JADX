package fr.pcsoft.wdjava.database.hf.requete.parsing;

import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.C0833j;
import fr.pcsoft.wdjava.database.hf.C0858k;
import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.Element;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.OrderBy;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.Requete;
import java.util.Map;

/* renamed from: fr.pcsoft.wdjava.database.hf.requete.parsing.b */
public class C0867b implements C0538a {
    private static final String tc = C0867b.m6107z(C0867b.m6108z("r&c;+"));
    private static final String[] yc;
    private Requete sc = null;
    private Clause uc = null;
    private Map<String, WDObjet> vc = null;
    private StringBuilder wc = null;
    private C0833j xc = null;

    static {
        r0 = new String[94];
        r0[0] = C0867b.m6107z(C0867b.m6108z("\u000bH"));
        r0[1] = C0867b.m6107z(C0867b.m6108z("f\u001dH\u000b\u001d\u0007G\u001eB\u0006_^\u001d\u0000\rX\nSF\u001bX\u0011\u0010NN^\u0007\u0004J^\u0010K\t^\r\u0016\u0007/y1&wHi']"));
        r0[2] = C0867b.m6107z(C0867b.m6108z("`:d+#\u0007*r^"));
        r0[3] = C0867b.m6107z(C0867b.m6108z("k\r\u000b\u001d\u001cC\r\u000b-\"kHL\u001dÎ\u001aÂ^\u0003H\u001dY^\u001f\u0000G\u001eB\u0006_^\u0016T\u001c\u000b\b\u001aC\r\u0005"));
        r0[4] = C0867b.m6107z(C0867b.m6108z("f\u001dH\u000b\u001d\u0007G\u001eB\u0006_^\u001d\u0000\rX\nSF\u001bX\u0011\u0010NN^\u0007\u0004J^\u0010K\t^\r\u0016\u0007.y1>\t"));
        r0[5] = C0867b.m6107z(C0867b.m6108z("a:d3S"));
        r0[6] = C0867b.m6107z(C0867b.m6108z("s\u0011[\u001bSC\r\u000b\f\u0016V\u001dÁ\n\u0016\u0007\u0006D\u0010ST\u001d[\u000e\u001cU\u001cÂP"));
        r0[7] = C0867b.m6107z(C0867b.m6108z("\u0007)x^"));
        r0[8] = C0867b.m6107z(C0867b.m6108z("d\u0004J\u000b\u0000BHo;?b<n^\u001eF\u0006Z\u000b\u0012I\u001cNP"));
        r0[9] = C0867b.m6107z(C0867b.m6108z("f\u001dH\u000b\u001d\u0007\u0018J\f\u0012J_\f\u0016\u0007\u0006\f\u001fSÎ\u001cÂ^\u0012T\u001bD\u001d\u001aÎHJ\u000bS@E\u0001F\u001cN\u000b\u0001\u0007;z2]"));
        r0[10] = C0867b.m6107z(C0867b.m6108z("\u000fO"));
        r0[11] = C0867b.m6107z(C0867b.m6108z("\u0000A"));
        r0[12] = C0867b.m6107z(C0867b.m6108z("k\r\u000b\u000e\u0012U\tF\u0007U\r\u000b\u0010TB\u0010B\r\u0007BH[\u001f\u0000\t"));
        r0[13] = C0867b.m6107z(C0867b.m6108z("k\t\u000b\f\u0006E\u001aB\u000f\u0006BHH\u0011\u0001U\rX\u000e\u001cI\fJ\u0010\u0007\u0007\u000b\u0012TH\u0018Â\f\u0012I\fN^\u001d\u0000\t\u000b\u000e\u0012THÂ\n\u0007\u001cY\u0011\u0006QNP"));
        r0[14] = C0867b.m6107z(C0867b.m6108z("c-g;'bHm,<jH"));
        r0[15] = C0867b.m6107z(C0867b.m6108z("d\u0004J\u000b\u0000BHo;?b<n^\u001aI\u001eJ\u0012\u001aC\r\u0005"));
        r0[16] = C0867b.m6107z(C0867b.m6108z("s\u0011[\u001bSC\r\u000b\u0012\u0012\u0007\u000bG\u001f\u0006T\r\u000b2:j!^\u001dH\u0006\u000b\u0019U\u0005"));
        r0[17] = C0867b.m6107z(C0867b.m6108z("k!f7'\u0007"));
        r0[18] = C0867b.m6107z(C0867b.m6108z("i\u0007F\u001c\u0001BHO\u001bSW\tY\u001f\u001eÏ\u001cY\u001b\u0000\u0007\u0001E\b\u0012K\u0001O\u001b]"));
        r0[19] = C0867b.m6107z(C0867b.m6108z("c!x*:i+^"));
        r0[20] = C0867b.m6107z(C0867b.m6108z("f\u001dH\u000b\u001d\u0007G\u001eB\u0006_^\u001d\u0000\rX\nSF\u001bX\u0011\u0010NN^\u0007\u0004J^\u0010K\t^\r\u0016\u0007;n26d<\u0005"));
        r0[21] = C0867b.m6107z(C0867b.m6108z("t-g;0sH"));
        r0[22] = C0867b.m6107z(C0867b.m6108z("s'{"));
        r0[23] = C0867b.m6107z(C0867b.m6108z("d\u0004J\u000b\u0000BH~.7f<n^\u001aI\u001eJ\u0012\u001aC\r\u0005"));
        r0[24] = C0867b.m6107z(C0867b.m6108z("r8o?'bH"));
        r0[25] = C0867b.m6107z(C0867b.m6108z("o)}7=`H"));
        r0[26] = C0867b.m6107z(C0867b.m6108z("k\t\u000b\u001d\u001fF\u001dX\u001bSo)}7=`HO\u0011\u001aSHH\u0011\u001dS\rE\u0017\u0001\u0007\u001dE\u0017\u0002R\rF\u001b\u001dSHG\u001fSC\rX\u001d\u0001N\u0018_\u0017\u001cIHO\u001b\u0000\u0007\u000bD\u0010\u0017N\u001cB\u0011\u001dTF"));
        r0[27] = C0867b.m6107z(C0867b.m6108z("d\u0004J\u000b\u0000BHb0 b:^\u001aI\u001eJ\u0012\u001aC\r\u0005"));
        r0[28] = C0867b.m6107z(C0867b.m6108z("n&x;!sHb0'hH"));
        r0[29] = C0867b.m6107z(C0867b.m6108z("\u0007U\u000b"));
        r0[30] = C0867b.m6107z(C0867b.m6108z("t-^"));
        r0[31] = C0867b.m6107z(C0867b.m6108z("d\u0004J\u000b\u0000BHx;'\u0007\u0001E\b\u0012K\u0001O\u001b]"));
        r0[32] = C0867b.m6107z(C0867b.m6108z("k\r\u000b\u0018\u001cU\u0005J\nSC\u001d\u000b\u0010\u001cJHO\u001bSK\t\u000b\f\u0006E\u001aB\u000f\u0006BHN\r\u0007\u0007\u0001E\b\u0012K\u0001O\u001b]"));
        r0[33] = C0867b.m6107z(C0867b.m6108z("f$g^"));
        r0[34] = C0867b.m6107z(C0867b.m6108z("s\u0011[\u001bSt-g;0sHB\u0010\u0005F\u0004B\u001a\u0016"));
        r0[35] = C0867b.m6107z(C0867b.m6108z("t\u0011E\n\u0012_\r\u000b\u001a\u0016\u0007\u0002D\u0017\u001dS\u001dY\u001bSh\u001aJ\u001d\u001fBHE\u0011\u001d\u0007\u001b^\u000e\u0003H\u001a_\u0016\t"));
        r0[36] = C0867b.m6107z(C0867b.m6108z("d)x;"));
        r0[37] = C0867b.m6107z(C0867b.m6108z("\rY\u0013N\\"));
        r0[38] = C0867b.m6107z(C0867b.m6108z("h\u0018Â\f\u0012I\fN^\u0014F\u001dH\u0016\u0016\u0007\f^^1b<|;6iHF\u001f\u001dV\u001dJ\u0010\u0007BF"));
        r0[39] = C0867b.m6107z(C0867b.m6108z("\u0007)g2"));
        r0[40] = C0867b.m6107z(C0867b.m6108z("\u0007!x^"));
        r0[41] = C0867b.m6107z(C0867b.m6108z("\u0007@"));
        r0[42] = C0867b.m6107z(C0867b.m6108z("\u0007?c;=\u0007"));
        r0[43] = C0867b.m6107z(C0867b.m6108z("h\u0018Â\f\u0012I\fN^\u0014F\u001dH\u0016\u0016\u0007\f^^:iHF\u001f\u001dV\u001dJ\u0010\u0007BF"));
        r0[44] = C0867b.m6107z(C0867b.m6108z("\u000eHj92n&x*"));
        r0[45] = C0867b.m6107z(C0867b.m6108z("\u0007T\u000b"));
        r0[46] = C0867b.m6107z(C0867b.m6108z("\u000fA\u0004OK\u0017A"));
        r0[47] = C0867b.m6107z(C0867b.m6108z("\u000fC\u0002"));
        r0[48] = C0867b.m6107z(C0867b.m6108z("i\u0007F\u001c\u0001BHOY\u001cWY\u001f\u001dC\rX^\u001aI\u001eJ\u0012\u001aC\r\u000b\u000e\u001cR\u001a\u000b\u0012\u0016\u0007$b56\t"));
        r0[49] = C0867b.m6107z(C0867b.m6108z("\u000fA\u0002"));
        r0[50] = C0867b.m6107z(C0867b.m6108z("\u0007V\u000b"));
        r0[51] = C0867b.m6107z(C0867b.m6108z("\u000fB\u0002"));
        r0[52] = C0867b.m6107z(C0867b.m6108z("\u000fA"));
        r0[53] = C0867b.m6107z(C0867b.m6108z("\u0007T\u0015^"));
        r0[54] = C0867b.m6107z(C0867b.m6108z("j)=;\u000f"));
        r0[55] = C0867b.m6107z(C0867b.m6108z("\u0007-e:"));
        r0[56] = C0867b.m6107z(C0867b.m6108z("d)x*[\u0002Y\u000b? \u0007M\u0019W"));
        r0[57] = C0867b.m6107z(C0867b.m6108z("\u0004.d00s!d0,p$t:2i;t,6v=n*6x;z2"));
        r0[58] = C0867b.m6107z(C0867b.m6108z("i\u0007F\u001c\u0001BHOY\u001cWY\u001f\u001dC\rX^\u001aI\u001eJ\u0012\u001aC\rXP"));
        r0[59] = C0867b.m6107z(C0867b.m6108z("\u0016D"));
        r0[60] = C0867b.m6107z(C0867b.m6108z("t=i-'u"));
        r0[61] = C0867b.m6107z(C0867b.m6108z("i\u0007E^\u0014Î\u001aÂP"));
        r0[62] = C0867b.m6107z(C0867b.m6108z("\u000bY\u0004MZ"));
        r0[63] = C0867b.m6107z(C0867b.m6108z("h\u0018Â\f\u0012I\fN^\u0017U\u0007B\n\u0016\u0007\f^^1b<|;6iHF\u001f\u001dV\u001dJ\u0010\u0007BF"));
        r0[64] = C0867b.m6107z(C0867b.m6108z("\u0007<c;=\u0007"));
        r0[65] = C0867b.m6107z(C0867b.m6108z("\u0007-g-6\u0007"));
        r0[66] = C0867b.m6107z(C0867b.m6108z("p n,6\u0007"));
        r0[67] = C0867b.m6107z(C0867b.m6108z("k\t\u000b\u001d\u001fF\u001dX\u001bSp n,6\u0007\fD\u0017\u0007\u0007\u000bD\u0010\u0007B\u0006B\fSR\u0006B\u000f\u0006B\u0005N\u0010\u0007\u0007\u0004J^\u0017B\u001bH\f\u001aW\u001cB\u0011\u001d\u0007\fN\rSD\u0007E\u001a\u001aS\u0001D\u0010\u0000\t"));
        r0[68] = C0867b.m6107z(C0867b.m6108z("h:o;!\u0007*r^"));
        r0[69] = C0867b.m6107z(C0867b.m6108z("\u0007,n-0"));
        r0[70] = C0867b.m6107z(C0867b.m6108z(".)x="));
        r0[71] = C0867b.m6107z(C0867b.m6108z("h\u0018_\u0017\u001cIHO\u001bSS\u001aB^\u001dH\u0006\u000b\r\u0006W\u0018D\f\u0007Î\r\u0005"));
        r0[72] = C0867b.m6107z(C0867b.m6108z("\u0007)x="));
        r0[73] = C0867b.m6107z(C0867b.m6108z(".,n-0"));
        r0[74] = C0867b.m6107z(C0867b.m6108z("f\u001dH\u000b\u001d\u0007G\u001eB\u0006_^\u001d\u0000\rX\nSF\u001bX\u0011\u0010NN^\u0007\u0004J^\u0010K\t^\r\u0016\u0007'y:6uHi']"));
        r0[75] = C0867b.m6107z(C0867b.m6108z("d\u0004J\u000b\u0000BHx;'\u0007\u0005J\u0010\u0002R\tE\n\u0016\t"));
        r0[76] = C0867b.m6107z(C0867b.m6108z("d\u0004J\u000b\u0000BH~.7f<n^\u001eF\u0006Z\u000b\u0012I\u001cNP"));
        r0[77] = C0867b.m6107z(C0867b.m6108z("a=g2Sh=;!\u0007\"d7=\u0007"));
        r0[78] = C0867b.m6107z(C0867b.m6108z("n&e;!\u0007\"d7=\u0007"));
        r0[79] = C0867b.m6107z(C0867b.m6108z("\u0007'e^"));
        r0[80] = C0867b.m6107z(C0867b.m6108z("u!l6'\u0007'~*6uHa1:iH"));
        r0[81] = C0867b.m6107z(C0867b.m6108z("s\u0011[\u001bSC\r\u000b\u0014\u001cN\u0006_\u000b\u0001BHE\u0011\u001d\u0007\u001aN\u001d\u001cI\u0006^P"));
        r0[82] = C0867b.m6107z(C0867b.m6108z("k-m*Sh=;!\u0007\"d7=\u0007"));
        r0[83] = C0867b.m6107z(C0867b.m6108z("d\u0004J\u000b\u0000BHb0 b:^\u001eF\u0006Z\u000b\u0012I\u001cNP"));
        r0[84] = C0867b.m6107z(C0867b.m6108z("\u0007>j2&b;\u000b"));
        r0[85] = C0867b.m6107z(C0867b.m6108z("\u001bV"));
        r0[86] = C0867b.m6107z(C0867b.m6108z("f$g"));
        r0[87] = C0867b.m6107z(C0867b.m6108z("d\u0004J\u000b\u0000BHm,<jHF\u001f\u001dV\u001dJ\u0010\u0007BF"));
        r0[88] = C0867b.m6107z(C0867b.m6108z("b0b-'t"));
        r0[89] = C0867b.m6107z(C0867b.m6108z("\u000eHj-S"));
        r0[90] = C0867b.m6107z(C0867b.m6108z("d\u0004J\u000b\u0000BHx;?b+^\u001eF\u0006Z\u000b\u0012I\u001cNP"));
        r0[91] = C0867b.m6107z(C0867b.m6108z("s\u0011[\u001bSC\r\u000b\r\u001cR\u001b\u000b\f\u0016V\u001dÁ\n\u0016\u0007\u0001E\u001d\u0010H\u0006^^\u001cRHE\u0011\u001d\u0007\u001b^\u000e\u0003H\u001a_]"));
        r0[92] = C0867b.m6107z(C0867b.m6108z("f&r"));
        r0[93] = C0867b.m6107z(C0867b.m6108z("\u0007=e7<iH"));
        yc = r0;
    }

    public C0867b(C0833j c0833j) {
        this.xc = c0833j;
    }

    /* renamed from: a */
    private final String m6101a(Element element, String str, Element element2) throws WDInvalidSQLException {
        boolean z = element instanceof Parametre;
        if (z) {
            try {
                if (this.xc instanceof C0858k) {
                    if (str.startsWith(tc)) {
                        return str;
                    }
                }
            } catch (WDInvalidSQLException e) {
                throw e;
            } catch (WDInvalidSQLException e2) {
                throw e2;
            }
        }
        if (!z) {
            try {
                if (!(element instanceof Literal)) {
                    return str;
                }
            } catch (WDInvalidSQLException e22) {
                throw e22;
            }
        }
        if (element2 instanceof Rubrique) {
            eb rubriqueAnalyse = ((Rubrique) element2).getRubriqueAnalyse();
            try {
                C0691a.m2860a(rubriqueAnalyse != null, yc[13]);
                if (rubriqueAnalyse == null) {
                    return str;
                }
                if (!(this.xc instanceof C0858k)) {
                    try {
                        if (rubriqueAnalyse.m5856m()) {
                            return this.xc.mo3173a(rubriqueAnalyse, rubriqueAnalyse.m5817a(new WDChaine(str)), 0);
                        }
                    } catch (WDInvalidSQLException e222) {
                        throw e222;
                    }
                }
                return this.xc.mo3173a(rubriqueAnalyse, (Object) str, 0);
            } catch (WDInvalidSQLException e2222) {
                throw e2222;
            } catch (WDInvalidSQLException e22222) {
                throw e22222;
            }
        } else {
            try {
                if (element instanceof Literal) {
                    if (element.isNumerique()) {
                        return str;
                    }
                }
                try {
                    if (element2 instanceof Expression) {
                        if (element2.isNumerique()) {
                            return str;
                        }
                    }
                    return this.xc.m5295a(str, 0);
                } catch (WDInvalidSQLException e222222) {
                    throw e222222;
                } catch (WDInvalidSQLException e2222222) {
                    throw e2222222;
                }
            } catch (WDInvalidSQLException e22222222) {
                throw e22222222;
            } catch (WDInvalidSQLException e222222222) {
                throw e222222222;
            }
        }
    }

    /* renamed from: a */
    private final String m6102a(Expression expression, int i) throws WDInvalidSQLException {
        int i2 = 0;
        int nbElement = expression.getNbElement();
        if (nbElement < i) {
            try {
                throw new WDInvalidSQLException(yc[18]);
            } catch (WDInvalidSQLException e) {
                throw e;
            }
        }
        int i3;
        String[] strArr = new String[nbElement];
        int i4 = 0;
        for (i3 = 0; i3 < nbElement; i3++) {
            String codeSQL = expression.getElementAt(i3).getCodeSQL(this);
            if (codeSQL != null) {
                i4++;
                try {
                    strArr[i3] = codeSQL;
                } catch (WDInvalidSQLException e2) {
                    throw e2;
                }
            }
        }
        if (i4 < i) {
            return null;
        }
        StringBuilder append = new StringBuilder(this.xc.mo3092a(expression.getTypeOperateurOuFonction())).append("(");
        i3 = 0;
        while (i3 < nbElement) {
            try {
                if (strArr[i3] == null) {
                    i4 = i2;
                } else {
                    if (i2 > 0) {
                        try {
                            append.append(',');
                        } catch (WDInvalidSQLException e22) {
                            throw e22;
                        }
                    }
                    try {
                        append.append(expression.isFonctionChaine() ? m6101a(expression.getElementAt(i3), strArr[i3], expression) : strArr[i3]);
                        i4 = i2 + 1;
                    } catch (WDInvalidSQLException e222) {
                        throw e222;
                    }
                }
                i3++;
                i2 = i4;
            } catch (WDInvalidSQLException e2222) {
                throw e2222;
            }
        }
        return append.append(')').toString();
    }

    /* renamed from: a */
    private final String m6103a(Requete requete) throws WDInvalidSQLException {
        StringBuilder stringBuilder = new StringBuilder();
        m6128a(stringBuilder);
        Delete delete = (Delete) requete.getClause(Delete.class);
        if (delete == null) {
            try {
                throw new WDInvalidSQLException(yc[8]);
            } catch (WDInvalidSQLException e) {
                throw e;
            }
        }
        stringBuilder.append(delete.getCodeSQL(this));
        Where where = (Where) requete.getClause(Where.class);
        if (where != null) {
            String codeSQL = where.getCodeSQL(this);
            if (codeSQL != null) {
                try {
                    stringBuilder.append(' ').append(codeSQL);
                } catch (WDInvalidSQLException e2) {
                    throw e2;
                }
            }
        }
        try {
            return stringBuilder.length() > 0 ? stringBuilder.toString() : null;
        } catch (WDInvalidSQLException e22) {
            throw e22;
        }
    }

    /* renamed from: c */
    private final String m6104c(Requete requete) throws WDInvalidSQLException {
        StringBuilder stringBuilder = new StringBuilder();
        m6128a(stringBuilder);
        Clause clause = (Insert) requete.getClause(Insert.class);
        if (clause == null) {
            try {
                throw new WDInvalidSQLException(yc[83]);
            } catch (WDInvalidSQLException e) {
                throw e;
            }
        }
        stringBuilder.append(clause.getCodeSQL(this));
        Clause clause2 = (Set) requete.getClause(Set.class);
        if (clause2 == null) {
            try {
                throw new WDInvalidSQLException(yc[75]);
            } catch (WDInvalidSQLException e2) {
                throw e2;
            }
        }
        int nbElement = clause2.getNbElement();
        try {
            if (nbElement % 2 != 0) {
                throw new WDInvalidSQLException(yc[31]);
            }
            CharSequence stringBuilder2 = new StringBuilder();
            CharSequence stringBuilder3 = new StringBuilder();
            int i = 0;
            int i2 = 0;
            while (i2 < nbElement) {
                Element elementAt = clause2.getElementAt(i2);
                i2++;
                Element elementAt2 = clause2.getElementAt(i2);
                m6127a(clause);
                String codeSQL = elementAt.getCodeSQL(this);
                m6127a(clause2);
                String codeSQL2 = elementAt2.getCodeSQL(this);
                if (!(codeSQL == null || codeSQL2 == null)) {
                    if (i > 0) {
                        try {
                            stringBuilder2.append(yc[0]);
                            stringBuilder3.append(yc[0]);
                        } catch (WDInvalidSQLException e22) {
                            throw e22;
                        }
                    }
                    stringBuilder2.append('(');
                    stringBuilder3.append('(');
                    stringBuilder2.append(codeSQL);
                    stringBuilder3.append(m6101a(elementAt2, codeSQL2, elementAt));
                    i++;
                }
                i2++;
            }
            if (i > 0) {
                try {
                    stringBuilder.append(' ').append(stringBuilder2).append(')').append(yc[84]).append(stringBuilder3).append(')');
                } catch (WDInvalidSQLException e222) {
                    throw e222;
                }
            }
            try {
                return stringBuilder.length() > 0 ? stringBuilder.toString() : null;
            } catch (WDInvalidSQLException e2222) {
                throw e2222;
            }
        } catch (WDInvalidSQLException e22222) {
            throw e22222;
        }
    }

    /* renamed from: d */
    private final String m6105d(Requete requete) throws WDInvalidSQLException {
        StringBuilder stringBuilder = new StringBuilder();
        m6128a(stringBuilder);
        Update update = (Update) requete.getClause(Update.class);
        if (update == null) {
            try {
                throw new WDInvalidSQLException(yc[76]);
            } catch (WDInvalidSQLException e) {
                throw e;
            }
        }
        stringBuilder.append(update.getCodeSQL(this));
        Set set = (Set) requete.getClause(Set.class);
        if (set == null) {
            try {
                throw new WDInvalidSQLException(yc[75]);
            } catch (WDInvalidSQLException e2) {
                throw e2;
            }
        }
        stringBuilder.append(' ').append(set.getCodeSQL(this));
        Where where = (Where) requete.getClause(Where.class);
        if (where != null) {
            String codeSQL = where.getCodeSQL(this);
            if (codeSQL != null) {
                try {
                    stringBuilder.append(' ').append(codeSQL);
                } catch (WDInvalidSQLException e22) {
                    throw e22;
                }
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: e */
    private final String m6106e(Requete requete) throws WDInvalidSQLException {
        int i = 0;
        StringBuilder stringBuilder = new StringBuilder();
        m6128a(stringBuilder);
        Select select = (Select) requete.getClause(Select.class);
        if (select == null) {
            try {
                throw new WDInvalidSQLException(yc[90]);
            } catch (WDInvalidSQLException e) {
                throw e;
            }
        }
        stringBuilder.append(select.getCodeSQL(this));
        From from = (From) requete.getClause(From.class);
        if (from == null) {
            try {
                throw new WDInvalidSQLException(yc[87]);
            } catch (WDInvalidSQLException e2) {
                throw e2;
            }
        }
        String codeSQL;
        String codeSQL2;
        stringBuilder.append(' ').append(from.getCodeSQL(this));
        Where where = (Where) requete.getClause(Where.class);
        if (where != null) {
            codeSQL = where.getCodeSQL(this);
            if (codeSQL != null) {
                try {
                    stringBuilder.append(' ').append(codeSQL);
                } catch (WDInvalidSQLException e22) {
                    throw e22;
                }
            }
        }
        GroupBy groupBy = (GroupBy) requete.getClause(GroupBy.class);
        if (groupBy != null) {
            codeSQL = groupBy.getCodeSQL(this);
            if (codeSQL != null) {
                try {
                    stringBuilder.append(' ').append(codeSQL);
                } catch (WDInvalidSQLException e222) {
                    throw e222;
                }
            }
        }
        Having having = (Having) requete.getClause(Having.class);
        if (having != null) {
            codeSQL = having.getCodeSQL(this);
            if (codeSQL != null) {
                try {
                    stringBuilder.append(' ').append(codeSQL);
                } catch (WDInvalidSQLException e2222) {
                    throw e2222;
                }
            }
        }
        OrderBy orderBy = (OrderBy) requete.getClause(OrderBy.class);
        if (orderBy != null) {
            try {
                if (requete.getNbRequetesUnion() == 0) {
                    codeSQL2 = orderBy.getCodeSQL(this);
                    if (codeSQL2 != null) {
                        try {
                            stringBuilder.append(' ');
                            orderBy.setPositionDebut(stringBuilder.length());
                            stringBuilder.append(codeSQL2);
                            orderBy.setPositionFin(codeSQL2.length() + orderBy.getPositionDebut());
                        } catch (WDInvalidSQLException e22222) {
                            throw e22222;
                        }
                    }
                }
            } catch (WDInvalidSQLException e222222) {
                throw e222222;
            }
        }
        Limit limit = (Limit) requete.getClause(Limit.class);
        if (limit != null) {
            codeSQL2 = limit.getCodeSQL(this);
            if (codeSQL2 != null) {
                try {
                    if (!codeSQL2.trim().startsWith(yc[22])) {
                        stringBuilder.append(' ').append(codeSQL2);
                    }
                } catch (WDInvalidSQLException e2222222) {
                    throw e2222222;
                }
            }
        }
        try {
            StringBuilder stringBuilder2;
            if (!C0808l.m4053k(requete.getAlias())) {
                stringBuilder.insert(0, '(').append(yc[89]).append(requete.getAlias());
            }
            String option = requete.getOption(EWDOptionRequete.TYPE_SOUS_REQUETE);
            int nbRequetesUnion;
            String codeSQL3;
            if (C0808l.m4053k(option)) {
                nbRequetesUnion = requete.getNbRequetesUnion();
                StringBuilder stringBuilder3 = stringBuilder;
                while (i < nbRequetesUnion) {
                    stringBuilder = new StringBuilder().append(stringBuilder3.toString()).append(yc[93]);
                    Requete requeteUnionAt = requete.getRequeteUnionAt(i);
                    try {
                        if (requeteUnionAt.isUnionAvecDoublons()) {
                            stringBuilder.append(yc[33]);
                        }
                        stringBuilder.append(requeteUnionAt.getCodeSQL(this));
                        i++;
                        stringBuilder3 = stringBuilder;
                    } catch (WDInvalidSQLException e22222222) {
                        throw e22222222;
                    }
                }
                if (nbRequetesUnion > 0 && orderBy != null) {
                    codeSQL3 = orderBy.getCodeSQL(this);
                    if (codeSQL3 != null) {
                        try {
                            stringBuilder3.append(' ');
                            orderBy.setPositionDebut(stringBuilder3.length());
                            stringBuilder3.append(codeSQL3);
                            orderBy.setPositionFin(codeSQL3.length() + orderBy.getPositionDebut());
                            stringBuilder2 = stringBuilder3;
                        } catch (WDInvalidSQLException e222222222) {
                            throw e222222222;
                        }
                    }
                }
                stringBuilder2 = stringBuilder3;
            } else {
                codeSQL2 = null;
                nbRequetesUnion = C0725i.m3064d(option);
                switch (nbRequetesUnion) {
                    case 0:
                        break;
                    case 1:
                        codeSQL2 = yc[88];
                        break;
                    case 2:
                        codeSQL2 = yc[86];
                        break;
                    case 3:
                        codeSQL2 = yc[92];
                        break;
                    case 4:
                        codeSQL2 = "";
                        break;
                    default:
                        throw new WDInvalidSQLException(yc[91]);
                }
                if (nbRequetesUnion != 0) {
                    try {
                        codeSQL = requete.getOperande() != null ? requete.getOperande().getCodeSQL(this) : null;
                        if (codeSQL != null) {
                            codeSQL3 = requete.getOption(EWDOptionRequete.OPERATEUR_SOUS_REQUETE);
                            if (C0808l.m4053k(codeSQL3)) {
                                codeSQL3 = "=";
                            }
                            if (nbRequetesUnion == 3) {
                                try {
                                    if (codeSQL3.equals("=")) {
                                        codeSQL2 = this.xc.mo3092a(22);
                                    }
                                } catch (WDInvalidSQLException e2222222222) {
                                    throw e2222222222;
                                }
                            }
                            if (nbRequetesUnion == 2) {
                                try {
                                    if (codeSQL3.equals(yc[85])) {
                                        codeSQL2 = this.xc.mo3092a(26) + " " + this.xc.mo3092a(22);
                                    }
                                } catch (WDInvalidSQLException e22222222222) {
                                    throw e22222222222;
                                }
                            }
                            codeSQL = codeSQL + ' ' + codeSQL3;
                        }
                        option = stringBuilder.toString();
                        StringBuilder stringBuilder4 = new StringBuilder(stringBuilder.length());
                        if (codeSQL != null) {
                            try {
                                stringBuilder4.append(codeSQL);
                            } catch (WDInvalidSQLException e222222222222) {
                                throw e222222222222;
                            }
                        }
                        try {
                            stringBuilder4.append(' ');
                            if (!C0808l.m4053k(codeSQL2)) {
                                stringBuilder4.append(codeSQL2);
                            }
                            stringBuilder4.append('(').append(option).append(')');
                            stringBuilder2 = stringBuilder4;
                        } catch (WDInvalidSQLException e2222222222222) {
                            throw e2222222222222;
                        }
                    } catch (WDInvalidSQLException e22222222222222) {
                        throw e22222222222222;
                    }
                }
                stringBuilder2 = stringBuilder;
            }
            codeSQL = stringBuilder2.toString().trim();
            try {
                return codeSQL.indexOf(40) == 0 ? (codeSQL.indexOf(41) == codeSQL.length() + -1 && requete.getNbRequetesUnion() == 0) ? codeSQL.substring(1, codeSQL.length() - 1) : codeSQL : codeSQL;
            } catch (WDInvalidSQLException e222222222222222) {
                throw e222222222222222;
            } catch (WDInvalidSQLException e2222222222222222) {
                throw e2222222222222222;
            }
        } catch (WDInvalidSQLException e22222222222222222) {
            throw e22222222222222222;
        }
    }

    /* renamed from: z */
    private static String m6107z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 39;
                    break;
                case 1:
                    i2 = 104;
                    break;
                case 2:
                    i2 = 43;
                    break;
                case 3:
                    i2 = 126;
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
    private static char[] m6108z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 115);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final Requete m6109a() {
        return this.sc;
    }

    /* renamed from: a */
    public final String m6110a(Delete delete) throws WDInvalidSQLException {
        m6127a((Clause) delete);
        StringBuilder stringBuilder = new StringBuilder(yc[14]);
        try {
            if (delete.getNbElement() != 1) {
                throw new WDInvalidSQLException(yc[15]);
            }
            stringBuilder.append(delete.getElementAt(0).getCodeSQL(this));
            return stringBuilder.toString();
        } catch (WDInvalidSQLException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final java.lang.String m6111a(fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.Expression r14) throws fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException {
        /*
        r13 = this;
        r11 = 32;
        r5 = 2;
        r3 = 0;
        r1 = 1;
        r2 = 0;
        r7 = new java.lang.StringBuilder;
        r0 = "";
        r7.<init>(r0);
        r4 = r14.getNbElement();
        r6 = r14.getTypeOperateurOuFonction();
        switch(r6) {
            case 1: goto L_0x0521;
            case 3: goto L_0x0521;
            case 7: goto L_0x0743;
            case 8: goto L_0x0743;
            case 22: goto L_0x0169;
            case 23: goto L_0x0072;
            case 26: goto L_0x06c5;
            case 27: goto L_0x06c5;
            case 28: goto L_0x06c5;
            case 29: goto L_0x06c5;
            case 30: goto L_0x06c5;
            case 31: goto L_0x06c5;
            case 32: goto L_0x029f;
            case 33: goto L_0x07ab;
            case 42: goto L_0x05ee;
            case 43: goto L_0x05ee;
            case 44: goto L_0x0577;
            case 45: goto L_0x06c5;
            case 46: goto L_0x06c5;
            case 50: goto L_0x0577;
            case 51: goto L_0x0577;
            case 54: goto L_0x06c5;
            case 55: goto L_0x06c5;
            case 56: goto L_0x05ee;
            case 57: goto L_0x05ee;
            case 58: goto L_0x0052;
            case 59: goto L_0x05ee;
            case 61: goto L_0x06c5;
            case 66: goto L_0x05ee;
            case 67: goto L_0x069e;
            case 68: goto L_0x05ee;
            case 72: goto L_0x06c5;
            case 73: goto L_0x0060;
            case 74: goto L_0x09c0;
            case 84: goto L_0x0570;
            case 88: goto L_0x056a;
            case 94: goto L_0x0570;
            case 97: goto L_0x0696;
            case 103: goto L_0x0564;
            case 105: goto L_0x0932;
            case 106: goto L_0x080d;
            case 107: goto L_0x08a8;
            case 110: goto L_0x06c5;
            case 111: goto L_0x03f1;
            case 112: goto L_0x043b;
            case 114: goto L_0x048f;
            case 131: goto L_0x0564;
            case 132: goto L_0x0564;
            case 135: goto L_0x04df;
            case 144: goto L_0x05ee;
            default: goto L_0x0018;
        };
    L_0x0018:
        if (r4 != r5) goto L_0x0a0a;
    L_0x001a:
        r0 = r14.getTypeOperateurOuFonction();	 Catch:{ WDInvalidSQLException -> 0x09c6 }
        r8 = 9;
        if (r0 < r8) goto L_0x0a0a;
    L_0x0022:
        r0 = r14.getTypeOperateurOuFonction();	 Catch:{ WDInvalidSQLException -> 0x09c6 }
        r8 = 21;
        if (r0 > r8) goto L_0x0a0a;
    L_0x002a:
        r0 = r14.getExpression();
        r4 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r0);	 Catch:{ WDInvalidSQLException -> 0x09c8 }
        if (r4 != 0) goto L_0x09ca;
    L_0x0034:
        r0 = r0.trim();	 Catch:{ WDInvalidSQLException -> 0x0050 }
        r4 = yc;	 Catch:{ WDInvalidSQLException -> 0x0050 }
        r5 = 47;
        r4 = r4[r5];	 Catch:{ WDInvalidSQLException -> 0x0050 }
        r0 = r0.endsWith(r4);	 Catch:{ WDInvalidSQLException -> 0x0050 }
        if (r0 == 0) goto L_0x09ca;
    L_0x0044:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ WDInvalidSQLException -> 0x0050 }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x0050 }
        r2 = 35;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x0050 }
        r0.<init>(r1);	 Catch:{ WDInvalidSQLException -> 0x0050 }
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x0050 }
    L_0x0050:
        r0 = move-exception;
        throw r0;
    L_0x0052:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ WDInvalidSQLException -> 0x005e }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x005e }
        r2 = 61;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x005e }
        r0.<init>(r1);	 Catch:{ WDInvalidSQLException -> 0x005e }
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x005e }
    L_0x005e:
        r0 = move-exception;
        throw r0;
    L_0x0060:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;
        r3 = yc;
        r4 = 57;
        r3 = r3[r4];
        r2 = new java.lang.String[r2];
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r2);
        r0.<init>(r2, r1);
        throw r0;
    L_0x0072:
        r0 = "";
        r2 = r14.getElementAt(r2);
        if (r2 == 0) goto L_0x011a;
    L_0x007a:
        r0 = r2.getCodeSQL(r13);
        r7.append(r0);
        r0 = "";
        r1 = r14.getElementAt(r1);
        if (r1 == 0) goto L_0x0126;
    L_0x0089:
        r0 = r1.getCodeSQL(r13);
        if (r0 == 0) goto L_0x0093;
    L_0x008f:
        r0 = r13.m6101a(r1, r0, r2);
    L_0x0093:
        r1 = "";
        r4 = r14.getElementAt(r5);
        if (r4 == 0) goto L_0x0132;
    L_0x009b:
        r1 = r4.getCodeSQL(r13);
        if (r1 == 0) goto L_0x00a5;
    L_0x00a1:
        r1 = r13.m6101a(r4, r1, r2);
    L_0x00a5:
        if (r0 == 0) goto L_0x0140;
    L_0x00a7:
        if (r1 == 0) goto L_0x0140;
    L_0x00a9:
        r2 = 32;
        r2 = r7.append(r2);	 Catch:{ WDInvalidSQLException -> 0x013e }
        r3 = r13.xc;	 Catch:{ WDInvalidSQLException -> 0x013e }
        r3 = r3.mo3092a(r6);	 Catch:{ WDInvalidSQLException -> 0x013e }
        r2 = r2.append(r3);	 Catch:{ WDInvalidSQLException -> 0x013e }
        r3 = 32;
        r2 = r2.append(r3);	 Catch:{ WDInvalidSQLException -> 0x013e }
        r0 = r2.append(r0);	 Catch:{ WDInvalidSQLException -> 0x013e }
        r2 = 32;
        r0 = r0.append(r2);	 Catch:{ WDInvalidSQLException -> 0x013e }
        r2 = r13.xc;	 Catch:{ WDInvalidSQLException -> 0x013e }
        r3 = 24;
        r2 = r2.mo3092a(r3);	 Catch:{ WDInvalidSQLException -> 0x013e }
        r0 = r0.append(r2);	 Catch:{ WDInvalidSQLException -> 0x013e }
        r2 = 32;
        r0 = r0.append(r2);	 Catch:{ WDInvalidSQLException -> 0x013e }
        r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x013e }
    L_0x00de:
        r0 = fr.pcsoft.wdjava.database.hf.requete.parsing.EWDOptionRequete.NOT_BETWEEN;
        r0 = r14.getOption(r0);
        if (r0 == 0) goto L_0x0115;
    L_0x00e6:
        r0 = fr.pcsoft.wdjava.core.C0725i.m3072e(r0);	 Catch:{ WDInvalidSQLException -> 0x0167 }
        if (r0 == 0) goto L_0x0115;
    L_0x00ec:
        r0 = 0;
        r1 = new java.lang.StringBuilder;	 Catch:{ WDInvalidSQLException -> 0x0167 }
        r1.<init>();	 Catch:{ WDInvalidSQLException -> 0x0167 }
        r2 = r13.xc;	 Catch:{ WDInvalidSQLException -> 0x0167 }
        r3 = 26;
        r2 = r2.mo3092a(r3);	 Catch:{ WDInvalidSQLException -> 0x0167 }
        r1 = r1.append(r2);	 Catch:{ WDInvalidSQLException -> 0x0167 }
        r2 = yc;	 Catch:{ WDInvalidSQLException -> 0x0167 }
        r3 = 41;
        r2 = r2[r3];	 Catch:{ WDInvalidSQLException -> 0x0167 }
        r1 = r1.append(r2);	 Catch:{ WDInvalidSQLException -> 0x0167 }
        r1 = r1.toString();	 Catch:{ WDInvalidSQLException -> 0x0167 }
        r0 = r7.insert(r0, r1);	 Catch:{ WDInvalidSQLException -> 0x0167 }
        r1 = ")";
        r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x0167 }
    L_0x0115:
        r0 = r7.toString();
    L_0x0119:
        return r0;
    L_0x011a:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;
        r1 = yc;
        r2 = 38;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0126:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;
        r1 = yc;
        r2 = 63;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x0132:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;
        r1 = yc;
        r2 = 63;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x013e:
        r0 = move-exception;
        throw r0;
    L_0x0140:
        if (r0 == 0) goto L_0x0152;
    L_0x0142:
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x0150 }
        r2 = 50;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x0150 }
        r1 = r7.append(r1);	 Catch:{ WDInvalidSQLException -> 0x0150 }
        r1.append(r0);	 Catch:{ WDInvalidSQLException -> 0x0150 }
        goto L_0x00de;
    L_0x0150:
        r0 = move-exception;
        throw r0;
    L_0x0152:
        if (r1 == 0) goto L_0x0165;
    L_0x0154:
        r0 = yc;	 Catch:{ WDInvalidSQLException -> 0x0163 }
        r2 = 45;
        r0 = r0[r2];	 Catch:{ WDInvalidSQLException -> 0x0163 }
        r0 = r7.append(r0);	 Catch:{ WDInvalidSQLException -> 0x0163 }
        r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x0163 }
        goto L_0x00de;
    L_0x0163:
        r0 = move-exception;
        throw r0;
    L_0x0165:
        r0 = r3;
        goto L_0x0119;
    L_0x0167:
        r0 = move-exception;
        throw r0;
    L_0x0169:
        r0 = "";
        r4 = r14.getElementAt(r2);
        if (r4 == 0) goto L_0x01c6;
    L_0x0171:
        r0 = r4.getCodeSQL(r13);
        r0 = r7.append(r0);
        r0.append(r11);
        r0 = fr.pcsoft.wdjava.database.hf.requete.parsing.EWDOptionRequete.NOT_IN;
        r0 = r14.getOption(r0);
        if (r0 == 0) goto L_0x01d4;
    L_0x0184:
        r0 = fr.pcsoft.wdjava.core.C0725i.m3072e(r0);	 Catch:{ WDInvalidSQLException -> 0x01d2 }
        if (r0 == 0) goto L_0x01d4;
    L_0x018a:
        r0 = r1;
    L_0x018b:
        if (r0 == 0) goto L_0x019e;
    L_0x018d:
        r0 = r13.xc;	 Catch:{ WDInvalidSQLException -> 0x01d6 }
        r6 = 26;
        r0 = r0.mo3092a(r6);	 Catch:{ WDInvalidSQLException -> 0x01d6 }
        r0 = r7.append(r0);	 Catch:{ WDInvalidSQLException -> 0x01d6 }
        r6 = 32;
        r0.append(r6);	 Catch:{ WDInvalidSQLException -> 0x01d6 }
    L_0x019e:
        r0 = r13.xc;
        r6 = 22;
        r0 = r0.mo3092a(r6);
        r0 = r7.append(r0);
        r6 = yc;
        r8 = 41;
        r6 = r6[r8];
        r0.append(r6);
        r6 = r14.getNbElement();
        if (r6 != r5) goto L_0x0268;
    L_0x01b9:
        r0 = r14.getElementAt(r1);
        r5 = r0.getCodeSQL(r13);
        if (r5 != 0) goto L_0x01d8;
    L_0x01c3:
        r0 = r3;
        goto L_0x0119;
    L_0x01c6:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;
        r1 = yc;
        r2 = 43;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x01d2:
        r0 = move-exception;
        throw r0;
    L_0x01d4:
        r0 = r2;
        goto L_0x018b;
    L_0x01d6:
        r0 = move-exception;
        throw r0;
    L_0x01d8:
        r3 = new java.util.LinkedList;
        r3.<init>();
        r6 = r5.length();
        r8 = new java.lang.StringBuilder;
        r8.<init>();
        r0 = r2;
    L_0x01e7:
        if (r0 >= r6) goto L_0x0217;
    L_0x01e9:
        r9 = r5.charAt(r0);
        switch(r9) {
            case 0: goto L_0x020c;
            case 9: goto L_0x020c;
            case 10: goto L_0x020c;
            case 13: goto L_0x01f6;
            case 39: goto L_0x01f3;
            case 59: goto L_0x020c;
            default: goto L_0x01f0;
        };
    L_0x01f0:
        r8.append(r9);
    L_0x01f3:
        r0 = r0 + 1;
        goto L_0x01e7;
    L_0x01f6:
        r10 = r6 + -1;
        if (r0 >= r10) goto L_0x0204;
    L_0x01fa:
        r10 = r0 + 1;
        r10 = r5.charAt(r10);	 Catch:{ WDInvalidSQLException -> 0x0208 }
        r11 = 10;
        if (r10 == r11) goto L_0x020a;
    L_0x0204:
        r8.append(r9);	 Catch:{ WDInvalidSQLException -> 0x0208 }
        goto L_0x01f3;
    L_0x0208:
        r0 = move-exception;
        throw r0;
    L_0x020a:
        r0 = r0 + 1;
    L_0x020c:
        r9 = r8.toString();
        r3.add(r9);
        r8.setLength(r2);
        goto L_0x01f3;
    L_0x0217:
        r0 = r8.length();	 Catch:{ WDInvalidSQLException -> 0x0255 }
        if (r0 > 0) goto L_0x0223;
    L_0x021d:
        r0 = r3.isEmpty();	 Catch:{ WDInvalidSQLException -> 0x0257 }
        if (r0 == 0) goto L_0x022a;
    L_0x0223:
        r0 = r8.toString();	 Catch:{ WDInvalidSQLException -> 0x0257 }
        r3.add(r0);	 Catch:{ WDInvalidSQLException -> 0x0257 }
    L_0x022a:
        r3.size();
        r3 = r3.iterator();
    L_0x0231:
        r0 = r3.hasNext();	 Catch:{ WDInvalidSQLException -> 0x0259 }
        if (r0 == 0) goto L_0x025d;
    L_0x0237:
        if (r2 <= 0) goto L_0x0241;
    L_0x0239:
        r0 = yc;	 Catch:{ WDInvalidSQLException -> 0x025b }
        r5 = 0;
        r0 = r0[r5];	 Catch:{ WDInvalidSQLException -> 0x025b }
        r7.append(r0);	 Catch:{ WDInvalidSQLException -> 0x025b }
    L_0x0241:
        r5 = r14.getElementAt(r1);
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        r0 = r13.m6101a(r5, r0, r4);
        r7.append(r0);
        r2 = r2 + 1;
        goto L_0x0231;
    L_0x0255:
        r0 = move-exception;
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x0257 }
    L_0x0257:
        r0 = move-exception;
        throw r0;
    L_0x0259:
        r0 = move-exception;
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x025b }
    L_0x025b:
        r0 = move-exception;
        throw r0;
    L_0x025d:
        r0 = ")";
        r7.append(r0);
        r0 = r7.toString();
        goto L_0x0119;
    L_0x0268:
        r0 = r2;
    L_0x0269:
        if (r1 >= r6) goto L_0x028d;
    L_0x026b:
        r2 = r14.getElementAt(r1);
        r5 = r2.getCodeSQL(r13);
        if (r5 == 0) goto L_0x0288;
    L_0x0275:
        if (r0 <= 0) goto L_0x027f;
    L_0x0277:
        r8 = yc;	 Catch:{ WDInvalidSQLException -> 0x028b }
        r9 = 0;
        r8 = r8[r9];	 Catch:{ WDInvalidSQLException -> 0x028b }
        r7.append(r8);	 Catch:{ WDInvalidSQLException -> 0x028b }
    L_0x027f:
        r2 = r13.m6101a(r2, r5, r4);
        r7.append(r2);
        r0 = r0 + 1;
    L_0x0288:
        r1 = r1 + 1;
        goto L_0x0269;
    L_0x028b:
        r0 = move-exception;
        throw r0;
    L_0x028d:
        if (r0 <= 0) goto L_0x029c;
    L_0x028f:
        r0 = ")";
        r7.append(r0);	 Catch:{ WDInvalidSQLException -> 0x029a }
        r0 = r7.toString();	 Catch:{ WDInvalidSQLException -> 0x029a }
        goto L_0x0119;
    L_0x029a:
        r0 = move-exception;
        throw r0;
    L_0x029c:
        r0 = r3;
        goto L_0x0119;
    L_0x029f:
        if (r4 == r5) goto L_0x02af;
    L_0x02a1:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ WDInvalidSQLException -> 0x02ad }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x02ad }
        r2 = 48;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x02ad }
        r0.<init>(r1);	 Catch:{ WDInvalidSQLException -> 0x02ad }
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x02ad }
    L_0x02ad:
        r0 = move-exception;
        throw r0;
    L_0x02af:
        r8 = r14.getElementAt(r2);
        r9 = r8.getCodeSQL(r13);
        r10 = r14.getElementAt(r1);
        r4 = r10.getCodeSQL(r13);
        if (r9 == 0) goto L_0x02c3;
    L_0x02c1:
        if (r4 != 0) goto L_0x02c6;
    L_0x02c3:
        r0 = r3;
        goto L_0x0119;
    L_0x02c6:
        r0 = r10 instanceof fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.Parametre;	 Catch:{ WDInvalidSQLException -> 0x0377 }
        if (r0 != 0) goto L_0x02ce;
    L_0x02ca:
        r0 = r10 instanceof fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.Literal;	 Catch:{ WDInvalidSQLException -> 0x0377 }
        if (r0 == 0) goto L_0x03a0;
    L_0x02ce:
        r0 = fr.pcsoft.wdjava.database.hf.requete.parsing.EWDOptionRequete.LIKE_COMMENCE_PAR;
        r0 = r14.getOption(r0);
        if (r0 == 0) goto L_0x02dc;
    L_0x02d6:
        r0 = fr.pcsoft.wdjava.core.C0725i.m3072e(r0);	 Catch:{ WDInvalidSQLException -> 0x0379 }
        if (r0 != 0) goto L_0x02e4;
    L_0x02dc:
        r0 = "%";
        r0 = r4.endsWith(r0);	 Catch:{ WDInvalidSQLException -> 0x037b }
        if (r0 == 0) goto L_0x037d;
    L_0x02e4:
        r0 = r1;
    L_0x02e5:
        r3 = fr.pcsoft.wdjava.database.hf.requete.parsing.EWDOptionRequete.LIKE_FINI_PAR;
        r3 = r14.getOption(r3);
        if (r3 == 0) goto L_0x02f3;
    L_0x02ed:
        r3 = fr.pcsoft.wdjava.core.C0725i.m3072e(r3);	 Catch:{ WDInvalidSQLException -> 0x0380 }
        if (r3 != 0) goto L_0x02fb;
    L_0x02f3:
        r3 = "%";
        r3 = r4.startsWith(r3);	 Catch:{ WDInvalidSQLException -> 0x0382 }
        if (r3 == 0) goto L_0x0384;
    L_0x02fb:
        r3 = r1;
    L_0x02fc:
        r6 = fr.pcsoft.wdjava.database.hf.requete.parsing.EWDOptionRequete.LIKE_CONTIENT;
        r6 = r14.getOption(r6);
        if (r6 == 0) goto L_0x030a;
    L_0x0304:
        r6 = fr.pcsoft.wdjava.core.C0725i.m3072e(r6);	 Catch:{ WDInvalidSQLException -> 0x0387 }
        if (r6 != 0) goto L_0x030e;
    L_0x030a:
        if (r0 == 0) goto L_0x038d;
    L_0x030c:
        if (r3 == 0) goto L_0x038d;
    L_0x030e:
        r6 = r1;
    L_0x030f:
        if (r6 == 0) goto L_0x038f;
    L_0x0311:
        r3 = 64;
    L_0x0313:
        if (r3 == r1) goto L_0x039b;
    L_0x0315:
        r0 = "%";
        r0 = r4.startsWith(r0);	 Catch:{ WDInvalidSQLException -> 0x0399 }
        if (r0 == 0) goto L_0x0abf;
    L_0x031d:
        r0 = r4.substring(r1);
    L_0x0321:
        r4 = "%";
        r4 = r0.endsWith(r4);
        if (r4 == 0) goto L_0x0333;
    L_0x0329:
        r4 = r0.length();
        r4 = r4 + -1;
        r0 = r0.substring(r2, r4);
    L_0x0333:
        r4 = r13.xc;
        r0 = r4.m5295a(r0, r3);
    L_0x0339:
        r12 = r3;
        r3 = r0;
        r0 = r12;
    L_0x033c:
        r4 = fr.pcsoft.wdjava.database.hf.requete.parsing.EWDOptionRequete.NOT_LIKE;
        r4 = r14.getOption(r4);
        if (r4 == 0) goto L_0x03a9;
    L_0x0344:
        r4 = fr.pcsoft.wdjava.core.C0725i.m3072e(r4);	 Catch:{ WDInvalidSQLException -> 0x03a7 }
        if (r4 == 0) goto L_0x03a9;
    L_0x034a:
        r4 = r1;
    L_0x034b:
        r5 = fr.pcsoft.wdjava.database.hf.requete.parsing.EWDOptionRequete.LIKE_CASE_SENSITIVE;
        r5 = r14.getOption(r5);
        if (r5 == 0) goto L_0x035a;
    L_0x0353:
        r5 = fr.pcsoft.wdjava.core.C0725i.m3072e(r5);	 Catch:{ WDInvalidSQLException -> 0x03ab }
        if (r5 == 0) goto L_0x035a;
    L_0x0359:
        r2 = r1;
    L_0x035a:
        if (r0 != r1) goto L_0x03c1;
    L_0x035c:
        if (r2 != 0) goto L_0x03c1;
    L_0x035e:
        if (r4 == 0) goto L_0x03af;
    L_0x0360:
        r0 = r7.append(r9);	 Catch:{ WDInvalidSQLException -> 0x03ad }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x03ad }
        r2 = 53;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x03ad }
        r0 = r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x03ad }
        r0.append(r3);	 Catch:{ WDInvalidSQLException -> 0x03ad }
    L_0x0371:
        r0 = r7.toString();
        goto L_0x0119;
    L_0x0377:
        r0 = move-exception;
        throw r0;
    L_0x0379:
        r0 = move-exception;
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x037b }
    L_0x037b:
        r0 = move-exception;
        throw r0;
    L_0x037d:
        r0 = r2;
        goto L_0x02e5;
    L_0x0380:
        r0 = move-exception;
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x0382 }
    L_0x0382:
        r0 = move-exception;
        throw r0;
    L_0x0384:
        r3 = r2;
        goto L_0x02fc;
    L_0x0387:
        r0 = move-exception;
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x0389 }
    L_0x0389:
        r0 = move-exception;
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x038b }
    L_0x038b:
        r0 = move-exception;
        throw r0;
    L_0x038d:
        r6 = r2;
        goto L_0x030f;
    L_0x038f:
        if (r0 == 0) goto L_0x0393;
    L_0x0391:
        r3 = r5;
        goto L_0x0313;
    L_0x0393:
        if (r3 == 0) goto L_0x0ac2;
    L_0x0395:
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;
        goto L_0x0313;
    L_0x0399:
        r0 = move-exception;
        throw r0;
    L_0x039b:
        r0 = r13.m6101a(r10, r4, r8);
        goto L_0x0339;
    L_0x03a0:
        r0 = r13.m6101a(r10, r4, r8);
        r3 = r0;
        r0 = r1;
        goto L_0x033c;
    L_0x03a7:
        r0 = move-exception;
        throw r0;
    L_0x03a9:
        r4 = r2;
        goto L_0x034b;
    L_0x03ab:
        r0 = move-exception;
        throw r0;
    L_0x03ad:
        r0 = move-exception;
        throw r0;
    L_0x03af:
        r0 = r7.append(r9);
        r1 = yc;
        r2 = 29;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0.append(r3);
        goto L_0x0371;
    L_0x03c1:
        r0 = r7.append(r9);	 Catch:{ WDInvalidSQLException -> 0x03ef }
        r1 = 32;
        r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x03ef }
        if (r4 == 0) goto L_0x03dd;
    L_0x03cc:
        r0 = r13.xc;	 Catch:{ WDInvalidSQLException -> 0x03ef }
        r1 = 26;
        r0 = r0.mo3092a(r1);	 Catch:{ WDInvalidSQLException -> 0x03ef }
        r0 = r7.append(r0);	 Catch:{ WDInvalidSQLException -> 0x03ef }
        r1 = 32;
        r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x03ef }
    L_0x03dd:
        r0 = r13.xc;
        r0 = r0.mo3092a(r11);
        r0 = r7.append(r0);
        r0 = r0.append(r11);
        r0.append(r3);
        goto L_0x0371;
    L_0x03ef:
        r0 = move-exception;
        throw r0;
    L_0x03f1:
        if (r4 == r1) goto L_0x0401;
    L_0x03f3:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ WDInvalidSQLException -> 0x03ff }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x03ff }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x03ff }
        r0.<init>(r1);	 Catch:{ WDInvalidSQLException -> 0x03ff }
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x03ff }
    L_0x03ff:
        r0 = move-exception;
        throw r0;
    L_0x0401:
        r0 = r14.getElementAt(r2);
        r0 = r0.getCodeSQL(r13);
        if (r0 == 0) goto L_0x0438;
    L_0x040b:
        r1 = new java.lang.StringBuilder;	 Catch:{ WDInvalidSQLException -> 0x0436 }
        r1.<init>();	 Catch:{ WDInvalidSQLException -> 0x0436 }
        r2 = r13.xc;	 Catch:{ WDInvalidSQLException -> 0x0436 }
        r3 = 68;
        r2 = r2.mo3092a(r3);	 Catch:{ WDInvalidSQLException -> 0x0436 }
        r1 = r1.append(r2);	 Catch:{ WDInvalidSQLException -> 0x0436 }
        r2 = "(";
        r1 = r1.append(r2);	 Catch:{ WDInvalidSQLException -> 0x0436 }
        r0 = r1.append(r0);	 Catch:{ WDInvalidSQLException -> 0x0436 }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x0436 }
        r2 = 62;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x0436 }
        r0 = r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x0436 }
        r0 = r0.toString();	 Catch:{ WDInvalidSQLException -> 0x0436 }
        goto L_0x0119;
    L_0x0436:
        r0 = move-exception;
        throw r0;
    L_0x0438:
        r0 = r3;
        goto L_0x0119;
    L_0x043b:
        if (r4 == r1) goto L_0x044b;
    L_0x043d:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ WDInvalidSQLException -> 0x0449 }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x0449 }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x0449 }
        r0.<init>(r1);	 Catch:{ WDInvalidSQLException -> 0x0449 }
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x0449 }
    L_0x0449:
        r0 = move-exception;
        throw r0;
    L_0x044b:
        r0 = r14.getElementAt(r2);
        r0 = r0.getCodeSQL(r13);
        if (r0 == 0) goto L_0x048c;
    L_0x0455:
        r1 = new java.lang.StringBuilder;	 Catch:{ WDInvalidSQLException -> 0x048a }
        r1.<init>();	 Catch:{ WDInvalidSQLException -> 0x048a }
        r2 = "(";
        r1 = r1.append(r2);	 Catch:{ WDInvalidSQLException -> 0x048a }
        r0 = r1.append(r0);	 Catch:{ WDInvalidSQLException -> 0x048a }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x048a }
        r2 = 37;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x048a }
        r0 = r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x048a }
        r1 = r13.xc;	 Catch:{ WDInvalidSQLException -> 0x048a }
        r2 = 67;
        r1 = r1.mo3092a(r2);	 Catch:{ WDInvalidSQLException -> 0x048a }
        r0 = r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x048a }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x048a }
        r2 = 49;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x048a }
        r0 = r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x048a }
        r0 = r0.toString();	 Catch:{ WDInvalidSQLException -> 0x048a }
        goto L_0x0119;
    L_0x048a:
        r0 = move-exception;
        throw r0;
    L_0x048c:
        r0 = r3;
        goto L_0x0119;
    L_0x048f:
        if (r4 == r1) goto L_0x049f;
    L_0x0491:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ WDInvalidSQLException -> 0x049d }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x049d }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x049d }
        r0.<init>(r1);	 Catch:{ WDInvalidSQLException -> 0x049d }
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x049d }
    L_0x049d:
        r0 = move-exception;
        throw r0;
    L_0x049f:
        r0 = r14.getElementAt(r2);
        r0 = r0.getCodeSQL(r13);
        if (r0 == 0) goto L_0x04dc;
    L_0x04a9:
        r1 = new java.lang.StringBuilder;	 Catch:{ WDInvalidSQLException -> 0x04da }
        r1.<init>();	 Catch:{ WDInvalidSQLException -> 0x04da }
        r2 = "(";
        r1 = r1.append(r2);	 Catch:{ WDInvalidSQLException -> 0x04da }
        r0 = r1.append(r0);	 Catch:{ WDInvalidSQLException -> 0x04da }
        r1 = "*";
        r0 = r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x04da }
        r1 = r13.xc;	 Catch:{ WDInvalidSQLException -> 0x04da }
        r2 = 67;
        r1 = r1.mo3092a(r2);	 Catch:{ WDInvalidSQLException -> 0x04da }
        r0 = r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x04da }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x04da }
        r2 = 46;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x04da }
        r0 = r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x04da }
        r0 = r0.toString();	 Catch:{ WDInvalidSQLException -> 0x04da }
        goto L_0x0119;
    L_0x04da:
        r0 = move-exception;
        throw r0;
    L_0x04dc:
        r0 = r3;
        goto L_0x0119;
    L_0x04df:
        if (r4 == r1) goto L_0x04ef;
    L_0x04e1:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ WDInvalidSQLException -> 0x04ed }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x04ed }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x04ed }
        r0.<init>(r1);	 Catch:{ WDInvalidSQLException -> 0x04ed }
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x04ed }
    L_0x04ed:
        r0 = move-exception;
        throw r0;
    L_0x04ef:
        r0 = r14.getElementAt(r2);
        r0 = r0.getCodeSQL(r13);
        if (r0 == 0) goto L_0x051e;
    L_0x04f9:
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x051c }
        r2 = 56;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x051c }
        r2 = 2;
        r2 = new java.lang.String[r2];	 Catch:{ WDInvalidSQLException -> 0x051c }
        r3 = 0;
        r2[r3] = r0;	 Catch:{ WDInvalidSQLException -> 0x051c }
        r0 = 1;
        r3 = fr.pcsoft.wdjava.database.hf.requete.parsing.EWDOptionRequete.TYPE_CAST;	 Catch:{ WDInvalidSQLException -> 0x051c }
        r3 = r14.getOption(r3);	 Catch:{ WDInvalidSQLException -> 0x051c }
        r3 = fr.pcsoft.wdjava.core.C0725i.m3064d(r3);	 Catch:{ WDInvalidSQLException -> 0x051c }
        r3 = fr.pcsoft.wdjava.database.hf.C0855h.m5974c(r3);	 Catch:{ WDInvalidSQLException -> 0x051c }
        r2[r0] = r3;	 Catch:{ WDInvalidSQLException -> 0x051c }
        r0 = fr.pcsoft.wdjava.core.utils.C0808l.m4021a(r1, r2);	 Catch:{ WDInvalidSQLException -> 0x051c }
        goto L_0x0119;
    L_0x051c:
        r0 = move-exception;
        throw r0;
    L_0x051e:
        r0 = r3;
        goto L_0x0119;
    L_0x0521:
        if (r4 == r1) goto L_0x0531;
    L_0x0523:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ WDInvalidSQLException -> 0x052f }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x052f }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x052f }
        r0.<init>(r1);	 Catch:{ WDInvalidSQLException -> 0x052f }
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x052f }
    L_0x052f:
        r0 = move-exception;
        throw r0;
    L_0x0531:
        r0 = r14.getElementAt(r2);
        r1 = r0.getCodeSQL(r13);
        if (r1 == 0) goto L_0x0561;
    L_0x053b:
        r2 = 3;
        if (r6 != r2) goto L_0x055b;
    L_0x053e:
        r2 = r0.isNumerique();	 Catch:{ WDInvalidSQLException -> 0x0559 }
        if (r2 == 0) goto L_0x055b;
    L_0x0544:
        r0 = new java.lang.StringBuilder;	 Catch:{ WDInvalidSQLException -> 0x0559 }
        r0.<init>();	 Catch:{ WDInvalidSQLException -> 0x0559 }
        r2 = "-";
        r0 = r0.append(r2);	 Catch:{ WDInvalidSQLException -> 0x0559 }
        r0 = r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x0559 }
        r0 = r0.toString();	 Catch:{ WDInvalidSQLException -> 0x0559 }
        goto L_0x0119;
    L_0x0559:
        r0 = move-exception;
        throw r0;
    L_0x055b:
        r0 = r13.m6101a(r0, r1, r3);
        goto L_0x0119;
    L_0x0561:
        r0 = r3;
        goto L_0x0119;
    L_0x0564:
        r0 = r13.m6102a(r14, r1);
        goto L_0x0119;
    L_0x056a:
        r0 = r13.m6102a(r14, r5);
        goto L_0x0119;
    L_0x0570:
        r0 = 3;
        r0 = r13.m6102a(r14, r0);
        goto L_0x0119;
    L_0x0577:
        r0 = 3;
        if (r4 != r0) goto L_0x05ee;
    L_0x057a:
        r0 = r14.getElementAt(r2);
        r1 = r14.getElementAt(r1);
        r2 = r14.getElementAt(r5);
        r4 = r0.getCodeSQL(r13);
        r1 = r1.getCodeSQL(r13);
        r2 = r2.getCodeSQL(r13);
        r5 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r4);	 Catch:{ WDInvalidSQLException -> 0x05e7 }
        if (r5 != 0) goto L_0x05eb;
    L_0x0598:
        r5 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r1);	 Catch:{ WDInvalidSQLException -> 0x05e9 }
        if (r5 != 0) goto L_0x05eb;
    L_0x059e:
        r5 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r2);	 Catch:{ WDInvalidSQLException -> 0x05e9 }
        if (r5 != 0) goto L_0x05eb;
    L_0x05a4:
        r0 = r13.m6101a(r0, r4, r14);
        r3 = new java.lang.StringBuilder;
        r4 = r0.length();
        r5 = r1.length();
        r4 = r4 + r5;
        r2 = r2.length();
        r2 = r2 + r4;
        r2 = r2 + 6;
        r3.<init>(r2);
        r2 = r13.xc;
        r2 = r2.mo3092a(r6);
        r2 = r3.append(r2);
        r3 = "(";
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r2 = ",";
        r0 = r0.append(r2);
        r0 = r0.append(r1);
        r1 = ")";
        r0 = r0.append(r1);
        r0 = r0.toString();
        goto L_0x0119;
    L_0x05e7:
        r0 = move-exception;
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x05e9 }
    L_0x05e9:
        r0 = move-exception;
        throw r0;
    L_0x05eb:
        r0 = r3;
        goto L_0x0119;
    L_0x05ee:
        if (r4 == r5) goto L_0x05fe;
    L_0x05f0:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ WDInvalidSQLException -> 0x05fc }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x05fc }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x05fc }
        r0.<init>(r1);	 Catch:{ WDInvalidSQLException -> 0x05fc }
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x05fc }
    L_0x05fc:
        r0 = move-exception;
        throw r0;
    L_0x05fe:
        r2 = r14.getElementAt(r2);
        r4 = r14.getElementAt(r1);
        r1 = r2.getCodeSQL(r13);
        r0 = r4.getCodeSQL(r13);
        r5 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r1);	 Catch:{ WDInvalidSQLException -> 0x068a }
        if (r5 != 0) goto L_0x0693;
    L_0x0614:
        r5 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r0);	 Catch:{ WDInvalidSQLException -> 0x068a }
        if (r5 != 0) goto L_0x0693;
    L_0x061a:
        r3 = r13.xc;
        r3 = r3.mo3092a(r6);
        r5 = r14.isFonctionChaine();
        if (r5 == 0) goto L_0x0651;
    L_0x0626:
        r1 = r13.m6101a(r2, r1, r14);
        r2 = 42;
        if (r6 != r2) goto L_0x068e;
    L_0x062e:
        r2 = yc;	 Catch:{ WDInvalidSQLException -> 0x068c }
        r4 = 60;
        r2 = r2[r4];	 Catch:{ WDInvalidSQLException -> 0x068c }
        r2 = r3.startsWith(r2);	 Catch:{ WDInvalidSQLException -> 0x068c }
        if (r2 == 0) goto L_0x0651;
    L_0x063a:
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r4 = yc;
        r5 = 59;
        r4 = r4[r5];
        r2 = r2.append(r4);
        r0 = r2.append(r0);
        r0 = r0.toString();
    L_0x0651:
        r2 = new java.lang.StringBuilder;
        r4 = r3.length();
        r5 = r1.length();
        r4 = r4 + r5;
        r5 = r0.length();
        r4 = r4 + r5;
        r4 = r4 + 3;
        r2.<init>(r4);
        r2 = r2.append(r3);
        r3 = "(";
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r2 = ",";
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = ")";
        r0 = r0.append(r1);
        r0 = r0.toString();
        goto L_0x0119;
    L_0x068a:
        r0 = move-exception;
        throw r0;
    L_0x068c:
        r0 = move-exception;
        throw r0;
    L_0x068e:
        r0 = r13.m6101a(r4, r0, r14);
        goto L_0x0651;
    L_0x0693:
        r0 = r3;
        goto L_0x0119;
    L_0x0696:
        r0 = r13.xc;
        r0 = r0.mo3092a(r6);
        goto L_0x0119;
    L_0x069e:
        r0 = r13.xc;
        r0 = r0.mo3092a(r6);
        r1 = ")";
        r1 = r0.endsWith(r1);
        if (r1 != 0) goto L_0x0119;
    L_0x06ac:
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r0 = r1.append(r0);
        r1 = yc;
        r2 = 52;
        r1 = r1[r2];
        r0 = r0.append(r1);
        r0 = r0.toString();
        goto L_0x0119;
    L_0x06c5:
        if (r4 == r1) goto L_0x06fa;
    L_0x06c7:
        r0 = 31;
        if (r6 != r0) goto L_0x06ee;
    L_0x06cb:
        r0 = new java.lang.StringBuilder;	 Catch:{ WDInvalidSQLException -> 0x06ec }
        r0.<init>();	 Catch:{ WDInvalidSQLException -> 0x06ec }
        r1 = r13.xc;	 Catch:{ WDInvalidSQLException -> 0x06ec }
        r2 = 31;
        r1 = r1.mo3092a(r2);	 Catch:{ WDInvalidSQLException -> 0x06ec }
        r0 = r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x06ec }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x06ec }
        r2 = 51;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x06ec }
        r0 = r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x06ec }
        r0 = r0.toString();	 Catch:{ WDInvalidSQLException -> 0x06ec }
        goto L_0x0119;
    L_0x06ec:
        r0 = move-exception;
        throw r0;
    L_0x06ee:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;
        r1 = yc;
        r2 = 58;
        r1 = r1[r2];
        r0.<init>(r1);
        throw r0;
    L_0x06fa:
        r1 = r14.getElementAt(r2);
        r0 = r1.getCodeSQL(r13);
        if (r0 == 0) goto L_0x0740;
    L_0x0704:
        r2 = r14.isFonctionChaine();	 Catch:{ WDInvalidSQLException -> 0x073e }
        if (r2 == 0) goto L_0x070e;
    L_0x070a:
        r0 = r13.m6101a(r1, r0, r14);
    L_0x070e:
        r1 = r13.xc;
        r1 = r1.mo3092a(r6);
        r2 = new java.lang.StringBuilder;
        r3 = r1.length();
        r4 = r0.length();
        r3 = r3 + r4;
        r3 = r3 + 2;
        r2.<init>(r3);
        r1 = r2.append(r1);
        r2 = "(";
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = ")";
        r0 = r0.append(r1);
        r0 = r0.toString();
        goto L_0x0119;
    L_0x073e:
        r0 = move-exception;
        throw r0;
    L_0x0740:
        r0 = r3;
        goto L_0x0119;
    L_0x0743:
        if (r4 < r1) goto L_0x0747;
    L_0x0745:
        if (r4 <= r5) goto L_0x0755;
    L_0x0747:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ WDInvalidSQLException -> 0x0753 }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x0753 }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x0753 }
        r0.<init>(r1);	 Catch:{ WDInvalidSQLException -> 0x0753 }
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x0753 }
    L_0x0753:
        r0 = move-exception;
        throw r0;
    L_0x0755:
        if (r4 != r1) goto L_0x0760;
    L_0x0757:
        r0 = 1;
        r0 = r13.m6102a(r14, r0);	 Catch:{ WDInvalidSQLException -> 0x075e }
        goto L_0x0119;
    L_0x075e:
        r0 = move-exception;
        throw r0;
    L_0x0760:
        r14.getExpression();
        r0 = r14.getElementAt(r2);
        r4 = r0.getCodeSQL(r13);
        r1 = r14.getElementAt(r1);
        r5 = r1.getCodeSQL(r13);
        if (r4 != 0) goto L_0x0778;
    L_0x0775:
        r0 = r3;
        goto L_0x0119;
    L_0x0778:
        r0 = r13.m6101a(r1, r5, r0);
        r1 = r13.xc;
        r3 = r14.getTypeOperateurOuFonction();
        r1 = r1.mo3092a(r3);
        r1 = r7.append(r1);
        r3 = 40;
        r1 = r1.append(r3);
        r1 = r1.append(r4);
        r3 = yc;
        r2 = r3[r2];
        r1 = r1.append(r2);
        r0 = r1.append(r0);
        r1 = 41;
        r0.append(r1);
        r0 = r7.toString();
        goto L_0x0119;
    L_0x07ab:
        if (r4 == r1) goto L_0x07bb;
    L_0x07ad:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ WDInvalidSQLException -> 0x07b9 }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x07b9 }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x07b9 }
        r0.<init>(r1);	 Catch:{ WDInvalidSQLException -> 0x07b9 }
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x07b9 }
    L_0x07b9:
        r0 = move-exception;
        throw r0;
    L_0x07bb:
        r0 = r14.getElementAt(r2);
        r0 = r0.getCodeSQL(r13);
        if (r0 == 0) goto L_0x080a;
    L_0x07c5:
        r0 = r7.append(r0);
        r3 = yc;
        r4 = 40;
        r3 = r3[r4];
        r0.append(r3);
        r0 = fr.pcsoft.wdjava.database.hf.requete.parsing.EWDOptionRequete.NOT_NULL;
        r0 = r14.getOption(r0);
        if (r0 == 0) goto L_0x0806;
    L_0x07da:
        r0 = fr.pcsoft.wdjava.core.C0725i.m3072e(r0);	 Catch:{ WDInvalidSQLException -> 0x0804 }
        if (r0 == 0) goto L_0x0806;
    L_0x07e0:
        if (r1 == 0) goto L_0x07f3;
    L_0x07e2:
        r0 = r13.xc;	 Catch:{ WDInvalidSQLException -> 0x0808 }
        r1 = 26;
        r0 = r0.mo3092a(r1);	 Catch:{ WDInvalidSQLException -> 0x0808 }
        r0 = r7.append(r0);	 Catch:{ WDInvalidSQLException -> 0x0808 }
        r1 = 32;
        r0.append(r1);	 Catch:{ WDInvalidSQLException -> 0x0808 }
    L_0x07f3:
        r0 = r13.xc;
        r1 = 33;
        r0 = r0.mo3092a(r1);
        r7.append(r0);
        r0 = r7.toString();
        goto L_0x0119;
    L_0x0804:
        r0 = move-exception;
        throw r0;
    L_0x0806:
        r1 = r2;
        goto L_0x07e0;
    L_0x0808:
        r0 = move-exception;
        throw r0;
    L_0x080a:
        r0 = r3;
        goto L_0x0119;
    L_0x080d:
        r0 = 3;
        if (r4 >= r0) goto L_0x081e;
    L_0x0810:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ WDInvalidSQLException -> 0x081c }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x081c }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x081c }
        r0.<init>(r1);	 Catch:{ WDInvalidSQLException -> 0x081c }
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x081c }
    L_0x081c:
        r0 = move-exception;
        throw r0;
    L_0x081e:
        r5 = new java.lang.StringBuilder;
        r0 = yc;
        r6 = 36;
        r0 = r0[r6];
        r5.<init>(r0);
        r2 = r14.getElementAt(r2);
        r0 = r2.getCodeSQL(r13);
        if (r0 == 0) goto L_0x08a5;
    L_0x0833:
        r3 = r5.append(r11);
        r3.append(r0);
        r0 = r1;
    L_0x083b:
        r1 = r4 + -1;
        if (r0 >= r1) goto L_0x0878;
    L_0x083f:
        r1 = yc;
        r3 = 42;
        r1 = r1[r3];
        r5.append(r1);
        r1 = r14.getElementAt(r0);
        r3 = r1.getCodeSQL(r13);
        if (r3 == 0) goto L_0x0875;
    L_0x0852:
        r1 = r13.m6101a(r1, r3, r2);
        r5.append(r1);
        r0 = r0 + 1;
        r1 = r14.getElementAt(r0);
        r3 = r1.getCodeSQL(r13);
        if (r3 == 0) goto L_0x0875;
    L_0x0865:
        r1 = r13.m6101a(r1, r3, r2);
        r3 = yc;
        r6 = 64;
        r3 = r3[r6];
        r5.append(r3);
        r5.append(r1);
    L_0x0875:
        r0 = r0 + 1;
        goto L_0x083b;
    L_0x0878:
        r1 = r4 + -1;
        if (r0 != r1) goto L_0x0896;
    L_0x087c:
        r0 = r14.getElementAt(r0);
        r1 = r0.getCodeSQL(r13);
        if (r1 == 0) goto L_0x0896;
    L_0x0886:
        r0 = r13.m6101a(r0, r1, r2);
        r1 = yc;
        r2 = 65;
        r1 = r1[r2];
        r5.append(r1);
        r5.append(r0);
    L_0x0896:
        r0 = yc;
        r1 = 55;
        r0 = r0[r1];
        r5.append(r0);
        r0 = r5.toString();
        goto L_0x0119;
    L_0x08a5:
        r0 = r3;
        goto L_0x0119;
    L_0x08a8:
        if (r4 >= r5) goto L_0x08b8;
    L_0x08aa:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ WDInvalidSQLException -> 0x08b6 }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x08b6 }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x08b6 }
        r0.<init>(r1);	 Catch:{ WDInvalidSQLException -> 0x08b6 }
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x08b6 }
    L_0x08b6:
        r0 = move-exception;
        throw r0;
    L_0x08b8:
        r5 = new java.lang.StringBuilder;
        r0 = yc;
        r1 = 36;
        r0 = r0[r1];
        r5.<init>(r0);
        r6 = r4 / 2;
        r0 = r2;
    L_0x08c6:
        if (r2 >= r6) goto L_0x0903;
    L_0x08c8:
        r1 = r0 + 1;
        r0 = r14.getElementAt(r0);
        r7 = r0.getCodeSQL(r13);
        if (r7 == 0) goto L_0x0abc;
    L_0x08d4:
        r8 = yc;
        r9 = 42;
        r8 = r8[r9];
        r5.append(r8);
        r0 = r13.m6101a(r0, r7, r3);
        r5.append(r0);
        r0 = r1 + 1;
        r1 = r14.getElementAt(r1);
        r7 = r1.getCodeSQL(r13);
        if (r7 == 0) goto L_0x0900;
    L_0x08f0:
        r1 = r13.m6101a(r1, r7, r3);
        r7 = yc;
        r8 = 64;
        r7 = r7[r8];
        r5.append(r7);
        r5.append(r1);
    L_0x0900:
        r2 = r2 + 1;
        goto L_0x08c6;
    L_0x0903:
        r1 = r4 + -1;
        if (r0 != r1) goto L_0x0923;
    L_0x0907:
        r1 = r0 + 1;
        r0 = r14.getElementAt(r0);
        r1 = r0.getCodeSQL(r13);
        if (r1 == 0) goto L_0x0923;
    L_0x0913:
        r0 = r13.m6101a(r0, r1, r3);
        r1 = yc;
        r2 = 65;
        r1 = r1[r2];
        r5.append(r1);
        r5.append(r0);
    L_0x0923:
        r0 = yc;
        r1 = 55;
        r0 = r0[r1];
        r5.append(r0);
        r0 = r5.toString();
        goto L_0x0119;
    L_0x0932:
        if (r4 >= r5) goto L_0x0942;
    L_0x0934:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ WDInvalidSQLException -> 0x0940 }
        r1 = yc;	 Catch:{ WDInvalidSQLException -> 0x0940 }
        r2 = 58;
        r1 = r1[r2];	 Catch:{ WDInvalidSQLException -> 0x0940 }
        r0.<init>(r1);	 Catch:{ WDInvalidSQLException -> 0x0940 }
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x0940 }
    L_0x0940:
        r0 = move-exception;
        throw r0;
    L_0x0942:
        r1 = new java.lang.StringBuilder;
        r0 = yc;
        r5 = 54;
        r0 = r0[r5];
        r1.<init>(r0);
        r0 = r2;
    L_0x094e:
        r5 = r4 + -1;
        if (r2 >= r5) goto L_0x0972;
    L_0x0952:
        if (r0 <= 0) goto L_0x095c;
    L_0x0954:
        r5 = yc;	 Catch:{ WDInvalidSQLException -> 0x096e }
        r6 = 0;
        r5 = r5[r6];	 Catch:{ WDInvalidSQLException -> 0x096e }
        r1.append(r5);	 Catch:{ WDInvalidSQLException -> 0x096e }
    L_0x095c:
        r5 = r14.getElementAt(r2);
        r5 = r5.getCodeSQL(r13);
        if (r5 == 0) goto L_0x096b;
    L_0x0966:
        r1.append(r5);	 Catch:{ WDInvalidSQLException -> 0x0970 }
        r0 = r0 + 1;
    L_0x096b:
        r2 = r2 + 1;
        goto L_0x094e;
    L_0x096e:
        r0 = move-exception;
        throw r0;
    L_0x0970:
        r0 = move-exception;
        throw r0;
    L_0x0972:
        if (r0 <= 0) goto L_0x09bd;
    L_0x0974:
        r0 = yc;
        r2 = 44;
        r0 = r0[r2];
        r1.append(r0);
        r0 = fr.pcsoft.wdjava.database.hf.requete.parsing.EWDOptionRequete.MATCH_AGAINST_ALL;
        r0 = r14.getOption(r0);
        if (r0 == 0) goto L_0x0994;
    L_0x0985:
        r0 = fr.pcsoft.wdjava.core.C0725i.m3072e(r0);	 Catch:{ WDInvalidSQLException -> 0x09b9 }
        if (r0 == 0) goto L_0x0994;
    L_0x098b:
        r0 = yc;	 Catch:{ WDInvalidSQLException -> 0x09b9 }
        r2 = 39;
        r0 = r0[r2];	 Catch:{ WDInvalidSQLException -> 0x09b9 }
        r1.append(r0);	 Catch:{ WDInvalidSQLException -> 0x09b9 }
    L_0x0994:
        r0 = r4 + -1;
        r0 = r14.getElementAt(r0);
        r2 = r0.getCodeSQL(r13);
        if (r2 == 0) goto L_0x09bd;
    L_0x09a0:
        r3 = "(";
        r3 = r1.append(r3);	 Catch:{ WDInvalidSQLException -> 0x09bb }
        r0 = r13.m6101a(r0, r2, r14);	 Catch:{ WDInvalidSQLException -> 0x09bb }
        r0 = r3.append(r0);	 Catch:{ WDInvalidSQLException -> 0x09bb }
        r2 = ")";
        r0.append(r2);	 Catch:{ WDInvalidSQLException -> 0x09bb }
        r0 = r1.toString();	 Catch:{ WDInvalidSQLException -> 0x09bb }
        goto L_0x0119;
    L_0x09b9:
        r0 = move-exception;
        throw r0;
    L_0x09bb:
        r0 = move-exception;
        throw r0;
    L_0x09bd:
        r0 = r3;
        goto L_0x0119;
    L_0x09c0:
        r0 = r14.getExpression();
        goto L_0x0119;
    L_0x09c6:
        r0 = move-exception;
        throw r0;
    L_0x09c8:
        r0 = move-exception;
        throw r0;	 Catch:{ WDInvalidSQLException -> 0x0050 }
    L_0x09ca:
        r0 = r14.getElementAt(r2);
        r2 = r0.getCodeSQL(r13);
        r1 = r14.getElementAt(r1);
        r4 = r1.getCodeSQL(r13);
        if (r2 == 0) goto L_0x09de;
    L_0x09dc:
        if (r4 != 0) goto L_0x09e1;
    L_0x09de:
        r0 = r3;
        goto L_0x0119;
    L_0x09e1:
        r2 = r13.m6101a(r0, r2, r1);
        r0 = r13.m6101a(r1, r4, r0);
        r1 = r7.append(r2);
        r2 = " ";
        r1 = r1.append(r2);
        r2 = r14.getOperateurOuFonction();
        r1 = r1.append(r2);
        r2 = " ";
        r1 = r1.append(r2);
        r1.append(r0);
        r0 = r7.toString();
        goto L_0x0119;
    L_0x0a0a:
        if (r6 != 0) goto L_0x0a68;
    L_0x0a0c:
        if (r4 != r5) goto L_0x0a68;
    L_0x0a0e:
        r0 = r14.getElementAt(r2);
        r5 = r14.getElementAt(r1);
        r6 = r0.isNumerique();	 Catch:{ WDInvalidSQLException -> 0x0a31 }
        if (r6 == 0) goto L_0x0a22;
    L_0x0a1c:
        r6 = r5.isNumerique();	 Catch:{ WDInvalidSQLException -> 0x0a31 }
        if (r6 != 0) goto L_0x0a68;
    L_0x0a22:
        r1 = r0.getCodeSQL(r13);
        r2 = r5.getCodeSQL(r13);
        if (r1 == 0) goto L_0x0a2e;
    L_0x0a2c:
        if (r2 != 0) goto L_0x0a33;
    L_0x0a2e:
        r0 = r3;
        goto L_0x0119;
    L_0x0a31:
        r0 = move-exception;
        throw r0;
    L_0x0a33:
        r0 = r13.m6101a(r0, r1, r14);
        r1 = r13.m6101a(r5, r2, r14);
        r2 = new java.lang.StringBuilder;
        r3 = r13.xc;
        r4 = 88;
        r3 = r3.mo3092a(r4);
        r2.<init>(r3);
        r3 = 40;
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r2 = 44;
        r0 = r0.append(r2);
        r0 = r0.append(r1);
        r1 = 41;
        r0 = r0.append(r1);
        r0 = r0.toString();
        goto L_0x0119;
    L_0x0a68:
        r0 = r2;
    L_0x0a69:
        if (r2 >= r4) goto L_0x0ab6;
    L_0x0a6b:
        r5 = r14.getElementAt(r2);
        r5 = r5.getCodeSQL(r13);
        if (r5 != 0) goto L_0x0a7c;
    L_0x0a75:
        if (r2 != r1) goto L_0x0aa1;
    L_0x0a77:
        if (r0 != 0) goto L_0x0aa1;
    L_0x0a79:
        r0 = r3;
        goto L_0x0119;
    L_0x0a7c:
        if (r0 <= 0) goto L_0x0aa6;
    L_0x0a7e:
        r6 = 32;
        r6 = r7.append(r6);	 Catch:{ WDInvalidSQLException -> 0x0aa4 }
        r8 = r14.getOperateurOuFonction();	 Catch:{ WDInvalidSQLException -> 0x0aa4 }
        r6 = r6.append(r8);	 Catch:{ WDInvalidSQLException -> 0x0aa4 }
        r8 = yc;	 Catch:{ WDInvalidSQLException -> 0x0aa4 }
        r9 = 41;
        r8 = r8[r9];	 Catch:{ WDInvalidSQLException -> 0x0aa4 }
        r6 = r6.append(r8);	 Catch:{ WDInvalidSQLException -> 0x0aa4 }
        r5 = r6.append(r5);	 Catch:{ WDInvalidSQLException -> 0x0aa4 }
        r6 = ")";
        r5.append(r6);	 Catch:{ WDInvalidSQLException -> 0x0aa4 }
    L_0x0a9f:
        r0 = r0 + 1;
    L_0x0aa1:
        r2 = r2 + 1;
        goto L_0x0a69;
    L_0x0aa4:
        r0 = move-exception;
        throw r0;
    L_0x0aa6:
        r6 = "(";
        r6 = r7.append(r6);
        r5 = r6.append(r5);
        r6 = ")";
        r5.append(r6);
        goto L_0x0a9f;
    L_0x0ab6:
        r0 = r7.toString();
        goto L_0x0119;
    L_0x0abc:
        r0 = r1;
        goto L_0x0900;
    L_0x0abf:
        r0 = r4;
        goto L_0x0321;
    L_0x0ac2:
        r3 = r1;
        goto L_0x0313;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.requete.parsing.b.a(fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR$Expression):java.lang.String");
    }

    /* renamed from: a */
    public final String m6112a(Fichier fichier) {
        String nom = fichier.getNom();
        db o = WDHF_Contexte.getInstance().m5034o(nom);
        nom = o != null ? this.xc.mo3108c() ? o.mo2741a(true, this.xc) : o.mo2719a() : this.xc.mo3174a(nom);
        String alias = fichier.getAlias();
        return !C0808l.m4053k(alias) ? (alias.equals(fichier.getNom()) && this.uc != null && ((this.uc instanceof Delete) || (this.uc instanceof Insert) || (this.uc instanceof Update))) ? nom : nom + yc[7] + this.xc.mo3174a(alias) : nom;
    }

    /* renamed from: a */
    public final String m6113a(From from) throws WDInvalidSQLException {
        int i = 0;
        m6127a((Clause) from);
        StringBuilder stringBuilder = new StringBuilder(yc[5]);
        int nbElement = from.getNbElement();
        if (nbElement == 0) {
            try {
                throw new WDInvalidSQLException(yc[4]);
            } catch (WDInvalidSQLException e) {
                throw e;
            }
        }
        for (int i2 = 0; i2 < nbElement; i2++) {
            String codeSQL = from.getElementAt(i2).getCodeSQL(this);
            if (codeSQL != null) {
                if (i > 0) {
                    try {
                        stringBuilder.append(yc[0]);
                    } catch (WDInvalidSQLException e2) {
                        throw e2;
                    }
                }
                stringBuilder.append(codeSQL);
                i++;
            } else {
                C0691a.m2856a(yc[3]);
            }
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final String m6114a(GroupBy groupBy) throws WDInvalidSQLException {
        int i = 0;
        m6127a((Clause) groupBy);
        StringBuilder stringBuilder = new StringBuilder();
        int nbElement = groupBy.getNbElement();
        if (nbElement == 0) {
            try {
                throw new WDInvalidSQLException(yc[1]);
            } catch (WDInvalidSQLException e) {
                throw e;
            }
        }
        for (int i2 = 0; i2 < nbElement; i2++) {
            String codeSQL = groupBy.getElementAt(i2).getCodeSQL(this);
            if (codeSQL != null) {
                if (i > 0) {
                    try {
                        stringBuilder.append(yc[0]);
                    } catch (WDInvalidSQLException e2) {
                        throw e2;
                    }
                }
                stringBuilder.append(codeSQL);
                i++;
            } else {
                C0691a.m2856a(yc[3]);
            }
        }
        if (i > 0) {
            try {
                stringBuilder.insert(0, yc[2]);
            } catch (WDInvalidSQLException e22) {
                throw e22;
            }
        }
        try {
            return stringBuilder.length() > 0 ? stringBuilder.toString() : null;
        } catch (WDInvalidSQLException e222) {
            throw e222;
        }
    }

    /* renamed from: a */
    public final String m6115a(Having having) throws WDInvalidSQLException {
        try {
            m6127a((Clause) having);
            if (having.getNbElement() != 1) {
                throw new WDInvalidSQLException(yc[26]);
            }
            String codeSQL = having.getElementAt(0).getCodeSQL(this);
            try {
                return !C0808l.m4053k(codeSQL) ? yc[25] + codeSQL : null;
            } catch (WDInvalidSQLException e) {
                throw e;
            }
        } catch (WDInvalidSQLException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public final String m6116a(Insert insert) throws WDInvalidSQLException {
        m6127a((Clause) insert);
        StringBuilder stringBuilder = new StringBuilder(yc[28]);
        try {
            if (insert.getNbElement() != 1) {
                throw new WDInvalidSQLException(yc[27]);
            }
            stringBuilder.append(insert.getElementAt(0).getCodeSQL(this));
            return stringBuilder.toString();
        } catch (WDInvalidSQLException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public final String m6117a(Jointure jointure) throws WDInvalidSQLException {
        StringBuilder stringBuilder = new StringBuilder();
        String codeSQL = jointure.getPartieDroite().getCodeSQL(this);
        String codeSQL2 = jointure.getPartieGauche().getCodeSQL(this);
        if (!jointure.isTableDroite()) {
            codeSQL = '(' + codeSQL + ')';
        }
        if (!jointure.isTableGauche()) {
            codeSQL2 = '(' + codeSQL2 + ')';
        }
        try {
            stringBuilder.append(codeSQL2).append(' ');
            switch (jointure.getType()) {
                case 0:
                    break;
                case 1:
                    stringBuilder.append(yc[77]);
                    break;
                case 2:
                    stringBuilder.append(yc[80]);
                    break;
                case 3:
                    stringBuilder.append(yc[82]);
                    break;
                default:
                    C0691a.m2856a(yc[81]);
                    break;
            }
            stringBuilder.append(yc[78]);
            stringBuilder.append(codeSQL);
            if (jointure.getConditionON() != null) {
                codeSQL = jointure.getConditionON().getCodeSQL(this);
                if (codeSQL != null) {
                    try {
                        stringBuilder.append(yc[79]).append(codeSQL);
                    } catch (WDInvalidSQLException e) {
                        throw e;
                    }
                }
            }
            return stringBuilder.toString();
        } catch (WDInvalidSQLException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public String mo3180a(Limit limit) throws WDInvalidSQLException {
        String str = null;
        m6127a((Clause) limit);
        int type = limit.getType();
        switch (type) {
            case 0:
                return null;
            case 1:
            case 3:
            case 4:
                String codeSQL;
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
                if (type == 3 || type == 4) {
                    Parametre paramOffset = limit.getParamOffset();
                    str = paramOffset != null ? paramOffset.getCodeSQL(this) : String.valueOf(limit.getOffset());
                }
                try {
                    return !C0808l.m4053k(str) ? yc[17] + str + "," + codeSQL : yc[17] + codeSQL;
                } catch (WDInvalidSQLException e2) {
                    throw e2;
                }
            default:
                throw new WDInvalidSQLException(yc[16]);
        }
    }

    /* renamed from: a */
    public final String m6119a(OrderBy orderBy) throws WDInvalidSQLException {
        m6127a((Clause) orderBy);
        Limit limit = (Limit) this.sc.getClause(Limit.class);
        StringBuilder stringBuilder = new StringBuilder("");
        int nbElement = orderBy.getNbElement();
        if (nbElement == 0) {
            try {
                throw new WDInvalidSQLException(yc[74]);
            } catch (WDInvalidSQLException e) {
                throw e;
            }
        }
        int i = 0;
        int i2 = 0;
        while (i < nbElement) {
            int i3;
            Element elementAt = orderBy.getElementAt(i);
            String codeSQL = elementAt.getCodeSQL(this);
            if (codeSQL != null) {
                if (i2 > 0) {
                    try {
                        stringBuilder.append(yc[0]);
                    } catch (WDInvalidSQLException e2) {
                        throw e2;
                    }
                }
                stringBuilder.append(codeSQL);
                codeSQL = codeSQL.trim();
                try {
                    if (!codeSQL.endsWith(yc[72])) {
                        if (!codeSQL.endsWith(yc[70])) {
                            try {
                                if (!(codeSQL.endsWith(yc[69]) || codeSQL.endsWith(yc[73]))) {
                                    String option = elementAt.getOption(EWDOptionRequete.TRI);
                                    try {
                                        if (!C0808l.m4053k(option)) {
                                            switch (C0725i.m3064d(option)) {
                                                case 0:
                                                    if (limit != null) {
                                                        if (limit.getType() == 2) {
                                                            option = yc[69];
                                                            stringBuilder.append(option);
                                                            break;
                                                        }
                                                    }
                                                    option = yc[72];
                                                    stringBuilder.append(option);
                                                case 1:
                                                    if (limit != null) {
                                                        try {
                                                            if (limit.getType() == 2) {
                                                                option = yc[72];
                                                                stringBuilder.append(option);
                                                                break;
                                                            }
                                                        } catch (WDInvalidSQLException e22) {
                                                            throw e22;
                                                        }
                                                    }
                                                    option = yc[69];
                                                    stringBuilder.append(option);
                                                default:
                                                    C0691a.m2856a(yc[71]);
                                                    break;
                                            }
                                        }
                                    } catch (WDInvalidSQLException e222) {
                                        throw e222;
                                    } catch (WDInvalidSQLException e2222) {
                                        try {
                                            throw e2222;
                                        } catch (WDInvalidSQLException e22222) {
                                            try {
                                                throw e22222;
                                            } catch (WDInvalidSQLException e222222) {
                                                throw e222222;
                                            }
                                        }
                                    }
                                }
                            } catch (WDInvalidSQLException e2222222) {
                                throw e2222222;
                            }
                        }
                    }
                    i3 = i2 + 1;
                } catch (WDInvalidSQLException e22222222) {
                    throw e22222222;
                } catch (WDInvalidSQLException e222222222) {
                    throw e222222222;
                }
            } else {
                C0691a.m2856a(yc[3]);
                i3 = i2;
            }
            i++;
            i2 = i3;
        }
        if (i2 > 0) {
            try {
                stringBuilder.insert(0, yc[68]);
            } catch (WDInvalidSQLException e2222222222) {
                throw e2222222222;
            }
        }
        try {
            return stringBuilder.length() > 0 ? stringBuilder.toString() : null;
        } catch (WDInvalidSQLException e22222222222) {
            throw e22222222222;
        }
    }

    /* renamed from: a */
    public final String m6120a(Parametre parametre) throws WDInvalidSQLException {
        try {
            if (this.vc == null) {
                C0691a.m2856a(yc[9]);
                return null;
            }
            String nom = parametre.getNom();
            C0691a.m2860a(this.vc.containsKey(nom), yc[12]);
            WDObjet wDObjet = (WDObjet) this.vc.get(nom);
            if (wDObjet != null) {
                try {
                    if (!wDObjet.isValeurNull()) {
                        if (!wDObjet.isMemoBinaire() || !(this.xc instanceof C0858k)) {
                            return wDObjet.getString();
                        }
                        return new StringBuilder(tc).append(yc[10]).append(C0725i.m3052b(wDObjet.getDonneeBinaire())).append(yc[11]).toString();
                    }
                } catch (WDInvalidSQLException e) {
                    throw e;
                } catch (WDInvalidSQLException e2) {
                    throw e2;
                }
            }
            return null;
        } catch (WDInvalidSQLException e22) {
            throw e22;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public final java.lang.String m6121a(fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.Requete r5, java.util.Map<java.lang.String, fr.pcsoft.wdjava.core.WDObjet> r6) throws fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException {
        /*
        r4 = this;
        if (r6 == 0) goto L_0x0004;
    L_0x0002:
        r4.vc = r6;	 Catch:{ WDInvalidSQLException -> 0x0022 }
    L_0x0004:
        r1 = r4.m6109a();
        r4.m6130b(r5);	 Catch:{ all -> 0x001d }
        r0 = r5.getType();	 Catch:{ all -> 0x001d }
        switch(r0) {
            case 1: goto L_0x0024;
            case 2: goto L_0x0024;
            case 3: goto L_0x002c;
            case 4: goto L_0x0034;
            case 5: goto L_0x003c;
            default: goto L_0x0012;
        };	 Catch:{ all -> 0x001d }
    L_0x0012:
        r0 = new fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;	 Catch:{ all -> 0x001d }
        r2 = yc;	 Catch:{ all -> 0x001d }
        r3 = 6;
        r2 = r2[r3];	 Catch:{ all -> 0x001d }
        r0.<init>(r2);	 Catch:{ all -> 0x001d }
        throw r0;	 Catch:{ all -> 0x001d }
    L_0x001d:
        r0 = move-exception;
        r4.m6130b(r1);
        throw r0;
    L_0x0022:
        r0 = move-exception;
        throw r0;
    L_0x0024:
        r0 = r4.m6106e(r5);	 Catch:{ all -> 0x001d }
        r4.m6130b(r1);
    L_0x002b:
        return r0;
    L_0x002c:
        r0 = r4.m6105d(r5);	 Catch:{ all -> 0x001d }
        r4.m6130b(r1);
        goto L_0x002b;
    L_0x0034:
        r0 = r4.m6104c(r5);	 Catch:{ all -> 0x001d }
        r4.m6130b(r1);
        goto L_0x002b;
    L_0x003c:
        r0 = r4.m6103a(r5);	 Catch:{ all -> 0x001d }
        r4.m6130b(r1);
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.requete.parsing.b.a(fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR$Requete, java.util.Map):java.lang.String");
    }

    /* renamed from: a */
    public final String m6122a(Rubrique rubrique) {
        StringBuilder stringBuilder = new StringBuilder("");
        Clause d = m6132d();
        String option;
        if (d == null || !(d instanceof OrderBy)) {
            String nom = rubrique.getNom();
            if (nom.indexOf(46) >= 0) {
                String[] a = C0808l.m4029a(nom, ".");
                C0691a.m2860a(a.length == 2, yc[32]);
                nom = a[1];
            }
            if (d == null || !((d instanceof Insert) || (d instanceof Set))) {
                db e = WDHF_Contexte.getInstance().m5015e(rubrique.getNomFichier());
                eb ebVar = null;
                if (e != null) {
                    ebVar = (eb) e.mo2721b(nom);
                    if (ebVar != null) {
                        nom = ebVar.mo3137b();
                    }
                }
                String aliasFichier = rubrique.getAliasFichier();
                if (C0808l.m4053k(aliasFichier)) {
                    if (e != null) {
                        stringBuilder.append(this.xc.mo3108c() ? e.mo2741a(true, this.xc) : e.mo2719a()).append('.').append(this.xc.mo3174a(nom));
                    } else {
                        stringBuilder.append(this.xc.mo3174a(nom));
                    }
                } else if (ebVar != null) {
                    stringBuilder.append(this.xc.mo3174a(aliasFichier)).append('.').append(this.xc.mo3174a(nom));
                } else {
                    stringBuilder.append(this.xc.mo3174a(nom));
                }
            } else {
                stringBuilder.append(this.xc.mo3174a(nom));
            }
            option = rubrique.getOption(EWDOptionRequete.SELECT);
            if (!C0808l.m4053k(option)) {
                switch (C0725i.m3064d(option)) {
                    case 0:
                        stringBuilder.insert(0, yc[19]);
                        break;
                    case 1:
                        stringBuilder.insert(0, yc[33]);
                        break;
                    default:
                        C0691a.m2856a(yc[34]);
                        break;
                }
            }
            return stringBuilder.toString();
        }
        option = rubrique.getOption(EWDOptionRequete.INDEX_RUB);
        if (C0808l.m4053k(option)) {
            stringBuilder.append(this.xc.mo3174a(rubrique.getAlias()));
        } else {
            stringBuilder.append(C0725i.m3064d(option) + 1);
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final String m6123a(Select select) throws WDInvalidSQLException {
        m6127a((Clause) select);
        StringBuilder stringBuilder = new StringBuilder(yc[21]);
        try {
            if (select.getType() == 0) {
                stringBuilder.append(yc[19]);
            }
            try {
                String codeSQL;
                Limit limit = this.sc != null ? (Limit) this.sc.getClause(Limit.class) : null;
                if (limit != null) {
                    codeSQL = limit.getCodeSQL(this);
                    if (codeSQL != null) {
                        try {
                            if (codeSQL.trim().startsWith(yc[22])) {
                                stringBuilder.append(codeSQL).append(' ');
                            }
                        } catch (WDInvalidSQLException e) {
                            throw e;
                        }
                    }
                }
                int nbElement = select.getNbElement();
                if (nbElement == 0) {
                    try {
                        throw new WDInvalidSQLException(yc[20]);
                    } catch (WDInvalidSQLException e2) {
                        throw e2;
                    }
                }
                int i = 0;
                int i2 = 0;
                while (i < nbElement) {
                    int i3;
                    Element elementAt = select.getElementAt(i);
                    String codeSQL2 = elementAt.getCodeSQL(this);
                    if (codeSQL2 != null) {
                        if (i2 > 0) {
                            try {
                                stringBuilder.append(yc[0]);
                            } catch (WDInvalidSQLException e22) {
                                throw e22;
                            }
                        }
                        try {
                            codeSQL = (!(elementAt instanceof Literal) || ((Literal) elementAt).isNumerique()) ? codeSQL2 : this.xc.m5295a(codeSQL2, 0);
                            stringBuilder.append(codeSQL);
                            codeSQL = elementAt.getAlias();
                            try {
                                if (!C0808l.m4053k(codeSQL)) {
                                    stringBuilder.append(yc[7]).append(this.xc.mo3174a(codeSQL));
                                }
                                i3 = i2 + 1;
                            } catch (WDInvalidSQLException e222) {
                                throw e222;
                            }
                        } catch (WDInvalidSQLException e2222) {
                            throw e2222;
                        }
                    }
                    C0691a.m2856a(yc[3]);
                    i3 = i2;
                    i++;
                    i2 = i3;
                }
                return stringBuilder.toString();
            } catch (WDInvalidSQLException e22222) {
                throw e22222;
            }
        } catch (WDInvalidSQLException e222222) {
            throw e222222;
        }
    }

    /* renamed from: a */
    public final String m6124a(Set set) throws WDInvalidSQLException {
        int i = 0;
        m6127a((Clause) set);
        StringBuilder stringBuilder = new StringBuilder("");
        int nbElement = set.getNbElement();
        try {
            if (nbElement % 2 != 0) {
                throw new WDInvalidSQLException(yc[31]);
            }
            int i2 = 0;
            while (i2 < nbElement) {
                Element elementAt = set.getElementAt(i2);
                i2++;
                Element elementAt2 = set.getElementAt(i2);
                String codeSQL = elementAt.getCodeSQL(this);
                String codeSQL2 = elementAt2.getCodeSQL(this);
                if (!(codeSQL == null || codeSQL2 == null)) {
                    if (i > 0) {
                        try {
                            stringBuilder.append(yc[0]);
                        } catch (WDInvalidSQLException e) {
                            throw e;
                        }
                    }
                    stringBuilder.append(codeSQL).append(yc[29]).append(m6101a(elementAt2, codeSQL2, elementAt));
                    i++;
                }
                i2++;
            }
            if (i > 0) {
                try {
                    stringBuilder.insert(0, yc[30]);
                } catch (WDInvalidSQLException e2) {
                    throw e2;
                }
            }
            try {
                return stringBuilder.length() > 0 ? stringBuilder.toString() : null;
            } catch (WDInvalidSQLException e22) {
                throw e22;
            }
        } catch (WDInvalidSQLException e222) {
            throw e222;
        }
    }

    /* renamed from: a */
    public final String m6125a(Update update) throws WDInvalidSQLException {
        m6127a((Clause) update);
        StringBuilder stringBuilder = new StringBuilder(yc[24]);
        try {
            if (update.getNbElement() != 1) {
                throw new WDInvalidSQLException(yc[23]);
            }
            stringBuilder.append(update.getElementAt(0).getCodeSQL(this));
            return stringBuilder.toString();
        } catch (WDInvalidSQLException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public final String m6126a(Where where) throws WDInvalidSQLException {
        try {
            m6127a((Clause) where);
            if (where.getNbElement() != 1) {
                throw new WDInvalidSQLException(yc[67]);
            }
            String codeSQL = where.getElementAt(0).getCodeSQL(this);
            try {
                return !C0808l.m4053k(codeSQL) ? yc[66] + codeSQL : null;
            } catch (WDInvalidSQLException e) {
                throw e;
            }
        } catch (WDInvalidSQLException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public final void m6127a(Clause clause) {
        this.uc = clause;
    }

    /* renamed from: a */
    public final void m6128a(StringBuilder stringBuilder) {
        this.wc = stringBuilder;
    }

    /* renamed from: b */
    public final void m6129b() {
        this.sc = null;
        this.uc = null;
        this.uc = null;
        this.xc = null;
        this.vc = null;
    }

    /* renamed from: b */
    public final void m6130b(Requete requete) {
        this.sc = requete;
    }

    /* renamed from: c */
    public final StringBuilder m6131c() {
        return this.wc;
    }

    /* renamed from: d */
    public final Clause m6132d() {
        return this.uc;
    }
}
