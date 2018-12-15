package fr.pcsoft.wdjava.media;

import android.graphics.Rect;
import android.hardware.Camera;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import android.media.MediaRecorder;
import android.view.OrientationEventListener;
import android.view.SurfaceHolder;
import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0653m;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.utils.C0806j;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.ic;
import fr.pcsoft.wdjava.core.utils.jc;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.geo.WDGeoPosition;
import fr.pcsoft.wdjava.p061q.p062a.C1014a;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import fr.pcsoft.wdjava.ui.utils.C1521w;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: fr.pcsoft.wdjava.media.s */
public class C0957s {
    /* renamed from: A */
    private static final String f2610A = C0957s.m6871z(C0957s.m6872z("\u0007\u001c\u0014KY\u0005\u0010ZLE\r\u0010"));
    private static final String Ab = C0957s.m6871z(C0957s.m6872z("\u001e\u001b\u0011VB\u001e\u0001\u000e"));
    /* renamed from: B */
    private static final C0957s f2611B;
    private static final String Bb = C0957s.m6871z(C0957s.m6872z("\u0019\u001c\u0010WXZ\u0005\u0018MX\u0005\u0014\u001eK"));
    private static final String Cb = C0957s.m6871z(C0957s.m6872z("\u0007\u001a\u0005K^\u0016\u001c\u0003"));
    /* renamed from: D */
    private static final String f2612D = C0957s.m6871z(C0957s.m6872z("\r\u001a\u0018R\u0001\u0005\u0014\u0003VC\u0004"));
    private static final String Db = C0957s.m6871z(C0957s.m6872z("\u0010\u0010\u0018OC\u0004\u001c\u0003VC\u0019"));
    /* renamed from: E */
    private static final String f2613E = C0957s.m6871z(C0957s.m6872z("\u0005\u0010\u0013\u0012I\u000e\u0010"));
    protected static final String Eb = C0957s.m6871z(C0957s.m6872z("\u0014\u0014\u001aZ^\u0016X\u0011MC\u0019\u0001"));
    /* renamed from: F */
    private static final String f2614F = C0957s.m6871z(C0957s.m6872z("\u0005\u001a\u0003^X\u001e\u001a\u0019"));
    private static final String Fb = C0957s.m6871z(C0957s.m6872z("\u0005\u001a\u0003^X\u001e\u001a\u0019\u0012M\u0002\u0001\u0018"));
    /* renamed from: G */
    private static final String f2615G = C0957s.m6871z(C0957s.m6872z("\u001b\u0014\u0019[_\u0014\u0014\u0007Z"));
    private static final String Gb = C0957s.m6871z(C0957s.m6872z("\u0018\u001b"));
    /* renamed from: H */
    private static final String f2616H = C0957s.m6871z(C0957s.m6872z("\u0004\u001b\u0018H"));
    private static final String[] Hb;
    /* renamed from: I */
    private static final String f2617I = C0957s.m6871z(C0957s.m6872z("\u0010\u0005\u0004\u0012@\u0016\u0001\u001eKY\u0013\u0010"));
    /* renamed from: J */
    protected static final String f2618J = C0957s.m6871z(C0957s.m6872z("\u0014\u0014\u001aZ^\u0016X\u0015^O\u001c"));
    /* renamed from: K */
    private static final String f2619K = C0957s.m6871z(C0957s.m6872z("\u0016\u001b\u0003VN\u0016\u001b\u0013VB\u0010"));
    /* renamed from: L */
    private static final String f2620L = C0957s.m6871z(C0957s.m6872z("\r\u001a\u0018R"));
    /* renamed from: M */
    private static final String f2621M = C0957s.m6871z(C0957s.m6872z("\u0010\u0005\u0004\u0012M\u001b\u0001\u001eKY\u0013\u0010"));
    /* renamed from: N */
    protected static final String f2622N = C0957s.m6871z(C0957s.m6872z("\u0014\u0014\u001aZ^\u0016"));
    /* renamed from: O */
    private static final String f2623O = C0957s.m6871z(C0957s.m6872z("\u0004\u001d\u0016[I"));
    /* renamed from: P */
    private static final String f2624P = C0957s.m6871z(C0957s.m6872z("\u001a\u001a\u0019P"));
    /* renamed from: Q */
    private static final String f2625Q = C0957s.m6871z(C0957s.m6872z("\u0012\u0013\u0011ZO\u0003"));
    /* renamed from: R */
    private static final String f2626R = C0957s.m6871z(C0957s.m6872z("\u0018\u0013\u0011"));
    /* renamed from: S */
    private static final String f2627S = C0957s.m6871z(C0957s.m6872z("\u0013\u0014\u000eSE\u0010\u001d\u0003"));
    /* renamed from: T */
    private static final String f2628T = C0957s.m6871z(C0957s.m6872z("\r\u001a\u0018R\u0001\u0004\u0000\u0007OC\u0005\u0001\u0012["));
    /* renamed from: U */
    private static final String f2629U = C0957s.m6871z(C0957s.m6872z("\u0003\u001a\u0005\\D"));
    /* renamed from: V */
    private static final String f2630V = C0957s.m6871z(C0957s.m6872z("\u0004\u0001\u0012^H\u000e\u0005\u001fPX\u0018"));
    /* renamed from: W */
    private static final String f2631W = C0957s.m6871z(C0957s.m6872z("\u0016\u0000\u0003P"));
    /* renamed from: X */
    private static final String f2632X = C0957s.m6871z(C0957s.m6872z("AE\u001fE"));
    /* renamed from: Y */
    private static final String f2633Y = C0957s.m6871z(C0957s.m6872z("\u0019\u0010\u0010^X\u001e\u0003\u0012"));
    /* renamed from: Z */
    private static final String f2634Z = C0957s.m6871z(C0957s.m6872z("\u001a\u0014\u0014MC"));
    /* renamed from: a */
    public static final String f2635a = C0957s.m6871z(C0957s.m6872z("\u0014\u001a\u0019KE\u0019\u0000\u0018J_Z\u0003\u001e[I\u0018"));
    /* renamed from: b */
    private static final String f2636b = C0957s.m6871z(C0957s.m6872z("\u0004\u0005\u0018MX\u0004"));
    private static final String bb = C0957s.m6871z(C0957s.m6872z("\u0016\u0000\u0003P"));
    /* renamed from: d */
    private static final String f2637d = C0957s.m6871z(C0957s.m6872z("\u0000\u0014\u0005R\u0001\u0011\u0019\u0002P^\u0012\u0006\u0014ZB\u0003"));
    private static final String db = C0957s.m6871z(C0957s.m6872z("\u0011\u0019\u0002P^\u0012\u0006\u0014ZB\u0003"));
    /* renamed from: e */
    public static final String f2638e = C0957s.m6871z(C0957s.m6872z("\u0014\u001a\u0019KE\u0019\u0000\u0018J_Z\u0005\u001e\\X\u0002\u0007\u0012"));
    private static final String eb = C0957s.m6871z(C0957s.m6872z("\u0000\u001d\u001eKI\u0015\u0014\u001b^B\u0014\u0010"));
    /* renamed from: f */
    private static final String f2639f = C0957s.m6871z(C0957s.m6872z("\u0016\u0004\u0002^"));
    /* renamed from: g */
    private static final String f2640g = C0957s.m6871z(C0957s.m6872z("\u0007\u0014\u0005KU"));
    private static final String gb = C0957s.m6871z(C0957s.m6872z("\u0019\u001c\u0010WX"));
    /* renamed from: i */
    private static final String f2641i = C0957s.m6871z(C0957s.m6872z("\u0014\u0014\u0019[@\u0012\u0019\u001eXD\u0003"));
    private static final String ib = C0957s.m6871z(C0957s.m6872z("\u0011\u001c\u0005Z[\u0018\u0007\u001cL"));
    /* renamed from: j */
    private static final String f2642j = C0957s.m6871z(C0957s.m6872z("\u001d\u0005\u0012X\u0001\u0006\u0000\u0016SE\u0003\f"));
    private static final String jb = C0957s.m6871z(C0957s.m6872z("Z\u0003\u0016SY\u0012\u0006"));
    /* renamed from: k */
    private static final String f2643k = C0957s.m6871z(C0957s.m6872z("\u0004\u0000\u0019LI\u0003"));
    private static final int kb = 0;
    /* renamed from: l */
    private static final String f2644l = C0957s.m6871z(C0957s.m6872z("\u0016\u0000\u0003P"));
    private static final String lb = C0957s.m6871z(C0957s.m6872z("\u0015\u0014\u0005\\C\u0013\u0010"));
    /* renamed from: m */
    private static final String f2645m = C0957s.m6871z(C0957s.m6872z("\u0016\u0016\u0003VC\u0019"));
    private static final String mb = C0957s.m6871z(C0957s.m6872z("\u0010\u0005\u0004\u0012@\u0018\u001b\u0010VX\u0002\u0011\u0012"));
    /* renamed from: n */
    private static final String f2646n = C0957s.m6871z(C0957s.m6872z("\u0003\u001d\u0012^X\u0005\u0010"));
    private static final String nb = C0957s.m6871z(C0957s.m6872z("\u0012\u0011\u0018Y"));
    /* renamed from: o */
    public static final String f2647o = C0957s.m6871z(C0957s.m6872z("\u0011\u001a\u0014J_Z\u0018\u0018[I"));
    private static final String ob = C0957s.m6871z(C0957s.m6872z("\u0019\u001a\u0019Z"));
    /* renamed from: p */
    private static final String f2648p = C0957s.m6871z(C0957s.m6872z("\u0007\u001a\u0004KI\u0005\u001c\rZ"));
    /* renamed from: q */
    private static final String f2649q = C0957s.m6871z(C0957s.m6872z("\u0011\u001c\u000fZH"));
    private static final String qb = C0957s.m6871z(C0957s.m6872z("\u0003\u0002\u001eSE\u0010\u001d\u0003"));
    private static final String rb = C0957s.m6871z(C0957s.m6872z("\u0014\u0019\u0018JH\u000eX\u0013^U\u001b\u001c\u0010WX"));
    /* renamed from: s */
    private static final String f2650s = C0957s.m6871z(C0957s.m6872z("\u0004\u001a\u001b^^\u001e\u000f\u0012"));
    private static final String sb = C0957s.m6871z(C0957s.m6872z("\u0004\u0010\u0007VM"));
    /* renamed from: t */
    private static final String f2651t = C0957s.m6871z(C0957s.m6872z("\u001e\u001b\u0014^B\u0013\u0010\u0004\\I\u0019\u0001"));
    private static final String tb = C0957s.m6871z(C0957s.m6872z("\u0015\u0010\u0016\\D"));
    /* renamed from: u */
    private static final String f2652u = C0957s.m6871z(C0957s.m6872z("\u0016\u0000\u0003P"));
    private static final String ub = C0957s.m6871z(C0957s.m6872z("\u0010\u0005\u0004\u0012X\u001e\u0018\u0012LX\u0016\u0018\u0007"));
    /* renamed from: v */
    private static final String f2653v = C0957s.m6871z(C0957s.m6872z("\u0016\u0000\u0003P"));
    private static final String vb = C0957s.m6871z(C0957s.m6872z("\u0011\u0019\u0016LDZ\u0018\u0018[I"));
    /* renamed from: w */
    private static final String f2654w = C0957s.m6871z(C0957s.m6872z("\u0004\u0016\u0012QIZ\u0018\u0018[I"));
    private static final String wb = C0957s.m6871z(C0957s.m6872z("BE\u001fE"));
    private static final String xb = C0957s.m6871z(C0957s.m6872z("\u0016\u0000\u0003P"));
    /* renamed from: y */
    private static final String f2655y = C0957s.m6871z(C0957s.m6872z("\u0018\u0013\u0011"));
    private static final String yb = C0957s.m6871z(C0957s.m6872z("\u001e\u0006\u0018"));
    private static final String zb = C0957s.m6871z(C0957s.m6872z("Z\u0003\u0016SY\u0012"));
    /* renamed from: C */
    protected int f2656C = 0;
    protected LinkedList<C0949k> ab = null;
    /* renamed from: c */
    private OrientationEventListener f2657c = null;
    private MediaRecorder cb = null;
    private boolean fb = false;
    /* renamed from: h */
    protected int f2658h = -1;
    private boolean hb = true;
    private boolean pb = false;
    /* renamed from: r */
    protected Camera f2659r = null;
    /* renamed from: x */
    private Parameters f2660x = null;
    /* renamed from: z */
    protected int f2661z = -1;

    static {
        String[] strArr = new String[24];
        strArr[0] = C0957s.m6871z(C0957s.m6872z("T%8le#<8qs>;!~`>12"));
        strArr[1] = C0957s.m6871z(C0957s.m6872z("T0%mi\"'(~|'9>|m#<8qs'4%~a(66ri%4"));
        strArr[2] = C0957s.m6871z(C0957s.m6872z("T66ri%4(im;0\"ms'4%~a(;8qs$ 'oc%!2"));
        strArr[3] = C0957s.m6871z(C0957s.m6872z("FEG"));
        strArr[4] = C0957s.m6871z(C0957s.m6872z("z"));
        strArr[5] = C0957s.m6871z(C0957s.m6872z("F|\u0014^A\u0012\u0007\u0016\u0012N\u0016\u0016\u001c"));
        strArr[6] = C0957s.m6871z(C0957s.m6872z("\u0007\u0007\u0012IE\u0012\u0002ZLE\r\u0010ZIM\u001b\u0000\u0012"));
        strArr[7] = C0957s.m6871z(C0957s.m6872z("\u0007\u0007\u0012IE\u0012\u0002ZLE\r\u0010ZIM\u001b\u0000\u0012L"));
        strArr[8] = C0957s.m6871z(C0957s.m6872z("6\u0007\u0005ÕXW\u0005\u0005ÖA\u0016\u0001\u0002MÅW\u0011\u0012\u001f@P\u0010\u0019MI\u0010\u001c\u0004K^\u0012\u0018\u0012QXW\u0011\u0012\u001f@\u0016U\u0001VH\u001aY"));
        strArr[9] = C0957s.m6871z(C0957s.m6872z("6\u0007\u0005ÕXW\u0011\u0012\u001f@P\u0010\u0019MI\u0010\u001c\u0004K^\u0012\u0018\u0012QXW\u0011\u0012\u001f@\u0016U\u0001VH\u001aW^@\u0018\u0007\u0004\u001f]\u0002R\u001eS\f\u0019R\u0016\u001f\\\u0016\u0006W[Å\u0015\u0000\u0003Ö\u0002"));
        strArr[10] = C0957s.m6871z(C0957s.m6872z(">\u0018\u0007P_\u0004\u001c\u0015SIW\u0011\u0012\u001f^\u0016\u0002OÅ\u0005\u0010\u0005\u001f@\u0012\u0006WOM\u0005\u0014\u001a×X\u0005\u0010\u0004\u001fH\u0012U\u001b^\f\u0014\u0014\u001aÖ^\u0016"));
        strArr[11] = C0957s.m6871z(C0957s.m6872z("T66ri%4(qc9*3v':"));
        strArr[12] = C0957s.m6871z(C0957s.m6872z("\u0004\u0010\u0003{E\u0004\u0005\u001b^U8\u0007\u001eZB\u0003\u0014\u0003VC\u0019"));
        strArr[13] = C0957s.m6871z(C0957s.m6872z(">\u0018\u0007P_\u0004\u001c\u0015SIW\u0011\u0012\u001fJ\u001e\u0016\u001fVI\u0005U\u001b\u0018C\u0005\u001c\u0012QX\u0016\u0001\u001ePBW\u0011\u0012\u001f@\u0016U\u0007MÅ\u0001\u001c\u0004JM\u001b\u001c\u0004^X\u001e\u001a\u0019\u0011"));
        strArr[14] = C0957s.m6871z(C0957s.m6872z("T0%ms>;3vo2*4~a2'6"));
        strArr[15] = C0957s.m6871z(C0957s.m6872z("T66ri%4(om%4:`b8;(ly'%8mx2"));
        strArr[16] = C0957s.m6871z(C0957s.m6872z("T0%ms2;%zk>&#mi:09ks!<3zc"));
        strArr[17] = C0957s.m6871z(C0957s.m6872z("!\u0014\u001bZY\u0005U\u0013Z\f\r\u001a\u0018R\f\u001e\u001b\u0001^@\u001e\u0011\u0012"));
        strArr[18] = C0957s.m6871z(C0957s.m6872z(">\u001b\u0013VO\u0012U\u0013Z\f\u0014\u0014\u001aÖ^\u0016U\u0019PBW\u0006\u0002O\\\u0018\u0007\u0003Ö\f\u0013\u0014\u0019L\f\u0014\u0010\u0003KIW\u001c\u001aO@\u0018\u0012QX\u0016\u0001\u001ePBY"));
        strArr[19] = C0957s.m6871z(C0957s.m6872z("'\u0014\u0005^A\u0001\u0005^K\u0012U\u0013Z\f\u001bR\u0018ME\u0012\u001b\u0003^X\u001e\u001a\u0019\u001fB\u0018\u001bWO^\u001e\u0006WZBW\u0016\u001f^^\u0010\u0010Y"));
        strArr[20] = C0957s.m6871z(C0957s.m6872z("T0%ms2;%zk>&#mi:09ks'=8kc"));
        strArr[21] = C0957s.m6871z(C0957s.m6872z("\u0016\u001b\u0013MC\u001e\u0011YOI\u0005\u0018\u001eL_\u001e\u001a\u0019\u0011~243`i/!2mb69(lx8'6xi"));
        strArr[22] = C0957s.m6871z(C0957s.m6872z("\u0016\u001b\u0013MC\u001e\u0011YOI\u0005\u0018\u001eL_\u001e\u001a\u0019\u0011{%<#zs2-#z~94;`#:%~k2"));
        strArr[23] = C0957s.m6871z(C0957s.m6872z("\u0016\u001b\u0013MC\u001e\u0011YOI\u0005\u0018\u001eL_\u001e\u001a\u0019\u0011o682mm"));
        Hb = strArr;
        try {
            if (kb.m3986p() >= C0657a.GINGERBREAD.getNumero()) {
                f2611B = new C0958t();
            } else {
                f2611B = new C0957s();
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    protected C0957s() {
        WDProjet.getInstance().ajouterEcouteurProjet(new C0942d(this));
    }

    /* renamed from: a */
    private C1521w m6864a(int i, int i2) {
        C1521w c1521w = new C1521w(i, i2);
        Object obj = i < i2 ? 1 : null;
        Parameters n = m6899n();
        String str = n.get(Hb[7]);
        if (str == null) {
            str = n.get(Hb[6]);
        }
        if (str != null) {
            String[] j = C0808l.m4052j(str);
            int i3 = Integer.MAX_VALUE;
            for (String trim : j) {
                String trim2 = trim2.trim();
                int indexOf = trim2.indexOf(C0607n.co);
                if (indexOf >= 0) {
                    try {
                        int parseInt = Integer.parseInt(trim2.substring(0, indexOf));
                        indexOf = Integer.parseInt(trim2.substring(indexOf + 1));
                        int abs;
                        if (parseInt > i || indexOf > i2) {
                            abs = obj == (indexOf <= parseInt ? 1 : null) ? Math.abs(parseInt - i2) + Math.abs(indexOf - i) : Math.abs(parseInt - i) + Math.abs(indexOf - i2);
                            if (abs == 0) {
                                try {
                                    c1521w.f4666a = obj == null ? i2 : i;
                                    if (obj == null) {
                                        i = i2;
                                    }
                                    c1521w.f4667b = i;
                                } catch (NumberFormatException e) {
                                    throw e;
                                }
                            } else if (abs < i3) {
                                c1521w.f4666a = parseInt;
                                c1521w.f4667b = indexOf;
                                i3 = abs;
                            }
                        } else {
                            if (indexOf <= parseInt) {
                            }
                            if (obj == (indexOf <= parseInt ? 1 : null)) {
                            }
                            if (abs == 0) {
                                if (obj == null) {
                                }
                                c1521w.f4666a = obj == null ? i2 : i;
                                if (obj == null) {
                                    i = i2;
                                }
                                c1521w.f4667b = i;
                            } else if (abs < i3) {
                                c1521w.f4666a = parseInt;
                                c1521w.f4667b = indexOf;
                                i3 = abs;
                            }
                        }
                    } catch (NumberFormatException e2) {
                    }
                }
            }
        }
        return c1521w;
    }

    /* renamed from: a */
    private final String m6865a(String str, Parameters parameters) throws ib {
        String str2 = "";
        try {
            if (!str.equals(f2620L)) {
                str2 = parameters.get(str + jb);
                if (str2 == null) {
                    str2 = parameters.get(str + zb);
                }
            } else if (m6867a(parameters)) {
                str2 = parameters.get(f2612D);
            }
            if (str2 != null) {
                return str2 != null ? str2 : "";
            } else {
                try {
                    throw new ib(C0745b.m3222b(Hb[15], str));
                } catch (ib e) {
                    throw e;
                }
            }
        } catch (ib e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    private final String m6866a(String str, String str2, Parameters parameters) throws ib {
        String a = m6865a(str, parameters);
        if (!a.equals("")) {
            String[] j = C0808l.m4052j(a);
            int length = j.length;
            int i = 0;
            while (i < length) {
                try {
                    if (j[i].equalsIgnoreCase(str2)) {
                        return str.equals(f2620L) ? Integer.toString(i) : j[i];
                    } else {
                        i++;
                    }
                } catch (ib e) {
                    throw e;
                } catch (ib e2) {
                    throw e2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private final boolean m6867a(Parameters parameters) {
        String str = parameters.get(f2628T);
        if (str == null) {
            return false;
        }
        try {
            return str.equals(Boolean.TRUE.toString());
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: b */
    private final boolean m6868b(Parameters parameters) {
        String str = parameters.get(f2647o);
        if (str == null) {
            return false;
        }
        try {
            return str.equals(f2631W);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: c */
    public static final C0957s m6869c() {
        return f2611B;
    }

    /* renamed from: l */
    private final synchronized void m6870l() {
        try {
            if (this.cb != null) {
                m6877a(this.cb, null);
            }
            m6900o();
        } catch (NumberFormatException e) {
            throw e;
        }
        return;
    }

    /* renamed from: z */
    private static String m6871z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 119;
                    break;
                case 1:
                    i2 = 117;
                    break;
                case 2:
                    i2 = 119;
                    break;
                case 3:
                    i2 = 63;
                    break;
                default:
                    i2 = 44;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6872z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 44);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final WDObjet m6873a(String str) throws ib {
        double d = 0.0d;
        try {
            if (str.equals(f2622N)) {
                return new WDEntier4(this.f2658h + 1);
            }
            m6894h();
            Parameters n = m6899n();
            try {
                if (str.equals(f2620L)) {
                    if (!m6867a(n)) {
                        return new WDChaine();
                    }
                    int i = n.getInt(f2620L);
                    if (i == 0) {
                        i = 100;
                    } else if (i > 0) {
                        String[] j = C0808l.m4052j(m6865a(f2620L, n));
                        if (i < j.length) {
                            i = C0725i.m3064d(j[i]);
                        } else {
                            C0691a.m2856a(Hb[17]);
                            i = 0;
                        }
                    }
                    if (i <= 0) {
                        return new WDChaine();
                    }
                    try {
                        return new WDEntier4(i);
                    } catch (ib e) {
                        throw e;
                    }
                } else if (str.equals(Db)) {
                    double m;
                    WDObjet wDGeoPosition = new WDGeoPosition();
                    r0 = n.get(f2617I);
                    if (r0 != null) {
                        try {
                            m = C0725i.m3084m(r0);
                        } catch (ib e2) {
                            throw e2;
                        }
                    }
                    m = 0.0d;
                    wDGeoPosition.m6474c(m);
                    r0 = n.get(mb);
                    if (r0 != null) {
                        try {
                            m = C0725i.m3084m(r0);
                        } catch (ib e22) {
                            throw e22;
                        }
                    }
                    m = 0.0d;
                    wDGeoPosition.m6474c(m);
                    r0 = n.get(f2621M);
                    if (r0 != null) {
                        try {
                            d = C0725i.m3084m(r0);
                        } catch (ib e222) {
                            throw e222;
                        }
                    }
                    wDGeoPosition.m6474c(d);
                    r0 = n.get(ub);
                    if (r0 != null) {
                        try {
                            wDGeoPosition.m6473a(r0);
                        } catch (ib e2222) {
                            throw e2222;
                        }
                    }
                    return wDGeoPosition;
                } else if (str.equals(f2610A)) {
                    Size pictureSize = n.getPictureSize();
                    return new WDChaine(pictureSize.width + C0607n.Gc + pictureSize.height);
                } else if (str.equals(f2642j)) {
                    String str2 = n.get(f2642j);
                    if (str2 == null) {
                        return new WDChaine();
                    }
                    try {
                        return new WDEntier4(str2);
                    } catch (ib e22222) {
                        throw e22222;
                    }
                } else {
                    try {
                        if (str.equals(Fb)) {
                            return new WDBooleen(this.hb);
                        }
                        r0 = n.get(str);
                        if (r0 == null) {
                            try {
                                throw new ib(C0745b.m3222b(Hb[15], str));
                            } catch (ib e222222) {
                                throw e222222;
                            }
                        }
                        try {
                            if (r0 == null) {
                                r0 = "";
                            }
                            return new WDChaine(r0);
                        } catch (ib e2222222) {
                            throw e2222222;
                        }
                    } catch (ib e22222222) {
                        throw e22222222;
                    }
                }
            } catch (ib e222222222) {
                throw e222222222;
            }
        } catch (ib e2222222222) {
            throw e2222222222;
        }
    }

    /* renamed from: a */
    public String m6874a(int i, C0486m c0486m) throws ib {
        try {
            WDCallback a;
            ic fbVar;
            boolean z;
            String str;
            if (kb.m3965a(C0657a.MARSHMALLOW)) {
                try {
                    WDAppManager.m2565a(Hb[23], Hb[21], Hb[22]);
                } catch (C0653m e) {
                    throw new ib(e.getMessage(), (int) C0607n.Qr);
                }
            }
            if (c0486m != null) {
                try {
                    if (!C0808l.m4053k(c0486m.toString())) {
                        a = WDCallback.m2239a(c0486m, -1, true);
                        fbVar = new fb(this, a, i, C1056i.m7562a(), System.currentTimeMillis() / 1000);
                        if (this.f2659r != null) {
                            if (m6901p()) {
                                z = true;
                                m6900o();
                                if (a != null) {
                                    fbVar.m1785a(0, "", 0);
                                    str = (String) fbVar.m1792d();
                                    if (str != null) {
                                        try {
                                            if (!str.equals("")) {
                                                if (i == 2) {
                                                    C1093d.m7927a().m7975a(str, 1, 0);
                                                }
                                                if (z) {
                                                    try {
                                                        m6894h();
                                                    } catch (C0653m e2) {
                                                        throw e2;
                                                    }
                                                }
                                            }
                                        } catch (C0653m e22) {
                                            throw e22;
                                        } catch (C0653m e222) {
                                            throw e222;
                                        }
                                    }
                                    str = "";
                                    if (z) {
                                        try {
                                            m6894h();
                                        } catch (C0653m e2222) {
                                            throw e2222;
                                        }
                                    }
                                }
                                fbVar.m1794f();
                                str = "";
                                if (z) {
                                    try {
                                        m6894h();
                                    } catch (C0653m e22222) {
                                        throw e22222;
                                    }
                                }
                                return str;
                            }
                        }
                        z = false;
                        m6900o();
                        if (a != null) {
                            fbVar.m1794f();
                            str = "";
                            if (z) {
                                m6894h();
                            }
                        } else {
                            fbVar.m1785a(0, "", 0);
                            str = (String) fbVar.m1792d();
                            if (str != null) {
                                if (str.equals("")) {
                                    if (i == 2) {
                                        C1093d.m7927a().m7975a(str, 1, 0);
                                    }
                                    if (z) {
                                        m6894h();
                                    }
                                }
                            }
                            str = "";
                            if (z) {
                                m6894h();
                            }
                        }
                        return str;
                    }
                } catch (C0653m e222222) {
                    throw e222222;
                }
            }
            a = null;
            fbVar = new fb(this, a, i, C1056i.m7562a(), System.currentTimeMillis() / 1000);
            try {
                if (this.f2659r != null) {
                    if (m6901p()) {
                        z = true;
                        m6900o();
                        if (a != null) {
                            fbVar.m1785a(0, "", 0);
                            str = (String) fbVar.m1792d();
                            if (str != null) {
                                if (str.equals("")) {
                                    if (i == 2) {
                                        C1093d.m7927a().m7975a(str, 1, 0);
                                    }
                                    if (z) {
                                        m6894h();
                                    }
                                }
                            }
                            str = "";
                            if (z) {
                                m6894h();
                            }
                        } else {
                            fbVar.m1794f();
                            str = "";
                            if (z) {
                                m6894h();
                            }
                        }
                        return str;
                    }
                }
                z = false;
                try {
                    m6900o();
                    if (a != null) {
                        fbVar.m1794f();
                        str = "";
                        if (z) {
                            m6894h();
                        }
                    } else {
                        fbVar.m1785a(0, "", 0);
                        str = (String) fbVar.m1792d();
                        if (str != null) {
                            if (str.equals("")) {
                                if (i == 2) {
                                    C1093d.m7927a().m7975a(str, 1, 0);
                                }
                                if (z) {
                                    m6894h();
                                }
                            }
                        }
                        str = "";
                        if (z) {
                            m6894h();
                        }
                    }
                    return str;
                } catch (Exception e3) {
                    try {
                        throw new ib(i == 2 ? C0745b.m3222b(Hb[20], new String[0]) : C0745b.m3222b(Hb[16], new String[0]), e3.getMessage());
                    } catch (C0653m e2222222) {
                        throw e2222222;
                    } catch (Throwable th) {
                        if (z) {
                            try {
                                m6894h();
                            } catch (C0653m e22222222) {
                                throw e22222222;
                            }
                        }
                    }
                }
            } catch (C0653m e222222222) {
                throw e222222222;
            } catch (C0653m e2222222222) {
                throw e2222222222;
            }
        } catch (ib e4) {
            throw e4;
        }
    }

    /* renamed from: a */
    protected void m6875a() {
        this.f2660x = null;
        this.hb = true;
    }

    /* renamed from: a */
    protected void mo3229a(int i) throws ib {
        if (i != 0) {
            try {
                throw new ib(C0745b.m3222b(Hb[14], new String[0]));
            } catch (ib e) {
                throw e;
            }
        }
        this.f2658h = i;
    }

    /* renamed from: a */
    public void m6877a(MediaRecorder mediaRecorder, SurfaceHolder surfaceHolder) {
        if (mediaRecorder == null) {
            mediaRecorder = this.cb;
        }
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
                mediaRecorder.reset();
                mediaRecorder.release();
                if (surfaceHolder != null) {
                    m6878a(surfaceHolder);
                }
                try {
                    if (mediaRecorder == this.cb) {
                        this.cb = null;
                    }
                } catch (IllegalStateException e) {
                    throw e;
                }
            } catch (Exception e2) {
                C0691a.m2857a(Hb[9], e2);
                mediaRecorder.reset();
                mediaRecorder.release();
                if (surfaceHolder != null) {
                    m6878a(surfaceHolder);
                }
                try {
                    if (mediaRecorder == this.cb) {
                        this.cb = null;
                    }
                } catch (IllegalStateException e3) {
                    throw e3;
                }
            } catch (Exception e22) {
                C0691a.m2857a(Hb[8], e22);
                mediaRecorder.reset();
                mediaRecorder.release();
                if (surfaceHolder != null) {
                    m6878a(surfaceHolder);
                }
                try {
                    if (mediaRecorder == this.cb) {
                        this.cb = null;
                    }
                } catch (IllegalStateException e32) {
                    throw e32;
                }
            } catch (Throwable th) {
                try {
                    mediaRecorder.reset();
                    mediaRecorder.release();
                    if (surfaceHolder != null) {
                        m6878a(surfaceHolder);
                    }
                    try {
                        if (mediaRecorder == this.cb) {
                            this.cb = null;
                        }
                        throw th;
                    } catch (IllegalStateException e322) {
                        throw e322;
                    }
                } catch (IllegalStateException e3222) {
                    throw e3222;
                }
            }
        }
    }

    /* renamed from: a */
    public final synchronized void m6878a(SurfaceHolder surfaceHolder) {
        try {
            m6894h();
        } catch (ib e) {
        }
        if (this.f2659r != null) {
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            try {
                if (surfaceFrame.width() != 0) {
                    if (surfaceFrame.height() != 0) {
                        Parameters n = m6899n();
                        C1521w a = m6864a(surfaceFrame.width(), surfaceFrame.height());
                        try {
                            int i;
                            Object obj;
                            if (this.pb) {
                                mo3235d();
                            }
                            if (!kb.m3966a(jc.GALAXY_S4)) {
                                n.setPreviewSize(a.m10571a(), a.m10572b());
                            }
                            n.setPictureFormat(256);
                            if (m6867a(n)) {
                                String str = n.get(f2620L);
                                if (str == null) {
                                    str = "0";
                                }
                                int d = C0725i.m3064d(str);
                                if (d > 0) {
                                    n.set(f2620L, 0);
                                    i = d;
                                } else {
                                    i = d;
                                }
                            } else {
                                i = 0;
                            }
                            String str2 = n.get(f2625Q);
                            if (str2 != null) {
                                if (!str2.equals(ob)) {
                                    n.set(f2625Q, ob);
                                }
                            }
                            this.f2659r.setParameters(n);
                            if (this.fb) {
                                mo3232b();
                            }
                            mo3236e();
                            try {
                                this.f2659r.setPreviewDisplay(surfaceHolder);
                            } catch (Exception e2) {
                                C0691a.m2857a(e2.getMessage(), e2);
                            }
                            this.f2659r.startPreview();
                            if (i != 0) {
                                n.set(f2620L, i);
                                obj = 1;
                            } else {
                                obj = null;
                            }
                            if (str2 != null) {
                                if (!str2.equals(ob)) {
                                    n.set(f2625Q, str2);
                                    obj = 1;
                                }
                            }
                            if (obj != null) {
                                this.f2659r.setParameters(n);
                            }
                            this.pb = true;
                        } catch (ib e3) {
                            throw e3;
                        } catch (ib e32) {
                            throw e32;
                        } catch (ib e322) {
                            throw e322;
                        } catch (ib e3222) {
                            throw e3222;
                        } catch (ib e32222) {
                            throw e32222;
                        } catch (ib e322222) {
                            throw e322222;
                        } catch (ib e3222222) {
                            throw e3222222;
                        }
                    }
                }
            } catch (ib e32222222) {
                throw e32222222;
            } catch (ib e322222222) {
                throw e322222222;
            }
        }
        return;
    }

    /* renamed from: a */
    public void m6879a(SurfaceHolder surfaceHolder, String str) throws ib {
        try {
            if (this.cb != null) {
                m6877a(this.cb, surfaceHolder);
            }
            try {
                m6894h();
                if (!m6901p()) {
                    m6878a(surfaceHolder);
                }
                Parameters n = m6899n();
                if (this.hb) {
                    try {
                        n.set(f2614F, mo3237g());
                        this.f2659r.setParameters(n);
                    } catch (Exception e) {
                        C0691a.m2857a(Hb[19], e);
                    }
                }
                C0806j.m3949a();
                try {
                    new eb(this, str, n).m1785a(0, "", 0);
                    if (surfaceHolder != null) {
                        m6878a(surfaceHolder);
                    }
                } catch (Exception e2) {
                    throw new ib(C0745b.m3222b(Hb[20], new String[0]), e2.getMessage());
                } catch (Throwable th) {
                    if (surfaceHolder != null) {
                        try {
                            m6878a(surfaceHolder);
                        } catch (Exception e22) {
                            throw e22;
                        }
                    }
                }
            } catch (Exception e222) {
                throw e222;
            }
        } catch (Exception e2222) {
            throw e2222;
        }
    }

    /* renamed from: a */
    public void m6880a(SurfaceHolder surfaceHolder, String str, int i, int i2, boolean z) throws ib {
        Throwable th;
        Camera camera = null;
        Object obj = null;
        try {
            if (WDProjet.getInstance().isExecDansEmulateur()) {
                throw new ib(C0745b.m3222b(Hb[11], new String[0]));
            }
            try {
                if (this.cb != null) {
                    m6877a(this.cb, null);
                }
                try {
                    if (!m6901p()) {
                        m6878a(surfaceHolder);
                    }
                    C0806j.m3949a();
                    try {
                        File a;
                        Camera i3 = m6895i();
                        if (i3 != null) {
                            if (!mo3230a(i3)) {
                                m6900o();
                                a = C0897o.m6239a(str, true);
                                this.cb = new MediaRecorder();
                                if (camera != null) {
                                    this.cb.setCamera(camera);
                                }
                                this.cb.setVideoSource(1);
                                this.cb.setAudioSource(1);
                                C1014a.m7327b().mo3283a(this.cb, mo3238k());
                                if (i2 > 0) {
                                    this.cb.setVideoFrameRate(i2);
                                }
                                this.cb.setMaxDuration(i * 1000);
                                this.cb.setOutputFile(a.getPath());
                                this.cb.setPreviewDisplay(surfaceHolder.getSurface());
                                if (this.f2656C > 0) {
                                    this.cb.setOrientationHint(this.f2656C);
                                }
                                this.cb.prepare();
                                this.cb.setOnInfoListener(new C0940b(this, surfaceHolder));
                                this.cb.setOnErrorListener(new C0943e(this, surfaceHolder));
                                this.cb.start();
                                return;
                            }
                        }
                        camera = i3;
                        a = C0897o.m6239a(str, true);
                        this.cb = new MediaRecorder();
                        if (camera != null) {
                            this.cb.setCamera(camera);
                        }
                        this.cb.setVideoSource(1);
                        this.cb.setAudioSource(1);
                        C1014a.m7327b().mo3283a(this.cb, mo3238k());
                        if (i2 > 0) {
                            this.cb.setVideoFrameRate(i2);
                        }
                        this.cb.setMaxDuration(i * 1000);
                        this.cb.setOutputFile(a.getPath());
                        this.cb.setPreviewDisplay(surfaceHolder.getSurface());
                        if (this.f2656C > 0) {
                            this.cb.setOrientationHint(this.f2656C);
                        }
                        this.cb.prepare();
                        this.cb.setOnInfoListener(new C0940b(this, surfaceHolder));
                        this.cb.setOnErrorListener(new C0943e(this, surfaceHolder));
                        this.cb.start();
                        return;
                    } catch (Exception e) {
                        throw e;
                    } catch (Exception e2) {
                        throw e2;
                    } catch (Exception e22) {
                        throw e22;
                    } catch (Exception e222) {
                        throw e222;
                    } catch (Exception e2222) {
                        try {
                            if (this.cb != null) {
                                this.cb.reset();
                                this.cb.release();
                                this.cb = null;
                            }
                            throw new ib(C0745b.m3222b(Hb[16], new String[0]), e2222.getMessage());
                        } catch (Exception e22222) {
                            throw e22222;
                        } catch (Throwable th2) {
                            th = th2;
                            obj = 1;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            m6878a(surfaceHolder);
                            throw th;
                        } catch (Exception e222222) {
                            throw e222222;
                        }
                    }
                } catch (Exception e2222222) {
                    throw e2222222;
                }
            } catch (Exception e22222222) {
                throw e22222222;
            }
            m6878a(surfaceHolder);
            throw th;
        } catch (Exception e222222222) {
            throw e222222222;
        }
    }

    /* renamed from: a */
    public final void m6881a(C0949k c0949k) {
        try {
            if (this.ab != null) {
                this.ab.remove(c0949k);
            }
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public final void m6882a(boolean z) {
        this.fb = z;
    }

    /* renamed from: a */
    protected boolean mo3230a(Camera camera) {
        return false;
    }

    /* renamed from: a */
    public boolean m6884a(String str, WDObjet wDObjet) throws ib {
        if (str.equals(f2622N)) {
            try {
                int c = (wDObjet.opEgal(Eb) || wDObjet.opEgal(f2618J)) ? mo3234c(wDObjet.getString()) : wDObjet.getInt() - 1;
                mo3229a(c);
            } catch (RuntimeException e) {
                throw e;
            }
        }
        boolean z;
        m6894h();
        Parameters n = m6899n();
        if (str.equals(f2642j)) {
            int i = wDObjet.getInt();
            z = i >= 1 && i <= 100;
            if (z) {
                try {
                    n.set(f2642j, i);
                } catch (RuntimeException e2) {
                    throw e2;
                }
            }
        } else if (str.equals(Db)) {
            WDGeoPosition wDGeoPosition = (WDGeoPosition) wDObjet.checkType(WDGeoPosition.class);
            if (wDGeoPosition != null) {
                try {
                    if (wDGeoPosition.m6476d()) {
                        n.set(f2617I, wDGeoPosition.m6482p().toString());
                        n.set(mb, wDGeoPosition.m6477h().toString());
                        n.set(f2621M, wDGeoPosition.getAltitude().toString());
                        n.set(ub, Long.toString(wDGeoPosition.m6481o().mo2496a()));
                        z = true;
                    } else {
                        throw new ib(C0745b.m3222b(Hb[0], new String[0]));
                    }
                } catch (RuntimeException e22) {
                    throw e22;
                }
            }
            z = false;
        } else {
            try {
                if (str.equals(Fb)) {
                    this.hb = wDObjet.getBoolean();
                } else {
                    String string = wDObjet.getString();
                    try {
                        if (str.equals(f2620L) && string.equals("0")) {
                            string = Hb[3];
                        } else {
                            try {
                                if (str.equals(f2610A)) {
                                    if (!mo3238k()) {
                                        string = C0808l.m4018a(string, C0607n.Gc, "x");
                                    }
                                }
                            } catch (RuntimeException e222) {
                                throw e222;
                            } catch (RuntimeException e2222) {
                                throw e2222;
                            }
                        }
                        String a = m6866a(str, string, n);
                        z = a != null;
                        if (z) {
                            try {
                                n.set(str, a);
                            } catch (RuntimeException e22222) {
                                throw e22222;
                            }
                        }
                    } catch (RuntimeException e222222) {
                        throw e222222;
                    }
                }
            } catch (RuntimeException e2222222) {
                throw e2222222;
            }
        }
        if (z) {
            try {
                this.f2659r.setParameters(n);
            } catch (RuntimeException e3) {
                throw new ib(C0745b.m3222b(Hb[1], str));
            } catch (ib e4) {
                throw e4;
            }
        }
        throw new ib(C0745b.m3222b(Hb[2], wDObjet.getString(), str));
        return true;
    }

    /* renamed from: b */
    public String mo3231b(String str) throws ib {
        try {
            if (str.equals(f2622N)) {
                return Hb[5];
            }
            m6894h();
            String a = m6865a(str, m6899n());
            if (str.equals(f2610A)) {
                a = C0808l.m4018a(a, "x", C0607n.Gc);
                String[] j = C0808l.m4052j(a);
                Arrays.sort(j, new cb(this));
                StringBuffer stringBuffer = new StringBuffer(a.length());
                int i = 0;
                while (i < j.length) {
                    try {
                        if (i > 0) {
                            stringBuffer.append(Hb[4]);
                        }
                        stringBuffer.append(j[i]);
                        i++;
                    } catch (ib e) {
                        throw e;
                    } catch (ib e2) {
                        throw e2;
                    }
                }
                return stringBuffer.toString();
            } else if (a == null) {
                return "";
            } else {
                try {
                    return C0808l.m4018a(a, ",", Hb[4]);
                } catch (ib e22) {
                    throw e22;
                }
            }
        } catch (ib e222) {
            throw e222;
        }
    }

    /* renamed from: b */
    protected void mo3232b() {
    }

    /* renamed from: b */
    public final void m6887b(C0949k c0949k) {
        try {
            if (this.ab == null) {
                this.ab = new LinkedList();
            }
            this.ab.add(c0949k);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: b */
    protected boolean mo3233b(Camera camera) {
        return false;
    }

    /* renamed from: c */
    protected int mo3234c(String str) {
        try {
            return str.equals(f2618J) ? 0 : -1;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: d */
    public void mo3235d() {
        try {
            if (this.f2659r != null) {
                this.f2659r.setPreviewCallback(null);
                this.f2659r.stopPreview();
                this.pb = false;
                if (this.ab != null && !this.ab.isEmpty()) {
                    Iterator it = this.ab.iterator();
                    while (it.hasNext()) {
                        ((C0949k) it.next()).mo3414b();
                    }
                }
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: e */
    protected void mo3236e() {
        try {
            if (kb.m3986p() >= C0657a.FROYO.getNumero() && this.f2659r != null) {
                try {
                    Method method = Camera.class.getMethod(Hb[12], new Class[]{Integer.TYPE});
                    this.f2656C = ((90 - C1511l.m10519a(C1056i.m7562a())) + 360) % 360;
                    method.invoke(this.f2659r, new Object[]{Integer.valueOf(this.f2656C)});
                } catch (Exception e) {
                    C0691a.m2857a(Hb[13], e);
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* renamed from: f */
    public boolean m6892f() {
        try {
            return this.cb != null;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: g */
    protected int mo3237g() {
        int i = this.f2661z;
        i = (i != -1 ? i + 90 : 0) % 360;
        return i < 45 ? 0 : i < C0538a.Nb ? 90 : i < 225 ? 180 : i < 315 ? C0607n.al : 0;
    }

    /* renamed from: h */
    public final synchronized void m6894h() throws ib {
        if (this.f2659r == null) {
            try {
                this.f2659r = mo3240q();
                if (this.f2660x != null) {
                    this.f2659r.setParameters(this.f2660x);
                }
            } catch (Exception e) {
                throw e;
            } catch (Exception e2) {
                throw new ib(C0745b.m3222b(Hb[11], new String[0]));
            }
        }
        if (this.f2657c == null) {
            this.f2657c = new C0961w(this, WDAppManager.m2544C());
        }
        this.f2657c.enable();
        return;
    }

    /* renamed from: i */
    public final Camera m6895i() {
        return this.f2659r;
    }

    /* renamed from: j */
    public final C1521w m6896j() {
        Parameters n = m6899n();
        if (n != null) {
            try {
                Size previewSize = n.getPreviewSize();
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        previewSize = null;
        if (previewSize == null) {
            return null;
        }
        try {
            return new C1521w(previewSize.width, previewSize.height);
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: k */
    protected boolean mo3238k() {
        return false;
    }

    /* renamed from: m */
    public int mo3239m() {
        return 1;
    }

    /* renamed from: n */
    public final Parameters m6899n() {
        try {
            if (this.f2660x == null) {
                try {
                    m6894h();
                    this.f2660x = this.f2659r.getParameters();
                } catch (Exception e) {
                    C0691a.m2857a(Hb[10], e);
                }
            }
            return this.f2660x;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: o */
    public final synchronized void m6900o() {
        try {
            mo3235d();
            if (this.f2659r != null) {
                this.f2659r.release();
                this.f2659r = null;
            }
            if (this.f2657c != null) {
                this.f2657c.disable();
            }
        } catch (NumberFormatException e) {
            throw e;
        } catch (NumberFormatException e2) {
            throw e2;
        }
        return;
    }

    /* renamed from: p */
    public boolean m6901p() {
        return this.pb;
    }

    /* renamed from: q */
    protected Camera mo3240q() {
        try {
            C0691a.m2860a(this.f2658h <= 0, Hb[18]);
            this.f2658h = 0;
            return Camera.open();
        } catch (NumberFormatException e) {
            throw e;
        }
    }
}
