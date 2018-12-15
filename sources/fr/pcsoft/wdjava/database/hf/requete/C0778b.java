package fr.pcsoft.wdjava.database.hf.requete;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDIndirection;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.database.C0775c;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.C0833j;
import fr.pcsoft.wdjava.database.hf.C0849z;
import fr.pcsoft.wdjava.database.hf.C0855h;
import fr.pcsoft.wdjava.database.hf.WDHF_Contexte;
import fr.pcsoft.wdjava.database.hf.WDHF_Manager;
import fr.pcsoft.wdjava.database.hf.db;
import fr.pcsoft.wdjava.database.hf.eb;
import fr.pcsoft.wdjava.database.hf.p049c.C0832f;
import fr.pcsoft.wdjava.database.hf.p049c.C0841b;
import fr.pcsoft.wdjava.database.hf.p049c.C0844e;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0537e;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.OrderBy;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.Requete;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.p058k.C0931b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: fr.pcsoft.wdjava.database.hf.requete.b */
public class C0778b extends db {
    private static Pattern Ee = null;
    private static final int Fe = 1;
    private static Pattern Ge = null;
    private static final int Ie = 2;
    private static Pattern Je = null;
    private static final int Le = 3;
    private static Pattern Me = null;
    private static final int Ne = 7;
    private static Pattern Qe = null;
    private static final int Re = 6;
    private static final String Se = C0778b.m3751z(C0778b.m3752z("\u001ex$/l\u0019n>9g\u0000s5"));
    private static Pattern Ue = null;
    private static final String We = C0778b.m3751z(C0778b.m3752z("j\u001fXI"));
    private static final int bf = 8;
    private static final int df = 4;
    private static Pattern hf = null;
    private static Pattern jf = null;
    private static Pattern kf = null;
    private static Matcher lf = null;
    private static final int nf = 5;
    private static Pattern of = null;
    private static Pattern pf = null;
    private static final String[] rf;
    private boolean He;
    private String Ke;
    private String Oe;
    private LinkedHashMap<String, String> Pe;
    private C0537e Te;
    private String Ve;
    private ArrayList Xe;
    private ArrayList Ye;
    private String Ze;
    private eb af;
    private boolean cf;
    private LinkedHashMap ef;
    private boolean ff;
    private boolean gf;
    private int mf;
    private boolean qf;

    static {
        r0 = new String[48];
        r0[0] = C0778b.m3751z(C0778b.m3752z("g\u0017D,f\u0006q'\u0019\u001cg\u0017DC\u001c\u0015OPBc\u0001y)/H\u000en4?d\u0015OP(m5t:<}\u0007{\u0007&q\u000fh\u00078}\u000et/\u0016a\u0007u4$H\u0006n?/f\u0015OP(m54'd\u001ch>\u0016r\u0006n'\u0019\u001f\u000bn4=g\f@4:`\u0000s5\u0016x\u0000q2>\u001dg\u0016\u0007N\u001d"));
        r0[1] = C0778b.m3751z(C0778b.m3752z("ap>,`\u0015OP\u0016f\u0000{3>h:\u0017\u0007,a\u0005pRU\u001fas.>q\u001b@2$z\fnRU\u001f\u0015O1%}\u0007"));
        r0[2] = C0778b.m3751z(C0778b.m3752z("a\u0012PU\u001da`UB\u001cg\u0017RU\u001d5\u0018R"));
        r0[3] = C0778b.m3751z(C0778b.m3752z("js+/f\bh2%z\u0016r4$k\u001ai+:{\u001bh>/"));
        r0[4] = C0778b.m3751z(C0778b.m3752z("\u0006n?/fi~\"J"));
        r0[5] = C0778b.m3751z(C0778b.m3752z("\ry()"));
        r0[6] = C0778b.m3751z(C0778b.m3752z("\b_\u0018\u000fGit\u0002\u001aQ;\u001c=\u0003X,\u001c\u0012\u0007D&O\b\u0003V%YU"));
        r0[7] = C0778b.m3751z(C0778b.m3752z("jy)8q\u001cn$\"r\u00167+a\u001ay$9q\u0005y8>k\u0000r-+x\u0000x>"));
        r0[8] = C0778b.m3751z(C0778b.m3752z("jy)8q\u001cn$\"r\u0016u5#`\u0016n>;a\fh>"));
        r0[9] = C0778b.m3751z(C0778b.m3752z(",D\u000b\u0018"));
        r0[10] = C0778b.m3751z(C0778b.m3752z("is5J"));
        r0[11] = C0778b.m3751z(C0778b.m3752z("jy)8q\u001cn$\"r\u00167+a\u001ay$,f\u0006q$#z\u001f}7#p\f"));
        r0[12] = C0778b.m3751z(C0778b.m3752z("jy)8q\u001cn$\"r\u0016z2)|\u0000y)5}\u00074$z\u001c"));
        r0[13] = C0778b.m3751z(C0778b.m3752z("jy)8q\u001cn$\"r\u0016n.(f\u0000m./k\u0000r8%z\u0007i>"));
        r0[14] = C0778b.m3751z(C0778b.m3752z("f\u0013"));
        r0[15] = C0778b.m3751z(C0778b.m3752z("D6"));
        r0[16] = C0778b.m3751z(C0778b.m3752z("a\u0003\bCp\u001bs+6Gbh:(x\f\u0012P"));
        r0[17] = C0778b.m3751z(C0778b.m3752z("a\u0003\bCp\u001bs+6Gbh:(x\f`\bA}\u000f`\bAq\u0011u(>gg\u0017"));
        r0[18] = C0778b.m3751z(C0778b.m3752z("\u001cl?+`\f"));
        r0[19] = C0778b.m3751z(C0778b.m3752z("\u0000r(/f\u001d"));
        r0[20] = C0778b.m3751z(C0778b.m3752z("a\u0003\bCu\u0005h>8h:\u0017/+v\u0005yUA"));
        r0[21] = C0778b.m3751z(C0778b.m3752z("a\u0003\bCw\u001by:>q\u0015OP>u\u000bp>D\u001f"));
        r0[22] = C0778b.m3751z(C0778b.m3752z("\u001ay7/w\u001d"));
        r0[23] = C0778b.m3751z(C0778b.m3752z("\ry7/`\f"));
        r0[24] = C0778b.m3751z(C0778b.m3752z("aq:2H\u0004u5Ch:\u0016'B\u001cg\u0017R6\u001d"));
        r0[25] = C0778b.m3751z(C0778b.m3752z("ao.'H\bj<\u0016w\u0006i5>H\u0004}#\u0016y\u0000rR6Gc`SD\u001e"));
        r0[26] = C0778b.m3751z(C0778b.m3752z("`\u001c:9\u0014"));
        r0[27] = C0778b.m3751z(C0778b.m3752z("jy)8k\u0001z$8a\u000bn2;a\fc/+v\u0005y:?k\u0000r//f\ru//"));
        r0[28] = C0778b.m3751z(C0778b.m3752z("a\u0012PU\u001da`\bA\u001c\bo'\u0019\u001f`\u0017SB\u001ab\u0015R\u0016\u0010`"));
        r0[29] = C0778b.m3751z(C0778b.m3752z("\u0005\u001b\u001a\u0006](O[\u000eAiZ\u0012\t\\ Y\tJZn][\u001aU:\u001c\u001eÝiN\u001e\u0004G,U\u001c\u0004Ýg"));
        r0[30] = C0778b.m3751z(C0778b.m3752z("\u0000r/%"));
        r0[31] = C0778b.m3751z(C0778b.m3752z("\u000fn4'"));
        r0[32] = C0778b.m3751z(C0778b.m3752z("\u001d}9&q"));
        r0[33] = C0778b.m3751z(C0778b.m3752z("\fd29`\u001a"));
        r0[34] = C0778b.m3751z(C0778b.m3752z("g\u00177#y\u0000h'\u0019\u001cg\u0017DC\u001c\u0015OPBw\u0006q+?`\f@=%f\u0015OP(f\u0006k(/H\u0006l/#{\u0007@7#y\u0000h\u0007%f\ry)6Gb~\"C\u001ac@_C"));
        r0[35] = C0778b.m3751z(C0778b.m3752z("jy)8q\u001cn$\"r\u0016l:8u\u0004c)/e\u001cy//"));
        r0[36] = C0778b.m3751z(C0778b.m3752z("4\u0019"));
        r0[37] = C0778b.m3751z(C0778b.m3752z("n\u0019"));
        r0[38] = C0778b.m3751z(C0778b.m3752z("g\u0017 6G5`S7\u001c\u0012b'\u0019\nu\u0001&A\u000b`\u0014'\u0019\u001ea\u0001\u0007THu@EWHu\u0001\u0007V\n5~>>c\fy5\u0016v\fh,/q\u0007`\bD\u001e\u0015O:$p\u0015OR6Gc\u0019JD\u001e`"));
        r0[39] = C0778b.m3751z(C0778b.m3752z("l\u001b"));
        r0[40] = C0778b.m3751z(C0778b.m3752z("lG"));
        r0[41] = C0778b.m3751z(C0778b.m3752z("jy)8q\u001cn$\"r\u0016z2)|\u0000y)5g\br(5f\u001c~)#e\u001cy"));
        r0[42] = C0778b.m3751z(C0778b.m3752z("\u0016c2$`\fn5+x\u0016n.(k\u0006n?/f\u0016~\"5y\u001cp/#d\u0005y$5"));
        r0[43] = C0778b.m3751z(C0778b.m3752z("a`S6Gvo>&q\nh'\u0019\u001fg\u0017D6\u001d`\u0014'\u0019\u001fa}(C\u000b\u0015OPD\u001f5\u0018R"));
        r0[44] = C0778b.m3751z(C0778b.m3752z("g\u0017'\u0011o\b\u0011!\u000b\u00193cÐ¡ÖÚ¦ÈÏµÛ&1udf\u001aGNy\u0011B5Ô«ØÝ¢ÒÂ°Çic\u001f'\u000e\u001f\u0015AU@"));
        r0[45] = C0778b.m3751z(C0778b.m3752z("g\u001748p\fn'\u0019\u001f\u000be'\u0019\u001cg\u0017DC\u001c\u0015OPBw\u0006q+?`\f@=%f\u0015OP(f\u0006k(/H\u0006l/#{\u0007@7#y\u0000hRD\u001e5\u0018R"));
        r0[46] = C0778b.m3751z(C0778b.m3752z("\u001ay7/w\u001d`\bA\u001c\bp7\u0016p\u0000o/#z\nhRU\u001c\u0015OQ>{\u0019`\bAh-\u0017'\u0019\u001eal>8w\fr/C\u000b`\u0003SD\u001fv\u0015SB\u001c\u000fn4'H\u0000r/%\u001dg\u0017RC"));
        r0[47] = C0778b.m3751z(C0778b.m3752z("jy)8q\u001cn$\"r\u0016n>;a\fh>5z\u0006r$#z\u0000h2+x\u0000o>/"));
        rf = r0;
    }

    public C0778b(C0537e c0537e) {
        this(c0537e.getNomLogique());
        this.Te = c0537e;
        m3770t(c0537e.getCodeSQLOriginal());
    }

    public C0778b(String str) {
        super(str);
        this.ff = false;
        this.Pe = new LinkedHashMap();
        this.cf = false;
        this.gf = false;
        this.Ke = "";
        this.mf = 0;
        this.af = null;
        this.He = false;
        this.Ye = new ArrayList();
        this.Xe = new ArrayList();
        this.qf = false;
        this.ef = null;
        this.Te = null;
        this.ff = false;
    }

    /* renamed from: a */
    private db m3739a(int i, String str) throws WDException {
        if (str == null) {
            CharSequence charSequence = this.Ze;
        }
        String str2 = "";
        if (this.Te != null) {
            str2 = this.Te.getNomFichier(0);
        }
        if (C0808l.m4053k(str2)) {
            str2 = rf[31];
            switch (i) {
                case 2:
                    str2 = rf[18];
                    break;
                case 3:
                    str2 = rf[30];
                    break;
                case 4:
                    str2 = rf[31];
                    break;
                case 5:
                    str2 = rf[32];
                    break;
                case 6:
                    str2 = rf[32];
                    break;
                case 7:
                    str2 = rf[33];
                    break;
                case 8:
                    str2 = rf[32];
                    break;
            }
            StringBuffer stringBuffer = new StringBuffer();
            char[] cArr = new char[]{'\n', '\r', ' ', '(', ')', ',', C0931b.f2543a, C0931b.f2545c};
            int indexOf = charSequence.toUpperCase().indexOf(str2);
            int length = charSequence.length();
            int length2 = str2.length() + indexOf;
            while (length2 < length) {
                char charAt = charSequence.charAt(length2);
                try {
                    if (Arrays.binarySearch(cArr, charAt) < 0) {
                        stringBuffer.append(charAt);
                    } else if (stringBuffer.length() != 0) {
                        str2 = stringBuffer.toString();
                    }
                    length2++;
                } catch (WDException e) {
                    throw e;
                } catch (WDException e2) {
                    throw e2;
                }
            }
            str2 = stringBuffer.toString();
        }
        db a = WDHF_Contexte.getInstance().m4991a(str2.trim(), false);
        if (a == null) {
            do {
                Matcher matcher = C0778b.nb().matcher(charSequence);
                try {
                    if (matcher.find() && matcher.groupCount() > 1) {
                        a = m3739a(1, matcher.group(1));
                    } else if (i != 8) {
                        try {
                            WDErreurManager.m2883a(C0745b.m3222b(rf[12], r1));
                        } catch (WDException e22) {
                            throw e22;
                        }
                    }
                } catch (WDException e222) {
                    throw e222;
                }
            } while (a == null);
        }
        return a;
    }

    /* renamed from: a */
    private String m3740a(C0833j c0833j, C0537e c0537e, Map<String, WDObjet> map) {
        if (c0537e != null) {
            String genererCodeSQL = ((WDDescRequeteWDR) c0537e).genererCodeSQL(c0833j, map);
            try {
                if (!C0808l.m4053k(genererCodeSQL)) {
                    if (!C0691a.m2861a()) {
                        return genererCodeSQL;
                    }
                    System.out.println(genererCodeSQL);
                    return genererCodeSQL;
                }
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        return null;
    }

    /* renamed from: a */
    private String m3741a(C0833j c0833j, WDObjet[] wDObjetArr) {
        Map linkedHashMap = new LinkedHashMap(this.ef.size());
        int i = 0;
        for (C0866a c0866a : this.ef.values()) {
            Object obj = null;
            if (wDObjetArr != null) {
                try {
                    if (i < wDObjetArr.length && wDObjetArr[i] != null) {
                        obj = wDObjetArr[i];
                        if (obj != null) {
                            try {
                                if (obj.isValeurNull()) {
                                    obj = null;
                                }
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                        linkedHashMap.put(c0866a.m6094a(), obj);
                        i++;
                    }
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
            if (c0866a.m6095b()) {
                obj = c0866a.getValeur();
            }
            if (obj != null) {
                if (obj.isValeurNull()) {
                    obj = null;
                }
            }
            linkedHashMap.put(c0866a.m6094a(), obj);
            i++;
        }
        String a = m3740a(c0833j, this.Te, linkedHashMap);
        try {
            if (C0808l.m4053k(a)) {
                String str = this.Ve;
                a = str;
                int i2 = 0;
                for (Object obj2 : linkedHashMap.keySet()) {
                    String obj3 = obj2.toString();
                    WDObjet wDObjet = (WDObjet) linkedHashMap.get(obj3);
                    if (wDObjet != null) {
                        String string = wDObjet.getString();
                        String str2 = "{" + obj3 + "#" + i2 + "}";
                        String str3 = rf[40] + obj3 + "#" + i2 + rf[36];
                        try {
                            String str4;
                            if ((a.indexOf(str3) >= 0 ? 1 : null) != null) {
                                str4 = str3;
                                str3 = rf[37] + string + rf[39];
                                str = str4;
                            } else {
                                str3 = rf[40] + obj3 + "#" + i2 + "}";
                                try {
                                    if ((a.indexOf(str3) >= 0 ? 1 : null) != null) {
                                        str4 = str3;
                                        str3 = rf[37] + string + "'";
                                        str = str4;
                                    } else {
                                        str3 = "{" + obj3 + "#" + i2 + rf[36];
                                        try {
                                            if ((a.indexOf(str3) >= 0 ? 1 : null) != null) {
                                                str4 = str3;
                                                str3 = "'" + string + rf[39];
                                                str = str4;
                                            } else {
                                                "{" + obj3 + "#" + i2 + "}";
                                                try {
                                                    if (wDObjet.isNumerique()) {
                                                        str = str2;
                                                        str3 = string;
                                                    } else if (m3716j()) {
                                                        str3 = "'" + string + "'";
                                                        str = str2;
                                                    } else {
                                                        Matcher matcher = Pattern.compile(C0808l.m4021a(rf[38], C0808l.m4020a(str2, false)), 34).matcher(this.Ze);
                                                        try {
                                                            Object obj4;
                                                            if (matcher.find() && matcher.groupCount() > 1) {
                                                                str3 = matcher.group(1);
                                                                if (str3 != null) {
                                                                    eb ebVar = (eb) WDIndirection.get2(str3, 6);
                                                                    if (ebVar != null) {
                                                                        try {
                                                                            if (ebVar.m5856m()) {
                                                                                str = c0833j.mo3173a(ebVar, ebVar.m5817a(wDObjet), 0);
                                                                                obj4 = 1;
                                                                                if (obj4 == null) {
                                                                                    str = "'" + str + "'";
                                                                                }
                                                                                str3 = str;
                                                                                str = str2;
                                                                            }
                                                                        } catch (NumberFormatException e22) {
                                                                            throw e22;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            obj4 = null;
                                                            str = string;
                                                            if (obj4 == null) {
                                                                str = "'" + str + "'";
                                                            }
                                                            str3 = str;
                                                            str = str2;
                                                        } catch (NumberFormatException e222) {
                                                            throw e222;
                                                        }
                                                    }
                                                } catch (NumberFormatException e2222) {
                                                    throw e2222;
                                                }
                                            }
                                        } catch (NumberFormatException e22222) {
                                            throw e22222;
                                        }
                                    }
                                } catch (NumberFormatException e222222) {
                                    throw e222222;
                                }
                            }
                            str = C0808l.m4018a(a, str, str3);
                        } catch (NumberFormatException e2222222) {
                            throw e2222222;
                        }
                    }
                    str = a;
                    a = str;
                    i2++;
                }
                try {
                    lf = C0778b.pb().matcher(a);
                    if (lf.find()) {
                        WDErreurManager.m2883a(C0745b.m3222b(rf[35], new String[0]));
                    }
                } catch (NumberFormatException e22222222) {
                    throw e22222222;
                }
            }
            return a;
        } catch (NumberFormatException e222222222) {
            throw e222222222;
        }
    }

    /* renamed from: a */
    private void m3742a(String str, int i, WDObjet[] wDObjetArr) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        if (this.Te != null) {
            String nomFichier = this.Te.getNomFichier(0);
            int i2 = 0;
            while (!C0808l.m4053k(nomFichier)) {
                String aliasFichier = this.Te.getAliasFichier(i2);
                try {
                    C0691a.m2860a(!C0808l.m4053k(aliasFichier), rf[29]);
                    this.Pe.put(C0808l.m4057o(aliasFichier.toLowerCase()), C0808l.m4057o(nomFichier.toLowerCase()));
                    i2++;
                    nomFichier = this.Te.getNomFichier(i2);
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        }
        while (true) {
            Matcher matcher = C0778b.nb().matcher(str);
            try {
                if (!matcher.find() || matcher.groupCount() <= 1) {
                    m3752z(str);
                } else {
                    str = str.substring(0, matcher.start(1)) + We + str.substring(matcher.end(1));
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        m3752z(str);
        if (!m3716j()) {
            for (Object obj : this.Pe.values()) {
                instance.m5031m(obj.toString()).mo2743b(null, 3);
            }
            m3748w(str);
            m3745s(str);
            this.gf = C0778b.m3747v(this.Ve);
        }
    }

    /* renamed from: a */
    private boolean m3743a(long r12, int r14, boolean r15) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Exception block dominator not found, method:fr.pcsoft.wdjava.database.hf.requete.b.a(long, int, boolean):boolean. bs: [B:9:0x0029, B:23:0x004c, B:27:0x005f, B:34:0x0086]
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:86)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:34)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:56)
	at jadx.core.ProcessClass.process(ProcessClass.java:39)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:282)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:200)
	at jadx.api.JadxDecompiler$$Lambda$8/70807318.run(Unknown Source)
*/
        /*
        r11 = this;
        r8 = 0;
        r0 = r11.mo2753v();	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r1 = r11.mo2719a();	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r0 = r0.mo2917d(r1);	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r11.we = r0;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r0 = r11.we;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r2 = -1;
        r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r0 == 0) goto L_0x0048;
    L_0x0017:
        r1 = r11.mo2753v();	 Catch:{ b -> 0x0032, WDJNIException -> 0x0038 }
        r2 = r11.m3717k();	 Catch:{ b -> 0x0032, WDJNIException -> 0x0038 }
        r7 = r11.Ve;	 Catch:{ b -> 0x0032, WDJNIException -> 0x0038 }
        r4 = r12;	 Catch:{ b -> 0x0032, WDJNIException -> 0x0038 }
        r6 = r14;	 Catch:{ b -> 0x0032, WDJNIException -> 0x0038 }
        r1 = r1.mo2828a(r2, r4, r6, r7);	 Catch:{ b -> 0x0032, WDJNIException -> 0x0038 }
    L_0x0027:
        if (r1 != 0) goto L_0x004a;
    L_0x0029:
        r0 = r11.mo2753v();	 Catch:{ b -> 0x0042, WDJNIException -> 0x00cd }
        fr.pcsoft.wdjava.database.hf.WDHF_Manager.m5074a(r0);	 Catch:{ b -> 0x0042, WDJNIException -> 0x00cd }
    L_0x0030:
        r0 = r1;
    L_0x0031:
        return r0;
    L_0x0032:
        r0 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2882a(r0);	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r1 = r8;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        goto L_0x0027;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
    L_0x0038:
        r0 = move-exception;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r1 = r11.mo2753v();	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        fr.pcsoft.wdjava.database.hf.WDHF_Manager.m5075a(r0, r1);	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r1 = r8;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        goto L_0x0027;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
    L_0x0042:
        r0 = move-exception;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        throw r0;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
    L_0x0044:
        r0 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2882a(r0);
    L_0x0048:
        r0 = r8;
        goto L_0x0031;
    L_0x004a:
        if (r15 == 0) goto L_0x0030;
    L_0x004c:
        r0 = fr.pcsoft.wdjava.database.hf.WDHF_Contexte.getInstance();	 Catch:{ b -> 0x00cb, WDJNIException -> 0x00cd }
        r2 = r11.mo2719a();	 Catch:{ b -> 0x00cb, WDJNIException -> 0x00cd }
        r0 = r0.m5024j(r2);	 Catch:{ b -> 0x00cb, WDJNIException -> 0x00cd }
        if (r0 == 0) goto L_0x005f;	 Catch:{ b -> 0x00cb, WDJNIException -> 0x00cd }
    L_0x005a:
        r0 = r11.Td;	 Catch:{ b -> 0x00cb, WDJNIException -> 0x00cd }
        r0.clear();	 Catch:{ b -> 0x00cb, WDJNIException -> 0x00cd }
    L_0x005f:
        r0 = r11.mo2753v();	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r2 = r11.we;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r5 = r0.mo2929d(r2);	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r4 = r8;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
    L_0x006a:
        r0 = r5.length;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        if (r4 >= r0) goto L_0x00df;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
    L_0x006d:
        r0 = 0;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r6 = r5[r4];	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r7 = r6.m5758f();	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r3 = r6.m5753c();	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r2 = r6.m5757e();	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r9 = fr.pcsoft.wdjava.database.hf.WDHF_Contexte.getInstance();	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r7 = r9.m5034o(r7);	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        if (r7 == 0) goto L_0x00a3;
    L_0x0086:
        r0 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r2);	 Catch:{ b -> 0x00d7, WDJNIException -> 0x00cd }
        if (r0 != 0) goto L_0x00d9;
    L_0x008c:
        r0 = r2;
    L_0x008d:
        r0 = r7.mo2721b(r0);	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r0 = (fr.pcsoft.wdjava.database.hf.eb) r0;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        if (r0 == 0) goto L_0x00a3;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
    L_0x0095:
        r0 = r0.m5860s();	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r0.m5840c(r3);	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r7 = r7.mo2719a();	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r0.m5826a(r7);	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
    L_0x00a3:
        if (r0 != 0) goto L_0x00ae;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
    L_0x00a5:
        r0 = new fr.pcsoft.wdjava.database.hf.eb;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r7 = r6.m5754d();	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r0.<init>(r3, r7);	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
    L_0x00ae:
        r7 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r2);	 Catch:{ b -> 0x00db, WDJNIException -> 0x00cd }
        if (r7 != 0) goto L_0x00bd;
    L_0x00b4:
        r3 = r3.equalsIgnoreCase(r2);	 Catch:{ b -> 0x00dd, WDJNIException -> 0x00cd }
        if (r3 != 0) goto L_0x00bd;	 Catch:{ b -> 0x00dd, WDJNIException -> 0x00cd }
    L_0x00ba:
        r0.m5844d(r2);	 Catch:{ b -> 0x00dd, WDJNIException -> 0x00cd }
    L_0x00bd:
        r2 = r6.m5746a();	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r0.m5821a(r2);	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r11.mo2750h(r0);	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r0 = r4 + 1;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r4 = r0;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        goto L_0x006a;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
    L_0x00cb:
        r0 = move-exception;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        throw r0;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
    L_0x00cd:
        r0 = move-exception;
        r1 = r11.mo2753v();
        fr.pcsoft.wdjava.database.hf.WDHF_Manager.m5075a(r0, r1);
        goto L_0x0048;
    L_0x00d7:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
    L_0x00d9:
        r0 = r3;
        goto L_0x008d;
    L_0x00db:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x00dd, WDJNIException -> 0x00cd }
    L_0x00dd:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
    L_0x00df:
        r0 = r11.Ve;	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        r11.m3745s(r0);	 Catch:{ b -> 0x0044, WDJNIException -> 0x00cd }
        goto L_0x0030;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.requete.b.a(long, int, boolean):boolean");
    }

    /* renamed from: b */
    private String m3744b(String str, boolean z, boolean z2) {
        if (z) {
            try {
                if (this.Te != null) {
                    Requete racineArbreSQL = ((WDDescRequeteWDR) this.Te).getRacineArbreSQL();
                    if (racineArbreSQL != null) {
                        OrderBy orderBy = (OrderBy) racineArbreSQL.getClause(OrderBy.class);
                        if (orderBy != null) {
                            try {
                                return str.substring(0, orderBy.getPositionDebut()) + str.substring(orderBy.getPositionFin());
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                    }
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        int indexOf = str.indexOf(this.Ke);
        if (indexOf < 0) {
            return str;
        }
        if (z) {
            return str.substring(0, indexOf) + str.substring(indexOf + this.Ke.length());
        }
        if (this.Ye.size() <= 0) {
            return str;
        }
        StringBuffer stringBuffer = new StringBuffer(this.Ke);
        Iterator it = this.Ye.iterator();
        while (it.hasNext()) {
            stringBuffer.append(',').append(((eb) mo2718a(it.next().toString())).m5839c(z2));
        }
        return str.substring(0, indexOf) + stringBuffer.toString() + str.substring(indexOf + this.Ke.length());
    }

    private final void bb() {
        if (this.ef != null) {
            for (Object obj : this.ef.keySet()) {
                String obj2 = obj.toString();
                C0866a c0866a = (C0866a) this.ef.get(obj2);
                try {
                    this.ef.put(obj2, new C0866a(c0866a.m6094a(), this));
                    if (c0866a != null) {
                        c0866a.release();
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        }
    }

    private static final Pattern cb() {
        try {
            if (Qe == null) {
                Qe = Pattern.compile(rf[1], 34);
            }
            return Qe;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static final Pattern db() {
        try {
            if (kf == null) {
                kf = Pattern.compile(rf[45], 34);
            }
            return kf;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static final Pattern fb() {
        try {
            if (Ge == null) {
                Ge = Pattern.compile(rf[2], 34);
            }
            return Ge;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private int gb() {
        String toUpperCase = this.Ve.trim().toUpperCase();
        return toUpperCase.startsWith(rf[22]) ? 1 : toUpperCase.startsWith(rf[19]) ? 3 : toUpperCase.startsWith(rf[23]) ? 4 : toUpperCase.startsWith(rf[18]) ? 2 : toUpperCase.matches(rf[20]) ? 5 : toUpperCase.matches(rf[17]) ? 7 : toUpperCase.matches(rf[16]) ? 6 : toUpperCase.matches(rf[21]) ? 8 : 1;
    }

    private static final Pattern ib() {
        try {
            if (Ue == null) {
                Ue = Pattern.compile(rf[34], 34);
            }
            return Ue;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static final Pattern jb() {
        try {
            if (Je == null) {
                Je = Pattern.compile(rf[0], 34);
            }
            return Je;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static final Pattern nb() {
        try {
            if (pf == null) {
                pf = Pattern.compile(rf[43], 34);
            }
            return pf;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static final Pattern ob() {
        try {
            if (Ee == null) {
                Ee = Pattern.compile(rf[28], 34);
            }
            return Ee;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static final Pattern pb() {
        try {
            if (hf == null) {
                hf = Pattern.compile(rf[44], 34);
            }
            return hf;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private static final Pattern qb() {
        try {
            if (jf == null) {
                jf = Pattern.compile(rf[46], 34);
            }
            return jf;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    private String rb() {
        StringBuffer stringBuffer = new StringBuffer();
        int length = this.Ve.length();
        int i = 0;
        Object obj = null;
        while (i < length) {
            char charAt = this.Ve.charAt(i);
            if (charAt == '\'' && i > 0) {
                try {
                    if (this.Ve.charAt(i - 1) != '\\') {
                        if (obj != null) {
                            stringBuffer.append(Se);
                            obj = null;
                        } else {
                            obj = 1;
                        }
                        i++;
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            if (obj == null) {
                try {
                    stringBuffer.append(charAt);
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
            continue;
            i++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: s */
    private eb m3745s(String str) throws WDException {
        this.af = null;
        this.mf = 0;
        this.cf = false;
        this.Xe.clear();
        this.Ye.clear();
        ArrayList arrayList = new ArrayList();
        Matcher matcher = C0778b.db().matcher(str);
        try {
            if (matcher.find() && matcher.groupCount() > 1) {
                eb ebVar;
                this.cf = true;
                String group = matcher.group(1);
                this.Ke = rf[4] + group;
                String[] split = group.trim().split(",");
                int i = 0;
                while (i < split.length) {
                    Matcher matcher2 = C0778b.fb().matcher(split[i]);
                    try {
                        if (matcher2.find() && matcher2.groupCount() >= 4) {
                            String str2;
                            String str3;
                            group = matcher2.group(1).trim();
                            if (matcher2.group(3) != null) {
                                group = matcher2.group(3).trim();
                            }
                            String str4 = "";
                            int indexOf = group.indexOf(32);
                            if (indexOf > 0) {
                                str4 = group.substring(indexOf).trim();
                                group = group.substring(0, indexOf);
                                str2 = str4;
                                str3 = group;
                            } else {
                                str2 = str4;
                                str3 = group;
                            }
                            ebVar = (eb) mo2721b(str3);
                            if (ebVar == null) {
                                for (eb ebVar2 : this.Td.values()) {
                                    if (C0808l.m4042c(ebVar2.m5818a(false, null), str3, 20) == 0) {
                                        ebVar = ebVar2;
                                        break;
                                    }
                                }
                            }
                            if (ebVar != null) {
                                try {
                                    if (str2.equalsIgnoreCase(rf[5])) {
                                        ebVar.m5837b(false);
                                    }
                                    try {
                                        if (this.af == null) {
                                            this.af = ebVar;
                                        }
                                        this.mf++;
                                        arrayList.add(ebVar.mo3137b());
                                        this.Xe.add(C0808l.m4057o(ebVar.mo3137b().toLowerCase()));
                                    } catch (WDException e) {
                                        throw e;
                                    }
                                } catch (WDException e2) {
                                    throw e2;
                                }
                            }
                            continue;
                        }
                        i++;
                    } catch (WDException e22) {
                        throw e22;
                    }
                }
                if (this.af != null) {
                    Object[] d = super.mo2744d(this.af);
                    for (Object obj : d) {
                        ebVar = (eb) obj;
                        if (!arrayList.contains(ebVar.mo3137b())) {
                            group = C0808l.m4057o(ebVar.mo3137b().toLowerCase());
                            this.Ye.add(group);
                            this.Xe.add(group);
                        }
                    }
                }
            }
            return null;
        } catch (WDException e222) {
            throw e222;
        }
    }

    /* renamed from: u */
    private boolean m3746u(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    /* renamed from: v */
    private static boolean m3747v(String str) {
        Matcher matcher = C0778b.ib().matcher(str);
        try {
            if (matcher.find()) {
                if (matcher.groupCount() > 1) {
                    return true;
                }
            }
            return false;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: w */
    private void m3748w(String str) throws WDException {
        Matcher matcher = C0778b.qb().matcher(str.trim());
        try {
            if (!matcher.find() || matcher.groupCount() <= 4) {
                WDErreurManager.m2883a(C0745b.m3222b(rf[8], mo2719a()) + "\n" + C0745b.m3222b(rf[7], new String[0]));
                return;
            }
            Object[] x = m3749x(matcher.group(4).trim());
            int i = 0;
            int i2 = 1;
            while (i < x.length) {
                String str2 = "";
                CharSequence trim = x[i].toString().trim();
                Matcher matcher2 = C0778b.ob().matcher(trim);
                try {
                    String trim2;
                    String trim3;
                    Matcher matcher3;
                    String trim4;
                    db m;
                    C0849z b;
                    Object s;
                    C0849z c0849z;
                    int size;
                    int i3;
                    db m2;
                    eb s2;
                    int i4;
                    if (matcher2.find()) {
                        if (matcher2.groupCount() >= 5 && matcher2.group(4) != null) {
                            trim2 = matcher2.group(1).trim();
                            trim3 = matcher2.group(4).trim();
                            matcher3 = C0778b.fb().matcher(trim2);
                            if (m3746u(trim2)) {
                                try {
                                    if (((matcher3.groupCount() < 4 ? 1 : 0) & matcher3.find()) != 0) {
                                        try {
                                            if (matcher3.group(3) != null) {
                                                trim4 = matcher3.group(1).trim();
                                                trim2 = matcher3.group(3).trim();
                                                trim4 = (String) this.Pe.get(C0808l.m4057o(trim4.toLowerCase()));
                                                if (trim4 == null) {
                                                    m = WDHF_Contexte.getInstance().m5031m(trim4);
                                                    b = m.mo2721b(trim2);
                                                    if (b == null) {
                                                        s = ((eb) b).m5860s();
                                                        ((eb) s).m5826a(m.mo2719a());
                                                    } else {
                                                        c0849z = b;
                                                    }
                                                } else {
                                                    s = Se;
                                                }
                                            }
                                        } catch (WDException e) {
                                            throw e;
                                        }
                                    }
                                    size = this.Pe.size();
                                    i3 = 0;
                                    for (Object obj : this.Pe.values()) {
                                        m2 = WDHF_Contexte.getInstance().m5031m(obj.toString());
                                        if (!trim2.equals(C0607n.Vc)) {
                                            for (eb s22 : m2.m3614S().values()) {
                                                s22 = s22.m5860s();
                                                s22.m5826a(m2.mo2719a());
                                                mo2750h(s22);
                                            }
                                        } else if (m2.mo2721b(trim2) != null) {
                                            s = ((eb) m2.mo2721b(trim2)).m5860s();
                                            ((eb) s).m5826a(m2.mo2719a());
                                            break;
                                        }
                                        i3++;
                                    }
                                    s = null;
                                    if (i3 == size) {
                                        try {
                                            if (trim2.equals(C0607n.Vc)) {
                                                s = Se;
                                            } else {
                                                i4 = i2;
                                                i++;
                                                i2 = i4;
                                            }
                                        } catch (WDException e2) {
                                            throw e2;
                                        }
                                    }
                                } catch (WDException e22) {
                                    throw e22;
                                }
                            }
                            s = Se;
                            if (s != null) {
                                try {
                                    if (s.equals(Se)) {
                                        if (trim3.equals("")) {
                                            mo2750h(new eb(trim3, m3750y(trim2)));
                                        } else {
                                            mo2750h(new eb(trim2, m3750y(rf[9] + i2)));
                                        }
                                        i4 = i2 + 1;
                                        i++;
                                        i2 = i4;
                                    }
                                } catch (WDException e222) {
                                    throw e222;
                                }
                            }
                            if (s instanceof eb) {
                                if (trim3.equals("")) {
                                    ((eb) s).m5840c(trim3);
                                    ((eb) s).m5844d(trim2);
                                    mo2750h((eb) s);
                                    i4 = i2;
                                    i++;
                                    i2 = i4;
                                } else {
                                    ((eb) s).m5840c(trim2);
                                    ((eb) s).m5844d(trim2);
                                    mo2750h((eb) s);
                                }
                            }
                            i4 = i2;
                            i++;
                            i2 = i4;
                        }
                    }
                    CharSequence charSequence = trim;
                    trim3 = str2;
                    matcher3 = C0778b.fb().matcher(trim2);
                    if (m3746u(trim2)) {
                        if (matcher3.groupCount() < 4) {
                        }
                        if (((matcher3.groupCount() < 4 ? 1 : 0) & matcher3.find()) != 0) {
                            if (matcher3.group(3) != null) {
                                trim4 = matcher3.group(1).trim();
                                trim2 = matcher3.group(3).trim();
                                trim4 = (String) this.Pe.get(C0808l.m4057o(trim4.toLowerCase()));
                                if (trim4 == null) {
                                    s = Se;
                                } else {
                                    m = WDHF_Contexte.getInstance().m5031m(trim4);
                                    b = m.mo2721b(trim2);
                                    if (b == null) {
                                        c0849z = b;
                                    } else {
                                        s = ((eb) b).m5860s();
                                        ((eb) s).m5826a(m.mo2719a());
                                    }
                                }
                            }
                        }
                        size = this.Pe.size();
                        i3 = 0;
                        while (r2.hasNext()) {
                            m2 = WDHF_Contexte.getInstance().m5031m(obj.toString());
                            if (!trim2.equals(C0607n.Vc)) {
                                if (m2.mo2721b(trim2) != null) {
                                    s = ((eb) m2.mo2721b(trim2)).m5860s();
                                    ((eb) s).m5826a(m2.mo2719a());
                                    break;
                                }
                            } else {
                                while (r12.hasNext()) {
                                    s22 = s22.m5860s();
                                    s22.m5826a(m2.mo2719a());
                                    mo2750h(s22);
                                }
                            }
                            i3++;
                        }
                        s = null;
                        if (i3 == size) {
                            if (trim2.equals(C0607n.Vc)) {
                                s = Se;
                            } else {
                                i4 = i2;
                                i++;
                                i2 = i4;
                            }
                        }
                    } else {
                        s = Se;
                    }
                    if (s != null) {
                        if (s.equals(Se)) {
                            if (trim3.equals("")) {
                                mo2750h(new eb(trim2, m3750y(rf[9] + i2)));
                            } else {
                                mo2750h(new eb(trim3, m3750y(trim2)));
                            }
                            i4 = i2 + 1;
                            i++;
                            i2 = i4;
                        }
                    }
                    try {
                        if (s instanceof eb) {
                            if (trim3.equals("")) {
                                ((eb) s).m5840c(trim2);
                                ((eb) s).m5844d(trim2);
                                mo2750h((eb) s);
                            } else {
                                ((eb) s).m5840c(trim3);
                                ((eb) s).m5844d(trim2);
                                mo2750h((eb) s);
                                i4 = i2;
                                i++;
                                i2 = i4;
                            }
                        }
                        i4 = i2;
                        i++;
                        i2 = i4;
                    } catch (WDException e2222) {
                        throw e2222;
                    } catch (WDException e22222) {
                        throw e22222;
                    }
                } catch (WDException e222222) {
                    throw e222222;
                } catch (WDException e2222222) {
                    throw e2222222;
                }
            }
        } catch (WDException e22222222) {
            throw e22222222;
        }
    }

    /* renamed from: x */
    private Object[] m3749x(String str) {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        StringBuffer stringBuffer = new StringBuffer();
        int i2 = 0;
        int i3 = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            switch (charAt) {
                case '(':
                    i3++;
                    try {
                        stringBuffer.append(charAt);
                        break;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                case ')':
                    i3--;
                    stringBuffer.append(charAt);
                    break;
                case ',':
                    if (i3 != 0) {
                        stringBuffer.append(charAt);
                        break;
                    }
                    arrayList.add(stringBuffer.toString());
                    stringBuffer = new StringBuffer();
                    i2++;
                    break;
                default:
                    stringBuffer.append(charAt);
                    break;
            }
            i++;
        }
        try {
            if (!stringBuffer.toString().equals("")) {
                arrayList.add(stringBuffer.toString());
            }
            return arrayList.toArray();
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: y */
    private int m3750y(String str) {
        try {
            if (of == null) {
                of = Pattern.compile(rf[24], 34);
            }
            Matcher matcher = of.matcher(str.trim());
            try {
                if (matcher.find() && matcher.groupCount() > 1) {
                    String group = matcher.group(2);
                    for (Object obj : this.Pe.values()) {
                        db m = WDHF_Contexte.getInstance().m5031m(obj.toString());
                        if (m.mo2721b(group) != null) {
                            return ((eb) m.mo2721b(group)).m5848f();
                        }
                    }
                }
                try {
                    if (Me == null) {
                        Me = Pattern.compile(rf[25], 34);
                    }
                    try {
                        return Me.matcher(str.trim()).find() ? 100 : 2;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    /* renamed from: z */
    private static String m3751z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 73;
                    break;
                case 1:
                    i2 = 60;
                    break;
                case 2:
                    i2 = 123;
                    break;
                case 3:
                    i2 = 106;
                    break;
                default:
                    i2 = 52;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private void m3752z(String str) throws WDException {
        Matcher matcher = C0778b.jb().matcher(str.trim());
        try {
            if (!matcher.find() || matcher.groupCount() <= 1) {
                WDErreurManager.m2883a(C0745b.m3222b(rf[8], mo2719a()) + "\n" + C0745b.m3222b(rf[11], new String[0]));
                return;
            }
            String[] split = matcher.group(1).trim().split(",");
            for (CharSequence split2 : split) {
                String[] split3 = C0778b.cb().split(split2);
                int i = 0;
                while (i < split3.length) {
                    String str2 = split3[i];
                    if (i > 0) {
                        int indexOf = str2.toUpperCase().indexOf(rf[10]);
                        if (indexOf >= 0) {
                            str2 = str2.substring(0, indexOf);
                        }
                    }
                    String trim = str2.trim();
                    Matcher matcher2 = C0778b.ob().matcher(trim);
                    try {
                        if (matcher2.find()) {
                            if (matcher2.groupCount() >= 5 && matcher2.group(4) != null) {
                                String o = C0808l.m4057o(matcher2.group(1).trim().toLowerCase());
                                try {
                                    if (o.equals(We)) {
                                        continue;
                                    } else {
                                        db b = WDHF_Contexte.getInstance().m5004b(o);
                                        if (b == null) {
                                            b = WDHF_Contexte.getInstance().m5021h(o);
                                        }
                                        if (b != null) {
                                            try {
                                                this.Pe.put(C0808l.m4057o(matcher2.group(4).trim().toLowerCase()), o);
                                            } catch (WDException e) {
                                                throw e;
                                            }
                                        }
                                        WDErreurManager.m2883a(C0745b.m3222b(rf[8], mo2719a()) + "\n" + C0745b.m3222b(rf[12], trim));
                                    }
                                    i++;
                                } catch (WDException e2) {
                                    throw e2;
                                }
                            }
                        }
                        int indexOf2 = trim.indexOf(32);
                        str2 = null;
                        if (indexOf2 > 0) {
                            try {
                                str2 = trim.length() > indexOf2 + 1 ? trim.substring(indexOf2 + 1).trim() : null;
                                trim = trim.substring(0, indexOf2);
                            } catch (WDException e22) {
                                throw e22;
                            }
                        }
                        String o2 = C0808l.m4057o(trim.toLowerCase());
                        db b2 = WDHF_Contexte.getInstance().m5004b(o2);
                        if (b2 == null) {
                            b2 = WDHF_Contexte.getInstance().m5021h(o2);
                        }
                        if (b2 != null) {
                            try {
                                Object o3;
                                LinkedHashMap linkedHashMap = this.Pe;
                                if (str2 != null) {
                                    o3 = C0808l.m4057o(str2.toLowerCase());
                                } else {
                                    str2 = o2;
                                }
                                linkedHashMap.put(o3, o2);
                            } catch (WDException e222) {
                                throw e222;
                            }
                        }
                        WDErreurManager.m2883a(C0745b.m3222b(rf[8], mo2719a()) + "\n" + C0745b.m3222b(rf[12], trim));
                        i++;
                    } catch (WDException e2222) {
                        throw e2222;
                    } catch (WDException e22222) {
                        throw e22222;
                    }
                }
            }
        } catch (WDException e222222) {
            throw e222222;
        }
    }

    /* renamed from: z */
    private static char[] m3753z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 52);
        }
        return toCharArray;
    }

    /* renamed from: H */
    public boolean mo2737H() {
        boolean I = m3716j() ? m3606I() : true;
        bb();
        mo2745e(true);
        return I;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: M */
    public java.lang.String mo2738M() {
        /*
        r3 = this;
        r2 = 1;
        r0 = r3.Pe;	 Catch:{ NumberFormatException -> 0x0042 }
        r0 = r0.size();	 Catch:{ NumberFormatException -> 0x0042 }
        if (r0 == 0) goto L_0x0011;
    L_0x0009:
        r0 = r3.Pe;	 Catch:{ NumberFormatException -> 0x0044 }
        r0 = r0.size();	 Catch:{ NumberFormatException -> 0x0044 }
        if (r0 <= r2) goto L_0x0020;
    L_0x0011:
        r0 = rf;	 Catch:{ NumberFormatException -> 0x0044 }
        r1 = 3;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0044 }
        r1 = 0;
        r1 = new java.lang.String[r1];	 Catch:{ NumberFormatException -> 0x0044 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ NumberFormatException -> 0x0044 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ NumberFormatException -> 0x0044 }
    L_0x0020:
        r0 = r3.Pe;
        r0 = r0.values();
        r0 = r0.iterator();
        r0 = r0.next();
        r0 = (java.lang.String) r0;
        r0 = r0.toString();
        r1 = fr.pcsoft.wdjava.database.hf.WDHF_Contexte.getInstance();
        r0 = r1.m5031m(r0);
        r1 = 0;
        r0 = r0.mo2741a(r2, r1);
        return r0;
    L_0x0042:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x0044 }
    L_0x0044:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.requete.b.M():java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: O */
    public fr.pcsoft.wdjava.database.hf.eb mo2739O() {
        /*
        r7 = this;
        r1 = 0;
        r5 = 1;
        r7.kb();	 Catch:{ NumberFormatException -> 0x000c }
        r0 = r7.ae;	 Catch:{ NumberFormatException -> 0x000c }
        if (r0 == 0) goto L_0x000e;
    L_0x0009:
        r0 = r7.ae;	 Catch:{ NumberFormatException -> 0x000c }
    L_0x000b:
        return r0;
    L_0x000c:
        r0 = move-exception;
        throw r0;
    L_0x000e:
        r0 = r7.Td;	 Catch:{ NumberFormatException -> 0x00a2 }
        r0 = r0.size();	 Catch:{ NumberFormatException -> 0x00a2 }
        if (r0 != 0) goto L_0x002d;
    L_0x0016:
        r0 = rf;	 Catch:{ NumberFormatException -> 0x00a2 }
        r2 = 41;
        r0 = r0[r2];	 Catch:{ NumberFormatException -> 0x00a2 }
        r2 = 1;
        r2 = new java.lang.String[r2];	 Catch:{ NumberFormatException -> 0x00a2 }
        r3 = 0;
        r4 = r7.mo2719a();	 Catch:{ NumberFormatException -> 0x00a2 }
        r2[r3] = r4;	 Catch:{ NumberFormatException -> 0x00a2 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r2);	 Catch:{ NumberFormatException -> 0x00a2 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ NumberFormatException -> 0x00a2 }
    L_0x002d:
        r0 = r7.Te;
        if (r0 == 0) goto L_0x00a9;
    L_0x0031:
        r0 = r7.Te;
        r0 = (fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR) r0;
        r0 = r0.getRacineArbreSQL();
        if (r0 == 0) goto L_0x00cb;
    L_0x003b:
        r2 = fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.OrderBy.class;
        r0 = r0.getClause(r2);
        r0 = (fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.OrderBy) r0;
        if (r0 == 0) goto L_0x00c7;
    L_0x0045:
        r2 = r0.getNomOuAliasPremierFichier();
        r3 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r2);
        if (r3 != 0) goto L_0x00c7;
    L_0x004f:
        r1 = r7.mo2721b(r2);
        r1 = (fr.pcsoft.wdjava.database.hf.eb) r1;
        r6 = r0;
        r0 = r1;
        r1 = r6;
    L_0x0058:
        if (r0 == 0) goto L_0x00a6;
    L_0x005a:
        r7.af = r0;	 Catch:{ NumberFormatException -> 0x00a4 }
    L_0x005c:
        r2 = r7.m3716j();	 Catch:{ NumberFormatException -> 0x00ac }
        if (r2 == 0) goto L_0x0085;
    L_0x0062:
        if (r1 == 0) goto L_0x006a;
    L_0x0064:
        r1 = r1.getNbElement();	 Catch:{ NumberFormatException -> 0x00b0 }
        if (r1 > r5) goto L_0x0072;
    L_0x006a:
        r1 = r7.Ye;	 Catch:{ NumberFormatException -> 0x00b2 }
        if (r1 == 0) goto L_0x0085;
    L_0x006e:
        r1 = r7.mf;	 Catch:{ NumberFormatException -> 0x00b2 }
        if (r1 <= r5) goto L_0x0085;
    L_0x0072:
        r0 = new fr.pcsoft.wdjava.database.hf.eb;
        r1 = rf;
        r2 = 42;
        r1 = r1[r2];
        r0.<init>(r1);
        r2 = 0;
        r0.m5821a(r2);
        r0.m5822a(r7);
    L_0x0085:
        if (r0 != 0) goto L_0x00c0;
    L_0x0087:
        r1 = r7.Td;
        r1 = r1.values();
        r2 = r1.iterator();
        r1 = r0;
    L_0x0092:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00c1;
    L_0x0098:
        r0 = r2.next();
        r0 = (fr.pcsoft.wdjava.database.hf.eb) r0;
        if (r1 != 0) goto L_0x00b4;
    L_0x00a0:
        r1 = r0;
        goto L_0x0092;
    L_0x00a2:
        r0 = move-exception;
        throw r0;
    L_0x00a4:
        r0 = move-exception;
        throw r0;
    L_0x00a6:
        r0 = r7.af;
        goto L_0x005c;
    L_0x00a9:
        r0 = r7.af;
        goto L_0x005c;
    L_0x00ac:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00ae }
    L_0x00ae:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00b0 }
    L_0x00b0:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00b2 }
    L_0x00b2:
        r0 = move-exception;
        throw r0;
    L_0x00b4:
        r3 = r0.m5857o();
        r4 = r1.m5857o();
        if (r3 > r4) goto L_0x00a0;
    L_0x00be:
        r0 = r1;
        goto L_0x00a0;
    L_0x00c0:
        r1 = r0;
    L_0x00c1:
        r7.ae = r1;
        r0 = r7.ae;
        goto L_0x000b;
    L_0x00c7:
        r6 = r0;
        r0 = r1;
        r1 = r6;
        goto L_0x0058;
    L_0x00cb:
        r0 = r1;
        goto L_0x0058;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.requete.b.O():fr.pcsoft.wdjava.database.hf.eb");
    }

    /* renamed from: a */
    public String mo2740a(eb ebVar, boolean z) {
        this.He = true;
        String str = this.Ve;
        if (!this.gf) {
            str = m3744b(this.Ve, true, true);
        }
        return '(' + str + rf[26] + mo2741a(false, null);
    }

    /* renamed from: a */
    public String mo2741a(boolean z, C0833j c0833j) {
        return C0725i.m3031a(mo2719a(), false);
    }

    /* renamed from: a */
    public boolean m3759a(long j, int i, WDObjet[] wDObjetArr) {
        try {
            this.we = mo2753v().mo2917d(mo2719a());
            if (this.we != -1) {
                boolean a;
                try {
                    a = mo2753v().mo2828a(m3717k(), j, i, this.Ve);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                    a = false;
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, mo2753v());
                    a = false;
                }
                if (a) {
                    if (WDHF_Contexte.getInstance().m5024j(mo2719a()) != null) {
                        this.Td.clear();
                    }
                    C0844e[] d = mo2753v().mo2929d(this.we);
                    for (C0844e c0844e : d) {
                        String f = c0844e.m5758f();
                        String c = c0844e.m5753c();
                        db o = WDHF_Contexte.getInstance().m5034o(f);
                        if (o != null) {
                            eb ebVar = (eb) o.mo2721b(c);
                            if (ebVar != null) {
                                ebVar = ebVar.m5860s();
                                ebVar.m5826a(o.mo2719a());
                                mo2750h(ebVar);
                            }
                        }
                        mo2750h(new eb(c, c0844e.m5754d()));
                    }
                    m3745s(this.Ve);
                } else {
                    WDHF_Manager.m5074a(mo2753v());
                }
                this.ff = a;
                bb();
                return a;
            }
        } catch (C0841b e3) {
            throw e3;
        } catch (WDJNIException e22) {
            WDHF_Manager.m5075a(e22, mo2753v());
        } catch (C0841b e32) {
            throw e32;
        } catch (Exception e4) {
            WDErreurManager.m2882a(e4);
        }
        return false;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean m3760a(java.lang.String r8, int r9, fr.pcsoft.wdjava.core.WDObjet[] r10, boolean r11) throws fr.pcsoft.wdjava.core.erreur.WDException {
        /*
        r7 = this;
        r6 = 0;
        r0 = 1;
        r1 = 0;
        r2 = r7.Oe;
        r7.Ve = r2;
        r4 = r7.gb();
        r7.qf = r1;
        r7.ae = r6;
        r2 = "";
        r5 = r8.equals(r2);
        if (r11 == 0) goto L_0x001b;
    L_0x0017:
        r2 = r7.ff;	 Catch:{ WDException -> 0x0079 }
        if (r2 != 0) goto L_0x0043;
    L_0x001b:
        r2 = r7.ff;	 Catch:{ WDException -> 0x007b }
        if (r2 == 0) goto L_0x0023;
    L_0x001f:
        r2 = 0;
        r7.mo2745e(r2);	 Catch:{ WDException -> 0x007b }
    L_0x0023:
        r2 = r7.rb();
        r7.Ze = r2;
        if (r5 == 0) goto L_0x007d;
    L_0x002b:
        r2 = r7.m3739a(r4, r6);
        if (r2 == 0) goto L_0x0039;
    L_0x0031:
        r2 = r2.getConnexion();
        r8 = r2.getString();
    L_0x0039:
        r7.m3728q(r8);
    L_0x003c:
        if (r4 != r0) goto L_0x0043;
    L_0x003e:
        r2 = r7.Ve;	 Catch:{ WDException -> 0x0081 }
        r7.m3742a(r2, r9, r10);	 Catch:{ WDException -> 0x0081 }
    L_0x0043:
        r2 = r7.m3616V();
        r3 = r7.ef;	 Catch:{ WDException -> 0x0083 }
        if (r3 == 0) goto L_0x0087;
    L_0x004b:
        r3 = r7.ef;	 Catch:{ WDException -> 0x0085 }
        r3 = r3.size();	 Catch:{ WDException -> 0x0085 }
        if (r3 <= 0) goto L_0x0087;
    L_0x0053:
        r2 = r7.m3741a(r2, r10);	 Catch:{ WDException -> 0x0085 }
        r7.Ve = r2;	 Catch:{ WDException -> 0x0085 }
    L_0x0059:
        r2 = "";
        r6 = r7.m3629a(r2, r0, r1);
        r2 = r7.m3716j();
        if (r2 == 0) goto L_0x009a;
    L_0x0065:
        r2 = 0;
        if (r5 != 0) goto L_0x006d;
    L_0x0069:
        r2 = r6.m4941a();
    L_0x006d:
        if (r4 != r0) goto L_0x0098;
    L_0x006f:
        r0 = r7.m3743a(r2, r9, r0);
    L_0x0073:
        r7.bb();
        r7.ff = r0;
        return r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r7.m3728q(r8);
        goto L_0x003c;
    L_0x0081:
        r0 = move-exception;
        throw r0;
    L_0x0083:
        r0 = move-exception;
        throw r0;	 Catch:{ WDException -> 0x0085 }
    L_0x0085:
        r0 = move-exception;
        throw r0;
    L_0x0087:
        r3 = r7.Te;
        r2 = r7.m3740a(r2, r3, r6);
        r3 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r2);	 Catch:{ WDException -> 0x0096 }
        if (r3 != 0) goto L_0x0059;
    L_0x0093:
        r7.Ve = r2;	 Catch:{ WDException -> 0x0096 }
        goto L_0x0059;
    L_0x0096:
        r0 = move-exception;
        throw r0;
    L_0x0098:
        r0 = r1;
        goto L_0x006f;
    L_0x009a:
        r0 = r6.m4967o();
        r2 = r7.Ve;
        r0 = r0.mo3099a(r2, r1);
        if (r0 != 0) goto L_0x00ad;
    L_0x00a6:
        r1 = r7.mo2719a();	 Catch:{ WDException -> 0x00c9 }
        r7.m3647a(r6, r1);	 Catch:{ WDException -> 0x00c9 }
    L_0x00ad:
        r1 = 0;
        r7.m3684c(r1);	 Catch:{ WDException -> 0x00c7 }
        r1 = 1;
        r7.m3708g(r1);	 Catch:{ WDException -> 0x00c7 }
        r1 = fr.pcsoft.wdjava.database.hf.WDHF_Contexte.getInstance();	 Catch:{ WDException -> 0x00c7 }
        r2 = r7.mo2719a();	 Catch:{ WDException -> 0x00c7 }
        r1 = r1.m5024j(r2);	 Catch:{ WDException -> 0x00c7 }
        if (r1 == 0) goto L_0x0073;
    L_0x00c3:
        r7.m3610N();	 Catch:{ WDException -> 0x00c7 }
        goto L_0x0073;
    L_0x00c7:
        r0 = move-exception;
        throw r0;
    L_0x00c9:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.requete.b.a(java.lang.String, int, fr.pcsoft.wdjava.core.WDObjet[], boolean):boolean");
    }

    /* renamed from: b */
    public String mo2742b(Object[] objArr, boolean z) {
        try {
            if (!this.cf) {
                return super.mo2742b(objArr, z);
            }
            if (!this.He) {
                return "";
            }
            this.He = false;
            return super.mo2742b(objArr, z);
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: b */
    public boolean mo2743b(String str, int i) {
        if (!this.ke) {
            for (eb v : this.Td.values()) {
                try {
                    if (v.m5863v()) {
                        WDErreurManager.m2883a(C0745b.m3222b(rf[27], v.mo3137b(), mo2719a()));
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        }
        this.ke = true;
        return this.ke;
    }

    public WDObjet chercherSousElement(String str) {
        WDObjet chercherSousElement = super.chercherSousElement(str);
        if (chercherSousElement != null) {
            return chercherSousElement;
        }
        chercherSousElement = m3769r(str);
        return chercherSousElement == null ? null : chercherSousElement;
    }

    /* renamed from: d */
    public Object[] mo2744d(eb ebVar) {
        try {
            if (this.cf) {
                if (!this.He || ebVar == this.af) {
                    eb[] ebVarArr = new eb[this.Xe.size()];
                    Iterator it = this.Xe.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        try {
                            ebVarArr[i] = (eb) mo2718a(it.next().toString());
                            i++;
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                    return ebVarArr;
                }
            }
            return super.mo2744d(ebVar);
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    /* renamed from: e */
    public void mo2745e(boolean z) {
        try {
            super.mo2745e(z);
            this.Ve = this.Oe;
            this.Ze = null;
            this.ff = false;
            this.cf = false;
            this.gf = false;
            this.Ke = "";
            this.qf = false;
            this.af = null;
            this.mf = 0;
            this.He = false;
            if (this.Pe != null) {
                this.Pe.clear();
            }
            try {
                if (this.Ye != null) {
                    this.Ye.clear();
                }
                try {
                    if (this.Xe != null) {
                        this.Xe.clear();
                    }
                } catch (NumberFormatException e) {
                    throw e;
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    public LinkedHashMap eb() {
        return this.ef;
    }

    /* renamed from: f */
    public WDObjet mo2746f(boolean z) {
        C0778b c0778b = (C0778b) super.mo2746f(z);
        try {
            if (this.Pe != null) {
                c0778b.Pe = (LinkedHashMap) this.Pe.clone();
            }
            try {
                if (this.af != null) {
                    c0778b.af = (eb) mo2721b(this.af.mo3137b());
                }
                try {
                    if (this.Ye != null) {
                        c0778b.Ye = (ArrayList) this.Ye.clone();
                    }
                    try {
                        if (this.Xe != null) {
                            c0778b.Xe = (ArrayList) this.Xe.clone();
                        }
                        if (this.ef != null) {
                            c0778b.ef = new LinkedHashMap((int) (((double) this.ef.size()) / 0.75d), 0.75f);
                            for (String str : this.ef.keySet()) {
                                c0778b.ef.put(str, ((C0866a) this.ef.get(str)).m6093a(c0778b));
                            }
                        }
                        return c0778b;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    /* renamed from: f */
    protected db mo2747f(String str) {
        db c0778b = new C0778b(str);
        try {
            c0778b.m3728q(this.Sd);
            c0778b.m3712h(this.me);
            if (this.Te != null) {
                c0778b.Te = this.Te;
                m3770t(this.Te.getCodeSQLOriginal());
            } else {
                m3770t(this.Oe);
            }
            return c0778b;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: g */
    public String mo2748g() {
        return mo2738M();
    }

    public WDChaine getNomPhysique() {
        return new WDChaine(super.mo2741a(false, null));
    }

    public WDBooleen getNullSupporte() {
        for (Object obj : this.Pe.values()) {
            try {
                if (WDHF_Contexte.getInstance().m5031m(obj.toString()).getNullSupporte().getBoolean()) {
                    return new WDBooleen(true);
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return new WDBooleen(false);
    }

    public C0775c getRubriqueSansCasseNiAccent(String str) {
        C0775c c0775c = (eb) mo2718a(str);
        if (c0775c == null) {
            c0775c = m3769r(str);
            if (c0775c == null) {
                try {
                    WDErreurManager.m2883a(C0745b.m3222b(rf[13], str, mo2719a()));
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        }
        return c0775c;
    }

    /* renamed from: h */
    public void mo2750h(eb ebVar) {
        try {
            if (mo2721b(ebVar.mo3137b()) == null) {
                super.mo2750h(ebVar);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public final boolean hb() {
        return this.ff;
    }

    public boolean isRequete() {
        return true;
    }

    public void kb() {
        try {
            if (!this.ff) {
                WDErreurManager.m2883a(C0745b.m3222b(rf[47], mo2719a()));
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public final String lb() {
        return this.Oe;
    }

    public final boolean mb() {
        return this.qf;
    }

    /* renamed from: r */
    public C0866a m3769r(String str) {
        try {
            if (this.ef == null || this.ef.size() <= 0) {
                return null;
            }
            return (C0866a) this.ef.get(C0808l.m4057o(str.toLowerCase()));
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void release() {
        super.release();
        this.Oe = null;
        this.Ve = null;
        if (this.ef != null) {
            for (C0866a c0866a : this.ef.values()) {
                if (c0866a != null) {
                    try {
                        c0866a.release();
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
            this.ef.clear();
            this.ef = null;
        }
        this.Pe = null;
        this.Ye = null;
        this.Xe = null;
        this.Te = null;
    }

    final void sb() {
        try {
            if (hb()) {
                this.qf = true;
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void setNomPhysique(String str) {
    }

    /* renamed from: t */
    public void m3770t(String str) {
        int i = 0;
        try {
            if (this.Te != null) {
                if (!this.Te.getCodeSQLOriginal().equals(str)) {
                    this.Te = null;
                }
            }
            if (str.indexOf(rf[14]) >= 0) {
                StringBuilder stringBuilder = new StringBuilder(str.length());
                String[] m = C0808l.m4055m(str);
                int i2 = 0;
                while (i2 < m.length) {
                    try {
                        if (!m[i2].trim().startsWith(rf[14])) {
                            try {
                                if (stringBuilder.length() > 0) {
                                    stringBuilder.append(rf[15]);
                                }
                                stringBuilder.append(m[i2]);
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                        i2++;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                }
                this.Oe = stringBuilder.toString();
            } else {
                this.Oe = str;
            }
            String[] a = C0855h.m5972a(str);
            if (a != null) {
                try {
                    if (a.length > 0) {
                        this.ef = new LinkedHashMap();
                        while (i < a.length) {
                            this.ef.put(C0808l.m4057o(a[i].toLowerCase()), new C0866a(a[i], this));
                            i++;
                        }
                    }
                } catch (NumberFormatException e222) {
                    throw e222;
                }
            }
        } catch (NumberFormatException e2222) {
            throw e2222;
        } catch (NumberFormatException e22222) {
            throw e22222;
        }
    }

    /* renamed from: v */
    public C0832f mo2753v() {
        if (this.de == null) {
            this.de = WDHF_Contexte.getInstance().m5043x();
            try {
                if (this.de.mo2994k()) {
                    this.ue = (byte) 2;
                } else {
                    this.ue = (byte) 1;
                    this.we = this.de.mo2917d(mo2719a());
                }
            } catch (WDJNIException e) {
                WDHF_Manager.m5075a(e, this.de);
            } catch (C0841b e2) {
                WDErreurManager.m2883a(rf[6]);
            }
        }
        return this.de;
    }
}
