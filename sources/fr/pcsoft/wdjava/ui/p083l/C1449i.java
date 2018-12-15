package fr.pcsoft.wdjava.ui.p083l;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.types.WDDate;
import fr.pcsoft.wdjava.core.types.WDHeure;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.C0515x;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.p065b.p067a.qb;
import java.text.StringCharacterIterator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.ui.l.i */
public class C1449i implements nb {
    /* renamed from: B */
    private static final int f4304B = 8;
    /* renamed from: D */
    public static final int f4305D = 12;
    /* renamed from: E */
    public static final String f4306E = C1449i.m10176z(C1449i.m10177z("\u0014(X\u000bc5>m&a*>O\u000bc5>p.q*"));
    /* renamed from: G */
    public static final int f4307G = 13;
    /* renamed from: H */
    private static final int f4308H = 11;
    /* renamed from: I */
    private static final int f4309I = 0;
    /* renamed from: J */
    private static final int f4310J = 17;
    /* renamed from: M */
    private static final int f4311M = 14;
    /* renamed from: N */
    public static final int f4312N = 9;
    /* renamed from: O */
    public static final int f4313O = 1;
    /* renamed from: R */
    public static final String f4314R = C1449i.m10176z(C1449i.m10177z("\u0014(X\u000bc5>m&a*>O\u001bk,>p.q*"));
    /* renamed from: S */
    public static final String f4315S = C1449i.m10176z(C1449i.m10177z("\u0014(X\u000bc5>m&a*>O\u000bc5>i&o$\u0016\\<i"));
    /* renamed from: V */
    private static final int f4316V = 9;
    /* renamed from: W */
    private static final int f4317W = 12;
    /* renamed from: X */
    public static final int f4318X = 11;
    /* renamed from: Y */
    private static final int f4319Y = 2;
    /* renamed from: Z */
    private static final int f4320Z = 13;
    /* renamed from: a */
    private static final int f4321a = 1900;
    private static final int ab = 5;
    /* renamed from: c */
    public static final int f4322c = 3;
    public static final int db = 7;
    private static final int eb = 10;
    /* renamed from: f */
    private static final int f4323f = 1;
    public static final int fb = 10;
    /* renamed from: g */
    private static final int f4324g = 4;
    public static final char hb = '_';
    /* renamed from: i */
    private static final int f4325i = 16;
    public static final int ib = 8;
    /* renamed from: j */
    public static final int f4326j = 4;
    private static final int jb = 7;
    /* renamed from: l */
    public static final int f4327l = 6;
    private static final String[] lb;
    /* renamed from: o */
    public static final String f4328o = C1449i.m10176z(C1449i.m10177z("\u0014(X\u000bc5>o*n /T9g\u0005.O.v(4S\u0002c20"));
    /* renamed from: p */
    private static final int f4329p = 3;
    /* renamed from: q */
    public static final int f4330q = 5;
    /* renamed from: r */
    private static final int f4331r = 2089;
    /* renamed from: s */
    public static final int f4332s = 2;
    /* renamed from: t */
    public static final int f4333t = 14;
    /* renamed from: x */
    private static final int f4334x = 15;
    /* renamed from: y */
    private static final int f4335y = 6;
    /* renamed from: z */
    public static final int f4336z = 0;
    /* renamed from: A */
    private int f4337A = -1;
    /* renamed from: C */
    private C0515x f4338C;
    /* renamed from: F */
    private boolean f4339F = false;
    /* renamed from: K */
    private boolean f4340K = true;
    /* renamed from: L */
    private String f4341L = "";
    /* renamed from: P */
    private int f4342P = -1;
    /* renamed from: Q */
    private int f4343Q = -1;
    /* renamed from: T */
    private int f4344T = -1;
    /* renamed from: U */
    private kb f4345U;
    /* renamed from: b */
    private int f4346b = 0;
    private ArrayList bb = new ArrayList();
    private WDDate cb = null;
    /* renamed from: d */
    private final int f4347d = 0;
    /* renamed from: e */
    private boolean f4348e = false;
    private C1458s gb = null;
    /* renamed from: h */
    private StringBuffer f4349h = new StringBuffer("");
    /* renamed from: k */
    private int f4350k = -1;
    private int kb = -1;
    /* renamed from: m */
    private boolean f4351m = false;
    /* renamed from: n */
    private int f4352n = 0;
    /* renamed from: u */
    private int f4353u = 1;
    /* renamed from: v */
    private boolean f4354v = false;
    /* renamed from: w */
    private WDHeure f4355w = null;

    static {
        r0 = new String[83];
        r0[0] = C1449i.m10176z(C1449i.m10177z("xb"));
        r0[1] = C1449i.m10176z(C1449i.m10177z("qk"));
        r0[2] = C1449i.m10176z(C1449i.m10177z("\u000b\u0011p\u0002C\u0000\u001a|"));
        r0[3] = C1449i.m10176z(C1449i.m10177z("\u000b\u0011p\u0002C\u0000"));
        r0[4] = C1449i.m10176z(C1449i.m10177z("\u000b\u0011\u0010\u0002Ol\u001a|\u000eC"));
        r0[5] = C1449i.m10176z(C1449i.m10177z("\t\u0013\u0007\u0002O{\bn"));
        r0[6] = C1449i.m10176z(C1449i.m10177z("\u0000\u001a|\u000eO\f\u0011w\u0007J,6n\u001c"));
        r0[7] = C1449i.m10176z(C1449i.m10177z("\f\u0016w\u0005C\u0000"));
        r0[8] = C1449i.m10176z(C1449i.m10177z("\u0000\u001ap\u0002H\u000b"));
        r0[9] = C1449i.m10176z(C1449i.m10177z("\f\u0016w\u0005C\u0000\u001a|"));
        r0[10] = C1449i.m10176z(C1449i.m10177z("\t\u0013p\u0002"));
        r0[11] = C1449i.m10176z(C1449i.m10177z("\u0000\u001a|\u000eO\f\u0011w"));
        r0[12] = C1449i.m10176z(C1449i.m10177z("\u0000\u001a|\u000e/\f\u0016\u0010\u0005H"));
        r0[13] = C1449i.m10176z(C1449i.m10177z("\t\u0013p\u0002Q\u0012"));
        r0[14] = C1449i.m10176z(C1449i.m10177z("\t\u0013p\u0002Q\u0012\u0018~"));
        r0[15] = C1449i.m10176z(C1449i.m10177z("\u0000\u001a|\u000eO\f\u0011w\u0007J,6n\u001cA\u0002\u0018"));
        r0[16] = C1449i.m10176z(C1449i.m10177z("xb\u0004"));
        r0[17] = C1449i.m10176z(C1449i.m10177z("qk\r"));
        r0[18] = C1449i.m10176z(C1449i.m10177z("sh"));
        r0[19] = C1449i.m10176z(C1449i.m10177z("pi"));
        r0[20] = C1449i.m10176z(C1449i.m10177z("qj"));
        r0[21] = C1449i.m10176z(C1449i.m10177z("oq\u0015g\\=s|\u000e+=\u0000c\u0002C\u001cp\u0014\u0002*e'f\u0011O\u001cp\u0014fypw@a("));
        r0[22] = C1449i.m10176z(C1449i.m10177z("\u0011\u0016"));
        r0[23] = C1449i.m10176z(C1449i.m10177z("\u0000\u0016"));
        r0[24] = C1449i.m10176z(C1449i.m10177z("tb"));
        r0[25] = C1449i.m10176z(C1449i.m10177z(";4S*Q42K.l5>"));
        r0[26] = C1449i.m10176z(C1449i.m10177z("oq\u0015g\\=\u0000c\u0002_jrp\u0002*e'f\u0011O\u001cp\u0014fypw@a("));
        r0[27] = C1449i.m10176z(C1449i.m10177z("bx"));
        r0[28] = C1449i.m10176z(C1449i.m10177z("\u0014\u000e"));
        r0[29] = C1449i.m10176z(C1449i.m10177z("bx\u001el"));
        r0[30] = C1449i.m10176z(C1449i.m10177z("\u0000\u001a|\u000eO\f\u0011w\u0007J\f\u0016n\u001c"));
        r0[31] = C1449i.m10176z(C1449i.m10177z("\u0018\u0002d\u0016/\f\u0016\u0010\u000bF"));
        r0[32] = C1449i.m10176z(C1449i.m10177z("\u0018\u0002d\u0016O\f\u001fy\u0007J\f\u0016n\u001cA\u0002\u0018"));
        r0[33] = C1449i.m10176z(C1449i.m10177z("\f\u0016y\u000b[\u0018"));
        r0[34] = C1449i.m10176z(C1449i.m10177z("\u0018\u0002d\u0016O\f\u001fy\u0007J\f\u0016n\u001c"));
        r0[35] = C1449i.m10176z(C1449i.m10177z("\u0000\u001a|\u000eO\f\u0011w\u0007J\f\u0016n\u001cA\u0002\u0018"));
        r0[36] = C1449i.m10176z(C1449i.m10177z("\u0005\u001f\u0010\u0002Ol\u0002d\u0016["));
        r0[37] = C1449i.m10176z(C1449i.m10177z("\u0014/T#k2:I&m/{Yhw/{[ p,:Ioo¨6R=k2²\u001d!m/{N:r14O;ëo"));
        r0[38] = C1449i.m10176z(C1449i.m10177z("\u0005\u001fp\u0002[\u0018\u0002d"));
        r0[39] = C1449i.m10176z(C1449i.m10177z("\u0005\u001fp\u0002[\u0018"));
        r0[40] = C1449i.m10176z(C1449i.m10177z("\f\u0016y\u000b[\u0018\u0002d"));
        r0[41] = C1449i.m10176z(C1449i.m10177z("\u0018\u0002d\u0016O\f\u001fy"));
        r0[42] = C1449i.m10176z(C1449i.m10177z("\u0018\u0002p\u0002F\u0005"));
        r0[43] = C1449i.m10176z(C1449i.m10177z("\u001e\u0004b\u0010]\u001e"));
        r0[44] = C1449i.m10176z(C1449i.m10177z("pb"));
        r0[45] = C1449i.m10176z(C1449i.m10177z("sk"));
        r0[46] = C1449i.m10176z(C1449i.m10177z("\u0005\u001fy+"));
        r0[47] = C1449i.m10176z(C1449i.m10177z("\u0002\u0018"));
        r0[48] = C1449i.m10176z(C1449i.m10177z("\u0005\u001fy\u000b"));
        r0[49] = C1449i.m10176z(C1449i.m10177z("\f6P"));
        r0[50] = C1449i.m10176z(C1449i.m10177z("\u000b\u0011w%"));
        r0[51] = C1449i.m10176z(C1449i.m10177z("\u0005?Y"));
        r0[52] = C1449i.m10176z(C1449i.m10177z("\f\u0016"));
        r0[53] = C1449i.m10176z(C1449i.m10177z("\u000b\u0011w\u0005"));
        r0[54] = C1449i.m10176z(C1449i.m10177z("\f\u0016p"));
        r0[55] = C1449i.m10176z(C1449i.m10177z("\u0012\b"));
        r0[56] = C1449i.m10176z(C1449i.m10177z("\u0005\u001f"));
        r0[57] = C1449i.m10176z(C1449i.m10177z("\f\u0016p\u0002"));
        r0[58] = C1449i.m10176z(C1449i.m10177z("\f6P\""));
        r0[59] = C1449i.m10176z(C1449i.m10177z("\t\u0013"));
        r0[60] = C1449i.m10176z(C1449i.m10177z("\u0005\u001fy"));
        r0[61] = C1449i.m10176z(C1449i.m10177z("\u0000\u001a|\u000e"));
        r0[62] = C1449i.m10176z(C1449i.m10177z("\u0018\u0002d\u0016"));
        r0[63] = C1449i.m10176z(C1449i.m10177z("\f\u0016p\""));
        r0[64] = C1449i.m10176z(C1449i.m10177z("\u000b\u0011"));
        r0[65] = C1449i.m10176z(C1449i.m10177z("\u000b1W"));
        r0[66] = C1449i.m10176z(C1449i.m10177z("\u000b\u0011w"));
        r0[67] = C1449i.m10176z(C1449i.m10177z("\u0005?Y+"));
        r0[68] = C1449i.m10176z(C1449i.m10177z("\u0005\u001fY"));
        r0[69] = C1449i.m10176z(C1449i.m10177z("\u0002\u0018~"));
        r0[70] = C1449i.m10176z(C1449i.m10177z("\f\u0016P"));
        r0[71] = C1449i.m10176z(C1449i.m10177z("\u000b\u0011W"));
        r0[72] = C1449i.m10176z(C1449i.m10177z("\u0000\u001a"));
        r0[73] = C1449i.m10176z(C1449i.m10177z(",6"));
        r0[74] = C1449i.m10176z(C1449i.m10177z("\u0018\u0002"));
        r0[75] = C1449i.m10176z(C1449i.m10177z("\u000b1W%"));
        r0[76] = C1449i.m10176z(C1449i.m10177z(",6P\""));
        r0[77] = C1449i.m10176z(C1449i.m10177z("%?Y"));
        r0[78] = C1449i.m10176z(C1449i.m10177z(",6P"));
        r0[79] = C1449i.m10176z(C1449i.m10177z("%?Y+"));
        r0[80] = C1449i.m10176z(C1449i.m10177z("+1W"));
        r0[81] = C1449i.m10176z(C1449i.m10177z("+1W%"));
        r0[82] = C1449i.m10176z(C1449i.m10177z("\u0014(X\u001c{2/X\"O (V"));
        lb = r0;
    }

    public C1449i(C0515x c0515x, boolean z) {
        this.f4340K = z;
        this.f4338C = c0515x;
        if (this.f4340K) {
            this.f4353u = 1;
        } else {
            this.f4353u = 10;
        }
        this.f4345U = new kb();
    }

    /* renamed from: a */
    private String m10162a(char c, int i) {
        if (i < 0 || i >= this.bb.size()) {
            return "";
        }
        C1461v c1461v = (C1461v) this.bb.get(i);
        if (c == '/' || c == ' ' || c == ':') {
            m10166a(i, c1461v);
            return lb[25];
        }
        if (!Character.isDigit(c)) {
            if (!this.f4339F) {
                return "";
            }
            if (!(Character.toUpperCase(c) == 'P' || Character.toUpperCase(c) == qb.f3195j)) {
                return "";
            }
        }
        if (c1461v == null) {
            return "";
        }
        int c2 = (this.f4344T + i) - c1461v.m10290c();
        switch (c1461v.m10289b()) {
            case 0:
                return m10189c(c, c1461v, i, c2);
            case 1:
                return m10179a(c, c1461v, i, c2);
            case 4:
            case 5:
                return m10188b(c, c1461v, i, c2);
            case 8:
            case 9:
                return m10201g(c, c1461v, i, c2);
            case 10:
            case 11:
                return m10192d(c, c1461v, i, c2);
            case 12:
            case 13:
                return m10202h(c, c1461v, i, c2);
            case 14:
                return m10199f(c, c1461v, i, c2);
            case 16:
                return m10197e(c, c1461v, i, c2);
            case 17:
                return m10203i(c, c1461v, i, c2);
            default:
                return "";
        }
    }

    /* renamed from: a */
    public static String m10163a(int i) {
        switch (i) {
            case 0:
                return "";
            case 2:
                return lb[8];
            case 3:
                return lb[12];
            case 4:
                return lb[2];
            case 5:
                return lb[3];
            case 6:
                return lb[9];
            case 7:
                return lb[7];
            case 8:
                return lb[6];
            case 9:
                return lb[10];
            case 10:
                return lb[13];
            case 11:
                return lb[14];
            case 12:
                return lb[5];
            case 13:
                return lb[4];
            case 14:
                return lb[15];
            default:
                return lb[11];
        }
    }

    /* renamed from: a */
    private final String m10164a(C1458s c1458s) {
        StringBuilder stringBuilder = new StringBuilder();
        String string = (!this.f4340K || this.cb == null) ? "" : this.cb.getString();
        stringBuilder = stringBuilder.append(string);
        string = (!this.f4351m || this.f4355w == null) ? "" : this.f4355w.getString();
        return c1458s.m10284a(stringBuilder.append(string).toString());
    }

    /* renamed from: a */
    private String m10165a(boolean z, C1449i c1449i) {
        int i = this.f4343Q;
        if (c1449i != null && c1449i != this) {
            try {
                if (c1449i.gb != null) {
                    z = false;
                } else {
                    i = c1449i.f4343Q;
                }
            } catch (Exception e) {
                throw e;
            }
        } else if (this.gb != null) {
            z = false;
        }
        StringBuffer stringBuffer = new StringBuffer("");
        try {
            if (this.f4340K) {
                if (this.cb == null) {
                    return "";
                }
            }
            try {
                if (!this.f4340K) {
                    if (this.f4355w == null) {
                        return "";
                    }
                }
                String str = "";
                if (this.f4355w != null) {
                    str = this.f4355w.m2481l();
                    try {
                        if (this.f4355w.m2475h().equals(lb[22])) {
                            int parseInt = Integer.parseInt(this.f4355w.m2481l());
                            if (parseInt < 12) {
                                str = "" + (parseInt + 12);
                            }
                        } else if (this.f4355w.m2475h().equals(lb[23]) && Integer.parseInt(this.f4355w.m2481l()) == 12) {
                            str = lb[1];
                        }
                    } catch (Exception e2) {
                    }
                }
                try {
                    switch (this.f4353u) {
                        case 0:
                            stringBuffer.append(this.f4345U.m10218a());
                            break;
                        case 1:
                            stringBuffer.append(this.cb.m2528n()).append(this.cb.m2535x()).append(this.cb.m2526l());
                            break;
                        case 2:
                            stringBuffer.append(this.cb.m2528n().substring(2, 4)).append(this.cb.m2535x()).append(this.cb.m2526l());
                            break;
                        case 3:
                            stringBuffer.append(this.cb.m2528n()).append('-').append(this.cb.m2535x()).append('-').append(this.cb.m2526l());
                            break;
                        case 4:
                            stringBuffer.append(this.cb.m2526l()).append(this.cb.m2535x()).append(this.cb.m2528n());
                            break;
                        case 5:
                            stringBuffer.append(this.cb.m2526l()).append(this.cb.m2535x()).append(this.cb.m2528n().substring(2, 4));
                            break;
                        case 6:
                            stringBuffer.append(this.cb.m2535x()).append(this.cb.m2526l()).append(this.cb.m2528n());
                            break;
                        case 7:
                            stringBuffer.append(this.cb.m2535x()).append(this.cb.m2526l()).append(this.cb.m2528n().substring(2, 4));
                            break;
                        case 8:
                        case 14:
                            try {
                                stringBuffer.append(this.cb.m2528n()).append(this.cb.m2535x()).append(this.cb.m2526l());
                                if (this.f4355w == null) {
                                    stringBuffer.append(lb[43]);
                                    break;
                                }
                                try {
                                    stringBuffer.append(str);
                                    if (i >= 12 || !r12) {
                                        stringBuffer.append(this.f4355w.m2485o());
                                    } else {
                                        stringBuffer.append(lb[1]);
                                    }
                                    if (i >= 13 || !r12) {
                                        try {
                                            stringBuffer.append(this.f4355w.m2472e());
                                        } catch (Exception e3) {
                                            throw e3;
                                        }
                                    }
                                    stringBuffer.append(lb[1]);
                                    try {
                                        if (this.f4353u == 14) {
                                            if (i < 17 && r12) {
                                                stringBuffer.append(lb[17]);
                                                break;
                                            }
                                            try {
                                                stringBuffer.append(this.f4355w.m2482m());
                                                break;
                                            } catch (Exception e32) {
                                                throw e32;
                                            }
                                        }
                                    } catch (Exception e322) {
                                        throw e322;
                                    } catch (Exception e3222) {
                                        throw e3222;
                                    }
                                } catch (Exception e32222) {
                                    throw e32222;
                                } catch (Exception e322222) {
                                    throw e322222;
                                }
                            } catch (Exception e3222222) {
                                throw e3222222;
                            }
                            break;
                        case 9:
                            try {
                                stringBuffer.append(str);
                                if (i < 12 && r12) {
                                    stringBuffer.append(lb[1]);
                                    break;
                                }
                                stringBuffer.append(this.f4355w.m2485o());
                                break;
                            } catch (Exception e32222222) {
                                throw e32222222;
                            } catch (Exception e322222222) {
                                throw e322222222;
                            }
                            break;
                        case 10:
                            try {
                                stringBuffer.append(str);
                                if (i >= 12 || !r12) {
                                    stringBuffer.append(this.f4355w.m2485o());
                                } else {
                                    stringBuffer.append(lb[1]);
                                }
                                if (i < 13 && r12) {
                                    stringBuffer.append(lb[1]);
                                    break;
                                }
                                try {
                                    stringBuffer.append(this.f4355w.m2472e());
                                    break;
                                } catch (Exception e3222222222) {
                                    throw e3222222222;
                                }
                            } catch (Exception e32222222222) {
                                throw e32222222222;
                            } catch (Exception e322222222222) {
                                throw e322222222222;
                            }
                            break;
                        case 11:
                            try {
                                stringBuffer.append(str);
                                if (i >= 12 || !r12) {
                                    stringBuffer.append(this.f4355w.m2485o());
                                } else {
                                    stringBuffer.append(lb[1]);
                                }
                                if (i >= 13 || !r12) {
                                    try {
                                        stringBuffer.append(this.f4355w.m2472e());
                                    } catch (Exception e3222222222222) {
                                        throw e3222222222222;
                                    }
                                }
                                stringBuffer.append(lb[1]);
                                if (i < 14 && r12) {
                                    stringBuffer.append(lb[1]);
                                    break;
                                }
                                try {
                                    stringBuffer.append(this.f4355w.m2482m().substring(0, 2));
                                    break;
                                } catch (Exception e32222222222222) {
                                    throw e32222222222222;
                                }
                            } catch (Exception e322222222222222) {
                                throw e322222222222222;
                            } catch (Exception e3222222222222222) {
                                throw e3222222222222222;
                            }
                            break;
                        case 12:
                            try {
                                stringBuffer.append(str).append(':');
                                if (i >= 12 || !r12) {
                                    stringBuffer.append(this.f4355w.m2485o());
                                } else {
                                    stringBuffer.append(lb[1]);
                                }
                                try {
                                    stringBuffer.append(':');
                                    if (i < 13 && r12) {
                                        stringBuffer.append(lb[1]);
                                        break;
                                    }
                                    stringBuffer.append(this.f4355w.m2472e());
                                    break;
                                } catch (Exception e32222222222222222) {
                                    throw e32222222222222222;
                                } catch (Exception e322222222222222222) {
                                    throw e322222222222222222;
                                }
                            } catch (Exception e3222222222222222222) {
                                throw e3222222222222222222;
                            } catch (Exception e32222222222222222222) {
                                throw e32222222222222222222;
                            }
                            break;
                        case 13:
                            stringBuffer.append(this.cb.m2526l()).append('-').append(this.cb.m2535x()).append('-').append(this.cb.m2528n());
                            break;
                    }
                    return stringBuffer.toString();
                } catch (Exception e322222222222222222222) {
                    throw e322222222222222222222;
                }
            } catch (Exception e3222222222222222222222) {
                throw e3222222222222222222222;
            } catch (Exception e32222222222222222222222) {
                throw e32222222222222222222222;
            }
        } catch (Exception e322222222222222222222222) {
            throw e322222222222222222222222;
        } catch (Exception e3222222222222222222222222) {
            throw e3222222222222222222222222;
        }
    }

    /* renamed from: a */
    private void m10166a(int i, C1461v c1461v) {
        int i2 = i;
        while (i2 < this.bb.size()) {
            C1461v c1461v2 = (C1461v) this.bb.get(i2);
            if (c1461v2 != null && c1461v2 != c1461v) {
                this.f4352n = i2;
                this.f4346b = c1461v2.m10287a() + i2;
                break;
            }
            i2++;
        }
        if (i2 == this.bb.size()) {
            this.f4352n = c1461v.m10287a() + i;
            this.f4346b = c1461v.m10287a() + i;
        }
    }

    /* renamed from: a */
    private void m10167a(C1461v c1461v, char c) {
        if (c1461v != null) {
            switch (c1461v.m10289b()) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    this.f4337A = Math.max(this.f4337A, c1461v.m10289b());
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    this.f4343Q = Math.max(this.f4343Q, c1461v.m10289b());
                    break;
            }
        }
        if (c1461v == null) {
            this.bb.add(null);
            if (m10168a(c)) {
                this.f4349h.append("'").append(c);
                return;
            } else {
                this.f4349h.append(c);
                return;
            }
        }
        switch (c1461v.m10289b()) {
            case 0:
                if (this.f4344T == -1) {
                    this.f4344T = this.bb.size();
                    this.f4350k = this.f4349h.length();
                }
                this.kb = this.bb.size() + c1461v.m10287a();
                this.f4342P = this.f4349h.length() + c1461v.m10287a();
                c1461v.m10288a(this.bb.size());
                this.bb.add(c1461v);
                this.bb.add(c1461v);
                this.bb.add(c1461v);
                this.bb.add(c1461v);
                this.f4349h.append(lb[29]);
                return;
            case 1:
            case 4:
            case 8:
            case 10:
            case 12:
            case 13:
            case 14:
            case 17:
                if (this.f4344T == -1) {
                    this.f4344T = this.bb.size();
                    this.f4350k = this.f4349h.length();
                }
                this.kb = this.bb.size() + c1461v.m10287a();
                this.f4342P = this.f4349h.length() + c1461v.m10287a();
                c1461v.m10288a(this.bb.size());
                for (int i = 0; i < c1461v.m10287a(); i++) {
                    this.bb.add(c1461v);
                    this.f4349h.append("#");
                }
                return;
            case 5:
            case 9:
            case 11:
                if (this.f4344T == -1) {
                    this.f4344T = this.bb.size();
                    this.f4350k = this.f4349h.length();
                }
                this.kb = this.bb.size() + c1461v.m10287a();
                this.f4342P = this.f4349h.length() + c1461v.m10287a();
                c1461v.m10288a(this.bb.size());
                this.bb.add(c1461v);
                this.bb.add(c1461v);
                this.f4349h.append(lb[27]);
                return;
            case 16:
                if (this.f4344T == -1) {
                    this.f4344T = this.bb.size();
                    this.f4350k = this.f4349h.length();
                }
                this.kb = this.bb.size() + c1461v.m10287a();
                this.f4342P = this.f4349h.length() + c1461v.m10287a();
                c1461v.m10288a(this.bb.size());
                this.bb.add(c1461v);
                this.bb.add(c1461v);
                this.f4349h.append(lb[28]);
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    private boolean m10168a(char c) {
        switch (c) {
            case '#':
            case '\'':
            case '*':
            case '?':
            case 'A':
            case 'H':
            case 'L':
            case 'U':
                return true;
            default:
                return false;
        }
    }

    /* renamed from: b */
    private boolean m10169b(String str) {
        boolean z = true;
        switch (this.f4353u) {
            case 0:
                z = false;
                break;
            case 1:
            case 4:
            case 6:
            case 11:
            case 12:
                break;
            case 2:
                z = true;
                break;
            case 3:
                z = true;
                break;
            case 5:
                z = true;
                break;
            case 7:
                z = true;
                break;
            case 8:
                z = true;
                break;
            case 9:
                z = true;
                break;
            case 10:
                z = true;
                break;
            case 13:
                z = true;
                break;
            case 14:
                z = true;
                break;
            default:
                z = false;
                break;
        }
        return str.length() >= z;
    }

    /* renamed from: f */
    private String m10170f(String str) {
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str);
        char first = stringCharacterIterator.first();
        while (stringCharacterIterator.getIndex() < stringCharacterIterator.getEndIndex()) {
            switch (first) {
                case 'A':
                    if (!this.f4340K) {
                        if (str.indexOf(lb[23], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                            m10167a(null, (char) qb.f3195j);
                            break;
                        }
                        m10167a(new C1461v(this, "", 0, 16, 2), first);
                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                        break;
                    } else if (str.indexOf(lb[61], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                        if (str.indexOf(lb[72], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                            if (!this.f4351m || str.indexOf(lb[23], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                m10167a(null, (char) qb.f3195j);
                                break;
                            }
                            m10167a(new C1461v(this, "", 0, 16, 2), first);
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                            break;
                        }
                        m10167a(new C1461v(this, "", 0, 1, 2), first);
                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                        break;
                    } else {
                        m10167a(new C1461v(this, "", 0, 0, 4), first);
                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                        break;
                    }
                case 'C':
                    if (!this.f4340K || this.f4351m) {
                        if (str.indexOf(lb[69], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                            if (str.indexOf(lb[47], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                m10167a(null, first);
                                break;
                            }
                            m10167a(new C1461v(this, "", 0, 14, 2), first);
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                            break;
                        }
                        m10167a(new C1461v(this, "", 0, 17, 3), first);
                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 2);
                        break;
                    }
                    m10167a(null, first);
                    break;
                    break;
                case 'D':
                case 'd':
                    if (this.f4340K) {
                        if (str.indexOf(lb[48], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() && str.indexOf(lb[67], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() && str.indexOf(lb[79], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                            if (str.indexOf(lb[60], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() && str.indexOf(lb[51], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() && str.indexOf(lb[77], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                if (str.indexOf(lb[56], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                    if (str.indexOf(C0607n.cf, stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                        m10167a(null, first);
                                        break;
                                    }
                                    m10167a(new C1461v(this, "", 0, 9, 2), first);
                                    break;
                                }
                                m10167a(new C1461v(this, "", 0, 8, 2), first);
                                stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                                break;
                            }
                            m10167a(new C1461v(this, "", 0, 7, 0), first);
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 2);
                            break;
                        }
                        m10167a(new C1461v(this, "", 0, 6, 0), first);
                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                        break;
                    }
                    m10167a(null, first);
                    break;
                    break;
                case 'H':
                    if (!this.f4340K || this.f4351m) {
                        if (str.indexOf(lb[59], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                            m10167a(new C1461v(this, "", 0, 11, 2), first);
                            break;
                        }
                        m10167a(new C1461v(this, "", 0, 10, 2), first);
                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                        break;
                    }
                    m10167a(null, (char) qb.f3200p);
                    break;
                    break;
                case 'J':
                case 'j':
                    if (this.f4340K) {
                        if (str.indexOf(lb[53], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() && str.indexOf(lb[75], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() && str.indexOf(lb[81], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                            if (str.indexOf(lb[66], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() && str.indexOf(lb[65], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() && str.indexOf(lb[80], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                if (str.indexOf(lb[64], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                    if (str.indexOf(C0607n.xl, stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                        m10167a(null, first);
                                        break;
                                    }
                                    m10167a(new C1461v(this, "", 0, 9, 2), first);
                                    break;
                                }
                                m10167a(new C1461v(this, "", 0, 8, 2), first);
                                stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                                break;
                            }
                            m10167a(new C1461v(this, "", 0, 7, 0), first);
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 2);
                            break;
                        }
                        m10167a(new C1461v(this, "", 0, 6, 0), first);
                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                        break;
                    }
                    m10167a(null, first);
                    break;
                    break;
                case 'M':
                case 'm':
                    if (!this.f4340K) {
                        if (str.indexOf(lb[52], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() && str.indexOf(lb[73], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                            m10167a(null, first);
                            break;
                        }
                        m10167a(new C1461v(this, "", 0, 12, 2), first);
                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                        break;
                    } else if (str.indexOf(lb[57], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() && str.indexOf(lb[58], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() && str.indexOf(lb[76], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                        if (str.indexOf(lb[54], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() && str.indexOf(lb[49], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() && str.indexOf(lb[78], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                            if (str.indexOf(lb[52], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                if (str.indexOf(lb[73], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() || !this.f4351m) {
                                    if (str.indexOf("M", stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                        m10167a(null, first);
                                        break;
                                    }
                                    m10167a(new C1461v(this, "", 0, 5, 2), first);
                                    break;
                                }
                                m10167a(new C1461v(this, "", 0, 12, 2), first);
                                stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                                break;
                            }
                            m10167a(new C1461v(this, "", 0, 4, 2), first);
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                            break;
                        }
                        if (this.f4354v) {
                            m10167a(new C1461v(this, "", 0, 3, 0), first);
                        } else {
                            m10167a(new C1461v(this, "", 0, 4, 2), first);
                        }
                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 2);
                        break;
                    } else {
                        if (this.f4354v) {
                            m10167a(new C1461v(this, "", 0, 2, 0), first);
                        } else {
                            m10167a(new C1461v(this, "", 0, 4, 2), first);
                        }
                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                        break;
                    }
                    break;
                case 'S':
                    if (!this.f4340K || this.f4351m) {
                        if (str.indexOf(lb[55], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                            m10167a(null, first);
                            break;
                        }
                        m10167a(new C1461v(this, "", 0, 13, 2), first);
                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                        break;
                    }
                    m10167a(null, first);
                    break;
                case 'Y':
                    if (this.f4340K) {
                        if (str.indexOf(lb[62], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                            if (str.indexOf(lb[74], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                m10167a(null, 'Y');
                                break;
                            }
                            m10167a(new C1461v(this, "", 0, 1, 2), first);
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                            break;
                        }
                        m10167a(new C1461v(this, "", 0, 0, 4), first);
                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                        break;
                    }
                    m10167a(null, 'Y');
                    break;
                default:
                    m10167a(null, first);
                    break;
            }
            first = stringCharacterIterator.next();
        }
        if (this.f4344T == -1) {
            this.f4344T = 0;
            this.f4350k = 0;
        }
        if (this.kb == -1) {
            this.kb = 0;
            this.f4342P = 0;
        }
        this.bb = new ArrayList(this.bb.subList(this.f4344T, this.kb));
        this.f4349h = new StringBuffer(this.f4349h.toString().substring(this.f4350k, this.f4342P));
        return this.f4349h.toString();
    }

    /* renamed from: g */
    private boolean m10171g() {
        int indexOf = this.f4341L.indexOf(lb[23]);
        return indexOf == -1 ? false : indexOf == this.f4341L.length() + -2 || this.f4341L.charAt(indexOf + 2) != qb.f3201q;
    }

    /* renamed from: h */
    public static int m10172h(String str) {
        String toUpperCase = str.toUpperCase();
        if (toUpperCase.equals("")) {
            return 0;
        }
        if (toUpperCase.equals(lb[11]) || toUpperCase.equals(lb[41])) {
            return 1;
        }
        if (toUpperCase.equals(lb[8]) || toUpperCase.equals(lb[42])) {
            return 2;
        }
        if (toUpperCase.equals(lb[12]) || toUpperCase.equals(lb[31])) {
            return 3;
        }
        if (toUpperCase.equals(lb[2]) || toUpperCase.equals(lb[38])) {
            return 4;
        }
        if (toUpperCase.equals(lb[4]) || toUpperCase.equals(lb[36])) {
            return 13;
        }
        if (toUpperCase.equals(lb[3]) || toUpperCase.equals(lb[39])) {
            return 5;
        }
        if (toUpperCase.equals(lb[9]) || toUpperCase.equals(lb[40])) {
            return 6;
        }
        if (toUpperCase.equals(lb[7]) || toUpperCase.equals(lb[33])) {
            return 7;
        }
        if (toUpperCase.equals(lb[30]) || toUpperCase.equals(lb[34])) {
            return 8;
        }
        if (toUpperCase.equals(lb[35]) || toUpperCase.equals(lb[32])) {
            return 14;
        }
        if (toUpperCase.equals(lb[10])) {
            return 9;
        }
        if (toUpperCase.equals(lb[13])) {
            return 10;
        }
        if (toUpperCase.equals(lb[14])) {
            return 11;
        }
        if (toUpperCase.equals(lb[5])) {
            return 12;
        }
        C0691a.m2856a(lb[37]);
        return 1;
    }

    /* renamed from: h */
    private String m10173h() {
        return new WDDate().m2528n();
    }

    /* renamed from: k */
    private String m10174k() {
        return new WDDate().m2535x();
    }

    /* renamed from: n */
    private boolean m10175n() {
        return this.f4353u == 8 || this.f4353u == 14;
    }

    /* renamed from: z */
    private static String m10176z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 65;
                    break;
                case 1:
                    i2 = 91;
                    break;
                case 2:
                    i2 = 61;
                    break;
                case 3:
                    i2 = 79;
                    break;
                default:
                    i2 = 2;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m10177z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 2);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public int mo3780a() {
        return this.f4352n;
    }

    /* renamed from: a */
    public String m10179a(char c, C1461v c1461v, int i, int i2) {
        return m10180a(c, c1461v, i, i2, lb[1], lb[0]);
    }

    /* renamed from: a */
    public String m10180a(char c, C1461v c1461v, int i, int i2, String str, String str2) {
        try {
            int a = c1461v.m10287a();
            char charAt = str.charAt(i2);
            char charAt2 = str2.charAt(i2);
            if (i2 == 0) {
                if (c >= charAt && c <= charAt2) {
                    this.f4352n = i + 1;
                    this.f4346b = i + 2;
                    return "" + c;
                } else if (a == 1) {
                    return "";
                } else {
                    if (a > 2) {
                        this.f4352n = i + 2;
                        this.f4346b = i + 3;
                    } else {
                        m10166a(i, c1461v);
                    }
                    return "" + str.charAt(0) + c;
                }
            } else if (Integer.parseInt(C0808l.m4017a(this.f4345U.m10218a().substring(i - i2, i) + c, a, "0")) > Integer.parseInt(str2)) {
                return "";
            } else {
                if (i2 + 1 < a) {
                    this.f4352n = i + 1;
                    this.f4346b = i + 2;
                } else {
                    m10166a(i, c1461v);
                }
                return "" + c;
            }
        } catch (Exception e) {
            return "";
        }
    }

    /* renamed from: a */
    public String mo3781a(C0515x c0515x, String str, int i, int i2, nb nbVar) {
        try {
            if (str.equals("")) {
                try {
                    this.f4345U.m10219a(i, i2, str);
                    if (this.f4340K) {
                        this.cb = m10200g(this.f4345U.m10218a());
                        if (this.f4351m) {
                            this.f4355w = m10196e(this.f4345U.m10218a());
                        }
                    } else {
                        this.f4355w = m10196e(this.f4345U.m10218a());
                    }
                    this.f4338C.modifValeurInterne(m10165a(true, (C1449i) nbVar));
                    this.f4352n = this.f4345U.m10223c();
                    this.f4346b = this.f4345U.m10223c();
                } catch (Exception e) {
                    throw e;
                } catch (Exception e2) {
                    throw e2;
                }
            }
            this.f4352n = i;
            this.f4346b = i;
            String a = m10162a(str.charAt(0), i);
            if (a.equals("")) {
                this.f4352n = c0515x.getDebutSelection();
                this.f4346b = c0515x.getFinSelection();
            } else if (!a.equals(lb[25])) {
                try {
                    this.f4345U.m10219a(i, i2, a);
                    if (this.f4340K) {
                        this.cb = m10200g(this.f4345U.m10218a());
                        if (this.f4351m) {
                            this.f4355w = m10196e(this.f4345U.m10218a());
                        }
                    } else {
                        this.f4355w = m10196e(this.f4345U.m10218a());
                    }
                    this.f4338C.modifValeurInterne(m10165a(true, (C1449i) nbVar));
                } catch (Exception e22) {
                    throw e22;
                } catch (Exception e222) {
                    throw e222;
                }
            }
            return this.f4345U.m10218a();
        } catch (Exception e3) {
            return "";
        }
    }

    /* renamed from: a */
    public String mo3782a(C0515x c0515x, String str, int i, int i2, boolean z, boolean z2, nb nbVar) {
        return null;
    }

    /* renamed from: a */
    public String m10183a(C1449i c1449i) {
        if (c1449i != null) {
            if (c1449i.gb != null) {
                m10183a(null);
                return m10164a(c1449i.gb);
            }
            m10183a(null);
        }
        if (this.gb != null) {
            return m10164a(this.gb);
        }
        if (this.f4340K && this.cb == null) {
            if (this.f4345U != null) {
                this.f4345U.m10220a("");
            }
            return "";
        } else if (this.f4340K || this.f4355w != null) {
            StringBuffer stringBuffer = new StringBuffer();
            StringBuffer stringBuffer2 = new StringBuffer();
            String c1449i2 = c1449i != null ? c1449i.toString() : this.f4341L;
            String toUpperCase = c1449i2.toUpperCase();
            StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(c1449i2);
            char first = stringCharacterIterator.first();
            while (stringCharacterIterator.getIndex() < stringCharacterIterator.getEndIndex()) {
                String d;
                switch (first) {
                    case 'A':
                        if ((this.f4340K && !this.f4351m) || c1449i2.indexOf(lb[23], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                            if (this.f4340K) {
                                if (c1449i2.indexOf(lb[61], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                    if (c1449i2.indexOf(lb[72], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                        stringBuffer.append(qb.f3195j);
                                        break;
                                    }
                                    stringBuffer.append(this.cb.m2528n().substring(2, 4));
                                    stringBuffer2.append(this.cb.m2528n().substring(2, 4));
                                    stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                                    break;
                                }
                                stringBuffer.append(this.cb.m2528n());
                                stringBuffer2.append(this.cb.m2528n());
                                stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                                break;
                            }
                            stringBuffer.append(qb.f3195j);
                            stringBuffer2.append(lb[23]);
                            break;
                        }
                        if (this.f4355w.m2475h().equals(lb[23])) {
                            stringBuffer.append(lb[23]);
                            stringBuffer2.append(lb[23]);
                        } else if (this.f4355w.m2475h().equals(lb[22])) {
                            stringBuffer.append(lb[22]);
                            stringBuffer2.append(lb[22]);
                        } else {
                            stringBuffer.append(lb[22]);
                            stringBuffer2.append(lb[22]);
                        }
                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                        break;
                    case 'C':
                        if (!this.f4340K || this.f4351m) {
                            if (c1449i2.indexOf(lb[69], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                if (c1449i2.indexOf(lb[47], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                    stringBuffer.append(qb.f3208x);
                                    break;
                                }
                                if (this.f4351m && this.f4355w == null) {
                                    stringBuffer.append(hb).append(hb);
                                } else {
                                    stringBuffer.append(this.f4355w.m2482m().substring(0, 2));
                                    stringBuffer2.append(this.f4355w.m2482m().substring(0, 2));
                                }
                                stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                                break;
                            }
                            if (this.f4351m && this.f4355w == null) {
                                stringBuffer.append(hb).append(hb).append(hb);
                            } else {
                                stringBuffer.append(this.f4355w.m2482m());
                                stringBuffer2.append(this.f4355w.m2482m());
                            }
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 2);
                            break;
                        }
                        stringBuffer.append(qb.f3208x);
                        break;
                    case 'D':
                    case 'd':
                        if (this.f4340K) {
                            if (c1449i2.indexOf(lb[67], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                if (c1449i2.indexOf(lb[46], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                    if (toUpperCase.indexOf(lb[48], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                        if (c1449i2.indexOf(lb[51], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                            if (c1449i2.indexOf(lb[68], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                                if (toUpperCase.indexOf(lb[60], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                                    if (c1449i2.indexOf(lb[56], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                                        if (c1449i2.indexOf(C0607n.cf, stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                                            stringBuffer.append(first);
                                                            break;
                                                        }
                                                        if (Integer.parseInt(this.cb.m2526l()) < 10) {
                                                            stringBuffer.append(this.cb.m2526l().charAt(1));
                                                        } else {
                                                            stringBuffer.append(this.cb.m2526l());
                                                        }
                                                        stringBuffer2.append(this.cb.m2526l());
                                                        break;
                                                    }
                                                    stringBuffer.append(this.cb.m2526l());
                                                    stringBuffer2.append(this.cb.m2526l());
                                                    stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                                                    break;
                                                }
                                                stringBuffer.append(this.cb.m2517d());
                                                stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 2);
                                                break;
                                            }
                                            stringBuffer.append(this.cb.m2517d().toUpperCase());
                                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 2);
                                            break;
                                        }
                                        stringBuffer.append(C0808l.m4062t(this.cb.m2517d()));
                                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 2);
                                        break;
                                    }
                                    stringBuffer.append(this.cb.m2532s());
                                    stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                                    break;
                                }
                                stringBuffer.append(this.cb.m2532s().toUpperCase());
                                stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                                break;
                            }
                            stringBuffer.append(C0808l.m4062t(this.cb.m2532s()));
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                            break;
                        }
                        stringBuffer.append(first);
                        break;
                    case 'H':
                        if (!this.f4340K || this.f4351m) {
                            if (c1449i2.indexOf(lb[59], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                if (!this.f4351m || this.f4355w != null) {
                                    if (Integer.parseInt(this.f4355w.m2481l()) < 10) {
                                        stringBuffer.append(this.f4355w.m2481l().charAt(1));
                                    } else {
                                        stringBuffer.append(this.f4355w.m2481l());
                                    }
                                    stringBuffer2.append(this.f4355w.m2481l());
                                    break;
                                }
                                stringBuffer.append(hb);
                                break;
                            }
                            if (this.f4351m && this.f4355w == null) {
                                stringBuffer.append(hb).append(hb);
                            } else {
                                stringBuffer.append(this.f4355w.m2481l());
                                stringBuffer2.append(this.f4355w.m2481l());
                            }
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                            break;
                        }
                        stringBuffer.append(qb.f3200p);
                        break;
                    case 'J':
                    case 'j':
                        if (this.f4340K) {
                            if (c1449i2.indexOf(lb[75], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                if (c1449i2.indexOf(lb[50], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                    if (toUpperCase.indexOf(lb[53], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                        if (c1449i2.indexOf(lb[65], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                            if (c1449i2.indexOf(lb[71], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                                if (toUpperCase.indexOf(lb[66], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                                    if (c1449i2.indexOf(lb[64], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                                        if (c1449i2.indexOf(C0607n.xl, stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                                            stringBuffer.append(first);
                                                            break;
                                                        }
                                                        if (Integer.parseInt(this.cb.m2526l()) < 10) {
                                                            stringBuffer.append(this.cb.m2526l().charAt(1));
                                                        } else {
                                                            stringBuffer.append(this.cb.m2526l());
                                                        }
                                                        stringBuffer2.append(this.cb.m2526l());
                                                        break;
                                                    }
                                                    stringBuffer.append(this.cb.m2526l());
                                                    stringBuffer2.append(this.cb.m2526l());
                                                    stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                                                    break;
                                                }
                                                d = this.cb.m2517d();
                                                if (d.indexOf(46) == d.length() - 1) {
                                                    d = d.substring(0, d.length() - 1);
                                                }
                                                stringBuffer.append(d);
                                                stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 2);
                                                break;
                                            }
                                            d = this.cb.m2517d().toUpperCase();
                                            if (d.indexOf(46) == d.length() - 1) {
                                                d = d.substring(0, d.length() - 1);
                                            }
                                            stringBuffer.append(d);
                                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 2);
                                            break;
                                        }
                                        d = C0808l.m4062t(this.cb.m2517d());
                                        if (d.indexOf(46) == d.length() - 1) {
                                            d = d.substring(0, d.length() - 1);
                                        }
                                        stringBuffer.append(d);
                                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 2);
                                        break;
                                    }
                                    stringBuffer.append(this.cb.m2532s());
                                    stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                                    break;
                                }
                                stringBuffer.append(this.cb.m2532s().toUpperCase());
                                stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                                break;
                            }
                            stringBuffer.append(C0808l.m4062t(this.cb.m2532s()));
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                            break;
                        }
                        stringBuffer.append(first);
                        break;
                    case 'M':
                    case 'm':
                        if (!this.f4340K) {
                            if (toUpperCase.indexOf(lb[52], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                stringBuffer.append(first);
                                break;
                            }
                            stringBuffer.append(this.f4355w.m2485o());
                            stringBuffer2.append(this.f4355w.m2485o());
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                            break;
                        } else if (c1449i2.indexOf(lb[58], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                            if (c1449i2.indexOf(lb[63], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                if (toUpperCase.indexOf(lb[57], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                    if (c1449i2.indexOf(lb[49], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                        if (c1449i2.indexOf(lb[70], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                            if (toUpperCase.indexOf(lb[54], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                                if (c1449i2.indexOf(lb[52], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                                    if (c1449i2.indexOf(lb[73], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex() || !this.f4351m) {
                                                        if (c1449i2.indexOf("M", stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                                            stringBuffer.append(first);
                                                            break;
                                                        }
                                                        if (Integer.parseInt(this.cb.m2535x()) < 10) {
                                                            stringBuffer.append(this.cb.m2535x().charAt(1));
                                                        } else {
                                                            stringBuffer.append(this.cb.m2535x());
                                                        }
                                                        stringBuffer2.append(this.cb.m2535x());
                                                        break;
                                                    }
                                                    if (this.f4355w == null) {
                                                        stringBuffer.append(hb).append(hb);
                                                    } else {
                                                        stringBuffer.append(this.f4355w.m2485o());
                                                        stringBuffer2.append(this.f4355w.m2485o());
                                                    }
                                                    stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                                                    break;
                                                }
                                                stringBuffer.append(this.cb.m2535x());
                                                stringBuffer2.append(this.cb.m2535x());
                                                stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                                                break;
                                            }
                                            d = this.cb.m2534u();
                                            if (d.indexOf(46) == d.length() - 1) {
                                                d = d.substring(0, d.length() - 1);
                                            }
                                            stringBuffer.append(d);
                                            if (!this.f4354v) {
                                                stringBuffer2.append(this.cb.m2535x());
                                            }
                                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 2);
                                            break;
                                        }
                                        d = this.cb.m2534u().toUpperCase();
                                        if (d.indexOf(46) == d.length() - 1) {
                                            d = d.substring(0, d.length() - 1);
                                        }
                                        stringBuffer.append(d);
                                        if (!this.f4354v) {
                                            stringBuffer2.append(this.cb.m2535x());
                                        }
                                        stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 2);
                                        break;
                                    }
                                    d = C0808l.m4062t(this.cb.m2534u());
                                    if (d.indexOf(46) == d.length() - 1) {
                                        d = d.substring(0, d.length() - 1);
                                    }
                                    stringBuffer.append(d);
                                    if (!this.f4354v) {
                                        stringBuffer2.append(this.cb.m2535x());
                                    }
                                    stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 2);
                                    break;
                                }
                                stringBuffer.append(this.cb.m2522h());
                                if (!this.f4354v) {
                                    stringBuffer2.append(this.cb.m2535x());
                                }
                                stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                                break;
                            }
                            stringBuffer.append(this.cb.m2522h().toUpperCase());
                            if (!this.f4354v) {
                                stringBuffer2.append(this.cb.m2535x());
                            }
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                            break;
                        } else {
                            stringBuffer.append(C0808l.m4062t(this.cb.m2522h()));
                            if (!this.f4354v) {
                                stringBuffer2.append(this.cb.m2535x());
                            }
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                            break;
                        }
                    case 'S':
                        if (!this.f4340K || this.f4351m) {
                            if (c1449i2.indexOf(lb[55], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                stringBuffer.append(qb.f3210z);
                                break;
                            }
                            if (this.f4351m && this.f4355w == null) {
                                stringBuffer.append(hb).append(hb);
                            } else {
                                stringBuffer.append(this.f4355w.m2472e());
                                stringBuffer2.append(this.f4355w.m2472e());
                            }
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                            break;
                        }
                        stringBuffer.append(qb.f3210z);
                        break;
                        break;
                    case 'Y':
                        if (this.f4340K) {
                            if (c1449i2.indexOf(lb[62], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                if (c1449i2.indexOf(lb[74], stringCharacterIterator.getIndex()) != stringCharacterIterator.getIndex()) {
                                    stringBuffer.append('Y');
                                    break;
                                }
                                stringBuffer.append(this.cb.m2528n());
                                stringBuffer2.append(this.cb.m2528n());
                                stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 1);
                                break;
                            }
                            stringBuffer.append(this.cb.m2528n());
                            stringCharacterIterator.setIndex(stringCharacterIterator.getIndex() + 3);
                            break;
                        }
                        stringBuffer.append('Y');
                        break;
                    default:
                        stringBuffer.append(first);
                        break;
                }
                first = stringCharacterIterator.next();
            }
            if (c1449i != null && c1449i.f4345U != null) {
                c1449i.f4345U.m10220a(stringBuffer2.toString());
            } else if (this.f4345U != null) {
                this.f4345U.m10220a(stringBuffer2.toString());
            }
            return stringBuffer.toString();
        } else {
            if (this.f4345U != null) {
                this.f4345U.m10220a("");
            }
            return "";
        }
    }

    /* renamed from: a */
    public String m10184a(String str, boolean z) {
        m10185a(str, z, null);
        return ((gc) this.f4338C).getString();
    }

    /* renamed from: a */
    public String m10185a(String str, boolean z, C1449i c1449i) {
        this.f4355w = null;
        this.cb = null;
        String c;
        int parseInt;
        switch (this.f4353u) {
            case 0:
                try {
                    if (!this.f4340K) {
                        this.f4345U.m10220a(str);
                        this.f4355w = m10196e(this.f4345U.m10218a());
                        break;
                    }
                    this.f4345U.m10220a(str);
                    this.cb = m10200g(this.f4345U.m10218a());
                    break;
                } catch (Exception e) {
                    throw e;
                }
            case 1:
                c = m10190c(str);
                try {
                    if (c.length() >= 8) {
                        this.cb = new WDDate();
                        this.cb.m2510a(Integer.parseInt(c.substring(0, 4)));
                        this.cb.m2515b(Integer.parseInt(c.substring(4, 6)));
                        this.cb.m2519e(Integer.parseInt(c.substring(6, 8)));
                        break;
                    }
                    this.cb = null;
                    break;
                } catch (Exception e2) {
                    throw e2;
                }
            case 2:
                c = m10190c(str);
                try {
                    if (c.length() >= 6) {
                        this.cb = new WDDate();
                        this.cb.m2510a(Integer.parseInt(c.substring(0, 2)) + 2000);
                        this.cb.m2515b(Integer.parseInt(c.substring(2, 4)));
                        this.cb.m2519e(Integer.parseInt(c.substring(4, 6)));
                        break;
                    }
                    this.cb = null;
                    break;
                } catch (Exception e22) {
                    throw e22;
                }
            case 3:
                try {
                    if (str.length() >= 10) {
                        this.cb = new WDDate();
                        try {
                            this.cb.m2510a(Integer.parseInt(str.substring(0, 4)));
                            this.cb.m2515b(Integer.parseInt(str.substring(5, 7)));
                            this.cb.m2519e(Integer.parseInt(str.substring(8, 10)));
                            break;
                        } catch (Exception e3) {
                            this.cb = null;
                            break;
                        }
                    }
                    this.cb = null;
                    break;
                } catch (Exception e222) {
                    throw e222;
                }
            case 4:
                c = m10190c(str);
                try {
                    if (c.length() < 2) {
                        this.cb = null;
                        break;
                    }
                    try {
                        this.cb = new WDDate();
                        this.cb.m2519e(Integer.parseInt(c.substring(0, 2)));
                        if (c.length() >= 4) {
                            this.cb.m2515b(Integer.parseInt(c.substring(2, 4)));
                            if (c.length() >= 8) {
                                this.cb.m2510a(Integer.parseInt(c.substring(4, 8)));
                                break;
                            }
                        }
                    } catch (Exception e2222) {
                        throw e2222;
                    } catch (Exception e22222) {
                        throw e22222;
                    }
                } catch (Exception e222222) {
                    throw e222222;
                }
                break;
            case 5:
                c = m10190c(str);
                try {
                    if (c.length() < 2) {
                        this.cb = null;
                        break;
                    }
                    try {
                        this.cb = new WDDate();
                        this.cb.m2519e(Integer.parseInt(c.substring(0, 2)));
                        if (c.length() >= 4) {
                            this.cb.m2515b(Integer.parseInt(c.substring(2, 4)));
                            if (c.length() >= 6) {
                                this.cb.m2510a(Integer.parseInt(c.substring(4, 6)) + 2000);
                                break;
                            }
                        }
                    } catch (Exception e2222222) {
                        throw e2222222;
                    } catch (Exception e22222222) {
                        throw e22222222;
                    }
                } catch (Exception e222222222) {
                    throw e222222222;
                }
                break;
            case 6:
                c = m10190c(str);
                try {
                    if (c.length() < 4) {
                        this.cb = null;
                        break;
                    }
                    try {
                        this.cb = new WDDate();
                        this.cb.m2515b(Integer.parseInt(c.substring(0, 2)));
                        this.cb.m2519e(Integer.parseInt(c.substring(2, 4)));
                        if (c.length() >= 8) {
                            this.cb.m2510a(Integer.parseInt(c.substring(4, 8)));
                            break;
                        }
                    } catch (Exception e2222222222) {
                        throw e2222222222;
                    }
                } catch (Exception e22222222222) {
                    throw e22222222222;
                }
                break;
            case 7:
                c = m10190c(str);
                try {
                    if (c.length() < 4) {
                        this.cb = null;
                        break;
                    }
                    try {
                        this.cb = new WDDate();
                        this.cb.m2515b(Integer.parseInt(c.substring(0, 2)));
                        this.cb.m2519e(Integer.parseInt(c.substring(2, 4)));
                        if (c.length() >= 6) {
                            this.cb.m2510a(Integer.parseInt(c.substring(4, 6)) + 2000);
                            break;
                        }
                    } catch (Exception e222222222222) {
                        throw e222222222222;
                    }
                } catch (Exception e2222222222222) {
                    throw e2222222222222;
                }
                break;
            case 8:
            case 14:
                c = m10190c(str);
                try {
                    if (c.length() < 8) {
                        this.cb = null;
                    } else {
                        this.cb = new WDDate();
                        this.cb.m2510a(Integer.parseInt(c.substring(0, 4)));
                        this.cb.m2515b(Integer.parseInt(c.substring(4, 6)));
                        this.cb.m2519e(Integer.parseInt(c.substring(6, 8)));
                    }
                    try {
                        if (c.length() < 10) {
                            this.f4355w = null;
                            break;
                        }
                        this.f4355w = new WDHeure();
                        if (this.f4339F) {
                            parseInt = Integer.parseInt(c.substring(8, 10));
                            if (parseInt == 0) {
                                try {
                                    this.f4355w.m2476h(12);
                                    this.f4355w.m2469b(lb[23]);
                                } catch (Exception e22222222222222) {
                                    throw e22222222222222;
                                }
                            } else if (parseInt == 12) {
                                try {
                                    this.f4355w.m2476h(12);
                                    this.f4355w.m2469b(lb[22]);
                                } catch (Exception e222222222222222) {
                                    throw e222222222222222;
                                }
                            } else if (parseInt > 12) {
                                try {
                                    this.f4355w.m2476h(parseInt - 12);
                                    this.f4355w.m2469b(lb[22]);
                                } catch (Exception e2222222222222222) {
                                    throw e2222222222222222;
                                }
                            } else {
                                this.f4355w.m2476h(parseInt);
                                this.f4355w.m2469b(lb[23]);
                            }
                        } else {
                            this.f4355w.m2476h(Integer.parseInt(c.substring(8, 10)));
                        }
                        try {
                            if (c.length() < 12) {
                                this.f4355w.m2471c(0);
                                this.f4355w.m2474g(0);
                                break;
                            }
                            try {
                                this.f4355w.m2471c(Integer.parseInt(c.substring(10, 12)));
                                if (c.length() < 14) {
                                    this.f4355w.m2474g(0);
                                    break;
                                }
                                try {
                                    this.f4355w.m2474g(Integer.parseInt(c.substring(12, 14)));
                                    if (this.f4353u == 14) {
                                        if (c.length() >= 17) {
                                            this.f4355w.m2465a(Integer.parseInt(c.substring(14, 17)));
                                            break;
                                        }
                                        this.f4355w.m2465a(0);
                                        break;
                                    }
                                } catch (Exception e22222222222222222) {
                                    throw e22222222222222222;
                                } catch (Exception e222222222222222222) {
                                    throw e222222222222222222;
                                }
                            } catch (Exception e2222222222222222222) {
                                throw e2222222222222222222;
                            }
                        } catch (Exception e22222222222222222222) {
                            throw e22222222222222222222;
                        }
                    } catch (Exception e222222222222222222222) {
                        throw e222222222222222222222;
                    }
                } catch (Exception e2222222222222222222222) {
                    throw e2222222222222222222222;
                }
                break;
            case 9:
                c = m10190c(str);
                try {
                    if (c.length() < 2) {
                        this.f4355w = null;
                        break;
                    }
                    this.f4355w = new WDHeure();
                    if (this.f4339F) {
                        parseInt = Integer.parseInt(c.substring(0, 2));
                        if (parseInt == 0) {
                            try {
                                this.f4355w.m2476h(12);
                                this.f4355w.m2469b(lb[23]);
                            } catch (Exception e22222222222222222222222) {
                                throw e22222222222222222222222;
                            }
                        } else if (parseInt == 12) {
                            try {
                                this.f4355w.m2476h(12);
                                this.f4355w.m2469b(lb[22]);
                            } catch (Exception e222222222222222222222222) {
                                throw e222222222222222222222222;
                            }
                        } else if (parseInt > 12) {
                            try {
                                this.f4355w.m2476h(parseInt - 12);
                                this.f4355w.m2469b(lb[22]);
                            } catch (Exception e2222222222222222222222222) {
                                throw e2222222222222222222222222;
                            }
                        } else {
                            this.f4355w.m2476h(parseInt);
                            this.f4355w.m2469b(lb[23]);
                        }
                    } else {
                        this.f4355w.m2476h(Integer.parseInt(c.substring(0, 2)));
                    }
                    try {
                        if (c.length() >= 4) {
                            this.f4355w.m2471c(Integer.parseInt(c.substring(2, 4)));
                        } else {
                            this.f4355w.m2471c(0);
                        }
                        this.f4355w.m2474g(0);
                        this.f4355w.m2465a(0);
                        break;
                    } catch (Exception e22222222222222222222222222) {
                        throw e22222222222222222222222222;
                    }
                } catch (Exception e222222222222222222222222222) {
                    throw e222222222222222222222222222;
                }
            case 10:
                c = m10190c(str);
                try {
                    if (c.length() < 2) {
                        this.f4355w = null;
                        break;
                    }
                    this.f4355w = new WDHeure();
                    if (this.f4339F) {
                        parseInt = Integer.parseInt(c.substring(0, 2));
                        if (parseInt == 0) {
                            try {
                                this.f4355w.m2476h(12);
                                this.f4355w.m2469b(lb[23]);
                            } catch (Exception e2222222222222222222222222222) {
                                throw e2222222222222222222222222222;
                            }
                        } else if (parseInt == 12) {
                            try {
                                this.f4355w.m2476h(12);
                                this.f4355w.m2469b(lb[22]);
                            } catch (Exception e22222222222222222222222222222) {
                                throw e22222222222222222222222222222;
                            }
                        } else if (parseInt > 12) {
                            try {
                                this.f4355w.m2476h(parseInt - 12);
                                this.f4355w.m2469b(lb[22]);
                            } catch (Exception e222222222222222222222222222222) {
                                throw e222222222222222222222222222222;
                            }
                        } else {
                            this.f4355w.m2476h(parseInt);
                            this.f4355w.m2469b(lb[23]);
                        }
                    } else {
                        this.f4355w.m2476h(Integer.parseInt(c.substring(0, 2)));
                    }
                    try {
                        if (c.length() >= 4) {
                            this.f4355w.m2471c(Integer.parseInt(c.substring(2, 4)));
                            if (c.length() >= 6) {
                                this.f4355w.m2474g(Integer.parseInt(c.substring(4, 6)));
                            } else {
                                this.f4355w.m2474g(0);
                            }
                        } else {
                            this.f4355w.m2471c(0);
                            this.f4355w.m2474g(0);
                        }
                        this.f4355w.m2465a(0);
                        break;
                    } catch (Exception e2222222222222222222222222222222) {
                        throw e2222222222222222222222222222222;
                    } catch (Exception e22222222222222222222222222222222) {
                        throw e22222222222222222222222222222222;
                    }
                } catch (Exception e222222222222222222222222222222222) {
                    throw e222222222222222222222222222222222;
                }
            case 11:
                c = m10190c(str);
                try {
                    if (c.length() < 2) {
                        this.f4355w = null;
                        break;
                    }
                    this.f4355w = new WDHeure();
                    if (this.f4339F) {
                        parseInt = Integer.parseInt(c.substring(0, 2));
                        if (parseInt == 0) {
                            try {
                                this.f4355w.m2476h(12);
                                this.f4355w.m2469b(lb[23]);
                            } catch (Exception e2222222222222222222222222222222222) {
                                throw e2222222222222222222222222222222222;
                            }
                        } else if (parseInt == 12) {
                            try {
                                this.f4355w.m2476h(12);
                                this.f4355w.m2469b(lb[22]);
                            } catch (Exception e22222222222222222222222222222222222) {
                                throw e22222222222222222222222222222222222;
                            }
                        } else if (parseInt > 12) {
                            try {
                                this.f4355w.m2476h(parseInt - 12);
                                this.f4355w.m2469b(lb[22]);
                            } catch (Exception e222222222222222222222222222222222222) {
                                throw e222222222222222222222222222222222222;
                            }
                        } else {
                            this.f4355w.m2476h(parseInt);
                            this.f4355w.m2469b(lb[23]);
                        }
                    } else {
                        this.f4355w.m2476h(Integer.parseInt(c.substring(0, 2)));
                    }
                    try {
                        if (c.length() < 4) {
                            this.f4355w.m2471c(0);
                            this.f4355w.m2474g(0);
                            this.f4355w.m2465a(0);
                            break;
                        }
                        this.f4355w.m2471c(Integer.parseInt(c.substring(2, 4)));
                        if (c.length() < 6) {
                            this.f4355w.m2474g(0);
                            this.f4355w.m2465a(0);
                            break;
                        }
                        try {
                            this.f4355w.m2474g(Integer.parseInt(c.substring(4, 6)));
                            if (c.length() < 8) {
                                this.f4355w.m2465a(0);
                                break;
                            }
                            this.f4355w.m2465a(Integer.parseInt(c.substring(6, 8) + "0"));
                            break;
                        } catch (Exception e2222222222222222222222222222222222222) {
                            throw e2222222222222222222222222222222222222;
                        }
                    } catch (Exception e22222222222222222222222222222222222222) {
                        throw e22222222222222222222222222222222222222;
                    } catch (Exception e222222222222222222222222222222222222222) {
                        throw e222222222222222222222222222222222222222;
                    }
                } catch (Exception e2222222222222222222222222222222222222222) {
                    throw e2222222222222222222222222222222222222222;
                }
            case 12:
                try {
                    if (str.length() >= 2) {
                        try {
                            this.f4355w = new WDHeure();
                            if (this.f4339F) {
                                int parseInt2 = Integer.parseInt(str.substring(0, 2));
                                if (parseInt2 == 0) {
                                    this.f4355w.m2476h(12);
                                    this.f4355w.m2469b(lb[23]);
                                } else if (parseInt2 == 12) {
                                    this.f4355w.m2476h(12);
                                    this.f4355w.m2469b(lb[22]);
                                } else if (parseInt2 > 12) {
                                    this.f4355w.m2476h(parseInt2 - 12);
                                    this.f4355w.m2469b(lb[22]);
                                } else {
                                    this.f4355w.m2476h(parseInt2);
                                    this.f4355w.m2469b(lb[23]);
                                }
                            } else {
                                this.f4355w.m2476h(Integer.parseInt(str.substring(0, 2)));
                            }
                            try {
                                if (str.length() >= 5) {
                                    this.f4355w.m2471c(Integer.parseInt(str.substring(3, 5)));
                                    if (str.length() >= 8) {
                                        this.f4355w.m2474g(Integer.parseInt(str.substring(6, 8)));
                                    } else {
                                        this.f4355w.m2474g(0);
                                    }
                                } else {
                                    this.f4355w.m2471c(0);
                                    this.f4355w.m2474g(0);
                                }
                                this.f4355w.m2465a(0);
                                break;
                            } catch (Exception e22222222222222222222222222222222222222222) {
                                throw e22222222222222222222222222222222222222222;
                            } catch (Exception e222222222222222222222222222222222222222222) {
                                throw e222222222222222222222222222222222222222222;
                            }
                        } catch (Exception e2222222222222222222222222222222222222222222) {
                            throw e2222222222222222222222222222222222222222222;
                        } catch (Exception e22222222222222222222222222222222222222222222) {
                            throw e22222222222222222222222222222222222222222222;
                        } catch (Exception e222222222222222222222222222222222222222222222) {
                            throw e222222222222222222222222222222222222222222222;
                        } catch (Exception e4) {
                            this.f4355w = null;
                            break;
                        }
                    }
                    this.f4355w = null;
                    break;
                } catch (Exception e2222222222222222222222222222222222222222222222) {
                    throw e2222222222222222222222222222222222222222222222;
                }
            case 13:
                try {
                    if (str.length() < 2) {
                        this.cb = null;
                        break;
                    }
                    try {
                        this.cb = new WDDate();
                        this.cb.m2519e(Integer.parseInt(str.substring(0, 2)));
                        if (str.length() >= 5) {
                            this.cb.m2515b(Integer.parseInt(str.substring(3, 5)));
                            if (str.length() >= 10) {
                                this.cb.m2510a(Integer.parseInt(str.substring(6, 10)));
                                break;
                            }
                        }
                    } catch (Exception e22222222222222222222222222222222222222222222222) {
                        throw e22222222222222222222222222222222222222222222222;
                    } catch (Exception e222222222222222222222222222222222222222222222222) {
                        throw e222222222222222222222222222222222222222222222222;
                    }
                } catch (Exception e2222222222222222222222222222222222222222222222222) {
                    throw e2222222222222222222222222222222222222222222222222;
                }
                break;
        }
        this.f4338C.modifValeurInterne(m10165a(z, c1449i));
        return m10183a(c1449i);
    }

    /* renamed from: a */
    public void mo3783a(String str) {
        boolean z = true;
        if (!this.f4349h.equals("")) {
            this.f4349h = new StringBuffer();
            this.bb.clear();
        }
        this.f4337A = -1;
        this.f4343Q = -1;
        if (str.equals(lb[82])) {
            str = this.f4351m ? WDProjet.getInstance().getFormatMasqueDate() + " " + WDProjet.getInstance().getFormatMasqueHeure() : this.f4340K ? WDProjet.getInstance().getFormatMasqueDate() : WDProjet.getInstance().getFormatMasqueHeure();
        } else if (str.equals(f4306E)) {
            str = WDProjet.getInstance().getFormatMasqueDate();
            this.f4348e = true;
        } else if (str.equals(f4314R)) {
            str = WDProjet.getInstance().getFormatMasqueHeure();
            this.f4348e = true;
        } else if (str.equals(f4315S)) {
            str = WDProjet.getInstance().getFormatMasqueDate() + " " + C0808l.m4018a(WDProjet.getInstance().getFormatMasqueHeure(), lb[52], lb[73]);
        } else if (str.equals(f4328o)) {
            String str2 = "";
            this.f4345U = null;
            this.gb = new C1458s();
            return;
        }
        this.f4341L = str;
        if (!(m10206l() || m10204i())) {
            z = false;
        }
        this.f4354v = z;
        this.f4345U.m10222b(m10170f(str));
        this.f4339F = m10171g();
    }

    /* renamed from: b */
    public int mo3784b() {
        return this.f4346b;
    }

    /* renamed from: b */
    public String m10188b(char c, C1461v c1461v, int i, int i2) {
        if (i2 != 0) {
            char charAt = this.f4345U.m10218a().charAt(c1461v.m10290c() - this.f4344T);
            if (charAt != hb) {
                int parseInt = Integer.parseInt("" + charAt + c);
                if (parseInt <= 0 || parseInt > 12) {
                    return "";
                }
                m10166a(i, c1461v);
                return "" + c;
            }
            this.f4352n = i;
            this.f4346b = i;
            return "";
        } else if (c == '0' || c == '1') {
            try {
                this.f4352n = i + 1;
                this.f4346b = i + 2;
                return "" + c;
            } catch (Exception e) {
            }
        } else {
            m10166a(i, c1461v);
            return "0" + c;
        }
    }

    /* renamed from: c */
    public String m10189c(char c, C1461v c1461v, int i, int i2) {
        if (i2 == 0) {
            switch (c) {
                case '0':
                    this.f4352n = i + 3;
                    this.f4346b = i + 4;
                    return lb[45] + c;
                case '1':
                case '2':
                    this.f4352n = i + 1;
                    this.f4346b = i + 2;
                    return "" + c;
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    this.f4352n = i + 3;
                    this.f4346b = i + 4;
                    return lb[44] + c;
            }
        }
        if (i2 < 3) {
            this.f4352n = i + 1;
            this.f4346b = i + 2;
        } else {
            m10166a(i, c1461v);
        }
        return "" + c;
    }

    /* renamed from: c */
    public String m10190c(String str) {
        StringBuffer stringBuffer = new StringBuffer("");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isDigit(charAt)) {
                return stringBuffer.toString();
            }
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public void mo3785c() {
        this.f4341L = null;
        this.f4349h = null;
        if (this.bb != null) {
            this.bb.clear();
            this.bb = null;
        }
        this.cb = null;
        this.f4355w = null;
        this.f4338C = null;
        if (this.f4345U != null) {
            this.f4345U.m10221b();
            this.f4345U = null;
        }
    }

    /* renamed from: d */
    public String m10192d(char c, C1461v c1461v, int i, int i2) {
        if (!this.f4339F) {
            return m10180a(c, c1461v, i, i2, lb[1], lb[18]);
        } else if (c1461v.m10289b() == 11) {
            return m10188b(c, c1461v, i, i2);
        } else {
            return m10180a(c, c1461v, i, i2, lb[20], lb[19]);
        }
    }

    /* renamed from: d */
    public void m10193d(String str) {
        this.f4353u = C1449i.m10172h(str);
        this.f4351m = m10175n();
    }

    /* renamed from: d */
    public boolean mo3786d() {
        return false;
    }

    /* renamed from: e */
    public int m10195e() {
        return 0;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: e */
    public fr.pcsoft.wdjava.core.types.WDHeure m10196e(java.lang.String r13) {
        /*
        r12 = this;
        r7 = "";
        r6 = "";
        r5 = "";
        r4 = "";
        r2 = "";
        r1 = "";
        r0 = r13.length();	 Catch:{ Exception -> 0x008c }
        r3 = r12.bb;	 Catch:{ Exception -> 0x008c }
        r3 = r3.size();	 Catch:{ Exception -> 0x008c }
        if (r0 >= r3) goto L_0x001a;
    L_0x0018:
        r0 = 0;
    L_0x0019:
        return r0;
    L_0x001a:
        r0 = r12.bb;	 Catch:{ Exception -> 0x008c }
        r8 = r0.iterator();	 Catch:{ Exception -> 0x008c }
    L_0x0020:
        r0 = r8.hasNext();	 Catch:{ Exception -> 0x008c }
        if (r0 == 0) goto L_0x0233;
    L_0x0026:
        r0 = r8.next();	 Catch:{ Exception -> 0x008c }
        r0 = (fr.pcsoft.wdjava.ui.p083l.C1461v) r0;	 Catch:{ Exception -> 0x008c }
        if (r0 != 0) goto L_0x003b;
    L_0x002e:
        r0 = r1;
        r3 = r4;
        r1 = r2;
        r4 = r6;
        r2 = r5;
        r5 = r7;
    L_0x0034:
        r6 = r4;
        r7 = r5;
        r4 = r3;
        r5 = r2;
        r2 = r1;
        r1 = r0;
        goto L_0x0020;
    L_0x003b:
        r3 = r0.m10290c();	 Catch:{ Exception -> 0x008c }
        r9 = r12.f4344T;	 Catch:{ Exception -> 0x008c }
        r3 = r3 - r9;
        r9 = r0.m10290c();	 Catch:{ Exception -> 0x008c }
        r10 = r12.f4344T;	 Catch:{ Exception -> 0x008c }
        r9 = r9 - r10;
        r10 = r0.m10287a();	 Catch:{ Exception -> 0x008c }
        r9 = r9 + r10;
        r3 = r13.substring(r3, r9);	 Catch:{ Exception -> 0x008c }
        r0 = r0.m10289b();	 Catch:{ Exception -> 0x008a }
        switch(r0) {
            case 10: goto L_0x0060;
            case 11: goto L_0x0060;
            case 12: goto L_0x00d9;
            case 13: goto L_0x0115;
            case 14: goto L_0x014f;
            case 15: goto L_0x0059;
            case 16: goto L_0x01f8;
            case 17: goto L_0x0187;
            default: goto L_0x0059;
        };	 Catch:{ Exception -> 0x008a }
    L_0x0059:
        r0 = r1;
        r3 = r4;
        r1 = r2;
        r4 = r6;
        r2 = r5;
        r5 = r7;
        goto L_0x0034;
    L_0x0060:
        r0 = 95;
        r0 = r3.indexOf(r0);	 Catch:{ Exception -> 0x008a }
        r9 = -1;
        if (r0 != r9) goto L_0x008f;
    L_0x0069:
        r0 = r3;
    L_0x006a:
        r3 = r12.f4339F;	 Catch:{ Exception -> 0x00b1 }
        if (r3 == 0) goto L_0x029c;
    L_0x006e:
        r3 = "";
        r3 = r0.equals(r3);	 Catch:{ Exception -> 0x00b1 }
        if (r3 != 0) goto L_0x029c;
    L_0x0076:
        r3 = java.lang.Integer.parseInt(r0);	 Catch:{ Exception -> 0x00cd }
        if (r3 != 0) goto L_0x00b3;
    L_0x007c:
        r0 = lb;	 Catch:{ Exception -> 0x00cd }
        r3 = 19;
        r0 = r0[r3];	 Catch:{ Exception -> 0x00cd }
    L_0x0082:
        r3 = r4;
        r4 = r6;
        r11 = r1;
        r1 = r2;
        r2 = r5;
        r5 = r0;
        r0 = r11;
        goto L_0x0034;
    L_0x008a:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        r0 = 0;
        goto L_0x0019;
    L_0x008f:
        r0 = 0;
        r0 = r3.charAt(r0);	 Catch:{ Exception -> 0x008c }
        r9 = 95;
        if (r0 == r9) goto L_0x02a5;
    L_0x0098:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x008c }
        r0.<init>();	 Catch:{ Exception -> 0x008c }
        r7 = "0";
        r0 = r0.append(r7);	 Catch:{ Exception -> 0x008c }
        r7 = 0;
        r3 = r3.charAt(r7);	 Catch:{ Exception -> 0x008c }
        r0 = r0.append(r3);	 Catch:{ Exception -> 0x008c }
        r0 = r0.toString();	 Catch:{ Exception -> 0x008c }
        goto L_0x006a;
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x008c }
    L_0x00b3:
        r7 = 12;
        if (r3 <= r7) goto L_0x0082;
    L_0x00b7:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00cd }
        r0.<init>();	 Catch:{ Exception -> 0x00cd }
        r7 = "";
        r0 = r0.append(r7);	 Catch:{ Exception -> 0x00cd }
        r3 = r3 + -12;
        r0 = r0.append(r3);	 Catch:{ Exception -> 0x00cd }
        r0 = r0.toString();	 Catch:{ Exception -> 0x00cd }
        goto L_0x0082;
    L_0x00cd:
        r0 = move-exception;
        r0 = "";
        r3 = r4;
        r4 = r6;
        r11 = r1;
        r1 = r2;
        r2 = r5;
        r5 = r0;
        r0 = r11;
        goto L_0x0034;
    L_0x00d9:
        r0 = 95;
        r0 = r3.indexOf(r0);	 Catch:{ Exception -> 0x008c }
        r9 = -1;
        if (r0 != r9) goto L_0x00eb;
    L_0x00e2:
        r0 = r1;
        r1 = r2;
        r2 = r5;
        r5 = r7;
        r11 = r3;
        r3 = r4;
        r4 = r11;
        goto L_0x0034;
    L_0x00eb:
        r0 = 0;
        r0 = r3.charAt(r0);	 Catch:{ Exception -> 0x008c }
        r9 = 95;
        if (r0 == r9) goto L_0x0059;
    L_0x00f4:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x008c }
        r0.<init>();	 Catch:{ Exception -> 0x008c }
        r6 = "0";
        r0 = r0.append(r6);	 Catch:{ Exception -> 0x008c }
        r6 = 0;
        r3 = r3.charAt(r6);	 Catch:{ Exception -> 0x008c }
        r0 = r0.append(r3);	 Catch:{ Exception -> 0x008c }
        r3 = r0.toString();	 Catch:{ Exception -> 0x008c }
        r0 = r1;
        r1 = r2;
        r2 = r5;
        r5 = r7;
        r11 = r3;
        r3 = r4;
        r4 = r11;
        goto L_0x0034;
    L_0x0115:
        r0 = 95;
        r0 = r3.indexOf(r0);	 Catch:{ Exception -> 0x008c }
        r9 = -1;
        if (r0 != r9) goto L_0x0126;
    L_0x011e:
        r0 = r1;
        r5 = r7;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r6;
        goto L_0x0034;
    L_0x0126:
        r0 = 0;
        r0 = r3.charAt(r0);	 Catch:{ Exception -> 0x008c }
        r9 = 95;
        if (r0 == r9) goto L_0x0059;
    L_0x012f:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x008c }
        r0.<init>();	 Catch:{ Exception -> 0x008c }
        r5 = "0";
        r0 = r0.append(r5);	 Catch:{ Exception -> 0x008c }
        r5 = 0;
        r3 = r3.charAt(r5);	 Catch:{ Exception -> 0x008c }
        r0 = r0.append(r3);	 Catch:{ Exception -> 0x008c }
        r3 = r0.toString();	 Catch:{ Exception -> 0x008c }
        r0 = r1;
        r5 = r7;
        r1 = r2;
        r2 = r3;
        r3 = r4;
        r4 = r6;
        goto L_0x0034;
    L_0x014f:
        r0 = 95;
        r0 = r3.indexOf(r0);	 Catch:{ Exception -> 0x008c }
        r9 = -1;
        if (r0 != r9) goto L_0x015f;
    L_0x0158:
        r0 = r1;
        r4 = r6;
        r1 = r2;
        r2 = r5;
        r5 = r7;
        goto L_0x0034;
    L_0x015f:
        r0 = 0;
        r0 = r3.charAt(r0);	 Catch:{ Exception -> 0x008c }
        r9 = 95;
        if (r0 == r9) goto L_0x0059;
    L_0x0168:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x008c }
        r0.<init>();	 Catch:{ Exception -> 0x008c }
        r4 = "0";
        r0 = r0.append(r4);	 Catch:{ Exception -> 0x008c }
        r4 = 0;
        r3 = r3.charAt(r4);	 Catch:{ Exception -> 0x008c }
        r0 = r0.append(r3);	 Catch:{ Exception -> 0x008c }
        r3 = r0.toString();	 Catch:{ Exception -> 0x008c }
        r0 = r1;
        r4 = r6;
        r1 = r2;
        r2 = r5;
        r5 = r7;
        goto L_0x0034;
    L_0x0187:
        r0 = 95;
        r0 = r3.indexOf(r0);	 Catch:{ Exception -> 0x008c }
        r9 = -1;
        if (r0 != r9) goto L_0x0198;
    L_0x0190:
        r0 = r1;
        r2 = r5;
        r1 = r3;
        r5 = r7;
        r3 = r4;
        r4 = r6;
        goto L_0x0034;
    L_0x0198:
        r0 = 0;
        r0 = r3.charAt(r0);	 Catch:{ Exception -> 0x008c }
        r9 = 95;
        if (r0 == r9) goto L_0x01c5;
    L_0x01a1:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x008c }
        r0.<init>();	 Catch:{ Exception -> 0x008c }
        r2 = lb;	 Catch:{ Exception -> 0x008c }
        r9 = 1;
        r2 = r2[r9];	 Catch:{ Exception -> 0x008c }
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x008c }
        r2 = 0;
        r2 = r3.charAt(r2);	 Catch:{ Exception -> 0x008c }
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x008c }
        r0 = r0.toString();	 Catch:{ Exception -> 0x008c }
        r3 = r4;
        r2 = r5;
        r4 = r6;
        r5 = r7;
        r11 = r1;
        r1 = r0;
        r0 = r11;
        goto L_0x0034;
    L_0x01c5:
        r0 = 1;
        r0 = r3.charAt(r0);	 Catch:{ Exception -> 0x008c }
        r9 = 95;
        if (r0 == r9) goto L_0x0059;
    L_0x01ce:
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x008c }
        r0.<init>();	 Catch:{ Exception -> 0x008c }
        r2 = "0";
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x008c }
        r2 = 0;
        r2 = r3.charAt(r2);	 Catch:{ Exception -> 0x008c }
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x008c }
        r2 = 1;
        r2 = r3.charAt(r2);	 Catch:{ Exception -> 0x008c }
        r0 = r0.append(r2);	 Catch:{ Exception -> 0x008c }
        r0 = r0.toString();	 Catch:{ Exception -> 0x008c }
        r3 = r4;
        r2 = r5;
        r4 = r6;
        r5 = r7;
        r11 = r1;
        r1 = r0;
        r0 = r11;
        goto L_0x0034;
    L_0x01f8:
        r0 = lb;	 Catch:{ Exception -> 0x008c }
        r1 = 23;
        r0 = r0[r1];	 Catch:{ Exception -> 0x008c }
        r0 = r3.equals(r0);	 Catch:{ Exception -> 0x008c }
        if (r0 == 0) goto L_0x0211;
    L_0x0204:
        r0 = lb;	 Catch:{ Exception -> 0x008c }
        r1 = 23;
        r0 = r0[r1];	 Catch:{ Exception -> 0x008c }
        r1 = r2;
        r3 = r4;
        r2 = r5;
        r4 = r6;
        r5 = r7;
        goto L_0x0034;
    L_0x0211:
        r0 = lb;	 Catch:{ Exception -> 0x008c }
        r1 = 22;
        r0 = r0[r1];	 Catch:{ Exception -> 0x008c }
        r0 = r3.equals(r0);	 Catch:{ Exception -> 0x008c }
        if (r0 == 0) goto L_0x022a;
    L_0x021d:
        r0 = lb;	 Catch:{ Exception -> 0x008c }
        r1 = 22;
        r0 = r0[r1];	 Catch:{ Exception -> 0x008c }
        r1 = r2;
        r3 = r4;
        r2 = r5;
        r4 = r6;
        r5 = r7;
        goto L_0x0034;
    L_0x022a:
        r0 = "";
        r1 = r2;
        r3 = r4;
        r2 = r5;
        r4 = r6;
        r5 = r7;
        goto L_0x0034;
    L_0x0233:
        r0 = "";
        r0 = r7.equals(r0);	 Catch:{ Exception -> 0x008c }
        if (r0 == 0) goto L_0x023e;
    L_0x023b:
        r0 = 0;
        goto L_0x0019;
    L_0x023e:
        r0 = "";
        r0 = r6.equals(r0);	 Catch:{ Exception -> 0x008c }
        if (r0 == 0) goto L_0x024b;
    L_0x0246:
        r0 = lb;	 Catch:{ Exception -> 0x008c }
        r3 = 1;
        r6 = r0[r3];	 Catch:{ Exception -> 0x008c }
    L_0x024b:
        r0 = "";
        r0 = r5.equals(r0);	 Catch:{ Exception -> 0x008c }
        if (r0 == 0) goto L_0x0258;
    L_0x0253:
        r0 = lb;	 Catch:{ Exception -> 0x008c }
        r3 = 1;
        r5 = r0[r3];	 Catch:{ Exception -> 0x008c }
    L_0x0258:
        r0 = "";
        r0 = r4.equals(r0);	 Catch:{ Exception -> 0x008c }
        if (r0 == 0) goto L_0x0265;
    L_0x0260:
        r0 = lb;	 Catch:{ Exception -> 0x008c }
        r3 = 1;
        r4 = r0[r3];	 Catch:{ Exception -> 0x008c }
    L_0x0265:
        r0 = new fr.pcsoft.wdjava.core.types.WDHeure;	 Catch:{ Exception -> 0x008c }
        r3 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x008c }
        r3.<init>();	 Catch:{ Exception -> 0x008c }
        r3 = r3.append(r7);	 Catch:{ Exception -> 0x008c }
        r3 = r3.append(r6);	 Catch:{ Exception -> 0x008c }
        r3 = r3.append(r5);	 Catch:{ Exception -> 0x008c }
        r3 = r3.toString();	 Catch:{ Exception -> 0x008c }
        r0.<init>(r3);	 Catch:{ Exception -> 0x008c }
        r0.m2469b(r1);	 Catch:{ Exception -> 0x0293 }
        r1 = "";
        r1 = r2.equals(r1);	 Catch:{ Exception -> 0x0293 }
        if (r1 != 0) goto L_0x0295;
    L_0x028a:
        r1 = java.lang.Integer.parseInt(r2);	 Catch:{ Exception -> 0x0293 }
    L_0x028e:
        r0.m2465a(r1);	 Catch:{ Exception -> 0x008c }
        goto L_0x0019;
    L_0x0293:
        r0 = move-exception;
        throw r0;	 Catch:{ Exception -> 0x008c }
    L_0x0295:
        r1 = java.lang.Integer.parseInt(r4);	 Catch:{ Exception -> 0x008c }
        r1 = r1 * 10;
        goto L_0x028e;
    L_0x029c:
        r3 = r4;
        r4 = r6;
        r11 = r1;
        r1 = r2;
        r2 = r5;
        r5 = r0;
        r0 = r11;
        goto L_0x0034;
    L_0x02a5:
        r0 = r7;
        goto L_0x006a;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.ui.l.i.e(java.lang.String):fr.pcsoft.wdjava.core.types.WDHeure");
    }

    /* renamed from: e */
    public String m10197e(char c, C1461v c1461v, int i, int i2) {
        if (i2 == 0) {
            if (Character.toUpperCase(c) == qb.f3195j) {
                m10166a(i, c1461v);
                return lb[23];
            } else if (Character.toUpperCase(c) == 'P') {
                m10166a(i, c1461v);
                return lb[22];
            }
        }
        return "";
    }

    /* renamed from: f */
    public WDHeure m10198f() {
        return this.f4355w;
    }

    /* renamed from: f */
    public String m10199f(char c, C1461v c1461v, int i, int i2) {
        return m10180a(c, c1461v, i, i2, lb[1], lb[0]);
    }

    /* renamed from: g */
    public WDDate m10200g(String str) {
        String str2 = "";
        String str3 = "";
        String str4 = "";
        Iterator it = this.bb.iterator();
        while (it.hasNext()) {
            String str5;
            C1461v c1461v = (C1461v) it.next();
            if (c1461v == null) {
                str5 = str4;
                str4 = str3;
                str3 = str2;
            } else {
                String substring = str.substring(c1461v.m10290c() - this.f4344T, (c1461v.m10290c() - this.f4344T) + c1461v.m10287a());
                try {
                    String str6;
                    switch (c1461v.m10289b()) {
                        case 0:
                            str5 = substring.indexOf(95) == -1 ? substring : substring.indexOf(95) == 3 ? substring.substring(0, 3) + "0" : str2;
                            it.next();
                            it.next();
                            it.next();
                            str6 = str4;
                            str4 = str3;
                            str3 = str5;
                            str5 = str6;
                            break;
                        case 1:
                            str5 = substring.indexOf(95) == -1 ? lb[45] + substring : str2;
                            it.next();
                            str6 = str4;
                            str4 = str3;
                            str3 = str5;
                            str5 = str6;
                            break;
                        case 4:
                            str5 = substring.indexOf(95) == -1 ? substring : substring.charAt(0) != hb ? "0" + substring.charAt(0) : str4;
                            it.next();
                            str4 = str3;
                            str3 = str2;
                            break;
                        case 5:
                            str5 = substring.indexOf(95) == -1 ? substring : substring.charAt(0) != hb ? "0" + substring.charAt(0) : str4;
                            it.next();
                            str4 = str3;
                            str3 = str2;
                            break;
                        case 8:
                            str5 = substring.indexOf(95) == -1 ? substring : substring.charAt(0) != hb ? "0" + substring.charAt(0) : str3;
                            it.next();
                            str3 = str2;
                            str6 = str5;
                            str5 = str4;
                            str4 = str6;
                            break;
                        case 9:
                            str5 = substring.indexOf(95) == -1 ? substring : substring.charAt(0) != hb ? "0" + substring.charAt(0) : str3;
                            it.next();
                            str3 = str2;
                            str6 = str5;
                            str5 = str4;
                            str4 = str6;
                            break;
                        default:
                            str5 = str4;
                            str4 = str3;
                            str3 = str2;
                            break;
                    }
                } catch (Exception e) {
                    throw e;
                } catch (Exception e2) {
                    throw e2;
                } catch (Exception e3) {
                    return null;
                }
            }
            str2 = str3;
            str3 = str4;
            str4 = str5;
        }
        if (str3.equals("")) {
            if (this.f4341L.indexOf(C0607n.xl) != -1) {
                return null;
            }
            str3 = lb[20];
        }
        if (str4.equals("")) {
            str4 = m10174k();
        }
        if (str2.equals("")) {
            str2 = m10173h();
        }
        return new WDDate(str2 + str4 + str3);
    }

    /* renamed from: g */
    public String m10201g(char c, C1461v c1461v, int i, int i2) {
        if (i2 != 0) {
            char charAt = this.f4345U.m10218a().charAt(c1461v.m10290c() - this.f4344T);
            if (charAt != hb) {
                int parseInt = Integer.parseInt("" + charAt + c);
                if (parseInt <= 0 || parseInt > 31) {
                    return "";
                }
                m10166a(i, c1461v);
                return "" + c;
            }
            return "";
        } else if (c == '1' || c == '2' || c == '3' || c == '0') {
            try {
                this.f4352n = i + 1;
                this.f4346b = i + 2;
                return "" + c;
            } catch (Exception e) {
            }
        } else {
            m10166a(i, c1461v);
            return "0" + c;
        }
    }

    /* renamed from: h */
    public String m10202h(char c, C1461v c1461v, int i, int i2) {
        return m10180a(c, c1461v, i, i2, lb[1], lb[24]);
    }

    /* renamed from: i */
    public String m10203i(char c, C1461v c1461v, int i, int i2) {
        return m10180a(c, c1461v, i, i2, lb[17], lb[16]);
    }

    /* renamed from: i */
    public boolean m10204i() {
        return this.f4341L.matches(lb[26]);
    }

    /* renamed from: j */
    public final boolean m10205j() {
        return this.f4348e;
    }

    /* renamed from: l */
    public boolean m10206l() {
        return this.f4341L.matches(lb[21]);
    }

    /* renamed from: m */
    public WDDate m10207m() {
        return this.cb;
    }

    /* renamed from: o */
    public String m10208o() {
        return this.f4345U.m10218a();
    }

    public String toString() {
        return this.f4341L;
    }
}
