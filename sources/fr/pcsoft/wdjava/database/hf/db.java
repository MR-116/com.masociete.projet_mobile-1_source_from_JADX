package fr.pcsoft.wdjava.database.hf;

import android.support.v4.media.session.PlaybackStateCompat;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.parcours.hf.WDParcoursFichier;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.collection.C0582d;
import fr.pcsoft.wdjava.core.types.collection.tableau.C0758k;
import fr.pcsoft.wdjava.core.types.database.C0775c;
import fr.pcsoft.wdjava.core.types.database.C0776b;
import fr.pcsoft.wdjava.core.types.database.WDSourceDonnees;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.C0820x;
import fr.pcsoft.wdjava.core.utils.bb;
import fr.pcsoft.wdjava.core.utils.xb;
import fr.pcsoft.wdjava.database.hf.p049c.C0832f;
import fr.pcsoft.wdjava.database.hf.p049c.C0841b;
import fr.pcsoft.wdjava.database.hf.p049c.C0843d;
import fr.pcsoft.wdjava.database.hf.p049c.C0845h;
import fr.pcsoft.wdjava.database.hf.p053f.C0854e;
import fr.pcsoft.wdjava.database.hf.requete.C0778b;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0901s;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.jni.WDJaugeJNI;
import fr.pcsoft.wdjava.p058k.C0931b;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class db extends C0775c implements ab, C0542t, C0777g {
    private static final String[] Ee;
    private static WDHF_Connexion Ud = new WDHF_Connexion(m3596z(m3597z("\u000f;\b.QoV\u0007)FjG\u001c:OK\u00165-\u000f")), 16);
    private static final String[] Wd = new String[]{Ee[14], Ee[8], Ee[20], Ee[10]};
    private static final String ce = m3596z(m3597z("\u000fO\u001b)MdY\u00111KsH\r9^sW\n K~L\n$K\u000f"));
    private static final char[] ee = new char[]{' ', '(', ')', '<', '=', '>', C0931b.f2545c, '~'};
    protected boolean Ae;
    private ArrayList Be;
    private String Ce;
    protected boolean De;
    protected HashMap Rd;
    protected String Sd;
    protected LinkedHashMap<String, eb> Td;
    protected eb Vd;
    private int Xd;
    protected boolean Yd;
    protected db Zd;
    protected eb ae;
    protected String be;
    protected C0832f de;
    protected boolean fe;
    private boolean ge;
    protected Object[] he;
    protected Object[] ie;
    private int je;
    protected boolean ke;
    private String le;
    protected boolean me;
    protected Boolean ne;
    protected boolean oe;
    protected boolean pe;
    protected Object[] qe;
    private String re;
    protected int se;
    protected String te;
    protected byte ue;
    protected C0861n ve;
    protected long we;
    private int xe;
    private boolean ye;
    protected eb ze;

    static {
        r0 = new String[86];
        r0[0] = m3596z(m3597z("\u000fP\u00004BcI\n3QbM\u0012)KbJ"));
        r0[1] = m3596z(m3597z("\u000f^\u00108MxQ\u00108Qd^\u0000#@eI\n3CiV\u000b"));
        r0[2] = m3596z(m3597z("\u000f]\r$KyJ\u0000>HsY\u00118[`]\u00002KoT\u001e$OxQ\u00108"));
        r0[3] = m3596z(m3597z("\u000f]\r$KyJ\u0000>HsJ\n4\\eI\n3QeV\u001c9@bM\u001a"));
        r0[4] = m3596z(m3597z("\u000fY\u001c5KG\u000f$A|J\u00163ZiG\u0019?MdQ\u001a$"));
        r0[5] = m3596z(m3597z("\u000f]\r$Qd^\u00000GoP\u00163\\s]\u0007?]xY\u0011\""));
        r0[6] = m3596z(m3597z("i{7\u0013m\f|:VbM8-mYh¶\u0004oXq0\u0018.Hm!Jd~\u00002Lm{<\u0013}_8>\u0005}C{6.Mm\u0010gOp6\u0013|"));
        r0[7] = m3596z(m3597z("\u000f]\r$KyJ\u0000>Hs^\u0016:Z~]\u00005BmM\f3QjJ\u0010;"));
        r0[8] = m3596z(m3597z("iL"));
        r0[9] = m3596z(m3597z("\u000f]\r$KyJ\u0000>Hs^\u0016:ZiG\u000e#Ax]\u0000;ObI\n7@x]"));
        r0[10] = m3596z(m3597z("cM"));
        r0[11] = m3596z(m3597z("\u000f]\r$KyJ\u0000>Hs^\u0016:Z~]\u0000;AxG\u00168@mL\u001a8Jy"));
        r0[12] = m3596z(m3597z("RE"));
        r0[13] = m3596z(m3597z("\f%"));
        r0[14] = m3596z(m3597z("mV\u001b"));
        r0[15] = m3596z(m3597z("\u000f]\r$KyJ\u0000>Hs^\u0016:Z~]\u00009^iJ\u001e\"KyJ\u0000?@x]\r2Gx"));
        r0[16] = m3596z(m3597z("\t?"));
        r0[17] = m3596z(m3597z("\fT\u0016=K\f"));
        r0[18] = m3596z(m3597z("\u000b="));
        r0[19] = m3596z(m3597z("q%"));
        r0[20] = m3596z(m3597z("cJ"));
        r0[21] = m3596z(m3597z("\u000fH\r9^~Q\u001a\"KsT\u001a5ZyJ\u001a)]iM\u00133"));
        r0[22] = m3596z(m3597z("\u000f]\r$KyJ\u0000>HsV\n;QiV\r3IsQ\u0011 O`Q\u001b3"));
        r0[23] = m3596z(m3597z("\u000f]\r$KyJ\u0000>HsV\n;QiV\r3IsV\u001a1OxQ\u0019"));
        r0[24] = m3596z(m3597z("\u000f]\r$KyJ\u0000>HsY\n5[bG\u001a8\\i_\u00005AyJ\u001e8Z"));
        r0[25] = m3596z(m3597z("\u000f]\r$KyJ\u0000>Hs^\u00165Fe]\r)Bi[\u000b#\\iG\f3[`]"));
        r0[26] = m3596z(m3597z("\u000f]\r$KyJ\u0000>HsU\u00102GjG\u000f$A|G\u0019?MdQ\u001a$"));
        r0[27] = m3596z(m3597z("\u00008"));
        r0[28] = m3596z(m3597z("\fO\u00173\\i8w"));
        r0[29] = m3596z(m3597z("\u000f]\r$KyJ\u0000>HsQ\u001b)OyL\u0010)@i_\u001e\"Gj"));
        r0[30] = m3596z(m3597z("\fY\u00112."));
        r0[31] = m3596z(m3597z("yH\u001b7Zi8"));
        r0[32] = m3596z(m3597z("\u000f]\r$QjW\r5KsQ\u001b)OyL\u0010)]}T\f3\\z]\r"));
        r0[33] = m3596z(m3597z("\fK\u001a\"."));
        r0[34] = m3596z(m3597z("\f%I"));
        r0[35] = m3596z(m3597z("\f%8[`T"));
        r0[36] = m3596z(m3597z("\fO\u00173\\i8"));
        r0[37] = m3596z(m3597z("\f[\u0010#@x0u_."));
        r0[38] = m3596z(m3597z("m{<\u0013}\fP&\u0006k^8\u0019\u001fbI86\u001b~Ck,\u001fl@}q"));
        r0[39] = m3596z(m3597z("\u000f]\r$Qd^\u0000$[nJ\u0016'[iG\u000b7L`]\u001e#QeV\u000b3\\hQ\u000b3"));
        r0[40] = m3596z(m3597z("\u000fP\u0000;AhQ\u0019?KsK\u000b$[oL\n$K"));
        r0[41] = m3596z(m3597z("\u000f]\r$KyJ\u0000>HsJ\n4\\eI\n3Qa]\u00129QnQ\u00117G~]"));
        r0[42] = m3596z(m3597z("\u000fY\u001c5KG\u0016;^cK\f?L`]\u0000>HsT\u00105O`"));
        r0[43] = m3596z(m3597z("\u00118"));
        r0[44] = m3596z(m3597z("\f$"));
        r0[45] = m3596z(m3597z("\f&"));
        r0[46] = m3596z(m3597z("\fQ\fV@yT\u0013"));
        r0[47] = m3596z(m3597z("\fQ\fV@cL8[`T"));
        r0[48] = m3596z(m3597z("\fW\rV"));
        r0[49] = m3596z(m3597z("\f$"));
        r0[50] = m3596z(m3597z("\f&bV"));
        r0[51] = m3596z(m3597z("\f$bV"));
        r0[52] = m3596z(m3597z("\f&"));
        r0[53] = m3596z(m3597z("\u000f]\r$KyJ\u0000>Hs[\u00108@i@\u00169@sQ\u00115AbV\n3"));
        r0[54] = m3596z(m3597z("\u000f]\r$KyJ\u0000>Hs^\u0016:Z~]\u0000?@eL\u00000G`L\r3"));
        r0[55] = m3596z(m3597z("\fY\u00112.\u0004"));
        r0[56] = m3596z(m3597z("\f("));
        r0[57] = m3596z(m3597z("\u000fP\u0000%[|H\r?CiG\u000b9[x"));
        r0[58] = m3596z(m3597z("\fW\r2K~8\u001d/."));
        r0[59] = m3596z(m3597z("!\u0012"));
        r0[60] = m3596z(m3597z("\u000fP\u00005FmV\u00183Q~]\u000f"));
        r0[61] = m3596z(m3597z("eV\f3\\x8\u00168Zc8"));
        r0[62] = m3596z(m3597z("bM\u0013:"));
        r0[63] = m3596z(m3597z("\fN\u001e:[iK^"));
        r0[64] = m3596z(m3597z("\u000fP\u00002KnT\u0010'[iG\u0011#Cs]\u0011$FyV\u00139MgJ\u001a5@yU"));
        r0[65] = m3596z(m3597z("ij-\u0013{^8;\u0003|Mv+VbM8;}Åj6\u0017bEk>\u0002gCv\u0012k\ft>VjIk<\u0004g\\l6\u0019`\f|*VhE{7\u001fk^6"));
        r0[66] = m3596z(m3597z("\fW\rV&"));
        r0[67] = m3596z(m3597z("\u000f]\r$KyJ\u0000>Hs\\\u0010#L`W\u0011"));
        r0[68] = m3596z(m3597z("\u000f]\r$KyJ\u0000>Hs]\u00073MsJ\u001a'[iL\u001a"));
        r0[69] = m3596z(m3597z("\u000f]\r$KyJ\u0000>HsW\n K~L\n$Ks^\u00165Fe]\r"));
        r0[70] = m3596z(m3597z("\u000f]\r$KyJ\u00007Mo]\f)]}T\u0016\"K"));
        r0[71] = m3596z(m3597z("\u000f]\r$KyJ\u0000>HsU\u001a%]m_\u001a)LmK\u001a"));
        r0[72] = m3596z(m3597z("\u000f]\r$KyJ\u0000>HsK\u00068MdJ\u0010)ObY\u0013/]i"));
        r0[73] = m3596z(m3597z("eu/\u0019}_q=\u001ak\f|:Vm@w1\u0013|\ft:VhE{7\u001fk^8<\u0019{^y1\u0002 "));
        r0[74] = m3596z(m3597z("\u000f]\r$KyJ\u0000>HsY\n5[bG\u000f7\\oW\n$]"));
        r0[75] = m3596z(m3597z("\u000fU\u00102GjG\t7BiM\r)GhG\u001e#Zc"));
        r0[76] = m3596z(m3597z("\u000fY\n5[b]\u0000$[nJ\u0016'[iG\u001c9CaM\u00113"));
        r0[77] = m3596z(m3597z("\u000f]\r$QbZ\u0000$[nJ\u0016'[iG\u001b?Hj]\r3@x"));
        r0[78] = m3596z(m3597z("\u000fY\u000f&K`G\u00199@oL\u00169@"));
        r0[79] = m3596z(m3597z("\u000f]\r$KyJ\u0000>HsW\u000f)GbL\u001a$JeL\u001a)M`]\u00005AaH"));
        r0[80] = m3596z(m3597z("\u000fP\u00005A|Q\u001a)KbJ\u001a1"));
        r0[81] = m3596z(m3597z("\u0004D-*`\u0005ds"));
        r0[82] = m3596z(m3597z("h]\u00133Zi8\u0019$Aa8"));
        r0[83] = m3596z(m3597z("]\u00133Mx8\u001c9[bLw"));
        r0[84] = m3596z(m3597z("\u00058\u0019$Aa8"));
        r0[85] = m3596z(m3597z("\u000fT\u001a5ZyJ\u001a)^~W\u000f$GiL\u001a)He[\u0017?K~"));
        Ee = r0;
    }

    public db(String str) {
        this.te = "";
        this.re = "";
        this.le = null;
        this.be = "";
        this.Ce = null;
        this.Td = new LinkedHashMap();
        this.Vd = null;
        this.se = 0;
        this.fe = false;
        this.pe = false;
        this.Ae = true;
        this.he = null;
        this.ie = null;
        this.qe = null;
        this.ve = null;
        this.oe = false;
        this.ze = null;
        this.ae = null;
        this.Rd = null;
        this.ne = null;
        this.ke = false;
        this.De = false;
        this.de = null;
        this.ue = (byte) 0;
        this.ue = (byte) 3;
        this.we = -1;
        this.me = false;
        this.Be = null;
        this.Zd = null;
        this.Yd = true;
        this.ye = true;
        this.je = 16;
        this.Xd = -1;
        this.ge = true;
        this.xe = 0;
        this.te = str;
    }

    /* renamed from: J */
    private final db m3567J() {
        return this.Zd;
    }

    /* renamed from: Q */
    private void m3568Q() {
        try {
            if (this.de == null) {
                return;
            }
            if (this.we != -1) {
                try {
                    if (this.ue == (byte) 2) {
                        try {
                            mo2753v().mo3015n(this.we);
                            return;
                        } catch (Exception e) {
                            WDErreurManager.m2882a(e);
                            return;
                        } catch (WDJNIException e2) {
                            WDHF_Manager.m5075a(e2, mo2753v());
                            return;
                        }
                    }
                    long[] jArr;
                    Object obj = new long[this.Td.size()];
                    int i = 0;
                    for (eb ebVar : this.Td.values()) {
                        try {
                            int i2;
                            if (ebVar.m5866y() != -1) {
                                obj[i] = ebVar.m5852i();
                                ebVar.m5821a(-1);
                                i2 = i + 1;
                            } else {
                                i2 = i;
                            }
                            i = i2;
                        } catch (C0841b e3) {
                            throw e3;
                        }
                    }
                    if (i < obj.length) {
                        jArr = new long[i];
                        System.arraycopy(obj, 0, jArr, 0, i);
                    } else {
                        Object obj2 = obj;
                    }
                    try {
                        m3602E().m4660a(jArr);
                        m3602E().m4606V(this.we);
                    } catch (WDJNIException e22) {
                        WDHF_Manager.m5075a(e22, m3602E());
                    } finally {
                        this.we = -1;
                    }
                } catch (NumberFormatException e4) {
                    throw e4;
                }
            }
        } catch (C0841b e32) {
            throw e32;
        } catch (C0841b e322) {
            throw e322;
        }
    }

    /* renamed from: U */
    private void m3569U() {
        if (this.ve != null) {
            eb ebVar = (eb) mo2721b(this.ve.m6081b());
            if (ebVar != null) {
                try {
                    if (!ebVar.m5862u()) {
                        return;
                    }
                    if (ebVar.m5855l() != null) {
                        ebVar.m5855l().m6029a(this.se);
                        ebVar.m5855l().m6043b(true);
                    }
                } catch (NumberFormatException e) {
                    throw e;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
        }
    }

    /* renamed from: a */
    private int m3570a(String str, int i) {
        int i2 = 0;
        int i3 = i + 1;
        int length = str.length();
        while (i3 >= 0 && i3 < length) {
            try {
                if (!Character.isWhitespace(str.charAt(i3))) {
                    break;
                }
                i3++;
                i2++;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private WDObjet m3571a(eb ebVar, WDObjet wDObjet) {
        if (wDObjet != null) {
            try {
                C0582d c0582d = (C0582d) wDObjet.checkType(C0582d.class);
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        c0582d = null;
        try {
            if (ebVar.m5853j() && c0582d != null) {
                wDObjet = WDHF_Manager.m5128b((WDObjet) this, (WDObjet) ebVar, C0725i.m3041a(xb.m4187a(c0582d)));
            }
            return wDObjet;
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    static final db m3572a(C0820x c0820x) throws IOException {
        db dbVar = new db(c0820x.m4185a());
        dbVar.m3718k(c0820x.m4185a());
        dbVar.m3694d(c0820x.m4185a());
        dbVar.m3712h(c0820x.readBoolean());
        int readInt = c0820x.readInt();
        int i = 0;
        while (i < readInt) {
            try {
                dbVar.mo2750h(eb.m5790a(c0820x));
                i++;
            } catch (IOException e) {
                throw e;
            }
        }
        dbVar.ge = false;
        return dbVar;
    }

    /* renamed from: a */
    public static final db m3573a(byte[] bArr) {
        Closeable c0820x;
        Exception e;
        Throwable th;
        db dbVar = null;
        try {
            c0820x = new C0820x(new ByteArrayInputStream(bArr));
            try {
                dbVar = m3572a((C0820x) c0820x);
                bb.m3844a(c0820x);
            } catch (IOException e2) {
                e = e2;
                try {
                    C0691a.m2857a(Ee[65], e);
                    bb.m3844a(c0820x);
                    return dbVar;
                } catch (Throwable th2) {
                    th = th2;
                    bb.m3844a(c0820x);
                    throw th;
                }
            }
        } catch (IOException e3) {
            e = e3;
            c0820x = dbVar;
            C0691a.m2857a(Ee[65], e);
            bb.m3844a(c0820x);
            return dbVar;
        } catch (Throwable th3) {
            c0820x = dbVar;
            th = th3;
            bb.m3844a(c0820x);
            throw th;
        }
        return dbVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    private java.lang.String m3574a(java.lang.String r23, java.util.LinkedList r24) {
        /*
        r22 = this;
        r14 = new java.lang.StringBuffer;
        r2 = "";
        r14.<init>(r2);
        r12 = 0;
        r11 = 0;
        r10 = 0;
        r9 = "";
        r8 = "";
        r7 = "";
        r6 = 0;
        r5 = 0;
        r2 = 0;
        r3 = 0;
        r15 = r23.length();
        r16 = r22.m3616V();
    L_0x001c:
        if (r12 >= r15) goto L_0x0562;
    L_0x001e:
        r0 = r23;
        r4 = r0.charAt(r12);
        switch(r4) {
            case 32: goto L_0x041b;
            case 39: goto L_0x004a;
            case 40: goto L_0x01c2;
            case 41: goto L_0x01db;
            case 60: goto L_0x01f4;
            case 61: goto L_0x035b;
            case 62: goto L_0x0257;
            case 93: goto L_0x03bb;
            case 126: goto L_0x02b4;
            default: goto L_0x0027;
        };
    L_0x0027:
        r4 = new java.lang.StringBuffer;
        r13 = "";
        r4.<init>(r13);
        r13 = r12;
    L_0x002f:
        if (r13 >= r15) goto L_0x0431;
    L_0x0031:
        r12 = ee;
        r0 = r23;
        r17 = r0.charAt(r13);
        r0 = r17;
        r12 = java.util.Arrays.binarySearch(r12, r0);	 Catch:{ NumberFormatException -> 0x042f }
        if (r12 >= 0) goto L_0x0431;
    L_0x0041:
        r0 = r17;
        r4.append(r0);	 Catch:{ NumberFormatException -> 0x042f }
        r12 = r13 + 1;
        r13 = r12;
        goto L_0x002f;
    L_0x004a:
        r13 = new java.lang.StringBuffer;
        r4 = "";
        r13.<init>(r4);
        r12 = r12 + 1;
        r0 = r23;
        r0.charAt(r12);
    L_0x0058:
        if (r12 >= r15) goto L_0x006e;
    L_0x005a:
        r0 = r23;
        r4 = r0.charAt(r12);
        r17 = 39;
        r0 = r17;
        if (r4 == r0) goto L_0x006e;
    L_0x0066:
        r13.append(r4);	 Catch:{ NumberFormatException -> 0x006c }
        r12 = r12 + 1;
        goto L_0x0058;
    L_0x006c:
        r2 = move-exception;
        throw r2;
    L_0x006e:
        if (r12 < r15) goto L_0x00a1;
    L_0x0070:
        r4 = Ee;	 Catch:{ NumberFormatException -> 0x009f }
        r13 = 9;
        r4 = r4[r13];	 Catch:{ NumberFormatException -> 0x009f }
        r13 = 0;
        r13 = new java.lang.String[r13];	 Catch:{ NumberFormatException -> 0x009f }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r13);	 Catch:{ NumberFormatException -> 0x009f }
        r0 = r22;
        r0.m3595n(r4);	 Catch:{ NumberFormatException -> 0x009f }
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r20 = r3;
        r3 = r2;
        r2 = r20;
    L_0x008f:
        r12 = r11 + 1;
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r7;
        r7 = r6;
        r6 = r5;
        r5 = r4;
        r20 = r3;
        r3 = r2;
        r2 = r20;
        goto L_0x001c;
    L_0x009f:
        r2 = move-exception;
        throw r2;
    L_0x00a1:
        if (r5 != 0) goto L_0x00a5;
    L_0x00a3:
        if (r2 == 0) goto L_0x00c6;
    L_0x00a5:
        r4 = Ee;	 Catch:{ NumberFormatException -> 0x00f5 }
        r17 = 11;
        r4 = r4[r17];	 Catch:{ NumberFormatException -> 0x00f5 }
        r17 = 1;
        r0 = r17;
        r0 = new java.lang.String[r0];	 Catch:{ NumberFormatException -> 0x00f5 }
        r17 = r0;
        r18 = 0;
        r19 = r13.toString();	 Catch:{ NumberFormatException -> 0x00f5 }
        r17[r18] = r19;	 Catch:{ NumberFormatException -> 0x00f5 }
        r0 = r17;
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r0);	 Catch:{ NumberFormatException -> 0x00f5 }
        r0 = r22;
        r0.m3595n(r4);	 Catch:{ NumberFormatException -> 0x00f5 }
    L_0x00c6:
        if (r6 != 0) goto L_0x00f7;
    L_0x00c8:
        r6 = 1;
    L_0x00c9:
        if (r6 == 0) goto L_0x00f9;
    L_0x00cb:
        r5 = 1;
        r3 = 0;
        r4 = 39;
        r4 = r14.append(r4);
        r7 = r13.toString();
        r4 = r4.append(r7);
        r7 = 39;
        r4.append(r7);
        r4 = r5;
        r20 = r2;
        r2 = r3;
        r3 = r20;
    L_0x00e6:
        r5 = r13.toString();
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r20 = r5;
        r5 = r6;
        r6 = r20;
        goto L_0x008f;
    L_0x00f5:
        r2 = move-exception;
        throw r2;
    L_0x00f7:
        r6 = 0;
        goto L_0x00c9;
    L_0x00f9:
        r4 = 1;
        r2 = "]";
        r2 = r9.equals(r2);	 Catch:{ NumberFormatException -> 0x012d }
        if (r2 != 0) goto L_0x010e;
    L_0x0102:
        r2 = Ee;	 Catch:{ NumberFormatException -> 0x012f }
        r17 = 12;
        r2 = r2[r17];	 Catch:{ NumberFormatException -> 0x012f }
        r2 = r9.equals(r2);	 Catch:{ NumberFormatException -> 0x012f }
        if (r2 == 0) goto L_0x0131;
    L_0x010e:
        r2 = Ee;	 Catch:{ NumberFormatException -> 0x012f }
        r7 = 18;
        r2 = r2[r7];	 Catch:{ NumberFormatException -> 0x012f }
        r2 = r14.append(r2);	 Catch:{ NumberFormatException -> 0x012f }
        r7 = r13.toString();	 Catch:{ NumberFormatException -> 0x012f }
        r2 = r2.append(r7);	 Catch:{ NumberFormatException -> 0x012f }
        r7 = Ee;	 Catch:{ NumberFormatException -> 0x012f }
        r17 = 16;
        r7 = r7[r17];	 Catch:{ NumberFormatException -> 0x012f }
        r2.append(r7);	 Catch:{ NumberFormatException -> 0x012f }
        r2 = r3;
        r3 = r4;
        r4 = r5;
        goto L_0x00e6;
    L_0x012d:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x012f }
    L_0x012f:
        r2 = move-exception;
        throw r2;
    L_0x0131:
        r2 = Ee;	 Catch:{ NumberFormatException -> 0x0160 }
        r17 = 19;
        r2 = r2[r17];	 Catch:{ NumberFormatException -> 0x0160 }
        r2 = r9.equals(r2);	 Catch:{ NumberFormatException -> 0x0160 }
        if (r2 == 0) goto L_0x0162;
    L_0x013d:
        r2 = 39;
        r2 = r14.append(r2);	 Catch:{ NumberFormatException -> 0x0160 }
        r13 = r13.toString();	 Catch:{ NumberFormatException -> 0x0160 }
        r2 = r2.append(r13);	 Catch:{ NumberFormatException -> 0x0160 }
        r13 = Ee;	 Catch:{ NumberFormatException -> 0x0160 }
        r17 = 16;
        r13 = r13[r17];	 Catch:{ NumberFormatException -> 0x0160 }
        r2.append(r13);	 Catch:{ NumberFormatException -> 0x0160 }
        r2 = r3;
        r3 = r4;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        goto L_0x008f;
    L_0x0160:
        r2 = move-exception;
        throw r2;
    L_0x0162:
        r7 = r13.toString();
        r2 = r24.size();	 Catch:{ NumberFormatException -> 0x01a3 }
        if (r2 <= 0) goto L_0x01a5;
    L_0x016c:
        r2 = r24.getLast();	 Catch:{ NumberFormatException -> 0x01a3 }
    L_0x0170:
        r2 = (java.lang.String) r2;
        r2 = (java.lang.String) r2;
        r0 = r22;
        r2 = r0.mo2721b(r2);
        r2 = (fr.pcsoft.wdjava.database.hf.eb) r2;
        if (r2 == 0) goto L_0x01aa;
    L_0x017e:
        r17 = r2.m5856m();	 Catch:{ NumberFormatException -> 0x01a8 }
        if (r17 == 0) goto L_0x01aa;
    L_0x0184:
        r17 = new fr.pcsoft.wdjava.core.types.WDChaine;	 Catch:{ NumberFormatException -> 0x01a8 }
        r0 = r17;
        r0.<init>(r7);	 Catch:{ NumberFormatException -> 0x01a8 }
        r0 = r17;
        r7 = r2.m5817a(r0);	 Catch:{ NumberFormatException -> 0x01a8 }
        r17 = 0;
        r0 = r16;
        r1 = r17;
        r2 = r0.mo3173a(r2, r7, r1);	 Catch:{ NumberFormatException -> 0x01a8 }
        r14.append(r2);	 Catch:{ NumberFormatException -> 0x01a8 }
        r2 = r3;
        r3 = r4;
        r4 = r5;
        goto L_0x00e6;
    L_0x01a3:
        r2 = move-exception;
        throw r2;
    L_0x01a5:
        r2 = "";
        goto L_0x0170;
    L_0x01a8:
        r2 = move-exception;
        throw r2;
    L_0x01aa:
        r2 = 39;
        r2 = r14.append(r2);
        r7 = r13.toString();
        r2 = r2.append(r7);
        r7 = 39;
        r2.append(r7);
        r2 = r3;
        r3 = r4;
        r4 = r5;
        goto L_0x00e6;
    L_0x01c2:
        r4 = 40;
        r14.append(r4);
        r4 = r11 + 1;
        r11 = r12;
        r20 = r2;
        r2 = r3;
        r3 = r20;
        r21 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r4;
        r4 = r5;
        r5 = r21;
        goto L_0x008f;
    L_0x01db:
        r4 = 41;
        r14.append(r4);
        r4 = r10 + 1;
        r10 = r11;
        r11 = r12;
        r20 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r4;
        r4 = r20;
        r21 = r3;
        r3 = r2;
        r2 = r21;
        goto L_0x008f;
    L_0x01f4:
        r14.append(r4);
        r9 = java.lang.String.valueOf(r4);
        r0 = r22;
        r1 = r23;
        r4 = r0.m3570a(r1, r12);
        r13 = r12 + 1;
        r13 = r13 + r4;
        r0 = r23;
        r13 = r0.charAt(r13);
        r17 = 61;
        r0 = r17;
        if (r13 == r0) goto L_0x0218;
    L_0x0212:
        r17 = 62;
        r0 = r17;
        if (r13 != r0) goto L_0x022f;
    L_0x0218:
        r14.append(r13);
        r4 = r4 + 1;
        r12 = r12 + r4;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4 = r4.append(r9);
        r4 = r4.append(r13);
        r9 = r4.toString();
    L_0x022f:
        if (r5 != 0) goto L_0x0246;
    L_0x0231:
        r4 = Ee;	 Catch:{ NumberFormatException -> 0x0255 }
        r5 = 11;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0255 }
        r5 = 1;
        r5 = new java.lang.String[r5];	 Catch:{ NumberFormatException -> 0x0255 }
        r13 = 0;
        r5[r13] = r9;	 Catch:{ NumberFormatException -> 0x0255 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ NumberFormatException -> 0x0255 }
        r0 = r22;
        r0.m3595n(r4);	 Catch:{ NumberFormatException -> 0x0255 }
    L_0x0246:
        r4 = 0;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r20 = r2;
        r2 = r3;
        r3 = r20;
        goto L_0x008f;
    L_0x0255:
        r2 = move-exception;
        throw r2;
    L_0x0257:
        r14.append(r4);
        r9 = java.lang.String.valueOf(r4);
        r0 = r22;
        r1 = r23;
        r4 = r0.m3570a(r1, r12);
        r13 = r12 + 1;
        r13 = r13 + r4;
        r0 = r23;
        r13 = r0.charAt(r13);
        r17 = 61;
        r0 = r17;
        if (r13 != r0) goto L_0x028c;
    L_0x0275:
        r14.append(r13);
        r4 = r4 + 1;
        r12 = r12 + r4;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4 = r4.append(r9);
        r4 = r4.append(r13);
        r9 = r4.toString();
    L_0x028c:
        if (r5 != 0) goto L_0x02a3;
    L_0x028e:
        r4 = Ee;	 Catch:{ NumberFormatException -> 0x02b2 }
        r5 = 11;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x02b2 }
        r5 = 1;
        r5 = new java.lang.String[r5];	 Catch:{ NumberFormatException -> 0x02b2 }
        r13 = 0;
        r5[r13] = r9;	 Catch:{ NumberFormatException -> 0x02b2 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ NumberFormatException -> 0x02b2 }
        r0 = r22;
        r0.m3595n(r4);	 Catch:{ NumberFormatException -> 0x02b2 }
    L_0x02a3:
        r4 = 0;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r20 = r2;
        r2 = r3;
        r3 = r20;
        goto L_0x008f;
    L_0x02b2:
        r2 = move-exception;
        throw r2;
    L_0x02b4:
        r9 = java.lang.String.valueOf(r4);
        r0 = r22;
        r1 = r23;
        r4 = r0.m3570a(r1, r12);
        r13 = r12 + 1;
        r13 = r13 + r4;
        r0 = r23;
        r13 = r0.charAt(r13);
        r17 = 61;
        r0 = r17;
        if (r13 == r0) goto L_0x02db;
    L_0x02cf:
        r17 = 126; // 0x7e float:1.77E-43 double:6.23E-322;
        r0 = r17;
        if (r13 == r0) goto L_0x02db;
    L_0x02d5:
        r17 = 93;
        r0 = r17;
        if (r13 != r0) goto L_0x0318;
    L_0x02db:
        r4 = r4 + 1;
        r12 = r12 + r4;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4 = r4.append(r9);
        r4 = r4.append(r13);
        r9 = r4.toString();
    L_0x02ef:
        switch(r13) {
            case 61: goto L_0x0336;
            case 93: goto L_0x034f;
            case 126: goto L_0x0336;
            default: goto L_0x02f2;
        };
    L_0x02f2:
        if (r5 != 0) goto L_0x0309;
    L_0x02f4:
        r4 = Ee;	 Catch:{ NumberFormatException -> 0x0359 }
        r5 = 11;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0359 }
        r5 = 1;
        r5 = new java.lang.String[r5];	 Catch:{ NumberFormatException -> 0x0359 }
        r13 = 0;
        r5[r13] = r9;	 Catch:{ NumberFormatException -> 0x0359 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ NumberFormatException -> 0x0359 }
        r0 = r22;
        r0.m3595n(r4);	 Catch:{ NumberFormatException -> 0x0359 }
    L_0x0309:
        r4 = 0;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r20 = r2;
        r2 = r3;
        r3 = r20;
        goto L_0x008f;
    L_0x0318:
        r4 = Ee;
        r17 = 11;
        r4 = r4[r17];
        r17 = 1;
        r0 = r17;
        r0 = new java.lang.String[r0];
        r17 = r0;
        r18 = 0;
        r17[r18] = r9;
        r0 = r17;
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r0);
        r0 = r22;
        r0.m3595n(r4);
        goto L_0x02ef;
    L_0x0336:
        r4 = Ee;	 Catch:{ NumberFormatException -> 0x034d }
        r13 = 15;
        r4 = r4[r13];	 Catch:{ NumberFormatException -> 0x034d }
        r13 = 1;
        r13 = new java.lang.String[r13];	 Catch:{ NumberFormatException -> 0x034d }
        r17 = 0;
        r13[r17] = r9;	 Catch:{ NumberFormatException -> 0x034d }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r13);	 Catch:{ NumberFormatException -> 0x034d }
        r0 = r22;
        r0.m3595n(r4);	 Catch:{ NumberFormatException -> 0x034d }
        goto L_0x02f2;
    L_0x034d:
        r2 = move-exception;
        throw r2;
    L_0x034f:
        r4 = Ee;
        r13 = 17;
        r4 = r4[r13];
        r14.append(r4);
        goto L_0x02f2;
    L_0x0359:
        r2 = move-exception;
        throw r2;
    L_0x035b:
        r9 = java.lang.String.valueOf(r4);
        r0 = r22;
        r1 = r23;
        r4 = r0.m3570a(r1, r12);
        r13 = r12 + 1;
        r13 = r13 + r4;
        r0 = r23;
        r13 = r0.charAt(r13);
        r17 = 61;
        r0 = r17;
        if (r13 != r0) goto L_0x038a;
    L_0x0376:
        r4 = r4 + 1;
        r12 = r12 + r4;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4 = r4.append(r9);
        r4 = r4.append(r13);
        r9 = r4.toString();
    L_0x038a:
        r4 = Ee;	 Catch:{ NumberFormatException -> 0x03b9 }
        r13 = 13;
        r4 = r4[r13];	 Catch:{ NumberFormatException -> 0x03b9 }
        r14.append(r4);	 Catch:{ NumberFormatException -> 0x03b9 }
        if (r5 != 0) goto L_0x03aa;
    L_0x0395:
        r4 = Ee;	 Catch:{ NumberFormatException -> 0x03b9 }
        r5 = 11;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x03b9 }
        r5 = 1;
        r5 = new java.lang.String[r5];	 Catch:{ NumberFormatException -> 0x03b9 }
        r13 = 0;
        r5[r13] = r9;	 Catch:{ NumberFormatException -> 0x03b9 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ NumberFormatException -> 0x03b9 }
        r0 = r22;
        r0.m3595n(r4);	 Catch:{ NumberFormatException -> 0x03b9 }
    L_0x03aa:
        r4 = 0;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r20 = r2;
        r2 = r3;
        r3 = r20;
        goto L_0x008f;
    L_0x03b9:
        r2 = move-exception;
        throw r2;
    L_0x03bb:
        r9 = java.lang.String.valueOf(r4);
        r0 = r22;
        r1 = r23;
        r4 = r0.m3570a(r1, r12);
        r13 = r12 + 1;
        r13 = r13 + r4;
        r0 = r23;
        r13 = r0.charAt(r13);
        r17 = 61;
        r0 = r17;
        if (r13 != r0) goto L_0x03ea;
    L_0x03d6:
        r4 = r4 + 1;
        r12 = r12 + r4;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r4 = r4.append(r9);
        r4 = r4.append(r13);
        r9 = r4.toString();
    L_0x03ea:
        r4 = Ee;	 Catch:{ NumberFormatException -> 0x0419 }
        r13 = 17;
        r4 = r4[r13];	 Catch:{ NumberFormatException -> 0x0419 }
        r14.append(r4);	 Catch:{ NumberFormatException -> 0x0419 }
        if (r5 != 0) goto L_0x040a;
    L_0x03f5:
        r4 = Ee;	 Catch:{ NumberFormatException -> 0x0419 }
        r5 = 11;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0419 }
        r5 = 1;
        r5 = new java.lang.String[r5];	 Catch:{ NumberFormatException -> 0x0419 }
        r13 = 0;
        r5[r13] = r9;	 Catch:{ NumberFormatException -> 0x0419 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ NumberFormatException -> 0x0419 }
        r0 = r22;
        r0.m3595n(r4);	 Catch:{ NumberFormatException -> 0x0419 }
    L_0x040a:
        r4 = 0;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r20 = r2;
        r2 = r3;
        r3 = r20;
        goto L_0x008f;
    L_0x0419:
        r2 = move-exception;
        throw r2;
    L_0x041b:
        r4 = 32;
        r14.append(r4);
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r20 = r3;
        r3 = r2;
        r2 = r20;
        goto L_0x008f;
    L_0x042f:
        r2 = move-exception;
        throw r2;
    L_0x0431:
        r12 = r4.toString();
        r4 = Wd;	 Catch:{ NumberFormatException -> 0x0491 }
        r17 = r12.toUpperCase();	 Catch:{ NumberFormatException -> 0x0491 }
        r0 = r17;
        r4 = java.util.Arrays.binarySearch(r4, r0);	 Catch:{ NumberFormatException -> 0x0491 }
        if (r4 < 0) goto L_0x04bf;
    L_0x0443:
        if (r2 != 0) goto L_0x045a;
    L_0x0445:
        r2 = Ee;	 Catch:{ NumberFormatException -> 0x0493 }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x0493 }
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ NumberFormatException -> 0x0493 }
        r4 = 0;
        r3[r4] = r12;	 Catch:{ NumberFormatException -> 0x0493 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ NumberFormatException -> 0x0493 }
        r0 = r22;
        r0.m3595n(r2);	 Catch:{ NumberFormatException -> 0x0493 }
    L_0x045a:
        r2 = 0;
        r3 = Ee;	 Catch:{ NumberFormatException -> 0x0495 }
        r4 = 8;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0495 }
        r3 = r12.equalsIgnoreCase(r3);	 Catch:{ NumberFormatException -> 0x0495 }
        if (r3 != 0) goto L_0x0473;
    L_0x0467:
        r3 = Ee;	 Catch:{ NumberFormatException -> 0x0497 }
        r4 = 14;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0497 }
        r3 = r12.equalsIgnoreCase(r3);	 Catch:{ NumberFormatException -> 0x0497 }
        if (r3 == 0) goto L_0x0499;
    L_0x0473:
        r3 = Ee;	 Catch:{ NumberFormatException -> 0x0497 }
        r4 = 14;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x0497 }
        r14.append(r3);	 Catch:{ NumberFormatException -> 0x0497 }
    L_0x047c:
        r3 = 1;
        r4 = r5;
        r5 = r6;
        r6 = r7;
        r7 = r12;
        r20 = r3;
        r3 = r2;
        r2 = r20;
    L_0x0486:
        r8 = r13 + -1;
        r20 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r8;
        r8 = r20;
        goto L_0x008f;
    L_0x0491:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0493 }
    L_0x0493:
        r2 = move-exception;
        throw r2;
    L_0x0495:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x0497 }
    L_0x0497:
        r2 = move-exception;
        throw r2;
    L_0x0499:
        r3 = Ee;	 Catch:{ NumberFormatException -> 0x04bd }
        r4 = 20;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x04bd }
        r3 = r12.equalsIgnoreCase(r3);	 Catch:{ NumberFormatException -> 0x04bd }
        if (r3 != 0) goto L_0x04b1;
    L_0x04a5:
        r3 = Ee;	 Catch:{ NumberFormatException -> 0x04bb }
        r4 = 10;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x04bb }
        r3 = r12.equalsIgnoreCase(r3);	 Catch:{ NumberFormatException -> 0x04bb }
        if (r3 == 0) goto L_0x047c;
    L_0x04b1:
        r3 = Ee;	 Catch:{ NumberFormatException -> 0x04bb }
        r4 = 20;
        r3 = r3[r4];	 Catch:{ NumberFormatException -> 0x04bb }
        r14.append(r3);	 Catch:{ NumberFormatException -> 0x04bb }
        goto L_0x047c;
    L_0x04bb:
        r2 = move-exception;
        throw r2;
    L_0x04bd:
        r2 = move-exception;
        throw r2;	 Catch:{ NumberFormatException -> 0x04bb }
    L_0x04bf:
        if (r5 != 0) goto L_0x04c3;
    L_0x04c1:
        if (r2 == 0) goto L_0x04d9;
    L_0x04c3:
        r4 = Ee;	 Catch:{ NumberFormatException -> 0x0545 }
        r7 = 11;
        r4 = r4[r7];	 Catch:{ NumberFormatException -> 0x0545 }
        r7 = 1;
        r7 = new java.lang.String[r7];	 Catch:{ NumberFormatException -> 0x0545 }
        r17 = 0;
        r7[r17] = r12;	 Catch:{ NumberFormatException -> 0x0545 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r7);	 Catch:{ NumberFormatException -> 0x0545 }
        r0 = r22;
        r0.m3595n(r4);	 Catch:{ NumberFormatException -> 0x0545 }
    L_0x04d9:
        if (r6 != 0) goto L_0x0547;
    L_0x04db:
        r6 = 1;
    L_0x04dc:
        if (r6 == 0) goto L_0x0549;
    L_0x04de:
        r5 = 1;
        r3 = 0;
    L_0x04e0:
        r4 = 1;
        java.lang.Double.parseDouble(r12);	 Catch:{ NumberFormatException -> 0x054b }
    L_0x04e4:
        if (r4 != 0) goto L_0x0554;
    L_0x04e6:
        r4 = r22.m3721l();	 Catch:{ NumberFormatException -> 0x054e }
        if (r4 != 0) goto L_0x0550;
    L_0x04ec:
        r4 = fr.pcsoft.wdjava.core.utils.C0808l.m4057o(r12);	 Catch:{ NumberFormatException -> 0x054e }
    L_0x04f0:
        r14.append(r4);
        r4 = 46;
        r4 = r12.indexOf(r4);
        if (r4 < 0) goto L_0x05e8;
    L_0x04fb:
        r7 = 0;
        r7 = r12.substring(r7, r4);
        r17 = r22.mo2719a();	 Catch:{ NumberFormatException -> 0x0552 }
        r18 = 20;
        r0 = r17;
        r1 = r18;
        r17 = fr.pcsoft.wdjava.core.utils.C0808l.m4042c(r0, r7, r1);	 Catch:{ NumberFormatException -> 0x0552 }
        if (r17 == 0) goto L_0x052b;
    L_0x0510:
        r17 = Ee;	 Catch:{ NumberFormatException -> 0x0552 }
        r18 = 7;
        r17 = r17[r18];	 Catch:{ NumberFormatException -> 0x0552 }
        r18 = 1;
        r0 = r18;
        r0 = new java.lang.String[r0];	 Catch:{ NumberFormatException -> 0x0552 }
        r18 = r0;
        r19 = 0;
        r18[r19] = r7;	 Catch:{ NumberFormatException -> 0x0552 }
        r7 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r17, r18);	 Catch:{ NumberFormatException -> 0x0552 }
        r0 = r22;
        r0.m3595n(r7);	 Catch:{ NumberFormatException -> 0x0552 }
    L_0x052b:
        r4 = r4 + 1;
        r7 = r12.length();
        r4 = r12.substring(r4, r7);
    L_0x0535:
        r0 = r24;
        r0.add(r4);
        r4 = r5;
        r7 = r8;
        r5 = r6;
        r6 = r12;
        r20 = r3;
        r3 = r2;
        r2 = r20;
        goto L_0x0486;
    L_0x0545:
        r2 = move-exception;
        throw r2;
    L_0x0547:
        r6 = 0;
        goto L_0x04dc;
    L_0x0549:
        r2 = 1;
        goto L_0x04e0;
    L_0x054b:
        r4 = move-exception;
        r4 = 0;
        goto L_0x04e4;
    L_0x054e:
        r2 = move-exception;
        throw r2;
    L_0x0550:
        r4 = r12;
        goto L_0x04f0;
    L_0x0552:
        r2 = move-exception;
        throw r2;
    L_0x0554:
        r14.append(r12);
        r4 = r5;
        r7 = r8;
        r5 = r6;
        r6 = r12;
        r20 = r3;
        r3 = r2;
        r2 = r20;
        goto L_0x0486;
    L_0x0562:
        if (r11 >= r10) goto L_0x057b;
    L_0x0564:
        r2 = Ee;	 Catch:{ NumberFormatException -> 0x05de }
        r4 = 11;
        r2 = r2[r4];	 Catch:{ NumberFormatException -> 0x05de }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ NumberFormatException -> 0x05de }
        r12 = 0;
        r13 = ")";
        r4[r12] = r13;	 Catch:{ NumberFormatException -> 0x05de }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r4);	 Catch:{ NumberFormatException -> 0x05de }
        r0 = r22;
        r0.m3595n(r2);	 Catch:{ NumberFormatException -> 0x05de }
    L_0x057b:
        if (r11 <= r10) goto L_0x0594;
    L_0x057d:
        r2 = Ee;	 Catch:{ NumberFormatException -> 0x05e0 }
        r4 = 11;
        r2 = r2[r4];	 Catch:{ NumberFormatException -> 0x05e0 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ NumberFormatException -> 0x05e0 }
        r10 = 0;
        r11 = "(";
        r4[r10] = r11;	 Catch:{ NumberFormatException -> 0x05e0 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r4);	 Catch:{ NumberFormatException -> 0x05e0 }
        r0 = r22;
        r0.m3595n(r2);	 Catch:{ NumberFormatException -> 0x05e0 }
    L_0x0594:
        if (r5 == 0) goto L_0x05ab;
    L_0x0596:
        r2 = Ee;	 Catch:{ NumberFormatException -> 0x05e2 }
        r4 = 11;
        r2 = r2[r4];	 Catch:{ NumberFormatException -> 0x05e2 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ NumberFormatException -> 0x05e2 }
        r5 = 0;
        r4[r5] = r7;	 Catch:{ NumberFormatException -> 0x05e2 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r4);	 Catch:{ NumberFormatException -> 0x05e2 }
        r0 = r22;
        r0.m3595n(r2);	 Catch:{ NumberFormatException -> 0x05e2 }
    L_0x05ab:
        if (r6 == 0) goto L_0x05c2;
    L_0x05ad:
        r2 = Ee;	 Catch:{ NumberFormatException -> 0x05e4 }
        r4 = 11;
        r2 = r2[r4];	 Catch:{ NumberFormatException -> 0x05e4 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ NumberFormatException -> 0x05e4 }
        r5 = 0;
        r4[r5] = r9;	 Catch:{ NumberFormatException -> 0x05e4 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r4);	 Catch:{ NumberFormatException -> 0x05e4 }
        r0 = r22;
        r0.m3595n(r2);	 Catch:{ NumberFormatException -> 0x05e4 }
    L_0x05c2:
        if (r3 == 0) goto L_0x05d9;
    L_0x05c4:
        r2 = Ee;	 Catch:{ NumberFormatException -> 0x05e6 }
        r3 = 11;
        r2 = r2[r3];	 Catch:{ NumberFormatException -> 0x05e6 }
        r3 = 1;
        r3 = new java.lang.String[r3];	 Catch:{ NumberFormatException -> 0x05e6 }
        r4 = 0;
        r3[r4] = r8;	 Catch:{ NumberFormatException -> 0x05e6 }
        r2 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ NumberFormatException -> 0x05e6 }
        r0 = r22;
        r0.m3595n(r2);	 Catch:{ NumberFormatException -> 0x05e6 }
    L_0x05d9:
        r2 = r14.toString();
        return r2;
    L_0x05de:
        r2 = move-exception;
        throw r2;
    L_0x05e0:
        r2 = move-exception;
        throw r2;
    L_0x05e2:
        r2 = move-exception;
        throw r2;
    L_0x05e4:
        r2 = move-exception;
        throw r2;
    L_0x05e6:
        r2 = move-exception;
        throw r2;
    L_0x05e8:
        r4 = r12;
        goto L_0x0535;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.db.a(java.lang.String, java.util.LinkedList):java.lang.String");
    }

    /* renamed from: a */
    private final void m3575a(int i, String str, String str2) {
        String str3 = "";
        String str4 = "";
        WDHF_Connexion a = m3629a("", false, false);
        if (a != null) {
            str3 = a.m4965m();
            str4 = a.m4961i();
        }
        WDHF_Manager.m5073a(i, str, mo2719a(), str2, str3, str4);
    }

    /* renamed from: a */
    private final void m3576a(WDHF wdhf) throws WDJNIException, C0841b {
        try {
            if (this.Vd.m5848f() == 24) {
                this.ie[this.Vd.m5854k()] = new Long(wdhf.m4598N(this.Vd.m5852i()));
            } else {
                this.ie[this.Vd.m5854k()] = new Integer(wdhf.m4596L(this.Vd.m5852i()));
            }
        } catch (WDJNIException e) {
            throw e;
        }
    }

    /* renamed from: a */
    private void m3577a(db dbVar) {
        this.Zd = dbVar;
    }

    /* renamed from: a */
    private final void m3578a(Integer num, ib ibVar) {
        try {
            if (this.Rd == null) {
                this.Rd = new HashMap();
            }
            this.Rd.put(num, ibVar);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: a */
    private final void m3579a(String str, String str2, int i, String str3) {
        String str4 = "";
        String str5 = "";
        WDHF_Connexion a = m3629a("", false, false);
        if (a != null) {
            str4 = a.m4965m();
            str5 = a.m4961i();
        }
        WDHF_Manager.m5076a(str, i, str3, mo2719a(), str2, str4, str5);
    }

    /* renamed from: a */
    private boolean m3580a(int i, boolean z) {
        boolean a;
        WDJNIException e;
        Exception e2;
        C0832f v = mo2753v();
        try {
            if (this.ue == (byte) 2) {
                C0845h c0845h = new C0845h();
                c0845h.m5760a(this.ie);
                if (this.Vd == null || z) {
                    a = v.mo2848a(c0845h, this.we, i);
                } else {
                    c0845h = v.mo2865b(c0845h, this.Vd.m5854k(), this.we, i);
                    if (c0845h != null) {
                        a = c0845h.m5766d();
                        if (a) {
                            try {
                                this.ie[this.Vd.m5854k()] = c0845h.m5765c()[0];
                            } catch (WDJNIException e3) {
                                throw e3;
                            } catch (C0841b e4) {
                                e2 = e4;
                                WDErreurManager.m2882a(e2);
                                return a;
                            } catch (WDJNIException e32) {
                                throw e32;
                            } catch (WDJNIException e5) {
                                e32 = e5;
                            }
                        }
                    }
                    a = false;
                }
            } else {
                WDHF wdhf = (WDHF) v;
                if (wdhf.m4698a(this, this.Td.values().toArray(), this.ie)) {
                    boolean z2 = wdhf.m4937z(this.we, i);
                    if (z2 && !z) {
                        try {
                            if (this.Vd != null) {
                                m3576a(wdhf);
                                a = z2;
                            }
                        } catch (WDJNIException e6) {
                            throw e6;
                        } catch (Exception e7) {
                            e2 = e7;
                            a = z2;
                            WDErreurManager.m2882a(e2);
                            return a;
                        } catch (WDJNIException e62) {
                            e32 = e62;
                            a = z2;
                        }
                    }
                    a = z2;
                }
                a = false;
            }
            if (!a) {
                WDHF_Manager.m5074a(v);
            }
        } catch (WDJNIException e622) {
            throw e622;
        } catch (Exception e72) {
            e2 = e72;
            a = false;
            WDErreurManager.m2882a(e2);
            return a;
        } catch (WDJNIException e6222) {
            e32 = e6222;
            a = false;
        }
        return a;
        WDHF_Manager.m5075a(e32, mo2753v());
        return a;
    }

    /* renamed from: a */
    private boolean m3581a(eb ebVar) {
        Exception exception;
        boolean z;
        Exception exception2;
        WDJNIException wDJNIException;
        WDJNIException wDJNIException2;
        boolean z2 = false;
        C0832f v = mo2753v();
        try {
            if (this.ue == (byte) 2) {
                C0845h H = ebVar == null ? v.mo2769H(this.we) : v.mo2976i(this.we, ebVar.m5854k());
                if (H != null) {
                    z2 = H.m5766d();
                    if (z2) {
                        if (ebVar == null) {
                            try {
                                this.ie = H.m5765c();
                            } catch (WDHF_Exception e) {
                                throw e;
                            } catch (Exception e2) {
                                exception = e2;
                                z = z2;
                                exception2 = exception;
                            } catch (WDJNIException e3) {
                                wDJNIException = e3;
                                z = z2;
                                wDJNIException2 = wDJNIException;
                                WDHF_Manager.m5075a(wDJNIException2, mo2753v());
                                return z;
                            }
                        }
                        this.ie[ebVar.m5854k()] = H.m5765c()[0];
                    }
                }
                if (!z2) {
                    WDHF_Manager.m5074a(v);
                }
                z = z2;
            } else if (ebVar == null) {
                z2 = m3602E().m4603S(this.we);
                z = z2 ? m3607K() : z2;
            } else {
                try {
                    z2 = m3602E().m4916u(this.we, ebVar.m5852i());
                } catch (WDHF_Exception e4) {
                }
                if (z2) {
                    this.ie[ebVar.m5854k()] = m3602E().m4632a(this.we, ebVar);
                    z = z2;
                } else {
                    z = z2;
                }
            }
            if (!z) {
                try {
                    WDHF_Manager.m5074a(mo2753v());
                } catch (WDHF_Exception e5) {
                    throw e5;
                } catch (C0841b e6) {
                    exception2 = e6;
                } catch (WDJNIException e7) {
                    wDJNIException2 = e7;
                    WDHF_Manager.m5075a(wDJNIException2, mo2753v());
                    return z;
                }
            }
        } catch (WDHF_Exception e8) {
            throw e8;
        } catch (WDHF_Exception e82) {
            throw e82;
        } catch (Exception e22) {
            exception = e22;
            z = z2;
            exception2 = exception;
        } catch (WDJNIException e32) {
            wDJNIException = e32;
            z = z2;
            wDJNIException2 = wDJNIException;
            WDHF_Manager.m5075a(wDJNIException2, mo2753v());
            return z;
        }
        return z;
        WDErreurManager.m2882a(exception2);
        return z;
    }

    /* renamed from: a */
    private boolean m3582a(eb ebVar, WDObjet wDObjet, boolean z, boolean z2, int i) {
        boolean a;
        WDJNIException e;
        Exception e2;
        C0832f v = mo2753v();
        try {
            if (this.ue == (byte) 2) {
                C0845h a2;
                if (z2) {
                    if (wDObjet.isMemoBinaire()) {
                        a2 = v.mo2791a(z, this.we, ebVar.m5854k(), wDObjet.getDonneeBinaire(), i);
                    } else {
                        a2 = v.mo2790a(z, this.we, ebVar.m5854k(), wDObjet.getString(), i);
                    }
                } else if (wDObjet.isMemoBinaire()) {
                    a2 = v.mo2868b(z, this.we, ebVar.m5854k(), wDObjet.getDonneeBinaire(), i);
                } else {
                    a2 = v.mo2867b(z, this.we, ebVar.m5854k(), wDObjet.getString(), i);
                }
                a = m3655a(a2, a2.m5766d());
            } else {
                long i2 = ebVar.m5852i();
                if (z2) {
                    a = m3602E().m4753b(z, this.we, i2, wDObjet, i);
                } else {
                    a = m3602E().m4708a(z, this.we, i2, wDObjet, i);
                }
                if (a && z2) {
                    try {
                        a = m3607K();
                    } catch (C0841b e3) {
                        throw e3;
                    } catch (WDJNIException e4) {
                        e = e4;
                        WDHF_Manager.m5075a(e, mo2753v());
                        if (a) {
                            try {
                                if (this.pe) {
                                    return true;
                                }
                            } catch (C0841b e32) {
                                throw e32;
                            }
                        }
                        return false;
                    } catch (C0841b e5) {
                        e2 = e5;
                    }
                }
                this.pe = m3602E().ab(this.we);
                this.Ae = m3602E().m4607W(this.we);
            }
            if (!a) {
                WDHF_Manager.m5074a(mo2753v());
            }
        } catch (C0841b e322) {
            throw e322;
        } catch (WDJNIException e6) {
            e = e6;
            a = false;
            WDHF_Manager.m5075a(e, mo2753v());
            if (a) {
                if (this.pe) {
                    return true;
                }
            }
            return false;
        } catch (C0841b e7) {
            e2 = e7;
            a = false;
        }
        if (a) {
            if (this.pe) {
                return true;
            }
        }
        return false;
        WDErreurManager.m2882a(e2);
        if (a) {
            if (this.pe) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m3583a(eb ebVar, boolean z, boolean z2, int i) {
        boolean a;
        WDJNIException e;
        Exception e2;
        C0832f v = mo2753v();
        try {
            if (this.ue == (byte) 2) {
                C0845h b;
                if (z2) {
                    b = v.mo2866b(z, this.we, ebVar.m5854k(), i);
                } else {
                    b = v.mo2918d(z, this.we, ebVar.m5854k(), i);
                }
                a = m3655a(b, b.m5766d());
            } else {
                long i2 = ebVar.m5852i();
                if (z2) {
                    a = m3602E().m4706a(z, this.we, i2, i);
                } else {
                    a = m3602E().m4752b(z, this.we, i2, i);
                }
                if (a && z2) {
                    try {
                        a = m3607K();
                    } catch (WDJNIException e3) {
                        throw e3;
                    } catch (C0841b e4) {
                        e2 = e4;
                        WDErreurManager.m2882a(e2);
                        if (a) {
                            try {
                                if (this.pe) {
                                    return true;
                                }
                            } catch (WDJNIException e32) {
                                throw e32;
                            }
                        }
                        return false;
                    } catch (WDJNIException e5) {
                        e32 = e5;
                    }
                }
                this.pe = m3602E().ab(this.we);
                this.Ae = m3602E().m4607W(this.we);
            }
            if (!a) {
                WDHF_Manager.m5074a(mo2753v());
            }
        } catch (WDJNIException e6) {
            e32 = e6;
            a = false;
            WDHF_Manager.m5075a(e32, mo2753v());
            if (a) {
                if (this.pe) {
                    return true;
                }
            }
            return false;
        } catch (C0841b e7) {
            e2 = e7;
            a = false;
            WDErreurManager.m2882a(e2);
            if (a) {
                if (this.pe) {
                    return true;
                }
            }
            return false;
        }
        if (a) {
            if (this.pe) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m3584a(eb ebVar, boolean z, boolean z2, long j, int i) {
        boolean a;
        WDJNIException e;
        Exception e2;
        C0832f v = mo2753v();
        boolean z3 = false;
        try {
            if (this.ue == (byte) 2) {
                C0845h a2;
                if (j != 1) {
                    a2 = v.mo2789a(z, this.we, ebVar.m5854k(), j, i);
                } else if (z2) {
                    a2 = v.mo2788a(z, this.we, ebVar.m5854k(), i);
                } else {
                    a2 = v.mo2900c(z, this.we, ebVar.m5854k(), i);
                }
                a = m3655a(a2, true);
            } else {
                long i2 = ebVar.m5852i();
                if (j != 1) {
                    a = m3602E().m4707a(z, this.we, i2, j, i);
                } else if (z2) {
                    a = m3602E().m4773c(z, this.we, i2, i);
                } else {
                    a = m3602E().m4789d(z, this.we, i2, i);
                }
                if (a && z2) {
                    try {
                        a = m3607K();
                    } catch (C0841b e3) {
                        throw e3;
                    } catch (WDJNIException e4) {
                        e = e4;
                        z3 = a;
                        WDHF_Manager.m5075a(e, mo2753v());
                        a = z3;
                        if (a) {
                            try {
                                if (this.pe) {
                                    return true;
                                }
                            } catch (C0841b e32) {
                                throw e32;
                            }
                        }
                        return false;
                    } catch (C0841b e5) {
                        e2 = e5;
                    }
                }
                this.pe = m3602E().ab(this.we);
                this.Ae = m3602E().m4607W(this.we);
            }
            if (!a) {
                WDHF_Manager.m5074a(mo2753v());
            }
        } catch (C0841b e6) {
            e2 = e6;
            a = false;
            WDErreurManager.m2882a(e2);
            if (a) {
                if (this.pe) {
                    return true;
                }
            }
            return false;
        } catch (WDJNIException e7) {
            e = e7;
            WDHF_Manager.m5075a(e, mo2753v());
            a = z3;
            if (a) {
                if (this.pe) {
                    return true;
                }
            }
            return false;
        }
        if (a) {
            if (this.pe) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m3585a(boolean z, String str) {
        try {
            if (this.Be == null) {
                return false;
            }
            if (this.Be.size() <= 0) {
                return false;
            }
            if (!str.equals("")) {
                str = C0808l.m4057o(str).toLowerCase();
            }
            WDHF_Contexte instance = WDHF_Contexte.getInstance();
            try {
                if (this.Be.isEmpty()) {
                    return true;
                }
                Iterator it = this.Be.iterator();
                boolean z2 = false;
                while (it.hasNext()) {
                    String obj = it.next().toString();
                    db b = instance.m5004b(obj);
                    if (b != null) {
                        if (!z) {
                            try {
                                if (!obj.equalsIgnoreCase(str)) {
                                    continue;
                                }
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                        if (instance.m5016e() && !m3594m(obj)) {
                            return false;
                        }
                        try {
                            b.m3585a(true, "");
                            if (b.isRequete()) {
                                instance.m5014d(obj);
                            } else {
                                instance.m5023i(obj);
                            }
                            it.remove();
                            if (!z) {
                                return true;
                            }
                            z2 = true;
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                }
                return z2;
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } catch (NumberFormatException e222) {
            throw e222;
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    /* renamed from: b */
    private String m3586b(eb ebVar, WDObjet wDObjet, WDObjet wDObjet2, String str) throws C0841b, WDJNIException {
        try {
            if (wDObjet.isMemoBinaire()) {
                return wDObjet2.isMemoBinaire() ? mo2753v().mo2799a(this.we, ebVar.m5852i(), wDObjet.getDonneeBinaire(), wDObjet2.getDonneeBinaire(), str) : mo2753v().mo2798a(this.we, ebVar.m5852i(), wDObjet.getDonneeBinaire(), wDObjet2.getString(), str);
            } else {
                try {
                    return wDObjet2.isMemoBinaire() ? mo2753v().mo2796a(this.we, ebVar.m5852i(), wDObjet.getString(), wDObjet2.getDonneeBinaire(), str) : mo2753v().mo2795a(this.we, ebVar.m5852i(), wDObjet.getString(), wDObjet2.getString(), str);
                } catch (C0841b e) {
                    throw e;
                }
            }
        } catch (C0841b e2) {
            throw e2;
        } catch (C0841b e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    private final void m3587b(WDHF_Connexion wDHF_Connexion) {
        try {
            if (wDHF_Connexion.m4953c()) {
                this.ue = (byte) 1;
                try {
                    if (this.de != null) {
                        if (this.de.mo2994k()) {
                            this.ue = (byte) 2;
                        }
                    }
                } catch (C0841b e) {
                    throw e;
                } catch (Exception e2) {
                    WDErreurManager.m2882a(e2);
                }
                this.je = wDHF_Connexion.m4968p();
                return;
            }
            m3568Q();
            this.de = null;
            this.we = -1;
            if (wDHF_Connexion.m4968p() == 17) {
                this.ue = (byte) 3;
                this.je = 17;
            } else {
                this.ue = (byte) -1;
            }
            this.je = wDHF_Connexion.m4968p();
        } catch (C0841b e3) {
            throw e3;
        } catch (C0841b e32) {
            throw e32;
        }
    }

    /* renamed from: b */
    private void m3588b(db dbVar) {
        try {
            if (this.Be == null) {
                this.Be = new ArrayList();
            }
            try {
                this.Be.add(C0808l.m4057o(dbVar.mo2719a().toLowerCase()));
                if (dbVar.isRequete()) {
                    WDHF_Contexte.getInstance().m5001a((C0778b) dbVar);
                } else {
                    WDHF_Contexte.getInstance().m4998a(dbVar);
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: d */
    private boolean m3589d(long j, int i) {
        Exception exception;
        WDJNIException wDJNIException;
        boolean z = false;
        C0832f v = mo2753v();
        try {
            if (this.ue == (byte) 2) {
                C0845h c0845h = new C0845h();
                c0845h.m5760a(this.ie);
                if (this.Vd != null) {
                    c0845h = v.mo2787a(c0845h, this.Vd.m5854k(), this.we, j, i);
                    if (c0845h != null) {
                        z = c0845h.m5766d();
                        if (z) {
                            this.ie[this.Vd.m5854k()] = c0845h.m5765c()[0];
                        }
                    }
                } else {
                    z = v.mo2849a(c0845h, this.we, j, i);
                }
            } else {
                WDHF wdhf = (WDHF) v;
                if (wdhf.m4698a(this, this.Td.values().toArray(), this.ie)) {
                    boolean n = wdhf.m4880n(this.we, j, i);
                    if (n) {
                        try {
                            if (this.Vd != null) {
                                m3576a(wdhf);
                                z = n;
                            }
                        } catch (WDJNIException e) {
                            throw e;
                        } catch (Exception e2) {
                            exception = e2;
                            z = n;
                            WDErreurManager.m2882a(exception);
                            return z;
                        } catch (WDJNIException e3) {
                            wDJNIException = e3;
                            z = n;
                        }
                    }
                    z = n;
                }
            }
            if (!z) {
                WDHF_Manager.m5074a(v);
            }
        } catch (WDJNIException wDJNIException2) {
            throw wDJNIException2;
        } catch (C0841b e4) {
            exception = e4;
            WDErreurManager.m2882a(exception);
            return z;
        } catch (WDJNIException wDJNIException22) {
            throw wDJNIException22;
        } catch (WDJNIException e5) {
            wDJNIException22 = e5;
        }
        return z;
        WDHF_Manager.m5075a(wDJNIException22, mo2753v());
        return z;
    }

    /* renamed from: e */
    private boolean m3590e(long j, int i) {
        boolean a;
        WDJNIException e;
        Exception e2;
        C0832f v = mo2753v();
        try {
            if (this.ue == (byte) 2) {
                C0845h k = v.mo2992k(this.we, j, i);
                a = m3655a(k, k.m5766d());
            } else {
                a = m3602E().m4886o(this.we, j, i);
                if (a) {
                    try {
                        a = m3607K();
                    } catch (WDJNIException e3) {
                        throw e3;
                    } catch (C0841b e4) {
                        e2 = e4;
                        WDErreurManager.m2882a(e2);
                        if (!a) {
                            return false;
                        }
                        try {
                            return this.Ae;
                        } catch (WDJNIException e5) {
                            throw e5;
                        }
                    } catch (WDJNIException e6) {
                        e3 = e6;
                    }
                }
                this.pe = m3602E().ab(this.we);
                this.Ae = m3602E().m4607W(this.we);
            }
            if (!a) {
                WDHF_Manager.m5074a(mo2753v());
            }
        } catch (WDJNIException e7) {
            e3 = e7;
            a = false;
            WDHF_Manager.m5075a(e3, mo2753v());
            if (!a) {
                return false;
            }
            if (this.Ae) {
            }
        } catch (C0841b e8) {
            e2 = e8;
            a = false;
            WDErreurManager.m2882a(e2);
            if (!a) {
                return false;
            }
            if (this.Ae) {
            }
        }
        if (!a) {
            return false;
        }
        if (this.Ae) {
        }
    }

    /* renamed from: i */
    private boolean m3591i() {
        try {
            if (m3716j()) {
                try {
                    return mo2753v().mo2909c(m3717k(), (int) C0542t.f1193i);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, mo2753v());
                }
            }
            return false;
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    /* renamed from: j */
    private void m3592j(boolean z) {
        this.se++;
        this.fe = z;
        this.qe = this.he;
    }

    /* renamed from: j */
    private String[] m3593j(String str) {
        String str2 = "";
        try {
            if (!str.equals("") && str.charAt(0) == C0542t.Tc) {
                String[] a = C0808l.m4029a(str.substring(1, str.length()), String.valueOf(C0542t.bb));
                int i = 0;
                while (i < a.length) {
                    String[] a2 = C0808l.m4029a(a[0], String.valueOf(C0542t.f1203s));
                    try {
                        if (a2.length > 1) {
                            str2 = str2.equals("") ? a2[1] : str2 + C0542t.f1203s + a2[1];
                        }
                        i++;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
            return C0808l.m4029a(str2, String.valueOf(C0542t.f1203s));
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: m */
    private boolean m3594m(String str) {
        boolean e;
        try {
            e = mo2753v().mo2942e(str);
        } catch (Exception e2) {
            WDErreurManager.m2882a(e2);
            e = true;
        } catch (WDJNIException e3) {
            WDHF_Manager.m5075a(e3, mo2753v());
            e = true;
        }
        if (!e) {
            try {
                WDHF_Manager.m5074a(mo2753v());
            } catch (C0841b e4) {
                throw e4;
            }
        }
        return e;
    }

    /* renamed from: n */
    private final void m3595n(String str) {
        m3579a(str, "", 0, "");
    }

    /* renamed from: z */
    private static String m3596z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 44;
                    break;
                case 1:
                    i2 = 24;
                    break;
                case 2:
                    i2 = 95;
                    break;
                case 3:
                    i2 = 118;
                    break;
                default:
                    i2 = 14;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3597z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 14);
        }
        return toCharArray;
    }

    /* renamed from: A */
    public WDEntier4 m3598A() {
        return new WDEntier4(72);
    }

    /* renamed from: B */
    public final boolean m3599B() {
        return this.Ae;
    }

    /* renamed from: C */
    public final void m3600C() {
        if (this.Td != null) {
            for (eb ebVar : this.Td.values()) {
                if (ebVar != null) {
                    try {
                        ebVar.release();
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
            this.Td.clear();
        }
    }

    /* renamed from: D */
    public Object[] m3601D() {
        Object[] objArr = new Object[this.Td.size()];
        for (eb ebVar : this.Td.values()) {
            try {
                if (!ebVar.m5853j()) {
                    objArr[ebVar.m5854k()] = ebVar.m5808J();
                }
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return objArr;
    }

    /* renamed from: E */
    WDHF m3602E() {
        try {
            return (WDHF) mo2753v();
        } catch (ClassCastException e) {
            WDErreurManager.m2883a(C0745b.m3222b(Ee[42], new String[0]));
            return null;
        }
    }

    /* renamed from: F */
    public db m3603F() {
        return this;
    }

    /* renamed from: G */
    public final boolean m3604G() throws C0841b, WDJNIException {
        return m3602E().m4698a(this, this.Td.values().toArray(), this.ie);
    }

    /* renamed from: H */
    public boolean mo2737H() {
        try {
            if (m3716j()) {
                if (!m3606I()) {
                    return false;
                }
            }
            WDHF_Contexte instance = WDHF_Contexte.getInstance();
            try {
                if (this.ge) {
                    WDHF_Connexion x = m3736x();
                    instance.m5000a(new C0860m(C0542t.Fd, C0745b.m3222b(Ee[2], mo2719a()), 0, "", mo2719a(), "", x.m4965m(), x.m4961i()));
                    return false;
                }
                instance.m5023i(mo2719a());
                return true;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    /* renamed from: I */
    protected final boolean m3606I() {
        boolean E;
        WDJNIException e;
        Exception e2;
        try {
            E = mo2753v().mo2766E(m3717k());
            if (!E) {
                try {
                    WDHF_Manager.m5074a(mo2753v());
                } catch (C0841b e3) {
                    throw e3;
                } catch (WDJNIException e4) {
                    e = e4;
                    WDHF_Manager.m5075a(e, mo2753v());
                    return E;
                } catch (C0841b e5) {
                    e2 = e5;
                }
            }
        } catch (Exception e6) {
            Exception exception = e6;
            E = false;
            e2 = exception;
            WDErreurManager.m2882a(e2);
            return E;
        } catch (WDJNIException e7) {
            WDJNIException wDJNIException = e7;
            E = false;
            e = wDJNIException;
            WDHF_Manager.m5075a(e, mo2753v());
            return E;
        }
        return E;
    }

    /* renamed from: K */
    public boolean m3607K() {
        try {
            Object[] a = m3602E().m4711a(this, this.Td.values().iterator(), this.Td.size());
            if (a != null) {
                this.ie = a;
                return true;
            }
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
        } catch (WDJNIException e2) {
            WDHF_Manager.m5075a(e2, mo2753v());
        }
        return false;
    }

    /* renamed from: L */
    public final int m3608L() {
        return this.se;
    }

    /* renamed from: M */
    public String mo2738M() {
        return mo2741a(true, null);
    }

    /* renamed from: N */
    public boolean m3610N() {
        for (eb ebVar : this.Td.values()) {
            ebVar.m5804F();
            ebVar.m5847e(false);
        }
        try {
            this.De = false;
            this.se = 0;
            this.fe = false;
            this.qe = null;
            this.ve = null;
            this.oe = false;
            if (this.Rd != null) {
                this.Rd.clear();
            }
            if (this.le != null) {
                int indexOf = this.le.indexOf(ce);
                if (indexOf != -1) {
                    try {
                        this.le = this.le.substring(indexOf + ce.length(), this.le.length());
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
            this.ke = false;
            return true;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: O */
    public eb mo2739O() {
        try {
            if (this.ae != null) {
                return this.ae;
            }
            try {
                if (this.Vd != null) {
                    this.ae = this.Vd;
                    return this.ae;
                }
                for (eb ebVar : this.Td.values()) {
                    try {
                        if (this.ae == null) {
                            this.ae = ebVar;
                        } else {
                            try {
                                if (ebVar.m5857o() > this.ae.m5857o()) {
                                    this.ae = ebVar;
                                }
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
                return this.ae;
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    /* renamed from: P */
    public final boolean m3612P() {
        try {
            return this.Zd != null;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: R */
    protected final boolean m3613R() {
        try {
            if (this.ve != null) {
                if (this.oe) {
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

    /* renamed from: S */
    public final LinkedHashMap<String, eb> m3614S() {
        return this.Td;
    }

    /* renamed from: T */
    public final int m3615T() {
        return this.xe;
    }

    /* renamed from: V */
    public C0833j m3616V() {
        return m3629a("", false, false).m4967o();
    }

    /* renamed from: W */
    public boolean m3617W() {
        StringBuffer append;
        StringBuffer append2 = new StringBuffer(Ee[82]).append(mo2738M());
        StringBuffer stringBuffer = new StringBuffer(Ee[28]);
        int i = 0;
        for (eb ebVar : this.Td.values()) {
            if (!ebVar.m5853j()) {
                try {
                    if (ebVar.m5810L()) {
                        continue;
                    } else {
                        try {
                            if (ebVar.mo3138c() || ebVar.m5801C()) {
                                append = new StringBuffer(Ee[28]).append(m3637a(ebVar, this.he[ebVar.m5854k()], 1, true, true, true));
                                break;
                            }
                            if (i != 0) {
                                try {
                                    stringBuffer.append(Ee[30]);
                                } catch (NumberFormatException e) {
                                    throw e;
                                }
                            }
                            int i2 = i + 1;
                            stringBuffer.append(m3637a(ebVar, this.he[ebVar.m5854k()], 1, true, true, true));
                            i = i2;
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            }
        }
        append = stringBuffer;
        append2.append(append.toString()).append(")");
        WDHF_Connexion a = m3629a("", true, true);
        if (a == null) {
            return false;
        }
        try {
            if (a.m4967o().mo3106b(append2.toString(), 1)) {
                return true;
            }
            m3647a(a, "");
            return false;
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    /* renamed from: X */
    public boolean m3618X() {
        WDJNIException e;
        Exception e2;
        boolean z = true;
        if (m3716j()) {
            try {
                z = mo2753v().mo2762A(this.we);
                if (!z) {
                    try {
                        WDHF_Manager.m5074a(mo2753v());
                    } catch (C0841b e3) {
                        throw e3;
                    } catch (WDJNIException e4) {
                        e = e4;
                        WDHF_Manager.m5075a(e, mo2753v());
                        return z;
                    } catch (C0841b e5) {
                        e2 = e5;
                    }
                }
            } catch (Exception e6) {
                Exception exception = e6;
                z = false;
                e2 = exception;
                WDErreurManager.m2882a(e2);
                return z;
            } catch (WDJNIException e7) {
                WDJNIException wDJNIException = e7;
                z = false;
                e = wDJNIException;
                WDHF_Manager.m5075a(e, mo2753v());
                return z;
            }
        }
        try {
            if (this.ve != null) {
                if (!m3613R()) {
                    this.oe = true;
                    m3569U();
                }
            }
        } catch (C0841b e8) {
            throw e8;
        } catch (C0841b e82) {
            throw e82;
        }
        return z;
    }

    /* renamed from: Y */
    public final boolean m3619Y() {
        try {
            return this.Vd != null;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: Z */
    public int m3620Z() {
        try {
            if (this.Xd == -1) {
                try {
                    if (m3716j()) {
                        try {
                            this.Xd = (int) mo2753v().mo3036r(m3717k(), 97);
                        } catch (Exception e) {
                            WDErreurManager.m2882a(e);
                        } catch (WDJNIException e2) {
                            WDHF_Manager.m5075a(e2, mo2753v());
                        }
                    } else {
                        this.Xd = 0;
                    }
                } catch (NumberFormatException e3) {
                    throw e3;
                }
            }
            return this.Xd;
        } catch (C0841b e4) {
            throw e4;
        }
    }

    /* renamed from: a */
    public int m3621a(int i) {
        if (!m3716j()) {
            return 524288;
        }
        int u;
        try {
            u = mo2753v().mo3050u(this.we, i);
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
            u = -1;
        } catch (WDJNIException e2) {
            WDHF_Manager.m5075a(e2, mo2753v());
            u = -1;
        }
        if (u < 0) {
            try {
                WDHF_Manager.m5074a(mo2753v());
                return u;
            } catch (C0841b e3) {
                throw e3;
            }
        }
        m3683c(i);
        return u;
    }

    /* renamed from: a */
    public int m3622a(int i, int i2) {
        try {
            if (m3716j()) {
                try {
                    return mo2753v().mo2860b(this.we, i, i2);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, mo2753v());
                }
            }
            return 1031;
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    public int m3623a(eb ebVar, WDJaugeJNI wDJaugeJNI) {
        int i = 0;
        if (m3716j()) {
            try {
                i = mo2753v().mo2776a(this.we, ebVar != null ? ebVar.m5852i() : 0, wDJaugeJNI);
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
            }
            return i;
        }
        WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], WDAppelContexte.getContexte().m2731r()), mo2719a()));
        return i;
    }

    /* renamed from: a */
    public int m3624a(eb ebVar, Object[] objArr, boolean z, Object obj) {
        boolean z2 = false;
        WDHF_Connexion a = m3629a("", true, true);
        if (a == null) {
            return -1;
        }
        StringBuffer stringBuffer = new StringBuffer(Ee[83]);
        stringBuffer.append(ebVar.m5818a(true, a.m4967o()));
        stringBuffer.append(Ee[84]).append(mo2740a(null, z));
        Object[] d = mo2744d(ebVar);
        if (d != null) {
            try {
                if (d.length > 0) {
                    if (!z) {
                        z2 = true;
                    }
                    try {
                        stringBuffer.append(m3644a(d, z2, objArr));
                        if (obj != null) {
                            stringBuffer.append(Ee[30]);
                            stringBuffer.append(m3637a(ebVar, obj, 2, true, true, false));
                        }
                        try {
                            if (m3613R()) {
                                if (ebVar.m5862u()) {
                                    stringBuffer.append(Ee[30]).append(this.ve.m6085f());
                                }
                            }
                        } catch (NumberFormatException e) {
                            throw e;
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                }
            } catch (NumberFormatException e222) {
                throw e222;
            } catch (NumberFormatException e2222) {
                throw e2222;
            }
        }
        try {
            if (a.m4967o().mo3099a(stringBuffer.toString(), true)) {
                Integer a2 = a.m4967o().mo3090a(1, true);
                if (a2 != null) {
                    return a2.intValue();
                }
                try {
                    m3647a(a, "");
                    return -1;
                } catch (NumberFormatException e22222) {
                    throw e22222;
                }
            }
            m3647a(a, "");
            return -1;
        } catch (NumberFormatException e222222) {
            throw e222222;
        }
    }

    /* renamed from: a */
    public int m3625a(WDJaugeJNI wDJaugeJNI) {
        int i = 0;
        try {
            if (m3716j()) {
                try {
                    i = mo2753v().mo2777a(this.we, wDJaugeJNI);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, mo2753v());
                }
                return i;
            }
            WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], WDAppelContexte.getContexte().m2731r()), mo2719a()));
            return i;
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    public long m3626a(int i, String str, eb ebVar, boolean z) {
        long j;
        WDJNIException e;
        Exception e2;
        if (m3716j()) {
            try {
                j = mo2753v().mo2984j(this.we, i);
                if (j != -1) {
                    return j;
                }
                try {
                    WDHF_Manager.m5074a(mo2753v());
                    return j;
                } catch (C0841b e3) {
                    throw e3;
                } catch (WDJNIException e4) {
                    e = e4;
                    WDHF_Manager.m5075a(e, mo2753v());
                    return j;
                } catch (C0841b e5) {
                    e2 = e5;
                }
            } catch (Exception e6) {
                Exception exception = e6;
                j = -1;
                e2 = exception;
                WDErreurManager.m2882a(e2);
                return j;
            } catch (WDJNIException e7) {
                WDJNIException wDJNIException = e7;
                j = -1;
                e = wDJNIException;
                WDHF_Manager.m5075a(e, mo2753v());
                return j;
            }
        }
        WDHF_Connexion a = m3629a("", true, true);
        if (a == null) {
            return -1;
        }
        String str2 = Ee[37];
        String a2 = mo2740a(ebVar, true);
        String str3 = "";
        try {
            if (!str.equals("") && ebVar != null) {
                str3 = Ee[36] + m3637a(ebVar, str, 2, true, true, false);
            } else if (z) {
                try {
                    if (m3613R() && !this.ve.m6085f().equals("")) {
                        str3 = Ee[36] + this.ve.m6085f();
                    }
                } catch (C0841b e8) {
                    throw e8;
                }
            }
            try {
                if (a.m4967o().mo3099a(a.m4967o().mo3094a(str2, a2, str3, "", -1), true)) {
                    Integer a3 = a.m4967o().mo3090a(1, true);
                    if (a3 != null) {
                        return (long) a3.intValue();
                    }
                    try {
                        m3647a(a, "");
                        return -1;
                    } catch (C0841b e82) {
                        throw e82;
                    }
                }
                m3647a(a, "");
                return -1;
            } catch (C0841b e822) {
                throw e822;
            }
        } catch (C0841b e8222) {
            throw e8222;
        }
    }

    /* renamed from: a */
    public IWDParcours mo2717a(boolean z) {
        return WDParcoursFichier.pourTout(this, mo2739O(), z);
    }

    /* renamed from: a */
    public WDChaine m3628a(eb ebVar, String[] strArr) {
        if (m3716j()) {
            WDChaine c;
            try {
                c = mo2753v().mo2898c(this.we, ebVar.m5852i(), strArr);
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
                c = null;
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
                c = null;
            }
            if (c != null) {
                return c;
            }
            try {
                WDHF_Manager.m5074a(mo2753v());
                return new WDChaine();
            } catch (C0841b e3) {
                throw e3;
            }
        }
        StringBuffer stringBuffer = new StringBuffer(String.valueOf(C0542t.Tc));
        int min = Math.min(strArr.length, ebVar.m5849g());
        Iterator N = ebVar.m5812N();
        for (int i = 0; i < min; i++) {
            if (i > 0) {
                try {
                    stringBuffer.append(bb);
                } catch (C0841b e32) {
                    throw e32;
                }
            }
            eb ebVar2 = (eb) mo2721b((String) N.next());
            strArr[i] = strArr[i].replaceAll(String.valueOf('\u0000'), ebVar2.m5858p().toString());
            strArr[i] = strArr[i].replaceAll(String.valueOf('￿'), ebVar2.m5851h().toString());
            stringBuffer.append(ebVar2.m5818a(false, null)).append(s).append(strArr[i]);
        }
        return new WDChaine(stringBuffer.toString());
    }

    /* renamed from: a */
    public WDHF_Connexion m3629a(String str, boolean z, boolean z2) {
        if (z2) {
            try {
                if (!this.ke) {
                    if (!mo2743b(null, 3)) {
                        return null;
                    }
                }
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        if (!this.be.equals("")) {
            WDHF_Connexion g = WDHF_Contexte.getInstance().m5019g(this.be);
            if (g == null) {
                WDErreurManager.m2883a(C0745b.m3222b(Ee[53], this.be));
            } else if (!z) {
                return g;
            } else {
                try {
                    if (!str.equals("")) {
                        return g.m4947a(true, str) ? g : null;
                    } else {
                        try {
                            if (!g.m4962j()) {
                                if (!g.m4947a(true, null)) {
                                    return null;
                                }
                            }
                            return g;
                        } catch (NumberFormatException e22) {
                            throw e22;
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
        }
        return Ud;
    }

    /* renamed from: a */
    public final ib m3630a(Integer num) {
        try {
            return this.Rd == null ? null : (ib) this.Rd.get(num);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public final <T extends C0849z> T mo2718a(String str) {
        return (C0849z) this.Td.get(str);
    }

    /* renamed from: a */
    public final String mo2719a() {
        return this.te;
    }

    /* renamed from: a */
    public String m3633a(eb ebVar, int i, WDObjet wDObjet) {
        if (ebVar != null) {
            try {
                if (ebVar.m5853j()) {
                    wDObjet = m3571a(ebVar, wDObjet);
                }
            } catch (C0841b e) {
                throw e;
            }
        }
        try {
            String b;
            if (ebVar.m5853j()) {
                if (wDObjet.isMemoBinaire() && m3716j()) {
                    String str;
                    try {
                        long i2 = ebVar.m5852i();
                        if (i == 1) {
                            b = mo2753v().mo2873b(this.we, i2, wDObjet.getDonneeBinaire());
                        } else if (i == 2) {
                            b = mo2753v().mo2797a(this.we, i2, wDObjet.getDonneeBinaire());
                        } else {
                            return m3634a(ebVar, i, new String[]{wDObjet.getString()});
                        }
                        str = b;
                    } catch (Exception e2) {
                        WDErreurManager.m2882a(e2);
                        str = null;
                    } catch (WDJNIException e3) {
                        WDHF_Manager.m5075a(e3, mo2753v());
                        str = null;
                    }
                    if (str != null) {
                        try {
                            if (!str.equals("")) {
                                this.ve = new C0861n("", "", str, null, null);
                                this.oe = true;
                                return str;
                            }
                        } catch (C0841b e4) {
                            throw e4;
                        }
                    }
                    WDHF_Manager.m5074a(mo2753v());
                    return str;
                }
            }
            b = wDObjet.getString();
            try {
                if (b.startsWith(String.valueOf(C0542t.Tc))) {
                    return m3634a(ebVar, i, m3593j(b));
                }
                return m3634a(ebVar, i, new String[]{wDObjet.getString()});
            } catch (C0841b e42) {
                throw e42;
            }
        } catch (C0841b e422) {
            throw e422;
        } catch (C0841b e4222) {
            throw e4222;
        }
    }

    /* renamed from: a */
    public String m3634a(eb ebVar, int i, String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer("(");
        if (ebVar.m5853j()) {
            int min = Math.min(strArr.length, ebVar.m5849g());
            Iterator N = ebVar.m5812N();
            for (int i2 = 0; i2 < min; i2++) {
                if (i2 > 0) {
                    try {
                        stringBuffer.append(Ee[30]);
                    } catch (C0841b e) {
                        throw e;
                    }
                }
                stringBuffer.append(m3636a((eb) mo2721b((String) N.next()), strArr[i2], i, true, false));
            }
        } else {
            stringBuffer.append(m3636a(ebVar, strArr[0], i, true, false));
        }
        if (m3716j()) {
            String str;
            try {
                long i3 = ebVar.m5852i();
                String a = i == 1 ? mo2753v().mo2801a(this.we, i3, strArr) : i == 2 ? mo2753v().mo2874b(this.we, i3, strArr) : mo2753v().mo3014n(this.we, stringBuffer.append(")").toString());
                str = a;
            } catch (Exception e2) {
                WDErreurManager.m2882a(e2);
                str = null;
            } catch (WDJNIException e3) {
                WDHF_Manager.m5075a(e3, mo2753v());
                str = null;
            }
            if (str != null) {
                try {
                    if (!str.equals("")) {
                        this.ve = new C0861n("", "", str, null, null);
                        this.oe = true;
                        return str;
                    }
                } catch (C0841b e4) {
                    throw e4;
                }
            }
            WDHF_Manager.m5074a(mo2753v());
            return str;
        }
        this.ve = new C0861n(stringBuffer.append(")").toString(), "", ebVar.mo3137b(), null, null);
        this.oe = true;
        return ebVar.mo3137b();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public java.lang.String m3635a(fr.pcsoft.wdjava.database.hf.eb r12, fr.pcsoft.wdjava.core.WDObjet r13, fr.pcsoft.wdjava.core.WDObjet r14, java.lang.String r15) {
        /*
        r11 = this;
        if (r12 == 0) goto L_0x0344;
    L_0x0002:
        r0 = r12.m5853j();	 Catch:{ b -> 0x0077 }
        if (r0 == 0) goto L_0x0344;
    L_0x0008:
        r13 = r11.m3571a(r12, r13);
        r14 = r11.m3571a(r12, r14);
        r6 = r14;
        r7 = r13;
    L_0x0012:
        r0 = r11.m3716j();	 Catch:{ b -> 0x0079 }
        if (r0 == 0) goto L_0x009e;
    L_0x0018:
        if (r6 == 0) goto L_0x0020;
    L_0x001a:
        r0 = r6.isValeurNull();	 Catch:{ b -> 0x007b }
        if (r0 == 0) goto L_0x0341;
    L_0x0020:
        r1 = r7;
    L_0x0021:
        r3 = 0;
        if (r12 == 0) goto L_0x007d;
    L_0x0024:
        r3 = r11.m3586b(r12, r7, r1, r15);	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
    L_0x0028:
        if (r3 == 0) goto L_0x0065;
    L_0x002a:
        r0 = "";
        r0 = r3.equals(r0);	 Catch:{ b -> 0x0088, WDJNIException -> 0x0091 }
        if (r0 != 0) goto L_0x0065;
    L_0x0032:
        r0 = r11.mo2721b(r3);	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
        r0 = (fr.pcsoft.wdjava.database.hf.eb) r0;	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
        r2 = 1;
        r0.m5847e(r2);	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
        r4 = "";
        if (r7 == 0) goto L_0x004a;
    L_0x0040:
        r0 = r7.isValeurNull();	 Catch:{ b -> 0x008f, WDJNIException -> 0x0091 }
        if (r0 != 0) goto L_0x004a;
    L_0x0046:
        r4 = r7.getString();	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
    L_0x004a:
        r5 = "";
        if (r1 == 0) goto L_0x0058;
    L_0x004e:
        r0 = r1.isValeurNull();	 Catch:{ b -> 0x009a, WDJNIException -> 0x0091 }
        if (r0 != 0) goto L_0x0058;
    L_0x0054:
        r5 = r1.getString();	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
    L_0x0058:
        r0 = new fr.pcsoft.wdjava.database.hf.n;	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
        r1 = "";
        r2 = r15;
        r0.<init>(r1, r2, r3, r4, r5);	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
        r11.ve = r0;	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
        r0 = 1;
        r11.oe = r0;	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
    L_0x0065:
        if (r3 == 0) goto L_0x006f;
    L_0x0067:
        r0 = "";
        r0 = r3.equals(r0);	 Catch:{ b -> 0x009c }
        if (r0 == 0) goto L_0x0076;
    L_0x006f:
        r0 = r11.mo2753v();	 Catch:{ b -> 0x009c }
        fr.pcsoft.wdjava.database.hf.WDHF_Manager.m5074a(r0);	 Catch:{ b -> 0x009c }
    L_0x0076:
        return r3;
    L_0x0077:
        r0 = move-exception;
        throw r0;
    L_0x0079:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        throw r0;
    L_0x007d:
        r0 = r11.mo2753v();	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
        r4 = r11.we;	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
        r3 = r0.mo3014n(r4, r15);	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
        goto L_0x0028;
    L_0x0088:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
    L_0x008a:
        r0 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2882a(r0);
        goto L_0x0065;
    L_0x008f:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
    L_0x0091:
        r0 = move-exception;
        r1 = r11.mo2753v();
        fr.pcsoft.wdjava.database.hf.WDHF_Manager.m5075a(r0, r1);
        goto L_0x0065;
    L_0x009a:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x008a, WDJNIException -> 0x0091 }
    L_0x009c:
        r0 = move-exception;
        throw r0;
    L_0x009e:
        r9 = new java.lang.StringBuffer;
        r0 = "";
        r9.<init>(r0);
        r0 = 0;
        if (r12 == 0) goto L_0x033e;
    L_0x00a8:
        if (r7 == 0) goto L_0x033e;
    L_0x00aa:
        r1 = r7.isValeurNull();	 Catch:{ b -> 0x0136 }
        if (r1 != 0) goto L_0x033e;
    L_0x00b0:
        r2 = r7.getString();
        r0 = "(";
        r9.append(r0);
        r0 = r12.m5853j();
        if (r0 != 0) goto L_0x00f6;
    L_0x00bf:
        r0 = 0;
        r0 = java.lang.String.valueOf(r0);
        r1 = r12.m5858p();
        r1 = r1.toString();
        r0 = fr.pcsoft.wdjava.core.utils.C0808l.m4018a(r2, r0, r1);
        r1 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r1 = java.lang.String.valueOf(r1);
        r2 = r12.m5851h();
        r2 = r2.toString();
        r2 = fr.pcsoft.wdjava.core.utils.C0808l.m4018a(r0, r1, r2);
        r0 = r12.m5856m();
        if (r0 == 0) goto L_0x00f6;
    L_0x00e9:
        r0 = new fr.pcsoft.wdjava.core.types.WDChaine;
        r0.<init>(r2);
        r0 = r12.m5817a(r0);
        r2 = r0.toString();
    L_0x00f6:
        if (r6 == 0) goto L_0x00fe;
    L_0x00f8:
        r0 = r6.isValeurNull();	 Catch:{ b -> 0x0138 }
        if (r0 == 0) goto L_0x0149;
    L_0x00fe:
        r0 = Tc;	 Catch:{ b -> 0x013a }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ b -> 0x013a }
        r0 = r2.startsWith(r0);	 Catch:{ b -> 0x013a }
        if (r0 == 0) goto L_0x013c;
    L_0x010a:
        r0 = 1;
        r1 = 1;
        r3 = 0;
        r0 = r11.m3640a(r2, r0, r1, r3);	 Catch:{ b -> 0x013a }
        r9.append(r0);	 Catch:{ b -> 0x013a }
    L_0x0114:
        r0 = ")";
        r9.append(r0);
    L_0x0119:
        r0 = "";
        r0 = r15.equals(r0);
        if (r0 != 0) goto L_0x02b2;
    L_0x0121:
        r8 = new java.util.LinkedList;
        r8.<init>();
        r0 = r11.m3574a(r15, r8);
        r1 = "";
        r1 = r0.equals(r1);	 Catch:{ b -> 0x01e4 }
        if (r1 == 0) goto L_0x01e6;
    L_0x0132:
        r3 = "";
        goto L_0x0076;
    L_0x0136:
        r0 = move-exception;
        throw r0;
    L_0x0138:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x013a }
    L_0x013a:
        r0 = move-exception;
        throw r0;
    L_0x013c:
        r3 = 1;
        r4 = 1;
        r5 = 0;
        r0 = r11;
        r1 = r12;
        r0 = r0.m3636a(r1, r2, r3, r4, r5);
        r9.append(r0);
        goto L_0x0114;
    L_0x0149:
        r8 = r6.getString();
        r0 = Tc;	 Catch:{ b -> 0x01c5 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ b -> 0x01c5 }
        r0 = r2.startsWith(r0);	 Catch:{ b -> 0x01c5 }
        if (r0 == 0) goto L_0x01c7;
    L_0x0159:
        r0 = 16;
        r1 = 1;
        r3 = 0;
        r0 = r11.m3640a(r2, r0, r1, r3);	 Catch:{ b -> 0x01c5 }
        r9.append(r0);	 Catch:{ b -> 0x01c5 }
    L_0x0164:
        r0 = Ee;
        r1 = 30;
        r0 = r0[r1];
        r9.append(r0);
        r0 = r12.m5853j();
        if (r0 != 0) goto L_0x033b;
    L_0x0173:
        r0 = 0;
        r0 = java.lang.String.valueOf(r0);
        r1 = r12.m5858p();
        r1 = r1.toString();
        r0 = fr.pcsoft.wdjava.core.utils.C0808l.m4018a(r8, r0, r1);
        r1 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        r1 = java.lang.String.valueOf(r1);
        r2 = r12.m5851h();
        r2 = r2.toString();
        r2 = fr.pcsoft.wdjava.core.utils.C0808l.m4018a(r0, r1, r2);
        r0 = r12.m5856m();
        if (r0 == 0) goto L_0x01aa;
    L_0x019d:
        r0 = new fr.pcsoft.wdjava.core.types.WDChaine;
        r0.<init>(r2);
        r0 = r12.m5817a(r0);
        r2 = r0.toString();
    L_0x01aa:
        r0 = Tc;	 Catch:{ b -> 0x01c3 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ b -> 0x01c3 }
        r0 = r2.startsWith(r0);	 Catch:{ b -> 0x01c3 }
        if (r0 == 0) goto L_0x01d5;
    L_0x01b6:
        r0 = 32;
        r1 = 1;
        r3 = 0;
        r0 = r11.m3640a(r2, r0, r1, r3);	 Catch:{ b -> 0x01c3 }
        r9.append(r0);	 Catch:{ b -> 0x01c3 }
        goto L_0x0114;
    L_0x01c3:
        r0 = move-exception;
        throw r0;
    L_0x01c5:
        r0 = move-exception;
        throw r0;
    L_0x01c7:
        r3 = 16;
        r4 = 1;
        r5 = 0;
        r0 = r11;
        r1 = r12;
        r0 = r0.m3636a(r1, r2, r3, r4, r5);
        r9.append(r0);
        goto L_0x0164;
    L_0x01d5:
        r3 = 32;
        r4 = 1;
        r5 = 0;
        r0 = r11;
        r1 = r12;
        r0 = r0.m3636a(r1, r2, r3, r4, r5);
        r9.append(r0);
        goto L_0x0114;
    L_0x01e4:
        r0 = move-exception;
        throw r0;
    L_0x01e6:
        r1 = r9.toString();	 Catch:{ b -> 0x0237 }
        r2 = "";
        r1 = r1.equals(r2);	 Catch:{ b -> 0x0237 }
        if (r1 != 0) goto L_0x0239;
    L_0x01f2:
        r1 = Ee;	 Catch:{ b -> 0x0237 }
        r2 = 55;
        r1 = r1[r2];	 Catch:{ b -> 0x0237 }
        r1 = r9.append(r1);	 Catch:{ b -> 0x0237 }
        r0 = r1.append(r0);	 Catch:{ b -> 0x0237 }
        r1 = ")";
        r0.append(r1);	 Catch:{ b -> 0x0237 }
    L_0x0205:
        r1 = r8.iterator();
    L_0x0209:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0249;
    L_0x020f:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r2 = r11.mo2721b(r0);	 Catch:{ b -> 0x0235 }
        if (r2 != 0) goto L_0x0209;
    L_0x021b:
        r2 = Ee;	 Catch:{ b -> 0x0235 }
        r3 = 3;
        r2 = r2[r3];	 Catch:{ b -> 0x0235 }
        r3 = 2;
        r3 = new java.lang.String[r3];	 Catch:{ b -> 0x0235 }
        r4 = 0;
        r3[r4] = r0;	 Catch:{ b -> 0x0235 }
        r0 = 1;
        r4 = r11.mo2719a();	 Catch:{ b -> 0x0235 }
        r3[r0] = r4;	 Catch:{ b -> 0x0235 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r2, r3);	 Catch:{ b -> 0x0235 }
        r11.m3595n(r0);	 Catch:{ b -> 0x0235 }
        goto L_0x0209;
    L_0x0235:
        r0 = move-exception;
        throw r0;
    L_0x0237:
        r0 = move-exception;
        throw r0;
    L_0x0239:
        r1 = "(";
        r1 = r9.append(r1);
        r0 = r1.append(r0);
        r1 = ")";
        r0.append(r1);
        goto L_0x0205;
    L_0x0249:
        r0 = "";
        r1 = 1;
        r2 = 1;
        r10 = r11.m3629a(r0, r1, r2);
        if (r10 != 0) goto L_0x0259;
    L_0x0253:
        r3 = "";
        goto L_0x0076;
    L_0x0257:
        r0 = move-exception;
        throw r0;
    L_0x0259:
        r0 = r10.m4967o();
        r1 = Ee;
        r2 = 56;
        r1 = r1[r2];
        r2 = 0;
        r3 = 1;
        r2 = r11.mo2740a(r2, r3);
        r3 = new java.lang.StringBuilder;
        r3.<init>();
        r4 = Ee;
        r5 = 36;
        r4 = r4[r5];
        r3 = r3.append(r4);
        r4 = r9.toString();
        r3 = r3.append(r4);
        r3 = r3.toString();
        r4 = "";
        r5 = 1;
        r0 = r0.mo3094a(r1, r2, r3, r4, r5);
        r1 = r10.m4967o();
        r2 = 0;
        r0 = r1.mo3099a(r0, r2);
        if (r0 != 0) goto L_0x02a6;
    L_0x0296:
        r0 = Ee;	 Catch:{ b -> 0x02eb }
        r1 = 54;
        r0 = r0[r1];	 Catch:{ b -> 0x02eb }
        r1 = 0;
        r1 = new java.lang.String[r1];	 Catch:{ b -> 0x02eb }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ b -> 0x02eb }
        r11.m3595n(r0);	 Catch:{ b -> 0x02eb }
    L_0x02a6:
        if (r12 != 0) goto L_0x02b2;
    L_0x02a8:
        r0 = r8.isEmpty();	 Catch:{ b -> 0x02ed }
        if (r0 == 0) goto L_0x02ef;
    L_0x02ae:
        r12 = r11.mo2739O();
    L_0x02b2:
        r3 = "";
        if (r12 == 0) goto L_0x0076;
    L_0x02b6:
        r3 = r12.mo3137b();
        r0 = 1;
        r12.m5847e(r0);
        r4 = "";
        if (r7 == 0) goto L_0x02cc;
    L_0x02c2:
        r0 = r7.isValeurNull();	 Catch:{ b -> 0x0330 }
        if (r0 != 0) goto L_0x02cc;
    L_0x02c8:
        r4 = r7.getString();
    L_0x02cc:
        r5 = "";
        if (r6 == 0) goto L_0x02da;
    L_0x02d0:
        r0 = r6.isValeurNull();	 Catch:{ b -> 0x0332 }
        if (r0 != 0) goto L_0x02da;
    L_0x02d6:
        r5 = r6.getString();
    L_0x02da:
        r0 = new fr.pcsoft.wdjava.database.hf.n;
        r1 = r9.toString();
        r2 = r15;
        r0.<init>(r1, r2, r3, r4, r5);
        r11.ve = r0;
        r0 = 1;
        r11.oe = r0;
        goto L_0x0076;
    L_0x02eb:
        r0 = move-exception;
        throw r0;
    L_0x02ed:
        r0 = move-exception;
        throw r0;
    L_0x02ef:
        r0 = 0;
        r0 = r8.get(r0);
        r0 = (java.lang.String) r0;
        r0 = r11.mo2721b(r0);
        r0 = (fr.pcsoft.wdjava.database.hf.eb) r0;
        r2 = r8.iterator();
        r1 = r0;
    L_0x0301:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0339;
    L_0x0307:
        r0 = r2.next();
        r0 = (java.lang.String) r0;
        r0 = r11.mo2721b(r0);
        r0 = (fr.pcsoft.wdjava.database.hf.eb) r0;
        r3 = r0.mo3138c();
        if (r3 == 0) goto L_0x0324;
    L_0x0319:
        r1 = r0.m5810L();
        if (r1 == 0) goto L_0x0334;
    L_0x031f:
        r12 = r11.mo2739O();
        goto L_0x02b2;
    L_0x0324:
        r3 = r0.m5857o();
        r4 = r1.m5857o();
        if (r3 <= r4) goto L_0x0337;
    L_0x032e:
        r1 = r0;
        goto L_0x0301;
    L_0x0330:
        r0 = move-exception;
        throw r0;
    L_0x0332:
        r0 = move-exception;
        throw r0;
    L_0x0334:
        r12 = r0;
        goto L_0x02b2;
    L_0x0337:
        r0 = r1;
        goto L_0x032e;
    L_0x0339:
        r0 = r1;
        goto L_0x0319;
    L_0x033b:
        r2 = r8;
        goto L_0x01aa;
    L_0x033e:
        r12 = r0;
        goto L_0x0119;
    L_0x0341:
        r1 = r6;
        goto L_0x0021;
    L_0x0344:
        r6 = r14;
        r7 = r13;
        goto L_0x0012;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.db.a(fr.pcsoft.wdjava.database.hf.eb, fr.pcsoft.wdjava.core.WDObjet, fr.pcsoft.wdjava.core.WDObjet, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public String m3636a(eb ebVar, Object obj, int i, boolean z, boolean z2) {
        StringBuffer stringBuffer = new StringBuffer();
        String str = "";
        str = z2 ? ebVar.m5818a(true, null) : ebVar.mo3137b();
        try {
            stringBuffer.append(str);
            if (obj == null && z) {
                if (i == 1) {
                    try {
                        stringBuffer.append(Ee[46]);
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                stringBuffer.append(Ee[47]);
                return stringBuffer.toString();
            }
            switch (i) {
                case 1:
                    try {
                        stringBuffer.append(Ee[13]);
                        break;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                case 2:
                case 64:
                    try {
                        if (ebVar.m5865x()) {
                            stringBuffer.append(Ee[13]);
                            break;
                        } else if (obj != null) {
                            try {
                                if (ebVar.m5856m()) {
                                    if (!m3716j() && m3736x().m4968p() == 3) {
                                        stringBuffer = new StringBuffer(C0854e.m5949c(str, ebVar.m5848f()));
                                    }
                                }
                                stringBuffer.append(Ee[17]);
                                stringBuffer.append(m3616V().mo3173a(ebVar, obj.toString(), i));
                                return stringBuffer.toString();
                            } catch (NumberFormatException e22) {
                                throw e22;
                            } catch (NumberFormatException e222) {
                                throw e222;
                            }
                        } else {
                            stringBuffer.append(Ee[46]);
                            return stringBuffer.toString();
                        }
                    } catch (NumberFormatException e2222) {
                        throw e2222;
                    }
                case 4:
                    stringBuffer.append(Ee[52]);
                    break;
                case 8:
                    stringBuffer.append(Ee[49]);
                    break;
                case 16:
                    stringBuffer.append(Ee[50]);
                    break;
                case 32:
                    stringBuffer.append(Ee[51]);
                    break;
            }
            stringBuffer.append(m3616V().mo3173a(ebVar, obj, i));
            return stringBuffer.toString();
        } catch (NumberFormatException e22222) {
            throw e22222;
        } catch (NumberFormatException e222222) {
            throw e222222;
        }
    }

    /* renamed from: a */
    public String m3637a(eb ebVar, Object obj, int i, boolean z, boolean z2, boolean z3) {
        StringBuffer stringBuffer = new StringBuffer();
        String str = "";
        str = z3 ? ebVar.m5818a(true, null) : ebVar.mo3137b();
        try {
            stringBuffer.append(str);
            if (obj == null && z2) {
                if (i == 1) {
                    try {
                        stringBuffer.append(Ee[46]);
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                stringBuffer.append(Ee[47]);
                return stringBuffer.toString();
            }
            if (i == 1) {
                try {
                    stringBuffer.append(Ee[13]);
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            } else if (i == 2 || i == 64) {
                try {
                    if (!ebVar.m5811M()) {
                        stringBuffer.append(Ee[13]);
                    } else if (obj != null) {
                        try {
                            if (ebVar.m5856m() && m3736x().m4968p() == 3) {
                                stringBuffer = new StringBuffer(C0854e.m5949c(str, ebVar.m5848f()));
                            }
                            stringBuffer.append(Ee[17]);
                            stringBuffer.append(m3616V().mo3173a(ebVar, obj.toString(), i));
                            return stringBuffer.toString();
                        } catch (NumberFormatException e22) {
                            throw e22;
                        }
                    } else {
                        stringBuffer.append(Ee[46]);
                        return stringBuffer.toString();
                    }
                } catch (NumberFormatException e222) {
                    throw e222;
                }
            } else {
                try {
                    if (z == ebVar.m5802D()) {
                        stringBuffer.append(Ee[45]);
                    } else {
                        stringBuffer.append(Ee[44]);
                    }
                    if (i == 32 || i == 16) {
                        try {
                            stringBuffer.append(Ee[43]);
                        } catch (NumberFormatException e2222) {
                            throw e2222;
                        }
                    }
                    stringBuffer.append(" ");
                } catch (NumberFormatException e22222) {
                    throw e22222;
                }
            }
            stringBuffer.append(m3616V().mo3173a(ebVar, obj, i));
            return stringBuffer.toString();
        } catch (NumberFormatException e222222) {
            throw e222222;
        } catch (NumberFormatException e2222222) {
            throw e2222222;
        }
    }

    /* renamed from: a */
    public String mo2740a(eb ebVar, boolean z) {
        return mo2741a(true, null);
    }

    /* renamed from: a */
    public String m3639a(String str, int i, boolean z, boolean z2, String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer("");
        String substring = str.substring(1, str.length());
        String str2 = "";
        try {
            String substring2;
            if (substring.endsWith(String.valueOf('\u0000')) || substring.endsWith(String.valueOf('￿'))) {
                substring2 = substring.substring(substring.length() - 1);
                str2 = substring.substring(0, substring.length() - 1);
            } else {
                substring2 = str2;
                str2 = substring;
            }
            String[] a = C0808l.m4029a(str2, String.valueOf(bb));
            for (int i2 = 0; i2 < a.length; i2++) {
                String[] a2 = C0808l.m4029a(a[i2], String.valueOf(s));
                if (i2 > 0) {
                    try {
                        stringBuffer.append(Ee[30]);
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                eb ebVar = (eb) mo2721b(a2[0]);
                Object a3 = ebVar.m5817a(new WDChaine(a2[1]));
                if (!substring2.equals("")) {
                    a3 = a3.toString() + substring2;
                }
                stringBuffer.append(m3637a(ebVar, a3, i, z, z2, false));
            }
            return stringBuffer.toString();
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public String m3640a(String str, int i, boolean z, String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer("");
        String substring = str.substring(1, str.length());
        String str2 = "";
        try {
            String substring2;
            if (substring.endsWith(String.valueOf('\u0000')) || substring.endsWith(String.valueOf('￿'))) {
                substring2 = substring.substring(substring.length() - 1);
                str2 = substring.substring(0, substring.length() - 1);
            } else {
                substring2 = str2;
                str2 = substring;
            }
            String[] a = C0808l.m4029a(str2, String.valueOf(bb));
            for (int i2 = 0; i2 < a.length; i2++) {
                String[] a2 = C0808l.m4029a(a[i2], String.valueOf(s));
                if (i2 > 0) {
                    try {
                        stringBuffer.append(Ee[30]);
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                stringBuffer.append(m3636a((eb) mo2721b(a2[0]), a2[1] + substring2, i, z, false));
            }
            return stringBuffer.toString();
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public String m3641a(String str, String str2, int i) {
        if (m3716j()) {
            String str3 = "";
            try {
                return mo2753v().mo2904c(this.we, str, str2, i);
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
                return str3;
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
                return str3;
            }
        }
        int i2 = (i & 4) == 4 ? 1 : 0;
        int i3 = (i & 8) == 8 ? 1 : 0;
        boolean z = (i & 128) == 128;
        boolean z2 = (i & 8192) == 8192;
        int i4 = (i & 16) == 16 ? 1 : 0;
        int i5 = (i & 2) == 2 ? 1 : 0;
        int i6 = (i & 32) == 32 ? 1 : 0;
        Object obj = (i & 64) == 64 ? 1 : null;
        int i7 = (i & 256) == 256 ? 1 : 0;
        int i8 = (i7 == 0 && i4 == 0 && i2 == 0 && i3 == 0 && i5 == 0 && i6 == 0) ? 1 : i7;
        Object arrayList = new ArrayList();
        for (eb ebVar : this.Td.values()) {
            try {
                if (!ebVar.m5853j()) {
                    try {
                        if (!ebVar.m5810L()) {
                            try {
                                if (ebVar.mo3136a()) {
                                    if (((i2 | i6) | i8) != 0) {
                                        arrayList.add(ebVar.m5819a(z, z2));
                                    }
                                } else if (((i8 | i6) | i5) != 0) {
                                    try {
                                        arrayList.add(ebVar.m5819a(z, z2));
                                    } catch (C0841b e3) {
                                        throw e3;
                                    }
                                } else {
                                    continue;
                                }
                            } catch (C0841b e32) {
                                throw e32;
                            }
                        } else if (((i4 | i6) | i8) != 0) {
                            arrayList.add(ebVar.m5819a(z, z2));
                        }
                    } catch (C0841b e322) {
                        throw e322;
                    }
                } else if ((i3 | i6) != 0) {
                    arrayList.add(ebVar.m5819a(z, z2));
                }
            } catch (C0841b e3222) {
                throw e3222;
            }
        }
        if (obj != null) {
            try {
                Collections.sort(arrayList);
            } catch (C0841b e32222) {
                throw e32222;
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        i7 = 0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                if (i7 > 0) {
                    stringBuffer.append(Ee[59]);
                }
                stringBuffer.append(it.next());
                i7++;
            } catch (C0841b e322222) {
                throw e322222;
            } catch (C0841b e3222222) {
                throw e3222222;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public String mo2741a(boolean z, C0833j c0833j) {
        String c;
        String str = "";
        if (m3716j()) {
            try {
                c = mo2753v().mo2902c(this.we);
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
                c = str;
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
                c = str;
            }
            if (c != null) {
                return c;
            }
        }
        c = this.le;
        try {
            if (this.le == null) {
                c = this.re.equals("") ? this.te : this.re;
            } else {
                int indexOf = this.le.indexOf(ce);
                if (indexOf != -1) {
                    c = this.le.substring(0, indexOf);
                }
            }
            if (!z) {
                return c;
            }
            if (c0833j == null) {
                WDHF_Connexion a = m3629a("", true, false);
                if (a != null) {
                    c0833j = a.m4967o();
                }
            }
            if (c0833j != null) {
                return c0833j.mo3174a(c);
            }
            C0691a.m2856a(Ee[6]);
            return c;
        } catch (C0841b e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    public final String m3643a(Object[] objArr, String str) {
        if (objArr == null) {
            objArr = m3733u();
        }
        String[] m = C0808l.m4055m(m3641a("", "", 22));
        StringBuilder stringBuilder = new StringBuilder();
        int length = m.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3;
            eb ebVar = (eb) mo2721b(m[i]);
            if (ebVar != null) {
                try {
                    if (ebVar.m5848f() != 30) {
                        if (i2 > 0) {
                            stringBuilder.append(str);
                        }
                        Object b = ebVar.m5833b(objArr);
                        if (b == null) {
                            try {
                                stringBuilder.append("");
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                        stringBuilder.append(ebVar.m5832b(b));
                        i3 = i2 + 1;
                        i++;
                        i2 = i3;
                    }
                } catch (NumberFormatException e2) {
                    throw e2;
                } catch (NumberFormatException e22) {
                    throw e22;
                }
            }
            i3 = i2;
            i++;
            i2 = i3;
        }
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public String m3644a(Object[] objArr, boolean z, Object[] objArr2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(Ee[28]);
        eb ebVar = null;
        int i = 0;
        for (int i2 = 0; i2 < objArr.length; i2++) {
            eb ebVar2 = (eb) objArr[i2];
            if (ebVar2.m5853j()) {
                HashMap t = ebVar2.m5861t();
                for (Object obj : t.keySet()) {
                    String obj2 = obj.toString();
                    ebVar2 = (eb) mo2721b(obj2);
                    boolean D = ebVar2.m5802D();
                    try {
                        ebVar2.m5837b(((Boolean) t.get(obj2)).booleanValue());
                        if (ebVar != null) {
                            stringBuffer.append(Ee[66]);
                            stringBuffer.append(m3637a(ebVar, objArr2[ebVar.m5854k()], 1, z, true, false));
                            stringBuffer.append(Ee[55]);
                            i += 2;
                        }
                        stringBuffer.append(m3637a(ebVar2, objArr2[ebVar2.m5854k()], 0, z, true, false));
                        ebVar2.m5837b(D);
                        ebVar = ebVar2;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                continue;
            } else {
                try {
                    if (ebVar2.m5848f() != 100) {
                        if (i2 > 0) {
                            try {
                                if (ebVar2.m5848f() == 6) {
                                    continue;
                                }
                            } catch (NumberFormatException e2) {
                                throw e2;
                            }
                        }
                        if (ebVar != null) {
                            try {
                                stringBuffer.append(Ee[66]);
                                stringBuffer.append(m3637a(ebVar, objArr2[ebVar.m5854k()], 1, z, true, false));
                                stringBuffer.append(Ee[55]);
                                i += 2;
                            } catch (NumberFormatException e22) {
                                throw e22;
                            }
                        }
                        stringBuffer.append(m3637a(ebVar2, objArr2[ebVar2.m5854k()], 0, z, true, false));
                        ebVar = ebVar2;
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e222) {
                    throw e222;
                }
            }
        }
        int i3 = 0;
        while (i3 < i) {
            try {
                stringBuffer.append(")");
                i3++;
            } catch (NumberFormatException e2222) {
                throw e2222;
            }
        }
        stringBuffer.append(")");
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public final void m3645a(C0758k c0758k, eb ebVar) {
        try {
            if (c0758k.mo2640l() > 1) {
                return;
            }
            if (!c0758k.isTableauAssociatif()) {
                IWDAllocateur q = c0758k.mo2645q();
                if (q != null) {
                    try {
                        WDObjet O;
                        c0758k.mo2480e();
                        if (ebVar == null) {
                            O = mo2739O();
                        }
                        IWDParcours pourTout = WDParcoursFichier.pourTout(this, O, true);
                        try {
                            Collection<eb> values = this.Td.values();
                            while (pourTout.testParcours()) {
                                WDObjet a = C0611a.m2296a(q, true);
                                for (eb ebVar2 : values) {
                                    WDObjet element = a.getElement(ebVar2.mo3137b(), false);
                                    if (element != null) {
                                        element.setValeur(ebVar2.getValeur());
                                    }
                                }
                                c0758k.mo2666d(a);
                            }
                            if (pourTout != null) {
                                try {
                                    pourTout.finParcours();
                                } catch (NumberFormatException e) {
                                    throw e;
                                }
                            }
                        } catch (NumberFormatException e2) {
                            throw e2;
                        } catch (Throwable th) {
                            if (pourTout != null) {
                                try {
                                    pourTout.finParcours();
                                } catch (NumberFormatException e22) {
                                    throw e22;
                                }
                            }
                        }
                    } catch (NumberFormatException e222) {
                        throw e222;
                    }
                }
            }
        } catch (NumberFormatException e2222) {
            throw e2222;
        } catch (NumberFormatException e22222) {
            throw e22222;
        }
    }

    /* renamed from: a */
    public void mo2720a(WDHF_Connexion wDHF_Connexion) {
        m3587b(wDHF_Connexion);
    }

    /* renamed from: a */
    public void m3647a(WDHF_Connexion wDHF_Connexion, String str) {
        C0833j o = wDHF_Connexion.m4967o();
        switch (o.mo3114k()) {
            case 1:
                WDHF_Contexte.getInstance().m5009b(true);
                WDHF_Contexte.getInstance().m5000a(new C0860m(o.mo3114k(), C0745b.m3222b(Ee[67], mo2719a()), o.m5322m(), C0745b.m3222b(Ee[71], o.m5315f(), String.valueOf(o.m5322m()), o.m5290a()), mo2719a(), "", wDHF_Connexion.m4965m(), wDHF_Connexion.m4961i()));
                return;
            case 3:
                WDHF_Contexte.getInstance().m5000a(new C0860m(o.mo3114k(), C0745b.m3222b(Ee[72], mo2719a()), o.m5322m(), C0745b.m3222b(Ee[71], o.m5315f(), String.valueOf(o.m5322m()), o.m5290a()), mo2719a(), "", wDHF_Connexion.m4965m(), wDHF_Connexion.m4961i()));
                return;
            case C0542t.wd /*70018*/:
                WDHF_Contexte.getInstance().m5000a(new C0860m(o.mo3114k(), C0745b.m3222b(Ee[69], mo2719a()), o.m5322m(), C0745b.m3222b(Ee[71], o.m5315f(), String.valueOf(o.m5322m()), o.m5290a()), mo2719a(), "", wDHF_Connexion.m4965m(), wDHF_Connexion.m4961i()));
                return;
            default:
                String b;
                String str2 = "";
                String a = o.m5290a();
                if (str.equals("")) {
                    b = C0745b.m3222b(Ee[70], new String[0]);
                } else {
                    b = C0745b.m3222b(Ee[68], str);
                }
                if (a != null) {
                    try {
                        if (!a.equals("")) {
                            b = C0808l.m4023a(b, a);
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, b, o.m5322m(), C0745b.m3222b(Ee[71], o.m5315f(), String.valueOf(o.m5322m()), a), mo2719a(), "", wDHF_Connexion.m4965m(), wDHF_Connexion.m4961i()));
                return;
        }
    }

    /* renamed from: a */
    public void m3648a(Object[] objArr, boolean z) {
        try {
            this.he = objArr;
            this.ye = false;
            if (z) {
                this.ie = m3667a(objArr);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public boolean m3649a(int i, WDJaugeJNI wDJaugeJNI, int i2) {
        if (m3716j()) {
            try {
                boolean a = mo2753v().mo2820a(this.we, i, wDJaugeJNI, i2);
                if (a) {
                    return a;
                }
                WDHF_Manager.m5074a(mo2753v());
                return a;
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
            }
        }
        WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], WDAppelContexte.getContexte().m2731r()), mo2719a()));
        return false;
    }

    /* renamed from: a */
    public boolean m3650a(long j) {
        boolean z = false;
        try {
            if (m3716j()) {
                try {
                    z = mo2753v().mo3043s(this.we, j);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, mo2753v());
                }
                return z;
            }
            WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], C0745b.m3221b(Ee[64])), mo2719a()));
            return z;
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    public final boolean m3651a(long j, int i) {
        boolean z = false;
        try {
            if (m3716j()) {
                try {
                    z = mo2753v().mo2981i(this.we, j, i);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, mo2753v());
                }
                return z;
            }
            WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], WDAppelContexte.getContexte().m2731r()), mo2719a()));
            return z;
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    public boolean m3652a(long j, long j2) {
        boolean z = false;
        if (m3716j()) {
            try {
                z = mo2753v().mo3010m(this.we, j, (int) j2);
                if (!z) {
                    WDHF_Manager.m5074a(mo2753v());
                }
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
            }
        } else if (j != 0) {
            try {
                m3595n(C0745b.m3222b(Ee[22], String.valueOf(j)));
            } catch (C0841b e4) {
                throw e4;
            }
        } else {
            try {
                if (this.De) {
                    m3595n(C0745b.m3222b(Ee[25], mo2719a()));
                }
                try {
                    if (this.he == null) {
                        m3595n(C0745b.m3222b(Ee[24], mo2719a()));
                    } else {
                        z = m3617W();
                        if (z) {
                            try {
                                if (!(this.ze == null || this.ze.m5855l() == null)) {
                                    this.ze.m5855l().m6056f();
                                }
                            } catch (C0841b e42) {
                                throw e42;
                            }
                        }
                    }
                } catch (C0841b e422) {
                    throw e422;
                }
            } catch (C0841b e4222) {
                throw e4222;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean m3653a(long j, WDJaugeJNI wDJaugeJNI) {
        if (m3716j()) {
            try {
                boolean b = mo2753v().mo2881b(this.we, j, wDJaugeJNI);
                if (b) {
                    return b;
                }
                WDHF_Manager.m5074a(mo2753v());
                return b;
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
            }
        }
        WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], WDAppelContexte.getContexte().m2731r()), mo2719a()));
        return false;
    }

    /* renamed from: a */
    public boolean m3654a(WDObjet wDObjet) {
        boolean j;
        boolean z;
        boolean z2 = false;
        String str = "";
        if (wDObjet != null) {
            str = wDObjet.getString();
        }
        if (!str.equals("")) {
            byte b = this.ue;
            C0832f c0832f = null;
            try {
                j = m3716j();
                c0832f = mo2753v();
            } catch (Exception e) {
                Exception exception = e;
                z = z2;
                try {
                    WDErreurManager.m2882a(exception);
                    z2 = z;
                } finally {
                    this.ue = b;
                }
            } catch (WDJNIException e2) {
                WDJNIException wDJNIException = e2;
                z = z2;
                WDHF_Manager.m5075a(wDJNIException, mo2753v());
                this.ue = b;
                z2 = z;
            } catch (Throwable th) {
                if (j) {
                    RuntimeException runtimeException = new RuntimeException(th);
                } else {
                    z2 = true;
                }
            }
            if (c0832f != null) {
                z2 = c0832f.mo3060w(m3717k(), str);
            }
            this.ue = b;
            if (!z2) {
                WDHF_Manager.m5074a(mo2753v());
                return z2;
            }
        }
        if (str.equals("")) {
            return m3585a(true, "");
        }
        WDObjet l = m3720l(str);
        if (l == null) {
            return z2;
        }
        if (!(wDObjet instanceof WDSourceDonnees)) {
            return true;
        }
        ((WDSourceDonnees) wDObjet).setValeur(l);
        return true;
    }

    /* renamed from: a */
    public boolean m3655a(C0845h c0845h, boolean z) {
        boolean z2 = false;
        if (c0845h != null) {
            z2 = c0845h.m5766d();
            try {
                this.pe = c0845h.m5761a();
                this.Ae = c0845h.m5763b();
                if (z) {
                    if (c0845h.m5765c() != null) {
                        this.ie = c0845h.m5765c();
                    }
                }
            } catch (NumberFormatException e) {
                throw e;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        return z2;
    }

    /* renamed from: a */
    public boolean m3656a(db dbVar, WDEnregistrement wDEnregistrement, String str, String str2, int i) {
        Object obj = (i & 2048) == 2048 ? 1 : null;
        Object obj2 = (i & 32) == 32 ? 1 : null;
        try {
            ArrayList arrayList;
            eb ebVar;
            eb ebVar2;
            WDObjet b;
            Iterator it;
            if (C0808l.m4053k(str) && C0808l.m4053k(str2)) {
                arrayList = new ArrayList();
                boolean z = false;
                for (eb ebVar22 : this.Td.values()) {
                    boolean z2;
                    ebVar = (eb) dbVar.mo2721b(ebVar22.mo3137b());
                    if (ebVar != null) {
                        try {
                            if (!ebVar22.mo3138c() || obj != null) {
                                try {
                                    if (ebVar22.m5813P()) {
                                        continue;
                                    } else {
                                        if (wDEnregistrement != null) {
                                            try {
                                                b = ebVar.m5832b(ebVar.m5833b(wDEnregistrement.m4271a()));
                                            } catch (NumberFormatException e) {
                                                throw e;
                                            }
                                        }
                                        b = ebVar.getValeur();
                                        try {
                                            if (b.isValeurNull()) {
                                                if (!m3722m()) {
                                                    b = ebVar22.m5865x() ? new WDEntier4() : new WDChaine();
                                                }
                                            }
                                            ebVar22.setValeur(b);
                                            z2 = true;
                                        } catch (NumberFormatException e2) {
                                            throw e2;
                                        } catch (NumberFormatException e22) {
                                            throw e22;
                                        }
                                    }
                                } catch (NumberFormatException e222) {
                                    throw e222;
                                }
                            }
                        } catch (NumberFormatException e2222) {
                            throw e2222;
                        }
                    } else if (obj2 != null) {
                        try {
                            arrayList.add(ebVar22);
                            z2 = z;
                        } catch (NumberFormatException e22222) {
                            throw e22222;
                        }
                    } else {
                        z2 = z;
                    }
                    z = z2;
                }
                if (!z) {
                    try {
                        WDErreurManager.m2883a(C0745b.m3222b(Ee[78], C0745b.m3221b(Ee[80])) + "\n" + C0745b.m3222b(Ee[76], mo2719a(), dbVar.mo2719a()));
                    } catch (NumberFormatException e222222) {
                        throw e222222;
                    }
                }
                if (obj2 == null) {
                    return z;
                }
                it = arrayList.iterator();
                while (it.hasNext()) {
                    ebVar22 = (eb) it.next();
                    ebVar22.setValeur(ebVar22.m5808J().toString());
                }
                return z;
            }
            ArrayList arrayList2;
            int size;
            arrayList = null;
            if (C0808l.m4053k(str)) {
                arrayList2 = new ArrayList(this.Td.values());
            } else {
                String[] a = C0808l.m4029a(str, Ee[81]);
                arrayList2 = new ArrayList(a.length);
                for (String trim : a) {
                    arrayList2.add(m3726p(C0808l.m4057o(trim.trim().toLowerCase())));
                }
            }
            if (!C0808l.m4053k(str2)) {
                String[] a2 = C0808l.m4029a(str2, Ee[81]);
                ArrayList arrayList3 = new ArrayList(a2.length);
                for (String trim2 : a2) {
                    arrayList3.add(dbVar.m3726p(C0808l.m4057o(trim2.trim().toLowerCase())));
                }
                try {
                    if (arrayList2.size() != arrayList3.size()) {
                        int size2;
                        size = arrayList3 != null ? arrayList3.size() : 0;
                        if (arrayList2 != null) {
                            try {
                                size2 = arrayList2.size();
                            } catch (NumberFormatException e2222222) {
                                throw e2222222;
                            }
                        }
                        size2 = 0;
                        WDErreurManager.m2883a(C0745b.m3222b(Ee[78], C0745b.m3221b(Ee[80])) + "\n" + C0745b.m3222b(Ee[77], String.valueOf(size2), String.valueOf(size)));
                    }
                    arrayList = arrayList3;
                } catch (NumberFormatException e22222222) {
                    throw e22222222;
                } catch (NumberFormatException e222222222) {
                    throw e222222222;
                }
            }
            int i2 = 0;
            boolean z3 = false;
            while (i2 < arrayList2.size()) {
                ebVar22 = (eb) arrayList2.get(i2);
                try {
                    if (ebVar22.mo3138c() && obj == null) {
                        WDErreurManager.m2883a(C0745b.m3222b(Ee[78], C0745b.m3221b(Ee[80])) + "\n" + C0745b.m3222b(Ee[75], mo2719a(), ebVar22.mo3137b()));
                    }
                    try {
                        boolean z4;
                        if (ebVar22.m5853j()) {
                            WDErreurManager.m2883a(C0745b.m3222b(Ee[78], C0745b.m3221b(Ee[80])) + "\n" + C0745b.m3222b(Ee[79], ebVar22.mo3137b()));
                        }
                        ebVar = arrayList == null ? (eb) dbVar.mo2721b(ebVar22.mo3137b()) : (eb) arrayList.get(i2);
                        if (ebVar != null) {
                            b = ebVar.getValeur();
                            try {
                                if (b.isValeurNull()) {
                                    if (!m3722m()) {
                                        b = ebVar22.m5865x() ? new WDEntier4() : new WDChaine();
                                    }
                                }
                                ebVar22.setValeur(b);
                                z4 = true;
                            } catch (NumberFormatException e2222222222) {
                                throw e2222222222;
                            } catch (NumberFormatException e22222222222) {
                                throw e22222222222;
                            }
                        } else if (obj2 != null) {
                            try {
                                ebVar22.setValeur(ebVar22.m5808J().toString());
                                z4 = z3;
                            } catch (NumberFormatException e222222222222) {
                                throw e222222222222;
                            }
                        } else {
                            z4 = z3;
                        }
                        i2++;
                        z3 = z4;
                    } catch (NumberFormatException e2222222222222) {
                        throw e2222222222222;
                    }
                } catch (NumberFormatException e22222222222222) {
                    throw e22222222222222;
                } catch (NumberFormatException e222222222222222) {
                    throw e222222222222222;
                }
            }
            if (!z3) {
                try {
                    WDErreurManager.m2883a(C0745b.m3222b(Ee[78], C0745b.m3221b(Ee[80])) + "\n" + C0745b.m3222b(Ee[76], mo2719a(), dbVar.mo2719a()));
                } catch (NumberFormatException e2222222222222222) {
                    throw e2222222222222222;
                }
            }
            if (obj2 != null) {
                for (eb ebVar222 : this.Td.values()) {
                    if (arrayList2 != null) {
                        try {
                            if (arrayList2.contains(ebVar222)) {
                            }
                        } catch (NumberFormatException e22222222222222222) {
                            throw e22222222222222222;
                        }
                    }
                    ebVar222.setValeur(ebVar222.m5808J().toString());
                }
            }
            return z3;
        } catch (NumberFormatException e222222222222222222) {
            throw e222222222222222222;
        }
    }

    /* renamed from: a */
    public boolean m3657a(eb ebVar, int i) {
        boolean z = true;
        if (m3716j()) {
            try {
                z = mo2753v().mo2911c(this.we, ebVar.m5852i(), i);
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
                z = false;
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
                z = false;
            }
            if (!z) {
                try {
                    WDHF_Manager.m5074a(mo2753v());
                } catch (C0841b e3) {
                    throw e3;
                }
            }
        }
        try {
            if (ebVar.m5855l() != null) {
                ebVar.m5855l().m6029a(this.se);
            }
            C0859l c0859l = new C0859l(ebVar, this.se);
            try {
                ebVar.m5823a(c0859l);
                c0859l.m6043b(true);
                if (i == 16384) {
                    if (this.ve != null) {
                        ebVar.m5847e(true);
                    }
                }
            } catch (C0841b e32) {
                throw e32;
            } catch (C0841b e322) {
                throw e322;
            }
        } catch (C0841b e3222) {
            throw e3222;
        }
        return z;
    }

    /* renamed from: a */
    public boolean m3658a(eb ebVar, int i, int i2) {
        WDJNIException wDJNIException;
        Exception exception;
        boolean z = false;
        if (m3716j()) {
            try {
                boolean a = mo2753v().mo2827a(this.we, ebVar.m5852i(), i, i2);
                if (a) {
                    try {
                        z = m3607K();
                    } catch (WDJNIException e) {
                        WDJNIException wDJNIException2 = e;
                        z = a;
                        wDJNIException = wDJNIException2;
                        WDHF_Manager.m5075a(wDJNIException, mo2753v());
                        return z;
                    } catch (Exception e2) {
                        Exception exception2 = e2;
                        z = a;
                        exception = exception2;
                        WDErreurManager.m2882a(exception);
                        return z;
                    }
                }
                z = a;
                this.pe = m3602E().ab(this.we);
                this.Ae = m3602E().m4607W(this.we);
                if (!z) {
                    WDHF_Manager.m5074a(mo2753v());
                }
            } catch (WDJNIException wDJNIException3) {
                throw wDJNIException3;
            } catch (C0841b e3) {
                exception = e3;
                WDErreurManager.m2882a(exception);
                return z;
            } catch (WDJNIException e4) {
                wDJNIException3 = e4;
            }
        } else {
            WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], WDAppelContexte.getContexte().m2731r()), mo2719a()));
        }
        return z;
    }

    /* renamed from: a */
    public boolean m3659a(eb ebVar, WDObjet wDObjet, boolean z, boolean z2, long j) {
        WDObjet a;
        Object a2;
        Object obj;
        C0859l l;
        Object[] c;
        WDHF_Connexion a3;
        String a4;
        String a5;
        StringBuffer stringBuffer;
        String str;
        eb ebVar2;
        String b;
        C0859l c0859l;
        int p;
        int p2;
        int a6;
        boolean z3 = (PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM & j) != PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM;
        boolean z4 = (2097152 & j) == 2097152;
        if (ebVar != null) {
            try {
                if (ebVar.m5853j()) {
                    a = m3571a(ebVar, wDObjet);
                    if (!z3) {
                        try {
                            if (a.opEgal("")) {
                                if (z4) {
                                    j -= 2097152;
                                }
                                return m3661a(ebVar, z, z2, j - PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
                            }
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                    if (ebVar == null) {
                        return false;
                    }
                    try {
                        if (m3716j()) {
                            a2 = ebVar.m5817a(a);
                            obj = (PlaybackStateCompat.ACTION_PLAY_FROM_URI & j) != PlaybackStateCompat.ACTION_PLAY_FROM_URI ? 1 : null;
                            Object obj2 = (PlaybackStateCompat.ACTION_PREPARE & j) != PlaybackStateCompat.ACTION_PREPARE ? 1 : null;
                            l = ebVar.m5855l();
                            if (l != null) {
                                if (obj == null) {
                                    try {
                                        l.m6029a(this.se);
                                        ebVar.m5823a(null);
                                    } catch (NumberFormatException e2) {
                                        throw e2;
                                    }
                                }
                                try {
                                    if (l.m6059i().equalsIgnoreCase(a2.toString())) {
                                        if (l.m6047c()) {
                                            try {
                                                if (l.m6060j() == z3) {
                                                    try {
                                                        if (z == l.m6052d() || l.m6063m()) {
                                                            c = z != l.m6052d() ? l.m6049c(this) : l.m6039a(this);
                                                            if (c != null) {
                                                                return false;
                                                            }
                                                            try {
                                                                m3648a(c, z2);
                                                                return true;
                                                            } catch (NumberFormatException e22) {
                                                                throw e22;
                                                            }
                                                        }
                                                    } catch (NumberFormatException e222) {
                                                        throw e222;
                                                    }
                                                }
                                            } catch (NumberFormatException e2222) {
                                                throw e2222;
                                            }
                                        }
                                    }
                                } catch (NumberFormatException e22222) {
                                    throw e22222;
                                } catch (NumberFormatException e222222) {
                                    throw e222222;
                                }
                            }
                            a3 = m3629a("", true, true);
                            if (a3 == null) {
                                return false;
                            }
                            a4 = a3.m4967o().mo3158a(this);
                            a5 = mo2740a(ebVar, z);
                            stringBuffer = new StringBuffer(Ee[28]);
                            str = "";
                            try {
                                if (ebVar.m5853j()) {
                                    if (z3) {
                                        stringBuffer.append(m3637a(ebVar, a2, 2, z, true, false));
                                    } else {
                                        try {
                                            stringBuffer.append(m3637a(ebVar, a2, 1, z, true, false));
                                        } catch (NumberFormatException e2222222) {
                                            throw e2222222;
                                        }
                                    }
                                    stringBuffer.append(Ee[48]).append(m3637a(ebVar, a2, 4, z, true, false));
                                } else if (a2.toString().startsWith(String.valueOf(Tc))) {
                                    ebVar2 = (eb) mo2721b(ebVar.m5805G());
                                    if (z3) {
                                        stringBuffer.append(m3637a(ebVar2, a2, 2, z, true, false));
                                    } else {
                                        try {
                                            stringBuffer.append(m3637a(ebVar2, a2, 1, z, true, false));
                                        } catch (NumberFormatException e22222222) {
                                            throw e22222222;
                                        }
                                    }
                                    stringBuffer.append(Ee[48]).append(m3637a(ebVar2, a2, 4, z, true, false));
                                } else {
                                    if (z3) {
                                        stringBuffer.append("(").append(m3639a(a2.toString(), 2, z, true, null)).append(")");
                                    } else {
                                        try {
                                            stringBuffer.append("(").append(m3639a(a2.toString(), 1, z, true, null)).append(")");
                                        } catch (NumberFormatException e222222222) {
                                            throw e222222222;
                                        }
                                    }
                                    if (null != null) {
                                        stringBuffer.append(Ee[48]).append(m3637a((eb) mo2721b(null[0]), null[1], 4, z, true, false));
                                    }
                                }
                                try {
                                    stringBuffer.append(")");
                                    if (m3613R()) {
                                        if (ebVar.mo3137b().equals(this.ve.m6081b()) || obj2 != null) {
                                            try {
                                                ebVar.m5847e(true);
                                                stringBuffer.append(Ee[30]).append(this.ve.m6085f());
                                                c = mo2744d(ebVar);
                                                b = c == null ? mo2742b(c, z) : str;
                                                c0859l = new C0859l(ebVar, this.se, a2.toString(), z3, z4);
                                                p = c0859l.m6066p();
                                                if (!this.Yd) {
                                                    p = -1;
                                                }
                                                ebVar.m5823a(c0859l);
                                                c0859l.m6046c(z);
                                                try {
                                                    if (m3665a(a3.m4967o().mo3094a(a4, a5, stringBuffer.toString(), b, p), a3, true)) {
                                                        return false;
                                                    }
                                                    p2 = c0859l.m6066p();
                                                    a6 = a3.m4967o().mo3089a(this, c0859l);
                                                    if (a6 < p2 || a6 > 0) {
                                                        try {
                                                            c0859l.m6033a(this.Yd);
                                                            c = c0859l.m6049c(this);
                                                            if (c != null) {
                                                                return false;
                                                            }
                                                            m3648a(c, z2);
                                                            return this.pe;
                                                        } catch (NumberFormatException e2222222222) {
                                                            throw e2222222222;
                                                        }
                                                    }
                                                    if (a6 == -1) {
                                                        try {
                                                            m3647a(a3, "");
                                                        } catch (NumberFormatException e22222222222) {
                                                            throw e22222222222;
                                                        }
                                                    }
                                                    this.pe = false;
                                                    this.Ae = true;
                                                    return false;
                                                } catch (NumberFormatException e222222222222) {
                                                    throw e222222222222;
                                                }
                                            } catch (NumberFormatException e2222222222222) {
                                                throw e2222222222222;
                                            }
                                        }
                                    }
                                    try {
                                        if (this.ve != null) {
                                            if (!ebVar.mo3137b().equals(this.ve.m6081b())) {
                                                ebVar.m5847e(false);
                                            }
                                        }
                                        c = mo2744d(ebVar);
                                        if (c == null) {
                                        }
                                        c0859l = new C0859l(ebVar, this.se, a2.toString(), z3, z4);
                                        p = c0859l.m6066p();
                                        if (this.Yd) {
                                            p = -1;
                                        }
                                        ebVar.m5823a(c0859l);
                                        c0859l.m6046c(z);
                                        if (m3665a(a3.m4967o().mo3094a(a4, a5, stringBuffer.toString(), b, p), a3, true)) {
                                            return false;
                                        }
                                        p2 = c0859l.m6066p();
                                        a6 = a3.m4967o().mo3089a(this, c0859l);
                                        if (a6 < p2) {
                                        }
                                        if (this.Yd) {
                                        }
                                        c0859l.m6033a(this.Yd);
                                        c = c0859l.m6049c(this);
                                        if (c != null) {
                                            return false;
                                        }
                                        m3648a(c, z2);
                                        return this.pe;
                                    } catch (NumberFormatException e22222222222222) {
                                        throw e22222222222222;
                                    } catch (NumberFormatException e222222222222222) {
                                        throw e222222222222222;
                                    }
                                } catch (NumberFormatException e2222222222222222) {
                                    throw e2222222222222222;
                                } catch (NumberFormatException e22222222222222222) {
                                    throw e22222222222222222;
                                }
                            } catch (NumberFormatException e222222222222222222) {
                                throw e222222222222222222;
                            }
                        }
                        return m3582a(ebVar, a, z, z2, (int) j);
                    } catch (NumberFormatException e2222222222222222222) {
                        throw e2222222222222222222;
                    }
                }
            } catch (NumberFormatException e22222222222222222222) {
                throw e22222222222222222222;
            }
        }
        a = wDObjet;
        if (z3) {
            if (a.opEgal("")) {
                if (z4) {
                    j -= 2097152;
                }
                return m3661a(ebVar, z, z2, j - PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            }
        }
        if (ebVar == null) {
            return false;
        }
        if (m3716j()) {
            a2 = ebVar.m5817a(a);
            if ((PlaybackStateCompat.ACTION_PLAY_FROM_URI & j) != PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
            }
            if ((PlaybackStateCompat.ACTION_PREPARE & j) != PlaybackStateCompat.ACTION_PREPARE) {
            }
            l = ebVar.m5855l();
            if (l != null) {
                if (obj == null) {
                    l.m6029a(this.se);
                    ebVar.m5823a(null);
                } else if (l.m6059i().equalsIgnoreCase(a2.toString())) {
                    if (l.m6047c()) {
                        if (l.m6060j() == z3) {
                            if (z != l.m6052d()) {
                            }
                            if (c != null) {
                                return false;
                            }
                            m3648a(c, z2);
                            return true;
                        }
                    }
                }
            }
            a3 = m3629a("", true, true);
            if (a3 == null) {
                return false;
            }
            a4 = a3.m4967o().mo3158a(this);
            a5 = mo2740a(ebVar, z);
            stringBuffer = new StringBuffer(Ee[28]);
            str = "";
            if (ebVar.m5853j()) {
                if (z3) {
                    stringBuffer.append(m3637a(ebVar, a2, 2, z, true, false));
                } else {
                    stringBuffer.append(m3637a(ebVar, a2, 1, z, true, false));
                }
                stringBuffer.append(Ee[48]).append(m3637a(ebVar, a2, 4, z, true, false));
            } else if (a2.toString().startsWith(String.valueOf(Tc))) {
                ebVar2 = (eb) mo2721b(ebVar.m5805G());
                if (z3) {
                    stringBuffer.append(m3637a(ebVar2, a2, 2, z, true, false));
                } else {
                    stringBuffer.append(m3637a(ebVar2, a2, 1, z, true, false));
                }
                stringBuffer.append(Ee[48]).append(m3637a(ebVar2, a2, 4, z, true, false));
            } else {
                if (z3) {
                    stringBuffer.append("(").append(m3639a(a2.toString(), 2, z, true, null)).append(")");
                } else {
                    stringBuffer.append("(").append(m3639a(a2.toString(), 1, z, true, null)).append(")");
                }
                if (null != null) {
                    stringBuffer.append(Ee[48]).append(m3637a((eb) mo2721b(null[0]), null[1], 4, z, true, false));
                }
            }
            stringBuffer.append(")");
            if (m3613R()) {
                ebVar.m5847e(true);
                stringBuffer.append(Ee[30]).append(this.ve.m6085f());
                c = mo2744d(ebVar);
                if (c == null) {
                }
                c0859l = new C0859l(ebVar, this.se, a2.toString(), z3, z4);
                p = c0859l.m6066p();
                if (this.Yd) {
                    p = -1;
                }
                ebVar.m5823a(c0859l);
                c0859l.m6046c(z);
                if (m3665a(a3.m4967o().mo3094a(a4, a5, stringBuffer.toString(), b, p), a3, true)) {
                    return false;
                }
                p2 = c0859l.m6066p();
                a6 = a3.m4967o().mo3089a(this, c0859l);
                if (a6 < p2) {
                }
                if (this.Yd) {
                }
                c0859l.m6033a(this.Yd);
                c = c0859l.m6049c(this);
                if (c != null) {
                    return false;
                }
                m3648a(c, z2);
                return this.pe;
            }
            if (this.ve != null) {
                if (ebVar.mo3137b().equals(this.ve.m6081b())) {
                    ebVar.m5847e(false);
                }
            }
            c = mo2744d(ebVar);
            if (c == null) {
            }
            c0859l = new C0859l(ebVar, this.se, a2.toString(), z3, z4);
            p = c0859l.m6066p();
            if (this.Yd) {
                p = -1;
            }
            ebVar.m5823a(c0859l);
            c0859l.m6046c(z);
            if (m3665a(a3.m4967o().mo3094a(a4, a5, stringBuffer.toString(), b, p), a3, true)) {
                return false;
            }
            p2 = c0859l.m6066p();
            a6 = a3.m4967o().mo3089a(this, c0859l);
            if (a6 < p2) {
            }
            if (this.Yd) {
            }
            c0859l.m6033a(this.Yd);
            c = c0859l.m6049c(this);
            if (c != null) {
                return false;
            }
            m3648a(c, z2);
            return this.pe;
        }
        return m3582a(ebVar, a, z, z2, (int) j);
    }

    /* renamed from: a */
    public boolean m3660a(eb ebVar, String str, int i, String str2) {
        if (str.equals("")) {
            File file = null;
        } else {
            Object j = C0897o.m6290j(str);
        }
        try {
            if (this.ie == null) {
                this.ie = m3601D();
            }
            try {
                if (ebVar.m5848f() != 30) {
                    WDErreurManager.m2883a(C0745b.m3222b(Ee[41], ebVar.mo3137b(), mo2719a()));
                }
                boolean j2 = m3716j();
                if (j2) {
                    try {
                        C0832f v = mo2753v();
                        if (!v.mo2830a(this.we, ebVar.m5852i(), str, i, str2)) {
                            WDHF_Manager.m5074a(v);
                            return false;
                        }
                    } catch (Exception e) {
                        WDErreurManager.m2882a(e);
                    } catch (WDJNIException e2) {
                        WDHF_Manager.m5075a(e2, mo2753v());
                    }
                }
                if (j == null) {
                    try {
                        this.ie[ebVar.m5854k()] = ebVar.m5808J();
                    } catch (C0841b e3) {
                        throw e3;
                    }
                } else if (j2) {
                    try {
                        this.ie[ebVar.m5854k()] = new C0862o(j);
                    } catch (C0841b e32) {
                        throw e32;
                    } catch (C0901s e4) {
                        WDErreurManager.m2883a(e4.getMessage());
                        return false;
                    }
                } else {
                    this.ie[ebVar.m5854k()] = new WDChaine(bb.m3842a(j, null));
                }
                return true;
            } catch (C0841b e322) {
                throw e322;
            }
        } catch (C0841b e3222) {
            throw e3222;
        }
    }

    /* renamed from: a */
    public boolean m3661a(eb ebVar, boolean z, boolean z2, long j) {
        if (ebVar == null) {
            return false;
        }
        try {
            if (m3716j()) {
                return m3583a(ebVar, z, z2, (int) j);
            }
            Object[] c;
            Object obj = (PlaybackStateCompat.ACTION_PLAY_FROM_URI & j) == PlaybackStateCompat.ACTION_PLAY_FROM_URI ? 1 : null;
            Object obj2 = (PlaybackStateCompat.ACTION_PREPARE & j) == PlaybackStateCompat.ACTION_PREPARE ? 1 : null;
            if (ebVar.m5855l() != null) {
                C0859l l = ebVar.m5855l();
                if (obj == null) {
                    try {
                        l.m6029a(this.se);
                        ebVar.m5823a(null);
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
                try {
                    if (l.m6059i() == null) {
                        if (z == l.m6052d() && l.m6063m()) {
                            c = z == l.m6052d() ? l.m6049c(this) : l.m6039a(this);
                            if (c == null) {
                                return false;
                            }
                            try {
                                m3648a(c, z2);
                                return true;
                            } catch (NumberFormatException e2) {
                                throw e2;
                            }
                        }
                    }
                } catch (NumberFormatException e22) {
                    throw e22;
                } catch (NumberFormatException e222) {
                    throw e222;
                }
            }
            WDHF_Connexion a = m3629a("", true, true);
            if (a == null) {
                return false;
            }
            String str;
            C0859l c0859l;
            int p;
            int p2;
            int a2;
            String a3 = a.m4967o().mo3158a(this);
            String a4 = mo2740a(ebVar, z);
            String str2 = "";
            String str3 = "";
            Object[] d = mo2744d(ebVar);
            if (d != null) {
                try {
                    if (d.length > 0) {
                        if (m3613R()) {
                            try {
                                if (this.ve.m6081b().equals(ebVar.mo3137b()) || obj2 != null) {
                                    ebVar.m5847e(true);
                                    str2 = Ee[36] + this.ve.m6085f();
                                    str3 = mo2742b(d, z);
                                    str = str2;
                                    c0859l = new C0859l(ebVar, this.se);
                                    p = c0859l.m6066p();
                                    if (!this.Yd) {
                                        p = -1;
                                    }
                                    if (m3665a(a.m4967o().mo3094a(a3, a4, str, str3, p), a, true)) {
                                        return false;
                                    }
                                    ebVar.m5823a(c0859l);
                                    c0859l.m6046c(z);
                                    p2 = c0859l.m6066p();
                                    a2 = a.m4967o().mo3089a(this, c0859l);
                                    if (a2 < p2 || a2 > 0) {
                                        try {
                                            c0859l.m6033a(this.Yd);
                                            c = c0859l.m6049c(this);
                                            if (c != null) {
                                                return false;
                                            }
                                            m3648a(c, z2);
                                            return this.pe;
                                        } catch (NumberFormatException e2222) {
                                            throw e2222;
                                        }
                                    }
                                    if (a2 == -1) {
                                        try {
                                            m3647a(a, "");
                                        } catch (NumberFormatException e22222) {
                                            throw e22222;
                                        }
                                    }
                                    this.pe = false;
                                    this.Ae = true;
                                    return false;
                                }
                            } catch (NumberFormatException e222222) {
                                throw e222222;
                            }
                        }
                        try {
                            if (this.ve != null) {
                                if (!ebVar.mo3137b().equals(this.ve.m6081b())) {
                                    ebVar.m5847e(false);
                                }
                            }
                            str3 = mo2742b(d, z);
                            str = str2;
                            c0859l = new C0859l(ebVar, this.se);
                            p = c0859l.m6066p();
                            if (this.Yd) {
                                p = -1;
                            }
                            if (m3665a(a.m4967o().mo3094a(a3, a4, str, str3, p), a, true)) {
                                return false;
                            }
                            ebVar.m5823a(c0859l);
                            c0859l.m6046c(z);
                            p2 = c0859l.m6066p();
                            a2 = a.m4967o().mo3089a(this, c0859l);
                            if (a2 < p2) {
                            }
                            if (this.Yd) {
                            }
                            c0859l.m6033a(this.Yd);
                            c = c0859l.m6049c(this);
                            if (c != null) {
                                return false;
                            }
                            m3648a(c, z2);
                            return this.pe;
                        } catch (NumberFormatException e2222222) {
                            throw e2222222;
                        } catch (NumberFormatException e22222222) {
                            throw e22222222;
                        }
                    }
                } catch (NumberFormatException e222222222) {
                    throw e222222222;
                } catch (NumberFormatException e2222222222) {
                    throw e2222222222;
                }
            }
            str = str2;
            c0859l = new C0859l(ebVar, this.se);
            p = c0859l.m6066p();
            if (this.Yd) {
                p = -1;
            }
            try {
                if (m3665a(a.m4967o().mo3094a(a3, a4, str, str3, p), a, true)) {
                    return false;
                }
                ebVar.m5823a(c0859l);
                c0859l.m6046c(z);
                p2 = c0859l.m6066p();
                a2 = a.m4967o().mo3089a(this, c0859l);
                if (a2 < p2) {
                }
                if (this.Yd) {
                }
                c0859l.m6033a(this.Yd);
                c = c0859l.m6049c(this);
                if (c != null) {
                    return false;
                }
                m3648a(c, z2);
                return this.pe;
            } catch (NumberFormatException e22222222222) {
                throw e22222222222;
            }
        } catch (NumberFormatException e222222222222) {
            throw e222222222222;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public boolean m3662a(fr.pcsoft.wdjava.database.hf.eb r27, boolean r28, boolean r29, long r30, long r32) {
        /*
        r26 = this;
        if (r27 != 0) goto L_0x0004;
    L_0x0002:
        r4 = 0;
    L_0x0003:
        return r4;
    L_0x0004:
        r4 = r26.m3716j();	 Catch:{ NumberFormatException -> 0x001c }
        if (r4 == 0) goto L_0x001e;
    L_0x000a:
        r0 = r32;
        r10 = (int) r0;	 Catch:{ NumberFormatException -> 0x001c }
        r4 = r26;
        r5 = r27;
        r6 = r28;
        r7 = r29;
        r8 = r30;
        r4 = r4.m3584a(r5, r6, r7, r8, r10);	 Catch:{ NumberFormatException -> 0x001c }
        goto L_0x0003;
    L_0x001c:
        r4 = move-exception;
        throw r4;
    L_0x001e:
        r22 = r27.m5855l();
        if (r22 != 0) goto L_0x0044;
    L_0x0024:
        r4 = Ee;	 Catch:{ NumberFormatException -> 0x0098 }
        r5 = 74;
        r4 = r4[r5];	 Catch:{ NumberFormatException -> 0x0098 }
        r5 = 2;
        r5 = new java.lang.String[r5];	 Catch:{ NumberFormatException -> 0x0098 }
        r6 = 0;
        r7 = r27.mo3137b();	 Catch:{ NumberFormatException -> 0x0098 }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x0098 }
        r6 = 1;
        r7 = r26.mo2719a();	 Catch:{ NumberFormatException -> 0x0098 }
        r5[r6] = r7;	 Catch:{ NumberFormatException -> 0x0098 }
        r4 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r4, r5);	 Catch:{ NumberFormatException -> 0x0098 }
        r0 = r26;
        r0.m3595n(r4);	 Catch:{ NumberFormatException -> 0x0098 }
    L_0x0044:
        r4 = r22.m6052d();	 Catch:{ NumberFormatException -> 0x009a }
        if (r4 != 0) goto L_0x0385;
    L_0x004a:
        if (r28 != 0) goto L_0x009e;
    L_0x004c:
        r4 = 1;
    L_0x004d:
        r5 = r4;
    L_0x004e:
        r4 = r22.m6061k();	 Catch:{ NumberFormatException -> 0x00a0 }
        r0 = r26;
        r6 = r0.se;	 Catch:{ NumberFormatException -> 0x00a0 }
        if (r4 >= r6) goto L_0x00b0;
    L_0x0058:
        r0 = r26;
        r4 = r0.se;	 Catch:{ NumberFormatException -> 0x00a2 }
        r0 = r22;
        r0.m6029a(r4);	 Catch:{ NumberFormatException -> 0x00a2 }
        r4 = -1;
        r0 = r22;
        r0.m6054e(r4);	 Catch:{ NumberFormatException -> 0x00a2 }
        r0 = r22;
        r1 = r28;
        r0.m6046c(r1);	 Catch:{ NumberFormatException -> 0x00a2 }
        r0 = r26;
        r4 = r0.fe;	 Catch:{ NumberFormatException -> 0x00a2 }
        if (r4 == 0) goto L_0x0083;
    L_0x0074:
        r0 = r26;
        r4 = r0.qe;	 Catch:{ NumberFormatException -> 0x00a4 }
        if (r4 == 0) goto L_0x00a6;
    L_0x007a:
        r0 = r26;
        r4 = r0.qe;	 Catch:{ NumberFormatException -> 0x00a4 }
        r0 = r22;
        r0.m6034a(r4);	 Catch:{ NumberFormatException -> 0x00a4 }
    L_0x0083:
        r4 = 0;
        r0 = r22;
        r0.m6043b(r4);
        r4 = "";
        r5 = 1;
        r6 = 1;
        r0 = r26;
        r23 = r0.m3629a(r4, r5, r6);
        if (r23 != 0) goto L_0x0175;
    L_0x0095:
        r4 = 0;
        goto L_0x0003;
    L_0x0098:
        r4 = move-exception;
        throw r4;
    L_0x009a:
        r4 = move-exception;
        throw r4;	 Catch:{ NumberFormatException -> 0x009c }
    L_0x009c:
        r4 = move-exception;
        throw r4;
    L_0x009e:
        r4 = 0;
        goto L_0x004d;
    L_0x00a0:
        r4 = move-exception;
        throw r4;	 Catch:{ NumberFormatException -> 0x00a2 }
    L_0x00a2:
        r4 = move-exception;
        throw r4;	 Catch:{ NumberFormatException -> 0x00a4 }
    L_0x00a4:
        r4 = move-exception;
        throw r4;
    L_0x00a6:
        r0 = r26;
        r4 = r0.he;
        r0 = r22;
        r0.m6034a(r4);
        goto L_0x0083;
    L_0x00b0:
        r6 = 1;
        r4 = (r30 > r6 ? 1 : (r30 == r6 ? 0 : -1));
        if (r4 != 0) goto L_0x00d5;
    L_0x00b6:
        if (r5 == 0) goto L_0x00cc;
    L_0x00b8:
        r0 = r22;
        r1 = r26;
        r4 = r0.m6053d(r1);
    L_0x00c0:
        if (r4 == 0) goto L_0x00f1;
    L_0x00c2:
        r0 = r26;
        r1 = r29;
        r0.m3648a(r4, r1);	 Catch:{ NumberFormatException -> 0x00ef }
        r4 = 1;
        goto L_0x0003;
    L_0x00cc:
        r0 = r22;
        r1 = r26;
        r4 = r0.m6045b(r1);
        goto L_0x00c0;
    L_0x00d5:
        if (r5 == 0) goto L_0x00e3;
    L_0x00d7:
        r0 = r30;
        r4 = (int) r0;
        r0 = r22;
        r1 = r26;
        r4 = r0.m6044b(r4, r1);
        goto L_0x00c0;
    L_0x00e3:
        r0 = r30;
        r4 = (int) r0;
        r0 = r22;
        r1 = r26;
        r4 = r0.m6038a(r4, r1);
        goto L_0x00c0;
    L_0x00ef:
        r4 = move-exception;
        throw r4;
    L_0x00f1:
        r4 = r22.m6062l();	 Catch:{ NumberFormatException -> 0x0100 }
        if (r4 == 0) goto L_0x0104;
    L_0x00f7:
        r4 = r22.m6063m();	 Catch:{ NumberFormatException -> 0x0102 }
        if (r4 == 0) goto L_0x0104;
    L_0x00fd:
        r4 = 0;
        goto L_0x0003;
    L_0x0100:
        r4 = move-exception;
        throw r4;	 Catch:{ NumberFormatException -> 0x0102 }
    L_0x0102:
        r4 = move-exception;
        throw r4;
    L_0x0104:
        if (r5 == 0) goto L_0x010c;
    L_0x0106:
        r4 = r22.m6063m();	 Catch:{ NumberFormatException -> 0x014c }
        if (r4 != 0) goto L_0x0120;
    L_0x010c:
        if (r5 != 0) goto L_0x0114;
    L_0x010e:
        r4 = r22.m6057g();	 Catch:{ NumberFormatException -> 0x0150 }
        if (r4 == 0) goto L_0x0120;
    L_0x0114:
        r4 = r22.m6058h();	 Catch:{ NumberFormatException -> 0x0152 }
        if (r4 == 0) goto L_0x015d;
    L_0x011a:
        r4 = r22.m6055e();	 Catch:{ NumberFormatException -> 0x0154 }
        if (r4 != 0) goto L_0x015d;
    L_0x0120:
        r4 = r22.m6059i();	 Catch:{ NumberFormatException -> 0x0156 }
        if (r4 != 0) goto L_0x0132;
    L_0x0126:
        r4 = r22.m6058h();	 Catch:{ NumberFormatException -> 0x0158 }
        if (r4 == 0) goto L_0x015a;
    L_0x012c:
        r4 = r22.m6055e();	 Catch:{ NumberFormatException -> 0x014a }
        if (r4 == 0) goto L_0x015a;
    L_0x0132:
        r0 = r26;
        r4 = r0.se;	 Catch:{ NumberFormatException -> 0x014a }
        r0 = r22;
        r0.m6029a(r4);	 Catch:{ NumberFormatException -> 0x014a }
        r4 = -1;
        r0 = r22;
        r0.m6054e(r4);	 Catch:{ NumberFormatException -> 0x014a }
        r0 = r22;
        r1 = r28;
        r0.m6046c(r1);	 Catch:{ NumberFormatException -> 0x014a }
        goto L_0x0083;
    L_0x014a:
        r4 = move-exception;
        throw r4;
    L_0x014c:
        r4 = move-exception;
        throw r4;	 Catch:{ NumberFormatException -> 0x014e }
    L_0x014e:
        r4 = move-exception;
        throw r4;	 Catch:{ NumberFormatException -> 0x0150 }
    L_0x0150:
        r4 = move-exception;
        throw r4;	 Catch:{ NumberFormatException -> 0x0152 }
    L_0x0152:
        r4 = move-exception;
        throw r4;	 Catch:{ NumberFormatException -> 0x0154 }
    L_0x0154:
        r4 = move-exception;
        throw r4;	 Catch:{ NumberFormatException -> 0x0156 }
    L_0x0156:
        r4 = move-exception;
        throw r4;	 Catch:{ NumberFormatException -> 0x0158 }
    L_0x0158:
        r4 = move-exception;
        throw r4;	 Catch:{ NumberFormatException -> 0x014a }
    L_0x015a:
        r4 = 0;
        goto L_0x0003;
    L_0x015d:
        r0 = r26;
        r4 = r0.se;
        r0 = r22;
        r0.m6029a(r4);
        r4 = -1;
        r0 = r22;
        r0.m6054e(r4);
        r0 = r22;
        r1 = r28;
        r0.m6046c(r1);
        goto L_0x0083;
    L_0x0175:
        r4 = r23.m4967o();
        r0 = r26;
        r6 = r4.mo3158a(r0);
        r4 = r22.m6052d();
        r0 = r26;
        r1 = r27;
        r7 = r0.mo2740a(r1, r4);
        r8 = "";
        r9 = "";
        r24 = r26.mo2744d(r27);
        if (r24 == 0) goto L_0x01f8;
    L_0x0195:
        r0 = r24;
        r4 = r0.length;	 Catch:{ NumberFormatException -> 0x01a9 }
        if (r4 <= 0) goto L_0x01f8;
    L_0x019a:
        r4 = r22.m6064n();
        if (r4 != 0) goto L_0x01ab;
    L_0x01a0:
        r0 = r26;
        r4 = r0.he;
    L_0x01a4:
        if (r4 != 0) goto L_0x01b0;
    L_0x01a6:
        r4 = 0;
        goto L_0x0003;
    L_0x01a9:
        r4 = move-exception;
        throw r4;
    L_0x01ab:
        r4 = r22.m6064n();
        goto L_0x01a4;
    L_0x01b0:
        r5 = r22.m6052d();
        r0 = r26;
        r1 = r24;
        r4 = r0.m3644a(r1, r5, r4);
        r5 = r26.m3613R();	 Catch:{ NumberFormatException -> 0x024a }
        if (r5 == 0) goto L_0x01eb;
    L_0x01c2:
        r5 = r27.m5862u();	 Catch:{ NumberFormatException -> 0x024a }
        if (r5 == 0) goto L_0x01eb;
    L_0x01c8:
        r5 = new java.lang.StringBuilder;
        r5.<init>();
        r4 = r5.append(r4);
        r5 = Ee;
        r8 = 30;
        r5 = r5[r8];
        r4 = r4.append(r5);
        r0 = r26;
        r5 = r0.ve;
        r5 = r5.m6085f();
        r4 = r4.append(r5);
        r4 = r4.toString();
    L_0x01eb:
        r5 = r22.m6052d();
        r0 = r26;
        r1 = r24;
        r9 = r0.mo2742b(r1, r5);
        r8 = r4;
    L_0x01f8:
        r4 = 0;
        r10 = 1;
        r10 = (r30 > r10 ? 1 : (r30 == r10 ? 0 : -1));
        if (r10 <= 0) goto L_0x0381;
    L_0x0200:
        r4 = 0;
        r0 = r22;
        r0.m6051d(r4);	 Catch:{ NumberFormatException -> 0x024c }
        r4 = 100;
        r4 = (r30 > r4 ? 1 : (r30 == r4 ? 0 : -1));
        if (r4 > 0) goto L_0x024e;
    L_0x020c:
        r4 = 1;
        r4 = r30 - r4;
        r20 = r4;
    L_0x0212:
        r4 = 1;
        r4 = (r30 > r4 ? 1 : (r30 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x02f1;
    L_0x0218:
        r4 = r30 - r20;
        r10 = 1;
        r10 = r4 - r10;
        r4 = r22.m6066p();
        r12 = (long) r4;
        r5 = r23.m4967o();
        r4 = r5.mo3110d();
        if (r4 == 0) goto L_0x0253;
    L_0x022d:
        r4 = r26.mo2739O();
        r14 = 1;
        r14 = r4.m5818a(r14, r5);
        r15 = r28;
        r4 = r5.mo3095a(r6, r7, r8, r9, r10, r12, r14, r15);
    L_0x023c:
        r5 = 1;
        r0 = r26;
        r1 = r23;
        r4 = r0.m3665a(r4, r1, r5);	 Catch:{ NumberFormatException -> 0x02ff }
        if (r4 != 0) goto L_0x0301;
    L_0x0247:
        r4 = 0;
        goto L_0x0003;
    L_0x024a:
        r4 = move-exception;
        throw r4;
    L_0x024c:
        r4 = move-exception;
        throw r4;
    L_0x024e:
        r4 = 100;
        r20 = r4;
        goto L_0x0212;
    L_0x0253:
        r14 = 0;
        r4 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1));
        if (r4 != 0) goto L_0x025f;
    L_0x0259:
        r10 = (int) r12;
        r4 = r5.mo3094a(r6, r7, r8, r9, r10);
        goto L_0x023c;
    L_0x025f:
        r15 = new java.lang.StringBuffer;
        r4 = " ";
        r15.<init>(r4);
        r4 = 0;
        r14 = r4;
    L_0x0268:
        r0 = r24;
        r4 = r0.length;	 Catch:{ NumberFormatException -> 0x028b }
        if (r14 >= r4) goto L_0x028f;
    L_0x026d:
        if (r14 <= 0) goto L_0x0278;
    L_0x026f:
        r4 = Ee;	 Catch:{ NumberFormatException -> 0x028d }
        r16 = 27;
        r4 = r4[r16];	 Catch:{ NumberFormatException -> 0x028d }
        r15.append(r4);	 Catch:{ NumberFormatException -> 0x028d }
    L_0x0278:
        r4 = r24[r14];
        r4 = (fr.pcsoft.wdjava.database.hf.eb) r4;
        r16 = 1;
        r0 = r16;
        r4 = r4.m5818a(r0, r5);
        r15.append(r4);
        r4 = r14 + 1;
        r14 = r4;
        goto L_0x0268;
    L_0x028b:
        r4 = move-exception;
        throw r4;	 Catch:{ NumberFormatException -> 0x028d }
    L_0x028d:
        r4 = move-exception;
        throw r4;
    L_0x028f:
        r15 = r15.toString();
        r0 = (int) r10;
        r19 = r0;
        r14 = r5;
        r16 = r7;
        r17 = r8;
        r18 = r9;
        r4 = r14.mo3094a(r15, r16, r17, r18, r19);
        r8 = 1;
        r0 = r26;
        r1 = r23;
        r4 = r0.m3665a(r4, r1, r8);	 Catch:{ NumberFormatException -> 0x02af }
        if (r4 != 0) goto L_0x02b1;
    L_0x02ac:
        r4 = 0;
        goto L_0x0003;
    L_0x02af:
        r4 = move-exception;
        throw r4;
    L_0x02b1:
        r0 = r26;
        r4 = r0.Td;
        r4 = r4.size();
        r8 = (int) r10;
        r0 = r24;
        r4 = r5.mo3102a(r0, r4, r8);
        if (r4 != 0) goto L_0x02e0;
    L_0x02c2:
        r4 = 0;
        r0 = r26;
        r0.pe = r4;	 Catch:{ NumberFormatException -> 0x02de }
        r4 = 1;
        r0 = r26;
        r0.Ae = r4;	 Catch:{ NumberFormatException -> 0x02de }
        r4 = r5.m5322m();	 Catch:{ NumberFormatException -> 0x02de }
        if (r4 == 0) goto L_0x02db;
    L_0x02d2:
        r4 = "";
        r0 = r26;
        r1 = r23;
        r0.m3647a(r1, r4);	 Catch:{ NumberFormatException -> 0x02de }
    L_0x02db:
        r4 = 0;
        goto L_0x0003;
    L_0x02de:
        r4 = move-exception;
        throw r4;
    L_0x02e0:
        r0 = r26;
        r1 = r24;
        r2 = r28;
        r8 = r0.m3644a(r1, r2, r4);
        r10 = (int) r12;
        r4 = r5.mo3094a(r6, r7, r8, r9, r10);
        goto L_0x023c;
    L_0x02f1:
        r5 = r23.m4967o();
        r10 = r22.m6066p();
        r4 = r5.mo3094a(r6, r7, r8, r9, r10);
        goto L_0x023c;
    L_0x02ff:
        r4 = move-exception;
        throw r4;
    L_0x0301:
        r4 = r22.m6066p();
        r5 = r23.m4967o();
        r0 = r26;
        r1 = r22;
        r5 = r5.mo3089a(r0, r1);
        if (r5 >= r4) goto L_0x0355;
    L_0x0313:
        if (r5 > 0) goto L_0x0330;
    L_0x0315:
        r4 = -1;
        if (r5 != r4) goto L_0x0321;
    L_0x0318:
        r4 = "";
        r0 = r26;
        r1 = r23;
        r0.m3647a(r1, r4);	 Catch:{ NumberFormatException -> 0x032e }
    L_0x0321:
        r4 = 0;
        r0 = r26;
        r0.pe = r4;
        r4 = 1;
        r0 = r26;
        r0.Ae = r4;
        r4 = 0;
        goto L_0x0003;
    L_0x032e:
        r4 = move-exception;
        throw r4;
    L_0x0330:
        r6 = 0;
        r4 = (r20 > r6 ? 1 : (r20 == r6 ? 0 : -1));
        if (r4 != 0) goto L_0x0342;
    L_0x0336:
        if (r5 > 0) goto L_0x0355;
    L_0x0338:
        r4 = 1;
        r0 = r26;
        r0.Ae = r4;	 Catch:{ NumberFormatException -> 0x0340 }
        r4 = 0;
        goto L_0x0003;
    L_0x0340:
        r4 = move-exception;
        throw r4;
    L_0x0342:
        r4 = (long) r5;
        r6 = 1;
        r6 = r6 + r20;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 >= 0) goto L_0x0355;
    L_0x034b:
        r4 = 1;
        r0 = r26;
        r0.Ae = r4;	 Catch:{ NumberFormatException -> 0x0353 }
        r4 = 0;
        goto L_0x0003;
    L_0x0353:
        r4 = move-exception;
        throw r4;
    L_0x0355:
        r4 = 0;
        r4 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1));
        if (r4 <= 0) goto L_0x0365;
    L_0x035b:
        r4 = 1;
        r4 = r20 - r4;
        r4 = (int) r4;
        r0 = r22;
        r0.m6054e(r4);	 Catch:{ NumberFormatException -> 0x0372 }
    L_0x0365:
        r0 = r22;
        r1 = r26;
        r4 = r0.m6053d(r1);
        if (r4 != 0) goto L_0x0374;
    L_0x036f:
        r4 = 0;
        goto L_0x0003;
    L_0x0372:
        r4 = move-exception;
        throw r4;
    L_0x0374:
        r0 = r26;
        r1 = r29;
        r0.m3648a(r4, r1);
        r0 = r26;
        r4 = r0.pe;
        goto L_0x0003;
    L_0x0381:
        r20 = r4;
        goto L_0x0212;
    L_0x0385:
        r5 = r28;
        goto L_0x004e;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.db.a(fr.pcsoft.wdjava.database.hf.eb, boolean, boolean, long, long):boolean");
    }

    /* renamed from: a */
    public boolean m3663a(Integer num, ib ibVar, int i) {
        boolean z = true;
        boolean z2 = (i & 8) == 8;
        boolean z3 = (i & 2) == 2;
        if (ibVar.m5983b()) {
            z = m3676b(num.intValue(), i);
        } else {
            try {
                this.Ae = ibVar.m5986e();
                this.pe = ibVar.m5985d();
                m3648a(ibVar.m5984c(), true);
                if (z2) {
                    this.ve = ibVar.m5988g();
                    this.oe = ibVar.m5987f();
                }
                for (eb ebVar : this.Td.values()) {
                    try {
                        ebVar.m5825a(num, this.se, z3);
                        if (z2) {
                            if (this.ve != null) {
                                ebVar.m5847e(ebVar.mo3137b().equals(this.ve.m6081b()));
                            }
                        }
                    } catch (NumberFormatException e) {
                        throw e;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        }
        if (!z3) {
            try {
                this.Rd.remove(num);
            } catch (NumberFormatException e222) {
                throw e222;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean m3664a(Integer num, boolean z, boolean z2) {
        try {
            if (num.intValue() == -1) {
                return false;
            }
            boolean z3;
            boolean z4 = true;
            if (z) {
                try {
                    z4 = mo2753v().mo2814a(num.intValue());
                    if (!z4 && z2) {
                        WDHF_Manager.m5074a(mo2753v());
                    }
                    z3 = z4;
                } catch (C0841b e) {
                    throw e;
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, mo2753v());
                } catch (Exception e3) {
                    WDErreurManager.m2882a(e3);
                    z3 = z4;
                }
                if (this.Rd != null) {
                    return z3;
                }
                this.Rd.remove(num);
                return z3;
            }
            z3 = z4;
            try {
                if (this.Rd != null) {
                    return z3;
                }
                this.Rd.remove(num);
                return z3;
            } catch (C0841b e4) {
                throw e4;
            }
        } catch (C0841b e42) {
            throw e42;
        }
    }

    /* renamed from: a */
    public boolean m3665a(String str, WDHF_Connexion wDHF_Connexion, boolean z) {
        if (wDHF_Connexion.m4967o().mo3099a(str, z)) {
            return true;
        }
        try {
            m3647a(wDHF_Connexion, "");
            this.pe = false;
            this.Ae = true;
            return false;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public boolean m3666a(String str, String str2, String str3, int i, boolean z) {
        Exception exception;
        WDJNIException wDJNIException;
        if (!z) {
            try {
                if (!m3610N()) {
                    return false;
                }
            } catch (C0841b e) {
                throw e;
            }
        }
        if (m3716j()) {
            boolean b;
            if (z) {
                try {
                    b = mo2753v().mo2889b(m3717k(), str, str2, str3, i);
                } catch (Exception e2) {
                    exception = e2;
                    b = false;
                    WDErreurManager.m2882a(exception);
                    return b;
                } catch (WDJNIException e3) {
                    wDJNIException = e3;
                    b = false;
                    WDHF_Manager.m5075a(wDJNIException, mo2753v());
                    return b;
                }
            }
            b = mo2753v().mo2913c(m3717k(), str, str2, str3, i);
            if (b) {
                return b;
            }
            try {
                WDHF_Manager.m5074a(mo2753v());
                return b;
            } catch (C0841b e4) {
                throw e4;
            } catch (WDJNIException e5) {
                wDJNIException = e5;
                WDHF_Manager.m5075a(wDJNIException, mo2753v());
                return b;
            } catch (C0841b e6) {
                exception = e6;
            }
        } else {
            WDHF_Connexion a = m3629a("", true, false);
            if (a == null) {
                return false;
            }
            C0833j o = a.m4967o();
            if (z) {
                if (o.mo3099a(o.mo3094a(Ee[56], mo2741a(true, o), "", "", 0), false)) {
                    return true;
                }
            } else if (!o.mo3099a(o.mo3105b(mo2741a(true, o)), false)) {
                try {
                    m3647a(a, "");
                    return false;
                } catch (C0841b e7) {
                    throw e7;
                }
            }
            if (o.mo3101a(o.mo3107b(this))) {
                this.he = null;
                return true;
            }
            try {
                m3647a(a, "");
                return false;
            } catch (C0841b e72) {
                throw e72;
            }
        }
    }

    /* renamed from: a */
    Object[] m3667a(Object[] objArr) {
        if (objArr == null) {
            return null;
        }
        Object obj = new Object[objArr.length];
        System.arraycopy(objArr, 0, obj, 0, objArr.length);
        return obj;
    }

    public boolean ab() {
        WDJNIException e;
        Exception e2;
        boolean z = true;
        if (m3716j()) {
            try {
                z = mo2753v().mo2995k(this.we);
                if (!z) {
                    try {
                        WDHF_Manager.m5074a(mo2753v());
                    } catch (C0841b e3) {
                        throw e3;
                    } catch (WDJNIException e4) {
                        e = e4;
                        WDHF_Manager.m5075a(e, mo2753v());
                        return z;
                    } catch (C0841b e5) {
                        e2 = e5;
                    }
                }
            } catch (Exception e6) {
                Exception exception = e6;
                z = false;
                e2 = exception;
                WDErreurManager.m2882a(e2);
                return z;
            } catch (WDJNIException e7) {
                WDJNIException wDJNIException = e7;
                z = false;
                e = wDJNIException;
                WDHF_Manager.m5075a(e, mo2753v());
                return z;
            }
        }
        try {
            if (this.ve != null) {
                if (m3613R()) {
                    this.oe = false;
                    m3569U();
                }
            }
        } catch (C0841b e8) {
            throw e8;
        } catch (C0841b e82) {
            throw e82;
        }
        return z;
    }

    /* renamed from: b */
    public final int m3668b() {
        return this.ue;
    }

    /* renamed from: b */
    public int m3669b(eb ebVar) {
        int x;
        Exception exception;
        WDJNIException wDJNIException;
        if (m3716j()) {
            if (ebVar == null) {
                try {
                    x = mo2753v().mo3061x(this.we);
                } catch (Exception e) {
                    Exception exception2 = e;
                    x = -1;
                    exception = exception2;
                    WDErreurManager.m2882a(exception);
                    return x;
                } catch (WDJNIException e2) {
                    WDJNIException wDJNIException2 = e2;
                    x = -1;
                    wDJNIException = wDJNIException2;
                    WDHF_Manager.m5075a(wDJNIException, mo2753v());
                    return x;
                }
            }
            x = mo2753v().mo2930e(this.we, ebVar.m5852i());
            if (x != -1) {
                try {
                    m3578a(new Integer(x), ib.m5980a());
                    return x;
                } catch (C0841b e3) {
                    throw e3;
                } catch (WDJNIException e4) {
                    wDJNIException = e4;
                    WDHF_Manager.m5075a(wDJNIException, mo2753v());
                    return x;
                } catch (C0841b e5) {
                    exception = e5;
                }
            } else {
                WDHF_Manager.m5074a(mo2753v());
                return x;
            }
        }
        ib ibVar = new ib(this, this.pe, this.Ae, this.he, this.ve, this.oe);
        int m = WDHF_Contexte.getInstance().m5030m();
        Integer num = new Integer(m);
        try {
            m3578a(num, ibVar);
            if (ebVar != null) {
                ebVar.m5824a(num);
            } else {
                for (eb a : this.Td.values()) {
                    a.m5824a(num);
                }
            }
            return m;
        } catch (C0841b e6) {
            throw e6;
        }
    }

    /* renamed from: b */
    public int m3670b(eb ebVar, int i) {
        WDJNIException e;
        Exception e2;
        if (ebVar == null) {
            return -1;
        }
        if (m3716j()) {
            int a;
            try {
                a = mo2753v().mo2774a(this.we, ebVar.m5852i(), i);
                if (a != -1) {
                    return a;
                }
                try {
                    WDHF_Manager.m5074a(mo2753v());
                    return a;
                } catch (C0841b e3) {
                    throw e3;
                } catch (WDJNIException e4) {
                    e = e4;
                    WDHF_Manager.m5075a(e, mo2753v());
                    return a;
                } catch (C0841b e5) {
                    e2 = e5;
                }
            } catch (Exception e6) {
                e2 = e6;
                a = -1;
                WDErreurManager.m2882a(e2);
                return a;
            } catch (WDJNIException e7) {
                e = e7;
                a = -1;
                WDHF_Manager.m5075a(e, mo2753v());
                return a;
            }
        }
        try {
            if (this.he == null) {
                m3595n(C0745b.m3222b(Ee[24], mo2719a()));
                return -1;
            }
            try {
                if (ebVar.m5855l() == null) {
                    m3595n(C0745b.m3222b(Ee[74], ebVar.mo3137b(), mo2719a()));
                }
                long a2 = m3626a(0, "", ebVar, true);
                if (a2 == 0) {
                    return -1;
                }
                int a3 = m3624a(ebVar, this.he, true, null);
                return a3 == -1 ? -1 : (int) Math.round(((double) (a3 * 1000)) / ((double) a2));
            } catch (C0841b e8) {
                throw e8;
            }
        } catch (C0841b e82) {
            throw e82;
        }
    }

    /* renamed from: b */
    public <T extends C0849z> T mo2721b(String str) {
        return (C0849z) this.Td.get(C0808l.m4057o(str.toLowerCase()));
    }

    /* renamed from: b */
    public final String m3672b(long j) {
        if (!m3716j()) {
            return "";
        }
        String j2;
        try {
            j2 = mo2753v().mo2986j(m3717k(), j);
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
            j2 = null;
        } catch (WDJNIException e2) {
            WDHF_Manager.m5075a(e2, mo2753v());
            j2 = null;
        }
        try {
            if (!C0808l.m4053k(j2)) {
                return j2;
            }
            WDHF_Manager.m5074a(mo2753v());
            return j2;
        } catch (C0841b e3) {
            throw e3;
        }
    }

    /* renamed from: b */
    public String mo2742b(Object[] objArr, boolean z) {
        if (objArr != null) {
            try {
                if (objArr.length != 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(Ee[58]);
                    int length = objArr.length;
                    int i = 0;
                    while (i < objArr.length) {
                        int i2 = length - 1;
                        String c = ((eb) objArr[i]).m5839c(z);
                        try {
                            stringBuffer.append(c);
                            if (i2 > 0) {
                                if (!c.equals("")) {
                                    stringBuffer.append(Ee[27]);
                                }
                            }
                            i++;
                            length = i2;
                        } catch (NumberFormatException e) {
                            throw e;
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                    return stringBuffer.toString();
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        }
        return "";
    }

    /* renamed from: b */
    public void m3674b(boolean z) {
        try {
            if (this.ve != null) {
                this.oe = z;
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public boolean m3675b(int i) {
        boolean z = false;
        try {
            if (m3716j()) {
                try {
                    z = mo2753v().mo2937e(this.we, i);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, mo2753v());
                }
                return z;
            }
            WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], WDAppelContexte.getContexte().m2731r()), mo2719a()));
            return z;
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    /* renamed from: b */
    public boolean m3676b(int i, int i2) {
        boolean a;
        WDJNIException wDJNIException;
        WDJNIException wDJNIException2;
        Exception exception;
        Exception exception2;
        C0832f v = mo2753v();
        boolean z = false;
        try {
            if (this.ue == (byte) 2) {
                C0845h c = v.mo2899c(this.we, i, i2);
                a = m3655a(c, c.m5766d());
            } else {
                z = m3602E().m4785d(this.we, i, i2);
                if (z) {
                    try {
                        z = m3607K();
                    } catch (WDJNIException e) {
                        wDJNIException = e;
                        a = z;
                        wDJNIException2 = wDJNIException;
                        WDHF_Manager.m5075a(wDJNIException2, mo2753v());
                        return a;
                    } catch (Exception e2) {
                        exception = e2;
                        a = z;
                        exception2 = exception;
                        WDErreurManager.m2882a(exception2);
                        return a;
                    }
                }
                this.pe = m3602E().ab(this.we);
                this.Ae = m3602E().m4607W(this.we);
                a = z;
            }
            if (!a) {
                try {
                    WDHF_Manager.m5074a(mo2753v());
                } catch (WDJNIException wDJNIException22) {
                    throw wDJNIException22;
                } catch (C0841b e3) {
                    exception2 = e3;
                    WDErreurManager.m2882a(exception2);
                    return a;
                } catch (WDJNIException e4) {
                    wDJNIException22 = e4;
                }
            }
        } catch (WDJNIException e5) {
            wDJNIException = e5;
            a = z;
            wDJNIException22 = wDJNIException;
            WDHF_Manager.m5075a(wDJNIException22, mo2753v());
            return a;
        } catch (Exception e22) {
            exception = e22;
            a = z;
            exception2 = exception;
            WDErreurManager.m2882a(exception2);
            return a;
        }
        return a;
    }

    /* renamed from: b */
    public boolean m3677b(int i, String str, String str2) {
        if (m3716j()) {
            try {
                C0832f v = mo2753v();
                boolean a = v.mo2824a(this.we, i, str, str2);
                if (a) {
                    return a;
                }
                WDHF_Manager.m5074a(v);
                return a;
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
            }
        }
        WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], C0745b.m3221b(Ee[40])), mo2719a()));
        return false;
    }

    /* renamed from: b */
    public boolean m3678b(long j, int i) {
        boolean z = false;
        try {
            if (m3716j()) {
                try {
                    z = mo2753v().mo2973h(this.we, j, i);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, mo2753v());
                }
                return z;
            }
            WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], C0745b.m3221b(Ee[z])), mo2719a()));
            return z;
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    /* renamed from: b */
    public boolean m3679b(long j, long j2) {
        boolean z = (256 & j2) == 256 || (PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID & j2) == PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        boolean z2 = (64 & j2) == 64;
        try {
            if (this.ie == null) {
                this.ie = m3601D();
            }
            try {
                if (m3716j()) {
                    return m3589d(j, (int) j2);
                }
                try {
                    if (this.he == null) {
                        WDErreurManager.m2883a(C0745b.m3222b(Ee[24], mo2719a()));
                        return false;
                    }
                    if (j != 0) {
                        if (j < 0) {
                            try {
                                m3575a((int) C0542t.fb, C0745b.m3222b(Ee[23], String.valueOf(j)), "");
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                        m3595n(C0745b.m3222b(Ee[22], String.valueOf(j)));
                    }
                    try {
                        if (this.De) {
                            m3595n(C0745b.m3222b(Ee[25], mo2719a()));
                        }
                        z = m3715i(z);
                        if (!z) {
                            return z;
                        }
                        try {
                            m3648a(m3667a(this.ie), false);
                            m3592j(z2);
                            return z;
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                } catch (NumberFormatException e222) {
                    throw e222;
                }
            } catch (NumberFormatException e2222) {
                throw e2222;
            }
        } catch (NumberFormatException e22222) {
            throw e22222;
        }
    }

    /* renamed from: b */
    public boolean mo2743b(String str, int i) {
        WDJNIException e;
        Exception e2;
        if (m3716j()) {
            boolean a;
            try {
                a = mo2753v().mo2832a(m3717k(), str, i);
                if (!a) {
                    try {
                        WDHF_Manager.m5074a(mo2753v());
                    } catch (C0841b e3) {
                        throw e3;
                    } catch (WDJNIException e4) {
                        e = e4;
                        WDHF_Manager.m5075a(e, mo2753v());
                        return a;
                    } catch (C0841b e5) {
                        e2 = e5;
                    }
                }
            } catch (Exception e6) {
                e2 = e6;
                a = false;
                WDErreurManager.m2882a(e2);
                return a;
            } catch (WDJNIException e7) {
                e = e7;
                a = false;
                WDHF_Manager.m5075a(e, mo2753v());
                return a;
            }
            return a;
        }
        try {
            if (this.ke) {
                return true;
            }
            for (eb v : this.Td.values()) {
                try {
                    if (v.m5863v()) {
                        WDErreurManager.m2883a(C0745b.m3222b(Ee[39], ((eb) r1.next()).mo3137b(), mo2719a()));
                    }
                } catch (C0841b e8) {
                    throw e8;
                }
            }
            this.De = i == 1;
            WDHF_Connexion a2 = m3629a("", true, false);
            if (a2 == null) {
                return false;
            }
            C0833j o = a2.m4967o();
            try {
                if (a2.m4967o().mo3099a(o.mo3094a(a2.m4967o().mo3158a(this), mo2741a(true, o), "", "", 1), false)) {
                    this.ke = true;
                    return true;
                }
                m3647a(a2, "");
                if (a2.m4967o().mo3114k() == C0542t.wd) {
                    try {
                        if (WDProjet.getInstance().isCreationAutoFichierDonnees()) {
                            try {
                                if (m3666a(str, "", "", 1, false)) {
                                    return mo2743b(str, i);
                                }
                            } catch (C0841b e82) {
                                throw e82;
                            }
                        }
                    } catch (C0841b e822) {
                        throw e822;
                    }
                }
                return false;
            } catch (C0841b e8222) {
                throw e8222;
            } catch (C0841b e82222) {
                throw e82222;
            }
        } catch (C0841b e822222) {
            throw e822222;
        }
    }

    /* renamed from: c */
    public eb m3681c() {
        return this.ze;
    }

    /* renamed from: c */
    public final String m3682c(eb ebVar) {
        if (m3716j()) {
            try {
                return mo2753v().mo2919d(this.we, ebVar != null ? ebVar.m5852i() : 0);
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
            }
        }
        WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], WDAppelContexte.getContexte().m2731r()), mo2719a()));
        return "";
    }

    /* renamed from: c */
    public final void m3683c(int i) {
        this.xe = i;
    }

    /* renamed from: c */
    public void m3684c(boolean z) {
        this.pe = z;
    }

    /* renamed from: c */
    public boolean m3685c(int i, int i2) {
        Integer num = new Integer(i);
        ib a = m3630a(num);
        if (a == null) {
            return false;
        }
        try {
            return m3663a(num, a, i2);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: c */
    public final boolean m3686c(long j) {
        boolean z = true;
        if (m3716j()) {
            if (j != -1) {
                try {
                    z = mo2753v().mo2972h(m3717k(), j);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, mo2753v());
                }
            } else {
                z = mo2753v().mo2959g(m3717k());
            }
            if (!z) {
                try {
                    WDHF_Manager.m5074a(mo2753v());
                } catch (C0841b e3) {
                    throw e3;
                }
            }
        }
        return z;
    }

    /* renamed from: c */
    public final boolean m3687c(long j, int i) {
        if (m3716j()) {
            try {
                C0832f c0832f = (WDHF) mo2753v();
                boolean z = (i & 256) == 256 || (i & 1024) == 1024;
                if (this.ie == null) {
                    this.ie = m3601D();
                }
                if (m3602E().m4698a(this, this.Td.values().toArray(), this.ie)) {
                    boolean j2 = c0832f.mo2988j(this.we, j, i);
                    if (j2 && !z) {
                        if (this.Vd != null) {
                            m3576a((WDHF) c0832f);
                            z = j2;
                        }
                    }
                    z = j2;
                } else {
                    z = false;
                }
                if (!z) {
                    WDHF_Manager.m5074a(c0832f);
                }
                return z;
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
            } catch (C0841b e3) {
                throw e3;
            } catch (C0841b e32) {
                throw e32;
            } catch (Exception e4) {
                WDErreurManager.m2882a(e4);
            }
        }
        WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], WDAppelContexte.getContexte().m2731r()), mo2719a()));
        return false;
    }

    /* renamed from: c */
    public boolean m3688c(long j, long j2) {
        try {
            if (m3716j()) {
                return m3590e(j, (int) j2);
            }
            if (j != 0) {
                try {
                    m3595n(C0745b.m3222b(Ee[22], String.valueOf(j)));
                    return false;
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            try {
                if (this.he == null) {
                    m3595n(C0745b.m3222b(Ee[24], mo2719a()));
                    return false;
                }
                this.ie = m3667a(this.he);
                return true;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    /* renamed from: c */
    public final boolean m3689c(WDHF_Connexion wDHF_Connexion) {
        try {
            if (this.ne == null) {
                this.ne = m3619Y() ? new Boolean(wDHF_Connexion.m4967o().mo3096a(this, this.Vd)) : Boolean.FALSE;
            }
            return this.ne.booleanValue();
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    public boolean m3690c(String str) {
        if (m3716j()) {
            try {
                C0832f v = mo2753v();
                boolean d = v.mo2926d(this.we, str);
                if (d) {
                    return d;
                }
                WDHF_Manager.m5074a(v);
                return d;
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
            }
        }
        WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], C0745b.m3221b(Ee[60])), mo2719a()));
        return false;
    }

    /* renamed from: c */
    public boolean m3691c(Object[] objArr, boolean z) {
        WDHF_Connexion a = m3629a("", true, true);
        if (a == null) {
            return false;
        }
        Object obj;
        C0833j o = a.m4967o();
        StringBuffer stringBuffer = new StringBuffer(Ee[61]);
        stringBuffer.append(mo2738M());
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer(Ee[63]);
        eb ebVar = null;
        LinkedList linkedList = new LinkedList();
        int i = 0;
        for (eb ebVar2 : this.Td.values()) {
            try {
                if (!ebVar2.m5853j()) {
                    eb ebVar3;
                    if (ebVar2.mo3138c()) {
                        long longValue = objArr[ebVar2.m5854k()] instanceof Number ? ((Number) objArr[ebVar2.m5854k()]).longValue() : C0725i.m3055c(objArr[ebVar2.m5854k()].toString());
                        if (!z || longValue == 0) {
                            try {
                                if (this.Td.size() == 1) {
                                    stringBuffer3.append(Ee[62]);
                                    ebVar = ebVar2;
                                } else {
                                    ebVar = ebVar2;
                                }
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        } else if (longValue < 0) {
                            try {
                                m3595n(C0745b.m3222b(Ee[29], String.valueOf(longValue), mo2719a()));
                                return false;
                            } catch (NumberFormatException e2) {
                                throw e2;
                            }
                        } else {
                            ebVar3 = ebVar2;
                        }
                    } else {
                        ebVar3 = ebVar;
                    }
                    if (i > 0) {
                        try {
                            stringBuffer2.append(Ee[27]);
                            stringBuffer3.append(Ee[27]);
                        } catch (NumberFormatException e22) {
                            throw e22;
                        }
                    }
                    int i2 = i + 1;
                    stringBuffer2.append(ebVar2.m5818a(true, o));
                    i = ebVar2.m5848f();
                    if (i == 30 || i == 28) {
                        obj = this.ie[ebVar2.m5854k()];
                        if (obj != null) {
                            try {
                                if (obj instanceof WDChaine) {
                                    linkedList.add(obj);
                                    stringBuffer3.append("?");
                                }
                            } catch (NumberFormatException e222) {
                                throw e222;
                            }
                        }
                        stringBuffer3.append(Ee[62]);
                    } else {
                        stringBuffer3.append(o.mo3173a(ebVar2, objArr[ebVar2.m5854k()], 0));
                    }
                    i = i2;
                    ebVar = ebVar3;
                }
            } catch (NumberFormatException e2222) {
                throw e2222;
            }
        }
        try {
            if (stringBuffer2.length() > 0) {
                stringBuffer.append('(').append(stringBuffer2).append(')');
            }
            stringBuffer.append(stringBuffer3.toString()).append(")");
            String stringBuffer4 = stringBuffer.toString();
            if (z) {
                stringBuffer4 = o.mo3093a(stringBuffer4, mo2741a(true, o));
            }
            if (o.mo3100a(stringBuffer4, linkedList.toArray())) {
                obj = null;
                if (m3689c(a)) {
                    obj = o.mo3112i();
                }
                if (!(z || ebVar == null)) {
                    if (0 != 0 || obj == null) {
                        this.ie[ebVar.m5854k()] = new Long(0 == 0 ? o.mo3103b(this, ebVar) : 0);
                    } else {
                        try {
                            this.ie[ebVar.m5854k()] = obj;
                        } catch (NumberFormatException e22222) {
                            throw e22222;
                        }
                    }
                }
                return true;
            }
            try {
                m3647a(a, "");
                return false;
            } catch (NumberFormatException e222222) {
                throw e222222;
            }
        } catch (NumberFormatException e2222222) {
            throw e2222222;
        }
    }

    public WDObjet chercherSousElement(String str) {
        return (WDObjet) mo2721b(str);
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /* renamed from: d */
    public long m3692d() {
        long B;
        WDJNIException e;
        Exception e2;
        if (!m3716j()) {
            return 0;
        }
        try {
            B = mo2753v().mo2763B(this.we);
            if (B != -1) {
                return B;
            }
            try {
                WDHF_Manager.m5074a(mo2753v());
                return B;
            } catch (C0841b e3) {
                throw e3;
            } catch (WDJNIException e4) {
                e = e4;
                WDHF_Manager.m5075a(e, mo2753v());
                return B;
            } catch (C0841b e5) {
                e2 = e5;
            }
        } catch (Exception e6) {
            Exception exception = e6;
            B = -1;
            e2 = exception;
            WDErreurManager.m2882a(e2);
            return B;
        } catch (WDJNIException e7) {
            WDJNIException wDJNIException = e7;
            B = -1;
            e = wDJNIException;
            WDHF_Manager.m5075a(e, mo2753v());
            return B;
        }
    }

    /* renamed from: d */
    public final long m3693d(boolean z) {
        try {
            if (this.we == -1 && z) {
                C0832f c0832f = null;
                try {
                    c0832f = mo2753v();
                    if (this.we == -1) {
                        this.we = c0832f.mo2917d(mo2719a());
                    }
                } catch (C0841b e) {
                    throw e;
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, c0832f);
                } catch (Exception e3) {
                    WDErreurManager.m2882a(e3);
                }
            }
            return this.we;
        } catch (C0841b e4) {
            throw e4;
        }
    }

    /* renamed from: d */
    public void m3694d(String str) {
        this.Ce = str;
    }

    /* renamed from: d */
    public boolean m3695d(long j) {
        try {
            return getNouvelEnregistrement().getBoolean() ? m3699e(j) : m3679b(0, j);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: d */
    public Object[] mo2744d(eb ebVar) {
        if (ebVar == null) {
            try {
                return new eb[0];
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        try {
            if (this.Vd == null) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(ebVar);
                arrayList2.add(ebVar.mo3137b());
                this.Yd = true;
                boolean z = false;
                int i = -1;
                for (eb ebVar2 : this.Td.values()) {
                    try {
                        boolean z2;
                        int i2;
                        if (!ebVar2.mo3137b().equals(ebVar.mo3137b())) {
                            if (ebVar2.m5801C()) {
                                try {
                                    if (ebVar2.mo3137b().equals(ebVar.mo3137b())) {
                                        return new eb[]{ebVar};
                                    }
                                    return new eb[]{ebVar, ebVar2};
                                } catch (NumberFormatException e2) {
                                    throw e2;
                                }
                            }
                            Iterator N;
                            if (ebVar2.m5809K() != 1) {
                                try {
                                    if (ebVar2.m5809K() != 2) {
                                        try {
                                            if (ebVar2.m5809K() == 0) {
                                                if (!ebVar2.m5810L()) {
                                                    try {
                                                        if (!arrayList2.contains(ebVar2.mo3137b())) {
                                                            if (i == -1) {
                                                                i = arrayList.size();
                                                            }
                                                            arrayList.add(ebVar2);
                                                            arrayList2.add(ebVar2.mo3137b());
                                                        }
                                                    } catch (NumberFormatException e22) {
                                                        throw e22;
                                                    }
                                                }
                                            }
                                        } catch (NumberFormatException e222) {
                                            throw e222;
                                        } catch (NumberFormatException e2222) {
                                            throw e2222;
                                        }
                                    } else if (ebVar2.m5853j()) {
                                        int i3;
                                        Iterator N2 = ebVar2.m5812N();
                                        while (N2.hasNext()) {
                                            if (arrayList2.contains(N2.next().toString())) {
                                                i3 = 0;
                                                break;
                                            }
                                        }
                                        boolean z3 = true;
                                        if (i3 != 0) {
                                            if (i != -1) {
                                                try {
                                                    arrayList.add(ebVar2);
                                                } catch (NumberFormatException e22222) {
                                                    throw e22222;
                                                }
                                            }
                                            arrayList.add(i, ebVar2);
                                            N = ebVar2.m5812N();
                                            while (N.hasNext()) {
                                                try {
                                                    arrayList2.add(N.next().toString());
                                                } catch (NumberFormatException e222222) {
                                                    throw e222222;
                                                }
                                            }
                                        }
                                        z2 = z;
                                        i2 = i;
                                    } else {
                                        try {
                                            if (!arrayList2.contains(ebVar2.mo3137b())) {
                                                if (i == -1) {
                                                    arrayList.add(ebVar2);
                                                } else {
                                                    arrayList.add(i, ebVar2);
                                                }
                                                arrayList2.add(ebVar2.mo3137b());
                                                z2 = z;
                                                i2 = i;
                                            }
                                        } catch (NumberFormatException e2222222) {
                                            throw e2222222;
                                        } catch (NumberFormatException e22222222) {
                                            throw e22222222;
                                        }
                                    }
                                } catch (NumberFormatException e222222222) {
                                    throw e222222222;
                                }
                            } else if (ebVar2.m5853j()) {
                                Iterator N3 = ebVar2.m5812N();
                                while (N3.hasNext()) {
                                    if (arrayList2.contains(N3.next().toString())) {
                                        i2 = 0;
                                        break;
                                    }
                                }
                                z = true;
                                if (i2 != 0) {
                                    arrayList.add(1, ebVar2);
                                    N = ebVar2.m5812N();
                                    while (N.hasNext()) {
                                        try {
                                            arrayList2.add(N.next().toString());
                                        } catch (NumberFormatException e2222222222) {
                                            throw e2222222222;
                                        }
                                    }
                                }
                                z2 = true;
                                i2 = i;
                            } else {
                                try {
                                    if (arrayList2.contains(ebVar2.mo3137b())) {
                                        z2 = true;
                                        i2 = i;
                                    } else {
                                        arrayList.add(1, ebVar2);
                                        arrayList2.add(ebVar2.mo3137b());
                                        z2 = true;
                                        i2 = i;
                                    }
                                } catch (NumberFormatException e22222222222) {
                                    throw e22222222222;
                                }
                            }
                            i = i2;
                            z = z2;
                        }
                        z2 = z;
                        i2 = i;
                        i = i2;
                        z = z2;
                    } catch (NumberFormatException e222222222222) {
                        throw e222222222222;
                    } catch (NumberFormatException e2222222222222) {
                        throw e2222222222222;
                    }
                }
                this.Yd = z;
                return arrayList.toArray();
            } else if (this.Vd.mo3137b().equals(ebVar.mo3137b())) {
                return new eb[]{ebVar};
            } else {
                return new eb[]{ebVar, this.Vd};
            }
        } catch (NumberFormatException e22222222222222) {
            throw e22222222222222;
        } catch (NumberFormatException e222222222222222) {
            throw e222222222222222;
        }
    }

    /* renamed from: e */
    public void m3697e(String str) {
        try {
            if (!this.ke) {
                this.le = str;
            } else if (this.le == null) {
                this.le = mo2719a() + ce + str;
            } else {
                this.le += ce + str;
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: e */
    public void mo2745e(boolean z) {
        try {
            int length;
            int i;
            m3568Q();
            if (z) {
                this.Sd = null;
                this.be = "";
            }
            this.se = 0;
            this.fe = false;
            this.pe = false;
            this.Ae = true;
            this.oe = false;
            this.ue = (byte) 3;
            this.je = 16;
            this.me = false;
            this.ke = false;
            this.De = false;
            this.Yd = false;
            this.ye = true;
            if (this.Td != null) {
                for (eb ebVar : this.Td.values()) {
                    if (ebVar != null) {
                        try {
                            ebVar.m5804F();
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                }
            }
            this.Vd = null;
            if (this.he != null) {
                length = this.he.length;
                i = 0;
                while (i < length) {
                    try {
                        this.he[i] = null;
                        i++;
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
                this.he = null;
            }
            if (this.ie != null) {
                length = this.ie.length;
                i = 0;
                while (i < length) {
                    try {
                        this.ie[i] = null;
                        i++;
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                }
                this.ie = null;
            }
            if (this.qe != null) {
                length = this.qe.length;
                i = 0;
                while (i < length) {
                    try {
                        this.qe[i] = null;
                        i++;
                    } catch (NumberFormatException e222) {
                        throw e222;
                    }
                }
                this.qe = null;
            }
            try {
                this.ve = null;
                this.ze = null;
                this.ae = null;
                if (this.Rd != null) {
                    this.Rd.clear();
                    this.Rd = null;
                }
                this.ne = null;
            } catch (NumberFormatException e2222) {
                throw e2222;
            }
        } catch (NumberFormatException e22222) {
            throw e22222;
        }
    }

    /* renamed from: e */
    public boolean m3699e(long j) {
        boolean z = true;
        boolean z2 = (j & 256) == 256 || (j & PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) == PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        if ((j & 64) != 64) {
            z = false;
        }
        try {
            if (this.ie == null) {
                this.ie = m3601D();
            }
            try {
                if (m3716j()) {
                    z2 = m3580a((int) j, z2);
                } else {
                    try {
                        if (this.De) {
                            m3595n(C0745b.m3222b(Ee[25], mo2719a()));
                        }
                        z2 = m3691c(this.ie, z2);
                        if (z2) {
                            try {
                                m3648a(m3667a(this.ie), false);
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                        if (z2) {
                            try {
                                m3592j(z);
                            } catch (NumberFormatException e2) {
                                throw e2;
                            }
                        }
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
                }
                return z2;
            } catch (NumberFormatException e222) {
                throw e222;
            }
        } catch (NumberFormatException e2222) {
            throw e2222;
        }
    }

    /* renamed from: e */
    public boolean m3700e(eb ebVar) {
        boolean z = true;
        try {
            if (this.ie == null) {
                this.ie = m3601D();
            }
            try {
                if (m3716j()) {
                    z = m3581a(ebVar);
                } else {
                    if (ebVar == null) {
                        try {
                            this.ie = m3601D();
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    }
                    this.ie[ebVar.m5854k()] = ebVar.m5808J();
                    this.ye = true;
                }
                return z;
            } catch (NumberFormatException e2) {
                throw e2;
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    /* renamed from: f */
    public final int m3701f(long j) {
        if (!m3716j()) {
            return 1;
        }
        int a;
        try {
            a = mo2753v().mo2773a(m3717k(), j);
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
            a = 0;
        } catch (WDJNIException e2) {
            WDHF_Manager.m5075a(e2, mo2753v());
            a = 0;
        }
        if (a > 0) {
            return a;
        }
        try {
            WDHF_Manager.m5074a(mo2753v());
            return a;
        } catch (C0841b e3) {
            throw e3;
        }
    }

    /* renamed from: f */
    public WDObjet mo2746f(boolean z) {
        try {
            db dbVar = (db) clone();
            if (this.Td == null) {
                return dbVar;
            }
            dbVar.Td = new LinkedHashMap((int) (((double) this.Td.size()) / 0.75d), 0.75f);
            for (String str : this.Td.keySet()) {
                dbVar.Td.put(str, (eb) ((eb) this.Td.get(str)).m5815a(dbVar, z));
            }
            try {
                if (this.Vd != null) {
                    dbVar.Vd = (eb) dbVar.mo2721b(this.Vd.mo3137b());
                }
                try {
                    if (this.ae != null) {
                        dbVar.ae = (eb) dbVar.mo2721b(this.ae.mo3137b());
                    }
                    if (z) {
                        try {
                            dbVar.ze = null;
                            dbVar.ae = null;
                            dbVar.he = null;
                            dbVar.ie = null;
                            dbVar.qe = null;
                            dbVar.Rd = null;
                            dbVar.Be = null;
                            dbVar.ve = null;
                            dbVar.se = 0;
                            dbVar.fe = false;
                            dbVar.pe = false;
                            dbVar.Ae = true;
                            dbVar.he = null;
                            dbVar.ie = null;
                            dbVar.qe = null;
                            dbVar.oe = false;
                            dbVar.ke = false;
                            dbVar.De = false;
                            dbVar.Zd = null;
                            dbVar.Yd = true;
                            dbVar.ye = true;
                        } catch (CloneNotSupportedException e) {
                            throw e;
                        }
                    }
                    try {
                        if (this.ze != null) {
                            dbVar.ze = (eb) dbVar.mo2721b(this.ze.mo3137b());
                        }
                        try {
                            if (this.he != null) {
                                dbVar.he = (Object[]) this.he.clone();
                            }
                            try {
                                if (this.ie != null) {
                                    dbVar.ie = (Object[]) this.ie.clone();
                                }
                                try {
                                    if (this.qe != null) {
                                        dbVar.qe = (Object[]) this.qe.clone();
                                    }
                                    try {
                                        if (this.Rd != null) {
                                            dbVar.Rd = (HashMap) this.Rd.clone();
                                        }
                                        try {
                                            if (this.Be != null) {
                                                dbVar.Be = (ArrayList) this.Be.clone();
                                            }
                                        } catch (CloneNotSupportedException e2) {
                                            throw e2;
                                        }
                                    } catch (CloneNotSupportedException e22) {
                                        throw e22;
                                    }
                                } catch (CloneNotSupportedException e222) {
                                    throw e222;
                                }
                            } catch (CloneNotSupportedException e2222) {
                                throw e2222;
                            }
                        } catch (CloneNotSupportedException e22222) {
                            throw e22222;
                        }
                    } catch (CloneNotSupportedException e222222) {
                        throw e222222;
                    }
                    dbVar.de = null;
                    dbVar.we = -1;
                    return dbVar;
                } catch (CloneNotSupportedException e2222222) {
                    throw e2222222;
                }
            } catch (CloneNotSupportedException e22222222) {
                throw e22222222;
            }
        } catch (Exception e3) {
            C0691a.m2857a(Ee[73], e3);
            return null;
        }
    }

    /* renamed from: f */
    protected db mo2747f(String str) {
        db dbVar = new db(str);
        try {
            dbVar.m3728q(this.Sd);
            if (this.ne != null) {
                dbVar.ne = this.ne;
            }
            dbVar.m3712h(this.me);
            for (eb s : this.Td.values()) {
                dbVar.mo2750h(s.m5860s());
            }
            return dbVar;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: f */
    protected final String m3704f() {
        return this.be;
    }

    /* renamed from: f */
    public void m3705f(eb ebVar) {
        this.ze = ebVar;
    }

    /* renamed from: g */
    public String mo2748g() {
        return mo2741a(true, null);
    }

    /* renamed from: g */
    public void m3707g(String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        if (str.equals("")) {
            str = this.Sd;
        }
        if (!C0808l.m4053k(this.be)) {
            WDHF_Connexion g = instance.m5019g(this.be);
            if (g != null) {
                try {
                    g.m4945a((C0777g) this);
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
        }
        try {
            this.be = str;
            if (this.be.equals("")) {
                this.ue = (byte) 1;
                this.je = 16;
                return;
            }
            WDHF_Connexion g2 = instance.m5019g(this.be);
            if (g2 != null) {
                try {
                    g2.m4949b((C0777g) this);
                    m3587b(g2);
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    /* renamed from: g */
    public void m3708g(boolean z) {
        this.Ae = z;
    }

    /* renamed from: g */
    public boolean m3709g(eb ebVar) {
        boolean z = false;
        if (ebVar == null) {
            return z;
        }
        if (m3716j()) {
            try {
                z = mo2753v().mo3018n(this.we, ebVar.m5852i());
                if (z) {
                    return z;
                }
                WDHF_Manager.m5074a(mo2753v());
                return z;
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
                return z;
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
                return z;
            }
        }
        C0859l l = ebVar.m5855l();
        if (l != null) {
            try {
                l.m6032a(null);
                l.m6029a(this.se);
                l.m6043b(true);
            } catch (C0841b e4) {
                throw e4;
            }
        }
        return true;
    }

    public WDChaine getAbreviation() {
        String str = "";
        if (this.Ce != null) {
            str = this.Ce;
        }
        return new WDChaine(str);
    }

    public WDChaine getBaseDeDonnees() {
        String str = "";
        WDHF_Connexion a = m3629a(this.be, false, false);
        if (a != null) {
            str = a.m4966n();
        }
        return new WDChaine(str);
    }

    public WDObjet getBorneMax() {
        String str = "";
        if (this.ve != null) {
            str = this.ve.m6084e();
        }
        return new WDChaine(str);
    }

    public WDObjet getBorneMin() {
        String str = "";
        if (this.ve != null) {
            str = this.ve.m6082c();
        }
        return new WDChaine(str);
    }

    public WDChaine getConditionFiltre() {
        String str = "";
        if (m3613R()) {
            str = this.ve.m6080a();
        }
        return new WDChaine(str);
    }

    public WDChaine getConnexion() {
        return new WDChaine(m3704f());
    }

    public WDObjet getElement(String str) {
        return getElement(str, true);
    }

    public WDObjet getElement(String str, boolean z) {
        WDObjet chercherSousElement = chercherSousElement(str);
        if (chercherSousElement != null) {
            return chercherSousElement;
        }
        if (z) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(Ee[3], str, mo2719a()));
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return null;
    }

    public WDBooleen getFiltreAvecBornes() {
        try {
            boolean z = this.ve != null && this.ve.m6083d();
            return new WDBooleen(z);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public String getMessageAccesPropieteInterdite(String str) {
        return C0745b.m3222b(Ee[4], str, mo2719a());
    }

    public String getMessageLecturePropieteInterdite(String str) {
        return C0745b.m3222b(Ee[85], str, mo2719a());
    }

    public WDEntier4 getNbRubrique() {
        return new WDEntier4(this.Td.size());
    }

    public WDEntier4 getNbRubriqueCle() {
        int i = 0;
        for (eb a : this.Td.values()) {
            try {
                i = a.mo3136a() ? i + 1 : i;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return new WDEntier4(i);
    }

    public WDEntier4 getNbRubriqueMemo() {
        int i = 0;
        for (eb L : this.Td.values()) {
            try {
                i = L.m5810L() ? i + 1 : i;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return new WDEntier4(i);
    }

    public WDChaine getNom() {
        return new WDChaine(mo2719a());
    }

    public WDChaine getNomDecrit() {
        try {
            if (m3612P()) {
                if (this.Zd != null) {
                    return new WDChaine(this.Zd.mo2719a());
                }
            }
            return new WDChaine(mo2719a());
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    public WDChaine getNomPhysique() {
        return new WDChaine(mo2741a(false, null));
    }

    public WDChaine getNomPhysiqueDecrit() {
        return new WDChaine(this.re);
    }

    public String getNomSourceDonnees() {
        return mo2719a();
    }

    public WDBooleen getNouvelEnregistrement() {
        boolean z = this.ye;
        if (m3716j()) {
            try {
                z = mo2753v().mo3009m(this.we);
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
            }
        }
        return new WDBooleen(z);
    }

    public WDBooleen getNullSupporte() {
        return new WDBooleen(m3722m());
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        try {
            switch (C0872s.f2358a[eWDPropriete.ordinal()]) {
                case 1:
                    return new WDBooleen(m3591i());
                default:
                    return super.getProp(eWDPropriete);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
        throw e;
    }

    public WDChaine getRubriqueFiltree() {
        String str = "";
        if (this.ve != null) {
            str = this.ve.m6081b();
        }
        return new WDChaine(str);
    }

    public C0775c getRubriqueSansCasseNiAccent(String str) {
        eb ebVar = (eb) mo2718a(str);
        if (ebVar == null) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(Ee[3], str, mo2719a()));
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return ebVar;
    }

    public /* bridge */ /* synthetic */ C0776b getSourceDonnees() {
        return m3603F();
    }

    public /* bridge */ /* synthetic */ WDObjet getType() {
        return m3598A();
    }

    public WDObjet getValeur() {
        return new WDChaine(mo2719a());
    }

    /* renamed from: h */
    public final String m3710h() {
        try {
            return this.Ce == null ? "" : this.Ce;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: h */
    public void mo2750h(eb ebVar) {
        String o = C0808l.m4057o(C0808l.m4054l(ebVar.mo3137b()));
        try {
            ebVar.m5835b(this.Td.size());
            this.Td.put(o, ebVar);
            if (ebVar.mo3138c()) {
                this.Vd = ebVar;
            }
            ebVar.m5822a(this);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: h */
    public void m3712h(boolean z) {
        this.me = z;
    }

    /* renamed from: h */
    public boolean m3713h(String str) {
        db J = m3567J();
        return J != null ? J.m3585a(false, str) : false;
    }

    /* renamed from: i */
    public eb m3714i(String str) {
        try {
            if (!str.equals("")) {
                return (eb) mo2721b(str);
            }
            try {
                return this.ze != null ? this.ze : mo2739O();
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: i */
    public boolean m3715i(boolean z) {
        StringBuffer append = new StringBuffer(Ee[31]).append(mo2748g()).append(Ee[33]);
        StringBuffer stringBuffer = new StringBuffer(Ee[28]);
        LinkedList linkedList = new LinkedList();
        Object obj = null;
        int i = 0;
        StringBuffer stringBuffer2 = stringBuffer;
        for (eb ebVar : this.Td.values()) {
            try {
                if (!ebVar.m5853j()) {
                    Object obj2;
                    if (ebVar.mo3138c()) {
                        long longValue = this.ie[ebVar.m5854k()] instanceof Number ? ((Number) this.ie[ebVar.m5854k()]).longValue() : (long) new WDEntier4(this.ie[ebVar.m5854k()].toString()).getInt();
                        if (z && longValue < 0) {
                            try {
                                m3595n(C0745b.m3222b(Ee[29], String.valueOf(longValue), mo2719a()));
                                return false;
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        } else if (!z) {
                            StringBuffer append2 = new StringBuffer(Ee[28]).append(m3637a(ebVar, this.he[ebVar.m5854k()], 1, true, true, true));
                            obj = 1;
                            stringBuffer2 = append2;
                        }
                    }
                    if (i > 0) {
                        try {
                            append.append(Ee[27]);
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                    if (ebVar.m5848f() == 30) {
                        obj2 = this.ie[ebVar.m5854k()];
                        if (obj2 != null) {
                            try {
                                if (obj2 instanceof WDChaine) {
                                    linkedList.add(obj2);
                                    append.append(ebVar.m5818a(true, null)).append(Ee[34]);
                                }
                            } catch (NumberFormatException e22) {
                                throw e22;
                            }
                        }
                        append.append(ebVar.m5818a(true, null)).append(Ee[35]);
                    } else {
                        append.append(m3637a(ebVar, this.ie[ebVar.m5854k()], 1, true, false, true));
                    }
                    try {
                        if (ebVar.mo3138c() || ebVar.m5801C()) {
                            obj2 = 1;
                            stringBuffer = new StringBuffer(Ee[28]).append(m3637a(ebVar, this.he[ebVar.m5854k()], 1, true, true, true));
                        } else {
                            if (obj == null) {
                                try {
                                    if (ebVar.m5848f() != 30) {
                                        if (i != 0) {
                                            stringBuffer2.append(Ee[30]);
                                        }
                                        stringBuffer2.append(m3637a(ebVar, this.he[ebVar.m5854k()], 1, true, true, true));
                                    }
                                } catch (NumberFormatException e222) {
                                    throw e222;
                                } catch (NumberFormatException e2222) {
                                    throw e2222;
                                }
                            }
                            obj2 = obj;
                            stringBuffer = stringBuffer2;
                        }
                        obj = obj2;
                        i++;
                        stringBuffer2 = stringBuffer;
                    } catch (NumberFormatException e22222) {
                        throw e22222;
                    }
                }
            } catch (NumberFormatException e222222) {
                throw e222222;
            }
        }
        append.append(stringBuffer2.toString()).append(")");
        WDHF_Connexion a = m3629a("", true, true);
        if (a == null) {
            return false;
        }
        if (z) {
            try {
                if (a.m4968p() == 3) {
                    m3595n(C0745b.m3222b(Ee[32], new String[0]));
                    return false;
                }
            } catch (NumberFormatException e2222222) {
                throw e2222222;
            }
        }
        try {
            if (a.m4967o().mo3097a(append.toString(), 1, linkedList.toArray())) {
                return true;
            }
            m3647a(a, "");
            return false;
        } catch (NumberFormatException e22222222) {
            throw e22222222;
        }
    }

    public boolean isFichier() {
        return true;
    }

    public boolean isSourceDonnees() {
        return true;
    }

    /* renamed from: j */
    public final boolean m3716j() {
        try {
            return this.ue != (byte) 1 ? this.ue == (byte) 2 : true;
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: k */
    public final long m3717k() {
        return m3693d(true);
    }

    /* renamed from: k */
    public void m3718k(String str) {
        this.re = str;
    }

    /* renamed from: k */
    public final boolean m3719k(boolean z) {
        boolean z2 = true;
        if (m3716j()) {
            try {
                z2 = mo2753v().mo2847a(this.we, z);
                if (!z2) {
                    WDHF_Manager.m5074a(mo2753v());
                }
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
            }
        }
        return z2;
    }

    /* renamed from: l */
    public db m3720l(String str) throws WDException {
        try {
            if (WDHF_Contexte.getInstance().m5027k(str) != null) {
                WDErreurManager.m2883a(C0745b.m3222b(Ee[5], str));
            }
            db f = mo2747f(str);
            f.m3577a(this);
            m3588b(f);
            return f;
        } catch (WDException e) {
            throw e;
        }
    }

    /* renamed from: l */
    public final boolean m3721l() {
        try {
            return this.je == 17;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: m */
    public final boolean m3722m() {
        return this.me;
    }

    /* renamed from: n */
    public int m3723n() {
        if (!m3716j()) {
            return 0;
        }
        int f;
        try {
            f = mo2753v().mo2944f(this.we);
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
            f = -1;
        } catch (WDJNIException e2) {
            WDHF_Manager.m5075a(e2, mo2753v());
            f = -1;
        }
        if (f >= 0) {
            return f;
        }
        try {
            WDHF_Manager.m5074a(mo2753v());
            return f;
        } catch (C0841b e3) {
            throw e3;
        }
    }

    /* renamed from: o */
    public final boolean m3724o() {
        return this.pe;
    }

    /* renamed from: o */
    public boolean m3725o(String str) {
        boolean z = true;
        if (m3716j()) {
            try {
                z = mo2753v().mo3033q(this.we, str);
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, mo2753v());
            }
            if (!z) {
                try {
                    WDHF_Manager.m5074a(mo2753v());
                } catch (C0841b e3) {
                    throw e3;
                }
            }
        }
        try {
            if (this.ke) {
                return z;
            }
        } catch (C0841b e32) {
            throw e32;
        }
        try {
            if (str.equals("")) {
                m3697e(this.re);
            } else {
                m3697e(str);
            }
            return z;
        } catch (C0841b e322) {
            throw e322;
        }
    }

    /* renamed from: p */
    public eb m3726p(String str) {
        eb ebVar = (eb) mo2718a(str);
        if (ebVar == null) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(Ee[3], str, mo2719a()));
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return ebVar;
    }

    /* renamed from: p */
    public boolean m3727p() {
        try {
            if (this.Be != null) {
                if (!this.Be.isEmpty()) {
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

    /* renamed from: q */
    public void m3728q(String str) {
        try {
            if (this.be.equals("")) {
                this.Sd = str;
            }
            m3707g(str);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: q */
    public Object[] m3729q() {
        return this.he;
    }

    /* renamed from: r */
    public boolean m3730r() {
        boolean z = false;
        try {
            if (m3716j()) {
                try {
                    z = mo2753v().mo2765D(this.we);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, mo2753v());
                }
                return z;
            }
            WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], WDAppelContexte.getContexte().m2731r()), mo2719a()));
            return z;
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    public void release() {
        try {
            super.release();
            mo2745e(true);
            this.te = null;
            this.re = null;
            this.le = null;
            this.Ce = null;
            this.de = null;
            this.Zd = null;
            if (this.Be != null) {
                this.Be.clear();
                this.Be = null;
            }
            m3600C();
            this.Td = null;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: s */
    public boolean m3731s() {
        try {
            return this.de != null;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    public void setConnexion(String str) {
        WDObjet g = WDHF_Contexte.getInstance().m5019g(str);
        if (g == null) {
            try {
                WDErreurManager.m2883a(C0745b.m3222b(Ee[53], str));
                return;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        m3610N();
        WDHF_Manager.m5175c((WDObjet) this, g);
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        try {
            switch (C0872s.f2358a[eWDPropriete.ordinal()]) {
                case 1:
                    WDErreurManager.m2883a(C0745b.m3222b(Ee[21], EWDPropriete.PROP_INALTERABLE.getNom()));
                    return;
                default:
                    super.setProp(eWDPropriete, wDObjet);
                    return;
            }
        } catch (NumberFormatException e) {
            throw e;
        }
        throw e;
    }

    public void setValeur(WDObjet wDObjet) {
        WDEnregistrement wDEnregistrement = (WDEnregistrement) wDObjet.checkType(WDEnregistrement.class);
        if (wDEnregistrement != null) {
            try {
                wDEnregistrement.m4268a(this);
                return;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        C0745b.m3222b(Ee[26], mo2719a());
    }

    /* renamed from: t */
    public final boolean m3732t() {
        return this.ke;
    }

    /* renamed from: u */
    public Object[] m3733u() {
        try {
            if (this.ie == null) {
                if (isRequete()) {
                    m3661a(mo2739O(), true, true, (long) PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                }
            }
            try {
                if (this.ie == null) {
                    this.ie = m3601D();
                }
                return this.ie;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    /* renamed from: v */
    public C0832f mo2753v() {
        if (this.de == null) {
            for (eb v : this.Td.values()) {
                try {
                    if (v.m5863v()) {
                        WDErreurManager.m2883a(C0745b.m3222b(Ee[39], v.mo3137b(), mo2719a()));
                    }
                } catch (WDJNIException e) {
                    throw e;
                }
            }
            this.de = WDHF_Contexte.getInstance().m5043x();
            try {
                if (this.de.mo2994k()) {
                    C0843d[] c0843dArr = new C0843d[this.Td.size()];
                    for (eb v2 : this.Td.values()) {
                        C0843d c0843d = new C0843d(v2.m5852i());
                        c0843d.m5749a(v2.mo3137b());
                        c0843d.m5748a(v2.m5848f());
                        c0843d.m5752b(v2.m5854k());
                        c0843dArr[v2.m5854k()] = c0843d;
                    }
                    this.we = this.de.mo2783a(mo2719a(), c0843dArr);
                    this.ue = (byte) 2;
                } else {
                    this.we = m3602E().mo2917d(mo2719a());
                    this.ue = (byte) 1;
                }
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, this.de);
            } catch (C0841b e3) {
                WDErreurManager.m2883a(Ee[38]);
            }
        }
        return this.de;
    }

    /* renamed from: w */
    public final boolean m3735w() {
        boolean z = false;
        try {
            if (m3716j()) {
                try {
                    z = mo2753v().mo2879b(this.we);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, mo2753v());
                }
                return z;
            }
            WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], WDAppelContexte.getContexte().m2731r()), mo2719a()));
            return z;
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    /* renamed from: x */
    protected WDHF_Connexion m3736x() {
        WDHF_Connexion g = WDHF_Contexte.getInstance().m5019g(this.be);
        if (g != null) {
            return g;
        }
        m3595n(C0745b.m3222b(Ee[53], this.be));
        return null;
    }

    /* renamed from: y */
    public void m3737y() {
        try {
            if (m3716j()) {
                try {
                    mo2753v().mo2979i(this.we);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, mo2753v());
                }
            }
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }

    /* renamed from: z */
    public final boolean m3738z() {
        boolean z = false;
        try {
            if (m3716j()) {
                try {
                    z = mo2753v().mo2764C(this.we);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                } catch (WDJNIException e2) {
                    WDHF_Manager.m5075a(e2, mo2753v());
                }
                return z;
            }
            WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Ee[1], C0745b.m3221b(Ee[57])), mo2719a()));
            return z;
        } catch (NumberFormatException e3) {
            throw e3;
        }
    }
}
