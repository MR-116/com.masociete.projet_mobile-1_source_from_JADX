package fr.pcsoft.wdjava.core.context;

import fr.pcsoft.wdjava.core.C0505p;
import fr.pcsoft.wdjava.core.C0507r;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.WDTuple;
import fr.pcsoft.wdjava.core.application.WDProcedureInterne;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.C0673b;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.erreur.WDErreurNonFatale;
import fr.pcsoft.wdjava.core.parcours.IWDParcours;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.hc;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.core.utils.lc;
import fr.pcsoft.wdjava.core.utils.ob;
import fr.pcsoft.wdjava.p032m.C0933a;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.C0489p;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.C0524x;
import fr.pcsoft.wdjava.ui.champs.fenetreinterne.fb;
import fr.pcsoft.wdjava.ui.utils.C0857z;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.LinkedList;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class WDContexte implements C0668g {
    /* renamed from: b */
    private static final int f1655b = 4;
    /* renamed from: c */
    private static final int f1656c = 0;
    /* renamed from: e */
    private static final int f1657e = 3;
    /* renamed from: g */
    private static final int f1658g = 5;
    /* renamed from: n */
    private static final int f1659n = 2;
    /* renamed from: o */
    private static final int f1660o = 6;
    /* renamed from: p */
    private static Cipher f1661p = null;
    /* renamed from: s */
    private static final int f1662s = 1;
    /* renamed from: z */
    private static final String[] f1663z = new String[]{m2688z(m2689z("=\u0001AA\t?\u0006=>\u0007?\u0017'>-\u0018 {\u0000+")), m2688z(m2689z("=\u0001A")), m2688z(m2689z("1\u0000'")), m2688z(m2689z(")\u0010TCt")), m2688z(m2689z("5)b\u0001?\u000f-p\u0002)\\ wN('`\u0017<\b!`N \u001ddq\u0006-\u0015*w@")), m2688z(m2689z("_\u0001@<\u00131\u000b[1\u00019\tW1\u00052\u0010W<\b5\u0010")), m2688z(m2689z("_\u0001@<\u0013*\u0005^+\u0019.\u001bV+\u0013.\u0001F!\u0019.\u001b\\!\u0002#\tG\"\u00185\u0014^+")), m2688z(m2689z("=\u0011Q;\u00029\u001bT+\u00029\u0010@+\u00139\nM-\u0003)\u0016A")), m2688z(m2689z("_\u0014Q!\b9\u001b[ \u0005(")), m2688z(m2689z("qN")), m2688z(m2689z("_\u0001@<\t)\u0016M(\t2\u0001F<\t#\u0007];\u00005\u0017A/\u0002(\u0001")), m2688z(m2689z("_\u0001@<\u00131\u0005M(\t2\u0001F<\t#\u0002[\"\u00009")), m2688z(m2689z("_\u0001@<\u00131\u000b\\1\t0\u0001_+\u0002(\u001b[&\u0001")), m2688z(m2689z(",%aN(\u0019dB-#\u0018!2\u000b\"\\'}\u001b>\u000f")), m2688z(m2689z("_\u0014Q!\b9\u001bB<\u0005/\u0001M*\t#\u0002]-\u0019/")), m2688z(m2689z("_\u0014Q!\b9\u001bW \u0018.\u0001W1\u001f=\rA'\t#\b[)\u00029")), m2688z(m2689z("_\u0014Q!\b9\u001b^!\u0002;\u001bB<\t/\u0017")), m2688z(m2689z("_\u0014Q!\b9\u001bV+\u000f.\u0001_+\u0002(\u0005F'\u00032\u001bA>\u00052")), m2688z(m2689z("_\u0014Q!\b9\u001bA+\u00009\u0007F'\u00032\u001b_+\u0002)")), m2688z(m2689z("_\u0014Q!\b9\u001bT'\u0002#\u0007Z/\u001e;\u0001_+\u0002(\u001bV!\u000f#\fF#\u0000")), m2688z(m2689z("_\u0014Q!\b9\u001bF!\u0019?\fW1\u001e9\bS-\u00049\u0001")), m2688z(m2689z("_\u0014Q!\b9\u001bS(\n9\u0007F/\u00185\u000b\\1\u001c.\u000bB<\u00059\u0010W")), m2688z(m2689z("_\u0014Q!\b9\u001bT'\u0002#\bW-\u0018)\u0016W")), m2688z(m2689z("_\u0014Q!\b9\u001bW6\t?\u001bB<\u0003?\u001bU\"\u0003>\u0005^+")), m2688z(m2689z("_\u0014Q!\b9\u001bQ\"\u0005?\u001bA;\u0005*\u0005\\:")), m2688z(m2689z("_\u0014Q!\b9\u001bA-\u001e3\b^")), m2688z(m2689z("_\u0014Q!\b9\u001bS>\u001e9\u0017M=\u0019,\u0014@+\u001f/\r] \u0013/\u0013[>\t")), m2688z(m2689z("_\u0014Q!\b9\u001bQ\"\u0005?\u001bV<\u00035\u0010M=\u0019.")), m2688z(m2689z("_\u0014Q!\b9\u001bW<\u001e9\u0011@1\u000f4\u0005@)\t1\u0001\\:\u0013,\u0011P")), m2688z(m2689z("_\u0014Q!\b9\u001bA!\u001e(\rW1\u000f4\u0005_>")), m2688z(m2689z("_\u0014Q!\b9\u001bS-\u00185\u0012S:\u00053\nM/\u001c,\b[-\r(\r] ")), m2688z(m2689z("_\u0014Q!\b9\u001bA;\u001e*\u000b^1\u001f3\u0011@'\u001f")), m2688z(m2689z("_\u0014Q!\b9\u001bF!\u0019?\fW1\r,\u0014G7\t9")), m2688z(m2689z("_\u0014Q!\b9\u001bQ\"\u0005?\u001bP:\u0002#\u0005X!\u0019.\u0000Z;\u0005")), m2688z(m2689z("_\u0014Q!\b9\u001bQ&\r2\u0003W#\t2\u0010M:\r5\b^+")), m2688z(m2689z("_\u0014Q!\b9\u001bA!\u001e(\rW1\u001f=\rA'\t#\b[)\u00029")), m2688z(m2689z("_\u0014Q!\b9\u001bV+\u001f=\u0007F'\u001a=\u0010[!\u0002#\u0005B>\u00005\u0007S:\u00053\n")), m2688z(m2689z("_\u0014Q!\b9\u001bP:\u0002#\t[\"\u00059\u0011M+\u0002:\u000b\\-\t")), m2688z(m2689z("_\u0014Q!\b9\u001bP:\u0002#\u0003S;\u000f4\u0001M+\u0002:\u000b\\-\t")), m2688z(m2689z("_\u0014Q!\b9\u001bT+\u001e1\u0001F;\u001e9\u001bT+\u00029\u0010@+\u0013:\r^\"\t")), m2688z(m2689z("_\u0014Q!\b9\u001bT'\u0002#\r\\'\u0018")), m2688z(m2689z("_\u0014Q!\b9\u001bT+\u001e1\u0001F;\u001e9\u001bB<\u00036\u0001F")), m2688z(m2689z("_\u0014Q!\b9\u001bQ\"\u0005?\u001bP:\u0002#\u0005Q:\u00053\nM-\u0000=\u0012[+\u001e")), m2688z(m2689z("_\u0014Q!\b9\u001b@!\u00190\u0001F:\t#\u0017];\u001e5\u0017")), m2688z(m2689z("_\u0014Q!\b9\u001bB+\u001e(\u0001M*\t#\u0002]-\u0019/")), m2688z(m2689z("_\u0014Q!\b9\u001b@+\u000f)\u0014W<\r(\r] \u0013*\u0005^+\u0019.")), m2688z(m2689z("_\u0014Q!\b9\u001bW \u0018.\u0001W1\u000f4\u0005_>")), m2688z(m2689z("_\u0014Q!\b9\u001bP:\u0002#\u0003S;\u000f4\u0001M<\t0\u0005Q&\t")), m2688z(m2689z("_\u0014Q!\b9\u001bS(\n5\u0007Z/\u000b9\u001b^'\u000b2\u0001")), m2688z(m2689z("_\u0014Q!\b9\u001bV \b#\bS-\u00049\u0016M*\t/\u0010")), m2688z(m2689z("_\u0014Q!\b9\u001bQ\"\u0005?\u001bB<\t?\u0001V+\u0002(")), m2688z(m2689z("_\u0014Q!\b9\u001b[ \u000f.\u0001_+\u0002(\u0005F'\u00032\u001bA>\u00052")), m2688z(m2689z("_\u0014Q!\b9\u001bP:\u0002#\u0000@!\u0005(\u001b@+\u0000=\u0007Z+")), m2688z(m2689z("_\u0014Q!\b9\u001bT+\u001e1\u0001F;\u001e9\u001bB!\u001c)\u0014")), m2688z(m2689z("_\u0014Q!\b9\u001bV+\u0001=\nV+\u00131\u0005X1\r:\u0002[-\u0004=\u0003W")), m2688z(m2689z("_\u0014Q!\b9\u001bV+\u001c0\u0005Q+\u00019\nF")), m2688z(m2689z("_\u0001J+\u000f#\u0014Q!\b9\u001b_+\u00184\u000bV+\u0013?\bS=\u001f9")), m2688z(m2689z("_\u0014Q!\b9\u001bV+\u0000?\u0005@/\u00185\u000b\\1\u000b0\u000bP/\u00009")), m2688z(m2689z("_\u0014Q!\b9\u001b@+\u000f)\u0014W<\r(\r] \u0013,\u0016]>\u001e5\u0001F+")), m2688z(m2689z("_\u0014Q!\b9\u001bV \b#\u0000W,\u0019(\u001bU\"\u0005/\u0017W1\u001f.\u0007")), m2688z(m2689z("_\u0014Q!\b9\u001bQ!\u0002/\u0010@;\u000f(\u0001G<\u0013?\bS=\u001f9")), m2688z(m2689z("_\u0014Q!\b9\u001bA-\r0\u0001")), m2688z(m2689z("_\u0014Q!\b9\u001bT\"\u00052\u0003")), m2688z(m2689z("_\u0014Q!\b9\u001bS8\r2\u0010M=\u0019,\u0014@+\u001f/\r] \u0013/\u0013[>\t")), m2688z(m2689z("_\u0014Q!\b9\u001bW6\t?\u001bB<\u0003?\u001b^!\u000f=\bW")), m2688z(m2689z("_\u0014Q!\b9\u001bV+\u001f(\u0016G-\u00189\u0011@1\u000f0\u0005A=\t")), m2688z(m2689z("_\u0014Q!\b9\u001bB!\u001f(\u001b[ \u0005(")), m2688z(m2689z("_\u0014Q!\b9\u001b_!\b5\u0002[-\r(\r] ")), m2688z(m2689z("_\u0014Q!\b9\u001bW \u001e3\u0011^+\u00138\u0001@!\u00190\u0001")), m2688z(m2689z("_\u0014Q!\b9\u001bA9\u0005,\u0001M4\u001e")), m2688z(m2689z("_\u0014Q!\b9\u001bF!\u0019?\fW1\t2\u0002] \u000f9")), m2688z(m2689z("_\u0014Q!\b9\u001bQ\"\u0005?\u001b^'\t2\u001bZ:\u00010")), m2688z(m2689z("_\u0014Q!\b9\u001bQ\"\u0005?\u001b_/\u001e-\u0011W;\u001e#\u0007S<\u00189")), m2688z(m2689z("_\u0014Q!\b9\u001bP:\u0002#\t[\"\u00059\u0011M<\t0\u0005Q&\t")), m2688z(m2689z("_\u0014Q!\b9\u001bS>\u001e9\u0017M-\u0004=\u0016U+\u00019\nF")), m2688z(m2689z("_\u0014Q!\b9\u001b];\u001a9\u0016F;\u001e9\u001bB!\u001c)\u0014")), m2688z(m2689z("_\u0014Q!\b9\u001bQ\"\u0005?\u001bU/\u0019?\fW1\u001f)\u0016")), m2688z(m2689z("_\u0014Q!\b9\u001bA+\u00009\u0007F'\u00032\u001bX!\u0019.")), m2688z(m2689z("_\u0014Q!\b9\u001bQ&\r2\u0003W#\t2\u0010M>\u0003/\rF'\u00032\u001bQ/\u001e(\u0001")), m2688z(m2689z("_\u0014Q!\b9\u001bA+\u00009\u0007F'\u00032\u001b^'\u000b2\u0001")), m2688z(m2689z("_\u0014Q!\b9\u001bV,\u0000#\u0007^'\u000f#\u0003S;\u000f4\u0001")), m2688z(m2689z("_\u0014Q!\b9\u001bQ&\r.\u0003W#\t2\u0010M>\u0019>")), m2688z(m2689z("_\u0014Q!\b9\u001bQ&\r2\u0003W#\t2\u0010M!\u001e5\u0001\\:\r(\r] ")), m2688z(m2689z("_\u0014Q!\b9\u001bP:\u0002#\u0000@!\u0005(\u001bW \n3\nQ+")), m2688z(m2689z("_\u0014Q!\b9\u001bV,\u0000#\u0007^'\u000f#\u0000@!\u0005(")), m2688z(m2689z("_\u0014Q!\b9\u001bT+\u001e1\u0001F;\u001e9\u001bT+\u00029\u0010@+")), m2688z(m2689z("_\u0014Q!\b9\u001bS(\n5\u0007Z/\u000b9\u001b_!\u0005/")), m2688z(m2689z("_\u0014Q!\b9\u001bS(\n9\u0007F/\u00185\u000b\\1\u001a=\bW;\u001e")), m2688z(m2689z("_\u0014Q!\b9\u001bS8\r2\u0010M*\t?\fS<\u000b9\tW \u0018")), m2688z(m2689z("_\u0007] \u001f(\u0016G-\u00189\u0011@")), m2688z(m2689z("_\u0000W=\u0018.\u0011Q:\t)\u0016"))};
    protected static final String zz = null;
    /* renamed from: a */
    private volatile boolean f1664a = false;
    /* renamed from: d */
    private String f1665d = "";
    /* renamed from: f */
    private C0508h f1666f = null;
    /* renamed from: h */
    private boolean f1667h = false;
    /* renamed from: i */
    private WeakReference<WDTuple<WDObjet>> f1668i = null;
    /* renamed from: j */
    private WDErreurNonFatale f1669j = null;
    /* renamed from: k */
    private boolean f1670k = true;
    /* renamed from: l */
    private int f1671l = 0;
    /* renamed from: m */
    private LinkedList f1672m = new LinkedList();
    /* renamed from: q */
    private volatile boolean f1673q = false;
    /* renamed from: r */
    private boolean f1674r = false;
    /* renamed from: t */
    private LinkedList f1675t = null;

    /* renamed from: a */
    private C0489p m2683a(C0671c c0671c, int i) {
        C0489p c0489p = c0671c.f1686c;
        if (c0489p == null) {
            int i2 = i + 1;
            int size = this.f1672m.size();
            while (c0489p == null && i2 < size) {
                int i3 = i2 + 1;
                c0489p = ((C0671c) this.f1672m.get(i2)).f1686c;
                i2 = i3;
            }
        }
        return c0489p;
    }

    /* renamed from: a */
    private String m2684a(C0671c c0671c, C0489p c0489p, boolean z) {
        String str = "";
        String str2 = "";
        str2 = c0489p != null ? z ? c0489p.getName() : c0489p.getFullName(false) : WDProjet.getInstance().getNom();
        switch (c0671c.f1687d) {
            case 2:
                return C0745b.m3224c(f1663z[85], str2);
            case 3:
                return C0745b.m3224c(f1663z[55], str2);
            case 5:
            case 13:
                return C0745b.m3224c(f1663z[34], str2);
            case 9:
                return C0745b.m3224c(f1663z[23], C0735q.m3133h(c0671c.f1689f));
            case 10:
                return C0745b.m3224c(f1663z[64], C0735q.m3133h(c0671c.f1689f));
            case 11:
                return C0745b.m3224c(f1663z[14], str2);
            case 12:
                return C0745b.m3224c(f1663z[44], str2);
            case 14:
            case 34:
                return C0745b.m3224c(f1663z[8], str2);
            case 15:
                return C0745b.m3224c(f1663z[46], str2);
            case 16:
                return C0745b.m3224c(f1663z[29], str2);
            case 17:
                return C0745b.m3224c(f1663z[67], str2);
            case 18:
                return C0745b.m3224c(f1663z[76], str2);
            case 19:
                return C0745b.m3224c(f1663z[15], str2);
            case 20:
                return C0745b.m3224c(f1663z[35], str2);
            case 21:
                return C0745b.m3224c(f1663z[48], str2);
            case 22:
                return str;
            case 23:
                return str;
            case 24:
                return str;
            case 25:
                return str;
            case 26:
                return C0745b.m3224c(f1663z[51], str2);
            case 27:
                return C0745b.m3224c(f1663z[17], str2);
            case 28:
                return str;
            case 29:
                return str;
            case 30:
                return C0745b.m3224c(f1663z[27], str2);
            case 31:
                return C0745b.m3224c(f1663z[80], str2);
            case 32:
                return C0745b.m3224c(f1663z[18], str2);
            case 33:
                return C0745b.m3224c(f1663z[79], str2);
            case 35:
                return C0745b.m3224c(f1663z[40], str2);
            case 36:
                return C0745b.m3224c(f1663z[68], str2);
            case 101:
                return C0745b.m3224c(f1663z[59], str2);
            case 102:
                return C0745b.m3224c(f1663z[49], str2);
            case 116:
                return C0745b.m3224c(f1663z[75], str2);
            case 117:
                return C0745b.m3224c(f1663z[53], str2);
            case 118:
                return C0745b.m3224c(f1663z[86], str2);
            case C0607n.co /*120*/:
                return C0745b.m3224c(f1663z[77], str2);
            case C0607n.Hn /*124*/:
                return C0745b.m3224c(f1663z[33], str2);
            case C0607n.hu /*175*/:
                return C0745b.m3224c(f1663z[74], str2);
            case C0607n.aw /*176*/:
                return C0745b.m3224c(f1663z[88], str2);
            case C0607n.Tv /*220*/:
                return C0745b.m3224c(f1663z[30], str2);
            case C0607n.Qt /*221*/:
                return C0745b.m3224c(f1663z[36], str2);
            case C0607n.Jn /*234*/:
                return C0745b.m3224c(f1663z[54], str2);
            case C0607n.Gu /*266*/:
                return C0745b.m3224c(f1663z[71], str2);
            case C0607n.Cw /*267*/:
                return C0745b.m3224c(f1663z[19], str2);
            case C0607n.ex /*1101*/:
                return C0745b.m3224c(f1663z[84], str2);
            case C0607n.Do /*1102*/:
                return C0745b.m3224c(f1663z[38], str2);
            case C0607n.vo /*1103*/:
                return C0745b.m3224c(f1663z[37], str2);
            case C0607n.mo /*1104*/:
                return C0745b.m3224c(f1663z[83], str2);
            case C0607n.zx /*1105*/:
                return C0745b.m3224c(f1663z[47], str2);
            case C0607n.ie /*1106*/:
                return C0745b.m3224c(f1663z[73], str2);
            case C0607n.ms /*1107*/:
                return C0745b.m3224c(f1663z[52], str2);
            case 1108:
                return C0745b.m3224c(f1663z[70], str2);
            case C0607n.ik /*1109*/:
                return C0745b.m3224c(f1663z[20], str2);
            case C0607n.Jp /*1110*/:
                return C0745b.m3224c(f1663z[32], str2);
            case 1111:
                return C0745b.m3224c(f1663z[31], str2);
            case C0607n.rv /*1112*/:
                return C0745b.m3224c(f1663z[43], str2);
            case C0607n.Bt /*1114*/:
                return C0745b.m3224c(f1663z[87], str2);
            case C0607n.Tf /*1115*/:
                return C0745b.m3224c(f1663z[45], str2);
            case C0607n.Jg /*1116*/:
                return C0745b.m3224c(f1663z[57], str2);
            case C0607n.Tl /*1117*/:
                return C0745b.m3224c(f1663z[41], str2);
            case C0607n.Xu /*1118*/:
                return C0745b.m3224c(f1663z[66], str2);
            case C0607n.Gl /*1119*/:
                return C0745b.m3224c(f1663z[56], C0735q.m3133h(c0671c.f1689f));
            case C0607n.le /*1120*/:
                return C0745b.m3224c(f1663z[60], C0735q.m3133h(c0671c.f1689f));
            case C0607n.Ki /*1121*/:
                return C0745b.m3224c(f1663z[65], C0735q.m3133h(c0671c.f1689f));
            case C0607n.ip /*1122*/:
                return C0745b.m3224c(f1663z[16], str2);
            case C0607n.gi /*1123*/:
                return C0745b.m3224c(f1663z[25], str2);
            case C0607n.jt /*1124*/:
                return C0745b.m3224c(f1663z[62], str2);
            case C0607n.ju /*1125*/:
                return C0745b.m3224c(f1663z[61], str2);
            case C0607n.fe /*1126*/:
                return C0745b.m3224c(f1663z[78], str2);
            case C0607n.wt /*1127*/:
                return C0745b.m3224c(f1663z[22], str2);
            case C0607n.Ic /*1128*/:
                return C0745b.m3224c(f1663z[24], str2);
            case C0607n.Qs /*1129*/:
                return C0745b.m3224c(f1663z[50], str2);
            case C0607n.f1435S /*1130*/:
                return C0745b.m3224c(f1663z[82], str2);
            case C0607n.us /*1132*/:
                return C0745b.m3224c(f1663z[72], str2);
            case C0607n.bq /*1133*/:
                return C0745b.m3224c(f1663z[81], str2);
            case C0607n.Nt /*1134*/:
                return C0745b.m3224c(f1663z[28], str2);
            case C0607n.Fx /*1135*/:
                return C0745b.m3224c(f1663z[69], str2);
            case C0607n.Hl /*1136*/:
                return C0745b.m3224c(f1663z[63], str2);
            case C0607n.ps /*1137*/:
                return C0745b.m3224c(f1663z[26], str2);
            case C0607n.Mv /*1138*/:
                return C0745b.m3224c(f1663z[39], str2);
            case C0607n.wg /*1139*/:
                return C0745b.m3224c(f1663z[42], str2);
            case C0607n.od /*1151*/:
                return C0745b.m3224c(f1663z[58], C0735q.m3131f(c0671c.f1689f));
            case C0607n.Ks /*1152*/:
                return C0745b.m3224c(f1663z[21], C0735q.m3131f(c0671c.f1689f));
            default:
                return str;
        }
    }

    /* renamed from: a */
    private void m2685a(int i, String str, WDObjet wDObjet, String str2) {
        if (this.f1664a) {
            lc.m4068a();
        }
        C0672d c0672d = new C0672d(i, null);
        c0672d.f = str;
        C0672d.access$002(c0672d, wDObjet);
        C0672d.access$102(c0672d, str2);
        this.f1672m.addFirst(c0672d);
    }

    public static final String compact(String str) {
        byte[] a = ob.m4112a(str, 1, 0);
        try {
            if (f1661p == null) {
                byte[] digest = MessageDigest.getInstance(f1663z[2]).digest((zz + WDProjet.getInstance().getVersionApplication()).getBytes(f1663z[3]));
                f1661p = Cipher.getInstance(f1663z[0]);
                f1661p.init(2, new SecretKeySpec(digest, f1663z[1]));
            }
            return new String(f1661p.doFinal(a), f1663z[3]);
        } catch (Exception e) {
            C0691a.m2857a(f1663z[4], e);
            return "";
        }
    }

    public static final fb getFenetreInterne(String str) {
        C0508h h = WDAppelContexte.getContexte().m2722h();
        fb fenetreInterne = h != null ? h.getFenetreInterne(str) : null;
        return (fenetreInterne == null || fenetreInterne.isReleased()) ? null : fenetreInterne;
    }

    public static C0489p getMaFenetre() {
        return (C0489p) WDAppelContexte.getContexte().m2722h();
    }

    public static final C0489p getMaFenetreCoulissanteDroite() {
        C0489p maFenetre = getMaFenetre();
        maFenetre = maFenetre instanceof C0508h ? (C0489p) ((C0508h) maFenetre).getFenetreCoulissanteDroite() : null;
        if (maFenetre == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f1663z[10], new String[0]));
        }
        return maFenetre;
    }

    public static final C0489p getMaFenetreCoulissanteGauche() {
        C0489p maFenetre = getMaFenetre();
        maFenetre = maFenetre instanceof C0508h ? (C0489p) ((C0508h) maFenetre).getFenetreCoulissanteGauche() : null;
        if (maFenetre == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f1663z[10], new String[0]));
        }
        return maFenetre;
    }

    public static final C0489p getMaFenetreFille() {
        C0508h d = WDAppelContexte.getContexte().m2718d();
        if (d == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f1663z[11], new String[0]));
        }
        return (C0489p) d;
    }

    public static final C0489p getMaFenetreInterne() {
        C0489p o = WDAppelContexte.getContexte().m2728o();
        while (o != null && !(o instanceof C0524x)) {
            if (o instanceof fb) {
                o = ((fb) o).getChampFenetreInterne();
            } else if (o instanceof C0489p) {
                fb fenetreInterne = o.getFenetreInterne();
                o = fenetreInterne == null ? (C0489p) o.getPere() : fenetreInterne.getChampFenetreInterne();
            }
        }
        if (o == null) {
            o = getMaFenetre();
            if (o == null) {
                WDErreurManager.m2883a(C0745b.m3222b(f1663z[7], new String[0]));
            }
        }
        return o;
    }

    public static WDObjet getMaSource() {
        return WDAppelContexte.getContexte().m2734u();
    }

    public static final WDObjet getMaTacheParallele() {
        Thread currentThread = Thread.currentThread();
        WDObjet e = currentThread instanceof C0933a ? ((C0933a) currentThread).m6797e() : (WDObjet) C0938m.m6817d();
        return e == null ? new C0675i() : e;
    }

    public static final WDObjet getMaTacheParallelePrecedente() {
        return getMaTacheParallele().getProp(EWDPropriete.__PROP_MA_TACHE_PARALLELE_PRECEDENTE);
    }

    public static final WDObjet getMesTachesParallelesPrecedentes() {
        return getMaTacheParallele().getProp(EWDPropriete.__PROP_MES_TACHES_PARALLELES_PRECEDENTES);
    }

    public static C0489p getMoiMeme() {
        return WDAppelContexte.getContexte().m2728o();
    }

    public static final C0489p getMonElementIHM() {
        C0489p o = WDAppelContexte.getContexte().m2728o();
        while (o != null && !(o instanceof C0505p)) {
            o = (C0489p) o.getPere();
        }
        if (o instanceof fb) {
            o = ((fb) o).getChampFenetreInterne();
        }
        if (o == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f1663z[12], new String[0]));
        }
        return o;
    }

    public static C0489p getMonParent() {
        return WDAppelContexte.getContexte().m2690A();
    }

    public static final WDObjet getValeurRenvoyeeTacheParallelePrecedente() {
        return new C0676j();
    }

    /* renamed from: m */
    private final void m2686m() {
        this.f1673q = true;
    }

    /* renamed from: w */
    private final void m2687w() {
        if (this.f1673q) {
            if (this.f1664a) {
                lc.m4068a();
            }
            this.f1673q = false;
        }
    }

    /* renamed from: z */
    private static String m2688z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = C0607n.Hn;
                    break;
                case 1:
                    i2 = 68;
                    break;
                case 2:
                    i2 = 18;
                    break;
                case 3:
                    i2 = 110;
                    break;
                default:
                    i2 = 76;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m2689z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 76);
        }
        return toCharArray;
    }

    /* renamed from: A */
    public C0489p m2690A() {
        C0489p o = m2728o();
        if (o == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f1663z[5], new String[0]));
        }
        return o.getMonParent();
    }

    /* renamed from: a */
    public final C0671c m2691a(int i) {
        return !this.f1672m.isEmpty() ? i <= 0 ? (C0671c) this.f1672m.getFirst() : i >= this.f1672m.size() + -1 ? (C0671c) this.f1672m.getLast() : (C0671c) this.f1672m.get(i) : null;
    }

    /* renamed from: a */
    public String m2692a(int i, boolean z) {
        int max = Math.max(0, i);
        if (max >= this.f1672m.size()) {
            return "";
        }
        C0671c c0671c = (C0671c) this.f1672m.get(max);
        return m2684a(c0671c, m2683a(c0671c, max), z);
    }

    /* renamed from: a */
    public void mo2567a() {
        Iterator it;
        if (this.f1672m != null) {
            it = this.f1672m.iterator();
            while (it.hasNext()) {
                ((C0671c) it.next()).mo2568c();
            }
            this.f1672m.clear();
            this.f1672m = null;
        }
        if (this.f1675t != null) {
            it = this.f1675t.iterator();
            while (it.hasNext()) {
                IWDParcours iWDParcours = (IWDParcours) it.next();
                if (iWDParcours != null) {
                    iWDParcours.release();
                }
            }
            this.f1675t.clear();
            this.f1675t = null;
        }
        this.f1669j = null;
        this.f1666f = null;
    }

    /* renamed from: a */
    public void m2694a(WDProcedureInterne wDProcedureInterne) {
        if (this.f1664a) {
            lc.m4068a();
        }
        C0671c c0671c = new C0671c(10, m2728o());
        c0671c.f1689f = wDProcedureInterne.getNom();
        this.f1672m.addFirst(c0671c);
    }

    /* renamed from: a */
    public final void m2695a(WDErreurNonFatale wDErreurNonFatale) {
        this.f1669j = wDErreurNonFatale;
        this.f1674r = true;
        kb.m3968b(wDErreurNonFatale.getMessage());
    }

    /* renamed from: a */
    public void m2696a(IWDParcours iWDParcours) {
        if (this.f1675t == null) {
            this.f1675t = new LinkedList();
        }
        this.f1675t.addFirst(iWDParcours);
    }

    /* renamed from: a */
    public final void m2697a(C0508h c0508h) {
        this.f1666f = c0508h;
    }

    /* renamed from: a */
    public void m2698a(Runnable runnable) {
        if (!this.f1672m.isEmpty()) {
            ((C0671c) this.f1672m.getFirst()).m2765a(runnable);
        }
    }

    /* renamed from: a */
    public void m2699a(String str) {
        if (this.f1664a) {
            lc.m4068a();
        }
        C0671c c0671c = new C0671c(9, null);
        c0671c.f1689f = str;
        this.f1672m.addFirst(c0671c);
    }

    /* renamed from: a */
    public void m2700a(String str, WDObjet wDObjet) {
        C0672d c0672d = new C0672d(C0607n.le, null);
        c0672d.f = str;
        C0672d.access$002(c0672d, wDObjet);
        C0672d.access$102(c0672d, str);
        this.f1672m.addFirst(c0672d);
    }

    /* renamed from: a */
    public void m2701a(String str, WDObjet wDObjet, String str2) {
        m2685a(C0607n.od, str, wDObjet, str2);
    }

    /* renamed from: a */
    public void m2702a(String str, C0489p c0489p) {
        if (this.f1664a) {
            lc.m4068a();
        }
        C0671c c0671c = new C0671c(10, c0489p);
        c0671c.f1689f = str;
        this.f1672m.addFirst(c0671c);
    }

    /* renamed from: a */
    public void m2703a(String str, boolean z, boolean z2) {
        if (this.f1664a) {
            lc.m4068a();
        }
        this.f1665d = str;
        this.f1674r = false;
        this.f1667h = z2;
        if (z) {
            m2686m();
        }
    }

    /* renamed from: a */
    public final boolean m2704a(int i, C0489p c0489p) {
        if (!this.f1672m.isEmpty()) {
            int size = this.f1672m.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0671c c0671c = (C0671c) this.f1672m.get(i2);
                if (c0671c.f1687d == i && (c0489p == null || c0671c.f1686c == c0489p)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m2705a(int i, Thread thread) {
        this.f1664a = true;
        if (!this.f1673q) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (i <= 0) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                return false;
            }
        }
        thread.join((long) i);
        if (i > 0) {
            try {
                if (System.currentTimeMillis() - currentTimeMillis >= ((long) i)) {
                    return false;
                }
            } catch (InterruptedException e2) {
                throw e2;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m2706a(WDErreurNonFatale wDErreurNonFatale, int i) {
        if (i < this.f1672m.size()) {
            C0671c c0671c = (C0671c) this.f1672m.get(i);
            try {
                if (c0671c.f1684a != null) {
                    if (c0671c.f1684a.mo2569a() == 5 || c0671c.f1684a.mo2569a() == 6) {
                        try {
                            wDErreurNonFatale.m2892a(i);
                            c0671c.f1684a.mo2570a(wDErreurNonFatale);
                        } catch (WDErreurNonFatale e) {
                            int i2 = i + 1;
                            try {
                                if (i2 < this.f1672m.size()) {
                                    m2706a(wDErreurNonFatale, i2);
                                }
                            } catch (WDErreurNonFatale e2) {
                                throw e2;
                            }
                        }
                        if (i == 0) {
                            try {
                                throw wDErreurNonFatale;
                            } catch (WDErreurNonFatale e22) {
                                throw e22;
                            }
                        }
                    }
                    C0673b c0673b = c0671c.f1684a;
                    try {
                        if (c0673b.mo2569a() == 0) {
                            c0671c.f1684a = null;
                        }
                        c0673b.mo2570a(wDErreurNonFatale);
                    } catch (WDErreurNonFatale e222) {
                        throw e222;
                    }
                    return true;
                }
            } catch (WDErreurNonFatale e2222) {
                throw e2222;
            } catch (WDErreurNonFatale e22222) {
                throw e22222;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean m2707a(boolean z) {
        boolean z2 = this.f1674r;
        if (z) {
            this.f1674r = false;
        }
        return z2;
    }

    public void activerGestionAutoErreurNonFatale(int i, Object obj) throws WDErreurNonFatale {
        if (!this.f1672m.isEmpty()) {
            C0671c c0671c = (C0671c) this.f1672m.getFirst();
            c0671c.f1684a = new C0674e(this, i, obj, c0671c);
        }
    }

    /* renamed from: b */
    public final WDProcedureInterne m2708b(String str) {
        C0671c l = m2726l();
        if (!(l == null || C0671c.access$400(l) == null)) {
            for (WDProcedureInterne wDProcedureInterne : C0671c.access$400(l)) {
                if (C0808l.m4042c(wDProcedureInterne.getNom(), str, 20) == 0) {
                    return wDProcedureInterne;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public String m2709b() {
        String str = "";
        if (!this.f1672m.isEmpty()) {
            C0671c c0671c = (C0671c) this.f1672m.getFirst();
            if (c0671c instanceof C0672d) {
                return C0672d.access$100((C0672d) c0671c);
            }
        }
        return str;
    }

    /* renamed from: b */
    public String m2710b(int i) {
        int max = Math.max(0, i);
        if (max >= this.f1672m.size()) {
            return "";
        }
        C0671c c0671c = (C0671c) this.f1672m.get(max);
        switch (c0671c.f1687d) {
            case 9:
            case 10:
                return C0735q.m3133h(c0671c.f1689f);
            case C0607n.Gl /*1119*/:
                return C0735q.m3133h(c0671c.f1689f);
            case C0607n.le /*1120*/:
                return c0671c.f1689f + "." + C0745b.m3224c(f1663z[89], new String[0]);
            case C0607n.Ki /*1121*/:
                return c0671c.f1689f + "." + C0745b.m3224c(f1663z[90], new String[0]);
            case C0607n.od /*1151*/:
            case C0607n.Ks /*1152*/:
                return C0735q.m3131f(c0671c.f1689f);
            default:
                C0489p a = m2683a(c0671c, max);
                String str = "";
                return a != null ? a.getNomComplet().getString() : WDProjet.getInstance().getNom();
        }
    }

    /* renamed from: b */
    public void m2711b(Runnable runnable) {
        if (!this.f1672m.isEmpty()) {
            int i = 0;
            int size = this.f1672m.size();
            while (i < size) {
                int i2 = i + 1;
                C0671c c0671c = (C0671c) this.f1672m.get(i);
                switch (c0671c.m2766b()) {
                    case 9:
                    case 10:
                    case C0607n.Gl /*1119*/:
                    case C0607n.le /*1120*/:
                    case C0607n.Ki /*1121*/:
                    case C0607n.od /*1151*/:
                    case C0607n.Ks /*1152*/:
                        i = i2;
                    default:
                        c0671c.m2765a(runnable);
                        return;
                }
            }
        }
    }

    /* renamed from: b */
    public void m2712b(String str, WDObjet wDObjet) {
        C0672d c0672d = new C0672d(C0607n.Ki, null);
        c0672d.f = str;
        C0672d.access$002(c0672d, wDObjet);
        C0672d.access$102(c0672d, str);
        this.f1672m.addFirst(c0672d);
    }

    /* renamed from: b */
    public void m2713b(String str, WDObjet wDObjet, String str2) {
        m2685a(C0607n.Ks, str, wDObjet, str2);
    }

    /* renamed from: b */
    public boolean m2714b(int i, C0489p c0489p) {
        if (this.f1672m.isEmpty()) {
            return false;
        }
        C0671c c0671c = (C0671c) this.f1672m.getFirst();
        return c0671c.f1687d == i && c0671c.f1686c == c0489p;
    }

    /* renamed from: c */
    public void m2715c(int i, C0489p c0489p) {
        this.f1672m.addFirst(new C0671c(i, c0489p));
    }

    /* renamed from: c */
    public void m2716c(String str, WDObjet wDObjet, String str2) {
        m2685a(C0607n.Gl, str, wDObjet, str2);
    }

    /* renamed from: c */
    public final boolean m2717c() {
        return this.f1667h;
    }

    /* renamed from: d */
    public final C0508h m2718d() {
        return this.f1666f;
    }

    public final void declarerProcedureInterne(WDProcedureInterne wDProcedureInterne) {
        C0671c l = m2726l();
        C0691a.m2860a(l != null, f1663z[13]);
        if (l != null) {
            if (C0671c.access$400(l) == null) {
                C0671c.access$402(l, new LinkedList());
            }
            C0671c.access$400(l).add(wDProcedureInterne);
        }
    }

    /* renamed from: e */
    public boolean m2719e() {
        return this.f1672m.isEmpty();
    }

    /* renamed from: f */
    public IWDParcours m2720f() {
        return (this.f1675t == null || this.f1675t.isEmpty()) ? null : (IWDParcours) this.f1675t.removeFirst();
    }

    /* renamed from: g */
    public WDObjet m2721g() {
        if (!this.f1672m.isEmpty()) {
            C0671c c0671c = (C0671c) this.f1672m.getFirst();
            if (c0671c instanceof C0672d) {
                return C0672d.access$000((C0672d) c0671c);
            }
        }
        return null;
    }

    public final WDObjet getParametreSuivant() {
        if (this.f1668i != null) {
            WDTuple wDTuple = (WDTuple) this.f1668i.get();
            if (wDTuple != null) {
                try {
                    int i = this.f1671l + 1;
                    this.f1671l = i;
                    WDObjet elementAt = wDTuple.getElementAt(i);
                    return elementAt;
                } finally {
                    if (this.f1671l >= wDTuple.getElementCount() - 1) {
                        this.f1668i.clear();
                        this.f1668i = null;
                        this.f1671l = 0;
                    }
                }
            } else if (this.f1671l >= wDTuple.getElementCount() - 1) {
                this.f1668i.clear();
                this.f1668i = null;
                this.f1671l = 0;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1663z[6], new String[0]));
        return null;
    }

    public final WDObjet getPremierParametre(WDObjet wDObjet) {
        WDTuple wDTuple = (WDTuple) wDObjet.checkType(WDTuple.class);
        if (wDTuple != null) {
            this.f1668i = new WeakReference(wDTuple);
            this.f1671l = 0;
            return wDTuple.getElementAt(this.f1671l);
        }
        WDErreurManager.m2883a(C0745b.m3222b(f1663z[6], new String[0]));
        return null;
    }

    /* renamed from: h */
    public <T extends C0508h> T m2722h() {
        C0489p o = m2728o();
        return o == null ? null : o.isFenetre() ? (C0508h) o : o.getFenetreMere();
    }

    /* renamed from: i */
    public final boolean m2723i() {
        return !this.f1665d.equals("");
    }

    /* renamed from: j */
    public final String m2724j() {
        return this.f1665d;
    }

    /* renamed from: k */
    public String m2725k() {
        StringBuffer stringBuffer = new StringBuffer();
        int size = this.f1672m.size();
        if (size == 0) {
            stringBuffer.append(C0745b.m3224c(f1663z[8], WDProjet.getInstance().getNom()));
        } else {
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    stringBuffer.append(f1663z[9]);
                }
                stringBuffer.append(m2692a(i, false));
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: l */
    public C0671c m2726l() {
        return !this.f1672m.isEmpty() ? (C0671c) this.f1672m.getFirst() : null;
    }

    /* renamed from: n */
    public final void m2727n() {
        this.f1670k = false;
    }

    /* renamed from: o */
    public C0489p m2728o() {
        return !this.f1672m.isEmpty() ? m2683a((C0671c) this.f1672m.getFirst(), 0) : null;
    }

    /* renamed from: p */
    public String m2729p() {
        C0671c l = m2726l();
        if (l != null) {
            return m2684a(l, m2728o(), false);
        }
        return C0745b.m3224c(f1663z[8], WDProjet.getInstance().getNom());
    }

    /* renamed from: q */
    public final String m2730q() {
        if (!this.f1672m.isEmpty()) {
            int i = 0;
            int size = this.f1672m.size();
            while (i < size) {
                int i2 = i + 1;
                C0671c c0671c = (C0671c) this.f1672m.get(i);
                switch (c0671c.m2766b()) {
                    case 9:
                    case 10:
                    case C0607n.Gl /*1119*/:
                        return c0671c.f1689f;
                    default:
                        i = i2;
                }
            }
        }
        return null;
    }

    /* renamed from: r */
    public String m2731r() {
        return !this.f1665d.equals("") ? C0745b.m3221b(this.f1665d) : "";
    }

    /* renamed from: s */
    public final WDErreurNonFatale m2732s() {
        return this.f1669j;
    }

    /* renamed from: t */
    public final boolean m2733t() {
        return this.f1670k;
    }

    /* renamed from: u */
    public WDObjet m2734u() {
        C0489p o = m2728o();
        if (o == null) {
            WDErreurManager.m2883a(C0745b.m3222b(f1663z[5], new String[0]));
        }
        return (WDObjet) o.getMaSource();
    }

    /* renamed from: v */
    public void m2735v() {
        this.f1665d = "";
        this.f1667h = false;
        m2687w();
    }

    /* renamed from: x */
    public void m2736x() {
        if (!this.f1672m.isEmpty()) {
            try {
                C0671c c0671c = (C0671c) this.f1672m.getFirst();
                if (c0671c.m2766b() == C0607n.le && (c0671c instanceof C0672d)) {
                    WDObjet access$000 = C0672d.access$000((C0672d) c0671c);
                    if (access$000 != null && (access$000 instanceof C0507r)) {
                        ((C0507r) access$000).runAutoProc();
                    }
                }
                if (!(C0671c.access$200(c0671c) == null || C0671c.access$200(c0671c).isEmpty())) {
                    Iterator it = C0671c.access$200(c0671c).iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                if (!C0671c.access$300(c0671c) && hc.m3945c()) {
                    C0857z b = hc.m3944b();
                    if ((b.getOptions() & 1) == 0) {
                        b.destroy();
                    }
                }
                ((C0671c) this.f1672m.removeFirst()).mo2568c();
            } catch (Throwable th) {
                Throwable th2 = th;
                ((C0671c) this.f1672m.removeFirst()).mo2568c();
            }
        }
    }

    /* renamed from: y */
    public IWDParcours m2737y() {
        return (this.f1675t == null || this.f1675t.isEmpty()) ? null : (IWDParcours) this.f1675t.getFirst();
    }

    /* renamed from: z */
    public int m2738z() {
        return this.f1672m.size();
    }
}
