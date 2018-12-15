package fr.pcsoft.wdjava.p054e;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import fr.pcsoft.wdjava.api.WDAPISMS;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.application.C0653m;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.ic;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import fr.pcsoft.wdjava.database.p048a.C0830a;
import java.util.Date;
import java.util.Locale;

/* renamed from: fr.pcsoft.wdjava.e.c */
public class C0880c {
    /* renamed from: a */
    private static final String f2364a = C0880c.m6185z(C0880c.m6186z(";5C\r"));
    /* renamed from: b */
    private static int f2365b = 10000;
    /* renamed from: c */
    private static final String f2366c = C0880c.m6185z(C0880c.m6186z("8>C\u0006@*)"));
    /* renamed from: d */
    private static final String f2367d = C0880c.m6185z(C0880c.m6186z("-2U\u0011D=\u0005N\u0010"));
    /* renamed from: e */
    private static final String f2368e = C0880c.m6185z(C0880c.m6186z("\u00063C"));
    /* renamed from: f */
    private static final String f2369f = C0880c.m6185z(C0880c.m6186z("=;S\u0011"));
    /* renamed from: g */
    private static final String f2370g = C0880c.m6185z(C0880c.m6186z(":5I\u0000@7.\u001d[\n*7T[L78H\f"));
    /* renamed from: h */
    private static Cursor f2371h = null;
    /* renamed from: z */
    private static final String[] f2372z;

    static {
        String[] strArr = new String[C0607n.f1465w];
        strArr[0] = C0880c.m6185z(C0880c.m6186z("\u00063CI\u001a"));
        strArr[1] = C0880c.m6185z(C0880c.m6186z("ab\u0017"));
        strArr[2] = C0880c.m6185z(C0880c.m6186z("kl\u0016"));
        strArr[3] = C0880c.m6185z(C0880c.m6186z("kl\u0010"));
        strArr[4] = C0880c.m6185z(C0880c.m6186z("mh\u0016"));
        strArr[5] = C0880c.m6185z(C0880c.m6186z("jb\u0012"));
        strArr[6] = C0880c.m6185z(C0880c.m6186z("lc\u0011"));
        strArr[7] = C0880c.m6185z(C0880c.m6186z("ak"));
        strArr[8] = C0880c.m6185z(C0880c.m6186z("mo"));
        strArr[9] = C0880c.m6185z(C0880c.m6186z("km"));
        strArr[10] = C0880c.m6185z(C0880c.m6186z("oh"));
        strArr[11] = C0880c.m6185z(C0880c.m6186z("`m\u0016"));
        strArr[12] = C0880c.m6185z(C0880c.m6186z("al"));
        strArr[13] = C0880c.m6185z(C0880c.m6186z("ki\u0011"));
        strArr[14] = C0880c.m6185z(C0880c.m6186z("lo"));
        strArr[15] = C0880c.m6185z(C0880c.m6186z("mb"));
        strArr[16] = C0880c.m6185z(C0880c.m6186z("mk"));
        strArr[17] = C0880c.m6185z(C0880c.m6186z("kl\u0011"));
        strArr[18] = C0880c.m6185z(C0880c.m6186z("kc\u001f"));
        strArr[19] = C0880c.m6185z(C0880c.m6186z("kn\u0014"));
        strArr[20] = C0880c.m6185z(C0880c.m6186z("`m\u0011"));
        strArr[21] = C0880c.m6185z(C0880c.m6186z("lc\u0012"));
        strArr[22] = C0880c.m6185z(C0880c.m6186z("kc\u001e"));
        strArr[23] = C0880c.m6185z(C0880c.m6186z("ki\u0010"));
        strArr[24] = C0880c.m6185z(C0880c.m6186z("jm\u0012"));
        strArr[25] = C0880c.m6185z(C0880c.m6186z("kn\u0015"));
        strArr[26] = C0880c.m6185z(C0880c.m6186z("ko\u001f"));
        strArr[27] = C0880c.m6185z(C0880c.m6186z("jb\u001e"));
        strArr[28] = C0880c.m6185z(C0880c.m6186z("jb\u0011"));
        strArr[29] = C0880c.m6185z(C0880c.m6186z("jm\u0010"));
        strArr[30] = C0880c.m6185z(C0880c.m6186z("kl\u001e"));
        strArr[31] = C0880c.m6185z(C0880c.m6186z("lj\u0012"));
        strArr[32] = C0880c.m6185z(C0880c.m6186z("jo\u0014"));
        strArr[33] = C0880c.m6185z(C0880c.m6186z("kh\u0016"));
        strArr[34] = C0880c.m6185z(C0880c.m6186z("kh\u0017"));
        strArr[35] = C0880c.m6185z(C0880c.m6186z("kk\u0011"));
        strArr[36] = C0880c.m6185z(C0880c.m6186z("hb\u0011L"));
        strArr[37] = C0880c.m6185z(C0880c.m6186z("oo"));
        strArr[38] = C0880c.m6185z(C0880c.m6186z("kn\u001e"));
        strArr[39] = C0880c.m6185z(C0880c.m6186z("kl\u0013"));
        strArr[40] = C0880c.m6185z(C0880c.m6186z("`m\u0017"));
        strArr[41] = C0880c.m6185z(C0880c.m6186z("ko\u0016"));
        strArr[42] = C0880c.m6185z(C0880c.m6186z("`m\u0010"));
        strArr[43] = C0880c.m6185z(C0880c.m6186z("ll"));
        strArr[44] = C0880c.m6185z(C0880c.m6186z("lc\u0017"));
        strArr[45] = C0880c.m6185z(C0880c.m6186z("jm\u001e"));
        strArr[46] = C0880c.m6185z(C0880c.m6186z("ko\u0010"));
        strArr[47] = C0880c.m6185z(C0880c.m6186z("lc\u0010"));
        strArr[48] = C0880c.m6185z(C0880c.m6186z("ml"));
        strArr[49] = C0880c.m6185z(C0880c.m6186z("kh\u001e"));
        strArr[50] = C0880c.m6185z(C0880c.m6186z("jo\u0017"));
        strArr[51] = C0880c.m6185z(C0880c.m6186z("ji"));
        strArr[52] = C0880c.m6185z(C0880c.m6186z("jm\u0016"));
        strArr[53] = C0880c.m6185z(C0880c.m6186z("jk"));
        strArr[54] = C0880c.m6185z(C0880c.m6186z("ko\u0012"));
        strArr[55] = C0880c.m6185z(C0880c.m6186z("ki\u0013"));
        strArr[56] = C0880c.m6185z(C0880c.m6186z("jm\u0017"));
        strArr[57] = C0880c.m6185z(C0880c.m6186z("`l\u0010"));
        strArr[58] = C0880c.m6185z(C0880c.m6186z("kl\u0012"));
        strArr[59] = C0880c.m6185z(C0880c.m6186z("lj\u0014"));
        strArr[60] = C0880c.m6185z(C0880c.m6186z("jm\u0015"));
        strArr[61] = C0880c.m6185z(C0880c.m6186z("lj\u0011"));
        strArr[62] = C0880c.m6185z(C0880c.m6186z("ko\u0017"));
        strArr[63] = C0880c.m6185z(C0880c.m6186z("kh\u001f"));
        strArr[64] = C0880c.m6185z(C0880c.m6186z("`k"));
        strArr[65] = C0880c.m6185z(C0880c.m6186z("jc"));
        strArr[66] = C0880c.m6185z(C0880c.m6186z("lj\u0016"));
        strArr[67] = C0880c.m6185z(C0880c.m6186z("ao\u0014"));
        strArr[68] = C0880c.m6185z(C0880c.m6186z("kl\u001f"));
        strArr[69] = C0880c.m6185z(C0880c.m6186z("mi"));
        strArr[70] = C0880c.m6185z(C0880c.m6186z("lh"));
        strArr[71] = C0880c.m6185z(C0880c.m6186z("jb\u0010"));
        strArr[72] = C0880c.m6185z(C0880c.m6186z("kl\u0014"));
        strArr[73] = C0880c.m6185z(C0880c.m6186z("kh\u0012"));
        strArr[74] = C0880c.m6185z(C0880c.m6186z("ol"));
        strArr[75] = C0880c.m6185z(C0880c.m6186z("ao\u0012"));
        strArr[76] = C0880c.m6185z(C0880c.m6186z("ko\u0011"));
        strArr[77] = C0880c.m6185z(C0880c.m6186z("ki\u0015"));
        strArr[78] = C0880c.m6185z(C0880c.m6186z("jo\u001f"));
        strArr[79] = C0880c.m6185z(C0880c.m6186z("om\u0010"));
        strArr[80] = C0880c.m6185z(C0880c.m6186z("om\u0012"));
        strArr[81] = C0880c.m6185z(C0880c.m6186z("kn\u0012"));
        strArr[82] = C0880c.m6185z(C0880c.m6186z("hb\u0010B"));
        strArr[83] = C0880c.m6185z(C0880c.m6186z("`c\u0015"));
        strArr[84] = C0880c.m6185z(C0880c.m6186z("lc\u0015"));
        strArr[85] = C0880c.m6185z(C0880c.m6186z("hb\u0017M"));
        strArr[86] = C0880c.m6185z(C0880c.m6186z("an"));
        strArr[87] = C0880c.m6185z(C0880c.m6186z("jo\u001e"));
        strArr[88] = C0880c.m6185z(C0880c.m6186z("jb\u0016"));
        strArr[89] = C0880c.m6185z(C0880c.m6186z("ki\u0012"));
        strArr[90] = C0880c.m6185z(C0880c.m6186z("kh\u0010"));
        strArr[91] = C0880c.m6185z(C0880c.m6186z("kh\u0014"));
        strArr[92] = C0880c.m6185z(C0880c.m6186z("om\u0015"));
        strArr[93] = C0880c.m6185z(C0880c.m6186z("kn\u0013"));
        strArr[94] = C0880c.m6185z(C0880c.m6186z("`c\u001f"));
        strArr[95] = C0880c.m6185z(C0880c.m6186z("jn"));
        strArr[96] = C0880c.m6185z(C0880c.m6186z("`l\u0017"));
        strArr[97] = C0880c.m6185z(C0880c.m6186z("`j"));
        strArr[98] = C0880c.m6185z(C0880c.m6186z("kn\u001f"));
        strArr[99] = C0880c.m6185z(C0880c.m6186z("jm\u0013"));
        strArr[100] = C0880c.m6185z(C0880c.m6186z("`l\u0015"));
        strArr[101] = C0880c.m6185z(C0880c.m6186z("jm\u0014"));
        strArr[102] = C0880c.m6185z(C0880c.m6186z("kk\u0014"));
        strArr[103] = C0880c.m6185z(C0880c.m6186z("`m\u0014"));
        strArr[104] = C0880c.m6185z(C0880c.m6186z("mh\u0017"));
        strArr[105] = C0880c.m6185z(C0880c.m6186z("lj\u0013"));
        strArr[106] = C0880c.m6185z(C0880c.m6186z("hh\u0013B"));
        strArr[107] = C0880c.m6185z(C0880c.m6186z("ki\u0016"));
        strArr[108] = C0880c.m6185z(C0880c.m6186z("jo\u0012"));
        strArr[109] = C0880c.m6185z(C0880c.m6186z("`h"));
        strArr[110] = C0880c.m6185z(C0880c.m6186z("`b"));
        strArr[111] = C0880c.m6185z(C0880c.m6186z("jo\u0011"));
        strArr[112] = C0880c.m6185z(C0880c.m6186z("kh\u0011"));
        strArr[113] = C0880c.m6185z(C0880c.m6186z("mm"));
        strArr[114] = C0880c.m6185z(C0880c.m6186z("jo\u0016"));
        strArr[115] = C0880c.m6185z(C0880c.m6186z("jo\u0010"));
        strArr[116] = C0880c.m6185z(C0880c.m6186z("`m\u0015"));
        strArr[117] = C0880c.m6185z(C0880c.m6186z("kl\u0017"));
        strArr[118] = C0880c.m6185z(C0880c.m6186z("om\u0014"));
        strArr[119] = C0880c.m6185z(C0880c.m6186z("oj"));
        strArr[C0607n.co] = C0880c.m6185z(C0880c.m6186z("jo\u0015"));
        strArr[121] = C0880c.m6185z(C0880c.m6186z("hn\u0013E"));
        strArr[122] = C0880c.m6185z(C0880c.m6186z("`m\u0012"));
        strArr[123] = C0880c.m6185z(C0880c.m6186z("jm\u001f"));
        strArr[C0607n.Hn] = C0880c.m6185z(C0880c.m6186z("ao\u0011"));
        strArr[125] = C0880c.m6185z(C0880c.m6186z("ah"));
        strArr[126] = C0880c.m6185z(C0880c.m6186z("lc\u0013"));
        strArr[C0607n.bx] = C0880c.m6185z(C0880c.m6186z("`l\u0011"));
        strArr[128] = C0880c.m6185z(C0880c.m6186z("ao\u0017"));
        strArr[C0607n.Wj] = C0880c.m6185z(C0880c.m6186z("ao\u0015"));
        strArr[130] = C0880c.m6185z(C0880c.m6186z("jb\u0015"));
        strArr[131] = C0880c.m6185z(C0880c.m6186z("jh"));
        strArr[C0538a.tb] = C0880c.m6185z(C0880c.m6186z("ko\u0014"));
        strArr[133] = C0880c.m6185z(C0880c.m6186z("ki\u001f"));
        strArr[C0607n.Fb] = C0880c.m6185z(C0880c.m6186z("`l\u0013"));
        strArr[C0538a.Nb] = C0880c.m6185z(C0880c.m6186z("ln"));
        strArr[136] = C0880c.m6185z(C0880c.m6186z("lb"));
        strArr[137] = C0880c.m6185z(C0880c.m6186z("kh\u0015"));
        strArr[138] = C0880c.m6185z(C0880c.m6186z("`l\u0012"));
        strArr[139] = C0880c.m6185z(C0880c.m6186z("`c\u0013"));
        strArr[C0542t.f1193i] = C0880c.m6185z(C0880c.m6186z("hm\u001fC"));
        strArr[141] = C0880c.m6185z(C0880c.m6186z("lj\u001e"));
        strArr[C0536n.f995G] = C0880c.m6185z(C0880c.m6186z("ab\u0011"));
        strArr[143] = C0880c.m6185z(C0880c.m6186z("li"));
        strArr[C0538a.Lb] = C0880c.m6185z(C0880c.m6186z("jo\u0013"));
        strArr[145] = C0880c.m6185z(C0880c.m6186z("ki\u0017"));
        strArr[146] = C0880c.m6185z(C0880c.m6186z("jj"));
        strArr[147] = C0880c.m6185z(C0880c.m6186z("kj"));
        strArr[148] = C0880c.m6185z(C0880c.m6186z("lj\u0015"));
        strArr[149] = C0880c.m6185z(C0880c.m6186z("mj"));
        strArr[C0536n.f1006y] = C0880c.m6185z(C0880c.m6186z("oi"));
        strArr[151] = C0880c.m6185z(C0880c.m6186z("`l\u0014"));
        strArr[152] = C0880c.m6185z(C0880c.m6186z("mh\u0014"));
        strArr[153] = C0880c.m6185z(C0880c.m6186z("kn\u0016"));
        strArr[154] = C0880c.m6185z(C0880c.m6186z("`i"));
        strArr[155] = C0880c.m6185z(C0880c.m6186z("kk\u0015"));
        strArr[156] = C0880c.m6185z(C0880c.m6186z("ko\u0015"));
        strArr[157] = C0880c.m6185z(C0880c.m6186z("ok"));
        strArr[158] = C0880c.m6185z(C0880c.m6186z("ob\u001e"));
        strArr[159] = C0880c.m6185z(C0880c.m6186z("jl"));
        strArr[160] = C0880c.m6185z(C0880c.m6186z("mc"));
        strArr[C0607n.kh] = C0880c.m6185z(C0880c.m6186z("ob\u0010"));
        strArr[C0607n.Ru] = C0880c.m6185z(C0880c.m6186z("ko\u0013"));
        strArr[C0607n.Ao] = C0880c.m6185z(C0880c.m6186z("`l\u0016"));
        strArr[164] = C0880c.m6185z(C0880c.m6186z("lm"));
        strArr[165] = C0880c.m6185z(C0880c.m6186z("ki\u0014"));
        strArr[166] = C0880c.m6185z(C0880c.m6186z("lc\u001f"));
        strArr[167] = C0880c.m6185z(C0880c.m6186z("jb\u0017"));
        strArr[168] = C0880c.m6185z(C0880c.m6186z("`c\u0014"));
        strArr[169] = C0880c.m6185z(C0880c.m6186z("`c\u0011"));
        strArr[C0536n.f1002n] = C0880c.m6185z(C0880c.m6186z("jm\u0011"));
        strArr[171] = C0880c.m6185z(C0880c.m6186z("hh\u0013F"));
        strArr[172] = C0880c.m6185z(C0880c.m6186z(")2H\u001a@"));
        strArr[173] = C0880c.m6185z(C0880c.m6186z("`c\u0012"));
        strArr[174] = C0880c.m6185z(C0880c.m6186z("kh\u0013"));
        strArr[C0607n.hu] = C0880c.m6185z(C0880c.m6186z("lk"));
        strArr[C0607n.aw] = C0880c.m6185z(C0880c.m6186z("on"));
        strArr[C0607n.Nr] = C0880c.m6185z(C0880c.m6186z("lc\u0014"));
        strArr[C0607n.Gk] = C0880c.m6185z(C0880c.m6186z("`n"));
        strArr[C0607n.yt] = C0880c.m6185z(C0880c.m6186z("mn"));
        strArr[180] = C0880c.m6185z(C0880c.m6186z("lj\u0010"));
        strArr[181] = C0880c.m6185z(C0880c.m6186z("lc\u0016"));
        strArr[182] = C0880c.m6185z(C0880c.m6186z("z\u0013i0l\u001a\u001fx'h\n\u0005n:`\u0001\u0013t d\u0017\u000e"));
        strArr[183] = C0880c.m6185z(C0880c.m6186z(":5I\u0000@7.\u001d[\n*7T["));
        strArr[184] = C0880c.m6185z(C0880c.m6186z("84C\u0006J0>\t\u0004@+7N\u0007V05IZw\u001c\u001bc+v\u0014\t"));
        strArr[185] = C0880c.m6185z(C0880c.m6186z("z\u001br7p\u0017\u0005w5w\u001a\u0015r&v\u0006\tj'z\u0018\u0017h&f\u001c"));
        strArr[C0607n.pw] = C0880c.m6185z(C0880c.m6186z("\u001a/U\u0007J+zC\u0011\u0005);U\u0017J,(TTA<)\u0007'h\nzN\u001aS86N\u0010@"));
        strArr[187] = C0880c.m6185z(C0880c.m6186z("*7TN"));
        strArr[188] = C0880c.m6185z(C0880c.m6186z("84C\u0006J0>\t\u001dK-?I\u0000\u000b89S\u001dJ7tq=`\u000e"));
        strArr[189] = C0880c.m6185z(C0880c.m6186z("/4CZD7>U\u001bL=wC\u001dWv7J\u0007\b*7T"));
        strArr[190] = C0880c.m6185z(C0880c.m6186z("*7T+G6>^"));
        strArr[191] = C0880c.m6185z(C0880c.m6186z("z\u001bw$i\u0010\u0005t9v\u0006\u0014h:z\r\bh!s\u001c\u001f"));
        strArr[192] = C0880c.m6185z(C0880c.m6186z("\u000b\u001ft!i\r\u0005b&w\u0016\bx:j\u0006\tb&s\u0010\u0019b"));
        strArr[193] = C0880c.m6185z(C0880c.m6186z("\u000b\u001ft!i\r\u0005b&w\u0016\bx:p\u0015\u0016x$a\f"));
        strArr[C0607n.nn] = C0880c.m6185z(C0880c.m6186z("\u000b\u001ft!i\r\u0005b&w\u0016\bx&d\u001d\u0013h+j\u001f\u001c"));
        strArr[C0607n.oq] = C0880c.m6185z(C0880c.m6186z("z\tb&s\u0010\u0019b+v\u0014\tx:j\u0017\u0005c=v\t\u0015"));
        strArr[C0607n.Uk] = C0880c.m6185z(C0880c.m6186z("84C\u0006J0>\t\u0004@+7N\u0007V05IZv\u001c\u0014c+v\u0014\t"));
        strArr[C0607n.Eg] = C0880c.m6185z(C0880c.m6186z("z\u0014r9`\u000b\u0015x0`\n\u000en:d\r\u001bn&`\u0006\u0013i\"d\u0015\u0013c1"));
        strArr[C0607n.jk] = C0880c.m6185z(C0880c.m6186z("TP"));
        strArr[199] = C0880c.m6185z(C0880c.m6186z("z\u001fu&z\u001c\u0014q;l\u0006\tj'"));
        strArr[C0607n.Dt] = C0880c.m6185z(C0880c.m6186z("z\u0017b'v\u0018\u001db+v\u0014\tx w\u0016\nx8j\u0017\u001d"));
        strArr[C0607n.Bf] = C0880c.m6185z(C0880c.m6186z("z\u0014r9`\u000b\u0015x `\u0015\u001fw<j\u0017\u001fx\"l\u001d\u001f"));
        strArr[C0607n.Ug] = C0880c.m6185z(C0880c.m6186z("z\u001fu&z\r\u0013j1j\f\u000ex'h\n"));
        f2372z = strArr;
        WDProjet.getInstance().ajouterEcouteurProjet(new C0878a());
    }

    /* renamed from: a */
    public static final void m6173a() throws C0882e {
        try {
            WDAppManager.m2565a(f2372z[C0607n.Uk]);
            String string = WDAPISMS.Message.getString();
            try {
                if (string.length() > 160) {
                    throw new C0882e(C0745b.m3222b(f2372z[C0607n.Dt], new String[0]));
                }
                string = C0808l.m4018a(string, f2372z[C0607n.jk], "\n");
                String g = C0880c.m6182g();
                try {
                    if (g.equals("")) {
                        throw new C0882e(C0745b.m3222b(f2372z[C0607n.Bf], new String[0]));
                    }
                    try {
                        if (PhoneNumberUtils.isWellFormedSmsAddress(g)) {
                            ic c0881d = new C0881d(string, g);
                            try {
                                c0881d.m1785a(1, "", f2365b);
                                Integer num = (Integer) c0881d.m1792d();
                                if (num == null) {
                                    num = new Integer(-16);
                                }
                                try {
                                    switch (num.intValue()) {
                                        case C0607n.Fw /*-16*/:
                                            throw new C0882e(C0745b.m3222b(f2372z[C0607n.Ug], new String[0]));
                                        case -1:
                                            return;
                                        case 2:
                                            throw new C0882e(C0745b.m3222b(f2372z[C0607n.oq], f2372z[C0607n.nn]));
                                        case 3:
                                            throw new C0882e(C0745b.m3222b(f2372z[C0607n.oq], f2372z[193]));
                                        case 4:
                                            throw new C0882e(C0745b.m3222b(f2372z[C0607n.oq], f2372z[192]));
                                        default:
                                            throw new C0882e(C0745b.m3222b(f2372z[199], new String[0]));
                                    }
                                } catch (C0653m e) {
                                    throw e;
                                }
                            } catch (Exception e2) {
                                throw new C0882e(C0745b.m3222b(f2372z[199], new String[0]), e2.getMessage());
                            }
                        }
                        throw new C0882e(C0745b.m3222b(f2372z[C0607n.Eg], new String[0]));
                    } catch (C0653m e3) {
                        throw e3;
                    }
                } catch (C0653m e32) {
                    throw e32;
                }
            } catch (C0653m e322) {
                throw e322;
            }
        } catch (C0653m e3222) {
            throw new C0882e((int) C0607n.Rc, e3222.getMessage());
        }
    }

    /* renamed from: a */
    private static final void m6174a(Cursor cursor) {
        if (cursor != null) {
            try {
                if (!cursor.isClosed()) {
                    if (!(cursor.isBeforeFirst() || cursor.isAfterLast())) {
                        int columnIndex = cursor.getColumnIndex(f2369f);
                        try {
                            WDAPISMS.DateReception.setValeur(columnIndex != -1 ? C0725i.m3032a(new Date(cursor.getLong(columnIndex))) : "");
                            columnIndex = cursor.getColumnIndex(f2364a);
                            try {
                                String string;
                                WDAPISMS.Message.setValeur(columnIndex != -1 ? cursor.getString(columnIndex) : "");
                                columnIndex = cursor.getColumnIndex(f2366c);
                                if (columnIndex != -1) {
                                    try {
                                        string = cursor.getString(columnIndex);
                                    } catch (ActivityNotFoundException e) {
                                        throw e;
                                    }
                                }
                                string = "";
                                WDAPISMS.Numero.setValeur(string);
                                int columnIndex2 = cursor.getColumnIndex(f2368e);
                                try {
                                    try {
                                        WDAPISMS.Indice.setValeur(columnIndex2 != -1 ? cursor.getInt(columnIndex2) : 0);
                                        WDAPISMS.TypeNumero.setValeur(string.indexOf(43) == 0 ? 1 : 2);
                                        return;
                                    } catch (ActivityNotFoundException e2) {
                                        throw e2;
                                    }
                                } catch (ActivityNotFoundException e22) {
                                    throw e22;
                                }
                            } catch (ActivityNotFoundException e222) {
                                throw e222;
                            }
                        } catch (ActivityNotFoundException e2222) {
                            throw e2222;
                        }
                    }
                }
            } catch (ActivityNotFoundException e22222) {
                throw e22222;
            } catch (ActivityNotFoundException e222222) {
                throw e222222;
            }
        }
        C0691a.m2856a(f2372z[C0607n.pw]);
    }

    /* renamed from: a */
    public static final boolean m6175a(int i) throws C0882e {
        Throwable th;
        Cursor cursor;
        Cursor cursor2 = null;
        boolean z = true;
        try {
            WDAppManager.m2565a(f2372z[184]);
            try {
                cursor2 = C0880c.m6176b(i);
                if (cursor2 != null) {
                    try {
                        if (cursor2.getCount() == 1) {
                            if (WDAppManager.m2553L().delete(Uri.parse(f2372z[183] + i), null, null) <= 0) {
                                z = false;
                            }
                            if (z) {
                                try {
                                    if (f2371h != null) {
                                        if (!f2371h.isClosed()) {
                                            f2371h.requery();
                                        }
                                    }
                                } catch (C0653m e) {
                                    throw e;
                                } catch (C0653m e2) {
                                    throw e2;
                                }
                            }
                            C0830a.m4258a(cursor2);
                            return z;
                        }
                    } catch (C0653m e22) {
                        throw e22;
                    } catch (C0653m e222) {
                        try {
                            throw e222;
                        } catch (Throwable th2) {
                            th = th2;
                            cursor = cursor2;
                        }
                    }
                }
                throw new C0882e(C0745b.m3222b(f2372z[182], new String[0]));
            } catch (Throwable th3) {
                th = th3;
                cursor = cursor2;
                C0830a.m4258a(cursor);
                throw th;
            }
        } catch (C0653m e2222) {
            throw new C0882e((int) C0607n.Rc, e2222.getMessage());
        }
    }

    /* renamed from: b */
    private static final Cursor m6176b(int i) {
        Uri parse = Uri.parse(f2370g);
        return WDAppManager.m2553L().query(parse, new String[]{f2368e}, f2372z[0], new String[]{String.valueOf(i)}, null);
    }

    /* renamed from: b */
    public static final boolean m6177b() throws C0882e {
        try {
            WDAppManager.m2565a(f2372z[184]);
            try {
                if (f2371h != null) {
                    f2371h.requery();
                } else {
                    f2371h = C0880c.m6179d();
                }
                try {
                    if (f2371h != null) {
                        if (f2371h.moveToFirst()) {
                            C0880c.m6174a(f2371h);
                            return true;
                        }
                    }
                    return false;
                } catch (C0653m e) {
                    throw e;
                } catch (C0653m e2) {
                    throw e2;
                }
            } catch (C0653m e22) {
                throw e22;
            }
        } catch (C0653m e222) {
            throw new C0882e((int) C0607n.Rc, e222.getMessage());
        }
    }

    /* renamed from: c */
    public static final void m6178c() throws C0882e {
        Intent intent = new Intent(f2372z[188]);
        String g = C0880c.m6182g();
        try {
            if (!C0808l.m4053k(g)) {
                intent.putExtra(f2366c, g);
            }
            String string = WDAPISMS.Message.getString();
            try {
                if (!C0808l.m4053k(string)) {
                    intent.putExtra(f2372z[190], string);
                }
                intent.setType(f2372z[189]);
                intent.setFlags(268435456);
                try {
                    WDAppManager.m2544C().startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    try {
                        if (!g.startsWith(f2372z[187])) {
                            g = f2372z[187] + g;
                        }
                        intent.setData(Uri.parse(g));
                        WDAppManager.m2544C().startActivity(intent);
                    } catch (ActivityNotFoundException e2) {
                        throw new C0882e(C0745b.m3222b(f2372z[191], new String[0]));
                    }
                }
            } catch (ActivityNotFoundException e3) {
                throw e3;
            }
        } catch (ActivityNotFoundException e32) {
            throw e32;
        }
    }

    /* renamed from: d */
    private static final Cursor m6179d() {
        return WDAppManager.m2553L().query(Uri.parse(f2370g), null, null, null, null);
    }

    /* renamed from: e */
    private static final void m6180e() {
        try {
            if (f2371h != null) {
                f2371h.close();
                f2371h = null;
            }
        } catch (ActivityNotFoundException e) {
            throw e;
        }
    }

    /* renamed from: f */
    public static final int m6181f() throws C0882e {
        int i = 0;
        try {
            WDAppManager.m2565a(f2372z[184]);
            Cursor cursor = null;
            try {
                cursor = C0880c.m6179d();
                if (cursor != null) {
                    i = cursor.getCount();
                    if (cursor != null) {
                        try {
                            cursor.close();
                        } catch (C0653m e) {
                            throw e;
                        }
                    }
                } else if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (C0653m e2) {
                        throw e2;
                    }
                }
                return i;
            } catch (Throwable th) {
                if (cursor != null) {
                    try {
                        cursor.close();
                    } catch (C0653m e22) {
                        throw e22;
                    }
                }
            }
        } catch (C0653m e222) {
            throw new C0882e((int) C0607n.Rc, e222.getMessage());
        }
    }

    /* renamed from: g */
    private static final String m6182g() {
        String string = WDAPISMS.Numero.getString();
        try {
            if (C0808l.m4053k(string)) {
                return "";
            }
            try {
                if (WDProjet.getInstance().isExecDansEmulateur() || !WDAPISMS.TypeNumero.opEgal(1)) {
                    return string;
                }
                String string2 = WDAPISMS.PrefixeNational.getString();
                try {
                    if (string.indexOf(48) == 0 && !string2.equals("")) {
                        string = string2 + string.substring(1);
                    }
                    return string.indexOf(43) != 0 ? '+' + string : string;
                } catch (ActivityNotFoundException e) {
                    throw e;
                }
            } catch (ActivityNotFoundException e2) {
                throw e2;
            }
        } catch (ActivityNotFoundException e22) {
            throw e22;
        }
    }

    /* renamed from: h */
    public static final String m6183h() {
        String country;
        String str = "";
        if (WDProjet.getInstance().isExecDansEmulateur()) {
            country = Locale.getDefault().getCountry();
        } else {
            TelephonyManager telephonyManager = (TelephonyManager) WDAppManager.m2544C().getSystemService(f2372z[172]);
            country = telephonyManager != null ? telephonyManager.getSimCountryIso() : str;
        }
        if (country != null) {
            try {
                if (country.length() == 2) {
                    country = country.toUpperCase();
                    try {
                        switch (country.charAt(0)) {
                            case 'A':
                                switch (country.charAt(1)) {
                                    case 'D':
                                        return f2372z[C0536n.f1002n];
                                    case 'E':
                                        return f2372z[11];
                                    case 'F':
                                        return f2372z[154];
                                    case 'L':
                                        return f2372z[108];
                                    case 'M':
                                        return f2372z[99];
                                    case 'O':
                                        return f2372z[93];
                                    case 'Q':
                                        return f2372z[92];
                                    case 'R':
                                        return f2372z[C0538a.Nb];
                                    case 'T':
                                        return f2372z[69];
                                    case 'U':
                                        return f2372z[157];
                                    case 'Z':
                                        return f2372z[139];
                                    default:
                                        break;
                                }
                            case 'B':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'A':
                                            return f2372z[71];
                                        case 'B':
                                            return f2372z[106];
                                        case 'D':
                                            return f2372z[1];
                                        case 'E':
                                            return f2372z[131];
                                        case 'F':
                                            return f2372z[112];
                                        case 'G':
                                            return f2372z[87];
                                        case 'H':
                                            return f2372z[103];
                                        case 'I':
                                            return f2372z[46];
                                        case 'J':
                                            return f2372z[49];
                                        case 'M':
                                            return f2372z[121];
                                        case 'N':
                                            return f2372z[118];
                                        case 'O':
                                            return f2372z[181];
                                        case 'R':
                                            return f2372z[14];
                                        case 'S':
                                            return f2372z[171];
                                        case 'T':
                                            return f2372z[122];
                                        case 'W':
                                            return f2372z[3];
                                        case 'Y':
                                            return f2372z[24];
                                        case 'Z':
                                            return f2372z[66];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e) {
                                    throw e;
                                }
                            case 'C':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'A':
                                            return "1";
                                        case 'D':
                                            return f2372z[19];
                                        case 'F':
                                            return f2372z[13];
                                        case 'G':
                                            return f2372z[25];
                                        case 'H':
                                            return f2372z[16];
                                        case 'I':
                                            return f2372z[73];
                                        case 'L':
                                            return f2372z[43];
                                        case 'M':
                                            return f2372z[23];
                                        case 'N':
                                            return f2372z[12];
                                        case 'O':
                                            return f2372z[164];
                                        case 'R':
                                            return f2372z[61];
                                        case 'U':
                                            return f2372z[143];
                                        case 'V':
                                            return f2372z[133];
                                        case 'Y':
                                            return f2372z[115];
                                        case 'Z':
                                            return f2372z[104];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e2) {
                                    throw e2;
                                }
                            case 'D':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'E':
                                            return f2372z[160];
                                        case 'J':
                                            return f2372z[C0538a.tb];
                                        case 'K':
                                            return f2372z[8];
                                        case 'O':
                                            return f2372z[85];
                                        case 'Z':
                                            return f2372z[102];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e22) {
                                    throw e22;
                                }
                            case 'E':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'C':
                                            return f2372z[C0607n.Nr];
                                        case 'E':
                                            return f2372z[60];
                                        case 'G':
                                            return f2372z[147];
                                        case 'S':
                                            return f2372z[95];
                                        case 'T':
                                            return f2372z[41];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e222) {
                                    throw e222;
                                }
                            case 'F':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'I':
                                            return f2372z[78];
                                        case 'R':
                                            return f2372z[51];
                                        case 'Ö':
                                            return f2372z[18];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e2222) {
                                    throw e2222;
                                }
                            case 'G':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'A':
                                            return f2372z[153];
                                        case 'B':
                                            return f2372z[C0607n.yt];
                                        case 'E':
                                            return f2372z[173];
                                        case 'F':
                                            return f2372z[126];
                                        case 'H':
                                            return f2372z[165];
                                        case 'I':
                                            return f2372z[50];
                                        case 'L':
                                            return f2372z[22];
                                        case 'M':
                                            return f2372z[34];
                                        case 'N':
                                            return f2372z[174];
                                        case 'P':
                                            return f2372z[44];
                                        case 'Q':
                                            return f2372z[174];
                                        case 'R':
                                            return f2372z[146];
                                        case 'T':
                                            return f2372z[148];
                                        case 'W':
                                            return f2372z[81];
                                        case 'Y':
                                            return f2372z[84];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e22222) {
                                    throw e22222;
                                }
                            case 'H':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'K':
                                            return f2372z[C0607n.Wj];
                                        case 'N':
                                            return f2372z[105];
                                        case 'R':
                                            return f2372z[5];
                                        case 'T':
                                            return f2372z[141];
                                        case 'U':
                                            return f2372z[159];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e222222) {
                                    throw e222222;
                                }
                            case 'I':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'D':
                                            return f2372z[10];
                                        case 'E':
                                            return f2372z[32];
                                        case 'L':
                                            return f2372z[116];
                                        case 'N':
                                            return f2372z[64];
                                        case 'Q':
                                            return f2372z[C0607n.Fb];
                                        case 'R':
                                            return f2372z[110];
                                        case 'S':
                                            return f2372z[C0538a.Lb];
                                        case 'T':
                                            return f2372z[65];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e2222222) {
                                    throw e2222222;
                                }
                            case 'J':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'M':
                                            return f2372z[82];
                                        case 'O':
                                            return f2372z[100];
                                        case 'P':
                                            return f2372z[7];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e22222222) {
                                    throw e22222222;
                                }
                            case 'K':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'E':
                                            return f2372z[C0607n.Ru];
                                        case 'G':
                                            return f2372z[169];
                                        case 'H':
                                            return f2372z[75];
                                        case 'M':
                                            return f2372z[30];
                                        case 'P':
                                            return f2372z[128];
                                        case 'R':
                                            return f2372z[125];
                                        case 'W':
                                            return f2372z[138];
                                        case 'Z':
                                            return "7";
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e222222222) {
                                    throw e222222222;
                                }
                            case 'L':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'A':
                                            return f2372z[C0607n.Hn];
                                        case 'B':
                                            return f2372z[C0607n.Ao];
                                        case 'I':
                                            return f2372z[152];
                                        case 'K':
                                            return f2372z[C0607n.Gk];
                                        case 'R':
                                            return f2372z[107];
                                        case 'S':
                                            return f2372z[17];
                                        case 'T':
                                            return f2372z[56];
                                        case 'U':
                                            return f2372z[C0607n.co];
                                        case 'V':
                                            return f2372z[52];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e2222222222) {
                                    throw e2222222222;
                                }
                            case 'M':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'A':
                                            return f2372z[155];
                                        case 'C':
                                            return f2372z[29];
                                        case 'D':
                                            return f2372z[101];
                                        case 'E':
                                            return f2372z[130];
                                        case 'G':
                                            return f2372z[2];
                                        case 'K':
                                            return f2372z[27];
                                        case 'L':
                                            return f2372z[91];
                                        case 'N':
                                            return f2372z[20];
                                        case 'O':
                                            return f2372z[67];
                                        case 'Q':
                                            return f2372z[6];
                                        case 'R':
                                            return f2372z[137];
                                        case 'T':
                                            return f2372z[111];
                                        case 'U':
                                            return f2372z[145];
                                        case 'V':
                                            return f2372z[96];
                                        case 'W':
                                            return f2372z[58];
                                        case 'X':
                                            return f2372z[70];
                                        case 'Y':
                                            return f2372z[119];
                                        case 'Z':
                                            return f2372z[26];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e22222222222) {
                                    throw e22222222222;
                                }
                            case 'N':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'A':
                                            return f2372z[39];
                                        case 'C':
                                            return f2372z[C0607n.kh];
                                        case 'E':
                                            return f2372z[90];
                                        case 'G':
                                            return f2372z[55];
                                        case 'I':
                                            return f2372z[31];
                                        case 'L':
                                            return f2372z[53];
                                        case 'O':
                                            return f2372z[113];
                                        case 'P':
                                            return f2372z[42];
                                        case 'Z':
                                            return f2372z[C0607n.aw];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e222222222222) {
                                    throw e222222222222;
                                }
                            case 'P':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'A':
                                            return f2372z[180];
                                        case 'E':
                                            return f2372z[C0607n.hu];
                                        case 'F':
                                            return f2372z[158];
                                        case 'G':
                                            return f2372z[80];
                                        case 'H':
                                            return f2372z[C0536n.f1006y];
                                        case 'K':
                                            return f2372z[109];
                                        case 'L':
                                            return f2372z[15];
                                        case 'R':
                                            return f2372z[C0542t.f1193i];
                                        case 'S':
                                            return f2372z[40];
                                        case 'T':
                                            return f2372z[114];
                                        case 'Y':
                                            return f2372z[21];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e2222222222222) {
                                    throw e2222222222222;
                                }
                            case 'R':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'O':
                                            return f2372z[149];
                                        case 'S':
                                            return f2372z[88];
                                        case 'U':
                                            return "7";
                                        case 'W':
                                            return f2372z[62];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e22222222222222) {
                                    throw e22222222222222;
                                }
                            case 'S':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'A':
                                            return f2372z[C0607n.bx];
                                        case 'B':
                                            return f2372z[79];
                                        case 'C':
                                            return f2372z[98];
                                        case 'D':
                                            return f2372z[38];
                                        case 'E':
                                            return f2372z[48];
                                        case 'G':
                                            return f2372z[37];
                                        case 'I':
                                            return f2372z[28];
                                        case 'K':
                                            return f2372z[4];
                                        case 'L':
                                            return f2372z[77];
                                        case 'M':
                                            return f2372z[123];
                                        case 'N':
                                            return f2372z[33];
                                        case 'O':
                                            return f2372z[156];
                                        case 'R':
                                            return f2372z[47];
                                        case 'V':
                                            return f2372z[59];
                                        case 'Y':
                                            return f2372z[151];
                                        case 'Z':
                                            return f2372z[68];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e222222222222222) {
                                    throw e222222222222222;
                                }
                            case 'T':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'D':
                                            return f2372z[89];
                                        case 'G':
                                            return f2372z[63];
                                        case 'H':
                                            return f2372z[74];
                                        case 'J':
                                            return f2372z[83];
                                        case 'M':
                                            return f2372z[168];
                                        case 'N':
                                            return f2372z[35];
                                        case 'R':
                                            return f2372z[97];
                                        case 'T':
                                            return f2372z[36];
                                        case 'W':
                                            return f2372z[C0536n.f995G];
                                        case 'Z':
                                            return f2372z[54];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e2222222222222222) {
                                    throw e2222222222222222;
                                }
                            case 'U':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'A':
                                            return f2372z[167];
                                        case 'G':
                                            return f2372z[76];
                                        case 'S':
                                            return "1";
                                        case 'Y':
                                            return f2372z[166];
                                        case 'Z':
                                            return f2372z[94];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e22222222222222222) {
                                    throw e22222222222222222;
                                }
                            case 'V':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'A':
                                            return f2372z[45];
                                        case 'E':
                                            return f2372z[136];
                                        case 'N':
                                            return f2372z[86];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e222222222222222222) {
                                    throw e222222222222222222;
                                }
                            case 'Y':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'E':
                                            return f2372z[57];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e2222222222222222222) {
                                    throw e2222222222222222222;
                                }
                            case 'Z':
                                try {
                                    switch (country.charAt(1)) {
                                        case 'A':
                                            return f2372z[9];
                                        case 'M':
                                            return f2372z[117];
                                        case 'W':
                                            return f2372z[72];
                                        default:
                                            break;
                                    }
                                } catch (ActivityNotFoundException e22222222222222222222) {
                                    throw e22222222222222222222;
                                }
                        }
                    } catch (ActivityNotFoundException e222222222222222222222) {
                        throw e222222222222222222222;
                    } catch (ActivityNotFoundException e2222222222222222222222) {
                        throw e2222222222222222222222;
                    }
                }
            } catch (ActivityNotFoundException e22222222222222222222222) {
                throw e22222222222222222222222;
            }
        }
        return "";
    }

    /* renamed from: i */
    public static final boolean m6184i() throws C0882e {
        try {
            WDAppManager.m2565a(f2372z[184]);
            try {
                if (f2371h == null) {
                    throw new C0882e(C0745b.m3222b(f2372z[185], new String[0]));
                }
                try {
                    if (f2371h.moveToNext()) {
                        C0880c.m6174a(f2371h);
                        return true;
                    }
                    C0880c.m6180e();
                    return false;
                } catch (C0653m e) {
                    throw e;
                }
            } catch (C0653m e2) {
                throw e2;
            }
        } catch (C0653m e22) {
            throw new C0882e((int) C0607n.Rc, e22.getMessage());
        }
    }

    /* renamed from: z */
    private static String m6185z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 89;
                    break;
                case 1:
                    i2 = 90;
                    break;
                case 2:
                    i2 = 39;
                    break;
                case 3:
                    i2 = 116;
                    break;
                default:
                    i2 = 37;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6186z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 37);
        }
        return toCharArray;
    }
}
