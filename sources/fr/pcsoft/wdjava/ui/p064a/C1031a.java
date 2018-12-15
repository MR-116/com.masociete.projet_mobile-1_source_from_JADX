package fr.pcsoft.wdjava.ui.p064a;

import android.support.v4.view.InputDeviceCompat;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.ob;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: fr.pcsoft.wdjava.ui.a.a */
public class C1031a {
    /* renamed from: a */
    private static final int[] f2952a = new int[]{-16535, -25145, -2646536, -5069825, -9981976, -10107930, -10561589, -7806095, -5184461, -2561237, -11200};
    /* renamed from: b */
    public static final int f2953b = 1;
    /* renamed from: c */
    private static final double f2954c = 4.5d;
    /* renamed from: d */
    private static final double f2955d = 99.0d;
    /* renamed from: e */
    public static final int f2956e = 3;
    /* renamed from: f */
    private static final double f2957f = 80.0d;
    /* renamed from: g */
    private static final int f2958g = 2;
    /* renamed from: h */
    private static int f2959h = 0;
    /* renamed from: i */
    public static final HashMap f2960i = new HashMap(16);
    /* renamed from: j */
    public static final int f2961j = 0;
    /* renamed from: k */
    private static final int[] f2962k = new int[]{-7422163, -9782045, -13400884, -7368817, -5546501, -7525904, -19610, -2715601, -11200, -2661199, -3394643};
    /* renamed from: l */
    private static final double f2963l = 92.0d;
    /* renamed from: m */
    private static final int f2964m = 11;
    /* renamed from: n */
    public static final int f2965n = 2;
    /* renamed from: o */
    private static final double f2966o = 10.0d;
    /* renamed from: z */
    private static final String[] f2967z = new String[]{C1031a.m7475z(C1031a.m7476z("\u001d`gV\f\bzz^")), C1031a.m7475z(C1031a.m7476z("|\u0002\u0005\"ef\u0005")), C1031a.m7475z(C1031a.m7476z("|v\u0005Ye\u001c\u0005")), C1031a.m7475z(C1031a.m7476z("|ss,fk\u0002")), C1031a.m7475z(C1031a.m7476z("\u001dytT\u0016\u0017pq[\u0019\u0012z{^")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u001a\u0013|c_\u0012\rppT")), C1031a.m7475z(C1031a.m7476z("\u0012pqS\u0000\u0012fy[\u0001\u001awyO\u0010")), C1031a.m7475z(C1031a.m7476z("|s\u0000\\`\u0019\u0000")), C1031a.m7475z(C1031a.m7476z("|\ftY\u0011l\u0007")), C1031a.m7475z(C1031a.m7476z("\u0010yqV\u0014\u001cp")), C1031a.m7475z(C1031a.m7476z("|ss_a\u001a\u0004")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0012\rtl")), C1031a.m7475z(C1031a.m7476z("|ss\\\u0014\u0019\u0005")), C1031a.m7475z(C1031a.m7476z("|w\r\"cow")), C1031a.m7475z(C1031a.m7476z("\u000fptY\u001d\u000f`s\\")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005*egw")), C1031a.m7475z(C1031a.m7476z("\f~lX\u0019\np")), C1031a.m7475z(C1031a.m7476z("|\f\r\\\u0017f\r")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0006\u001eyxU\u001b")), C1031a.m7475z(C1031a.m7476z("\u0011tcC")), C1031a.m7475z(C1031a.m7476z("\ftq^\u0019\u001awgU\u0002\u0011")), C1031a.m7475z(C1031a.m7476z("\u0010y|L\u0010\u001bgtX")), C1031a.m7475z(C1031a.m7476z("\u0012pqS\u0000\u0012feH\u001c\u0011rrH\u0010\u001a{")), C1031a.m7475z(C1031a.m7476z("|\r\u0002Y\u0010\u0019t")), C1031a.m7475z(C1031a.m7476z("\u000bzx[\u0001\u0010")), C1031a.m7475z(C1031a.m7476z("\u0013|{_\u001b")), C1031a.m7475z(C1031a.m7476z("|s\u0000\\\u0013\u0019t")), C1031a.m7475z(C1031a.m7476z("|qpXmg\u0002")), C1031a.m7475z(C1031a.m7476z("|\u0001\u0003\"g\u001d\u0001")), C1031a.m7475z(C1031a.m7476z("|ss\\\u0013\u001a\u0005")), C1031a.m7475z(C1031a.m7476z("\u0012zvY\u0014\f|{")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\u001czg[\u0019")), C1031a.m7475z(C1031a.m7476z("|s\u0005\\\u0013\u0019\u0005")), C1031a.m7475z(C1031a.m7476z("\u000fty_\u0012\rppT")), C1031a.m7475z(C1031a.m7476z("|ss.`o\u0005")), C1031a.m7475z(C1031a.m7476z("|\u0000\u0000,\u0017ms")), C1031a.m7475z(C1031a.m7476z("\u0012|{N\u0016\rptW")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005\\\u0013o\u0005")), C1031a.m7475z(C1031a.m7476z("\f|yL\u0010\r")), C1031a.m7475z(C1031a.m7476z("|\rw.`n\u0006")), C1031a.m7475z(C1031a.m7476z("\u0012tr_\u001b\u000bt")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005\"\u0017gw")), C1031a.m7475z(C1031a.m7476z("\u0006pyV\u001a\b")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005\\\u0013\u0019s")), C1031a.m7475z(C1031a.m7476z("|wt/`\u001b\u0006")), C1031a.m7475z(C1031a.m7476z("\u0010gtT\u0012\u001a")), C1031a.m7475z(C1031a.m7476z("\fap_\u0019\u001dy`_")), C1031a.m7475z(C1031a.m7476z("\u000fzb^\u0010\rwyO\u0010")), C1031a.m7475z(C1031a.m7476z("\rzfC\u0017\rzbT")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0018\u001erpT\u0001\u001e")), C1031a.m7475z(C1031a.m7476z("\u0018zy^\u0010\u0011gz^")), C1031a.m7475z(C1031a.m7476z("\u001cltT")), C1031a.m7475z(C1031a.m7476z("|\u0003t/\u0014\u001cq")), C1031a.m7475z(C1031a.m7476z("|st\"eh\u0007")), C1031a.m7475z(C1031a.m7476z("\b}p[\u0001")), C1031a.m7475z(C1031a.m7476z("|qt[`m\u0005")), C1031a.m7475z(C1031a.m7476z("|ss^bo\u0005")), C1031a.m7475z(C1031a.m7476z("|ss\\\u0014\u001cq")), C1031a.m7475z(C1031a.m7476z("\u0013tbT\u0012\rppT")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0006\u001atrH\u0010\u001a{")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005*eg\u0005")), C1031a.m7475z(C1031a.m7476z("|\u0007p\"\u0017j\u0002")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\fap_\u0019\u001dy`_")), C1031a.m7475z(C1031a.m7476z("\fytN\u0010\u0018gpC")), C1031a.m7475z(C1031a.m7476z("\t|zV\u0010\u000b")), C1031a.m7475z(C1031a.m7476z("|s\u0000^\u0010\u001d\u0006")), C1031a.m7475z(C1031a.m7476z("\u0018gp_\u001b\u0006pyV\u001a\b")), C1031a.m7475z(C1031a.m7476z("|s\u0005\"eg\u0005")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u001a\rt{]\u0010")), C1031a.m7475z(C1031a.m7476z("\b}|N\u0010\fxzQ\u0010")), C1031a.m7475z(C1031a.m7476z("|pp\"g\u001ap")), C1031a.m7475z(C1031a.m7476z("|ss[`o\u0005")), C1031a.m7475z(C1031a.m7476z("|\u0007\u0007\"\u0017m\u0007")), C1031a.m7475z(C1031a.m7476z("|\rw*egw")), C1031a.m7475z(C1031a.m7476z("|\f\u0001*e\u001b\u0006")), C1031a.m7475z(C1031a.m7476z("\fytN\u0010\u0018gtC")), C1031a.m7475z(C1031a.m7476z("|ss_\u0017\u001cq")), C1031a.m7475z(C1031a.m7476z("|\u0003w\"\u0010m\u0006")), C1031a.m7475z(C1031a.m7476z("|\u0001w*eg\u0007")), C1031a.m7475z(C1031a.m7476z("|\u0001\u0004,l\u001a\u0004")), C1031a.m7475z(C1031a.m7476z("|\u0003\u0001#`\u001aq")), C1031a.m7475z(C1031a.m7476z("\u0013tc_\u001b\u001bpg")), C1031a.m7475z(C1031a.m7476z("\rzl[\u0019\u001dy`_")), C1031a.m7475z(C1031a.m7476z("\u001d|fK\u0000\u001a")), C1031a.m7475z(C1031a.m7476z("|ss\\\u0014\u0019t")), C1031a.m7475z(C1031a.m7476z("|\u0001\r)\u0011gw")), C1031a.m7475z(C1031a.m7476z("\fpt]\u0007\u001ap{")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005Y\u0010\u001b\u0004")), C1031a.m7475z(C1031a.m7476z("\b}|N\u0010")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0012\rppT")), C1031a.m7475z(C1031a.m7476z("\u000fy`W")), C1031a.m7475z(C1031a.m7476z("\u001c}zY\u001a\u0013ta_")), C1031a.m7475z(C1031a.m7476z("\u0013pxU\u001b\u001c}|\\\u0013\u0010{")), C1031a.m7475z(C1031a.m7476z("|\f\u0006-e\u001bw")), C1031a.m7475z(C1031a.m7476z("\u000bt{")), C1031a.m7475z(C1031a.m7476z("|q\u0007,lnp")), C1031a.m7475z(C1031a.m7476z("|\rsX\u0016gs")), C1031a.m7475z(C1031a.m7476z("|\f\u0005_\u0010f\u0005")), C1031a.m7475z(C1031a.m7476z("|ss\\\u0013\u0019\u0005")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0012\rpl")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005\"eo\u0005")), C1031a.m7475z(C1031a.m7476z("\u000fty_\u0003\u0016zy_\u0001\rpq")), C1031a.m7475z(C1031a.m7476z("|\u0002v\\\u0016o\u0005")), C1031a.m7475z(C1031a.m7476z("|tq\\\u0013ms")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\u0018gpC")), C1031a.m7475z(C1031a.m7476z("|st\\e\u001a\u0003")), C1031a.m7475z(C1031a.m7476z("\u0012|qT\u001c\u0018}aX\u0019\np")), C1031a.m7475z(C1031a.m7476z("|\u0002s\\\u0013o\u0005")), C1031a.m7475z(C1031a.m7476z("|\u0006vXfh\u0004")), C1031a.m7475z(C1031a.m7476z("\u0019`vR\u0006\u0016t")), C1031a.m7475z(C1031a.m7476z("\u0018zy^")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\u0018gtC")), C1031a.m7475z(C1031a.m7476z("|\rw*eo\u0005")), C1031a.m7475z(C1031a.m7476z("\u0011tc[\u001f\u0010b}S\u0001\u001a")), C1031a.m7475z(C1031a.m7476z("|ss^\u0010\u001eq")), C1031a.m7475z(C1031a.m7476z("|w\u0005Ya\u001bp")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\fytN\u0010\u0018gpC")), C1031a.m7475z(C1031a.m7476z("|t\u0005/gmq")), C1031a.m7475z(C1031a.m7476z("|ss\\e\u0019\u0000")), C1031a.m7475z(C1031a.m7476z("\u0006pyV\u001a\brg_\u0010\u0011")), C1031a.m7475z(C1031a.m7476z("|st_\u0017\u001b\u0002")), C1031a.m7475z(C1031a.m7476z("\u001czgT\u0013\u0013zb_\u0007\u001dy`_")), C1031a.m7475z(C1031a.m7476z("|ss\\m\u001bv")), C1031a.m7475z(C1031a.m7476z("|\r\u0005*eg\u0005")), C1031a.m7475z(C1031a.m7476z("\u0010gtT\u0012\u001agp^")), C1031a.m7475z(C1031a.m7476z("\u000fty_\u0012\u0010yq_\u001b\rzq")), C1031a.m7475z(C1031a.m7476z("|s\r\\m\u0019s")), C1031a.m7475z(C1031a.m7476z("|ss_a\u001c\u0001")), C1031a.m7475z(C1031a.m7476z("|ss\"\u0016o\u0005")), C1031a.m7475z(C1031a.m7476z("|s\u0000\\`\u001bv")), C1031a.m7475z(C1031a.m7476z("\u0012pqS\u0000\u0012fp[\u0012\rppT")), C1031a.m7475z(C1031a.m7476z("|qw-ef\u0006")), C1031a.m7475z(C1031a.m7476z("\u0019|g_\u0017\r|vQ")), C1031a.m7475z(C1031a.m7476z("\u000b}|I\u0001\u0013p")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0017\u0013`p")), C1031a.m7475z(C1031a.m7476z("\u0012tgU\u001a\u0011")), C1031a.m7475z(C1031a.m7476z("|w\u0005_e\u001a\u0003")), C1031a.m7475z(C1031a.m7476z("\u001c}tH\u0001\rp`I\u0010")), C1031a.m7475z(C1031a.m7476z("\u0012pqS\u0000\u0012e`H\u0005\u0013p")), C1031a.m7475z(C1031a.m7476z("\u0013|x_")), C1031a.m7475z(C1031a.m7476z("|wqXbiw")), C1031a.m7475z(C1031a.m7476z("|\u0003\u0003Y\u0011\u001et")), C1031a.m7475z(C1031a.m7476z("|ss[eht")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005X\u0013\u0019s")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005\\\u0013hs")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0001\ngdO\u001a\u0016fp")), C1031a.m7475z(C1031a.m7476z("\u0012pqS\u0000\u0012tdO\u0014\u0012tgS\u001b\u001a")), C1031a.m7475z(C1031a.m7476z("|s\u0005\\m\u0019s")), C1031a.m7475z(C1031a.m7476z("|p\f#cht")), C1031a.m7475z(C1031a.m7476z("\u001b|x]\u0007\u001al")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u001e\u0017t~S")), C1031a.m7475z(C1031a.m7476z("\ftyW\u001a\u0011")), C1031a.m7475z(C1031a.m7476z("|s\u0005_cgv")), C1031a.m7475z(C1031a.m7476z("\u001dp|]\u0010")), C1031a.m7475z(C1031a.m7476z("|ss-\u0013j\u0005")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005\"eg\u0005")), C1031a.m7475z(C1031a.m7476z("|ss,l\u001d\u0001")), C1031a.m7475z(C1031a.m7476z("|ss*e\u0019s")), C1031a.m7475z(C1031a.m7476z("\u001ed`[")), C1031a.m7475z(C1031a.m7476z("|ssXc\u001c\u0004")), C1031a.m7475z(C1031a.m7476z("\ft{^\f\u001dgzM\u001b")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\fytN\u0010\u0018gtC")), C1031a.m7475z(C1031a.m7476z("|\u0002\u0002\"mf\f")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005,ao\u0005")), C1031a.m7475z(C1031a.m7476z("\u0018}zI\u0001\b}|N\u0010")), C1031a.m7475z(C1031a.m7476z("|v\u0002+`g\u0000")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0007\u001aq")), C1031a.m7475z(C1031a.m7476z("\f|pT\u001b\u001e")), C1031a.m7475z(C1031a.m7476z("|\u0006\u0007Y\u0011l\u0007")), C1031a.m7475z(C1031a.m7476z("|\u0007s.\u0013ks")), C1031a.m7475z(C1031a.m7476z("|\u0001\r^d\u001cv")), C1031a.m7475z(C1031a.m7476z("|q\u0007Xagv")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\u000f|{Q")), C1031a.m7475z(C1031a.m7476z("\fptI\u001d\u001ayy")), C1031a.m7475z(C1031a.m7476z("\u001czg[\u0019")), C1031a.m7475z(C1031a.m7476z("|s\u0005\\\u0013\u0019s")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\u001cltT")), C1031a.m7475z(C1031a.m7476z("|\u0003\f,li\f")), C1031a.m7475z(C1031a.m7476z("|q\u0006^f\u001b\u0006")), C1031a.m7475z(C1031a.m7476z("\u000f`gJ\u0019\u001a")), C1031a.m7475z(C1031a.m7476z("\u001ctq_\u0001\u001dy`_")), C1031a.m7475z(C1031a.m7476z("|vq\"`ls")), C1031a.m7475z(C1031a.m7476z("|ss_\u0013\u001b\u0000")), C1031a.m7475z(C1031a.m7476z("|\u0004\f+lh\u0005")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005*e\u001cq")), C1031a.m7475z(C1031a.m7476z("\u001dytY\u001e")), C1031a.m7475z(C1031a.m7476z("|vq/\u0016jv")), C1031a.m7475z(C1031a.m7476z("|s\u0001[ai\u0005")), C1031a.m7475z(C1031a.m7476z("\u0010gvR\u001c\u001b")), C1031a.m7475z(C1031a.m7476z("|tq^m\u001a\u0003")), C1031a.m7475z(C1031a.m7476z("\u0017zaJ\u001c\u0011~")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005*e\u0019s")), C1031a.m7475z(C1031a.m7476z("|pgH\u0010\ngjY\u001a\nypO\u0007\u0000}aW\u0019")), C1031a.m7475z(C1031a.m7476z("|qq[e\u001bq")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005\\\u0014ft")), C1031a.m7475z(C1031a.m7476z("|qv+alv")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0006\u0013ta_\u0012\rtl")), C1031a.m7475z(C1031a.m7476z("\u0019yzH\u0014\u0013b}S\u0001\u001a")), C1031a.m7475z(C1031a.m7476z("|ss\\\u0013\u0019s")), C1031a.m7475z(C1031a.m7476z("|ssYe\u001cw")), C1031a.m7475z(C1031a.m7476z("|p\u0003_c\u0019t")), C1031a.m7475z(C1031a.m7476z("\u0017z{_\f\u001bpb")), C1031a.m7475z(C1031a.m7476z("\u0018gp_\u001b")), C1031a.m7475z(C1031a.m7476z("\fegS\u001b\u0018rg_\u0010\u0011")), C1031a.m7475z(C1031a.m7476z("\fytN\u0010\u001dy`_")), C1031a.m7475z(C1031a.m7476z("|p\u0005\\\u0013\u0019s")), C1031a.m7475z(C1031a.m7476z("|ss*eo\u0005")), C1031a.m7475z(C1031a.m7476z("\u000fte[\f\u001eb}S\u0005")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0006\u0013ta_\u0017\u0013`p")), C1031a.m7475z(C1031a.m7476z("|\u0002w,m\u001ap")), C1031a.m7475z(C1031a.m7476z("|\f\f)g\u001cv")), C1031a.m7475z(C1031a.m7476z("\u001bppJ\u0006\u0014lwV\u0000\u001a")), C1031a.m7475z(C1031a.m7476z("\u000f|{Q")), C1031a.m7475z(C1031a.m7476z("|t\f[l\u001e\f")), C1031a.m7475z(C1031a.m7476z("\u001cg|W\u0006\u0010{")), C1031a.m7475z(C1031a.m7476z("\u001czgT\u0006\u0016y~")), C1031a.m7475z(C1031a.m7476z("|qt-e\u001b\u0003")), C1031a.m7475z(C1031a.m7476z("\u001dgzM\u001b")), C1031a.m7475z(C1031a.m7476z("\u0012pqS\u0000\u0012zgY\u001d\u0016q")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0012\u0010yq_\u001b\rzq")), C1031a.m7475z(C1031a.m7476z("\rpq")), C1031a.m7475z(C1031a.m7476z("\u0012pqS\u0000\u0012c|U\u0019\u001aag_\u0011")), C1031a.m7475z(C1031a.m7476z("|\u0007\u0005Xg\u001et")), C1031a.m7475z(C1031a.m7476z("\u001b|x]\u0007\u001el")), C1031a.m7475z(C1031a.m7476z("\u001eo`H\u0010")), C1031a.m7475z(C1031a.m7476z("\u0012pqS\u0000\u0012wyO\u0010")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\ftyW\u001a\u0011")), C1031a.m7475z(C1031a.m7476z("\u000bptV")), C1031a.m7475z(C1031a.m7476z("\u0016{qS\u0014\u0011gp^")), C1031a.m7475z(C1031a.m7476z("\u0019zg_\u0006\u000brg_\u0010\u0011")), C1031a.m7475z(C1031a.m7476z("|ts_\u0010\u001ap")), C1031a.m7475z(C1031a.m7476z("\u001bzq]\u0010\rwyO\u0010")), C1031a.m7475z(C1031a.m7476z("|ss\\`\u001ap")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0006\u0013ta_\u0012\rpl")), C1031a.m7475z(C1031a.m7476z("|pp_m\u001et")), C1031a.m7475z(C1031a.m7476z("\u001dy`_")), C1031a.m7475z(C1031a.m7476z("\u0016czH\f")), C1031a.m7475z(C1031a.m7476z("\u001dy`_\u0003\u0016zy_\u0001")), C1031a.m7475z(C1031a.m7476z("|ss_a\u001d\u0000")), C1031a.m7475z(C1031a.m7476z("\u0016{qS\u0012\u0010")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\u0006pyV\u001a\b")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\u0018gp_\u001b")), C1031a.m7475z(C1031a.m7476z("|ss+af\u0006")), C1031a.m7475z(C1031a.m7476z("|ss^\u0014\u001d\f")), C1031a.m7475z(C1031a.m7476z("|\r\u0005\"eo\u0005")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0003\u0016zy_\u0001")), C1031a.m7475z(C1031a.m7476z("|\u0004p#e\u0019s")), C1031a.m7475z(C1031a.m7476z("\u000fty_\u0001\ngdO\u001a\u0016fp")), C1031a.m7475z(C1031a.m7476z("|\u0002s\\\u0013\u001b\u0001")), C1031a.m7475z(C1031a.m7476z("|qv^\u0016\u001bv")), C1031a.m7475z(C1031a.m7476z("|\rt(\u0017\u001a\u0007")), C1031a.m7475z(C1031a.m7476z("|ss\\\u0013o\u0005")), C1031a.m7475z(C1031a.m7476z("|\u0001\u0005_e\u001b\u0005")), C1031a.m7475z(C1031a.m7476z("|\r\u0002Y\u0010\u001aw")), C1031a.m7475z(C1031a.m7476z("\u0018t|T\u0006\u001dzgU")), C1031a.m7475z(C1031a.m7476z("\u0013tc_\u001b\u001bpgX\u0019\nf}")), C1031a.m7475z(C1031a.m7476z("|st\\\u0014\u001b\u0007")), C1031a.m7475z(C1031a.m7476z("|t\u0000(\u0014mt")), C1031a.m7475z(C1031a.m7476z("\u000b`gK\u0000\u0010|f_")), C1031a.m7475z(C1031a.m7476z("|\r\u0005\"eg\u0005")), C1031a.m7475z(C1031a.m7476z("\u0012|fN\f\rzf_")), C1031a.m7475z(C1031a.m7476z("|q\rX\u0013\u001b\r")), C1031a.m7475z(C1031a.m7476z("\u001ed`[\u0018\u001eg|T\u0010")), C1031a.m7475z(C1031a.m7476z("|\u0000s#\u0010\u001e\u0005")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\f~lX\u0019\np")), C1031a.m7475z(C1031a.m7476z("\u001e{aS\u0004\npbR\u001c\u000bp")), C1031a.m7475z(C1031a.m7476z("\u0014}tQ\u001c")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\u001dy`_")), C1031a.m7475z(C1031a.m7476z("|sq\\`\u001a\u0003")), C1031a.m7475z(C1031a.m7476z("|\r\u0005*eo\u0005")), C1031a.m7475z(C1031a.m7476z("\rrw2")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u001a\rv}S\u0011")), C1031a.m7475z(C1031a.m7476z("\u000fpgO")), C1031a.m7475z(C1031a.m7476z("\u0013|x_\u0012\rppT")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\u0018zy^\u0010\u0011gz^\f\u001ayyU\u0002")), C1031a.m7475z(C1031a.m7476z("\u001bppJ\u0005\u0016{~")), C1031a.m7475z(C1031a.m7476z("\f{zM")), C1031a.m7475z(C1031a.m7476z("\u001btgQ\u0016\u0006t{")), C1031a.m7475z(C1031a.m7476z("|\u0005\u0005*eo\u0005")), C1031a.m7475z(C1031a.m7476z("\u0013|rR\u0001\fpt]\u0007\u001ap{")), C1031a.m7475z(C1031a.m7476z("\u0018gtC")), C1031a.m7475z(C1031a.m7476z("\u001ey|Y\u0010\u001dy`_")), C1031a.m7475z(C1031a.m7476z("\u0012pqS\u0000\u0012a`H\u0004\nz|I\u0010")), C1031a.m7475z(C1031a.m7476z("|w\u0007(gm\u0007")), C1031a.m7475z(C1031a.m7476z("|wv\"\u0013gs")), C1031a.m7475z(C1031a.m7476z("\u0010y|L\u0010")), C1031a.m7475z(C1031a.m7476z("\u0018gpC"))};

    /* renamed from: a */
    private static int m7447a(double d, double d2, double d3) {
        if (d3 > 360.0d) {
            d3 -= 360.0d;
        } else if (d3 < 0.0d) {
            d3 += 360.0d;
        }
        if (d3 < 60.0d) {
            d2 = d + (((d2 - d) * d3) / 60.0d);
        } else if (d3 >= 180.0d) {
            d2 = d3 < 240.0d ? d + (((d2 - d) * (240.0d - d3)) / 60.0d) : d;
        }
        int round = (int) Math.round(255.0d * d2);
        return round < 0 ? 0 : round <= 255 ? round : 255;
    }

    /* renamed from: a */
    public static final int m7448a(int i) {
        return (i >> 24) & 255;
    }

    /* renamed from: a */
    public static final int m7449a(int i, int i2) {
        int i3;
        int[] iArr;
        int i4 = i - 1;
        if (i4 == -1) {
            i4 = f2959h;
            f2959h = i4 + 1;
            i3 = i4;
        } else {
            i3 = i4;
        }
        boolean z = false;
        switch (i2) {
            case 1:
                iArr = f2962k;
                break;
            case 2:
                iArr = f2962k;
                z = true;
                break;
            case 3:
                iArr = WDProjet.getInstance().getPaletteCouleurGabarit();
                break;
            default:
                iArr = f2952a;
                break;
        }
        return C1031a.m7453a(iArr, i3, z);
    }

    /* renamed from: a */
    private static final int m7450a(int i, int i2, int i3, int i4) {
        return ((((i4 & 255) << 24) | ((i & 255) << 16)) | ((i2 & 255) << 8)) | ((i3 & 255) << 0);
    }

    /* renamed from: a */
    public static int m7451a(C1034d c1034d) {
        return C1031a.m7461e(c1034d.mo3315b());
    }

    /* renamed from: a */
    public static final int m7452a(String str) {
        int i = 4;
        String toUpperCase = str.toUpperCase();
        int length = toUpperCase.length();
        if (!C0808l.m4053k(toUpperCase)) {
            int a;
            if (toUpperCase.charAt(0) == '#') {
                if (length == 4) {
                    StringBuilder stringBuilder = new StringBuilder(2);
                    char charAt = toUpperCase.charAt(1);
                    stringBuilder.append(charAt).append(charAt);
                    a = (int) ob.m4108a(stringBuilder.toString());
                    char charAt2 = toUpperCase.charAt(2);
                    stringBuilder.setCharAt(0, charAt2);
                    stringBuilder.setCharAt(1, charAt2);
                    stringBuilder.append(charAt2).append(charAt2);
                    length = (int) ob.m4108a(stringBuilder.toString());
                    char charAt3 = toUpperCase.charAt(3);
                    stringBuilder.setCharAt(0, charAt3);
                    stringBuilder.setCharAt(1, charAt3);
                    stringBuilder.append(charAt3).append(charAt3);
                    return C1031a.m7450a(a, length, (int) ob.m4108a(stringBuilder.toString()), 255);
                } else if (length == 7) {
                    return C1031a.m7450a((int) ob.m4108a(toUpperCase.substring(1, 3)), (int) ob.m4108a(toUpperCase.substring(3, 5)), (int) ob.m4108a(toUpperCase.substring(5, 7)), 255);
                }
            } else if (toUpperCase.startsWith(f2967z[C0607n.al])) {
                int[] iArr = new int[3];
                StringBuilder stringBuilder2 = new StringBuilder(3);
                a = 0;
                while (i < length) {
                    char charAt4 = toUpperCase.charAt(i);
                    if (Character.isDigit(charAt4)) {
                        stringBuilder2.append(charAt4);
                    } else {
                        iArr[a] = C0725i.m3064d(stringBuilder2.toString());
                        if (charAt4 == '%') {
                            iArr[a] = (int) ((((double) iArr[a]) / 100.0d) * 255.0d);
                            i++;
                        }
                        if (toUpperCase.charAt(i) == ',' && a < 2) {
                            a++;
                            stringBuilder2.setLength(0);
                        } else if (toUpperCase.charAt(i) == ')' && a == 2 && i == length - 1) {
                            return C1031a.m7450a(iArr[0], iArr[1], iArr[2], 255);
                        }
                    }
                    i++;
                }
            } else {
                r1 = new String[147][];
                r1[0] = new String[]{f2967z[281], f2967z[147]};
                r1[1] = new String[]{f2967z[265], f2967z[C0607n.co]};
                r1[2] = new String[]{f2967z[158], f2967z[43]};
                r1[3] = new String[]{f2967z[262], f2967z[248]};
                r1[4] = new String[]{f2967z[224], f2967z[C0607n.hu]};
                r1[5] = new String[]{f2967z[153], f2967z[C0607n.Wj]};
                r1[6] = new String[]{f2967z[83], f2967z[C0607n.bx]};
                r1[7] = new String[]{f2967z[185], f2967z[278]};
                r1[8] = new String[]{f2967z[4], f2967z[76]};
                r1[9] = new String[]{f2967z[235], f2967z[191]};
                r1[10] = new String[]{f2967z[C0607n.yk], f2967z[C0607n.Ux]};
                r1[11] = new String[]{f2967z[217], f2967z[InputDeviceCompat.SOURCE_KEYBOARD]};
                r1[12] = new String[]{f2967z[0], f2967z[27]};
                r1[13] = new String[]{f2967z[180], f2967z[263]};
                r1[14] = new String[]{f2967z[137], f2967z[107]};
                r1[15] = new String[]{f2967z[91], f2967z[95]};
                r1[16] = new String[]{f2967z[174], f2967z[154]};
                r1[17] = new String[]{f2967z[121], f2967z[80]};
                r1[18] = new String[]{f2967z[215], f2967z[122]};
                r1[19] = new String[]{f2967z[214], f2967z[C0607n.oq]};
                r1[20] = new String[]{f2967z[51], f2967z[43]};
                r1[21] = new String[]{f2967z[C0607n.Fb], f2967z[15]};
                r1[22] = new String[]{f2967z[277], f2967z[41]};
                r1[23] = new String[]{f2967z[219], f2967z[13]};
                r1[24] = new String[]{f2967z[11], f2967z[213]};
                r1[25] = new String[]{f2967z[99], f2967z[213]};
                r1[26] = new String[]{f2967z[89], f2967z[C0607n.Ao]};
                r1[27] = new String[]{f2967z[C0536n.f1006y], f2967z[C0542t.f1193i]};
                r1[28] = new String[]{f2967z[49], f2967z[73]};
                r1[29] = new String[]{f2967z[5], f2967z[35]};
                r1[30] = new String[]{f2967z[68], f2967z[128]};
                r1[31] = new String[]{f2967z[271], f2967z[C0607n.Bs]};
                r1[32] = new String[]{f2967z[166], f2967z[112]};
                r1[33] = new String[]{f2967z[18], f2967z[148]};
                r1[34] = new String[]{f2967z[59], f2967z[96]};
                r1[35] = new String[]{f2967z[C0607n.qj], f2967z[85]};
                r1[36] = new String[]{f2967z[C0607n.Uk], f2967z[169]};
                r1[37] = new String[]{f2967z[233], f2967z[169]};
                r1[38] = new String[]{f2967z[145], f2967z[87]};
                r1[39] = new String[]{f2967z[245], f2967z[74]};
                r1[40] = new String[]{f2967z[C0607n.wf], f2967z[242]};
                r1[41] = new String[]{f2967z[C0607n.lh], f2967z[143]};
                r1[42] = new String[]{f2967z[223], f2967z[C0607n.Nr]};
                r1[43] = new String[]{f2967z[149], f2967z[C0607n.Nr]};
                r1[44] = new String[]{f2967z[231], f2967z[246]};
                r1[45] = new String[]{f2967z[C0538a.tb], f2967z[283]};
                r1[46] = new String[]{f2967z[C0607n.Eg], f2967z[12]};
                r1[47] = new String[]{f2967z[C0607n.Yw], f2967z[72]};
                r1[48] = new String[]{f2967z[109], f2967z[157]};
                r1[49] = new String[]{f2967z[254], f2967z[249]};
                r1[50] = new String[]{f2967z[164], f2967z[126]};
                r1[51] = new String[]{f2967z[110], f2967z[56]};
                r1[52] = new String[]{f2967z[50], f2967z[55]};
                r1[53] = new String[]{f2967z[280], f2967z[259]};
                r1[54] = new String[]{f2967z[286], f2967z[259]};
                r1[55] = new String[]{f2967z[C0607n.Ug], f2967z[100]};
                r1[56] = new String[]{f2967z[66], f2967z[103]};
                r1[57] = new String[]{f2967z[C0607n.Bf], f2967z[32]};
                r1[58] = new String[]{f2967z[190], f2967z[156]};
                r1[59] = new String[]{f2967z[228], f2967z[C0607n.pw]};
                r1[60] = new String[]{f2967z[C0607n.Au], f2967z[78]};
                r1[61] = new String[]{f2967z[236], f2967z[98]};
                r1[62] = new String[]{f2967z[C0607n.Gu], f2967z[152]};
                r1[63] = new String[]{f2967z[81], f2967z[C0607n.Dt]};
                r1[64] = new String[]{f2967z[255], f2967z[118]};
                r1[65] = new String[]{f2967z[58], f2967z[102]};
                r1[66] = new String[]{f2967z[92], f2967z[57]};
                r1[67] = new String[]{f2967z[C0607n.Cw], f2967z[189]};
                r1[68] = new String[]{f2967z[31], f2967z[67]};
                r1[69] = new String[]{f2967z[C0607n.aw], f2967z[C0607n.f1441Y]};
                r1[70] = new String[]{f2967z[C0607n.vk], f2967z[256]};
                r1[71] = new String[]{f2967z[C0607n.bh], f2967z[97]};
                r1[72] = new String[]{f2967z[111], f2967z[C0607n.Gk]};
                r1[73] = new String[]{f2967z[104], f2967z[C0607n.Gk]};
                r1[74] = new String[]{f2967z[172], f2967z[159]};
                r1[75] = new String[]{f2967z[226], f2967z[C0536n.f995G]};
                r1[76] = new String[]{f2967z[279], f2967z[C0607n.Cv]};
                r1[77] = new String[]{f2967z[C0607n.Fn], f2967z[23]};
                r1[78] = new String[]{f2967z[C0607n.kh], f2967z[C0607n.Ru]};
                r1[79] = new String[]{f2967z[116], f2967z[C0607n.Ru]};
                r1[80] = new String[]{f2967z[62], f2967z[115]};
                r1[81] = new String[]{f2967z[240], f2967z[29]};
                r1[82] = new String[]{f2967z[139], f2967z[37]};
                r1[83] = new String[]{f2967z[C0607n.Hw], f2967z[168]};
                r1[84] = new String[]{f2967z[25], f2967z[105]};
                r1[85] = new String[]{f2967z[40], f2967z[157]};
                r1[86] = new String[]{f2967z[C0538a.Nb], f2967z[269]};
                r1[87] = new String[]{f2967z[146], f2967z[141]};
                r1[88] = new String[]{f2967z[225], f2967z[184]};
                r1[89] = new String[]{f2967z[218], f2967z[44]};
                r1[90] = new String[]{f2967z[138], f2967z[93]};
                r1[91] = new String[]{f2967z[130], f2967z[108]};
                r1[92] = new String[]{f2967z[6], f2967z[C0607n.af]};
                r1[93] = new String[]{f2967z[22], f2967z[C0607n.nn]};
                r1[94] = new String[]{f2967z[282], f2967z[C0536n.f1002n]};
                r1[95] = new String[]{f2967z[C0607n.Qt], f2967z[165]};
                r1[96] = new String[]{f2967z[106], f2967z[183]};
                r1[97] = new String[]{f2967z[36], f2967z[26]};
                r1[98] = new String[]{f2967z[260], f2967z[10]};
                r1[99] = new String[]{f2967z[30], f2967z[238]};
                r1[100] = new String[]{f2967z[113], f2967z[114]};
                r1[101] = new String[]{f2967z[19], f2967z[60]};
                r1[102] = new String[]{f2967z[9], f2967z[268]};
                r1[103] = new String[]{f2967z[285], f2967z[C0607n.uw]};
                r1[104] = new String[]{f2967z[21], f2967z[77]};
                r1[105] = new String[]{f2967z[45], f2967z[71]};
                r1[106] = new String[]{f2967z[C0607n.Hn], f2967z[34]};
                r1[107] = new String[]{f2967z[188], f2967z[216]};
                r1[108] = new String[]{f2967z[125], f2967z[C0607n.Jn]};
                r1[109] = new String[]{f2967z[33], f2967z[17]};
                r1[110] = new String[]{f2967z[247], f2967z[C0607n.no]};
                r1[111] = new String[]{f2967z[101], f2967z[131]};
                r1[112] = new String[]{f2967z[C0607n.Px], f2967z[182]};
                r1[113] = new String[]{f2967z[14], f2967z[C0607n.Xn]};
                r1[114] = new String[]{f2967z[C0607n.hp], f2967z[181]};
                r1[115] = new String[]{f2967z[C0607n.Ep], f2967z[199]};
                r1[116] = new String[]{f2967z[90], f2967z[193]};
                r1[117] = new String[]{f2967z[47], f2967z[136]};
                r1[118] = new String[]{f2967z[C0607n.yt], f2967z[123]};
                r1[119] = new String[]{f2967z[C0607n.Tv], f2967z[C0607n.me]};
                r1[C0607n.co] = new String[]{f2967z[48], f2967z[284]};
                r1[121] = new String[]{f2967z[82], f2967z[79]};
                r1[122] = new String[]{f2967z[20], f2967z[39]};
                r1[123] = new String[]{f2967z[151], f2967z[53]};
                r1[C0607n.Hn] = new String[]{f2967z[160], f2967z[187]};
                r1[125] = new String[]{f2967z[86], f2967z[61]};
                r1[126] = new String[]{f2967z[173], f2967z[232]};
                r1[C0607n.bx] = new String[]{f2967z[167], f2967z[117]};
                r1[128] = new String[]{f2967z[38], f2967z[2]};
                r1[C0607n.Wj] = new String[]{f2967z[16], f2967z[253]};
                r1[130] = new String[]{f2967z[204], f2967z[52]};
                r1[131] = new String[]{f2967z[75], f2967z[1]};
                r1[C0538a.tb] = new String[]{f2967z[63], f2967z[1]};
                r1[133] = new String[]{f2967z[276], f2967z[84]};
                r1[C0607n.Fb] = new String[]{f2967z[C0607n.f1465w], f2967z[C0538a.Lb]};
                r1[C0538a.Nb] = new String[]{f2967z[46], f2967z[28]};
                r1[136] = new String[]{f2967z[94], f2967z[171]};
                r1[137] = new String[]{f2967z[227], f2967z[155]};
                r1[138] = new String[]{f2967z[133], f2967z[261]};
                r1[139] = new String[]{f2967z[24], f2967z[3]};
                r1[C0542t.f1193i] = new String[]{f2967z[258], f2967z[252]};
                r1[141] = new String[]{f2967z[64], f2967z[70]};
                r1[C0536n.f995G] = new String[]{f2967z[54], f2967z[65]};
                r1[143] = new String[]{f2967z[88], f2967z[C0607n.jk]};
                r1[C0538a.Lb] = new String[]{f2967z[69], f2967z[7]};
                r1[145] = new String[]{f2967z[42], f2967z[251]};
                r1[146] = new String[]{f2967z[119], f2967z[8]};
                length = r1.length;
                for (i = 0; i < length; i++) {
                    if (toUpperCase.equals(r1[i][0])) {
                        return C1031a.m7452a(r1[i][1]);
                    }
                }
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(f2967z[192], str));
        return 0;
    }

    /* renamed from: a */
    public static final int m7453a(int[] iArr, int i, boolean z) {
        if (i < 0) {
            i = 0;
        }
        if (i < iArr.length && !z) {
            return iArr[i];
        }
        int i2 = iArr[i % iArr.length];
        int[] h = C1031a.m7464h(i2);
        int length = (i / iArr.length) % 11;
        if (length == 0 && !z) {
            return i2;
        }
        double d = (double) h[2];
        double d2 = length <= 2 ? ((double) h[2]) + (((double) length) * f2954c) : ((double) h[2]) - (((double) (length - 2)) * f2954c);
        double d3 = z ? f2957f : f2966o;
        d = z ? f2955d : f2963l;
        if (d2 < d) {
            d = d2;
        }
        if (d >= d3) {
            d3 = d;
        }
        return C1031a.m7456b(h[0], (int) d3, h[1]);
    }

    /* renamed from: a */
    public static C1034d m7454a(int i, int i2, int i3) {
        double d = ((double) i3) / 100.0d;
        int f = (int) ((((double) C1031a.m7462f(i)) * d) + (((double) C1031a.m7462f(i2)) * (1.0d - d)));
        int g = (int) ((((double) C1031a.m7463g(i)) * d) + (((double) C1031a.m7463g(i2)) * (1.0d - d)));
        int l = (int) (((1.0d - d) * ((double) C1031a.m7468l(i2))) + (((double) C1031a.m7468l(i)) * d));
        if (f > 255) {
            f = 255;
        }
        if (g > 255) {
            g = 255;
        }
        if (l > 255) {
            l = 255;
        }
        return new C1034d(l, g, f, 255);
    }

    /* renamed from: b */
    public static final int m7455b(int i, int i2) {
        int i3 = 0;
        int i4 = (i >> 24) & 255;
        int i5 = (int) (((double) ((i >> 16) & 255)) + (((double) i2) * 2.55d));
        int i6 = (int) (((double) ((i >> 8) & 255)) + (((double) i2) * 2.55d));
        int i7 = (int) (((double) (i & 255)) + (((double) i2) * 2.55d));
        if (i5 < 0) {
            i5 = 0;
        } else if (i5 > 255) {
            i5 = 255;
        }
        if (i6 < 0) {
            i6 = 0;
        } else if (i6 > 255) {
            i6 = 255;
        }
        if (i7 >= 0) {
            i3 = i7 > 255 ? 255 : i7;
        }
        return i3 | (((i4 << 24) | (i5 << 16)) | (i6 << 8));
    }

    /* renamed from: b */
    public static int m7456b(int i, int i2, int i3) {
        int max;
        int i4;
        int i5;
        if (i3 == 0) {
            max = Math.max(0, Math.min(255, (i2 * 255) / 100));
            i4 = max;
            i5 = max;
        } else {
            double d = (double) i;
            double d2 = ((double) i2) / 100.0d;
            double d3 = ((double) i3) / 100.0d;
            d3 = d2 <= 0.5d ? (d3 * d2) + d2 : (d2 + d3) - (d3 * d2);
            d2 = (d2 * 2.0d) - d3;
            int a = C1031a.m7447a(d2, d3, d + 120.0d);
            int a2 = C1031a.m7447a(d2, d3, d);
            max = C1031a.m7447a(d2, d3, d - 120.0d);
            i4 = a2;
            i5 = a;
        }
        return ((max & 255) << 0) | (((i4 & 255) << 8) | (((i5 & 255) << 16) | -16777216));
    }

    /* renamed from: b */
    public static final int m7457b(int i, int i2, int i3, int i4) {
        int i5 = (i >> 24) & 255;
        int[] h = C1031a.m7464h(i);
        h[0] = Math.max(0, Math.min(360, (h[0] + i2) % 360));
        h[1] = Math.max(0, Math.min(100, h[1] + i3));
        h[2] = Math.max(0, Math.min(100, h[2] + i4));
        return (i5 << 24) | (C1031a.m7456b(h[0], h[2], h[1]) & 16777215);
    }

    /* renamed from: b */
    public static final String m7458b(int i) {
        StringBuilder stringBuilder = new StringBuilder(7);
        stringBuilder.append('#');
        String toHexString = Integer.toHexString(C1031a.m7468l(i));
        if (toHexString.length() == 1) {
            stringBuilder.append('0');
        }
        stringBuilder.append(toHexString);
        toHexString = Integer.toHexString(C1031a.m7463g(i));
        if (toHexString.length() == 1) {
            stringBuilder.append('0');
        }
        stringBuilder.append(toHexString);
        toHexString = Integer.toHexString(C1031a.m7462f(i));
        if (toHexString.length() == 1) {
            stringBuilder.append('0');
        }
        stringBuilder.append(toHexString);
        return stringBuilder.toString();
    }

    /* renamed from: c */
    public static final boolean m7459c(int i) {
        return C1031a.m7468l(i) == 0 && C1031a.m7463g(i) == 0 && C1031a.m7462f(i) == 0;
    }

    /* renamed from: d */
    public static final boolean m7460d(int i) {
        return C1031a.m7468l(i) == 255 && C1031a.m7463g(i) == 255 && C1031a.m7462f(i) == 255;
    }

    /* renamed from: e */
    public static int m7461e(int i) {
        return C1031a.m7448a(i) == 0 ? -1 : ((C0607n.Sj & i) >> 16) | ((65280 & i) | ((i & 255) << 16));
    }

    /* renamed from: f */
    public static final int m7462f(int i) {
        return (i >> 0) & 255;
    }

    /* renamed from: g */
    public static final int m7463g(int i) {
        return (i >> 8) & 255;
    }

    /* renamed from: h */
    public static int[] m7464h(int i) {
        double d = ((double) ((i >> 16) & 255)) / 255.0d;
        double d2 = ((double) ((i >> 8) & 255)) / 255.0d;
        double d3 = ((double) ((i >> 0) & 255)) / 255.0d;
        double min = Math.min(d, Math.min(d2, d3));
        double max = Math.max(d, Math.max(d2, d3));
        double d4 = max - min;
        double d5 = max + min;
        double d6 = d5 / 2.0d;
        if (max == min) {
            min = 0.0d;
            d = 0.0d;
        } else {
            min = d6 <= 0.5d ? d4 / d5 : d4 / (2.0d - d5);
            d5 = (max - d) / d4;
            double d7 = (max - d2) / d4;
            d3 = (max - d3) / d4;
            double d8;
            if (d == max) {
                d8 = min;
                min = 60.0d * ((6.0d + d3) - d7);
                d = d8;
            } else if (d2 == max) {
                d8 = min;
                min = 60.0d * ((2.0d + d5) - d3);
                d = d8;
            } else {
                d8 = min;
                min = 60.0d * ((4.0d + d7) - d5);
                d = d8;
            }
        }
        if (min < 0.0d) {
            min += 360.0d;
        }
        int round = ((int) Math.round(min)) % 360;
        int max2 = Math.max(0, Math.min((int) Math.round(100.0d * d6), 100));
        int max3 = Math.max(0, Math.min((int) Math.round(d * 100.0d), 100));
        return new int[]{round, max3, max2};
    }

    /* renamed from: i */
    public static int m7465i(int i) {
        return ((((i & 255) << 16) | -16777216) | (65280 & i)) | ((C0607n.Sj & i) >> 16);
    }

    /* renamed from: j */
    public static final C1034d m7466j(int i) {
        C1034d b = C1035e.m7510b(i);
        return b == null ? C1031a.m7472p(C1031a.m7450a(Math.max(0, C1031a.m7468l(i) - 64), Math.max(0, C1031a.m7463g(i) - 64), Math.max(0, C1031a.m7462f(i) - 64), C1031a.m7448a(i))) : b;
    }

    /* renamed from: k */
    public static int m7467k(int i) {
        C1034d a = C1034d.m7481a(i);
        return a != null ? a.mo3315b() : C1031a.m7465i(i);
    }

    /* renamed from: l */
    public static final int m7468l(int i) {
        return (i >> 16) & 255;
    }

    /* renamed from: m */
    public static C1034d m7469m(int i) {
        C1034d a = C1034d.m7481a(i);
        return a != null ? a : C1031a.m7472p(C1031a.m7465i(i));
    }

    /* renamed from: n */
    public static int m7470n(int i) {
        return ((((C1031a.m7448a(i) & 255) << 24) | (((255 - C1031a.m7468l(i)) & 255) << 16)) | (((255 - C1031a.m7463g(i)) & 255) << 8)) | (((255 - C1031a.m7462f(i)) & 255) << 0);
    }

    /* renamed from: o */
    public static C1034d m7471o(int i) {
        C1034d c = C1035e.m7511c(i);
        return c == null ? C1031a.m7472p(C1031a.m7450a(Math.min(255, C1031a.m7468l(i) + 64), Math.min(255, C1031a.m7463g(i) + 64), Math.min(255, C1031a.m7462f(i) + 64), C1031a.m7448a(i))) : c;
    }

    /* renamed from: p */
    public static final C1034d m7472p(int i) {
        Integer num = new Integer(i);
        WeakReference weakReference = (WeakReference) f2960i.get(num);
        if (weakReference != null) {
            C1034d c1034d = (C1034d) weakReference.get();
            if (c1034d != null) {
                return c1034d;
            }
        }
        C1034d c1034d2 = new C1034d(i);
        f2960i.put(num, new WeakReference(c1034d2));
        if (f2960i.size() % 5 == 0) {
            Iterator it = f2960i.keySet().iterator();
            while (it.hasNext()) {
                if (((WeakReference) f2960i.get((Integer) it.next())).get() == null) {
                    it.remove();
                }
            }
        }
        return c1034d2;
    }

    /* renamed from: q */
    public static final boolean m7473q(int i) {
        return i == -1 || i == -16777216;
    }

    /* renamed from: r */
    public static final boolean m7474r(int i) {
        return C1031a.m7468l(i) <= 128 || C1031a.m7463g(i) <= 128 || C1031a.m7462f(i) <= 128;
    }

    /* renamed from: z */
    private static String m7475z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 95;
                    break;
                case 1:
                    i2 = 53;
                    break;
                case 2:
                    i2 = 53;
                    break;
                case 3:
                    i2 = 26;
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
    private static char[] m7476z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 85);
        }
        return toCharArray;
    }
}
