package fr.pcsoft.wdjava.jni;

import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import fr.pcsoft.wdjava.p032m.C0933a;

public final class WDJNIHelper {
    /* renamed from: a */
    public static final int f2524a = 10;
    /* renamed from: b */
    private static boolean f2525b;
    /* renamed from: c */
    private static String f2526c;
    /* renamed from: d */
    private static final ThreadLocal<Long> f2527d = new ThreadLocal();
    /* renamed from: e */
    public static final String f2528e = m6733z(m6734z("co7e~js"));
    /* renamed from: f */
    private static int f2529f;
    /* renamed from: z */
    private static final String[] f2530z;

    static {
        r0 = new String[173];
        r0[0] = m6733z(m6734z("~el\u000f4xgS#<pOl\":Gw%;s"));
        r0[1] = m6733z(m6734z("~el\u000f4xgG#:xnd\""));
        r0[2] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0006`yl\"2Gw%;sXq><zlL\"!]eq"));
        r0[3] = m6733z(m6734z("~el\u000b0`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u0011{~g 0"));
        r0[4] = m6733z(m6734z("~el\u0005;gnw8\u0010xnh);`Hj 9qhq%:z@`5\u0006`yl\"2Bji90Pbk#"));
        r0[5] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0006`yl\"2Gw%;sBk8\u0006`yl\"2Gw%;sXq><zlV8'}eb\u001f!fbk+"));
        r0[6] = m6733z(m6734z("~el\u000f4xgS#<pHd 9vjf'"));
        r0[7] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u001czV8'}eb\u001f!fbk+"));
        r0[8] = m6733z(m6734z("~el\u001f0`]d><uii)\u0017{di"));
        r0[9] = m6733z(m6734z("~el\u000f4xgL\"!Gw%;sBk8"));
        r0[10] = m6733z(m6734z("~el\u000f4xgA%;{Xq><zlA%;{"));
        r0[11] = m6733z(m6734z("~el\u001f0`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u0006`yl\"2"));
        r0[12] = m6733z(m6734z("~el\u000f4xgS#<pOl\":Gw%;sOl\":uyw-,"));
        r0[13] = m6733z(m6734z("~el\u000f4xgS#<pBk8\u0006`yl\"2"));
        r0[14] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0011}ej\u0005;`"));
        r0[15] = m6733z(m6734z("~el\u000f'qjq)\u0011}ej"));
        r0[16] = m6733z(m6734z("~el\u001f0`]d><uii)\u0019{eb"));
        r0[17] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0006`yl\"2Gw%;sXq><zlV8'}eb\u0005;`Bk8\u0017{di)4z"));
        r0[18] = m6733z(m6734z("~el\u000b0`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u0017{di"));
        r0[19] = m6733z(m6734z("~el\u000b0`]d><uii)\u0006`yl\"2"));
        r0[20] = m6733z(m6734z("~el\u000b0`[w#%Pbk#\u0017amc)'"));
        r0[21] = m6733z(m6734z("~el\u001f0`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u0019{eb"));
        r0[22] = m6733z(m6734z("~el\u000f4xgA%;{Xq><zl"));
        r0[23] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0011}ej\b<zd"));
        r0[24] = m6733z(m6734z("}ev)'`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u0017amc)'"));
        r0[25] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0011}ej\b<zdL\"!"));
        r0[26] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0006`yl\"2Gw%;sXq><zlG93rnw\u001f!fbk+\u0006`yl\"2Gw%;s"));
        r0[27] = m6733z(m6734z("~el\u000f4xgS#<pXq><zlV8'}eb\u001f!fbk+"));
        r0[28] = m6733z(m6734z("~el\u000f4xgL\"!Gw%;s"));
        r0[29] = m6733z(m6734z("~el\u0005;}L80fjq#'"));
        r0[30] = m6733z(m6734z("~el\u000f4xgS#<pXq><zlV8'}eb\u0005;`"));
        r0[31] = m6733z(m6734z("~el\u001f0`]d><uii)\u001cz"));
        r0[32] = m6733z(m6734z("~el\u001f0`Bk*:U{u <wjq%:z"));
        r0[33] = m6733z(m6734z("~el\u000b0`[w#%Pbk#\u0016ugi.4w`"));
        r0[34] = m6733z(m6734z("~el\u000b0`[w#%Pbk#\u0006`yl\"2"));
        r0[35] = m6733z(m6734z("~el\u001f0`Ni)8qeq\u000f:xg`/!}dk\u00070mXq><zlS-9anG93rnw"));
        r0[36] = m6733z(m6734z("~el\u000f4xgA%;{jw>4mOl\":"));
        r0[37] = m6733z(m6734z("~el\u0005;gnw8\u0010xnh);`Hj 9qhq%:z@`5\u001czS-9anA%;{"));
        r0[38] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u001czV8'}eb\u001f!fbk+\u0016ugi.4w`L\"!"));
        r0[39] = m6733z(m6734z("~el\u000b0`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u0006`yl\"2"));
        r0[40] = m6733z(m6734z("~el\u001f0`[w#%Pbk#\u0011{~g 0"));
        r0[41] = m6733z(m6734z("~el\u000f4xgL\"!Pbk#\u0006`yl\"2"));
        r0[42] = m6733z(m6734z("~el\u001f0`Ni)8qeq\u000f:xg`/!}dk\u00070mXq><zlS-9anL\"!"));
        r0[43] = m6733z(m6734z("~el\b0xnq)\u0010xnh);`Hj 9qhq%:z@`5\u0006`yl\"2"));
        r0[44] = m6733z(m6734z("~el\u000f4xgA%;{jw>4mXq><zlL\"!"));
        r0[45] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0011}ej\u0005;`Xq><zlV8'}eb"));
        r0[46] = m6733z(m6734z("~el\u000f4xgL\"!]eq\u001f!fbk+\u0016ugi.4w`L\"!COJ.?q"));
        r0[47] = m6733z(m6734z("~el\r1pNi)8qeq\u000f:xg`/!}dk\u001a4x~`\u000e rm`>"));
        r0[48] = m6733z(m6734z("~el\u000f4xgS#<p"));
        r0[49] = m6733z(m6734z("~el\u0005;gnw8\u0010xnh);`Hj 9qhq%:z@`5\u0006`yl\"2Bji90Vdj "));
        r0[50] = m6733z(m6734z("~el\u001e4nOl\":"));
        r0[51] = m6733z(m6734z("~el\u000f4xgA%;{jw>4mOl\":Gw%;s"));
        r0[52] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0006`yl\"2Pbk#\u001cz"));
        r0[53] = m6733z(m6734z("~el\u000f4xgI#;s"));
        r0[54] = m6733z(m6734z("~el\u001f0`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u0011}ej"));
        r0[55] = m6733z(m6734z("~el\u000f4xgV8'}eb\u0005;`"));
        r0[56] = m6733z(m6734z("~el\u000b0`]d><uii)\u0019{eb"));
        r0[57] = m6733z(m6734z("~el\u000f4xgS#<pOl\":Gw%;sIj#9qjk"));
        r0[58] = m6733z(m6734z("~el\u0005;gnw8\u0010xnh);`Hj 9qhq%:z@`5\u001czS-9anL\"!"));
        r0[59] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0011}ej"));
        r0[60] = m6733z(m6734z("~el\u000f4xgL\"!Gw%;sXq><zlV8'}eb\u0005;`Bk8\u001czV8'}eb\u001f!fbk+"));
        r0[61] = m6733z(m6734z("~el\u001f0`]d><uii)\u0011{~g 0"));
        r0[62] = m6733z(m6734z("~el\u001e0xnd?0]`>4`dw"));
        r0[63] = m6733z(m6734z("~el\u000f4xgS#<pOl\":"));
        r0[64] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0006`yl\"2"));
        r0[65] = m6733z(m6734z("~el\u0005;gnw8\u0010xnh);`Hj 9qhq%:z@`5\u001czS-9anV8'}eb"));
        r0[66] = m6733z(m6734z("~el\u000f4xgL\"!"));
        r0[67] = m6733z(m6734z("~el\u000b0`[w#%Pbk#\u001cz"));
        r0[68] = m6733z(m6734z("~el\u001e0xnd?0Pbk#"));
        r0[69] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0006`yl\"2]eq"));
        r0[70] = m6733z(m6734z("~el\u0005;gnw8\u0010xnh);`Hj 9qhq%:z@`5\u0006`yl\"2Bji90Pdp.9q"));
        r0[71] = m6733z(m6734z("~el\u000f4xgA%;{Ol\":"));
        r0[72] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0006`yl\"2Gw%;sXq><zlL\"!Vdj 0ueL\"!"));
        r0[73] = m6733z(m6734z("~el\b0xnq)\u0010xnh);`Hj 9qhq%:z@`5\u001cz"));
        r0[74] = m6733z(m6734z("~el\u000f4xgV8'}eb\u0005;`Xq><zl"));
        r0[75] = m6733z(m6734z("~el\u000b0`]d><uii)\u0017{di"));
        r0[76] = m6733z(m6734z("~el\u000f4xgS#<pBk8\u001cz"));
        r0[77] = m6733z(m6734z("~el\r1pNi)8qeq\u000f:xg`/!}dk\u001a4x~`\u0005;`"));
        r0[78] = m6733z(m6734z("~el\u000f4xgS#<pXq><zlV8'}eb\u001f!fbk+\u0006`yl\"2"));
        r0[79] = m6733z(m6734z("~el\u000b0`]d><uii)\u0017amc)'"));
        r0[80] = m6733z(m6734z("~el\u001f0`[w#%Pbk#\u0016ugi.4w`"));
        r0[81] = m6733z(m6734z("~el\u000f4xgR\b\u001ava`8\u001cz"));
        r0[82] = m6733z(m6734z("~el\u000b0`Ni)8qeq\u000f:xg`/!}dk\u00070mXq><zlS-9anG#:x"));
        r0[83] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0006`yl\"2Pbk#"));
        r0[84] = m6733z(m6734z("~el\u00010gxd+0Qyw) f"));
        r0[85] = m6733z(m6734z("~el\u000f:drA%;{"));
        r0[86] = m6733z(m6734z("~el\r1pNi)8qeq\u000f:xg`/!}dk\u001a4x~`\u000e:{g"));
        r0[87] = m6733z(m6734z("~el\u000f4xgV8'}eb\b<zd"));
        r0[88] = m6733z(m6734z("~el\r1pNi)8qeq\u000f:xg`/!}dk\u001a4x~`\b:aii)"));
        r0[89] = m6733z(m6734z("~el\b0xnq)\u0014xg@ 0ynk8\u0016{gi)6`bj\""));
        r0[90] = m6733z(m6734z("~el\u000f4xgL\"!]eq\u001f!fbk+\u0016ugi.4w`L\"!"));
        r0[91] = m6733z(m6734z("~el\u0005;gnw8\u0010xnh);`Hj 9qhq%:z@`5\u0006`yl\"2Bji90]eq"));
        r0[92] = m6733z(m6734z("~el\u000f4xgL\"!Pbk#\u001cz"));
        r0[93] = m6733z(m6734z("~el\u0005;gnw8\u0010xnh);`Hj 9qhq%:z@`5\u0006`yl\"2Bji90V~c*0f"));
        r0[94] = m6733z(m6734z("~el\u001f0`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u0017amc)'"));
        r0[95] = m6733z(m6734z("~el\u000b0`Ni)8qeq\u000f:xg`/!}dk\u00070mXq><zlS-9anI#;s"));
        r0[96] = m6733z(m6734z("~el\u000b0`]d><uii)\u001cz"));
        r0[97] = m6733z(m6734z("~el\u001f0`[w#%Pbk#\u001fu~b)"));
        r0[98] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0006`yl\"2Gw%;sXq><zlV8'}eb\u0005;`Bk8"));
        r0[99] = m6733z(m6734z("~el\r1pNi)8qeq\u000f:xg`/!}dk\u001a4x~`\u0000:zl"));
        r0[100] = m6733z(m6734z("~el\u000b0`[w#%Pbk#\u0011{~g 0"));
        r0[101] = m6733z(m6734z("~el\u000f4xgS#<pXq><zlA%;{jw>4m"));
        r0[102] = m6733z(m6734z("~el\u0005;gnw8\u0010xnh);`Hj 9qhq%:z@`5\u0006`yl\"2Bji90Gw%;s"));
        r0[103] = m6733z(m6734z("~el\u000b0`Ni)8qeq\u000f:xg`/!}dk\u00070mXq><zlS-9anV8'}eb"));
        r0[104] = m6733z(m6734z("~el\u001f0`[w#%Pbk#\u0017amc)'"));
        r0[105] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0011}ej\b<zdV8'}eb"));
        r0[106] = m6733z(m6734z("~el\u000f4xgA%;{jw>4mOl\":]eq"));
        r0[107] = m6733z(m6734z("~el\u000f4xgS#<pXq><zlV8'}eb\u000e rm`>"));
        r0[108] = m6733z(m6734z("~el\r1pNi)8qeq\u000f:xg`/!}dk\u001a4x~`\b<zd"));
        r0[109] = m6733z(m6734z("~el\u001b4x`L80fjq#'Pbk#"));
        r0[110] = m6733z(m6734z("~el\u000f4xgS#<pOl\":Gw%;sXq><zlV8'}eb"));
        r0[111] = m6733z(m6734z("~el\u000b0`[w#%Pbk#\u0017{di"));
        r0[112] = m6733z(m6734z("~el\u000f4xgV8'}eb\u001f!fbk+\u001cz"));
        r0[113] = m6733z(m6734z("~el\u001f0`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u0011{~g 0"));
        r0[114] = m6733z(m6734z("~el\u001f0`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u001cz"));
        r0[115] = m6733z(m6734z("~el\u000b0`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u0011}ej"));
        r0[116] = m6733z(m6734z("~el\u000f9{e`\b<zd"));
        r0[117] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u001czV8'}eb"));
        r0[118] = m6733z(m6734z("~el\u001f0`Ni)8qeq\u000f:xg`/!}dk\u00070mXq><zlS-9anG#:x"));
        r0[119] = m6733z(m6734z("~el\u000b0`Ni)8qeq\u000f:xg`/!}dk\u00070mXq><zlS-9anA# vg`"));
        r0[C0607n.co] = m6733z(m6734z("~el\u000f4xgS#<pAd92q"));
        r0[121] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0011}ej\b<zdL\"!Gw%;sXq><zl"));
        r0[122] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0006`yl\"2]eq\u001f!fbk+\u0006`yl\"2"));
        r0[123] = m6733z(m6734z("~el\u001f0`[w#%Pbk#\u0011}ej"));
        r0[C0607n.Hn] = m6733z(m6734z("~el\u000f4xgV8'}eb"));
        r0[125] = m6733z(m6734z("~el\u000f4xgS#<pOl\":Gw%;sXq><zlL\"!"));
        r0[126] = m6733z(m6734z("~el\u000f4xgV8'}eb-'fj|\b<zdA%;{"));
        r0[C0607n.bx] = m6733z(m6734z("~el\u000f4xgV8'}eb\b<zdV8'}eb\u001f!fbk+"));
        r0[128] = m6733z(m6734z("~el\u000f4xgS#<pXq><zl"));
        r0[C0607n.Wj] = m6733z(m6734z("~el\u000f4xgS#<pIj#9qjk"));
        r0[130] = m6733z(m6734z("~el\u000f'qjq)\u0001|y`-1Wdk80l"));
        r0[131] = m6733z(m6734z("~el\u0005;gnw8\u0010xnh);`Hj 9qhq%:z@`5\u001czS-9anI#;s"));
        r0[C0538a.tb] = m6733z(m6734z("~el\u000f4xgS#<pXq><zlL\"!Gw%;sXq><zl"));
        r0[133] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0011}ej\u001f!fbk+"));
        r0[C0607n.Fb] = m6733z(m6734z("~el\u0005;gnw8\u0010xnh);`Hj 9qhq%:z@`5\u001czS-9anA# vg`"));
        r0[C0538a.Nb] = m6733z(m6734z("~el\u000b0`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u001cz"));
        r0[136] = m6733z(m6734z("~el\u000b0`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u0017amc)'"));
        r0[137] = m6733z(m6734z("~el\r1pNi)8qeq\u000f:xg`/!}dk\u001a4x~`\u001f!fbk+"));
        r0[138] = m6733z(m6734z("~el\u000f4xgV8'}eb\u0005;`Xq><zlL\"!"));
        r0[139] = m6733z(m6734z("~el\u000f4xgL\"!Pbk#"));
        r0[C0542t.f1193i] = m6733z(m6734z("~el\u000f4xgS#<pXq><zlG#:xnd\""));
        r0[141] = m6733z(m6734z("~el\u001f0`[w#%Pbk#\u0019{eb"));
        r0[C0536n.f995G] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0006`yl\"2Gw%;s"));
        r0[143] = m6733z(m6734z("~el\u000b0`[w#%Pbk#\u0011}ej"));
        r0[C0538a.Lb] = m6733z(m6734z("~el\u000f4xgS#<pBk8"));
        r0[145] = m6733z(m6734z("~el\u001f0`]d><uii)\u0017amc)'"));
        r0[146] = m6733z(m6734z("~el\u001f0`Ni)8qeq\u000f:xg`/!}dk\u00070mXq><zlS-9anV8'}eb"));
        r0[147] = m6733z(m6734z("~el\u000b0`]d><uii)\u0011{~g 0"));
        r0[148] = m6733z(m6734z("~el\u001f0`Ni)8qeq\u000f:xg`/!}dk\u00070mXq><zlS-9anA# vg`"));
        r0[149] = m6733z(m6734z("~el\u000b0`Ni)8qeq\u000f:xg`/!}dk\u00070mXq><zlS-9anG93rnw"));
        r0[C0536n.f1006y] = m6733z(m6734z("~el\u001f0`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u0017{di"));
        r0[151] = m6733z(m6734z("~el\u0005;gnw8\u0010xnh);`Hj 9qhq%:z@`5\u001czS-9anG#:x"));
        r0[152] = m6733z(m6734z("~el\u000f4xgL\"!]eq"));
        r0[153] = m6733z(m6734z("~el\u000b0`Ni)8qeq\u000f:xg`/!}dk\u00070mXq><zlS-9anL\"!"));
        r0[154] = m6733z(m6734z("~el\u001f0`Ni)8qeq\u000f:xg`/!}dk\u00070mXq><zlS-9anA%;{"));
        r0[155] = m6733z(m6734z("~el\u001f0`[w#%Pbk#\u0006`yl\"2"));
        r0[156] = m6733z(m6734z("~el\u0005;gnw8\u0010xnh);`Hj 9qhq%:z@`5\u0006`yl\"2Bji90Xdk+"));
        r0[157] = m6733z(m6734z("~el\u000f4xgV8'}eb\b<zdL\"!"));
        r0[158] = m6733z(m6734z("~el\u000f4xgG93rnw\u0005;`"));
        r0[159] = m6733z(m6734z("~el\u000b0`Eg\t9qf`\"!]eF#9xnf8<{e"));
        r0[160] = m6733z(m6734z("~el\u000b0`Ni)8qeq\u000f:xg`/!}dk\u00070mBk8\u0003ugp)\u0019{eb"));
        r0[C0607n.kh] = m6733z(m6734z("~el\u001f0`]d><uii)\u0006`yl\"2"));
        r0[C0607n.Ru] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u0006`yl\"2Pbk#\u001czV8'}eb\u001f!fbk+"));
        r0[C0607n.Ao] = m6733z(m6734z("~el\u001f0`[w#%Pbk#\u001cz"));
        r0[164] = m6733z(m6734z("~el\u001f0`Ni)8qeq\u000f:xg`/!}dk\u00070mXq><zlS-9anI#;s"));
        r0[165] = m6733z(m6734z("~el\u001f0`[w#%Pbk#\u0017{di"));
        r0[166] = m6733z(m6734z("~el\u000f4xgV8'}eb\u001f!fbk+"));
        r0[167] = m6733z(m6734z("~el\u000f4xgI#;sBk8\u0006`yl\"2"));
        r0[168] = m6733z(m6734z("~el\u000b0`[w#%Pbk#\u0019{eb"));
        r0[169] = m6733z(m6734z("~el\u000b0`Ni)8qeq\u000f:xg`/!}dk\u00070mXq><zlS-9anA%;{"));
        r0[C0536n.f1002n] = m6733z(m6734z("RDK\u000f\u0001]DK\u0013\u001b[EZ\u001f\u0000D[J\u001e\u0001QNZ\u0014m\""));
        r0[171] = m6733z(m6734z("~el\u000f4xgG#:xnd\"\u001cz"));
        r0[172] = m6733z(m6734z("~el\u000f4xgV8'}eb\u001f!fbk+\u0006`yl\"2"));
        f2530z = r0;
        f2525b = false;
        f2529f = 0;
        f2526c = "";
        if (kb.m3976f()) {
            C0924a c0929e = new C0929e(f2528e);
            try {
                c0929e.mo3223a();
                if (jniLoadJav(c0929e.mo3224b())) {
                    m6614a(WDProjet.getInstance().getNomApplication());
                    f2525b = true;
                } else {
                    f2526c = m6568a();
                }
            } catch (Exception e) {
                f2526c = e.getMessage();
            }
            try {
                if (f2525b) {
                    WDProjet.getInstance().ajouterEcouteurProjet(new C0925b());
                    return;
                }
                return;
            } catch (Exception e2) {
                throw e2;
            }
        }
        f2529f = WDErreurManager.f1757b;
        f2526c = C0745b.m3222b(f2530z[C0536n.f1002n], new String[0]);
    }

    /* renamed from: a */
    public static final int m6558a(int i, int i2, int i3, String str, WDCallback wDCallback, int i4) throws WDJNIException {
        try {
            return jniCallIntIntStringCallbackInt(i, i2, m6643b(), i3, str, wDCallback, i4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[90], e);
        }
    }

    /* renamed from: a */
    public static final int m6559a(int i, int i2, int i3, String str, WDCallback wDCallback, int i4, WDObjet wDObjet) throws WDJNIException {
        try {
            return jniCallIntIntStringCallbackIntWDObjet(i, i2, m6643b(), i3, str, wDCallback, i4, wDObjet);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[46], e);
        }
    }

    /* renamed from: a */
    public static final int m6560a(int i, int i2, long j, String str) throws WDJNIException {
        try {
            return jniCallIntDinoString(i, i2, m6643b(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[41], e);
        }
    }

    /* renamed from: a */
    public static final int m6561a(int i, int i2, String str, String str2, String str3, int i3, int i4, int i5, String str4, String str5) throws WDJNIException {
        try {
            return jniCallIntStringStringStringIntIntIntStringString(i, i2, m6643b(), str, str2, str3, i3, i4, i5, str4, str5);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[60], e);
        }
    }

    /* renamed from: a */
    public static final int m6562a(long j, int i, boolean z, double d) throws WDJNIException {
        try {
            return jniAddElementCollectionValueDouble(m6643b(), j, i, z, d);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[88], e);
        }
    }

    /* renamed from: a */
    public static final int m6563a(long j, int i, boolean z, long j2) throws WDJNIException {
        try {
            return jniAddElementCollectionValueDino(m6643b(), j, i, z, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[108], e);
        }
    }

    /* renamed from: a */
    public static final int m6564a(long j, int i, boolean z, boolean z2) throws WDJNIException {
        try {
            return jniAddElementCollectionValueBool(m6643b(), j, i, z, z2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[86], e);
        }
    }

    /* renamed from: a */
    public static final int m6565a(long j, int i, boolean z, byte[] bArr) throws WDJNIException {
        try {
            return jniAddElementCollectionValueBuffer(m6643b(), j, i, z, bArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[47], e);
        }
    }

    /* renamed from: a */
    public static final long m6566a(int i, int i2) throws WDJNIException {
        try {
            return jniCreateDino(m6643b(), i, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[15], e);
        }
    }

    /* renamed from: a */
    public static final long m6567a(long j, int i) throws WDJNIException {
        try {
            return jniGetPropDinoDino(m6643b(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[143], e);
        }
    }

    /* renamed from: a */
    public static final String m6568a() throws WDJNIException {
        try {
            return jniMessageErreur();
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[84], e);
        }
    }

    /* renamed from: a */
    public static final String m6569a(int i, int i2, int i3, String str) throws WDJNIException {
        try {
            return jniCallStringIntString(i, i2, m6643b(), i3, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[74], e);
        }
    }

    /* renamed from: a */
    public static final String m6570a(int i, int i2, int i3, String str, int i4) throws WDJNIException {
        try {
            return jniCallStringIntStringInt(i, i2, m6643b(), i3, str, i4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[138], e);
        }
    }

    /* renamed from: a */
    public static final String m6571a(int i, int i2, long j, String str, String str2) throws WDJNIException {
        try {
            return jniCallStringDinoStringString(i, i2, m6643b(), j, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[C0607n.bx], e);
        }
    }

    /* renamed from: a */
    public static final String m6572a(int i, int i2, String str, String str2) throws WDJNIException {
        try {
            return jniCallStringStringString(i, i2, m6643b(), str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[172], e);
        }
    }

    /* renamed from: a */
    public static final String m6573a(long j, int i, boolean z, String str) throws WDJNIException {
        try {
            return jniGetElementCollectionKeyStringValueString(m6643b(), j, i, z, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[103], e);
        }
    }

    /* renamed from: a */
    public static final void m6574a(int i, int i2, int i3, double d) throws WDJNIException {
        try {
            jniSetVariableDouble(m6643b(), i, i2, i3, d);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[61], e);
        }
    }

    /* renamed from: a */
    public static final void m6575a(int i, int i2, int i3, int i4) throws WDJNIException {
        try {
            jniCallVoidIntInt(i, i2, m6643b(), i3, i4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[76], e);
        }
    }

    /* renamed from: a */
    public static final void m6576a(int i, int i2, int i3, long j) throws WDJNIException {
        try {
            jniSetVariableLong(m6643b(), i, i2, i3, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[16], e);
        }
    }

    /* renamed from: a */
    public static final void m6577a(int i, int i2, int i3, boolean z) throws WDJNIException {
        try {
            jniSetVariableBool(m6643b(), i, i2, i3, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[8], e);
        }
    }

    /* renamed from: a */
    public static final void m6578a(int i, int i2, int i3, byte[] bArr) throws WDJNIException {
        try {
            jniSetVariableBuffer(m6643b(), i, i2, i3, bArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[145], e);
        }
    }

    /* renamed from: a */
    public static final void m6579a(int i, int i2, long j, String str, String str2, int i3) throws WDJNIException {
        try {
            jniCallVoidDinoStringStringInt(i, i2, m6643b(), j, str, str2, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[125], e);
        }
    }

    /* renamed from: a */
    public static final void m6580a(int i, int i2, long j, String str, String str2, String str3) throws WDJNIException {
        try {
            jniCallVoidDinoStringStringString(i, i2, m6643b(), j, str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[110], e);
        }
    }

    /* renamed from: a */
    public static final void m6581a(int i, int i2, long j, String str, boolean z) throws WDJNIException {
        try {
            jniCallVoidDinoStringBoolean(i, i2, m6643b(), j, str, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[57], e);
        }
    }

    /* renamed from: a */
    public static final void m6582a(int i, int i2, long j, String str, long[] jArr) throws WDJNIException {
        try {
            jniCallVoidDinoStringDinoarray(i, i2, m6643b(), j, str, jArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[12], e);
        }
    }

    /* renamed from: a */
    public static final void m6583a(int i, int i2, WDCallback wDCallback, int i3) throws WDJNIException {
        try {
            jniCallVoidCallbackInt(i, i2, m6643b(), wDCallback, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[6], e);
        }
    }

    /* renamed from: a */
    public static final void m6584a(int i, int i2, WDJaugeJNI wDJaugeJNI, int i3) throws WDJNIException {
        try {
            jniCallVoidJaugeInt(i, i2, m6643b(), wDJaugeJNI, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[C0607n.co], e);
        }
    }

    /* renamed from: a */
    public static final void m6585a(int i, int i2, String str, String str2, int i3) throws WDJNIException {
        try {
            jniCallVoidStringStringInt(i, i2, m6643b(), str, str2, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[30], e);
        }
    }

    /* renamed from: a */
    public static final void m6586a(int i, int i2, String str, String str2, String str3) throws WDJNIException {
        try {
            jniCallVoidStringStringString(i, i2, m6643b(), str, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[27], e);
        }
    }

    /* renamed from: a */
    public static final void m6587a(int i, int i2, String str, String str2, String str3, String str4) throws WDJNIException {
        try {
            jniCallVoidStringStringStringString(i, i2, m6643b(), str, str2, str3, str4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[78], e);
        }
    }

    /* renamed from: a */
    public static final void m6588a(int i, int i2, String str, String str2, byte[] bArr) throws WDJNIException {
        try {
            jniCallVoidStringStringBuffer(i, i2, m6643b(), str, str2, bArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[107], e);
        }
    }

    /* renamed from: a */
    public static final void m6589a(int i, int i2, String str, boolean z) throws WDJNIException {
        try {
            jniCallVoidStringBoolean(i, i2, m6643b(), str, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[C0542t.f1193i], e);
        }
    }

    /* renamed from: a */
    public static final void m6590a(int i, int i2, String str, long[] jArr) throws WDJNIException {
        try {
            jniCallVoidStringDinoarray(i, i2, m6643b(), str, jArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[101], e);
        }
    }

    /* renamed from: a */
    public static final void m6591a(int i, int i2, boolean z) throws WDJNIException {
        try {
            jniCallVoidBoolean(i, i2, m6643b(), z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[C0607n.Wj], e);
        }
    }

    /* renamed from: a */
    public static final void m6592a(long j) throws WDJNIException {
        try {
            jniRazDino(m6643b(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[50], e);
        }
    }

    /* renamed from: a */
    public static final void m6593a(long j, int i, double d) throws WDJNIException {
        try {
            jniSetPropDinoDouble(m6643b(), j, i, d);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[40], e);
        }
    }

    /* renamed from: a */
    public static final void m6594a(long j, int i, int i2) throws WDJNIException {
        try {
            jniSetPropDinoInt(m6643b(), j, i, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[C0607n.Ao], e);
        }
    }

    /* renamed from: a */
    public static final void m6595a(long j, int i, long j2) throws WDJNIException {
        try {
            jniSetPropDinoDino(m6643b(), j, i, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[123], e);
        }
    }

    /* renamed from: a */
    public static final void m6596a(long j, int i, WDCallback wDCallback) throws WDJNIException {
        try {
            jniSetPropDinoCallback(m6643b(), j, i, wDCallback);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[80], e);
        }
    }

    /* renamed from: a */
    public static final void m6597a(long j, int i, WDJaugeJNI wDJaugeJNI) throws WDJNIException {
        try {
            jniSetPropDinoJauge(m6643b(), j, i, wDJaugeJNI);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[97], e);
        }
    }

    /* renamed from: a */
    public static final void m6598a(long j, int i, String str) throws WDJNIException {
        try {
            jniSetPropDinoString(m6643b(), j, i, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[155], e);
        }
    }

    /* renamed from: a */
    public static final void m6599a(long j, int i, boolean z) throws WDJNIException {
        try {
            jniDeleteAllElementCollection(m6643b(), j, i, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[89], e);
        }
    }

    /* renamed from: a */
    public static final void m6600a(long j, int i, boolean z, int i2, double d) throws WDJNIException {
        try {
            jniInsertElementCollectionKeyIntValueDouble(m6643b(), j, i, z, i2, d);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[C0607n.Fb], e);
        }
    }

    /* renamed from: a */
    public static final void m6601a(long j, int i, boolean z, int i2, int i3) throws WDJNIException {
        try {
            jniSetElementCollectionKeyIntValueInt(m6643b(), j, i, z, i2, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[114], e);
        }
    }

    /* renamed from: a */
    public static final void m6602a(long j, int i, boolean z, int i2, long j2) throws WDJNIException {
        try {
            jniSetElementCollectionKeyIntValueDino(m6643b(), j, i, z, i2, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[54], e);
        }
    }

    /* renamed from: a */
    public static final void m6603a(long j, int i, boolean z, int i2, String str) throws WDJNIException {
        try {
            jniInsertElementCollectionKeyIntValueString(m6643b(), j, i, z, i2, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[65], e);
        }
    }

    /* renamed from: a */
    public static final void m6604a(long j, int i, boolean z, int i2, boolean z2) throws WDJNIException {
        try {
            jniInsertElementCollectionKeyIntValueBool(m6643b(), j, i, z, i2, z2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[151], e);
        }
    }

    /* renamed from: a */
    public static final void m6605a(long j, int i, boolean z, int i2, byte[] bArr) throws WDJNIException {
        try {
            jniInsertElementCollectionKeyIntValueBuffer(m6643b(), j, i, z, i2, bArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[24], e);
        }
    }

    /* renamed from: a */
    public static final void m6606a(long j, int i, boolean z, String str, double d) throws WDJNIException {
        try {
            jniSetElementCollectionKeyStringValueDouble(m6643b(), j, i, z, str, d);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[148], e);
        }
    }

    /* renamed from: a */
    public static final void m6607a(long j, int i, boolean z, String str, int i2) throws WDJNIException {
        try {
            jniInsertElementCollectionKeyStringValueInt(m6643b(), j, i, z, str, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[91], e);
        }
    }

    /* renamed from: a */
    public static final void m6608a(long j, int i, boolean z, String str, long j2) throws WDJNIException {
        try {
            jniInsertElementCollectionKeyStringValueLong(m6643b(), j, i, z, str, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[156], e);
        }
    }

    /* renamed from: a */
    public static final void m6609a(long j, int i, boolean z, String str, String str2) throws WDJNIException {
        try {
            jniInsertElementCollectionKeyStringValueString(m6643b(), j, i, z, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[102], e);
        }
    }

    /* renamed from: a */
    public static final void m6610a(long j, int i, boolean z, String str, boolean z2) throws WDJNIException {
        try {
            jniInsertElementCollectionKeyStringValueBool(m6643b(), j, i, z, str, z2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[49], e);
        }
    }

    /* renamed from: a */
    public static final void m6611a(long j, int i, boolean z, String str, byte[] bArr) throws WDJNIException {
        try {
            jniInsertElementCollectionKeyStringValueBuffer(m6643b(), j, i, z, str, bArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[93], e);
        }
    }

    /* renamed from: a */
    public static final void m6612a(long j, int i, byte[] bArr) throws WDJNIException {
        try {
            jniSetPropDinoBuffer(m6643b(), j, i, bArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[104], e);
        }
    }

    /* renamed from: a */
    public static final void m6613a(long j, long j2) throws WDJNIException {
        try {
            jniCopyDino(m6643b(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[85], e);
        }
    }

    /* renamed from: a */
    public static void m6614a(String str) throws WDJNIException {
        try {
            jniSetInfoApplication(str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[32], e);
        }
    }

    /* renamed from: a */
    public static final void m6615a(boolean z) {
        if (!m6686c()) {
            WDErreurManager.m2874a(f2529f, f2526c);
        } else if (z && kb.m3982l()) {
            WDErreurManager.m2874a(WDErreurManager.f1757b, C0745b.m3222b(f2530z[C0536n.f1002n], new String[0]));
        }
    }

    /* renamed from: a */
    public static final boolean m6616a(int i, int i2, int i3) throws WDJNIException {
        try {
            return jniCallBooleanInt(i, i2, m6643b(), i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[171], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6617a(int i, int i2, int i3, String str, String str2) throws WDJNIException {
        try {
            return jniCallBooleanIntStringString(i, i2, m6643b(), i3, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[7], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6618a(int i, int i2, int i3, String str, String str2, WDCallback wDCallback, int i4) throws WDJNIException {
        try {
            return jniCallBooleanIntStringStringCallbackInt(i, i2, m6643b(), i3, str, str2, wDCallback, i4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[38], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6619a(int i, int i2, long j, int i3) throws WDJNIException {
        try {
            return jniCallBooleanDinoInt(i, i2, m6643b(), j, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[14], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6620a(int i, int i2, long j, int i3, String str, String str2) throws WDJNIException {
        try {
            return jniCallBooleanDinoIntStringString(i, i2, m6643b(), j, i3, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[45], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6621a(int i, int i2, long j, long j2) throws WDJNIException {
        try {
            return jniCallBooleanDinoDino(i, i2, m6643b(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[23], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6622a(int i, int i2, long j, long j2, int i3) throws WDJNIException {
        try {
            return jniCallBooleanDinoDinoInt(i, i2, m6643b(), j, j2, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[25], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6623a(int i, int i2, long j, long j2, int i3, String str, String str2) throws WDJNIException {
        try {
            return jniCallBooleanDinoDinoIntStringString(i, i2, m6643b(), j, j2, i3, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[121], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6624a(int i, int i2, long j, long j2, String str) throws WDJNIException {
        try {
            return jniCallBooleanDinoDinoString(i, i2, m6643b(), j, j2, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[105], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6625a(int i, int i2, String str, int i3) throws WDJNIException {
        try {
            return jniCallBooleanStringInt(i, i2, m6643b(), str, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[69], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6626a(int i, int i2, String str, int i3, String str2, String str3) throws WDJNIException {
        try {
            return jniCallBooleanStringIntStringString(i, i2, m6643b(), str, i3, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[122], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6627a(int i, int i2, String str, long j) throws WDJNIException {
        try {
            return jniCallBooleanStringDino(i, i2, m6643b(), str, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[83], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6628a(int i, int i2, String str, long j, int i3) throws WDJNIException {
        try {
            return jniCallBooleanStringDinoInt(i, i2, m6643b(), str, j, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[52], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6629a(int i, int i2, String str, long j, int i3, String str2, String str3) throws WDJNIException {
        try {
            return jniCallBooleanStringDinoIntStringString(i, i2, m6643b(), str, j, i3, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[C0607n.Ru], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6630a(int i, int i2, String str, String str2, int i3, String str3, String str4, String str5, String str6, String str7) throws WDJNIException {
        try {
            return jniCallBooleanStringStringIntStringStringStringStringString(i, i2, m6643b(), str, str2, i3, str3, str4, str5, str6, str7);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[5], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6631a(int i, int i2, String str, String str2, String str3, int i3, int i4) throws WDJNIException {
        try {
            return jniCallBooleanStringStringStringIntInt(i, i2, m6643b(), str, str2, str3, i3, i4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[2], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6632a(int i, int i2, String str, String str2, String str3, int i3, boolean z, int i4) throws WDJNIException {
        try {
            return jniCallBooleanStringStringStringIntBooleanInt(i, i2, m6643b(), str, str2, str3, i3, z, i4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[72], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6633a(int i, int i2, String str, String str2, String str3, String str4, int i3, int i4) throws WDJNIException {
        try {
            return jniCallBooleanStringStringStringStringIntInt(i, i2, m6643b(), str, str2, str3, str4, i3, i4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[98], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6634a(int i, int i2, String str, String str2, String str3, String str4, int i3, int i4, boolean z) throws WDJNIException {
        try {
            return jniCallBooleanStringStringStringStringIntIntBoolean(i, i2, m6643b(), str, str2, str3, str4, i3, i4, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[17], e);
        }
    }

    /* renamed from: a */
    public static final boolean m6635a(int i, int i2, String str, String str2, String str3, byte[] bArr, String str4, String str5, String str6) throws WDJNIException {
        try {
            return jniCallBooleanStringStringStringBufferStringStringString(i, i2, m6643b(), str, str2, str3, bArr, str4, str5, str6);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[26], e);
        }
    }

    /* renamed from: a */
    public static final byte[] m6636a(long j, int i, boolean z, int i2) throws WDJNIException {
        try {
            return jniGetElementCollectionKeyIntValueBuffer(m6643b(), j, i, z, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[136], e);
        }
    }

    /* renamed from: a */
    public static final long[] m6637a(int i, int i2, long j) throws WDJNIException {
        try {
            return jniCallDinoarrayDino(i, i2, m6643b(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[36], e);
        }
    }

    /* renamed from: a */
    public static final long[] m6638a(int i, int i2, String str) throws WDJNIException {
        try {
            return jniCallDinoarrayString(i, i2, m6643b(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[51], e);
        }
    }

    /* renamed from: b */
    public static final int m6639b(long j, int i, boolean z) throws WDJNIException {
        try {
            return jniGetNbElementInCollection(m6643b(), j, i, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[159], e);
        }
    }

    /* renamed from: b */
    public static final int m6640b(long j, int i, boolean z, int i2) throws WDJNIException {
        try {
            return jniDeleteElementCollectionKeyInt(m6643b(), j, i, z, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[73], e);
        }
    }

    /* renamed from: b */
    public static final int m6641b(long j, int i, boolean z, long j2) throws WDJNIException {
        try {
            return jniAddElementCollectionValueLong(m6643b(), j, i, z, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[99], e);
        }
    }

    /* renamed from: b */
    public static final int m6642b(long j, int i, boolean z, String str) throws WDJNIException {
        try {
            return jniDeleteElementCollectionKeyString(m6643b(), j, i, z, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[43], e);
        }
    }

    /* renamed from: b */
    public static final long m6643b() throws WDJNIException {
        Long l = (Long) f2527d.get();
        if (l == null) {
            try {
                Long valueOf = Long.valueOf(jniCreateThreadContext());
                f2527d.set(valueOf);
                Thread currentThread = Thread.currentThread();
                if (currentThread instanceof C0933a) {
                    ((C0933a) currentThread).m6792a(new C0927c());
                }
                l = valueOf;
            } catch (UnsatisfiedLinkError e) {
                throw e;
            } catch (UnsatisfiedLinkError e2) {
                throw new WDJNIException(f2530z[130], e2);
            }
        }
        return l.longValue();
    }

    /* renamed from: b */
    public static final long m6644b(int i, int i2, String str, long j) throws WDJNIException {
        try {
            return jniCallDinoStringDino(i, i2, m6643b(), str, j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[10], e);
        }
    }

    /* renamed from: b */
    public static final long m6645b(long j) throws WDJNIException {
        try {
            return jniCloneDino(m6643b(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[116], e);
        }
    }

    /* renamed from: b */
    public static final long m6646b(long j, int i) throws WDJNIException {
        try {
            return jniWalkIteratorDino(m6643b(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[109], e);
        }
    }

    /* renamed from: b */
    public static final long m6647b(long j, int i, int i2) throws WDJNIException {
        try {
            return jniInitIterator(m6643b(), j, i, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[29], e);
        }
    }

    /* renamed from: b */
    public static final void m6648b(int i, int i2) throws WDJNIException {
        try {
            jniCallVoid(i, i2, m6643b());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[48], e);
        }
    }

    /* renamed from: b */
    public static final void m6649b(int i, int i2, int i3, int i4) throws WDJNIException {
        try {
            jniSetVariableInt(m6643b(), i, i2, i3, i4);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[31], e);
        }
    }

    /* renamed from: b */
    public static final void m6650b(int i, int i2, long j) throws WDJNIException {
        try {
            jniCallVoidDino(i, i2, m6643b(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[63], e);
        }
    }

    /* renamed from: b */
    public static final void m6651b(int i, int i2, String str, int i3, String str2, String str3) throws WDJNIException {
        try {
            jniCallVoidStringIntStringString(i, i2, m6643b(), str, i3, str2, str3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[C0538a.tb], e);
        }
    }

    /* renamed from: b */
    public static final void m6652b(long j, int i, long j2) throws WDJNIException {
        try {
            jniSetPropDinoLong(m6643b(), j, i, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[141], e);
        }
    }

    /* renamed from: b */
    public static final void m6653b(long j, int i, boolean z, int i2, double d) throws WDJNIException {
        try {
            jniSetElementCollectionKeyIntValueDouble(m6643b(), j, i, z, i2, d);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[113], e);
        }
    }

    /* renamed from: b */
    public static final void m6654b(long j, int i, boolean z, int i2, int i3) throws WDJNIException {
        try {
            jniInsertElementCollectionKeyIntValueInt(m6643b(), j, i, z, i2, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[58], e);
        }
    }

    /* renamed from: b */
    public static final void m6655b(long j, int i, boolean z, int i2, long j2) throws WDJNIException {
        try {
            jniInsertElementCollectionKeyIntValueDino(m6643b(), j, i, z, i2, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[37], e);
        }
    }

    /* renamed from: b */
    public static final void m6656b(long j, int i, boolean z, int i2, String str) throws WDJNIException {
        try {
            jniSetElementCollectionKeyIntValueString(m6643b(), j, i, z, i2, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[11], e);
        }
    }

    /* renamed from: b */
    public static final void m6657b(long j, int i, boolean z, int i2, boolean z2) throws WDJNIException {
        try {
            jniSetElementCollectionKeyIntValueBool(m6643b(), j, i, z, i2, z2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[C0536n.f1006y], e);
        }
    }

    /* renamed from: b */
    public static final void m6658b(long j, int i, boolean z, int i2, byte[] bArr) throws WDJNIException {
        try {
            jniSetElementCollectionKeyIntValueBuffer(m6643b(), j, i, z, i2, bArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[94], e);
        }
    }

    /* renamed from: b */
    public static final void m6659b(long j, int i, boolean z, String str, double d) throws WDJNIException {
        try {
            jniInsertElementCollectionKeyStringValueDouble(m6643b(), j, i, z, str, d);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[70], e);
        }
    }

    /* renamed from: b */
    public static final void m6660b(long j, int i, boolean z, String str, int i2) throws WDJNIException {
        try {
            jniSetElementCollectionKeyStringValueInt(m6643b(), j, i, z, str, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[42], e);
        }
    }

    /* renamed from: b */
    public static final void m6661b(long j, int i, boolean z, String str, long j2) throws WDJNIException {
        try {
            jniInsertElementCollectionKeyStringValueDino(m6643b(), j, i, z, str, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[4], e);
        }
    }

    /* renamed from: b */
    public static final void m6662b(long j, int i, boolean z, String str, String str2) throws WDJNIException {
        try {
            jniSetElementCollectionKeyStringValueString(m6643b(), j, i, z, str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[146], e);
        }
    }

    /* renamed from: b */
    public static final void m6663b(long j, int i, boolean z, String str, boolean z2) throws WDJNIException {
        try {
            jniSetElementCollectionKeyStringValueBool(m6643b(), j, i, z, str, z2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[118], e);
        }
    }

    /* renamed from: b */
    public static final void m6664b(long j, int i, boolean z, String str, byte[] bArr) throws WDJNIException {
        try {
            jniSetElementCollectionKeyStringValueBuffer(m6643b(), j, i, z, str, bArr);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[35], e);
        }
    }

    /* renamed from: b */
    public static final boolean m6665b(int i, int i2, int i3, String str) throws WDJNIException {
        try {
            return jniCallBooleanIntString(i, i2, m6643b(), i3, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[117], e);
        }
    }

    /* renamed from: b */
    public static final boolean m6666b(int i, int i2, long j, String str) throws WDJNIException {
        try {
            return jniCallBooleanDinoString(i, i2, m6643b(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[133], e);
        }
    }

    /* renamed from: b */
    public static final boolean m6667b(int i, int i2, String str) throws WDJNIException {
        try {
            return jniCallBooleanString(i, i2, m6643b(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[64], e);
        }
    }

    /* renamed from: b */
    public static final boolean m6668b(int i, int i2, String str, String str2) throws WDJNIException {
        try {
            return jniCallBooleanStringString(i, i2, m6643b(), str, str2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[C0536n.f995G], e);
        }
    }

    /* renamed from: b */
    public static final byte[] m6669b(int i, int i2, int i3) throws WDJNIException {
        try {
            return jniCallBufferInt(i, i2, m6643b(), i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[158], e);
        }
    }

    /* renamed from: b */
    public static final long[] m6670b(int i, int i2, long j, int i3) throws WDJNIException {
        try {
            return jniCallDinoarrayDinoInt(i, i2, m6643b(), j, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[106], e);
        }
    }

    /* renamed from: b */
    public static final long[] m6671b(int i, int i2, String str, int i3) throws WDJNIException {
        try {
            return jniCallDinoarrayStringInt(i, i2, m6643b(), str, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[44], e);
        }
    }

    /* renamed from: b */
    public static final String[] m6672b(int i, int i2, long j, long j2) throws WDJNIException {
        try {
            return jniCallStringarrayDinoDino(i, i2, m6643b(), j, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[126], e);
        }
    }

    /* renamed from: c */
    public static final int m6673c(int i, int i2, long j, int i3) throws WDJNIException {
        try {
            return jniCallIntDinoInt(i, i2, m6643b(), j, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[92], e);
        }
    }

    /* renamed from: c */
    public static final int m6674c(long j, int i, boolean z, String str) throws WDJNIException {
        try {
            return jniGetElementCollectionKeyStringValueInt(m6643b(), j, i, z, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[153], e);
        }
    }

    /* renamed from: c */
    public static final long m6675c(int i, int i2) throws WDJNIException {
        try {
            return jniCallLong(i, i2, m6643b());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[53], e);
        }
    }

    /* renamed from: c */
    public static final long m6676c(int i, int i2, long j) throws WDJNIException {
        try {
            return jniCallDinoDino(i, i2, m6643b(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[71], e);
        }
    }

    /* renamed from: c */
    public static final long m6677c(int i, int i2, String str) throws WDJNIException {
        try {
            return jniCallDinoString(i, i2, m6643b(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[22], e);
        }
    }

    /* renamed from: c */
    public static final WDCallback m6678c(long j, int i) throws WDJNIException {
        try {
            return jniGetPropDinoCallback(m6643b(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[33], e);
        }
    }

    /* renamed from: c */
    public static final String m6679c(int i, int i2, int i3) throws WDJNIException {
        try {
            return jniCallStringInt(i, i2, m6643b(), i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[55], e);
        }
    }

    /* renamed from: c */
    public static final String m6680c(int i, int i2, String str, int i3) throws WDJNIException {
        try {
            return jniCallStringStringInt(i, i2, m6643b(), str, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[112], e);
        }
    }

    /* renamed from: c */
    public static final void m6681c(int i, int i2, int i3, String str) throws WDJNIException {
        try {
            jniCallVoidIntString(i, i2, m6643b(), i3, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[13], e);
        }
    }

    /* renamed from: c */
    public static final void m6682c(long j) throws WDJNIException {
        try {
            jniReleaseDino(j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[68], e);
        }
    }

    /* renamed from: c */
    public static final void m6683c(long j, int i, boolean z) throws WDJNIException {
        try {
            jniSetPropDinoBool(m6643b(), j, i, z);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[165], e);
        }
    }

    /* renamed from: c */
    public static final void m6684c(long j, int i, boolean z, int i2, long j2) throws WDJNIException {
        try {
            jniSetElementCollectionKeyIntValueLong(m6643b(), j, i, z, i2, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[21], e);
        }
    }

    /* renamed from: c */
    public static final void m6685c(long j, int i, boolean z, String str, long j2) throws WDJNIException {
        try {
            jniSetElementCollectionKeyStringValueDino(m6643b(), j, i, z, str, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[154], e);
        }
    }

    /* renamed from: c */
    public static final boolean m6686c() {
        return f2525b;
    }

    /* renamed from: c */
    public static final boolean m6687c(long j, int i, boolean z, int i2) throws WDJNIException {
        try {
            return jniGetElementCollectionKeyIntValueBool(m6643b(), j, i, z, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[18], e);
        }
    }

    /* renamed from: c */
    public static final long[] m6688c(int i, int i2, long j, String str) throws WDJNIException {
        try {
            return jniCallDinoarrayDinoString(i, i2, m6643b(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[51], e);
        }
    }

    /* renamed from: d */
    public static final double m6689d(long j, int i) throws WDJNIException {
        try {
            return jniGetPropDinoDouble(m6643b(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[100], e);
        }
    }

    /* renamed from: d */
    public static final int m6690d(int i, int i2, int i3) throws WDJNIException {
        try {
            return jniCallIntInt(i, i2, m6643b(), i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[152], e);
        }
    }

    /* renamed from: d */
    public static final int m6691d(int i, int i2, String str, int i3) throws WDJNIException {
        try {
            return jniCallIntStringInt(i, i2, m6643b(), str, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[9], e);
        }
    }

    /* renamed from: d */
    public static final long m6692d(long j, int i, boolean z, int i2) throws WDJNIException {
        try {
            return jniGetElementCollectionKeyIntValueDino(m6643b(), j, i, z, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[115], e);
        }
    }

    /* renamed from: d */
    public static final long m6693d(long j, int i, boolean z, String str) throws WDJNIException {
        try {
            return jniGetElementCollectionKeyStringValueDino(m6643b(), j, i, z, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[169], e);
        }
    }

    /* renamed from: d */
    public static final String m6694d(int i, int i2, long j, int i3) throws WDJNIException {
        try {
            return jniCallStringDinoInt(i, i2, m6643b(), j, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[157], e);
        }
    }

    /* renamed from: d */
    public static final String m6695d(int i, int i2, String str) throws WDJNIException {
        try {
            return jniCallStringString(i, i2, m6643b(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[166], e);
        }
    }

    /* renamed from: d */
    public static final void m6696d(int i, int i2, int i3, String str) throws WDJNIException {
        try {
            jniSetVariableString(m6643b(), i, i2, i3, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[C0607n.kh], e);
        }
    }

    /* renamed from: d */
    public static final void m6697d(int i, int i2, long j, String str) throws WDJNIException {
        try {
            jniCallVoidDinoString(i, i2, m6643b(), j, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[0], e);
        }
    }

    /* renamed from: d */
    public static final void m6698d(long j) throws WDJNIException {
        try {
            jniReleaseIterator(j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[62], e);
        }
    }

    /* renamed from: d */
    public static final void m6699d(long j, int i, boolean z, int i2, long j2) throws WDJNIException {
        try {
            jniInsertElementCollectionKeyIntValueLong(m6643b(), j, i, z, i2, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[131], e);
        }
    }

    /* renamed from: d */
    public static final void m6700d(long j, int i, boolean z, String str, long j2) throws WDJNIException {
        try {
            jniSetElementCollectionKeyStringValueLong(m6643b(), j, i, z, str, j2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[164], e);
        }
    }

    /* renamed from: d */
    public static final boolean m6701d(int i, int i2) throws WDJNIException {
        try {
            return jniCallBoolean(i, i2, m6643b());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[1], e);
        }
    }

    /* renamed from: d */
    public static final boolean m6702d(int i, int i2, long j) throws WDJNIException {
        try {
            return jniCallBooleanDino(i, i2, m6643b(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[59], e);
        }
    }

    /* renamed from: e */
    public static final int m6703e(int i, int i2) throws WDJNIException {
        try {
            return jniCallInt(i, i2, m6643b());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[66], e);
        }
    }

    /* renamed from: e */
    public static final int m6704e(int i, int i2, int i3) throws WDJNIException {
        try {
            return jniGetVariableInt(m6643b(), i, i2, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[96], e);
        }
    }

    /* renamed from: e */
    public static final long m6705e(int i, int i2, int i3, String str) throws WDJNIException {
        try {
            return jniCallLongIntString(i, i2, m6643b(), i3, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[167], e);
        }
    }

    /* renamed from: e */
    public static final String m6706e(int i, int i2, long j) throws WDJNIException {
        try {
            return jniCallStringDino(i, i2, m6643b(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[87], e);
        }
    }

    /* renamed from: e */
    public static final String m6707e(long j, int i) throws WDJNIException {
        try {
            return jniGetPropDinoString(m6643b(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[34], e);
        }
    }

    /* renamed from: e */
    public static final String m6708e(long j, int i, boolean z, int i2) throws WDJNIException {
        try {
            return jniGetElementCollectionKeyIntValueString(m6643b(), j, i, z, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[39], e);
        }
    }

    /* renamed from: e */
    public static final void m6709e(int i, int i2, String str) throws WDJNIException {
        try {
            jniCallVoidString(i, i2, m6643b(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[128], e);
        }
    }

    /* renamed from: e */
    public static final byte[] m6710e(long j, int i, boolean z, String str) throws WDJNIException {
        try {
            return jniGetElementCollectionKeyStringValueBuffer(m6643b(), j, i, z, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[149], e);
        }
    }

    /* renamed from: f */
    public static final int m6711f(int i, int i2, long j) throws WDJNIException {
        try {
            return jniCallIntDino(i, i2, m6643b(), j);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[139], e);
        }
    }

    /* renamed from: f */
    public static final int m6712f(int i, int i2, String str) throws WDJNIException {
        try {
            return jniCallIntString(i, i2, m6643b(), str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[28], e);
        }
    }

    /* renamed from: f */
    public static final int m6713f(long j, int i, boolean z, int i2) throws WDJNIException {
        try {
            return jniAddElementCollectionValueInt(m6643b(), j, i, z, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[77], e);
        }
    }

    /* renamed from: f */
    public static final long m6714f(int i, int i2, int i3) throws WDJNIException {
        try {
            return jniGetVariableLong(m6643b(), i, i2, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[56], e);
        }
    }

    /* renamed from: f */
    public static final long m6715f(long j, int i, boolean z, String str) throws WDJNIException {
        try {
            return jniGetElementCollectionKeyStringValueLong(m6643b(), j, i, z, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[95], e);
        }
    }

    /* renamed from: f */
    public static final String m6716f(int i, int i2) throws WDJNIException {
        try {
            return jniCallString(i, i2, m6643b());
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[C0607n.Hn], e);
        }
    }

    /* renamed from: f */
    public static final byte[] m6717f(long j, int i) throws WDJNIException {
        try {
            return jniGetPropDinoBuffer(m6643b(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[20], e);
        }
    }

    /* renamed from: g */
    public static final int m6718g(long j, int i, boolean z, String str) throws WDJNIException {
        try {
            return jniAddElementCollectionValueString(m6643b(), j, i, z, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[137], e);
        }
    }

    /* renamed from: g */
    public static final long m6719g(long j, int i) throws WDJNIException {
        try {
            return jniGetPropDinoLong(m6643b(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[168], e);
        }
    }

    /* renamed from: g */
    public static final long m6720g(long j, int i, boolean z, int i2) throws WDJNIException {
        try {
            return jniGetElementCollectionKeyIntValueLong(m6643b(), j, i, z, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[160], e);
        }
    }

    /* renamed from: g */
    public static final boolean m6721g(int i, int i2, int i3) throws WDJNIException {
        try {
            return jniGetVariableBool(m6643b(), i, i2, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[75], e);
        }
    }

    /* renamed from: h */
    public static final double m6722h(long j, int i, boolean z, int i2) throws WDJNIException {
        try {
            return jniGetElementCollectionKeyIntValueDouble(m6643b(), j, i, z, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[3], e);
        }
    }

    /* renamed from: h */
    public static final double m6723h(long j, int i, boolean z, String str) throws WDJNIException {
        try {
            return jniGetElementCollectionKeyStringValueDouble(m6643b(), j, i, z, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[119], e);
        }
    }

    /* renamed from: h */
    public static final int m6724h(long j, int i) throws WDJNIException {
        try {
            return jniGetPropDinoInt(m6643b(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[67], e);
        }
    }

    /* renamed from: h */
    public static final WDObjet m6725h(int i, int i2, int i3) throws WDJNIException {
        try {
            return jniCallWDObjetInt(i, i2, m6643b(), i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[81], e);
        }
    }

    /* renamed from: i */
    public static final int m6726i(long j, int i, boolean z, int i2) throws WDJNIException {
        try {
            return jniGetElementCollectionKeyIntValueInt(m6643b(), j, i, z, i2);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[C0538a.Nb], e);
        }
    }

    /* renamed from: i */
    public static final boolean m6727i(long j, int i) throws WDJNIException {
        try {
            return jniGetPropDinoBool(m6643b(), j, i);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[111], e);
        }
    }

    /* renamed from: i */
    public static final boolean m6728i(long j, int i, boolean z, String str) throws WDJNIException {
        try {
            return jniGetElementCollectionKeyStringValueBool(m6643b(), j, i, z, str);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[82], e);
        }
    }

    /* renamed from: i */
    public static final byte[] m6729i(int i, int i2, int i3) throws WDJNIException {
        try {
            return jniGetVariableBuffer(m6643b(), i, i2, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[79], e);
        }
    }

    /* renamed from: j */
    public static final double m6730j(int i, int i2, int i3) throws WDJNIException {
        try {
            return jniGetVariableDouble(m6643b(), i, i2, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[147], e);
        }
    }

    public static native int jniAddElementCollectionValueBool(long j, long j2, int i, boolean z, boolean z2) throws WDJNIException;

    public static native int jniAddElementCollectionValueBuffer(long j, long j2, int i, boolean z, byte[] bArr) throws WDJNIException;

    public static native int jniAddElementCollectionValueDino(long j, long j2, int i, boolean z, long j3) throws WDJNIException;

    public static native int jniAddElementCollectionValueDouble(long j, long j2, int i, boolean z, double d) throws WDJNIException;

    public static native int jniAddElementCollectionValueInt(long j, long j2, int i, boolean z, int i2) throws WDJNIException;

    public static native int jniAddElementCollectionValueLong(long j, long j2, int i, boolean z, long j3) throws WDJNIException;

    public static native int jniAddElementCollectionValueString(long j, long j2, int i, boolean z, String str) throws WDJNIException;

    public static native boolean jniCallBoolean(int i, int i2, long j) throws WDJNIException;

    public static native boolean jniCallBooleanDino(int i, int i2, long j, long j2) throws WDJNIException;

    public static native boolean jniCallBooleanDinoDino(int i, int i2, long j, long j2, long j3) throws WDJNIException;

    public static native boolean jniCallBooleanDinoDinoInt(int i, int i2, long j, long j2, long j3, int i3) throws WDJNIException;

    public static native boolean jniCallBooleanDinoDinoIntStringString(int i, int i2, long j, long j2, long j3, int i3, String str, String str2) throws WDJNIException;

    public static native boolean jniCallBooleanDinoDinoString(int i, int i2, long j, long j2, long j3, String str) throws WDJNIException;

    public static native boolean jniCallBooleanDinoInt(int i, int i2, long j, long j2, int i3) throws WDJNIException;

    public static native boolean jniCallBooleanDinoIntStringString(int i, int i2, long j, long j2, int i3, String str, String str2) throws WDJNIException;

    public static native boolean jniCallBooleanDinoString(int i, int i2, long j, long j2, String str) throws WDJNIException;

    public static native boolean jniCallBooleanInt(int i, int i2, long j, int i3) throws WDJNIException;

    public static native boolean jniCallBooleanIntString(int i, int i2, long j, int i3, String str) throws WDJNIException;

    public static native boolean jniCallBooleanIntStringString(int i, int i2, long j, int i3, String str, String str2) throws WDJNIException;

    public static native boolean jniCallBooleanIntStringStringCallbackInt(int i, int i2, long j, int i3, String str, String str2, WDCallback wDCallback, int i4) throws WDJNIException;

    public static native boolean jniCallBooleanString(int i, int i2, long j, String str) throws WDJNIException;

    public static native boolean jniCallBooleanStringDino(int i, int i2, long j, String str, long j2) throws WDJNIException;

    public static native boolean jniCallBooleanStringDinoInt(int i, int i2, long j, String str, long j2, int i3) throws WDJNIException;

    public static native boolean jniCallBooleanStringDinoIntStringString(int i, int i2, long j, String str, long j2, int i3, String str2, String str3) throws WDJNIException;

    public static native boolean jniCallBooleanStringInt(int i, int i2, long j, String str, int i3) throws WDJNIException;

    public static native boolean jniCallBooleanStringIntStringString(int i, int i2, long j, String str, int i3, String str2, String str3) throws WDJNIException;

    public static native boolean jniCallBooleanStringString(int i, int i2, long j, String str, String str2) throws WDJNIException;

    public static native boolean jniCallBooleanStringStringIntStringStringStringStringString(int i, int i2, long j, String str, String str2, int i3, String str3, String str4, String str5, String str6, String str7) throws WDJNIException;

    public static native boolean jniCallBooleanStringStringStringBufferStringStringString(int i, int i2, long j, String str, String str2, String str3, byte[] bArr, String str4, String str5, String str6) throws WDJNIException;

    public static native boolean jniCallBooleanStringStringStringIntBooleanInt(int i, int i2, long j, String str, String str2, String str3, int i3, boolean z, int i4) throws WDJNIException;

    public static native boolean jniCallBooleanStringStringStringIntInt(int i, int i2, long j, String str, String str2, String str3, int i3, int i4) throws WDJNIException;

    public static native boolean jniCallBooleanStringStringStringStringIntInt(int i, int i2, long j, String str, String str2, String str3, String str4, int i3, int i4) throws WDJNIException;

    public static native boolean jniCallBooleanStringStringStringStringIntIntBoolean(int i, int i2, long j, String str, String str2, String str3, String str4, int i3, int i4, boolean z) throws WDJNIException;

    public static native byte[] jniCallBufferInt(int i, int i2, long j, int i3) throws WDJNIException;

    public static native long jniCallDinoDino(int i, int i2, long j, long j2) throws WDJNIException;

    public static native long jniCallDinoString(int i, int i2, long j, String str) throws WDJNIException;

    public static native long jniCallDinoStringDino(int i, int i2, long j, String str, long j2) throws WDJNIException;

    public static native long[] jniCallDinoarrayDino(int i, int i2, long j, long j2) throws WDJNIException;

    public static native long[] jniCallDinoarrayDinoInt(int i, int i2, long j, long j2, int i3) throws WDJNIException;

    public static native long[] jniCallDinoarrayDinoString(int i, int i2, long j, long j2, String str) throws WDJNIException;

    public static native long[] jniCallDinoarrayString(int i, int i2, long j, String str) throws WDJNIException;

    public static native long[] jniCallDinoarrayStringInt(int i, int i2, long j, String str, int i3) throws WDJNIException;

    public static native int jniCallInt(int i, int i2, long j) throws WDJNIException;

    public static native int jniCallIntDino(int i, int i2, long j, long j2) throws WDJNIException;

    public static native int jniCallIntDinoInt(int i, int i2, long j, long j2, int i3) throws WDJNIException;

    public static native int jniCallIntDinoString(int i, int i2, long j, long j2, String str) throws WDJNIException;

    public static native int jniCallIntInt(int i, int i2, long j, int i3) throws WDJNIException;

    public static native int jniCallIntIntStringCallbackInt(int i, int i2, long j, int i3, String str, WDCallback wDCallback, int i4) throws WDJNIException;

    public static native int jniCallIntIntStringCallbackIntWDObjet(int i, int i2, long j, int i3, String str, WDCallback wDCallback, int i4, WDObjet wDObjet) throws WDJNIException;

    public static native int jniCallIntString(int i, int i2, long j, String str) throws WDJNIException;

    public static native int jniCallIntStringInt(int i, int i2, long j, String str, int i3) throws WDJNIException;

    public static native int jniCallIntStringStringStringIntIntIntStringString(int i, int i2, long j, String str, String str2, String str3, int i3, int i4, int i5, String str4, String str5) throws WDJNIException;

    public static native long jniCallLong(int i, int i2, long j) throws WDJNIException;

    public static native long jniCallLongIntString(int i, int i2, long j, int i3, String str) throws WDJNIException;

    public static native String jniCallString(int i, int i2, long j) throws WDJNIException;

    public static native String jniCallStringDino(int i, int i2, long j, long j2) throws WDJNIException;

    public static native String jniCallStringDinoInt(int i, int i2, long j, long j2, int i3) throws WDJNIException;

    public static native String jniCallStringDinoStringString(int i, int i2, long j, long j2, String str, String str2) throws WDJNIException;

    public static native String jniCallStringInt(int i, int i2, long j, int i3) throws WDJNIException;

    public static native String jniCallStringIntString(int i, int i2, long j, int i3, String str) throws WDJNIException;

    public static native String jniCallStringIntStringInt(int i, int i2, long j, int i3, String str, int i4) throws WDJNIException;

    public static native String jniCallStringString(int i, int i2, long j, String str) throws WDJNIException;

    public static native String jniCallStringStringInt(int i, int i2, long j, String str, int i3) throws WDJNIException;

    public static native String jniCallStringStringString(int i, int i2, long j, String str, String str2) throws WDJNIException;

    public static native String[] jniCallStringarrayDinoDino(int i, int i2, long j, long j2, long j3) throws WDJNIException;

    public static native void jniCallVoid(int i, int i2, long j) throws WDJNIException;

    public static native void jniCallVoidBoolean(int i, int i2, long j, boolean z) throws WDJNIException;

    public static native void jniCallVoidCallbackInt(int i, int i2, long j, WDCallback wDCallback, int i3) throws WDJNIException;

    public static native void jniCallVoidDino(int i, int i2, long j, long j2) throws WDJNIException;

    public static native void jniCallVoidDinoString(int i, int i2, long j, long j2, String str) throws WDJNIException;

    public static native void jniCallVoidDinoStringBoolean(int i, int i2, long j, long j2, String str, boolean z) throws WDJNIException;

    public static native void jniCallVoidDinoStringDinoarray(int i, int i2, long j, long j2, String str, long[] jArr) throws WDJNIException;

    public static native void jniCallVoidDinoStringStringInt(int i, int i2, long j, long j2, String str, String str2, int i3) throws WDJNIException;

    public static native void jniCallVoidDinoStringStringString(int i, int i2, long j, long j2, String str, String str2, String str3) throws WDJNIException;

    public static native void jniCallVoidInt(int i, int i2, long j, int i3) throws WDJNIException;

    public static native void jniCallVoidIntInt(int i, int i2, long j, int i3, int i4) throws WDJNIException;

    public static native void jniCallVoidIntString(int i, int i2, long j, int i3, String str) throws WDJNIException;

    public static native void jniCallVoidJaugeInt(int i, int i2, long j, WDJaugeJNI wDJaugeJNI, int i3) throws WDJNIException;

    public static native void jniCallVoidString(int i, int i2, long j, String str) throws WDJNIException;

    public static native void jniCallVoidStringBoolean(int i, int i2, long j, String str, boolean z) throws WDJNIException;

    public static native void jniCallVoidStringDinoarray(int i, int i2, long j, String str, long[] jArr) throws WDJNIException;

    public static native void jniCallVoidStringIntStringString(int i, int i2, long j, String str, int i3, String str2, String str3) throws WDJNIException;

    public static native void jniCallVoidStringStringBuffer(int i, int i2, long j, String str, String str2, byte[] bArr) throws WDJNIException;

    public static native void jniCallVoidStringStringInt(int i, int i2, long j, String str, String str2, int i3) throws WDJNIException;

    public static native void jniCallVoidStringStringString(int i, int i2, long j, String str, String str2, String str3) throws WDJNIException;

    public static native void jniCallVoidStringStringStringString(int i, int i2, long j, String str, String str2, String str3, String str4) throws WDJNIException;

    public static native WDObjet jniCallWDObjetInt(int i, int i2, long j, int i3) throws WDJNIException;

    public static native long jniCloneDino(long j, long j2) throws WDJNIException;

    public static native void jniCopyDino(long j, long j2, long j3) throws WDJNIException;

    public static native long jniCreateDino(long j, int i, int i2) throws WDJNIException;

    public static native long jniCreateThreadContext();

    public static native void jniDeleteAllElementCollection(long j, long j2, int i, boolean z) throws WDJNIException;

    public static native int jniDeleteElementCollectionKeyInt(long j, long j2, int i, boolean z, int i2) throws WDJNIException;

    public static native int jniDeleteElementCollectionKeyString(long j, long j2, int i, boolean z, String str) throws WDJNIException;

    public static native boolean jniGetElementCollectionKeyIntValueBool(long j, long j2, int i, boolean z, int i2) throws WDJNIException;

    public static native byte[] jniGetElementCollectionKeyIntValueBuffer(long j, long j2, int i, boolean z, int i2) throws WDJNIException;

    public static native long jniGetElementCollectionKeyIntValueDino(long j, long j2, int i, boolean z, int i2) throws WDJNIException;

    public static native double jniGetElementCollectionKeyIntValueDouble(long j, long j2, int i, boolean z, int i2) throws WDJNIException;

    public static native int jniGetElementCollectionKeyIntValueInt(long j, long j2, int i, boolean z, int i2) throws WDJNIException;

    public static native long jniGetElementCollectionKeyIntValueLong(long j, long j2, int i, boolean z, int i2) throws WDJNIException;

    public static native String jniGetElementCollectionKeyIntValueString(long j, long j2, int i, boolean z, int i2) throws WDJNIException;

    public static native boolean jniGetElementCollectionKeyStringValueBool(long j, long j2, int i, boolean z, String str) throws WDJNIException;

    public static native byte[] jniGetElementCollectionKeyStringValueBuffer(long j, long j2, int i, boolean z, String str) throws WDJNIException;

    public static native long jniGetElementCollectionKeyStringValueDino(long j, long j2, int i, boolean z, String str) throws WDJNIException;

    public static native double jniGetElementCollectionKeyStringValueDouble(long j, long j2, int i, boolean z, String str) throws WDJNIException;

    public static native int jniGetElementCollectionKeyStringValueInt(long j, long j2, int i, boolean z, String str) throws WDJNIException;

    public static native long jniGetElementCollectionKeyStringValueLong(long j, long j2, int i, boolean z, String str) throws WDJNIException;

    public static native String jniGetElementCollectionKeyStringValueString(long j, long j2, int i, boolean z, String str) throws WDJNIException;

    public static native int jniGetNbElementInCollection(long j, long j2, int i, boolean z);

    public static native boolean jniGetPropDinoBool(long j, long j2, int i) throws WDJNIException;

    public static native byte[] jniGetPropDinoBuffer(long j, long j2, int i) throws WDJNIException;

    public static native WDCallback jniGetPropDinoCallback(long j, long j2, int i) throws WDJNIException;

    public static native long jniGetPropDinoDino(long j, long j2, int i) throws WDJNIException;

    public static native double jniGetPropDinoDouble(long j, long j2, int i) throws WDJNIException;

    public static native int jniGetPropDinoInt(long j, long j2, int i) throws WDJNIException;

    public static native long jniGetPropDinoLong(long j, long j2, int i) throws WDJNIException;

    public static native String jniGetPropDinoString(long j, long j2, int i) throws WDJNIException;

    public static native boolean jniGetVariableBool(long j, int i, int i2, int i3) throws WDJNIException;

    public static native byte[] jniGetVariableBuffer(long j, int i, int i2, int i3) throws WDJNIException;

    public static native double jniGetVariableDouble(long j, int i, int i2, int i3) throws WDJNIException;

    public static native int jniGetVariableInt(long j, int i, int i2, int i3) throws WDJNIException;

    public static native long jniGetVariableLong(long j, int i, int i2, int i3) throws WDJNIException;

    public static native String jniGetVariableString(long j, int i, int i2, int i3) throws WDJNIException;

    public static native long jniInitIterator(long j, long j2, int i, int i2);

    public static native void jniInsertElementCollectionKeyIntValueBool(long j, long j2, int i, boolean z, int i2, boolean z2) throws WDJNIException;

    public static native void jniInsertElementCollectionKeyIntValueBuffer(long j, long j2, int i, boolean z, int i2, byte[] bArr) throws WDJNIException;

    public static native void jniInsertElementCollectionKeyIntValueDino(long j, long j2, int i, boolean z, int i2, long j3) throws WDJNIException;

    public static native void jniInsertElementCollectionKeyIntValueDouble(long j, long j2, int i, boolean z, int i2, double d) throws WDJNIException;

    public static native void jniInsertElementCollectionKeyIntValueInt(long j, long j2, int i, boolean z, int i2, int i3) throws WDJNIException;

    public static native void jniInsertElementCollectionKeyIntValueLong(long j, long j2, int i, boolean z, int i2, long j3) throws WDJNIException;

    public static native void jniInsertElementCollectionKeyIntValueString(long j, long j2, int i, boolean z, int i2, String str) throws WDJNIException;

    public static native void jniInsertElementCollectionKeyStringValueBool(long j, long j2, int i, boolean z, String str, boolean z2) throws WDJNIException;

    public static native void jniInsertElementCollectionKeyStringValueBuffer(long j, long j2, int i, boolean z, String str, byte[] bArr) throws WDJNIException;

    public static native void jniInsertElementCollectionKeyStringValueDino(long j, long j2, int i, boolean z, String str, long j3) throws WDJNIException;

    public static native void jniInsertElementCollectionKeyStringValueDouble(long j, long j2, int i, boolean z, String str, double d) throws WDJNIException;

    public static native void jniInsertElementCollectionKeyStringValueInt(long j, long j2, int i, boolean z, String str, int i2) throws WDJNIException;

    public static native void jniInsertElementCollectionKeyStringValueLong(long j, long j2, int i, boolean z, String str, long j3) throws WDJNIException;

    public static native void jniInsertElementCollectionKeyStringValueString(long j, long j2, int i, boolean z, String str, String str2) throws WDJNIException;

    public static native boolean jniLoadHF();

    public static native boolean jniLoadJav(String str);

    public static native String jniMessageErreur();

    public static native void jniRazDino(long j, long j2) throws WDJNIException;

    public static native void jniReleaseDino(long j) throws WDJNIException;

    public static native void jniReleaseIterator(long j);

    public static native void jniReleaseThreadContext(long j);

    public static native void jniSetElementCollectionKeyIntValueBool(long j, long j2, int i, boolean z, int i2, boolean z2) throws WDJNIException;

    public static native void jniSetElementCollectionKeyIntValueBuffer(long j, long j2, int i, boolean z, int i2, byte[] bArr) throws WDJNIException;

    public static native void jniSetElementCollectionKeyIntValueDino(long j, long j2, int i, boolean z, int i2, long j3) throws WDJNIException;

    public static native void jniSetElementCollectionKeyIntValueDouble(long j, long j2, int i, boolean z, int i2, double d) throws WDJNIException;

    public static native void jniSetElementCollectionKeyIntValueInt(long j, long j2, int i, boolean z, int i2, int i3) throws WDJNIException;

    public static native void jniSetElementCollectionKeyIntValueLong(long j, long j2, int i, boolean z, int i2, long j3) throws WDJNIException;

    public static native void jniSetElementCollectionKeyIntValueString(long j, long j2, int i, boolean z, int i2, String str) throws WDJNIException;

    public static native void jniSetElementCollectionKeyStringValueBool(long j, long j2, int i, boolean z, String str, boolean z2) throws WDJNIException;

    public static native void jniSetElementCollectionKeyStringValueBuffer(long j, long j2, int i, boolean z, String str, byte[] bArr) throws WDJNIException;

    public static native void jniSetElementCollectionKeyStringValueDino(long j, long j2, int i, boolean z, String str, long j3) throws WDJNIException;

    public static native void jniSetElementCollectionKeyStringValueDouble(long j, long j2, int i, boolean z, String str, double d) throws WDJNIException;

    public static native void jniSetElementCollectionKeyStringValueInt(long j, long j2, int i, boolean z, String str, int i2) throws WDJNIException;

    public static native void jniSetElementCollectionKeyStringValueLong(long j, long j2, int i, boolean z, String str, long j3) throws WDJNIException;

    public static native void jniSetElementCollectionKeyStringValueString(long j, long j2, int i, boolean z, String str, String str2) throws WDJNIException;

    public static native void jniSetInfoApplication(String str);

    public static native void jniSetPropDinoBool(long j, long j2, int i, boolean z) throws WDJNIException;

    public static native void jniSetPropDinoBuffer(long j, long j2, int i, byte[] bArr) throws WDJNIException;

    public static native void jniSetPropDinoCallback(long j, long j2, int i, WDCallback wDCallback) throws WDJNIException;

    public static native void jniSetPropDinoDino(long j, long j2, int i, long j3) throws WDJNIException;

    public static native void jniSetPropDinoDouble(long j, long j2, int i, double d) throws WDJNIException;

    public static native void jniSetPropDinoInt(long j, long j2, int i, int i2) throws WDJNIException;

    public static native void jniSetPropDinoJauge(long j, long j2, int i, WDJaugeJNI wDJaugeJNI) throws WDJNIException;

    public static native void jniSetPropDinoLong(long j, long j2, int i, long j3) throws WDJNIException;

    public static native void jniSetPropDinoString(long j, long j2, int i, String str) throws WDJNIException;

    public static native void jniSetVariableBool(long j, int i, int i2, int i3, boolean z) throws WDJNIException;

    public static native void jniSetVariableBuffer(long j, int i, int i2, int i3, byte[] bArr) throws WDJNIException;

    public static native void jniSetVariableDouble(long j, int i, int i2, int i3, double d) throws WDJNIException;

    public static native void jniSetVariableInt(long j, int i, int i2, int i3, int i4) throws WDJNIException;

    public static native void jniSetVariableLong(long j, int i, int i2, int i3, long j2) throws WDJNIException;

    public static native void jniSetVariableString(long j, int i, int i2, int i3, String str) throws WDJNIException;

    public static native void jniUnload();

    public static native long jniWalkIteratorDino(long j, long j2, int i);

    /* renamed from: k */
    public static final void m6731k(int i, int i2, int i3) throws WDJNIException {
        try {
            jniCallVoidInt(i, i2, m6643b(), i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[C0538a.Lb], e);
        }
    }

    /* renamed from: l */
    public static final String m6732l(int i, int i2, int i3) throws WDJNIException {
        try {
            return jniGetVariableString(m6643b(), i, i2, i3);
        } catch (UnsatisfiedLinkError e) {
            throw new WDJNIException(f2530z[19], e);
        }
    }

    /* renamed from: z */
    private static String m6733z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 20;
                    break;
                case 1:
                    i2 = 11;
                    break;
                case 2:
                    i2 = 5;
                    break;
                case 3:
                    i2 = 76;
                    break;
                default:
                    i2 = 85;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m6734z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 85);
        }
        return toCharArray;
    }
}
