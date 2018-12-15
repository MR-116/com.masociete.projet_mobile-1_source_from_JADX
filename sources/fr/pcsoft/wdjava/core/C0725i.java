package fr.pcsoft.wdjava.core;

import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.poo.C0735q;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0782g;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDDate;
import fr.pcsoft.wdjava.core.types.WDDateHeure;
import fr.pcsoft.wdjava.core.types.WDDuree;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDEntier8;
import fr.pcsoft.wdjava.core.types.WDHeure;
import fr.pcsoft.wdjava.core.types.fb;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import fr.pcsoft.wdjava.ui.p065b.p067a.C1084x;
import fr.pcsoft.wdjava.ui.p065b.p067a.qb;
import fr.pcsoft.wdjava.ui.p083l.C1449i;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: fr.pcsoft.wdjava.core.i */
public class C0725i {
    /* renamed from: a */
    private static ThreadLocal<SimpleDateFormat> f1836a = null;
    /* renamed from: b */
    private static Pattern f1837b = null;
    /* renamed from: c */
    private static ThreadLocal<GregorianCalendar> f1838c = null;
    /* renamed from: d */
    private static Pattern f1839d = null;
    /* renamed from: e */
    private static ThreadLocal<GregorianCalendar> f1840e = null;
    /* renamed from: f */
    private static Pattern f1841f = null;
    /* renamed from: g */
    private static ThreadLocal<SimpleDateFormat> f1842g = null;
    /* renamed from: h */
    private static ThreadLocal<SimpleDateFormat> f1843h = null;
    /* renamed from: z */
    private static final String[] f1844z;

    static {
        String[] strArr = new String[C0607n.hu];
        strArr[0] = C0725i.m3085z(C0725i.m3086z("+4dKL+4d"));
        strArr[1] = C0725i.m3085z(C0725i.m3086z("b}-\u00021V`0"));
        strArr[2] = C0725i.m3085z(C0725i.m3086z("b}-\u00021V`034vi'\b/HW"));
        strArr[3] = C0725i.m3085z(C0725i.m3086z("+5fHH.2cCEzf7\u001f\u0019}c<\u0012\u0016ph9\u0015\u0013ko&\b\bnr#\u0003\u0005a"));
        strArr[4] = C0725i.m3085z(C0725i.m3086z("e \u001e"));
        strArr[5] = C0725i.m3085z(C0725i.m3086z("rj "));
        strArr[6] = C0725i.m3085z(C0725i.m3086z("om9\u001e"));
        strArr[7] = C0725i.m3085z(C0725i.m3086z("q&\u001a\brk:"));
        strArr[8] = C0725i.m3085z(C0725i.m3086z("wk:\u001c"));
        strArr[9] = C0725i.m3085z(C0725i.m3086z("yk;\u0017\u0019zj"));
        strArr[10] = C0725i.m3085z(C0725i.m3086z("e \u001e(ri1"));
        strArr[11] = C0725i.m3085z(C0725i.m3086z("hp&\u0012\u0012|"));
        strArr[12] = C0725i.m3085z(C0725i.m3086z("kg'A\u0018~g=\u0016\u001dw"));
        strArr[13] = C0725i.m3085z(C0725i.m3086z("k!\u0019\u0010~"));
        strArr[14] = C0725i.m3085z(C0725i.m3086z("kg'A\u001fnv&\u001e\u0012x}"));
        strArr[15] = C0725i.m3085z(C0725i.m3086z("HW"));
        strArr[16] = C0725i.m3085z(C0725i.m3086z("WH\u0018"));
        strArr[17] = C0725i.m3085z(C0725i.m3086z("SL"));
        strArr[18] = C0725i.m3085z(C0725i.m3086z("WH"));
        strArr[19] = C0725i.m3085z(C0725i.m3086z("VI"));
        strArr[20] = C0725i.m3085z(C0725i.m3086z("**w22]"));
        strArr[21] = C0725i.m3085z(C0725i.m3086z("NP\u0017"));
        strArr[22] = C0725i.m3085z(C0725i.m3086z("NP\u0012VM-H\u0011"));
        strArr[23] = C0725i.m3085z(C0725i.m3086z("8A\u0006)#OE\u001d70^[\u000e42^[\u0016.:]A\u0006"));
        strArr[24] = C0725i.m3085z(C0725i.m3086z("8G\u001b5/OE\u001a/9DM\u001a-=WM\u0010>"));
        strArr[25] = C0725i.m3085z(C0725i.m3086z("Nw1(\u0005hp1\u00161zw?"));
        strArr[26] = C0725i.m3085z(C0725i.m3086z("KI"));
        strArr[27] = C0725i.m3085z(C0725i.m3086z("ZT"));
        strArr[28] = C0725i.m3085z(C0725i.m3086z("XG"));
        strArr[29] = C0725i.m3085z(C0725i.m3086z("^j7\u0014\u0018zc1[\u0012tjt\b\tkt;\t\bò$n["));
        strArr[30] = C0725i.m3085z(C0725i.m3086z("8J\u001b/5]M\u0017:(RK\u001a$=XP\u001d42"));
        strArr[31] = C0725i.m3085z(C0725i.m3086z("8A\u001a/5^V\u000bC"));
        strArr[32] = C0725i.m3085z(C0725i.m3086z("8G\u001c:1K[\u0012>2^P\u0006>#RJ\u0000>.UA"));
        strArr[33] = C0725i.m3085z(C0725i.m3086z("8V\u001158^^\u000b-3NW"));
        strArr[34] = C0725i.m3085z(C0725i.m3086z("8L\u000060"));
        strArr[35] = C0725i.m3085z(C0725i.m3086z("8I\u00115)"));
        strArr[36] = C0725i.m3085z(C0725i.m3086z("8F\u001b.(TJ"));
        strArr[37] = C0725i.m3085z(C0725i.m3086z("8C\u0006:,SA"));
        strArr[38] = C0725i.m3085z(C0725i.m3086z("8@\u0015/9"));
        strArr[39] = C0725i.m3085z(C0725i.m3086z("8S\u0007$?WM\u00115("));
        strArr[40] = C0725i.m3085z(C0725i.m3086z("8W\u0000))XP\u0001)9"));
        strArr[41] = C0725i.m3085z(C0725i.m3086z("8M\u001a((ZJ\u0017>"));
        strArr[42] = C0725i.m3085z(C0725i.m3086z("OE\u001679ZQ\u000b:/HK\u00172=OM\u0012"));
        strArr[43] = C0725i.m3085z(C0725i.m3086z("8\\\u0007?#^J\u00002(^"));
        strArr[44] = C0725i.m3085z(C0725i.m3086z("8A\u0002>2^I\u00115("));
        strArr[45] = C0725i.m3085z(C0725i.m3086z("8^\u001b59DV\u0011+9OA\u0011"));
        strArr[46] = C0725i.m3085z(C0725i.m3086z("8B\u001b)1^"));
        strArr[47] = C0725i.m3085z(C0725i.m3086z("8G\u001b6>T"));
        strArr[48] = C0725i.m3085z(C0725i.m3086z("8G\u001c:5UA"));
        strArr[49] = C0725i.m3085z(C0725i.m3086z("8W\u001179XP\u0011.."));
        strArr[50] = C0725i.m3085z(C0725i.m3086z("8A\u001a/5^V"));
        strArr[51] = C0725i.m3085z(C0725i.m3086z("8P\u001590^"));
        strArr[52] = C0725i.m3085z(C0725i.m3086z("8W\u001b..XA\u000b?3UJ\u0011>/"));
        strArr[53] = C0725i.m3085z(C0725i.m3086z("8G\u001c:1K[\u0019.0OM\u0019>8RE"));
        strArr[54] = C0725i.m3085z(C0725i.m3086z("KM\u0018>#]M\u0018>#WM\u0007/9"));
        strArr[55] = C0725i.m3085z(C0725i.m3086z("8G\u001b?9DF\u0015).^W"));
        strArr[56] = C0725i.m3085z(C0725i.m3086z("8T\u0018:2UM\u001a<"));
        strArr[57] = C0725i.m3085z(C0725i.m3086z("8I\u0011(/ZC\u0011)5^[\u001d5/OE\u001a/=UA\u0011"));
        strArr[58] = C0725i.m3085z(C0725i.m3086z("8G\u001b5(ZG\u0000$/TQ\u000689"));
        strArr[59] = C0725i.m3085z(C0725i.m3086z("8\\\u00197#UE\u0019>/KE\u0017>"));
        strArr[60] = C0725i.m3085z(C0725i.m3086z("8A\u001a.1^V\u0015/5TJ"));
        strArr[61] = C0725i.m3085z(C0725i.m3086z("8P\u001179KL\u001b59"));
        strArr[62] = C0725i.m3085z(C0725i.m3086z("8\\\u00197#_K\u0017.1^J\u0000"));
        strArr[63] = C0725i.m3085z(C0725i.m3086z("8G\u0015)(^"));
        strArr[64] = C0725i.m3085z(C0725i.m3086z("8G\u001c:1K[\u0017:1^V\u0015"));
        strArr[65] = C0725i.m3085z(C0725i.m3086z("8L\u0011..^"));
        strArr[66] = C0725i.m3085z(C0725i.m3086z("8P\r+9D@\u001d53"));
        strArr[67] = C0725i.m3085z(C0725i.m3086z("8J\u000169IM\u0005.9"));
        strArr[68] = C0725i.m3085z(C0725i.m3086z("8E\u0010)9HW\u0011$9VE\u001d7"));
        strArr[69] = C0725i.m3085z(C0725i.m3086z("8V\u0011>0"));
        strArr[70] = C0725i.m3085z(C0725i.m3086z("8E\u0010)9HW\u0011"));
        strArr[71] = C0725i.m3085z(C0725i.m3086z("8E\u0000/.RF\u0001/#AV"));
        strArr[72] = C0725i.m3085z(C0725i.m3086z("8H\u001d((^[\u001d6=\\A"));
        strArr[73] = C0725i.m3085z(C0725i.m3086z("8M\u001a$=KT\u000b+.T@\u00012("));
        strArr[74] = C0725i.m3085z(C0725i.m3086z("8M\u001a/9IV\u0001+(^Q\u0006"));
        strArr[75] = C0725i.m3085z(C0725i.m3086z("8C\u00114,TW\u001d/5TJ"));
        strArr[76] = C0725i.m3085z(C0725i.m3086z("8I\u001163DF\u001d5=RV\u0011"));
        strArr[77] = C0725i.m3085z(C0725i.m3086z("8H\u001d((^"));
        strArr[78] = C0725i.m3085z(C0725i.m3086z("8J\u00128#_K\u001a59^"));
        strArr[79] = C0725i.m3085z(C0725i.m3086z("8E\u00069.^"));
        strArr[80] = C0725i.m3085z(C0725i.m3086z("8I\u0015)-NA\u0001)"));
        strArr[81] = C0725i.m3085z(C0725i.m3086z("8F\u0001=:^V"));
        strArr[82] = C0725i.m3085z(C0725i.m3086z("8A\u001a/5^V\u000bJ"));
        strArr[83] = C0725i.m3085z(C0725i.m3086z("8E\u0013>2_E"));
        strArr[84] = C0725i.m3085z(C0725i.m3086z("8E\u0010)9HW\u0011$+^F"));
        strArr[85] = C0725i.m3085z(C0725i.m3086z("8J\u001b/5]M\u0017:(RK\u001a$:TV\u0019:("));
        strArr[86] = C0725i.m3085z(C0725i.m3086z("8A\u001a/5^V\u000b(%HP\u001169"));
        strArr[87] = C0725i.m3085z(C0725i.m3086z("8@\u0015/9DL\u0011..^"));
        strArr[88] = C0725i.m3085z(C0725i.m3086z("8G\u001579U@\u000629I"));
        strArr[89] = C0725i.m3085z(C0725i.m3086z("8\\\u00197#ZP\u0000)5YQ\u0000"));
        strArr[90] = C0725i.m3085z(C0725i.m3086z("8A\u001a/5^V\u000bI"));
        strArr[91] = C0725i.m3085z(C0725i.m3086z("8P\u001590^[\u001c29IE\u000684RU\u0001>"));
        strArr[92] = C0725i.m3085z(C0725i.m3086z("8J\u00128#OE\u0013"));
        strArr[93] = C0725i.m3085z(C0725i.m3086z("8K\u0004/5TJ\u000b69UQ"));
        strArr[94] = C0725i.m3085z(C0725i.m3086z("8J\u001b/5]M\u0017:(RK\u001a"));
        strArr[95] = C0725i.m3085z(C0725i.m3086z("8\\\u00197#UK\u0011.8"));
        strArr[96] = C0725i.m3085z(C0725i.m3086z("8F\u001b40^A\u001a"));
        strArr[97] = C0725i.m3085z(C0725i.m3086z("8P\u001590^E\u0001"));
        strArr[98] = C0725i.m3085z(C0725i.m3086z("_M\u0007+3HM\u000023U"));
        strArr[99] = C0725i.m3085z(C0725i.m3086z("8W\u00152/RA\u000b?=OA"));
        strArr[100] = C0725i.m3085z(C0725i.m3086z("8@\u0001)9^"));
        strArr[101] = C0725i.m3085z(C0725i.m3086z("8A\u0019+0TM"));
        strArr[102] = C0725i.m3085z(C0725i.m3086z("8G\u001b52^\\\u001d42"));
        strArr[103] = C0725i.m3085z(C0725i.m3086z("8G\u001b73UJ\u0011"));
        strArr[104] = C0725i.m3085z(C0725i.m3086z("8V\u0015+,^H"));
        strArr[105] = C0725i.m3085z(C0725i.m3086z("8I\u001b59OE\u001d)9"));
        strArr[106] = C0725i.m3085z(C0725i.m3086z("8M\u0019:;^"));
        strArr[107] = C0725i.m3085z(C0725i.m3086z("8H\u001d99WH\u0011"));
        strArr[108] = C0725i.m3085z(C0725i.m3086z("8G\u001c:1K"));
        strArr[109] = C0725i.m3085z(C0725i.m3086z("8E\u0010)9HW\u0011$/RT"));
        strArr[110] = C0725i.m3085z(C0725i.m3086z("8P\r+9DM\u001a83UJ\u0001"));
        strArr[111] = C0725i.m3085z(C0725i.m3086z("8G\u001b5(ZG\u0000"));
        strArr[112] = C0725i.m3085z(C0725i.m3086z("L@\f60Zp \t\u0015yq "));
        strArr[113] = C0725i.m3085z(C0725i.m3086z("L@\u0006\u001e\u0012a.-\u0013nw"));
        strArr[114] = C0725i.m3085z(C0725i.m3086z("L@\u0016\u000e\u001a}a&"));
        strArr[115] = C0725i.m3085z(C0725i.m3086z("L@\u0003(?wm1\u0015\b"));
        strArr[116] = C0725i.m3085z(C0725i.m3086z("L@"));
        strArr[117] = C0725i.m3085z(C0725i.m3086z("L@\u001c=#Xk:\u0015\u0019cm;\u0015"));
        strArr[118] = C0725i.m3085z(C0725i.m3086z("L@\u0010\u000e\u000e~a"));
        strArr[119] = C0725i.m3085z(C0725i.m3086z("L@\u0000\u001a\u001ewa5\u000e"));
        strArr[C0607n.co] = C0725i.m3085z(C0725i.m3086z("L@\u001a=?_k:\u0015\u0019~"));
        strArr[121] = C0725i.m3085z(C0725i.m3086z("L@\u0011\u0015\bra&C"));
        strArr[122] = C0725i.m3085z(C0725i.m3086z("L@\u0016\u0014\u0013wa1\u0015"));
        strArr[123] = C0725i.m3085z(C0725i.m3086z("L@\u001c\u001e\tia"));
        strArr[C0607n.Hn] = C0725i.m3085z(C0725i.m3086z("L@\u0006\u001e\u0019w"));
        strArr[125] = C0725i.m3085z(C0725i.m3086z("L@\u0017\u0014\u0018~F5\t\u000e~w"));
        strArr[126] = C0725i.m3085z(C0725i.m3086z("L@\u001a=?Oe3"));
        strArr[C0607n.bx] = C0725i.m3085z(C0725i.m3086z("L@\u0019\u0014\u0012~p5\u0012\u000e~"));
        strArr[128] = C0725i.m3085z(C0725i.m3086z("L@\u0017\u0014\u0012oe7\u000f1~w'\u001a\u001b~v=\u001e5uw \u001a\u0012oe:\u001e\u0019"));
        strArr[C0607n.Wj] = C0725i.m3085z(C0725i.m3086z("L@\u0017\u0014\u0012oe7\u000f9vt8\u0014\u0015"));
        strArr[130] = C0725i.m3085z(C0725i.m3086z("L@\u0017\u0014\u0012oe7\u000f"));
        strArr[131] = C0725i.m3085z(C0725i.m3086z("L@\f60_k7\u000e\u0011~j "));
        strArr[C0538a.tb] = C0725i.m3085z(C0725i.m3086z("L@\u0011\u0015\bra&O"));
        strArr[133] = C0725i.m3085z(C0725i.m3086z("L@\f60Uk1\u000e\u0018"));
        strArr[C0607n.Fb] = C0725i.m3085z(C0725i.m3086z("L@\u0017\u0014\u0012oe7\u000f=v1\b\u000f~S1\u0019"));
        strArr[C0538a.Nb] = C0725i.m3085z(C0725i.m3086z("L@\u001a\u0014\brb=\u0018\u001dom;\u0015"));
        strArr[136] = C0725i.m3085z(C0725i.m3086z("L@\u0017\u0014\u0012oe7\u000f9ma:\u001e\u0011~j "));
        strArr[137] = C0725i.m3085z(C0725i.m3086z("L@\u0007\u0014\tig1?\u0013uj1\u001e\u000f"));
        strArr[138] = C0725i.m3085z(C0725i.m3086z("\\S\u00100"));
        strArr[139] = C0725i.m3085z(C0725i.m3086z("L@\u0019\u001a\u000ejq1\u000e\u000e"));
        strArr[C0542t.f1193i] = C0725i.m3085z(C0725i.m3086z("L@\f60Ue9\u001e\u000fke7\u001e"));
        strArr[141] = C0725i.m3085z(C0725i.m3086z("L@\u0017\u0013\u001drj1"));
        strArr[C0536n.f995G] = C0725i.m3085z(C0725i.m3086z("8P\u001590^E\u0001$=HW\u001b85ZP\u001d="));
        strArr[143] = C0725i.m3085z(C0725i.m3086z("L@\u0013\u001e\u0013Kk'\u0012\brk:"));
        strArr[C0538a.Lb] = C0725i.m3085z(C0725i.m3086z("L@\u0006\u001a\fka8)8M"));
        strArr[145] = C0725i.m3085z(C0725i.m3086z("L@\u0017\u0014\u0012oe7\u000f(~h1\u000b\u0014tj1"));
        strArr[146] = C0725i.m3085z(C0725i.m3086z("L@\u0010\u001a\b~L1\u000e\u000e~"));
        strArr[147] = C0725i.m3085z(C0725i.m3086z("L@\u0017\u0014\u0012oe7\u000f/tq&\u0018\u0019"));
        strArr[148] = C0725i.m3085z(C0725i.m3086z("L@\u0017\u0014\u0012oe7\u000f=v1\b\u000f~W\u001d+"));
        strArr[149] = C0725i.m3085z(C0725i.m3086z("L@\u0017\u0014\u0012oe7\u000f=v1\b\u000f~A9\u001a\u0015w"));
        strArr[C0536n.f1006y] = C0725i.m3085z(C0725i.m3086z("L@\u0010\u001a\b~"));
        strArr[151] = C0725i.m3085z(C0725i.m3086z("L@\u0015\u001f\u000e~w'\u001e"));
        strArr[152] = C0725i.m3085z(C0725i.m3086z("L@\u0000\u001a\u001ewa5\u000e=hw;\u0018\u0015zp=\u001d"));
        strArr[153] = C0725i.m3085z(C0725i.m3086z("L@\u0015\u001c\u0019u`5"));
        strArr[154] = C0725i.m3085z(C0725i.m3086z("\\S\u0010>"));
        strArr[155] = C0725i.m3085z(C0725i.m3086z("L@\f(8^j \u0012\b~"));
        strArr[156] = C0725i.m3085z(C0725i.m3086z("+4dKL+4dKL+4dK"));
        strArr[157] = C0725i.m3085z(C0725i.m3086z("SL9\u0016\u000fhW\u0007("));
        strArr[158] = C0725i.m3085z(C0725i.m3086z("G*"));
        strArr[159] = C0725i.m3085z(C0725i.m3086z("3_dVEF`\u0006U$)kS'+)m&\u0007)y}DQ$,\u000fKQ\"Y/I\u00012;"));
        strArr[160] = C0725i.m3085z(C0725i.m3086z("\\S\u0010="));
        strArr[C0607n.kh] = C0725i.m3085z(C0725i.m3086z("\\S\u00108"));
        strArr[C0607n.Ru] = C0725i.m3085z(C0725i.m3086z("+4dKL+4dK"));
        strArr[C0607n.Ao] = C0725i.m3085z(C0725i.m3086z("+4d"));
        strArr[164] = C0725i.m3085z(C0725i.m3086z("+4"));
        strArr[165] = C0725i.m3085z(C0725i.m3086z(")4"));
        strArr[166] = C0725i.m3085z(C0725i.m3086z("*="));
        strArr[167] = C0725i.m3085z(C0725i.m3086z("ov!\u001e"));
        strArr[168] = C0725i.m3085z(C0725i.m3086z("*=dK"));
        strArr[169] = C0725i.m3085z(C0725i.m3086z("+5"));
        strArr[C0536n.f1002n] = C0725i.m3085z(C0725i.m3086z("3_dVEF`\u0006U$)kS'+)m&\u0007)y}DQ$,\u000fKQ\"Y/I\u00012;\u000f/ hYkS'+)m&\u0007)y}DF$,\u000fKQ\"Y/I\u00012;nDT@4yB!`6)RC5;| L6=\t\u0000L77)R"));
        strArr[171] = C0725i.m3085z(C0725i.m3086z("+4dKL+4dKL+4dKL+4"));
        strArr[172] = C0725i.m3085z(C0725i.m3086z("+4dKL+"));
        strArr[173] = C0725i.m3085z(C0725i.m3086z("^j7\u0014\u0018zc1[\u0012tjt\b\tkt;\t\bò*"));
        strArr[174] = C0725i.m3085z(C0725i.m3086z("3_dVEFf\u0006U$>kS'+)m&\u0007)y}DF$,\u000fKQ\"Y/I\u00012;zDT@4yB!`4xH\u00012"));
        f1844z = strArr;
    }

    /* renamed from: a */
    public static final double m3009a(String str, int i) {
        if (i < 2) {
            i = 2;
        } else if (i > 36) {
            i = 36;
        } else if (i == 10) {
            try {
                return C0725i.m3084m(str);
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        String toLowerCase = str.toLowerCase();
        String str2 = f1844z[3];
        StringBuffer stringBuffer = new StringBuffer("");
        int length = toLowerCase.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = toLowerCase.charAt(i2);
            int indexOf = str2.indexOf(charAt);
            if (indexOf != -1 && indexOf < i) {
                try {
                    stringBuffer.append(charAt);
                    i2++;
                } catch (NumberFormatException e2) {
                    throw e2;
                }
            }
        }
        try {
            return !stringBuffer.toString().equals("") ? (double) Long.parseLong(stringBuffer.toString(), i) : 0.0d;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    public static final int m3010a(char c) {
        if (c >= qb.f3206v && c <= qb.f3196k) {
            return (c + 65) - 97;
        }
        if (c >= qb.f3195j && c <= qb.f3192g) {
            return c;
        }
        if (c >= '0' && c <= '9') {
            return c;
        }
        switch (c) {
            case '!':
                return 0;
            case '\"':
                return 0;
            case '#':
                return 0;
            case '$':
                return 0;
            case '&':
                return 0;
            case '\'':
                return 0;
            case '(':
                return 0;
            case ')':
                return 0;
            case '*':
                return 0;
            case '+':
                return 0;
            case ',':
                return 0;
            case '-':
                return 0;
            case '.':
                return 0;
            case '/':
                return 0;
            case ':':
                return 0;
            case ';':
                return 0;
            case '<':
                return 0;
            case '=':
                return 0;
            case '>':
                return 0;
            case '@':
                return 0;
            case '[':
                return 0;
            case '\\':
                return 0;
            case ']':
                return 0;
            case '^':
                return 0;
            case '_':
                return 0;
            case '`':
                return 0;
            case '{':
                return 0;
            case '}':
                return 0;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public static final int m3011a(int i) {
        return i >= 1 ? i - 1 : i;
    }

    /* renamed from: a */
    public static final int m3012a(int i, int i2, int i3) {
        GregorianCalendar g = C0725i.m3077g();
        int i4 = ((((i - 1) / 4) - ((i - 1) / 100)) + ((i - 1) / C1084x.f3269t)) - 436;
        int i5 = (i - 1800) - i4;
        g.clear();
        g.set(i, i2 - 1, i3);
        int i6 = g.get(6);
        int i7 = 0;
        if (i <= 1582 && i2 <= 11 && i3 <= 4) {
            i7 = (i - 1500) / 100;
            i7 = 10 - (i7 - (i7 / 4));
        }
        return i7 + (((i4 * 366) + (i5 * 365)) + i6);
    }

    /* renamed from: a */
    public static final int m3013a(WDObjet wDObjet, C0782g c0782g) {
        if (wDObjet == null) {
            return 0;
        }
        WDDuree wDDuree = (WDDuree) wDObjet.checkType(WDDuree.class);
        if (wDDuree == null) {
            return wDObjet.getInt();
        }
        try {
            return (int) wDDuree.m2400a(c0782g);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static int m3014a(WDDate wDDate, boolean z) {
        if (!z) {
            return wDDate.getInt();
        }
        try {
            return wDDate.m2518e();
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static final long m3015a(byte[] r2, int r3, int r4) {
        /*
        if (r3 < 0) goto L_0x0007;
    L_0x0002:
        r0 = r3 + r4;
        r1 = r2.length;	 Catch:{ NumberFormatException -> 0x0047 }
        if (r0 <= r1) goto L_0x0017;
    L_0x0007:
        r0 = f1844z;	 Catch:{ NumberFormatException -> 0x0047 }
        r1 = 23;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0047 }
        r1 = 0;
        r1 = new java.lang.String[r1];	 Catch:{ NumberFormatException -> 0x0047 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ NumberFormatException -> 0x0047 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ NumberFormatException -> 0x0047 }
    L_0x0017:
        r0 = 1;
        if (r4 == r0) goto L_0x0034;
    L_0x001a:
        r0 = 2;
        if (r4 == r0) goto L_0x0034;
    L_0x001d:
        r0 = 4;
        if (r4 == r0) goto L_0x0034;
    L_0x0020:
        r0 = 8;
        if (r4 == r0) goto L_0x0034;
    L_0x0024:
        r0 = f1844z;	 Catch:{ NumberFormatException -> 0x0049 }
        r1 = 24;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0049 }
        r1 = 0;
        r1 = new java.lang.String[r1];	 Catch:{ NumberFormatException -> 0x0049 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ NumberFormatException -> 0x0049 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ NumberFormatException -> 0x0049 }
    L_0x0034:
        switch(r4) {
            case 1: goto L_0x004b;
            case 2: goto L_0x0051;
            case 8: goto L_0x0061;
            default: goto L_0x0037;
        };
    L_0x0037:
        r0 = java.nio.ByteBuffer.wrap(r2, r3, r4);
        r1 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r0 = r0.order(r1);
        r0 = r0.getInt();
        r0 = (long) r0;
    L_0x0046:
        return r0;
    L_0x0047:
        r0 = move-exception;
        throw r0;
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        r0 = r2[r3];	 Catch:{ NumberFormatException -> 0x004f }
        r0 = (long) r0;
        goto L_0x0046;
    L_0x004f:
        r0 = move-exception;
        throw r0;
    L_0x0051:
        r0 = java.nio.ByteBuffer.wrap(r2, r3, r4);
        r1 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r0 = r0.order(r1);
        r0 = r0.getShort();
        r0 = (long) r0;
        goto L_0x0046;
    L_0x0061:
        r0 = java.nio.ByteBuffer.wrap(r2, r3, r4);
        r1 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r0 = r0.order(r1);
        r0 = r0.getLong();
        goto L_0x0046;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.i.a(byte[], int, int):long");
    }

    /* renamed from: a */
    public static final WDDate m3016a(String str, WDDate wDDate) {
        String[] split = str.split("-");
        try {
            if (split.length > 0) {
                wDDate.m2510a(C0725i.m3064d(split[0]));
            }
            try {
                if (split.length > 1) {
                    wDDate.m2515b(C0725i.m3064d(split[1]));
                }
                try {
                    if (split.length > 2) {
                        wDDate.m2519e(C0725i.m3064d(split[2]));
                    }
                    return wDDate;
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

    /* renamed from: a */
    public static final WDDateHeure m3017a(WDObjet wDObjet, boolean z, boolean z2) {
        WDDateHeure wDDateHeure = wDObjet.getValeur().isDateHeure() ? (WDDateHeure) wDObjet.getValeur() : (WDDateHeure) C0611a.m2293a(26, wDObjet);
        if (z) {
            try {
                wDDateHeure.m2345a(z2);
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return wDDateHeure;
    }

    /* renamed from: a */
    public static final WDDateHeure m3018a(String str, WDDateHeure wDDateHeure) {
        String[] split;
        String[] split2 = str.split("T");
        String str2 = "";
        String str3 = "";
        if (split2.length > 0) {
            str2 = split2[0];
        }
        if (split2.length > 1) {
            str3 = split2[1];
        }
        if (!str2.equals("")) {
            split = str2.split("-");
            try {
                if (split.length > 0) {
                    wDDateHeure.m2364n(C0725i.m3064d(split[0]));
                }
                try {
                    if (split.length > 1) {
                        wDDateHeure.m2356i(C0725i.m3064d(split[1]));
                    }
                    try {
                        if (split.length > 2) {
                            wDDateHeure.m2351e(C0725i.m3064d(split[2]));
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
        if (!str3.equals("")) {
            split = str3.split(":");
            try {
                if (split.length > 0) {
                    wDDateHeure.m2372s(C0725i.m3064d(split[0]));
                }
                try {
                    if (split.length > 1) {
                        wDDateHeure.m2359k(C0725i.m3064d(split[1]));
                    }
                    if (split.length > 2) {
                        String[] split3 = split[2].split(f1844z[158]);
                        try {
                            try {
                                wDDateHeure.m2370r(split3.length > 0 ? C0725i.m3064d(split3[0]) : 0);
                                wDDateHeure.m2358j(split3.length > 1 ? C0725i.m3064d(split3[1]) : 0);
                            } catch (NumberFormatException e222) {
                                throw e222;
                            }
                        } catch (NumberFormatException e2222) {
                            throw e2222;
                        }
                    }
                } catch (NumberFormatException e22222) {
                    throw e22222;
                }
            } catch (NumberFormatException e222222) {
                throw e222222;
            }
        }
        return wDDateHeure;
    }

    /* renamed from: a */
    public static WDDuree m3019a(WDObjet wDObjet) {
        try {
            return wDObjet.getValeur().isDuree() ? (WDDuree) wDObjet.getValeur() : (WDDuree) C0611a.m2293a(27, wDObjet);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static WDHeure m3020a(WDObjet wDObjet, boolean z) {
        WDHeure wDHeure = wDObjet.getValeur().isHeure() ? (WDHeure) wDObjet.getValeur() : (WDHeure) C0611a.m2293a(25, wDObjet);
        if (z) {
            try {
                wDHeure.m2470c();
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return wDHeure;
    }

    /* renamed from: a */
    public static final WDHeure m3021a(String str, WDHeure wDHeure) {
        int i = 0;
        String[] split = str.split(":");
        try {
            if (split.length > 0) {
                wDHeure.m2476h(C0725i.m3064d(split[0]));
            }
            try {
                if (split.length > 1) {
                    wDHeure.m2471c(C0725i.m3064d(split[1]));
                }
                if (split.length > 2) {
                    String[] split2 = split[2].split(f1844z[158]);
                    try {
                        try {
                            wDHeure.m2474g(split2.length > 0 ? C0725i.m3064d(split2[0]) : 0);
                            if (split2.length > 1) {
                                i = C0725i.m3064d(split2[1]);
                            }
                            wDHeure.m2465a(i);
                        } catch (NumberFormatException e) {
                            throw e;
                        }
                    } catch (NumberFormatException e2) {
                        throw e2;
                    }
                }
                return wDHeure;
            } catch (NumberFormatException e22) {
                throw e22;
            }
        } catch (NumberFormatException e222) {
            throw e222;
        }
    }

    /* renamed from: a */
    public static final fb m3022a(long j) {
        if (j <= 2147483647L && j >= -2147483648L) {
            return new WDEntier4(j);
        }
        try {
            return new WDEntier8(j);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static String m3023a(double d, int i) {
        try {
            if (Double.isInfinite(d)) {
                return f1844z[20];
            }
            String str = "";
            if (d < 0.0d) {
                str = "-";
                d = Math.abs(d);
            }
            NumberFormat instance = NumberFormat.getInstance(Locale.ENGLISH);
            instance.setMaximumFractionDigits(15);
            instance.setMinimumFractionDigits(0);
            instance.setGroupingUsed(false);
            String format = instance.format(d);
            int indexOf = format.indexOf(".");
            if (indexOf != -1) {
                format = format.substring(0, indexOf);
            }
            if (format.length() > i) {
                format = format.substring(0, i) + "." + format.substring(i, format.length());
                return str + C0808l.m4017a(Long.toString(Math.round(Double.parseDouble(format))), format.length() - 1, "0");
            } else if (indexOf == -1) {
                try {
                    return str + format;
                } catch (NumberFormatException e) {
                    throw e;
                }
            } else {
                instance.setMaximumFractionDigits(i - format.length());
                return str + instance.format(d);
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public static String m3024a(int i, int i2) {
        String valueOf = String.valueOf(i);
        try {
            if (valueOf.length() >= i2) {
                return valueOf;
            }
            StringBuffer stringBuffer = new StringBuffer(i2);
            int length = i2 - valueOf.length();
            int i3 = 0;
            while (i3 < length) {
                try {
                    stringBuffer.append('0');
                    i3++;
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            return stringBuffer.append(valueOf).toString();
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public static String m3025a(int i, String str) {
        String e = C0725i.m3070e(C0725i.m3067d(i));
        if (str == null) {
            return e;
        }
        try {
            if (str.equals("")) {
                return e;
            }
            WDDate wDDate = new WDDate(e);
            try {
                switch (str.charAt(0)) {
                    case 'A':
                    case 'Y':
                    case 'a':
                    case 'y':
                        return wDDate.m2528n();
                    case 'D':
                    case 'J':
                    case 'd':
                    case 'j':
                        return wDDate.m2526l();
                    case 'M':
                    case 'm':
                        return wDDate.m2535x();
                    default:
                        return wDDate.getString();
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
            throw e2;
        } catch (NumberFormatException e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    public static final String m3026a(WDDate wDDate) {
        StringBuffer stringBuffer = new StringBuffer(10);
        stringBuffer.append(wDDate.m2528n()).append('-').append(wDDate.m2535x()).append('-').append(wDDate.m2526l());
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static final String m3027a(WDDateHeure wDDateHeure) {
        StringBuffer stringBuffer = new StringBuffer(23);
        stringBuffer.append(wDDateHeure.m2350e()).append('-').append(wDDateHeure.m2360l()).append('-').append(wDDateHeure.m2369r()).append(qb.f3204t);
        stringBuffer.append(wDDateHeure.m2373t()).append(':').append(wDDateHeure.m2335C()).append(':').append(wDDateHeure.m2371s()).append('.').append(wDDateHeure.m2338F());
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static final String m3028a(WDHeure wDHeure) {
        StringBuffer stringBuffer = new StringBuffer(12);
        stringBuffer.append(wDHeure.m2481l()).append(":").append(wDHeure.m2485o()).append(":").append(wDHeure.m2472e()).append(".").append(wDHeure.m2482m());
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m3029a(Class cls) {
        try {
            if (cls.getName().startsWith(f1844z[154])) {
                return C0725i.m3058c(cls);
            }
            try {
                if (cls.getName().startsWith(f1844z[138])) {
                    return C0725i.m3049b(cls);
                }
                String d = C0735q.m3128d(cls);
                try {
                    if (!d.startsWith(f1844z[116])) {
                        return d;
                    }
                    if (d.equals(f1844z[122])) {
                        return C0745b.m3220a(f1844z[96], new String[0]);
                    }
                    try {
                        if (d.startsWith(f1844z[141])) {
                            return C0745b.m3220a(f1844z[48], new String[0]);
                        }
                        try {
                            if (d.equals(f1844z[114])) {
                                return C0745b.m3220a(f1844z[81], new String[0]);
                            }
                            try {
                                if (d.equals(f1844z[C0536n.f1006y])) {
                                    return C0745b.m3220a(f1844z[38], new String[0]);
                                }
                                try {
                                    if (d.equals(f1844z[146])) {
                                        return C0745b.m3220a(f1844z[87], new String[0]);
                                    }
                                    try {
                                        if (d.equals(f1844z[123])) {
                                            return C0745b.m3220a(f1844z[65], new String[0]);
                                        }
                                        try {
                                            if (d.equals(f1844z[118])) {
                                                return C0745b.m3220a(f1844z[100], new String[0]);
                                            }
                                            try {
                                                if (d.equals(f1844z[C0538a.tb])) {
                                                    return C0745b.m3220a(f1844z[50], new String[0]);
                                                }
                                                try {
                                                    if (d.equals(f1844z[C0607n.bx])) {
                                                        return C0745b.m3220a(f1844z[105], new String[0]);
                                                    }
                                                    try {
                                                        if (d.equals(f1844z[C0607n.Hn])) {
                                                            return C0745b.m3220a(f1844z[69], new String[0]);
                                                        }
                                                        try {
                                                            if (d.equals(f1844z[121])) {
                                                                return C0745b.m3220a(f1844z[31], new String[0]);
                                                            }
                                                            try {
                                                                if (d.equals(f1844z[117])) {
                                                                    return C0745b.m3220a(f1844z[102], new String[0]);
                                                                }
                                                                try {
                                                                    if (d.equals(f1844z[137])) {
                                                                        return C0745b.m3220a(f1844z[52], new String[0]);
                                                                    }
                                                                    try {
                                                                        if (d.equals(f1844z[152])) {
                                                                            return C0745b.m3220a(f1844z[C0536n.f995G], new String[0]);
                                                                        }
                                                                        try {
                                                                            if (d.startsWith(f1844z[119])) {
                                                                                return C0745b.m3220a(f1844z[97], new String[0]);
                                                                            }
                                                                            try {
                                                                                if (d.equals(f1844z[143])) {
                                                                                    return C0745b.m3220a(f1844z[75], new String[0]);
                                                                                }
                                                                                try {
                                                                                    if (d.equals(f1844z[125])) {
                                                                                        return C0745b.m3220a(f1844z[55], new String[0]);
                                                                                    }
                                                                                    try {
                                                                                        if (d.equals(f1844z[133])) {
                                                                                            return C0745b.m3220a(f1844z[95], new String[0]);
                                                                                        }
                                                                                        try {
                                                                                            if (d.equals(f1844z[131])) {
                                                                                                return C0745b.m3220a(f1844z[62], new String[0]);
                                                                                            }
                                                                                            try {
                                                                                                if (d.equals(f1844z[112])) {
                                                                                                    return C0745b.m3220a(f1844z[89], new String[0]);
                                                                                                }
                                                                                                try {
                                                                                                    if (d.equals(f1844z[C0542t.f1193i])) {
                                                                                                        return C0745b.m3220a(f1844z[59], new String[0]);
                                                                                                    }
                                                                                                    try {
                                                                                                        if (d.equals(f1844z[139])) {
                                                                                                            return C0745b.m3220a(f1844z[80], new String[0]);
                                                                                                        }
                                                                                                        try {
                                                                                                            if (d.equals(f1844z[151])) {
                                                                                                                return C0745b.m3220a(f1844z[70], new String[0]);
                                                                                                            }
                                                                                                            try {
                                                                                                                if (d.equals(f1844z[147])) {
                                                                                                                    return C0745b.m3220a(f1844z[58], new String[0]);
                                                                                                                }
                                                                                                                try {
                                                                                                                    if (d.equals(f1844z[130])) {
                                                                                                                        return C0745b.m3220a(f1844z[111], new String[0]);
                                                                                                                    }
                                                                                                                    try {
                                                                                                                        if (d.equals(f1844z[145])) {
                                                                                                                            return C0745b.m3220a(f1844z[61], new String[0]);
                                                                                                                        }
                                                                                                                        try {
                                                                                                                            if (d.equals(f1844z[149])) {
                                                                                                                                return C0745b.m3220a(f1844z[68], new String[0]);
                                                                                                                            }
                                                                                                                            try {
                                                                                                                                if (d.equals(f1844z[148])) {
                                                                                                                                    return C0745b.m3220a(f1844z[109], new String[0]);
                                                                                                                                }
                                                                                                                                try {
                                                                                                                                    if (d.equals(f1844z[C0607n.Fb])) {
                                                                                                                                        return C0745b.m3220a(f1844z[84], new String[0]);
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        if (d.equals(f1844z[128])) {
                                                                                                                                            return C0745b.m3220a(f1844z[57], new String[0]);
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            if (d.equals(f1844z[136])) {
                                                                                                                                                return C0745b.m3220a(f1844z[44], new String[0]);
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                if (d.equals(f1844z[C0607n.Wj])) {
                                                                                                                                                    return C0745b.m3220a(f1844z[101], new String[0]);
                                                                                                                                                }
                                                                                                                                                try {
                                                                                                                                                    if (d.equals(f1844z[C0538a.Nb])) {
                                                                                                                                                        return C0745b.m3220a(f1844z[94], new String[0]);
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        if (d.equals(f1844z[115])) {
                                                                                                                                                            return C0745b.m3220a(f1844z[39], new String[0]);
                                                                                                                                                        }
                                                                                                                                                        try {
                                                                                                                                                            if (d.equals(f1844z[155])) {
                                                                                                                                                                return C0745b.m3220a(f1844z[43], new String[0]);
                                                                                                                                                            }
                                                                                                                                                            try {
                                                                                                                                                                if (d.equals(f1844z[126])) {
                                                                                                                                                                    return C0745b.m3220a(f1844z[92], new String[0]);
                                                                                                                                                                }
                                                                                                                                                                try {
                                                                                                                                                                    if (d.equals(f1844z[C0607n.co])) {
                                                                                                                                                                        return C0745b.m3220a(f1844z[78], new String[0]);
                                                                                                                                                                    }
                                                                                                                                                                    try {
                                                                                                                                                                        if (d.equals(f1844z[153])) {
                                                                                                                                                                            return C0745b.m3220a(f1844z[83], new String[0]);
                                                                                                                                                                        }
                                                                                                                                                                        try {
                                                                                                                                                                            if (d.equals(f1844z[113])) {
                                                                                                                                                                                return C0745b.m3220a(f1844z[33], new String[0]);
                                                                                                                                                                            }
                                                                                                                                                                            try {
                                                                                                                                                                                return d.equals(f1844z[C0538a.Lb]) ? C0745b.m3220a(f1844z[104], new String[0]) : d;
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
                                                                                                                                                            } catch (NumberFormatException e2222) {
                                                                                                                                                                throw e2222;
                                                                                                                                                            }
                                                                                                                                                        } catch (NumberFormatException e22222) {
                                                                                                                                                            throw e22222;
                                                                                                                                                        }
                                                                                                                                                    } catch (NumberFormatException e222222) {
                                                                                                                                                        throw e222222;
                                                                                                                                                    }
                                                                                                                                                } catch (NumberFormatException e2222222) {
                                                                                                                                                    throw e2222222;
                                                                                                                                                }
                                                                                                                                            } catch (NumberFormatException e22222222) {
                                                                                                                                                throw e22222222;
                                                                                                                                            }
                                                                                                                                        } catch (NumberFormatException e222222222) {
                                                                                                                                            throw e222222222;
                                                                                                                                        }
                                                                                                                                    } catch (NumberFormatException e2222222222) {
                                                                                                                                        throw e2222222222;
                                                                                                                                    }
                                                                                                                                } catch (NumberFormatException e22222222222) {
                                                                                                                                    throw e22222222222;
                                                                                                                                }
                                                                                                                            } catch (NumberFormatException e222222222222) {
                                                                                                                                throw e222222222222;
                                                                                                                            }
                                                                                                                        } catch (NumberFormatException e2222222222222) {
                                                                                                                            throw e2222222222222;
                                                                                                                        }
                                                                                                                    } catch (NumberFormatException e22222222222222) {
                                                                                                                        throw e22222222222222;
                                                                                                                    }
                                                                                                                } catch (NumberFormatException e222222222222222) {
                                                                                                                    throw e222222222222222;
                                                                                                                }
                                                                                                            } catch (NumberFormatException e2222222222222222) {
                                                                                                                throw e2222222222222222;
                                                                                                            }
                                                                                                        } catch (NumberFormatException e22222222222222222) {
                                                                                                            throw e22222222222222222;
                                                                                                        }
                                                                                                    } catch (NumberFormatException e222222222222222222) {
                                                                                                        throw e222222222222222222;
                                                                                                    }
                                                                                                } catch (NumberFormatException e2222222222222222222) {
                                                                                                    throw e2222222222222222222;
                                                                                                }
                                                                                            } catch (NumberFormatException e22222222222222222222) {
                                                                                                throw e22222222222222222222;
                                                                                            }
                                                                                        } catch (NumberFormatException e222222222222222222222) {
                                                                                            throw e222222222222222222222;
                                                                                        }
                                                                                    } catch (NumberFormatException e2222222222222222222222) {
                                                                                        throw e2222222222222222222222;
                                                                                    }
                                                                                } catch (NumberFormatException e22222222222222222222222) {
                                                                                    throw e22222222222222222222222;
                                                                                }
                                                                            } catch (NumberFormatException e222222222222222222222222) {
                                                                                throw e222222222222222222222222;
                                                                            }
                                                                        } catch (NumberFormatException e2222222222222222222222222) {
                                                                            throw e2222222222222222222222222;
                                                                        }
                                                                    } catch (NumberFormatException e22222222222222222222222222) {
                                                                        throw e22222222222222222222222222;
                                                                    }
                                                                } catch (NumberFormatException e222222222222222222222222222) {
                                                                    throw e222222222222222222222222222;
                                                                }
                                                            } catch (NumberFormatException e2222222222222222222222222222) {
                                                                throw e2222222222222222222222222222;
                                                            }
                                                        } catch (NumberFormatException e22222222222222222222222222222) {
                                                            throw e22222222222222222222222222222;
                                                        }
                                                    } catch (NumberFormatException e222222222222222222222222222222) {
                                                        throw e222222222222222222222222222222;
                                                    }
                                                } catch (NumberFormatException e2222222222222222222222222222222) {
                                                    throw e2222222222222222222222222222222;
                                                }
                                            } catch (NumberFormatException e22222222222222222222222222222222) {
                                                throw e22222222222222222222222222222222;
                                            }
                                        } catch (NumberFormatException e222222222222222222222222222222222) {
                                            throw e222222222222222222222222222222222;
                                        }
                                    } catch (NumberFormatException e2222222222222222222222222222222222) {
                                        throw e2222222222222222222222222222222222;
                                    }
                                } catch (NumberFormatException e22222222222222222222222222222222222) {
                                    throw e22222222222222222222222222222222222;
                                }
                            } catch (NumberFormatException e222222222222222222222222222222222222) {
                                throw e222222222222222222222222222222222222;
                            }
                        } catch (NumberFormatException e2222222222222222222222222222222222222) {
                            throw e2222222222222222222222222222222222222;
                        }
                    } catch (NumberFormatException e22222222222222222222222222222222222222) {
                        throw e22222222222222222222222222222222222222;
                    }
                } catch (NumberFormatException e222222222222222222222222222222222222222) {
                    throw e222222222222222222222222222222222222222;
                } catch (NumberFormatException e2222222222222222222222222222222222222222) {
                    throw e2222222222222222222222222222222222222222;
                }
            } catch (NumberFormatException e22222222222222222222222222222222222222222) {
                throw e22222222222222222222222222222222222222222;
            }
        } catch (NumberFormatException e222222222222222222222222222222222222222222) {
            throw e222222222222222222222222222222222222222222;
        }
    }

    /* renamed from: a */
    public static final String m3030a(String str) {
        if (str != null) {
            try {
                if (str.equals("")) {
                    return "";
                }
                StringBuffer stringBuffer = new StringBuffer(17);
                Matcher matcher = C0725i.m3053b().matcher(str);
                if (matcher.find()) {
                    int groupCount = matcher.groupCount();
                    for (int i = 1; i <= 7; i++) {
                        String str2 = null;
                        if (i <= groupCount) {
                            str2 = matcher.group(i);
                        }
                        if (str2 != null) {
                            try {
                                if (!str2.equals("")) {
                                    stringBuffer.append(str2);
                                }
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                        switch (i) {
                            case 1:
                                stringBuffer.append(f1844z[168]);
                                break;
                            case 2:
                            case 3:
                                try {
                                    stringBuffer.append(f1844z[169]);
                                    break;
                                } catch (NumberFormatException e2) {
                                    throw e2;
                                }
                            case 4:
                            case 5:
                            case 6:
                                stringBuffer.append(f1844z[164]);
                                break;
                            case 7:
                                stringBuffer.append(f1844z[C0607n.Ao]);
                                break;
                            default:
                                break;
                        }
                    }
                    return stringBuffer.toString();
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        }
        return f1844z[171];
    }

    /* renamed from: a */
    public static String m3031a(String str, boolean z) {
        String o = C0808l.m4057o(str);
        StringBuffer stringBuffer = new StringBuffer();
        int length = o.length();
        for (int i = 0; i < length; i++) {
            char charAt = o.charAt(i);
            switch (charAt) {
                case ' ':
                case '!':
                case '#':
                case '_':
                case C0607n.aw /*176*/:
                    try {
                        stringBuffer.append(C1449i.hb);
                        break;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                case '$':
                    stringBuffer.append(qb.f3210z);
                    break;
                case '@':
                    stringBuffer.append(qb.f3195j);
                    break;
                default:
                    try {
                        if (Character.isLetterOrDigit(charAt)) {
                            stringBuffer.append(charAt);
                            break;
                        } else if (i > 0) {
                            try {
                                if (stringBuffer.length() != 0) {
                                    if (stringBuffer.charAt(stringBuffer.length() - 1) == C1449i.hb) {
                                        continue;
                                    }
                                }
                                if (i < length - 1) {
                                    try {
                                        stringBuffer.append(C1449i.hb);
                                        break;
                                    } catch (NumberFormatException e2) {
                                        throw e2;
                                    }
                                }
                                continue;
                            } catch (NumberFormatException e22) {
                                throw e22;
                            } catch (NumberFormatException e222) {
                                throw e222;
                            }
                        } else {
                            continue;
                        }
                    } catch (NumberFormatException e2222) {
                        throw e2222;
                    }
            }
        }
        try {
            if (stringBuffer.length() == 0) {
                return "_";
            }
            char charAt2 = stringBuffer.charAt(0);
            try {
                if (Character.isDigit(charAt2)) {
                    stringBuffer.setCharAt(0, C1449i.hb);
                } else if (z) {
                    try {
                        stringBuffer.setCharAt(0, Character.toLowerCase(charAt2));
                    } catch (NumberFormatException e22222) {
                        throw e22222;
                    }
                }
                return stringBuffer.toString();
            } catch (NumberFormatException e222222) {
                throw e222222;
            }
        } catch (NumberFormatException e2222222) {
            throw e2222222;
        }
    }

    /* renamed from: a */
    public static final String m3032a(Date date) {
        return C0725i.m3033a(date, null);
    }

    /* renamed from: a */
    public static final String m3033a(Date date, TimeZone timeZone) {
        if (date == null) {
            try {
                return f1844z[156];
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        SimpleDateFormat c = C0725i.m3062c();
        if (timeZone != null) {
            try {
                if (!c.getTimeZone().getID().equals(timeZone.getID())) {
                    TimeZone timeZone2 = c.getTimeZone();
                    try {
                        c.setTimeZone(timeZone);
                        String format = c.format(date);
                        return format;
                    } finally {
                        c.setTimeZone(timeZone2);
                    }
                }
            } catch (NumberFormatException e2) {
                throw e2;
            }
        }
        return c.format(date);
    }

    /* renamed from: a */
    public static final String m3034a(byte[] bArr) {
        try {
            return C0725i.m3035a(bArr, WDProjet.getInstance().isModeAnsi() ? WDProjet.getInstance().getCharset() : f1844z[22]);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static final String m3035a(byte[] bArr, String str) {
        try {
            return new String(bArr, str);
        } catch (Exception e) {
            C0691a.m2857a(f1844z[173], e);
            return new String(bArr);
        }
    }

    /* renamed from: a */
    private static SimpleDateFormat m3036a() {
        try {
            if (f1842g == null) {
                f1842g = new ThreadLocal();
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) f1842g.get();
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            simpleDateFormat = new SimpleDateFormat(f1844z[1]);
            f1842g.set(simpleDateFormat);
            return simpleDateFormat;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static Date m3037a(long j, boolean z) {
        GregorianCalendar g = C0725i.m3077g();
        g.clear();
        while (true) {
            int i;
            long j2;
            if (j > 2147483647L) {
                i = Integer.MAX_VALUE;
                j2 = j - 2147483647L;
            } else {
                i = (int) j;
                j2 = 0;
            }
            if (z) {
                g.add(14, i);
            } else {
                try {
                    g.add(14, i * 10);
                } catch (NumberFormatException e) {
                    throw e;
                }
            }
            if (j2 <= 0) {
                return g.getTime();
            }
            j = j2;
        }
    }

    /* renamed from: a */
    public static byte[] m3038a(double d) {
        return C0725i.m3054b(Double.doubleToLongBits(d));
    }

    /* renamed from: a */
    public static final byte[] m3039a(String str, String str2) {
        try {
            return str.getBytes(str2);
        } catch (Exception e) {
            C0691a.m2857a(f1844z[29] + str2, e);
            return str.getBytes();
        }
    }

    /* renamed from: a */
    public static byte[] m3040a(boolean z) {
        byte b = (byte) 1;
        try {
            byte[] bArr = new byte[1];
            if (!z) {
                b = (byte) 0;
            }
            bArr[0] = b;
            return bArr;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: a */
    public static String[] m3041a(WDObjet[] wDObjetArr) {
        int length = wDObjetArr.length;
        String[] strArr = new String[length];
        int i = 0;
        while (i < length) {
            try {
                strArr[i] = wDObjetArr[i].getString();
                i++;
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return strArr;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public static final double m3042b(byte[] r3, int r4, int r5) {
        /*
        r2 = 4;
        if (r4 < 0) goto L_0x0008;
    L_0x0003:
        r0 = r4 + r5;
        r1 = r3.length;	 Catch:{ NumberFormatException -> 0x0040 }
        if (r0 <= r1) goto L_0x0018;
    L_0x0008:
        r0 = f1844z;	 Catch:{ NumberFormatException -> 0x0040 }
        r1 = 23;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0040 }
        r1 = 0;
        r1 = new java.lang.String[r1];	 Catch:{ NumberFormatException -> 0x0040 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ NumberFormatException -> 0x0040 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ NumberFormatException -> 0x0040 }
    L_0x0018:
        if (r5 == r2) goto L_0x002e;
    L_0x001a:
        r0 = 8;
        if (r5 == r0) goto L_0x002e;
    L_0x001e:
        r0 = f1844z;	 Catch:{ NumberFormatException -> 0x0042 }
        r1 = 24;
        r0 = r0[r1];	 Catch:{ NumberFormatException -> 0x0042 }
        r1 = 0;
        r1 = new java.lang.String[r1];	 Catch:{ NumberFormatException -> 0x0042 }
        r0 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r0, r1);	 Catch:{ NumberFormatException -> 0x0042 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r0);	 Catch:{ NumberFormatException -> 0x0042 }
    L_0x002e:
        if (r5 != r2) goto L_0x0046;
    L_0x0030:
        r0 = java.nio.ByteBuffer.wrap(r3, r4, r5);	 Catch:{ NumberFormatException -> 0x0044 }
        r1 = java.nio.ByteOrder.LITTLE_ENDIAN;	 Catch:{ NumberFormatException -> 0x0044 }
        r0 = r0.order(r1);	 Catch:{ NumberFormatException -> 0x0044 }
        r0 = r0.getFloat();	 Catch:{ NumberFormatException -> 0x0044 }
        r0 = (double) r0;
    L_0x003f:
        return r0;
    L_0x0040:
        r0 = move-exception;
        throw r0;
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r0 = move-exception;
        throw r0;
    L_0x0046:
        r0 = java.nio.ByteBuffer.wrap(r3, r4, r5);
        r1 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r0 = r0.order(r1);
        r0 = r0.getDouble();
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.i.b(byte[], int, int):double");
    }

    /* renamed from: b */
    public static final WDDate m3043b(WDObjet wDObjet, boolean z, boolean z2) {
        WDDate wDDate = wDObjet.getValeur().isDate() ? (WDDate) wDObjet.getValeur() : (WDDate) C0611a.m2293a(24, wDObjet);
        if (z) {
            try {
                wDDate.m2513a(z2);
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        return wDDate;
    }

    /* renamed from: b */
    public static WDDuree m3044b(String str, String str2) {
        int length = str2.length();
        int length2 = str.length();
        if (length == 0) {
            try {
                return new WDDuree();
            } catch (NumberFormatException e) {
                throw e;
            }
        }
        int i = length - 1;
        length = length2 - 1;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        i = 0;
        while (i2 >= 0) {
            char charAt = str2.charAt(i2);
            if (length < 0) {
                return new WDDuree(i, i6, i5, i4, i3, i7);
            }
            int i8;
            switch (charAt) {
                case '+':
                    if (length >= 0) {
                        try {
                            if (str.indexOf(45, length) == length) {
                                i7 = -1;
                            }
                        } catch (NumberFormatException e2) {
                            throw e2;
                        }
                    }
                    length--;
                    i8 = i7;
                    i7 = i;
                    i = i2 - 1;
                    break;
                case 'H':
                    if (i2 >= 1) {
                        try {
                            if (str2.indexOf(f1844z[17], i2 - 1) == i2 - 1) {
                                i8 = C0725i.m3064d(str.substring(Math.max(0, length - 1), Math.min(length2, length + 1)));
                                length -= 2;
                                i6 = i8;
                                i8 = i7;
                                i7 = i;
                                i = i2 - 2;
                                break;
                            }
                        } catch (NumberFormatException e22) {
                            throw e22;
                        }
                    }
                    length--;
                    i8 = i7;
                    i7 = i;
                    i = i2 - 1;
                    break;
                case 'J':
                    int i9;
                    StringBuffer stringBuffer = new StringBuffer();
                    while (length >= 0) {
                        try {
                            if (!Character.isDigit(str.charAt(length))) {
                                i8 = C0725i.m3064d(stringBuffer.reverse().toString());
                                i = i2 - 1;
                                i9 = i8;
                                i8 = i7;
                                i7 = i9;
                                break;
                            }
                            stringBuffer.append(str.charAt(length));
                            length--;
                        } catch (NumberFormatException e222) {
                            throw e222;
                        }
                    }
                    i8 = C0725i.m3064d(stringBuffer.reverse().toString());
                    i = i2 - 1;
                    i9 = i8;
                    i8 = i7;
                    i7 = i9;
                case 'L':
                    if (i2 >= 2) {
                        try {
                            if (str2.indexOf(f1844z[16], i2 - 2) == i2 - 2) {
                                i8 = C0725i.m3064d(str.substring(Math.max(length - 2, 0), Math.min(length2, length + 1)));
                                length -= 3;
                                i3 = i8;
                                i8 = i7;
                                i7 = i;
                                i = i2 - 3;
                                break;
                            }
                        } catch (NumberFormatException e2222) {
                            throw e2222;
                        }
                    }
                    if (i2 >= 1) {
                        try {
                            if (str2.indexOf(f1844z[18], i2 - 1) == i2 - 1) {
                                i8 = C0725i.m3064d(str.substring(Math.max(0, length - 1), Math.min(length2, length + 1))) * 10;
                                length -= 2;
                                i3 = i8;
                                i8 = i7;
                                i7 = i;
                                i = i2 - 2;
                                break;
                            }
                        } catch (NumberFormatException e22222) {
                            throw e22222;
                        }
                    }
                    i8 = C0725i.m3064d(str.substring(Math.max(0, length), Math.min(length2, length + 1))) * 100;
                    length--;
                    i3 = i8;
                    i8 = i7;
                    i7 = i;
                    i = i2 - 1;
                    break;
                case 'M':
                    if (i2 >= 1) {
                        try {
                            if (str2.indexOf(f1844z[19], i2 - 1) == i2 - 1) {
                                i8 = C0725i.m3064d(str.substring(Math.max(0, length - 1), Math.min(length2, length + 1)));
                                length -= 2;
                                i5 = i8;
                                i8 = i7;
                                i7 = i;
                                i = i2 - 2;
                                break;
                            }
                        } catch (NumberFormatException e222222) {
                            throw e222222;
                        }
                    }
                    length--;
                    i8 = i7;
                    i7 = i;
                    i = i2 - 1;
                    break;
                case 'S':
                    if (i2 >= 1) {
                        try {
                            if (str2.indexOf(f1844z[15], i2 - 1) == i2 - 1) {
                                i8 = C0725i.m3064d(str.substring(Math.max(0, length - 1), Math.min(length2, length + 1)));
                                length -= 2;
                                i4 = i8;
                                i8 = i7;
                                i7 = i;
                                i = i2 - 2;
                                break;
                            }
                        } catch (NumberFormatException e2222222) {
                            throw e2222222;
                        }
                    }
                    length--;
                    i8 = i7;
                    i7 = i;
                    i = i2 - 1;
                    break;
                default:
                    length--;
                    i8 = i7;
                    i7 = i;
                    i = i2 - 1;
                    break;
            }
            i2 = i;
            i = i7;
            i7 = i8;
        }
        return new WDDuree(i, i6, i5, i4, i3, i7);
    }

    /* renamed from: b */
    public static String m3045b(int i) {
        switch (i) {
            case 1:
                try {
                    return C0745b.m3220a(f1844z[96], new String[0]);
                } catch (NumberFormatException e) {
                    throw e;
                }
            case 2:
            case 6:
                return C0745b.m3220a(f1844z[82], new String[0]);
            case 3:
            case 7:
                return C0745b.m3220a(f1844z[90], new String[0]);
            case 4:
            case 8:
                return C0745b.m3220a(f1844z[50], new String[0]);
            case 5:
            case 9:
                return C0745b.m3220a(f1844z[31], new String[0]);
            case 10:
                return C0745b.m3220a(f1844z[105], new String[0]);
            case 12:
                return C0745b.m3220a(f1844z[69], new String[0]);
            case 13:
                return C0745b.m3220a(f1844z[67], new String[0]);
            case 14:
                return C0745b.m3220a(f1844z[86], new String[0]);
            case 16:
            case 17:
            case 21:
            case 22:
            case 23:
            case 81:
                return C0745b.m3220a(f1844z[48], new String[0]);
            case 19:
                return C0745b.m3220a(f1844z[48], new String[0]);
            case 20:
                return C0745b.m3220a(f1844z[52], new String[0]);
            case 24:
                return C0745b.m3220a(f1844z[38], new String[0]);
            case 25:
                return C0745b.m3220a(f1844z[65], new String[0]);
            case 26:
                return C0745b.m3220a(f1844z[87], new String[0]);
            case 27:
                return C0745b.m3220a(f1844z[100], new String[0]);
            case 28:
                return C0745b.m3220a(f1844z[81], new String[0]);
            case 30:
                return C0745b.m3220a(f1844z[76], new String[0]);
            case 34:
                return C0745b.m3220a(f1844z[97], new String[0]);
            case 36:
                return C0745b.m3220a(f1844z[40], new String[0]);
            case 37:
                return C0745b.m3220a(f1844z[41], new String[0]);
            case 62:
                return C0745b.m3220a(f1844z[42], new String[0]);
            case 70:
                return C0745b.m3220a(f1844z[102], new String[0]);
            case 111:
                return C0745b.m3220a(f1844z[66], new String[0]);
            case 113:
                return C0745b.m3220a(f1844z[54], new String[0]);
            case 131:
                return C0745b.m3220a(f1844z[60], new String[0]);
            case 1000:
                return C0745b.m3220a(f1844z[108], new String[0]);
            case 1001:
                return C0745b.m3220a(f1844z[79], new String[0]);
            case 1002:
                return C0745b.m3220a(f1844z[77], new String[0]);
            case 1003:
                return C0745b.m3220a(f1844z[51], new String[0]);
            case 1004:
                return C0745b.m3220a(f1844z[103], new String[0]);
            case C0607n.vr /*1005*/:
                return C0745b.m3220a(f1844z[77], new String[0]);
            case 1006:
                return C0745b.m3220a(f1844z[103], new String[0]);
            case 1007:
                return C0745b.m3220a(f1844z[107], new String[0]);
            case 1008:
                return C0745b.m3220a(f1844z[47], new String[0]);
            case 1009:
                return C0745b.m3220a(f1844z[36], new String[0]);
            case 1010:
                return C0745b.m3220a(f1844z[106], new String[0]);
            case 1011:
                return C0745b.m3220a(f1844z[35], new String[0]);
            case 1012:
                return C0745b.m3220a(f1844z[46], new String[0]);
            case 1013:
                return C0745b.m3220a(f1844z[72], new String[0]);
            case 1014:
                return C0745b.m3220a(f1844z[45], new String[0]);
            case 1015:
                return C0745b.m3220a(f1844z[71], new String[0]);
            case 1016:
                return C0745b.m3220a(f1844z[51], new String[0]);
            case 1017:
                return C0745b.m3220a(f1844z[91], new String[0]);
            case 1018:
                return C0745b.m3220a(f1844z[32], new String[0]);
            case 1019:
                return C0745b.m3220a(f1844z[35], new String[0]);
            case 1020:
                return C0745b.m3220a(f1844z[93], new String[0]);
            case 1021:
                return C0745b.m3220a(f1844z[88], new String[0]);
            case C0607n.vd /*1022*/:
                return C0745b.m3220a(f1844z[64], new String[0]);
            case C0607n.f1455m /*1023*/:
                return C0745b.m3220a(f1844z[34], new String[0]);
            case 1024:
                return C0745b.m3220a(f1844z[99], new String[0]);
            case 1025:
                return C0745b.m3220a(f1844z[63], new String[0]);
            case C0607n.Ok /*1026*/:
                return C0745b.m3220a(f1844z[53], new String[0]);
            case C0607n.f1450h /*1027*/:
                return C0745b.m3220a(f1844z[37], new String[0]);
            case C0607n.Qd /*1028*/:
                return C0745b.m3220a(f1844z[56], new String[0]);
            case C0607n.Td /*1029*/:
                return C0745b.m3220a(f1844z[74], new String[0]);
            case 1030:
                return C0745b.m3220a(f1844z[49], new String[0]);
            case C0607n.kj /*1032*/:
                return C0745b.m3220a(f1844z[98], new String[0]);
            case C0607n.Gf /*2001*/:
                return C0745b.m3220a(f1844z[75], new String[0]);
            case C0607n.hr /*2002*/:
                return C0745b.m3220a(f1844z[55], new String[0]);
            case C0607n.Vn /*2003*/:
                return C0745b.m3220a(f1844z[95], new String[0]);
            case C0607n.Rg /*2004*/:
                return C0745b.m3220a(f1844z[62], new String[0]);
            case C0607n.Hj /*2005*/:
                return C0745b.m3220a(f1844z[89], new String[0]);
            case C0607n.kd /*2006*/:
                return C0745b.m3220a(f1844z[59], new String[0]);
            case C0607n.Dw /*2007*/:
                return C0745b.m3220a(f1844z[94], new String[0]);
            case C0607n.Gx /*2008*/:
                return C0745b.m3220a(f1844z[39], new String[0]);
            case C0607n.Rp /*2009*/:
                return C0745b.m3220a(f1844z[43], new String[0]);
            case C0607n.sc /*2010*/:
                return C0745b.m3220a(f1844z[70], new String[0]);
            case C0607n.ld /*2011*/:
                return C0745b.m3220a(f1844z[80], new String[0]);
            case C0607n.Zu /*2012*/:
                return C0745b.m3220a(f1844z[58], new String[0]);
            case C0607n.Tr /*2013*/:
                return C0745b.m3220a(f1844z[111], new String[0]);
            case C0607n.Nc /*2014*/:
                return C0745b.m3220a(f1844z[61], new String[0]);
            case C0607n.Jx /*2015*/:
                return C0745b.m3220a(f1844z[68], new String[0]);
            case C0607n.yo /*2016*/:
                return C0745b.m3220a(f1844z[109], new String[0]);
            case C0607n.Mw /*2017*/:
                return C0745b.m3220a(f1844z[84], new String[0]);
            case C0607n.bn /*2018*/:
                return C0745b.m3220a(f1844z[57], new String[0]);
            case C0607n.So /*2019*/:
                return C0745b.m3220a(f1844z[44], new String[0]);
            case C0607n.Hx /*2020*/:
                return C0745b.m3220a(f1844z[101], new String[0]);
            case C0607n.Sk /*2022*/:
                return C0745b.m3220a(f1844z[92], new String[0]);
            case C0607n.ir /*2023*/:
                return C0745b.m3220a(f1844z[78], new String[0]);
            case C0607n.Yv /*2026*/:
                return C0745b.m3220a(f1844z[83], new String[0]);
            case C0607n.yn /*2027*/:
                return C0745b.m3220a(f1844z[33], new String[0]);
            case C0607n.ut /*2028*/:
                return C0745b.m3220a(f1844z[104], new String[0]);
            case C0607n.Oq /*2029*/:
                return C0745b.m3220a(f1844z[73], new String[0]);
            case C0607n.wn /*2030*/:
                return C0745b.m3220a(f1844z[30], new String[0]);
            case C0607n.Tx /*2031*/:
                return C0745b.m3220a(f1844z[85], new String[0]);
            default:
                return C0745b.m3220a(f1844z[110], new String[0]);
        }
    }

    /* renamed from: b */
    public static final String m3046b(WDDate wDDate) {
        return wDDate.m2526l() + "/" + wDDate.m2535x() + "/" + wDDate.m2528n();
    }

    /* renamed from: b */
    public static final String m3047b(WDDateHeure wDDateHeure) {
        return new StringBuffer(23).append(wDDateHeure.m2350e()).append('-').append(wDDateHeure.m2360l()).append('-').append(wDDateHeure.m2369r()).append(qb.f3204t).append(wDDateHeure.m2373t()).append(':').append(wDDateHeure.m2335C()).append(':').append(wDDateHeure.m2371s()).append('.').append(wDDateHeure.m2338F()).toString();
    }

    /* renamed from: b */
    public static final String m3048b(WDHeure wDHeure) {
        return new StringBuffer(12).append(wDHeure.m2481l()).append(':').append(wDHeure.m2485o()).append(':').append(wDHeure.m2472e()).append('.').append(wDHeure.m2482m()).toString();
    }

    /* renamed from: b */
    public static final String m3049b(Class cls) {
        String str = null;
        String canonicalName = cls.getCanonicalName();
        int indexOf = canonicalName.indexOf(46);
        if (indexOf > 0) {
            str = canonicalName.substring(0, indexOf);
            if (str.startsWith(f1844z[C0607n.kh])) {
                str = str.substring(f1844z[C0607n.kh].length());
            } else if (str.startsWith(f1844z[160])) {
                str = str.substring(f1844z[160].length());
            }
            canonicalName = canonicalName.substring(indexOf + 1);
        }
        if (canonicalName.startsWith(f1844z[138])) {
            canonicalName = canonicalName.substring(f1844z[138].length());
        }
        if (indexOf <= 0) {
            return canonicalName;
        }
        try {
            return str + "." + canonicalName;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public static String m3050b(String str) {
        String toLowerCase = C0808l.m4057o(str).toLowerCase();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < toLowerCase.length(); i++) {
            char charAt = toLowerCase.charAt(i);
            switch (charAt) {
                case ' ':
                case '!':
                case '_':
                    stringBuffer.append(C1449i.hb);
                    break;
                case '$':
                    stringBuffer.append(qb.f3210z);
                    break;
                case '.':
                    try {
                        stringBuffer.append('.');
                        break;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                case '@':
                    stringBuffer.append(qb.f3195j);
                    break;
                default:
                    try {
                        if (Character.isLetterOrDigit(charAt)) {
                            stringBuffer.append(charAt);
                            break;
                        } else if (i > 0) {
                            try {
                                if (toLowerCase.charAt(i - 1) == C1449i.hb) {
                                    break;
                                }
                                stringBuffer.append(C1449i.hb);
                                break;
                            } catch (NumberFormatException e2) {
                                throw e2;
                            }
                        } else {
                            continue;
                        }
                    } catch (NumberFormatException e22) {
                        throw e22;
                    }
            }
        }
        String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2.equals("")) {
            stringBuffer2 = "_";
        }
        return Character.isDigit(stringBuffer2.charAt(0)) ? "_" + stringBuffer2.substring(1, stringBuffer2.length()) : stringBuffer2;
    }

    /* renamed from: b */
    public static final String m3051b(Date date) {
        if (date != null) {
            return C0725i.m3071e().format(date).substring(0, 8);
        }
        try {
            return f1844z[0];
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public static final String m3052b(byte[] bArr) {
        char[] cArr = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', qb.f3195j, 'B', qb.f3208x, 'D', 'E', 'F'};
        char[] cArr2 = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            cArr2[i * 2] = cArr[i2 >>> 4];
            cArr2[(i * 2) + 1] = cArr[i2 & 15];
        }
        return new String(cArr2);
    }

    /* renamed from: b */
    private static Pattern m3053b() {
        try {
            if (f1841f == null) {
                f1841f = Pattern.compile(f1844z[C0536n.f1002n]);
            }
            return f1841f;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: b */
    public static byte[] m3054b(long j) {
        return new byte[]{(byte) ((int) (j >>> 56)), (byte) ((int) (j >>> 48)), (byte) ((int) (j >>> 40)), (byte) ((int) (j >>> 32)), (byte) ((int) (j >>> 24)), (byte) ((int) (j >>> 16)), (byte) ((int) (j >>> 8)), (byte) ((int) (j >>> 0))};
    }

    /* renamed from: c */
    public static final long m3055c(String str) {
        int i = 1;
        long j = 0;
        int i2 = 0;
        char[] toCharArray = str.trim().toCharArray();
        try {
            if (toCharArray.length != 0) {
                if (toCharArray[0] == '+') {
                    i2 = 1;
                } else if (toCharArray[0] == '-') {
                    i = -1;
                    i2 = 1;
                }
                while (i2 < toCharArray.length && Character.isDigit(toCharArray[i2])) {
                    try {
                        j = (j * 10) + ((long) Character.digit(toCharArray[i2], 10));
                        i2++;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
            return ((long) i) * j;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: c */
    public static final String m3056c(WDDate wDDate) {
        return new StringBuffer(10).append(wDDate.m2528n()).append('-').append(wDDate.m2535x()).append('-').append(wDDate.m2526l()).toString();
    }

    /* renamed from: c */
    public static final String m3057c(WDHeure wDHeure) {
        int min = Math.min(wDHeure.m2482m().length(), 2);
        StringBuffer stringBuffer = new StringBuffer(11);
        stringBuffer.append(wDHeure.m2481l()).append(":").append(wDHeure.m2485o()).append(":").append(wDHeure.m2472e()).append(":").append(wDHeure.m2482m().substring(0, min));
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static final String m3058c(Class cls) {
        String str = null;
        String canonicalName = cls.getCanonicalName();
        int indexOf = canonicalName.indexOf(46);
        if (indexOf > 0) {
            str = canonicalName.substring(0, indexOf);
            if (str.startsWith(f1844z[C0607n.kh])) {
                str = str.substring(f1844z[C0607n.kh].length());
            } else if (str.startsWith(f1844z[160])) {
                str = str.substring(f1844z[160].length());
            }
            canonicalName = canonicalName.substring(indexOf + 1);
        }
        if (canonicalName.startsWith(f1844z[154])) {
            canonicalName = canonicalName.substring(f1844z[154].length());
        }
        if (indexOf <= 0) {
            return canonicalName;
        }
        try {
            return str + "." + canonicalName;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: c */
    public static final java.lang.String m3059c(java.lang.String r13, java.lang.String r14) {
        /*
        r7 = r14.toUpperCase();
        r4 = 0;
        r1 = 0;
        r3 = 0;
        r8 = r7.length();
        r5 = 0;
        r0 = 0;
        r2 = 4;
        r9 = new char[r2];
    L_0x0010:
        if (r5 >= r8) goto L_0x01a9;
    L_0x0012:
        r2 = r7.charAt(r5);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        switch(r2) {
            case 65: goto L_0x0034;
            case 68: goto L_0x010b;
            case 74: goto L_0x010b;
            case 77: goto L_0x00bb;
            case 89: goto L_0x0034;
            default: goto L_0x0019;
        };	 Catch:{ IndexOutOfBoundsException -> 0x005c }
    L_0x0019:
        r2 = r1;
        r1 = r3;
        r3 = r4;
        r4 = r5;
    L_0x001d:
        r6 = r4 + 1;
        if (r3 == 0) goto L_0x0165;
    L_0x0021:
        if (r2 == 0) goto L_0x015e;
    L_0x0023:
        r4 = 1;
        r5 = r4;
    L_0x0025:
        if (r1 == 0) goto L_0x0162;
    L_0x0027:
        r4 = 1;
    L_0x0028:
        r4 = r4 & r5;
        if (r4 == 0) goto L_0x0165;
    L_0x002b:
        if (r3 == 0) goto L_0x0031;
    L_0x002d:
        if (r2 == 0) goto L_0x0031;
    L_0x002f:
        if (r1 != 0) goto L_0x016b;
    L_0x0031:
        r0 = "";
    L_0x0033:
        return r0;
    L_0x0034:
        java.util.Arrays.fill(r9, r2);	 Catch:{ IndexOutOfBoundsException -> 0x005a }
        r2 = new java.lang.String;	 Catch:{ IndexOutOfBoundsException -> 0x005a }
        r6 = 0;
        r10 = 4;
        r2.<init>(r9, r6, r10);	 Catch:{ IndexOutOfBoundsException -> 0x005a }
        r2 = r7.indexOf(r2);	 Catch:{ IndexOutOfBoundsException -> 0x005a }
        if (r2 != r5) goto L_0x0060;
    L_0x0044:
        r2 = r0 + r5;
        r4 = r0 + r5;
        r4 = r4 + 4;
        r2 = r13.substring(r2, r4);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r4 = fr.pcsoft.wdjava.core.C0725i.m3064d(r2);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r2 = r5 + 3;
        r12 = r2;
        r2 = r1;
        r1 = r3;
        r3 = r4;
        r4 = r12;
        goto L_0x001d;
    L_0x005a:
        r0 = move-exception;
        throw r0;	 Catch:{ IndexOutOfBoundsException -> 0x005c }
    L_0x005c:
        r0 = move-exception;
        r0 = "";
        goto L_0x0033;
    L_0x0060:
        r2 = new java.lang.String;	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r6 = 0;
        r10 = 2;
        r2.<init>(r9, r6, r10);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r2 = r7.indexOf(r2, r5);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        if (r2 != r5) goto L_0x0019;
    L_0x006d:
        r2 = r0 + r5;
        r4 = r0 + r5;
        r4 = r4 + 2;
        r2 = r13.substring(r2, r4);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r4 = fr.pcsoft.wdjava.core.C0725i.m3064d(r2);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r6 = 50;
        if (r4 > r6) goto L_0x00a3;
    L_0x007f:
        r4 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r4.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r6 = f1844z;	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r10 = 165; // 0xa5 float:2.31E-43 double:8.15E-322;
        r6 = r6[r10];	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r4 = r4.append(r6);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r2 = r4.append(r2);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r2 = r2.toString();	 Catch:{ IndexOutOfBoundsException -> 0x005c }
    L_0x0096:
        r4 = fr.pcsoft.wdjava.core.C0725i.m3064d(r2);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r2 = r5 + 1;
        r12 = r2;
        r2 = r1;
        r1 = r3;
        r3 = r4;
        r4 = r12;
        goto L_0x001d;
    L_0x00a3:
        r4 = new java.lang.StringBuilder;	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r4.<init>();	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r6 = f1844z;	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r10 = 166; // 0xa6 float:2.33E-43 double:8.2E-322;
        r6 = r6[r10];	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r4 = r4.append(r6);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r2 = r4.append(r2);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r2 = r2.toString();	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        goto L_0x0096;
    L_0x00bb:
        r2 = f1844z;	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r6 = 19;
        r2 = r2[r6];	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r2 = r7.indexOf(r2, r5);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        if (r2 != r5) goto L_0x00dd;
    L_0x00c7:
        r1 = r0 + r5;
        r2 = r0 + r5;
        r2 = r2 + 2;
        r1 = r13.substring(r1, r2);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r2 = fr.pcsoft.wdjava.core.C0725i.m3064d(r1);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r1 = r5 + 1;
        r12 = r1;
        r1 = r3;
        r3 = r4;
        r4 = r12;
        goto L_0x001d;
    L_0x00dd:
        r2 = "M";
        r2 = r7.indexOf(r2, r5);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        if (r2 != r5) goto L_0x0019;
    L_0x00e5:
        r1 = r0 + r5;
        r2 = r0 + r5;
        r2 = r2 + 1;
        r1 = r13.substring(r1, r2);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r2 = fr.pcsoft.wdjava.core.C0725i.m3064d(r1);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r1 = r0 + r5;
        r6 = r0 + r5;
        r6 = r6 + 2;
        r1 = r13.substring(r1, r6);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r1 = fr.pcsoft.wdjava.core.C0725i.m3064d(r1);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        if (r2 == r1) goto L_0x01a6;
    L_0x0103:
        r0 = r0 + 1;
    L_0x0105:
        r2 = r1;
        r1 = r3;
        r3 = r4;
        r4 = r5;
        goto L_0x001d;
    L_0x010b:
        java.util.Arrays.fill(r9, r2);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r6 = new java.lang.String;	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r10 = 0;
        r11 = 2;
        r6.<init>(r9, r10, r11);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r6 = r7.indexOf(r6, r5);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        if (r6 != r5) goto L_0x0132;
    L_0x011b:
        r2 = r0 + r5;
        r3 = r0 + r5;
        r3 = r3 + 2;
        r2 = r13.substring(r2, r3);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r3 = fr.pcsoft.wdjava.core.C0725i.m3064d(r2);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r2 = r5 + 1;
        r12 = r2;
        r2 = r1;
        r1 = r3;
        r3 = r4;
        r4 = r12;
        goto L_0x001d;
    L_0x0132:
        r2 = r7.indexOf(r2, r5);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        if (r2 != r5) goto L_0x0019;
    L_0x0138:
        r2 = r0 + r5;
        r3 = r0 + r5;
        r3 = r3 + 1;
        r2 = r13.substring(r2, r3);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r2 = fr.pcsoft.wdjava.core.C0725i.m3064d(r2);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r3 = r0 + r5;
        r6 = r0 + r5;
        r6 = r6 + 2;
        r3 = r13.substring(r3, r6);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r3 = fr.pcsoft.wdjava.core.C0725i.m3064d(r3);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        if (r2 == r3) goto L_0x019f;
    L_0x0156:
        r0 = r0 + 1;
        r2 = r1;
        r1 = r3;
        r3 = r4;
        r4 = r5;
        goto L_0x001d;
    L_0x015e:
        r4 = 0;
        r5 = r4;
        goto L_0x0025;
    L_0x0162:
        r4 = 0;
        goto L_0x0028;
    L_0x0165:
        r5 = r6;
        r4 = r3;
        r3 = r1;
        r1 = r2;
        goto L_0x0010;
    L_0x016b:
        r4 = r13.length();	 Catch:{ NumberFormatException -> 0x0176 }
        r0 = r0 + r8;
        if (r4 == r0) goto L_0x0178;
    L_0x0172:
        r0 = "";
        goto L_0x0033;
    L_0x0176:
        r0 = move-exception;
        throw r0;
    L_0x0178:
        r0 = new java.lang.StringBuffer;	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r4 = 8;
        r0.<init>(r4);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r4 = 4;
        r3 = fr.pcsoft.wdjava.core.C0725i.m3024a(r3, r4);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r3 = r0.append(r3);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r4 = 2;
        r2 = fr.pcsoft.wdjava.core.C0725i.m3024a(r2, r4);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r2 = r3.append(r2);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r3 = 2;
        r1 = fr.pcsoft.wdjava.core.C0725i.m3024a(r1, r3);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r2.append(r1);	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        r0 = r0.toString();	 Catch:{ IndexOutOfBoundsException -> 0x005c }
        goto L_0x0033;
    L_0x019f:
        r3 = r4;
        r4 = r5;
        r12 = r1;
        r1 = r2;
        r2 = r12;
        goto L_0x001d;
    L_0x01a6:
        r1 = r2;
        goto L_0x0105;
    L_0x01a9:
        r2 = r1;
        r1 = r3;
        r3 = r4;
        goto L_0x002b;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.i.c(java.lang.String, java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public static final String m3060c(Date date) {
        if (date != null) {
            return C0725i.m3071e().format(date).substring(0, 6);
        }
        try {
            return f1844z[172];
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: c */
    public static final String m3061c(byte[] bArr) {
        return C0725i.m3035a(bArr, WDProjet.getInstance().getCharset());
    }

    /* renamed from: c */
    private static SimpleDateFormat m3062c() {
        try {
            if (f1843h == null) {
                f1843h = new ThreadLocal();
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) f1843h.get();
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            simpleDateFormat = new SimpleDateFormat(f1844z[2]);
            f1843h.set(simpleDateFormat);
            return simpleDateFormat;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: c */
    public static byte[] m3063c(int i) {
        return new byte[]{(byte) (i >>> 24), (byte) (i >>> 16), (byte) (i >>> 8), (byte) (i >>> 0)};
    }

    /* renamed from: d */
    public static final int m3064d(String str) {
        int i = 0;
        int i2 = 1;
        char[] toCharArray = str.trim().toCharArray();
        try {
            if (toCharArray.length != 0) {
                int i3;
                if (toCharArray[0] == '+') {
                    i3 = 1;
                } else if (toCharArray[0] == '-') {
                    i2 = -1;
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                while (i3 < toCharArray.length && Character.isDigit(toCharArray[i3])) {
                    try {
                        int digit = Character.digit(toCharArray[i3], 10) + (i * 10);
                        i3++;
                        i = digit;
                    } catch (NumberFormatException e) {
                        throw e;
                    }
                }
            }
            return i2 * i;
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: d */
    public static final String m3065d(String str, String str2) {
        int i = 0;
        if (str2.equalsIgnoreCase(f1844z[25])) {
            str2 = WDProjet.getInstance().getFormatMasqueHeure();
        }
        String toUpperCase = str2.toUpperCase();
        int length = toUpperCase.length();
        int length2 = str.length();
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        int i4 = -1;
        int i5 = -1;
        while (i < length) {
            switch (toUpperCase.charAt(i)) {
                case 'A':
                    if (toUpperCase.indexOf(f1844z[27], i) == i && i + 1 < length2) {
                        z = str.substring(i, i + 2).equalsIgnoreCase(f1844z[26]);
                        i++;
                        break;
                    }
                case 'C':
                    if (toUpperCase.indexOf(f1844z[28], i) == i && i + 1 < length2) {
                        i2 = C0725i.m3064d(str.substring(i, i + 2));
                        i++;
                        break;
                    }
                case 'H':
                    try {
                        if (toUpperCase.indexOf(f1844z[17], i) == i && i + 1 < length2) {
                            i5 = C0725i.m3064d(str.substring(i, i + 2));
                            i++;
                            break;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        throw e;
                    } catch (IndexOutOfBoundsException e2) {
                        throw e2;
                    } catch (IndexOutOfBoundsException e22) {
                        throw e22;
                    } catch (IndexOutOfBoundsException e222) {
                        throw e222;
                    } catch (IndexOutOfBoundsException e2222) {
                        throw e2222;
                    } catch (IndexOutOfBoundsException e3) {
                        return "";
                    }
                case 'M':
                    if (toUpperCase.indexOf(f1844z[19], i) == i && i + 1 < length2) {
                        i4 = C0725i.m3064d(str.substring(i, i + 2));
                        i++;
                        break;
                    }
                case 'S':
                    if (toUpperCase.indexOf(f1844z[15], i) == i && i + 1 < length2) {
                        i3 = C0725i.m3064d(str.substring(i, i + 2));
                        i++;
                        break;
                    }
                default:
                    break;
            }
            i++;
        }
        if (i5 == -1 || i4 == -1) {
            return "";
        }
        if (z) {
            i5 += 12;
        }
        StringBuffer stringBuffer = new StringBuffer(8);
        stringBuffer.append(C0725i.m3024a(i5, 2)).append(C0725i.m3024a(i4, 2)).append(C0725i.m3024a(i3, 2)).append(C0725i.m3024a(i2, 2));
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public static final String m3066d(Date date) {
        return C0725i.m3033a(date, null).substring(0, 14);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: d */
    public static java.util.Date m3067d(int r6) {
        /*
        r3 = 1582; // 0x62e float:2.217E-42 double:7.816E-321;
        r0 = 0;
        r5 = 5;
        r4 = 1;
        r1 = fr.pcsoft.wdjava.core.C0725i.m3077g();
        r1.clear();
        r2 = 1800; // 0x708 float:2.522E-42 double:8.893E-321;
        r1.set(r2, r0, r4);
        r2 = r6 + -1;
        r1.add(r5, r2);
        r2 = 1;
        r2 = r1.get(r2);	 Catch:{ NumberFormatException -> 0x004b }
        if (r2 < r3) goto L_0x0035;
    L_0x001d:
        r2 = 1;
        r2 = r1.get(r2);	 Catch:{ NumberFormatException -> 0x004d }
        if (r2 != r3) goto L_0x0042;
    L_0x0024:
        r2 = 2;
        r2 = r1.get(r2);	 Catch:{ NumberFormatException -> 0x004f }
        r3 = 10;
        if (r2 > r3) goto L_0x0042;
    L_0x002d:
        r2 = 5;
        r2 = r1.get(r2);	 Catch:{ NumberFormatException -> 0x004f }
        r3 = 4;
        if (r2 > r3) goto L_0x0042;
    L_0x0035:
        r0 = r1.get(r4);
        r0 = r0 + -1500;
        r0 = r0 / 100;
        r2 = r0 / 4;
        r0 = r0 - r2;
        r0 = 10 - r0;
    L_0x0042:
        r0 = -r0;
        r1.add(r5, r0);
        r0 = r1.getTime();
        return r0;
    L_0x004b:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x004d }
    L_0x004d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x004f }
    L_0x004f:
        r0 = move-exception;
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.i.d(int):java.util.Date");
    }

    /* renamed from: d */
    public static final GregorianCalendar m3068d() {
        try {
            if (f1840e == null) {
                f1840e = new ThreadLocal();
            }
            GregorianCalendar gregorianCalendar = (GregorianCalendar) f1840e.get();
            if (gregorianCalendar != null) {
                return gregorianCalendar;
            }
            gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(f1844z[21]));
            f1840e.set(gregorianCalendar);
            return gregorianCalendar;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: e */
    public static final int m3069e(int i) {
        return i >= 0 ? i + 1 : i;
    }

    /* renamed from: e */
    public static final String m3070e(Date date) {
        if (date != null) {
            return C0725i.m3036a().format(date);
        }
        try {
            return f1844z[0];
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: e */
    private static SimpleDateFormat m3071e() {
        try {
            if (f1836a == null) {
                f1836a = new ThreadLocal();
            }
            SimpleDateFormat simpleDateFormat = (SimpleDateFormat) f1836a.get();
            if (simpleDateFormat != null) {
                return simpleDateFormat;
            }
            simpleDateFormat = new SimpleDateFormat(f1844z[157]);
            f1836a.set(simpleDateFormat);
            return simpleDateFormat;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: e */
    public static final boolean m3072e(String str) {
        try {
            if (str.equals(f1844z[167])) {
                return true;
            }
            try {
                return C0725i.m3064d(str) != 0;
            } catch (NumberFormatException e) {
                throw e;
            }
        } catch (NumberFormatException e2) {
            throw e2;
        }
    }

    /* renamed from: f */
    public static final String m3073f(Date date) {
        if (date != null) {
            return C0725i.m3071e().format(date);
        }
        try {
            return f1844z[C0607n.Ru];
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: f */
    private static Pattern m3074f() {
        try {
            if (f1837b == null) {
                f1837b = Pattern.compile(f1844z[159]);
            }
            return f1837b;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: f */
    public static final byte[] m3075f(String str) {
        try {
            return C0725i.m3039a(str, WDProjet.getInstance().isModeAnsi() ? WDProjet.getInstance().getCharset() : f1844z[22]);
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: g */
    public static final String m3076g(String str) {
        if (str != null) {
            try {
                if (str.equals("")) {
                    return "";
                }
                StringBuffer stringBuffer = new StringBuffer(8);
                Matcher matcher = C0725i.m3074f().matcher(str);
                if (matcher.find()) {
                    int groupCount = matcher.groupCount();
                    for (int i = 1; i <= 3; i++) {
                        String str2 = null;
                        if (i <= groupCount) {
                            str2 = matcher.group(i);
                        }
                        if (str2 != null) {
                            try {
                                if (!str2.equals("")) {
                                    stringBuffer.append(str2);
                                }
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                        switch (i) {
                            case 1:
                                stringBuffer.append(f1844z[168]);
                                break;
                            case 2:
                            case 3:
                                try {
                                    stringBuffer.append(f1844z[169]);
                                    break;
                                } catch (NumberFormatException e2) {
                                    throw e2;
                                }
                            default:
                                break;
                        }
                    }
                    return stringBuffer.toString();
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        }
        return f1844z[0];
    }

    /* renamed from: g */
    public static final GregorianCalendar m3077g() {
        try {
            if (f1838c == null) {
                f1838c = new ThreadLocal();
            }
            GregorianCalendar gregorianCalendar = (GregorianCalendar) f1838c.get();
            if (gregorianCalendar != null) {
                return gregorianCalendar;
            }
            gregorianCalendar = new GregorianCalendar(Locale.FRANCE);
            f1838c.set(gregorianCalendar);
            return gregorianCalendar;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: h */
    private static Pattern m3078h() {
        try {
            if (f1839d == null) {
                f1839d = Pattern.compile(f1844z[174]);
            }
            return f1839d;
        } catch (NumberFormatException e) {
            throw e;
        }
    }

    /* renamed from: h */
    public static boolean m3079h(String str) {
        if (str != null) {
            try {
                if (!str.equals("")) {
                    char charAt = str.charAt(0);
                    try {
                        if (Character.isDigit(charAt)) {
                            return true;
                        }
                        switch (charAt) {
                            case '+':
                            case '-':
                                if (str.length() > 1) {
                                    charAt = str.charAt(1);
                                    try {
                                        if (Character.isDigit(charAt)) {
                                            return true;
                                        }
                                        if (charAt == '.') {
                                            try {
                                                if (str.length() > 2) {
                                                    if (Character.isDigit(str.charAt(2))) {
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
                                    } catch (NumberFormatException e22) {
                                        throw e22;
                                    }
                                }
                                return false;
                            case '.':
                                try {
                                    if (str.length() > 1) {
                                        if (Character.isDigit(str.charAt(1))) {
                                            return true;
                                        }
                                    }
                                    return false;
                                } catch (NumberFormatException e222) {
                                    throw e222;
                                } catch (NumberFormatException e2222) {
                                    throw e2222;
                                }
                            default:
                                return false;
                        }
                    } catch (NumberFormatException e22222) {
                        throw e22222;
                    }
                }
            } catch (NumberFormatException e222222) {
                throw e222222;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static final BigDecimal m3080i(String str) {
        try {
            Double.parseDouble(str);
            return new BigDecimal(str);
        } catch (NumberFormatException e) {
            return new BigDecimal(new WDChaine(str).m2428f());
        }
    }

    /* renamed from: j */
    public static int m3081j(String str) {
        try {
            if (str.equals(f1844z[9])) {
                return 1;
            }
            try {
                if (str.equals(f1844z[11])) {
                    return WDChaine.m2421c();
                }
                try {
                    if (str.equals(f1844z[4])) {
                        return 24;
                    }
                    try {
                        if (str.equals(f1844z[10])) {
                            return 26;
                        }
                        try {
                            if (str.equals(f1844z[7])) {
                                return 27;
                            }
                            try {
                                if (str.equals(f1844z[5])) {
                                    return 8;
                                }
                                try {
                                    if (str.equals(f1844z[8])) {
                                        return 9;
                                    }
                                    try {
                                        if (str.equals(f1844z[6])) {
                                            return 25;
                                        }
                                        try {
                                            if (str.equals(f1844z[14])) {
                                                return 10;
                                            }
                                            try {
                                                if (str.equals(f1844z[12])) {
                                                    return 13;
                                                }
                                                try {
                                                    return str.equals(f1844z[13]) ? 12 : WDChaine.m2421c();
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
                                } catch (NumberFormatException e2222) {
                                    throw e2222;
                                }
                            } catch (NumberFormatException e22222) {
                                throw e22222;
                            }
                        } catch (NumberFormatException e222222) {
                            throw e222222;
                        }
                    } catch (NumberFormatException e2222222) {
                        throw e2222222;
                    }
                } catch (NumberFormatException e22222222) {
                    throw e22222222;
                }
            } catch (NumberFormatException e222222222) {
                throw e222222222;
            }
        } catch (NumberFormatException e2222222222) {
            throw e2222222222;
        }
    }

    /* renamed from: k */
    public static final byte[] m3082k(String str) {
        return C0725i.m3039a(str, WDProjet.getInstance().getCharset());
    }

    /* renamed from: l */
    public static final String m3083l(String str) {
        if (str != null) {
            try {
                if (str.equals("")) {
                    return "";
                }
                StringBuffer stringBuffer = new StringBuffer(9);
                Matcher matcher = C0725i.m3078h().matcher(str);
                if (matcher.find()) {
                    int groupCount = matcher.groupCount();
                    for (int i = 1; i <= 4; i++) {
                        String str2 = null;
                        if (i <= groupCount) {
                            str2 = matcher.group(i);
                        }
                        if (str2 != null) {
                            try {
                                if (!str2.equals("")) {
                                    stringBuffer.append(str2);
                                }
                            } catch (NumberFormatException e) {
                                throw e;
                            }
                        }
                        switch (i) {
                            case 1:
                            case 2:
                            case 3:
                                try {
                                    stringBuffer.append(f1844z[164]);
                                    break;
                                } catch (NumberFormatException e2) {
                                    throw e2;
                                }
                            case 4:
                                stringBuffer.append(f1844z[C0607n.Ao]);
                                break;
                            default:
                                break;
                        }
                    }
                    return stringBuffer.toString();
                }
            } catch (NumberFormatException e22) {
                throw e22;
            }
        }
        return f1844z[C0607n.Ru];
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: m */
    public static final double m3084m(java.lang.String r15) {
        /*
        r7 = -1;
        r11 = 10;
        r0 = 0;
        r12 = 4621819117588971520; // 0x4024000000000000 float:0.0 double:10.0;
        r3 = 1;
        r4 = 0;
        r1 = 0;
        r2 = r15.trim();
        r10 = r2.toCharArray();
        r2 = r10.length;	 Catch:{ NumberFormatException -> 0x0034 }
        if (r2 == 0) goto L_0x00e8;
    L_0x0015:
        r1 = r10[r1];	 Catch:{ NumberFormatException -> 0x0034 }
        r2 = 43;
        if (r1 != r2) goto L_0x0036;
    L_0x001b:
        r1 = r3;
        r2 = r3;
    L_0x001d:
        r6 = r10.length;	 Catch:{ NumberFormatException -> 0x0042 }
        if (r1 >= r6) goto L_0x0044;
    L_0x0020:
        r6 = r10[r1];	 Catch:{ NumberFormatException -> 0x0042 }
        r6 = java.lang.Character.isDigit(r6);	 Catch:{ NumberFormatException -> 0x0042 }
        if (r6 == 0) goto L_0x0044;
    L_0x0028:
        r4 = r4 * r12;
        r6 = r10[r1];
        r6 = java.lang.Character.digit(r6, r11);
        r8 = (double) r6;
        r4 = r4 + r8;
        r1 = r1 + 1;
        goto L_0x001d;
    L_0x0034:
        r0 = move-exception;
        throw r0;
    L_0x0036:
        r1 = r10[r0];
        r2 = 45;
        if (r1 != r2) goto L_0x003f;
    L_0x003c:
        r1 = r3;
        r2 = r7;
        goto L_0x001d;
    L_0x003f:
        r1 = r0;
        r2 = r3;
        goto L_0x001d;
    L_0x0042:
        r0 = move-exception;
        throw r0;
    L_0x0044:
        r6 = r10.length;	 Catch:{ NumberFormatException -> 0x006d }
        if (r1 >= r6) goto L_0x00e4;
    L_0x0047:
        r6 = r10[r1];	 Catch:{ NumberFormatException -> 0x006f }
        r8 = 46;
        if (r6 != r8) goto L_0x00e4;
    L_0x004d:
        r1 = r1 + 1;
        r6 = r1;
        r1 = r0;
    L_0x0051:
        r8 = r10.length;	 Catch:{ NumberFormatException -> 0x0071 }
        if (r6 >= r8) goto L_0x0073;
    L_0x0054:
        r8 = r10[r6];	 Catch:{ NumberFormatException -> 0x0071 }
        r8 = java.lang.Character.isDigit(r8);	 Catch:{ NumberFormatException -> 0x0071 }
        if (r8 == 0) goto L_0x0073;
    L_0x005c:
        r4 = r4 * r12;
        r8 = r10[r6];
        r8 = java.lang.Character.digit(r8, r11);
        r8 = (double) r8;
        r8 = r8 + r4;
        r4 = r1 + 1;
        r1 = r6 + 1;
        r6 = r1;
        r1 = r4;
        r4 = r8;
        goto L_0x0051;
    L_0x006d:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x006f }
    L_0x006f:
        r0 = move-exception;
        throw r0;
    L_0x0071:
        r0 = move-exception;
        throw r0;
    L_0x0073:
        r8 = r10.length;	 Catch:{ NumberFormatException -> 0x00b5 }
        if (r6 >= r8) goto L_0x00da;
    L_0x0076:
        r8 = r10[r6];	 Catch:{ NumberFormatException -> 0x00b7 }
        r9 = 101; // 0x65 float:1.42E-43 double:5.0E-322;
        if (r8 == r9) goto L_0x008e;
    L_0x007c:
        r8 = r10[r6];	 Catch:{ NumberFormatException -> 0x00b9 }
        r9 = 69;
        if (r8 == r9) goto L_0x008e;
    L_0x0082:
        r8 = r10[r6];	 Catch:{ NumberFormatException -> 0x00bb }
        r9 = 100;
        if (r8 == r9) goto L_0x008e;
    L_0x0088:
        r8 = r10[r6];	 Catch:{ NumberFormatException -> 0x00bd }
        r9 = 68;
        if (r8 != r9) goto L_0x00da;
    L_0x008e:
        r6 = r6 + 1;
        r8 = r10.length;	 Catch:{ NumberFormatException -> 0x00bf }
        if (r6 >= r8) goto L_0x00c1;
    L_0x0093:
        r8 = r10[r6];	 Catch:{ NumberFormatException -> 0x00bf }
        r9 = 43;
        if (r8 != r9) goto L_0x00c1;
    L_0x0099:
        r6 = r6 + 1;
        r14 = r6;
        r6 = r0;
        r0 = r14;
    L_0x009e:
        r7 = r10.length;	 Catch:{ NumberFormatException -> 0x00d6 }
        if (r0 >= r7) goto L_0x00d8;
    L_0x00a1:
        r7 = r10[r0];	 Catch:{ NumberFormatException -> 0x00d6 }
        r7 = java.lang.Character.isDigit(r7);	 Catch:{ NumberFormatException -> 0x00d6 }
        if (r7 == 0) goto L_0x00d8;
    L_0x00a9:
        r6 = r6 * 10;
        r7 = r10[r0];
        r7 = java.lang.Character.digit(r7, r11);
        r6 = r6 + r7;
        r0 = r0 + 1;
        goto L_0x009e;
    L_0x00b5:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00b7 }
    L_0x00b7:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00b9 }
    L_0x00b9:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00bb }
    L_0x00bb:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00bd }
    L_0x00bd:
        r0 = move-exception;
        throw r0;	 Catch:{ NumberFormatException -> 0x00bf }
    L_0x00bf:
        r0 = move-exception;
        throw r0;
    L_0x00c1:
        r8 = r10.length;	 Catch:{ NumberFormatException -> 0x00d0 }
        if (r6 >= r8) goto L_0x00d2;
    L_0x00c4:
        r8 = r10[r6];	 Catch:{ NumberFormatException -> 0x00d0 }
        r9 = 45;
        if (r8 != r9) goto L_0x00d2;
    L_0x00ca:
        r3 = r6 + 1;
        r6 = r0;
        r0 = r3;
        r3 = r7;
        goto L_0x009e;
    L_0x00d0:
        r0 = move-exception;
        throw r0;
    L_0x00d2:
        r14 = r6;
        r6 = r0;
        r0 = r14;
        goto L_0x009e;
    L_0x00d6:
        r0 = move-exception;
        throw r0;
    L_0x00d8:
        r0 = r6 * r3;
    L_0x00da:
        r0 = r0 - r1;
        r2 = (double) r2;
        r2 = r2 * r4;
        r0 = (double) r0;
        r0 = java.lang.Math.pow(r12, r0);
        r0 = r0 * r2;
        return r0;
    L_0x00e4:
        r6 = r1;
        r1 = r0;
        goto L_0x0051;
    L_0x00e8:
        r1 = r0;
        r2 = r3;
        goto L_0x00da;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.core.i.m(java.lang.String):double");
    }

    /* renamed from: z */
    private static String m3085z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 27;
                    break;
                case 1:
                    i2 = 4;
                    break;
                case 2:
                    i2 = 84;
                    break;
                case 3:
                    i2 = 123;
                    break;
                default:
                    i2 = C0607n.Hn;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3086z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ C0607n.Hn);
        }
        return toCharArray;
    }
}
