package fr.pcsoft.wdjava.database.hf;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDBuffer;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDChaineA;
import fr.pcsoft.wdjava.core.types.WDChaineU;
import fr.pcsoft.wdjava.core.types.WDDate;
import fr.pcsoft.wdjava.core.types.WDDateHeure;
import fr.pcsoft.wdjava.core.types.WDDuree;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDEntier8;
import fr.pcsoft.wdjava.core.types.WDHeure;
import fr.pcsoft.wdjava.core.types.WDMonetaire;
import fr.pcsoft.wdjava.core.types.WDNumerique;
import fr.pcsoft.wdjava.core.types.WDReel;
import fr.pcsoft.wdjava.core.types.database.C0775c;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.C0820x;
import fr.pcsoft.wdjava.database.hf.p049c.C0832f;
import fr.pcsoft.wdjava.database.hf.p049c.C0841b;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.file.C0901s;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.ui.dessin.C0519e;
import fr.pcsoft.wdjava.ui.dessin.p077a.C1336b;
import fr.pcsoft.wdjava.ui.p064a.C1032b;
import java.io.IOException;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class eb extends C0775c implements C0849z, C0542t, Serializable {
    private static final String[] ie = new String[]{m5797z(m5798z("x'YK\t>hB^\u0004;hUO\u000e%hIH\u001e\"aS")), m5797z(m5798z("x%xTI\u0012&xSD\u000f6oZ^\u001a\"rXT\u0015(~CK\u000b8B^\u001e")), m5797z(m5798z("kG\u001d'+jG\u001c&+kG\u001d&+kG")), m5797z(m5798z("5\u0002Az")), m5797z(m5798z("vN\u0014/\"bN\u0014/\"bN\u0014/\"bN\u0014/\"bN\u0014/\"bN\u0014/\"bN\u00148\"bN\u0014/\"")), m5797z(m5798z("kG\u001d'+jG\u001c")), m5797z(m5798z("kG\u001d&+kG\u001d&")), m5797z(m5798z("/\u0005Xs")), m5797z(m5798z("\tNck²\u0005Lbr4\u0019\rr~{\u001bL6m:\u001bHci{\u0013He;8\u0018@ft(\u0016Cb~(WI1n5\u0012\rdn9\u0005Dgn>W\\cr{\u0019\nsh/W]wh{\u0013H6o\"\u0007H6x7\rut6\u0007Beò>")), m5797z(m5798z("\u0017\u0016\rut6\u0007Bez5\u0003H6>WAw;8\u001bÄ6x4\u001a]yh²\u0012\rx<>\u000fDeo>W]wh")), m5797z(m5798z("x2DD\u00131r@Z\u00172xDD\u0015\"aZD\u00158cIH\u000e'}YI\u000f2h")), m5797z(m5798z("{6~U")), m5797z(m5798z("wW")), m5797z(m5798z("{3hEX")), m5797z(m5798z("x6nU^\b(}DT\u000b%dSO\u001e(CY\t>|C^")), m5797z(m5798z("x;hUO\u000e%hIK\t8}DR\u001e#hII\u000e5_J\u000e2")), m5797z(m5798z("RF")), m5797z(m5798z("\u0012\u001a]yh(\u001eOz~{\u0013H6h²\u0005Dww2\u0004Hd;7PD{z<\u0012\u0003")), m5797z(m5798z("+\u0019J")), m5797z(m5798z("x2D^\u000e%r^]\u00048}IR\u0015#hD_\u0012#hIX\u00172rUT\u0016'")), m5797z(m5798z("1\u0007J")), m5797z(m5798z("x2D^\u000e%r^]\u00048}IR\u0015#hD_\u0012#hII\u000e5_J\u000e2")), m5797z(m5798z("\u0012\u001a]yh(\u001eOz~{\u0013H6x7\u0018Csi{\u001bL6i.\u0015_j.\u0012\rut.\u0005Lxo>Y")), m5797z(m5798z("jO\u0019\"-lC\u0019&,h@\u001d/.nF\u001b'.")), m5797z(m5798z("bN\u0014/*iD\u001c")), m5797z(m5798z("bN\u0014/\"bN\u0014/\"bN\u0014/\"bN\u0014/\"bN\u0014/\"bN\u0014/\"bN\u0003/\"bN\u0014/")), m5797z(m5798z("bN\u0014/*iD\u001c$(nN\u0018/\"bN")), m5797z(m5798z("iD\u0018/.bN\u0014/")), m5797z(m5798z("x%xTI\u0012&xSD\b8xED\u001e;h[^\u0015#")), m5797z(m5798z("\u000f\u000e]s;5\u0018C6i>\u0014Bxu.Y")), m5797z(m5798z("p=e^V\u0016$~ZW\u0017")), m5797z(m5798z("\u000f\u000e]s;?\u0012\rdn9\u0005Dgn>WCyu{\u0004Xfk4\u0005Yÿ7{\u0014Bxm>\u0005^t5WLc;=\u0018_{z/WYsc/\u0012"))};
    private String Rd = null;
    private int Sd = 0;
    private boolean Td = false;
    private int Ud = 0;
    private transient LinkedHashMap Vd = null;
    private String Wd = "";
    private transient boolean Xd = true;
    private transient db Yd = null;
    private int Zd = 0;
    private transient C0859l ae = null;
    private transient int be = 0;
    private transient String ce = null;
    private transient String de = null;
    private transient boolean ee = false;
    private long fe = -1;
    private transient boolean ge = true;
    private transient int he = 0;

    public eb(String str) {
        this.Wd = str;
    }

    public eb(String str, int i) {
        this.Wd = str;
        this.Sd = i;
    }

    public eb(String str, int i, int i2, boolean z, int i3) {
        this.Wd = str;
        this.ce = str;
        this.Sd = i;
        this.be = i2;
        this.ge = z;
        this.he = i3;
    }

    /* renamed from: O */
    private int m5789O() {
        switch (this.Sd) {
            case 3:
                return 4;
            case 4:
                return 2;
            case 5:
                return 9;
            case 6:
                return 5;
            case 7:
                return 13;
            case 9:
                return 4;
            case 17:
                return 13;
            case 24:
            case 25:
            case 27:
                return 19;
            case 26:
                return 9;
            case 36:
                return 2;
            case 37:
                return 13;
            case 38:
                return 9;
            case 41:
                return 13;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    static final eb m5790a(C0820x c0820x) throws IOException {
        eb ebVar = new eb(c0820x.m4185a());
        ebVar.m5850g(c0820x.readInt());
        short readShort = c0820x.readShort();
        switch (C0542t.cd & readShort) {
            case 0:
                break;
            case 4096:
                ebVar.m5820a(4);
                break;
            case 8192:
                ebVar.m5820a(2);
                break;
            case 16384:
                ebVar.m5820a(1);
                break;
            case 32768:
                try {
                    ebVar.m5820a(3);
                    break;
                } catch (IOException e) {
                    throw e;
                }
            default:
                C0691a.m2856a(ie[29]);
                break;
        }
        ebVar.m5820a(0);
        try {
            ebVar.m5837b((readShort & C0542t.f1182X) != 1024);
            ebVar.m5846e(c0820x.readInt());
            ebVar.m5845d(c0820x.readInt() > 1);
            ebVar.m5836b(c0820x.m4185a());
            ebVar.m5828a(c0820x.readBoolean());
            int readInt = c0820x.readInt();
            int i = 0;
            while (i < readInt) {
                try {
                    ebVar.m5827a(c0820x.m4185a(), (c0820x.readShort() & C0542t.f1182X) != 1024);
                    i++;
                } catch (IOException e2) {
                    throw e2;
                }
            }
            return ebVar;
        } catch (IOException e22) {
            throw e22;
        }
    }

    /* renamed from: b */
    private Object m5791b(WDObjet wDObjet) {
        if (wDObjet.isValeurNull()) {
            if (!this.Yd.m3722m()) {
                WDErreurManager.m2883a(C0745b.m3222b(ie[10], this.Yd.mo2719a()));
            }
            return null;
        }
        switch (this.Sd) {
            case 2:
            case 12:
            case 35:
            case 39:
                return wDObjet.getString();
            case 3:
            case 9:
                return new Short((short) wDObjet.getInt());
            case 4:
            case 36:
                return new Byte((byte) wDObjet.getInt());
            case 5:
            case 26:
            case 38:
                return new Integer(wDObjet.getInt());
            case 6:
                return new Float((float) wDObjet.getDouble());
            case 7:
                return new Double(wDObjet.getDouble());
            case 11:
                return (wDObjet.isHeure() ? (WDHeure) wDObjet : new WDHeure(wDObjet)).getString();
            case 14:
                return (wDObjet.isDate() ? (WDDate) wDObjet : new WDDate(wDObjet)).getString();
            case 17:
                return wDObjet.getCurrency().toString();
            case 24:
            case 25:
            case 27:
                return new Long(wDObjet.getLong());
            case 28:
            case 29:
            case 30:
            case 40:
                return !wDObjet.isChaine() ? new WDChaine(wDObjet.getString()) : wDObjet.getClone();
            case 34:
                return wDObjet.isDateHeure() ? ((WDDateHeure) wDObjet).getString() : wDObjet.isDate() ? ((WDDate) wDObjet).getString() : new WDDateHeure(wDObjet).getString();
            case 37:
                return new Boolean(wDObjet.getBoolean());
            case 41:
                return wDObjet.getBigDecimal().toString();
            default:
                return "";
        }
    }

    /* renamed from: c */
    private WDObjet m5792c(int i) {
        try {
            return new WDChaine(this.Yd.mo2753v().mo2948f(this.Yd.m3717k(), m5852i(), i));
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
        } catch (WDJNIException e2) {
            WDHF_Manager.m5075a(e2, this.Yd.mo2753v());
        }
        return null;
    }

    /* renamed from: f */
    private WDObjet m5793f(int i) {
        try {
            return new WDBooleen(this.Yd.mo2753v().mo2948f(this.Yd.m3717k(), m5852i(), i));
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
        } catch (WDJNIException e2) {
            WDHF_Manager.m5075a(e2, this.Yd.mo2753v());
        }
        return null;
    }

    /* renamed from: h */
    private WDObjet m5794h(int i) {
        try {
            return new WDEntier4(this.Yd.mo2753v().mo2999l(this.Yd.m3717k(), m5852i(), i));
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
        } catch (WDJNIException e2) {
            WDHF_Manager.m5075a(e2, this.Yd.mo2753v());
        }
        return null;
    }

    /* renamed from: n */
    private int m5795n() {
        switch (this.Sd) {
            case 6:
            case 7:
            case 17:
            case 37:
                return 2;
            default:
                return 0;
        }
    }

    /* renamed from: q */
    private int m5796q() {
        return m5853j() ? 13 : C0855h.m5971a(this.Sd);
    }

    /* renamed from: z */
    private static String m5797z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 91;
                    break;
                case 1:
                    i2 = 119;
                    break;
                case 2:
                    i2 = 45;
                    break;
                case 3:
                    i2 = 22;
                    break;
                default:
                    i2 = 27;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5798z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 27);
        }
        return toCharArray;
    }

    /* renamed from: A */
    public final db m5799A() {
        return this.Yd;
    }

    /* renamed from: B */
    public String m5800B() {
        if (this.Yd.isRequete()) {
            return new StringBuffer(this.Yd.mo2741a(false, null)).append(".").append(mo3137b()).toString();
        }
        C0833j V = this.Yd.m3616V();
        return new StringBuffer(this.Yd.mo2741a(true, V)).append(".").append(m5818a(true, V)).toString();
    }

    /* renamed from: C */
    public final boolean m5801C() {
        return (!this.Xd && this.be == 1) || this.be == 3;
    }

    /* renamed from: D */
    public final boolean m5802D() {
        return this.ge;
    }

    /* renamed from: E */
    public WDBooleen m5803E() {
        return new WDBooleen(m5811M());
    }

    /* renamed from: F */
    public void m5804F() {
        if (this.ae != null) {
            this.ae.m6029a(this.Yd.m3608L());
            this.ae = null;
        }
    }

    /* renamed from: G */
    public String m5805G() {
        Object next = this.Vd.keySet().iterator().next();
        return next != null ? next.toString() : null;
    }

    /* renamed from: H */
    public final String m5806H() {
        return this.de;
    }

    /* renamed from: I */
    public final boolean m5807I() {
        return this.Xd;
    }

    /* renamed from: J */
    public final Object m5808J() {
        if (this.Xd && this.Yd.m3722m()) {
            return null;
        }
        String H = m5806H();
        if (H != null) {
            return this.Yd.m3716j() ? m5791b(new WDChaine(H)) : m5817a(new WDChaine(H));
        } else {
            switch (m5848f()) {
                case 3:
                case 9:
                    return new Short((short) 0);
                case 4:
                case 36:
                    return new Byte((byte) 0);
                case 5:
                case 26:
                case 38:
                    return new Integer(0);
                case 6:
                    return new Float(0.0f);
                case 7:
                    return new Double(0.0d);
                case 17:
                case 41:
                    return BigDecimal.ZERO;
                case 24:
                case 25:
                case 27:
                    return new Long(0);
                case 28:
                case 29:
                case 30:
                    return new WDChaineA();
                case 37:
                    return new Boolean(false);
                case 40:
                    return new WDChaineU();
                case 99:
                case 100:
                    return null;
                default:
                    return "";
            }
        }
    }

    /* renamed from: K */
    public final int m5809K() {
        return this.be;
    }

    /* renamed from: L */
    public final boolean m5810L() {
        return this.Sd == 30 || this.Sd == 29 || this.Sd == 40;
    }

    /* renamed from: M */
    public final boolean m5811M() {
        return this.Sd == 2 || this.Sd == 39 || this.Sd == 29 || this.Sd == 40 || this.Sd == 12;
    }

    /* renamed from: N */
    public final Iterator m5812N() {
        return this.Vd.keySet().iterator();
    }

    /* renamed from: P */
    public final boolean m5813P() {
        return this.Sd == 99 || this.Sd == 100 || this.Ud == 2 || this.Ud == 1;
    }

    /* renamed from: a */
    public long m5814a(C0832f c0832f, long j) {
        try {
            if (this.Yd.m3668b() == 2) {
                this.fe = this.Yd.mo2753v().mo2780a(this.Yd.m3717k(), this.Zd, true);
            } else {
                this.fe = c0832f.mo2945f(j, this.Wd);
            }
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
        } catch (WDJNIException e2) {
            WDHF_Manager.m5075a(e2, this.Yd.mo2753v());
        }
        return this.fe;
    }

    /* renamed from: a */
    public WDObjet m5815a(db dbVar, boolean z) {
        try {
            eb ebVar = (eb) clone();
            try {
                if (this.Vd != null) {
                    ebVar.Vd = (LinkedHashMap) this.Vd.clone();
                }
                if (!z) {
                    try {
                        if (this.ae != null) {
                            ebVar.ae = this.ae.m6028a(ebVar);
                        }
                    } catch (CloneNotSupportedException e) {
                        throw e;
                    }
                }
                ebVar.Yd = dbVar;
                ebVar.fe = -1;
                return ebVar;
            } catch (CloneNotSupportedException e2) {
                throw e2;
            }
        } catch (Exception e3) {
            C0691a.m2857a(ie[22], e3);
            return null;
        }
    }

    /* renamed from: a */
    public WDObjet m5816a(Object obj) {
        if (obj == null) {
            return WDObjet.NULL;
        }
        int i = this.Sd;
        if (m5853j() && this.Vd != null) {
            i = ((eb) this.Yd.mo2721b(m5805G())).m5848f();
        }
        switch (i) {
            case 2:
            case 12:
            case 39:
                return new WDChaine(obj.toString());
            case 3:
            case 4:
            case 5:
            case 9:
            case 26:
            case 36:
            case 38:
                return obj instanceof Number ? new WDEntier4(((Number) obj).intValue()) : new WDEntier4(obj.toString());
            case 6:
            case 100:
                return new WDReel(obj.toString());
            case 7:
                return obj instanceof Number ? new WDReel(((Number) obj).doubleValue()) : new WDReel(obj.toString());
            case 11:
                return new WDHeure(this.Yd.m3616V().mo3091a(obj, 11).toString());
            case 14:
                return new WDDate(this.Yd.m3616V().mo3091a(obj, 14).toString());
            case 17:
                return new WDMonetaire(obj.toString());
            case 24:
            case 25:
            case 27:
                return obj instanceof Number ? new WDEntier8(((Number) obj).longValue()) : new WDEntier8(obj.toString());
            case 28:
            case 29:
            case 30:
            case 40:
                return obj instanceof WDChaine ? (WDChaine) obj : new WDChaine(obj.toString());
            case 34:
                return new WDDateHeure(this.Yd.m3616V().mo3091a(obj, 34).toString());
            case 35:
                return new WDDuree(C0725i.m3064d(obj.toString()));
            case 37:
                return obj instanceof Boolean ? new WDBooleen(((Boolean) obj).booleanValue()) : new WDBooleen(obj.toString());
            case 41:
                return new WDNumerique(obj.toString());
            default:
                C0691a.m2856a(ie[31]);
                return new WDChaine(obj.toString());
        }
    }

    /* renamed from: a */
    public Object m5817a(WDObjet wDObjet) {
        if (wDObjet.isValeurNull() || wDObjet == null) {
            if (!this.Yd.m3722m()) {
                WDErreurManager.m2883a(C0745b.m3222b(ie[10], this.Yd.mo2719a()));
            }
            return null;
        }
        switch (this.Sd) {
            case 2:
            case 12:
            case 39:
                String string = wDObjet.getString();
                return string.length() > this.he ? string.substring(0, this.he) : string;
            case 3:
            case 9:
                return new Short((short) wDObjet.getInt());
            case 4:
            case 36:
                return new Byte((byte) wDObjet.getInt());
            case 5:
            case 26:
            case 35:
            case 38:
                return new Integer(wDObjet.getInt());
            case 6:
                return new Float((float) wDObjet.getDouble());
            case 7:
                return new Double(wDObjet.getDouble());
            case 11:
                WDHeure wDHeure;
                if (wDObjet.isHeure()) {
                    wDHeure = (WDHeure) wDObjet;
                } else {
                    WDHeure wDHeure2 = new WDHeure(wDObjet);
                    if (!wDHeure2.m2480k()) {
                        return wDObjet.getString();
                    }
                    wDHeure = wDHeure2;
                }
                return this.Yd.m3721l() ? wDHeure.m2487t() : wDHeure.m2478j();
            case 14:
                WDDate wDDate;
                if (wDObjet.isDate()) {
                    wDDate = (WDDate) wDObjet;
                } else {
                    WDDate wDDate2 = new WDDate(wDObjet);
                    if (!wDDate2.m2520f()) {
                        return wDObjet.getString();
                    }
                    wDDate = wDDate2;
                }
                return this.Yd.m3721l() ? wDDate.m2525j() : wDDate.m2533t();
            case 17:
                return wDObjet.getCurrency();
            case 24:
            case 25:
            case 27:
                return new Long(wDObjet.getLong());
            case 28:
            case 29:
            case 30:
            case 40:
                return !wDObjet.isChaine() ? new WDChaine(wDObjet.toString()) : wDObjet.getClone();
            case 34:
                WDDateHeure wDDateHeure;
                if (wDObjet.isDateHeure()) {
                    wDDateHeure = (WDDateHeure) wDObjet;
                } else if (wDObjet.isDateHeure()) {
                    wDDateHeure = (WDDateHeure) wDObjet;
                } else {
                    WDDateHeure wDDateHeure2 = new WDDateHeure(wDObjet);
                    if (!wDDateHeure2.m2367p()) {
                        return wDObjet.getString();
                    }
                    wDDateHeure = wDDateHeure2;
                }
                return this.Yd.m3721l() ? wDDateHeure.m2352f() : wDDateHeure.m2353g();
            case 37:
                return new Boolean(wDObjet.getBoolean());
            case 41:
                return wDObjet.getBigDecimal();
            default:
                return wDObjet.toString();
        }
    }

    /* renamed from: a */
    public String m5818a(boolean z, C0833j c0833j) {
        String str = this.ce == null ? this.Wd : this.ce;
        if (!z) {
            return str;
        }
        if (c0833j == null) {
            WDHF_Connexion a = this.Yd.m3629a("", false, false);
            if (a != null) {
                c0833j = a.m4967o();
            }
        }
        return c0833j.mo3174a(str);
    }

    /* renamed from: a */
    String m5819a(boolean z, boolean z2) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.Wd);
        if (z || z2) {
            if (!m5865x() || this.Sd == 17) {
                stringBuffer.append(C0607n.Gc).append("T");
            } else {
                stringBuffer.append(C0607n.Gc).append("N");
            }
            stringBuffer.append(C0607n.Gc).append(m5796q());
            stringBuffer.append(C0607n.Gc).append(this.he);
            stringBuffer.append(ie[16]);
            stringBuffer.append(C0607n.Gc).append(this.Wd);
        }
        if (z2) {
            stringBuffer.append(C0607n.Gc).append(m5789O());
            stringBuffer.append(C0607n.Gc).append(m5795n());
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public void m5820a(int i) {
        this.be = i;
    }

    /* renamed from: a */
    public void m5821a(long j) {
        this.fe = j;
    }

    /* renamed from: a */
    public void m5822a(db dbVar) {
        this.Yd = dbVar;
    }

    /* renamed from: a */
    public void m5823a(C0859l c0859l) {
        if (this.ae != null) {
            this.ae.m6040b();
        }
        this.ae = c0859l;
    }

    /* renamed from: a */
    public void m5824a(Integer num) {
        if (this.ae != null) {
            this.ae.m6042b(num);
        }
    }

    /* renamed from: a */
    public void m5825a(Integer num, int i, boolean z) {
        if (this.ae != null) {
            this.ae.m6031a(num, i, z);
        }
    }

    /* renamed from: a */
    public void m5826a(String str) {
        this.Rd = str;
    }

    /* renamed from: a */
    public void m5827a(String str, boolean z) {
        this.Sd = 99;
        if (this.Vd == null) {
            this.Vd = new LinkedHashMap();
        }
        this.Vd.put(str, new Boolean(z));
    }

    /* renamed from: a */
    public void m5828a(boolean z) {
        this.Xd = z;
    }

    /* renamed from: a */
    final void m5829a(Object[] objArr, WDObjet wDObjet) {
        try {
            if (m5853j()) {
                WDErreurManager.m2883a(C0745b.m3222b(ie[19], this.Wd));
            }
            try {
                if (m5813P()) {
                    WDErreurManager.m2883a(C0745b.m3222b(ie[21], this.Wd));
                }
                if (objArr == null) {
                    objArr = this.Yd.m3733u();
                }
                if (this.Sd == 30) {
                    C0519e c0519e = (C0519e) wDObjet.checkType(C0519e.class);
                    if (c0519e != null) {
                        try {
                            byte[] a;
                            if (c0519e.isAvecImageMemoire() || C0808l.m4053k(c0519e.getCheminImage())) {
                                C1336b imagePeintre = c0519e.getImagePeintre(4, false);
                                if (imagePeintre != null) {
                                    try {
                                        try {
                                            a = imagePeintre.mo3724a(100, (int) C1032b.f2968a, imagePeintre.mo3726c() ? ie[18] : ie[20]);
                                        } catch (Exception e) {
                                            C0691a.m2857a(ie[17], e);
                                        }
                                    } catch (C0901s e2) {
                                        throw e2;
                                    }
                                }
                                a = null;
                            } else {
                                try {
                                    a = C0897o.m6254a(c0519e.getCheminImage(), null);
                                } catch (Exception e3) {
                                    C0691a.m2857a(ie[17], e3);
                                    a = null;
                                }
                            }
                            wDObjet = new WDBuffer(a);
                        } catch (C0901s e22) {
                            throw e22;
                        }
                    }
                }
                try {
                    if (this.Yd.m3716j()) {
                        objArr[this.Zd] = m5791b(wDObjet.getValeur());
                    } else {
                        objArr[this.Zd] = m5817a(wDObjet.getValeur());
                    }
                } catch (C0901s e222) {
                    throw e222;
                }
            } catch (C0901s e2222) {
                throw e2222;
            }
        } catch (C0901s e22222) {
            throw e22222;
        }
    }

    /* renamed from: a */
    public final boolean mo3136a() {
        return this.be != 0;
    }

    /* renamed from: a */
    public String[] m5831a(Object[] objArr) {
        int i = 0;
        String[] strArr;
        if (m5853j()) {
            strArr = new String[m5849g()];
            for (String b : this.Vd.keySet()) {
                eb ebVar = (eb) this.Yd.mo2721b(b);
                if (ebVar != null) {
                    Object obj = objArr[ebVar.m5854k()];
                    strArr[i] = obj == null ? "" : ebVar.m5832b(obj).toString();
                } else {
                    C0691a.m2856a(ie[9]);
                    strArr[i] = "";
                }
                i++;
            }
            return strArr;
        }
        C0691a.m2856a(ie[8]);
        Object obj2 = objArr[m5854k()];
        strArr = new String[1];
        strArr[0] = obj2 == null ? "" : obj2.toString();
        return strArr;
    }

    /* renamed from: b */
    public WDObjet m5832b(Object obj) {
        Object num = obj == null ? m5865x() ? new Integer(0) : "" : obj;
        int i = this.Sd;
        if (m5853j() && this.Vd != null) {
            i = ((eb) this.Yd.mo2721b(m5805G())).m5848f();
        }
        switch (i) {
            case 2:
            case 12:
                return new WDChaineA(num.toString());
            case 3:
            case 4:
            case 5:
            case 9:
            case 26:
            case 36:
            case 38:
                return num instanceof Number ? new WDEntier4(((Number) num).intValue()) : new WDEntier4(num.toString());
            case 6:
            case 100:
                return new WDReel(num.toString());
            case 7:
                return num instanceof Double ? new WDReel(((Number) num).doubleValue()) : new WDReel(num.toString());
            case 11:
                return new WDHeure(this.Yd.m3616V().mo3091a(num, 11).toString());
            case 14:
                return new WDDate(this.Yd.m3616V().mo3091a(num, 14).toString());
            case 17:
                return new WDMonetaire(num.toString());
            case 24:
            case 25:
            case 27:
                return num instanceof Number ? new WDEntier8(((Number) num).longValue()) : new WDEntier8(num.toString());
            case 28:
            case 30:
                return num instanceof byte[] ? new WDBuffer((byte[]) num) : num instanceof WDObjet ? (WDObjet) num : new WDChaine(num.toString());
            case 29:
                return num instanceof byte[] ? new WDChaineA((byte[]) num) : num instanceof WDObjet ? (WDObjet) num : new WDChaineA(num.toString());
            case 34:
                return new WDDateHeure(this.Yd.m3616V().mo3091a(num, 34).toString());
            case 35:
                return C0725i.m3044b(num.toString(), ie[30]);
            case 37:
                return num instanceof Boolean ? new WDBooleen(((Boolean) num).booleanValue()) : new WDBooleen(num.toString());
            case 39:
            case 40:
                return new WDChaineU(num.toString());
            case 41:
                return new WDNumerique(num.toString());
            default:
                C0691a.m2856a(ie[31]);
                return new WDChaine(num.toString());
        }
    }

    /* renamed from: b */
    final Object m5833b(Object[] objArr) {
        if (objArr == null) {
            objArr = this.Yd.m3733u();
        }
        if (!m5853j()) {
            return objArr[this.Zd];
        }
        if (this.Vd == null) {
            return null;
        }
        return objArr[((eb) this.Yd.mo2721b(m5805G())).m5854k()];
    }

    /* renamed from: b */
    public final String mo3137b() {
        return this.Wd;
    }

    /* renamed from: b */
    public void m5835b(int i) {
        this.Zd = i;
    }

    /* renamed from: b */
    public void m5836b(String str) {
        if (str == null || str.equals("")) {
            this.de = null;
        } else {
            this.de = str;
        }
    }

    /* renamed from: b */
    public void m5837b(boolean z) {
        this.ge = z;
    }

    /* renamed from: c */
    public WDObjet m5838c(Object obj) {
        if (obj == null) {
            return WDObjet.NULL;
        }
        int i = this.Sd;
        if (m5853j() && this.Vd != null) {
            i = ((eb) this.Yd.mo2721b(m5805G())).m5848f();
        }
        switch (i) {
            case 2:
            case 12:
            case 39:
                return new WDChaine(obj.toString());
            case 6:
            case 7:
                return new WDReel(obj.toString());
            case 11:
                return new WDHeure(obj.toString());
            case 14:
                return new WDDate(obj.toString());
            case 17:
                return new WDMonetaire(obj.toString());
            case 24:
            case 25:
            case 27:
                return new WDEntier8(obj.toString());
            case 28:
            case 29:
            case 30:
            case 40:
                return obj instanceof WDChaine ? (WDChaine) obj : new WDChaine(obj.toString());
            case 34:
                return new WDDateHeure(obj.toString());
            case 35:
                return new WDDuree(C0725i.m3064d(obj.toString()));
            case 37:
                return new WDBooleen(obj.toString().equals(ie[7]));
            case 41:
                return new WDNumerique(obj.toString());
            default:
                return new WDEntier4(obj.toString());
        }
    }

    /* renamed from: c */
    public String m5839c(boolean z) {
        StringBuffer stringBuffer = new StringBuffer();
        if (m5853j()) {
            int size = this.Vd.size();
            for (Object obj : this.Vd.keySet()) {
                String obj2 = obj.toString();
                int i = size - 1;
                stringBuffer.append("\"").append(obj2).append("\"");
                boolean booleanValue = ((Boolean) this.Vd.get(obj2)).booleanValue();
                if (z && !booleanValue) {
                    stringBuffer.append(ie[13]);
                } else if (z || !booleanValue) {
                    stringBuffer.append(ie[11]);
                } else {
                    stringBuffer.append(ie[13]);
                }
                if (i > 0) {
                    stringBuffer.append(ie[12]);
                }
                size = i;
            }
        } else {
            stringBuffer.append(m5800B());
            if (this.ge != z) {
                stringBuffer.append(ie[13]);
            } else {
                stringBuffer.append(ie[11]);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public final void m5840c(String str) {
        this.Wd = str;
    }

    /* renamed from: c */
    public final boolean mo3138c() {
        return this.Sd == 24 || this.Sd == 38;
    }

    /* renamed from: d */
    public final int mo3139d() {
        return this.he;
    }

    /* renamed from: d */
    public final void m5843d(int i) {
        this.Ud = i;
    }

    /* renamed from: d */
    public final void m5844d(String str) {
        this.ce = str;
    }

    /* renamed from: d */
    public void m5845d(boolean z) {
        this.Td = z;
    }

    /* renamed from: e */
    public void m5846e(int i) {
        this.he = i;
    }

    /* renamed from: e */
    public void m5847e(boolean z) {
        this.ee = z;
    }

    /* renamed from: f */
    public final int m5848f() {
        return this.Sd;
    }

    /* renamed from: g */
    public final int m5849g() {
        return this.Vd == null ? 0 : this.Vd.size();
    }

    /* renamed from: g */
    public void m5850g(int i) {
        this.Sd = i;
    }

    public WDObjet get(int i) {
        WDErreurManager.m2883a(C0745b.m3222b(ie[1], String.valueOf(i), this.Wd));
        return null;
    }

    public WDEntier4 getAnnee() {
        return getValeur().getAnnee();
    }

    public WDBooleen getBinaire() {
        boolean z = this.Sd == 28 || this.Sd == 30;
        return new WDBooleen(z);
    }

    public WDBooleen getCleComposee() {
        return new WDBooleen(this.Sd == 99);
    }

    public WDObjet getElement(String str) {
        return getElement(str, true);
    }

    public WDObjet getElement(String str, boolean z) {
        if (z) {
            WDErreurManager.m2883a(C0745b.m3222b(ie[28], new String[0]));
        }
        return null;
    }

    public WDChaine getFichierOrigine() {
        String str = "";
        if (this.Rd != null) {
            str = this.Rd;
        } else if (this.Yd != null) {
            str = this.Yd.mo2719a();
        }
        return new WDChaine(str);
    }

    public WDObjet getFormuleRubriqueCalculee() {
        return (this.Yd.m3716j() && this.Ud == 2) ? new WDChaine(m5792c((int) C0538a.Nb)) : super.getFormuleRubriqueCalculee();
    }

    public WDEntier4 getIndice() {
        return new WDEntier4(this.Zd + 1);
    }

    public WDEntier4 getJour() {
        return getValeur().getJour();
    }

    public WDObjet getLangue() {
        if (this.Yd.m3716j()) {
            try {
                return new WDChaine(this.Yd.mo2753v().mo2993k(this.Yd.m3717k(), m5852i()));
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, this.Yd.mo2753v());
            }
        }
        return new WDChaine();
    }

    public WDObjet getLangueDecrit() {
        if (this.Yd.m3716j()) {
            try {
                return new WDChaine(this.Yd.mo2753v().mo2977i(this.Yd.m3717k(), m5852i()));
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, this.Yd.mo2753v());
            }
        }
        return new WDChaine();
    }

    public WDChaine getLibelle() {
        return new WDChaine(this.Wd);
    }

    public WDBooleen getMemo() {
        return new WDBooleen(m5810L());
    }

    public String getMessageAccesPropieteInterdite(String str) {
        return C0745b.m3222b(ie[14], str, this.Wd);
    }

    public String getMessageLecturePropieteInterdite(String str) {
        return C0745b.m3222b(ie[15], str, this.Wd);
    }

    public WDEntier4 getMilliSeconde() {
        return getValeur().getMilliSeconde();
    }

    public WDEntier4 getMinute() {
        return getValeur().getMinute();
    }

    public WDEntier4 getMois() {
        return getValeur().getMois();
    }

    public WDEntier4 getNbComposante() {
        int i = 1;
        if (this.Vd != null) {
            i = this.Vd.size();
        }
        return new WDEntier4(i);
    }

    public WDChaine getNom() {
        return new WDChaine(this.Wd);
    }

    public WDBooleen getNull() {
        return new WDBooleen(m5864w());
    }

    public WDBooleen getNumerique() {
        return new WDBooleen(m5865x());
    }

    public WDDate getPartieDate() {
        return getValeur().getPartieDate();
    }

    public WDHeure getPartieHeure() {
        return getValeur().getPartieHeure();
    }

    public WDObjet getPersistanceRubriqueCalculee() {
        return (this.Yd.m3716j() && this.Ud == 2) ? new WDBooleen(m5793f(137)) : super.getPersistanceRubriqueCalculee();
    }

    public WDChaine getRubriqueOrigine() {
        return new WDChaine(m5818a(false, null));
    }

    public WDEntier4 getSeconde() {
        return getValeur().getSeconde();
    }

    public WDEntier4 getTHeure() {
        return getValeur().getTHeure();
    }

    public WDEntier4 getTaille() {
        return new WDEntier4(this.he);
    }

    public /* bridge */ /* synthetic */ WDObjet getTexte() {
        return m5803E();
    }

    public WDObjet getTimestampType() {
        return (this.Yd.m3716j() && this.Ud == 1) ? new WDEntier4(m5794h(138)) : super.getTimestampType();
    }

    public WDObjet getTimestampUTC() {
        return (this.Yd.m3716j() && this.Ud == 1) ? new WDBooleen(m5793f(139)) : super.getTimestampType();
    }

    public /* bridge */ /* synthetic */ WDObjet getType() {
        return m5867z();
    }

    public WDEntier4 getTypeCle() {
        return new WDEntier4(this.be);
    }

    public WDEntier4 getTypeTri() {
        return new WDEntier4(this.ge);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fr.pcsoft.wdjava.core.WDObjet getValeur() {
        /*
        r3 = this;
        r1 = 0;
        r0 = r3.Ud;	 Catch:{ b -> 0x0026 }
        r2 = 1;
        if (r0 == r2) goto L_0x000b;
    L_0x0006:
        r0 = r3.Ud;	 Catch:{ b -> 0x0028 }
        r2 = 2;
        if (r0 != r2) goto L_0x003c;
    L_0x000b:
        r0 = r3.Yd;	 Catch:{ b -> 0x0028 }
        r0 = r0.m3716j();	 Catch:{ b -> 0x0028 }
        if (r0 == 0) goto L_0x003c;
    L_0x0013:
        r0 = r3.Yd;	 Catch:{ b -> 0x002a, WDJNIException -> 0x0030 }
        r0 = r0.mo2753v();	 Catch:{ b -> 0x002a, WDJNIException -> 0x0030 }
        r0 = (fr.pcsoft.wdjava.database.hf.WDHF) r0;	 Catch:{ b -> 0x002a, WDJNIException -> 0x0030 }
        r2 = r3.Yd;	 Catch:{ b -> 0x002a, WDJNIException -> 0x0030 }
        r0 = r0.m4633a(r2, r3);	 Catch:{ b -> 0x002a, WDJNIException -> 0x0030 }
    L_0x0021:
        r0 = r3.m5832b(r0);
        return r0;
    L_0x0026:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x0028 }
    L_0x0028:
        r0 = move-exception;
        throw r0;
    L_0x002a:
        r0 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2882a(r0);
        r0 = r1;
        goto L_0x0021;
    L_0x0030:
        r0 = move-exception;
        r2 = r3.Yd;
        r2 = r2.mo2753v();
        fr.pcsoft.wdjava.database.hf.WDHF_Manager.m5075a(r0, r2);
        r0 = r1;
        goto L_0x0021;
    L_0x003c:
        r0 = r3.m5833b(r1);
        goto L_0x0021;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.eb.getValeur():fr.pcsoft.wdjava.core.WDObjet");
    }

    public WDObjet getValeurParDefaut() {
        return new WDChaine(this.de);
    }

    public WDObjet getValeurParDefautCalculee() {
        return (this.Yd.m3716j() && this.Ud == 2) ? new WDChaine(m5792c(136)) : super.getValeurParDefautCalculee();
    }

    /* renamed from: h */
    public Object m5851h() {
        switch (this.Sd) {
            case 2:
                return String.valueOf(C0607n.Jt);
            case 3:
                return new Short(Short.MAX_VALUE);
            case 4:
                return new Byte(Byte.MAX_VALUE);
            case 5:
                return new Integer(Integer.MAX_VALUE);
            case 6:
                return new Float(Float.MAX_VALUE);
            case 7:
                return new Double(Double.MAX_VALUE);
            case 9:
                return new Integer(65535);
            case 11:
                return ie[27];
            case 12:
                return new Character(C0607n.Jt);
            case 14:
                return ie[24];
            case 17:
                return BigDecimal.valueOf(6.0446290980731456E17d);
            case 24:
                return new Long(Long.MAX_VALUE);
            case 25:
                return new Long(Long.MAX_VALUE);
            case 26:
                return new Long(4294967296L);
            case 27:
                return new BigDecimal(ie[23]);
            case 28:
                return ie[3];
            case 29:
                return String.valueOf(C0607n.Jt);
            case 30:
                return ie[3];
            case 34:
                return ie[26];
            case 35:
                return new Integer(Integer.MAX_VALUE);
            case 36:
                return new Short((short) 255);
            case 37:
                return new Integer(1);
            case 38:
                return new Integer(Integer.MAX_VALUE);
            case 39:
                return String.valueOf('￿');
            case 40:
                return String.valueOf('￿');
            case 41:
                return new BigDecimal(ie[25]);
            default:
                return "";
        }
    }

    /* renamed from: i */
    public long m5852i() {
        try {
            if (this.fe != -1) {
                return this.fe;
            }
            try {
                long a = this.Yd.m3668b() == 2 ? this.Yd.mo2753v().mo2780a(this.Yd.m3717k(), this.Zd, false) : this.Yd.m3602E().mo2945f(this.Yd.m3717k(), this.Wd);
                if (a == 0) {
                    String str = "";
                    this.Yd.m3602E().mo2932e((int) C0542t.Vc);
                    if (!str.equals("")) {
                        WDErreurManager.m2883a(str);
                    }
                    return -1;
                }
                this.fe = a;
                return a;
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                WDHF_Manager.m5075a(e2, this.Yd.mo2753v());
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
            }
        } catch (C0841b e4) {
            throw e4;
        }
    }

    public boolean isRubrique() {
        return true;
    }

    /* renamed from: j */
    public final boolean m5853j() {
        return this.Vd != null;
    }

    /* renamed from: k */
    public final int m5854k() {
        return this.Zd;
    }

    /* renamed from: l */
    public final C0859l m5855l() {
        return this.ae;
    }

    /* renamed from: m */
    public final boolean m5856m() {
        return this.Sd == 14 || this.Sd == 11 || this.Sd == 34;
    }

    /* renamed from: o */
    public int m5857o() {
        int i = 0;
        switch (this.be) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 6;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 8;
                break;
        }
        return (m5810L() || this.Sd == 100) ? i - 1 : i;
    }

    public void opDecProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0856i.f2269a[eWDPropriete.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                WDObjet valeur = getValeur();
                valeur.opDecProp(eWDPropriete, wDObjet);
                setValeur(valeur);
                return;
            default:
                super.opDecProp(eWDPropriete, wDObjet);
                return;
        }
    }

    public void opIncProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        switch (C0856i.f2269a[eWDPropriete.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                WDObjet valeur = getValeur();
                valeur.opIncProp(eWDPropriete, wDObjet);
                setValeur(valeur);
                return;
            default:
                super.opIncProp(eWDPropriete, wDObjet);
                return;
        }
    }

    /* renamed from: p */
    public Object m5858p() {
        switch (this.Sd) {
            case 2:
                return "";
            case 3:
                return new Short(Short.MIN_VALUE);
            case 4:
                return new Byte(Byte.MIN_VALUE);
            case 5:
                return new Integer(Integer.MIN_VALUE);
            case 6:
                return new Float(Float.MIN_VALUE);
            case 7:
                return new Double(Double.MIN_VALUE);
            case 9:
                return new Short((short) 0);
            case 11:
                return ie[6];
            case 12:
                return "";
            case 14:
                return ie[5];
            case 17:
                return BigDecimal.valueOf(-6.0446290980731456E17d);
            case 24:
                return new Long(0);
            case 25:
                return new Long(Long.MIN_VALUE);
            case 26:
                return new Integer(0);
            case 27:
                return new Long(0);
            case 28:
                return ie[3];
            case 29:
                return "";
            case 30:
                return ie[3];
            case 34:
                return ie[2];
            case 35:
                return new Integer(Integer.MIN_VALUE);
            case 36:
                return new Byte((byte) 0);
            case 37:
                return new Integer(0);
            case 38:
                return new Integer(0);
            case 39:
                return Character.valueOf('\u0000');
            case 40:
                return Character.valueOf('\u0000');
            case 41:
                return new BigDecimal(ie[4]);
            default:
                return "";
        }
    }

    /* renamed from: r */
    public final int m5859r() {
        return this.Ud;
    }

    public void release() {
        super.release();
        this.Wd = null;
        this.ce = null;
        this.de = null;
        if (this.Vd != null) {
            this.Vd.clear();
            this.Vd = null;
        }
        if (this.ae != null) {
            this.ae.m6040b();
            this.ae = null;
        }
        this.Yd = null;
        this.Rd = null;
    }

    /* renamed from: s */
    public eb m5860s() {
        eb ebVar = new eb(this.Wd, this.Sd, this.be, this.ge, this.he);
        ebVar.m5836b(this.de);
        ebVar.m5828a(this.Xd);
        ebVar.m5845d(this.Td);
        if (m5853j()) {
            for (Object obj : this.Vd.keySet()) {
                String obj2 = obj.toString();
                ebVar.m5827a(obj2, ((Boolean) this.Vd.get(obj2)).booleanValue());
            }
        }
        return ebVar;
    }

    public void setAnnee(int i) {
        WDObjet valeur = getValeur();
        valeur.setAnnee(i);
        setValeur(valeur);
    }

    public void setFormuleRubriqueCalculee(String str) {
        WDErreurManager.m2883a(C0745b.m3222b(ie[0], EWDPropriete.PROP_FORMULERUBRIQUECALCULEE.getNom()));
    }

    public void setJour(int i) {
        WDObjet valeur = getValeur();
        valeur.setJour(i);
        setValeur(valeur);
    }

    public void setLangue(String str) {
        WDErreurManager.m2883a(C0745b.m3222b(ie[0], EWDPropriete.PROP_LANGUE.getNom()));
    }

    public void setLangueDecrit(String str) {
        WDErreurManager.m2883a(C0745b.m3222b(ie[0], EWDPropriete.PROP_LANGUEDECRIT.getNom()));
    }

    public void setMilliSeconde(int i) {
        WDObjet valeur = getValeur();
        valeur.setMilliSeconde(i);
        setValeur(valeur);
    }

    public void setMinute(int i) {
        WDObjet valeur = getValeur();
        valeur.setMinute(i);
        setValeur(valeur);
    }

    public void setMois(int i) {
        WDObjet valeur = getValeur();
        valeur.setMois(i);
        setValeur(valeur);
    }

    public void setNull(boolean z) {
        if (this.Yd.m3722m()) {
            setValeur(WDObjet.NULL);
            return;
        }
        WDErreurManager.m2883a(C0745b.m3222b(ie[10], this.Yd.mo2719a()));
    }

    public void setPartieDate(WDObjet wDObjet) {
        WDObjet valeur = getValeur();
        valeur.setPartieDate(wDObjet);
        setValeur(valeur);
    }

    public void setPartieHeure(WDObjet wDObjet) {
        WDObjet valeur = getValeur();
        valeur.setPartieHeure(wDObjet);
        setValeur(valeur);
    }

    public void setPersistanceRubriqueCalculee(boolean z) {
        WDErreurManager.m2883a(C0745b.m3222b(ie[0], EWDPropriete.PROP_PERSISTANCERUBRIQUECALCULEE.getNom()));
    }

    public void setSeconde(int i) {
        WDObjet valeur = getValeur();
        valeur.setSeconde(i);
        setValeur(valeur);
    }

    public void setTHeure(int i) {
        WDObjet valeur = getValeur();
        valeur.setTHeure(i);
        setValeur(valeur);
    }

    public void setTimestampType(int i) {
        WDErreurManager.m2883a(C0745b.m3222b(ie[0], EWDPropriete.PROP_TIMESTAMPTYPE.getNom()));
    }

    public void setTimestampUTC(boolean z) {
        WDErreurManager.m2883a(C0745b.m3222b(ie[0], EWDPropriete.PROP_TIMESTAMPUTC.getNom()));
    }

    public void setValeur(WDObjet wDObjet) {
        m5829a(null, wDObjet);
    }

    public void setValeurParDefautCalculee(String str) {
        WDErreurManager.m2883a(C0745b.m3222b(ie[0], EWDPropriete.PROP_VALEURPARDEFAUTCALCULEE.getNom()));
    }

    /* renamed from: t */
    public final HashMap m5861t() {
        return this.Vd;
    }

    /* renamed from: u */
    public final boolean m5862u() {
        return this.ee;
    }

    /* renamed from: v */
    public boolean m5863v() {
        return this.Td;
    }

    /* renamed from: w */
    public boolean m5864w() {
        return m5833b(null) == null;
    }

    /* renamed from: x */
    public final boolean m5865x() {
        return (this.Sd >= 3 && this.Sd <= 7) || this.Sd == 9 || this.Sd == 17 || ((this.Sd >= 24 && this.Sd <= 27) || this.Sd == 36 || this.Sd == 36 || this.Sd == 37 || this.Sd == 38 || this.Sd == 41);
    }

    /* renamed from: y */
    public long m5866y() {
        return this.fe;
    }

    /* renamed from: z */
    public WDEntier4 m5867z() {
        return new WDEntier4(C0855h.m5971a(this.Sd));
    }
}
