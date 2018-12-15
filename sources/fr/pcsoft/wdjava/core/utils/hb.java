package fr.pcsoft.wdjava.core.utils;

import android.support.v4.view.InputDeviceCompat;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.allocation.C0611a;
import fr.pcsoft.wdjava.core.application.C0536n;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0782g;
import fr.pcsoft.wdjava.core.types.WDDate;
import fr.pcsoft.wdjava.core.types.WDDateHeure;
import fr.pcsoft.wdjava.core.types.WDDuree;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDHeure;
import fr.pcsoft.wdjava.database.hf.C0542t;
import fr.pcsoft.wdjava.database.hf.requete.parsing.C0538a;
import java.text.StringCharacterIterator;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

public class hb {
    /* renamed from: A */
    public static final int f2060A = 1000;
    /* renamed from: B */
    protected static final Map<String, Integer> f2061B = new HashMap(20);
    /* renamed from: C */
    public static final int f2062C = 11;
    /* renamed from: D */
    public static final int f2063D = 7;
    /* renamed from: E */
    private static final int[] f2064E = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    /* renamed from: F */
    public static final int f2065F = 1;
    /* renamed from: G */
    public static final long f2066G = 2678400000L;
    /* renamed from: H */
    private static final String[] f2067H = new String[]{m3940z(m3941z("\u0006\u000b")), m3940z(m3941z("\u0006y")), m3940z(m3941z("\r\u0000")), m3940z(m3941z("\u001e\u000e")), m3940z(m3941z("\u000f\u000e")), m3940z(m3941z("\u0003\u000e")), m3940z(m3941z("\u000f\u0013")), m3940z(m3941z("\u001d\u0010")), m3940z(m3941z("\u001b0|J^=7|tj/0r")), m3940z(m3941z("m\fZMh\f\u0011\\")), m3940z(m3941z("m\u000eXKt")), m3940z(m3941z("m\tXWq\u0007\u0006K")), m3940z(m3941z("m\u0005\\Ou\u0007\u0006K")), m3940z(m3941z("m\u0002VLs")), m3940z(m3941z("m\rVOb\u0003\u0001K\\")), m3940z(m3941z("m\u0002OKn\u0002")), m3940z(m3941z("m\tLPk\u0002\u0006M")), m3940z(m3941z("m\tLPi")), m3940z(m3941z("m\u000eXP")), m3940z(m3941z("m\u0010\\Is\u000b\u000e[Kb")), m3940z(m3941z("m\u0007\\Zb\u0003\u0001K\\")), m3940z(m3941z("\u0003\u000eTT")), m3940z(m3941z("\u0003\u000eTt")), m3940z(m3941z("\u0003.t")), m3940z(m3941z("\u0004\tSs")), m3940z(m3941z("\n'}}")), m3940z(m3941z("\n\u0007]}")), m3940z(m3941z("\u0003\u000et")), m3940z(m3941z("\u0004)ss")), m3940z(m3941z("\n'}")), m3940z(m3941z("\u0004\ts")), m3940z(m3941z("\u0003.tt")), m3940z(m3941z("\u0003\u000eT")), m3940z(m3941z("\n\u0007}")), m3940z(m3941z("\u0004)s")), m3940z(m3941z("\u0017\u001a")), m3940z(m3941z("|s")), m3940z(m3941z("z")), m3940z(m3941z("\u000f\u0002")), m3940z(m3941z("\n\u0007")), m3940z(m3941z("\u0004\t")), m3940z(m3941z("\u0017\u001a@@")), m3940z(m3941z("fkBG~\u0013h0eyg\u001a@1\u000f\u0015\u001d@D\fg?=0")), m3940z(m3941z("\u000f\u0002XX")), m3940z(m3941z("fkBGf\u0013h0eyg\u0002X1\u000f\u0015\u001dXD\fg?=0")), m3940z(m3941z("\u001d7xwC/1}")), m3940z(m3941z("\n\u0002@Un\t\u000bM")), m3940z(m3941z("\u000f.|kN-\"6WB9\u001c@vU%")), m3940z(m3941z("\f\"w~L!(9JS/-}xU*cMpJ+")), m3940z(m3941z("\u000f6jmU//px\b\u000f'|uF''|")), m3940z(m3941z("\u00071xw\u0007\u001d7xwC/1}9s'.|")), m3940z(m3941z("\u000f0px\b\u001d*w~F>,k|")), m3940z(m3941z("\u000f1x{N-cJmF 'xkCn\u0017ptB")), m3940z(m3941z("\u0005,k|F")), m3940z(m3941z("\r&wmU//")), m3940z(m3941z("\u000f/xjL/-9JS/-}xU*cMpJ+")), m3940z(m3941z("\u001e\"zpA' 6^R/.")), m3940z(m3941z("\u000b6kvW+lIkF)6|")), m3940z(m3941z("\u001e\"zpA' 6^R/'xuD/-xu")), m3940z(m3941z("\u001d\u00069XT'\"")), m3940z(m3941z("\u001d:}wB7cJmF 'xkCn\u0017ptB")), m3940z(m3941z("\u0000,kmOn\u0002jpFn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\u0019m9XR=7kxK'\"9JS/-}xU*cMpJ+")), m3940z(m3941z("\r+pwF")), m3940z(m3941z("\u0003:xwJ/19JS/-}xU*cMpJ+")), m3940z(m3941z("\t\u000eM")), m3940z(m3941z("\u0017\"rlS=(")), m3940z(m3941z("\r&wmU//9IF-*pDn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\u0018/x}N8,jmH%cJmF 'xkCn\u0017ptB")), m3940z(m3941z("\r\"lzF=6j")), m3940z(m3941z("\u000f%kpD/lWxN<,{p")), m3940z(m3941z("\u000bm9\\R<,i|")), m3940z(m3941z("\u001a\"jtF *x9t:\"w}F<'9MN#&")), m3940z(m3941z("\u000f6jmU//px\b\n\"knN ")), m3940z(m3941z("\u001b\u00109\\F=7|kIn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\u001a,w~Fn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\u000b6kvW+lTvT-,n")), m3940z(m3941z("\u000f.|kN-\"6[R+-vjx\u000f*k|T")), m3940z(m3941z("\u000f6jmU//px\b\u0006,{xU:")), m3940z(m3941z("\u000f.|kN-\"6ZO' x~H")), m3940z(m3941z("\u000f\u0016J9d+-mkF\"")), m3940z(m3941z("\u000f0px\b\u001c\"w~H!-")), m3940z(m3941z("\u001d\"tvF")), m3940z(m3941z("\u001d\u00029NB=7|kI")), m3940z(m3941z("\u000f1x{")), m3940z(m3941z("\u0007-}pF")), m3940z(m3941z("\u001b\u00109TH;-mxN ")), m3940z(m3941z("\u000b(xmB<*w{R<$9JS/-}xU*cMpJ+")), m3940z(m3941z("\u000bm9XR=7kxK'\"9JS/-}xU*cMpJ+")), m3940z(m3941z("\u000f0px\b\n+xrF")), m3940z(m3941z("\u001c,txI-&")), m3940z(m3941z("\u0017\"rlS=(9JS/-}xU*cMpJ+")), m3940z(m3941z("\u000f%kpD/lZxN<,")), m3940z(m3941z("\b*sp")), m3940z(m3941z("\r\"i|\u0007\u0018&k}Bn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\r\"wxC/cZ|I:1xu")), m3940z(m3941z("\u001a\"piB'")), m3940z(m3941z("\u001e\"zpA' 6XR-(uxI*")), m3940z(m3941z("\u000f6jmU//px\b\f1pjE/-|")), m3940z(m3941z("\t\u0017[")), m3940z(m3941z("\r+pwFn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\u001d\"tvFn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\t1||I\"\"w}\u0007\u001d7xwC/1}9s'.|")), m3940z(m3941z("\u000f.|kN-\"6PI**xwF>,upT")), m3940z(m3941z("\r&w7\u0007\u000f6jmU//px\u0007\u001d7xwC/1}9s'.|")), m3940z(m3941z("\u000f0px\b\u0005\"kxD&*")), m3940z(m3941z("\u000f0px\b\u0004&klT//|t")), m3940z(m3941z("\u001e\"zpA' 6TF$6kv")), m3940z(m3941z("\u00071xw")), m3940z(m3941z("\u000b$`iSn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\r&wmU//9\\R<,i|F cJmF 'xkCn\u0017ptB")), m3940z(m3941z("\u000f0px\b\u0017&rxS+1pwE;1~")), m3940z(m3941z("\u000f.|kN-\"6QF\"*x_")), m3940z(m3941z("\u000f\u0016J9b/0m|U cJmF 'xkCn\u0017ptB")), m3940z(m3941z("\b\u000f\\9t:\"w}F<'9MN#&")), m3940z(m3941z("\u001e\"zpA' 6QH ,ulK;")), m3940z(m3941z("\u000f0px\b\u001a\"piB'")), m3940z(m3941z("\u000f\u0016J9d+-mkF\"cJmF 'xkCn\u0017ptB")), m3940z(m3941z("\u001d*w~F>,k|\u0007\u001d7xwC/1}9s'.|")), m3940z(m3941z("\t\u0017[9t:\"w}F<'9MN#&")), m3940z(m3941z("\u000f.|kN-\"6^H*7qxE")), m3940z(m3941z("\u000f0px\b\u001c*`xC&")), m3940z(m3941z("\u0019&jm\u0007\u000f0px")), m3940z(m3941z("\u0019m9ZB 7kxKn\u0002kN-\"9JS/-}xU*cMpJ+")), m3940z(m3941z("\u000f.|kN-\"6ZF<\"zxT")), m3940z(m3941z("\u001d1p9k/-rx\u0007\u001d7xwC/1}9s'.|")), m3940z(m3941z("\n\"m|K'-|")), m3940z(m3941z("\u000b(xmB<*w{R<$")), m3940z(m3941z("\u000b6kvW+lIxU'0")), m3940z(m3941z("\f&psN $")), m3940z(m3941z("\u000b6kvW+l[|K)1x}B")), m3940z(m3941z("\u000f0px\b\u001d&vlK")), m3940z(m3941z("\u000f0px\b\u0017\"rlS=(")), m3940z(m3941z("\u000f0px\b\u0005\"mtF 'l")), m3940z(m3941z("\u000f1x{N/-9JS/-}xU*cMpJ+")), m3940z(m3941z("\u000f1x{N/-")), m3940z(m3941z("\u00070kxB\"cJmF 'xkCn\u0017ptB")), m3940z(m3941z("\u000b6kvW+l[lD&\"k|T:")), m3940z(m3941z("\u000f0px\b\u0005\"{lK")), m3940z(m3941z("\u0019&jm\u0007\u000f0px\u0007\u001d7xwC/1}9s'.|")), m3940z(m3941z("\u000b6kvW+lNxU=\"n")), m3940z(m3941z("\r\"lzF=6j9t:\"w}F<'9MN#&")), m3940z(m3941z("\b\u000f\\")), m3940z(m3941z("\u000f0px\b\u00036jzF:")), m3940z(m3941z("\u001d,lmOn\u0002kN-\"9JS/-}xU*cMpJ+")), m3940z(m3941z("\u001d\u00069XT'\"9JS/-}xU*cMpJ+")), m3940z(m3941z("\u000f%kpD/lQxU/1|")), m3940z(m3941z("\u000f0px\b\r\"uzR:7x")), m3940z(m3941z("\u001e\"zpA' 9Jfn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\u000f7uxI:*z")), m3940z(m3941z("\u001b\u00109TH;-mxN cJmF 'xkCn\u0017ptB")), m3940z(m3941z("\u001d1p9k/-rx")), m3940z(m3941z("\u001d*w~F>,k|")), m3940z(m3941z("\t\u000eM9t:\"w}F<'9MN#&")), m3940z(m3941z("\u000f.|kN-\"6]B 5|k")), m3940z(m3941z("\u0000&nH;-}uF '9JS/-}xU*cMpJ+")), m3940z(m3941z("\u000f\u0016J9b/0m|U ")), m3940z(m3941z("\u0019&jm\u0007\u001e\"zpA' ")), m3940z(m3941z("\u0000&n9}+\"uxI*")), m3940z(m3941z("\u0003*}4f:/xwS' ")), m3940z(m3941z("\u000f6jmU//px\b\u001d:}wB7")), m3940z(m3941z("\u000b6kvW+lUvI*,w")), m3940z(m3941z("\t1||I9*zq\u0007\u001d7xwC/1}9s'.|")), m3940z(m3941z("\u001d\u00029NB=7|kIn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\u000f/xjL/-")), m3940z(m3941z("\u001c6jjN/-9JS/-}xU*cMpJ+")), m3940z(m3941z("\u000b6kvW+l[|U\"*w")), m3940z(m3941z("\u0003,lwS/*w")), m3940z(m3941z("\u000f0px\b\u001a!puN=*")), m3940z(m3941z("\u0000m9ZB 7kxKn\u0002jpFn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\r&wmU//9XJ+1pzFn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\t\u0005M9t:\"w}F<'9MN#&")), m3940z(m3941z("\u000f0px\b\u0000,ovT'!pkT%")), m3940z(m3941z("\u001d\u00029\\F=7|kIn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\u001d\"l}Nn\u0002kxE'\"9JS/-}xU*cMpJ+")), m3940z(m3941z("\u000f%kpD/lUlF 'x")), m3940z(m3941z("\u001a\"jtF *x")), m3940z(m3941z("\u0000&nH;-}uF '")), m3940z(m3941z("\u000f0px\b\u001d+xw@&\"p")), m3940z(m3941z("\u001e\"zpA' 6MH $xmF>6")), m3940z(m3941z("\u000f7uxI:*z6f4,k|T")), m3940z(m3941z("\u000f0px\b\u0018/x}N8,jmH%")), m3940z(m3941z("\u0019m9\\R<,i|")), m3940z(m3941z("\u0019m9XR=7kxK'\"")), m3940z(m3941z("\r\"wxC/cZ|I:1xu\u0007\u001d7xwC/1}9s'.|")), m3940z(m3941z("\r&wmU//9\\R<,i|F ")), m3940z(m3941z("\u000f.|kN-\"6JF!\u001cIxR\",")), m3940z(m3941z("\r&wmU//9JS/-}xU*cMpJ+")), m3940z(m3941z("\t\u0005M")), m3940z(m3941z("\u0003&apD!cJmF 'xkCn\u0017ptBnq")), m3940z(m3941z("\r&wmU//9\\R<,i|")), m3940z(m3941z("\f\"w~L!(")), m3940z(m3941z("\u0003&apD!cJmF 'xkCn\u0017ptB")), m3940z(m3941z("\u000f.|kN-\"6[H),mx")), m3940z(m3941z("\u000f.|kN-\"6XI-+vkF)&")), m3940z(m3941z("\u001b\u00109\\F=7|kI")), m3940z(m3941z("\u001d,lmOn\u0002kN-\"")), m3940z(m3941z("\u000b\"jmB<-")), m3940z(m3941z("\u000f9vkB=cJmF 'xkCn\u0017ptB")), m3940z(m3941z("\u000bm9JH;7q9f#&kpD/")), m3940z(m3941z("\r&wmU//9\\R<,i|\u0007\u001d7xwC/1}9s'.|")), m3940z(m3941z("\u000bm9XR=7kxK'\"")), m3940z(m3941z("\r&w7\u0007\u000f6jmU//px")), m3940z(m3941z("\u001e1x~R+c[kF:*juF8\"")), m3940z(m3941z("\u000f7uxI:*z9t:\"w}F<'9MN#&")), m3940z(m3941z("\u000b$`iS")), m3940z(m3941z("\u000b6kvW+lXmO+-j")), m3940z(m3941z("\t1||I9*zq")), m3940z(m3941z("\u000bm9JH;7q9f#&kpD/cJmF 'xkCn\u0017ptB")), m3940z(m3941z("\u000b\"jmB<-9JS/-}xU*cMpJ+")), m3940z(m3941z("\u000f.|kN-\"6UH=\u001cXw@+/|j")), m3940z(m3941z("\u001a,r`H")), m3940z(m3941z("\u001d\u00029IF-*pD")), m3940z(m3941z("\u000f0px\b\r,uvJ,,")), m3940z(m3941z("\u000f1x{\u0007\u001d7xwC/1}9s'.|")), m3940z(m3941z("\u001e\"zpA' 6XW'\"")), m3940z(m3941z("\u000f6jmU//px\b\u001e&kmO")), m3940z(m3941z("\b*sp\u0007\u001d7xwC/1}9s'.|")), m3940z(m3941z("\u0000&ixKn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\u0003,lwS/*w9t:\"w}F<'9MN#&")), m3940z(m3941z("\u000f0px\b\f\"~qC/'")), m3940z(m3941z("\u000f0px\b\u00051xjI!:xkT%")), m3940z(m3941z("\u001d\u00029IF-*pDn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\u000f%~qF *jmF cJmF 'xkCn\u0017ptB")), m3940z(m3941z("\u001a\"piB'cJmF 'xkCn\u0017ptB")), m3940z(m3941z("\u001d\"l}Nn\u0002kxE'\"")), m3940z(m3941z("\u000b6kvW+lQ|K=*wrN")), m3940z(m3941z("\u0018/x}N8,jmH%")), m3940z(m3941z("\u001e\"zpA' ")), m3940z(m3941z("\u0005,k|Fn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\u000f%~qF *jmF ")), m3940z(m3941z("\u0003&apD!")), m3940z(m3941z("\u0006\"nxN'\"w9t:\"w}F<'9MN#&")), m3940z(m3941z("\u001e\"zpA' 6_N$*")), m3940z(m3941z("\u000f.|kN-\"6ZO'+lxO;\"")), m3940z(m3941z("\u000f.|kN-\"6TB6*zvx\r*m`")), m3940z(m3941z("\r&wmU//9XT'\"")), m3940z(m3941z("\u001e\"zpA' 9Jf")), m3940z(m3941z("\u0007-}pFn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\u0000,kmOn\u0002jpFn\u0006xjSn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\u000bm9XA<*zx\u0007\u001d7xwC/1}9s'.|")), m3940z(m3941z("\u000f9vkB=")), m3940z(m3941z("\r&wmU//9XT'\"9JS/-}xU*cMpJ+")), m3940z(m3941z("\u0019\"kjF9")), m3940z(m3941z("\u000f7uxI:*z6d/3|Fq+1}|")), m3940z(m3941z("\u0019m9\\R<,i|\u0007\u001d7xwC/1}9s'.|")), m3940z(m3941z("\u000f7uxI:*z6t!6mqx\t&vk@'\"")), m3940z(m3941z("\u000f0px\b\u001a,r`H")), m3940z(m3941z("\u0003*}4f:/xwS' 9JS/-}xU*cMpJ+")), m3940z(m3941z("\u000bm9\\R<,i|\u0007\u001d7xwC/1}9s'.|")), m3940z(m3941z("\u001d\u00029\\F=7|kI")), m3940z(m3941z("\u000f0px\b\u001b/xxI,\"xmF<")), m3940z(m3941z("\u000bm9XA<*zx")), m3940z(m3941z("\u001a,r`Hn\u0010mxI*\"k}\u0007\u001a*t|")), m3940z(m3941z("\u000f.|kN-\"6IO!&wp_")), m3940z(m3941z("\r&wmU//9IF-*pD")), m3940z(m3941z("\u001e\"zpA' 9JS/-}xU*cMpJ+")), m3940z(m3941z("\n\"m|K'-|9t:\"w}F<'9MN#&")), m3940z(m3941z("\u000f0px\b\u001a&qkF ")), m3940z(m3941z("\u000f0px\b\f\"w~L!(")), m3940z(m3941z("\u000f.|kN-\"6KB)*wx")), m3940z(m3941z("\u000f.|kN-\"6JS\u0011\tvqI=")), m3940z(m3941z("\u001c,txI-&9JS/-}xU*cMpJ+")), m3940z(m3941z("\u0019&jm\u0007\u001e\"zpA' 9JS/-}xU*cMpJ+")), m3940z(m3941z("\u0006\"nxN'\"w")), m3940z(m3941z("\u00070kxB\"")), m3940z(m3941z("\u001c6jjN/-")), m3940z(m3941z("\u0000&n9}+\"uxI*cJmF 'xkCn\u0017ptB")), m3940z(m3941z("m\u000eVPt\u0011\nWOf\u0002\n]\\")), m3940z(m3941z("\u0002\u000fU")), m3940z(m3941z("\u0002\u000f")), m3940z(m3941z("m\u0007PTf\u0000\u0000Q\\")), m3940z(m3941z("m\u0010XTb\n\n")), m3940z(m3941z("m\u000eXKc\u0007")), m3940z(m3941z("m\u0015\\Wc\u001c\u0006]P")), m3940z(m3941z("m\t\\Lc\u0007")), m3940z(m3941z("m\u000e\\Kd\u001c\u0006]P")), m3940z(m3941z("m\u000fLWc\u0007"))};
    /* renamed from: a */
    public static String f2068a = null;
    /* renamed from: b */
    public static String f2069b = null;
    /* renamed from: c */
    public static final int f2070c = 6;
    /* renamed from: d */
    public static final byte f2071d = (byte) 3;
    /* renamed from: e */
    public static final int f2072e = 5;
    /* renamed from: f */
    public static final int f2073f = 60000;
    /* renamed from: g */
    public static final byte f2074g = (byte) 1;
    /* renamed from: h */
    public static final byte f2075h = (byte) 6;
    /* renamed from: i */
    public static final byte f2076i = (byte) 2;
    /* renamed from: j */
    public static final int f2077j = 3600000;
    /* renamed from: k */
    public static final int f2078k = 4;
    /* renamed from: l */
    public static final long f2079l = 86400000;
    /* renamed from: m */
    public static final byte f2080m = (byte) 7;
    /* renamed from: n */
    public static final int f2081n = 9;
    /* renamed from: o */
    public static final byte f2082o = (byte) 5;
    /* renamed from: p */
    public static final int f2083p = 2;
    /* renamed from: q */
    public static final int f2084q = 10;
    /* renamed from: r */
    private static HashMap<String, String> f2085r = null;
    /* renamed from: s */
    public static final int f2086s = 8;
    /* renamed from: t */
    public static final int f2087t = 12;
    /* renamed from: u */
    public static final int f2088u = 3;
    /* renamed from: v */
    protected static final Map<String, Integer> f2089v = new HashMap(60);
    /* renamed from: w */
    public static final byte f2090w = (byte) 4;
    /* renamed from: x */
    public static final long f2091x = 977616000000L;
    /* renamed from: y */
    public static final int f2092y = 10;
    /* renamed from: z */
    public static final int f2093z = 7;

    static {
        f2061B.put(m3940z(m3941z("\u0004\u0002WOn\u000b\u0011")), Integer.valueOf(1));
        f2061B.put(m3940z(m3941z("\u0004\u0002WLf\u001c\u001a")), Integer.valueOf(1));
        f2061B.put(m3940z(m3941z("\b\u0006OKn\u000b\u0011")), Integer.valueOf(2));
        f2061B.put(m3940z(m3941z("\b\u0006[Kr\u000f\u0011@")), Integer.valueOf(2));
        f2061B.put(m3940z(m3941z("\u0003\u0002KJ")), Integer.valueOf(3));
        f2061B.put(m3940z(m3941z("\u0003\u0002KZo")), Integer.valueOf(3));
        f2061B.put(m3940z(m3941z("\u000f\u0015KPk")), Integer.valueOf(4));
        f2061B.put(m3940z(m3941z("\u000f\u0013KPk")), Integer.valueOf(4));
        f2061B.put(m3940z(m3941z("\u0003\u0002P")), Integer.valueOf(5));
        f2061B.put(m3940z(m3941z("\u0003\u0002@")), Integer.valueOf(5));
        f2061B.put(m3940z(m3941z("\u0004\u0016PW")), Integer.valueOf(6));
        f2061B.put(m3940z(m3941z("\u0004\u0016W\\")), Integer.valueOf(6));
        f2061B.put(m3940z(m3941z("\u0004\u0016PUk\u000b\u0017")), Integer.valueOf(7));
        f2061B.put(m3940z(m3941z("\u0004\u0016U@")), Integer.valueOf(7));
        f2061B.put(m3940z(m3941z("\u000f\fLM")), Integer.valueOf(8));
        f2061B.put(m3940z(m3941z("\u000f\u0016^Lt\u001a")), Integer.valueOf(8));
        f2061B.put(m3940z(m3941z("\u001d\u0006IMb\u0003\u0001K\\")), Integer.valueOf(9));
        f2061B.put(m3940z(m3941z("\u001d\u0006IMb\u0003\u0001\\K")), Integer.valueOf(9));
        f2061B.put(m3940z(m3941z("\u0001\u0000MVe\u001c\u0006")), Integer.valueOf(10));
        f2061B.put(m3940z(m3941z("\u0001\u0000MVe\u000b\u0011")), Integer.valueOf(10));
        f2061B.put(m3940z(m3941z("\u0000\fO\\j\f\u0011\\")), Integer.valueOf(11));
        f2061B.put(m3940z(m3941z("\u0000\fO\\j\f\u0006K")), Integer.valueOf(11));
        f2061B.put(m3940z(m3941z("\n\u0006Z\\j\f\u0011\\")), Integer.valueOf(12));
        f2061B.put(m3940z(m3941z("\n\u0006Z\\j\f\u0006K")), Integer.valueOf(12));
        f2089v.put(m3940z(m3941z("\n\nTXi\r\u000b\\")), Integer.valueOf(1));
        f2089v.put(m3940z(m3941z("\u001d\u0016W]f\u0017")), Integer.valueOf(1));
        f2089v.put(m3940z(m3941z("\u0002\u0016W]n")), Integer.valueOf(2));
        f2089v.put(m3940z(m3941z("\u0003\fW]f\u0017")), Integer.valueOf(2));
        f2089v.put(m3940z(m3941z("\u0003\u0002K]n")), Integer.valueOf(3));
        f2089v.put(m3940z(m3941z("\u001a\u0016\\Jc\u000f\u001a")), Integer.valueOf(3));
        f2089v.put(m3940z(m3941z("\u0003\u0006KZu\u000b\u0007P")), Integer.valueOf(4));
        f2089v.put(m3940z(m3941z("\u0019\u0006]Wb\u001d\u0007X@")), Integer.valueOf(4));
        f2089v.put(m3940z(m3941z("\u0004\u0006L]n")), Integer.valueOf(5));
        f2089v.put(m3940z(m3941z("\u001a\u000bLKt\n\u0002@")), Integer.valueOf(5));
        f2089v.put(m3940z(m3941z("\u0018\u0006W]u\u000b\u0007P")), Integer.valueOf(6));
        f2089v.put(m3940z(m3941z("\b\u0011P]f\u0017")), Integer.valueOf(6));
        f2089v.put(m3940z(m3941z("\u001d\u0002T\\c\u0007")), Integer.valueOf(7));
        f2089v.put(m3940z(m3941z("\u001d\u0002MLu\n\u0002@")), Integer.valueOf(7));
    }

    /* renamed from: a */
    public static final int m3896a() {
        return new WDDate().m2529p();
    }

    /* renamed from: a */
    public static final int m3897a(WDDate wDDate, WDDate wDDate2) {
        return wDDate2.getInt() - wDDate.getInt();
    }

    /* renamed from: a */
    public static int m3898a(WDHeure wDHeure, WDHeure wDHeure2) {
        return wDHeure2.getValeur().getInt() - wDHeure.getValeur().getInt();
    }

    /* renamed from: a */
    public static final long m3899a(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return ((long) (instance.get(15) + instance.get(16))) + j;
    }

    /* renamed from: a */
    public static final long m3900a(long j, TimeZone timeZone) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance(timeZone);
        instance2.setTimeInMillis(j);
        return ((long) ((instance.get(15) + instance.get(16)) - (instance2.get(15) + instance2.get(16)))) + j;
    }

    /* renamed from: a */
    public static final WDDate m3901a(int i, int i2) {
        if (i2 < 1 || i2 > 12) {
            WDErreurManager.m2883a(C0745b.m3222b(f2067H[268], new String[0]));
        }
        WDDate wDDate = (WDDate) C0611a.m2309c(24);
        wDDate.setAnnee(i);
        wDDate.setMois(i2);
        wDDate.setJour(31);
        return wDDate;
    }

    /* renamed from: a */
    public static final WDDate m3902a(int i, int i2, boolean z) {
        int i3 = 1;
        Calendar instance = Calendar.getInstance();
        instance.set(1, i2);
        instance.set(6, 1);
        int i4 = instance.get(7);
        if (i4 != 2) {
            switch (i4) {
                case 1:
                    break;
                case 3:
                    if (!z) {
                        i3 = 6;
                        break;
                    }
                    i3 = -1;
                    break;
                case 4:
                    if (!z) {
                        i3 = 5;
                        break;
                    }
                    i3 = -2;
                    break;
                case 5:
                    if (!z) {
                        i3 = 4;
                        break;
                    }
                    i3 = -3;
                    break;
                case 6:
                    i3 = 3;
                    break;
                case 7:
                    i3 = 2;
                    break;
            }
        }
        i3 = 0;
        instance.add(6, i3 + ((i - 1) * 7));
        return (WDDate) C0611a.m2295a(24, C0725i.m3070e(instance.getTime()));
    }

    /* renamed from: a */
    public static final String m3903a(int i) {
        String c = m3922c(i);
        return c.length() > 3 ? c.substring(0, 3) + "." : c;
    }

    /* renamed from: a */
    public static final String m3904a(WDDate wDDate, String str) {
        wDDate.m2513a(true);
        StringBuffer stringBuffer = new StringBuffer("");
        if (str.equals(f2067H[8])) {
            str = WDProjet.getInstance().getFormatMasqueDate();
        }
        String toUpperCase = str.toUpperCase();
        char[] cArr = new char[4];
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = toUpperCase.charAt(i);
            switch (charAt) {
                case 'A':
                case 'Y':
                    Arrays.fill(cArr, charAt);
                    if (toUpperCase.indexOf(new String(cArr, 0, 4), i) != i) {
                        if (toUpperCase.indexOf(new String(cArr, 0, 2), i) != i) {
                            stringBuffer.append(str.charAt(i));
                            i++;
                            break;
                        }
                        stringBuffer.append(wDDate.m2528n().substring(2, 4));
                        i += 2;
                        break;
                    }
                    stringBuffer.append(wDDate.m2528n());
                    i += 4;
                    break;
                case 'D':
                case 'J':
                    Arrays.fill(cArr, charAt);
                    String d;
                    String substring;
                    if (toUpperCase.indexOf(new String(cArr, 0, 4), i) != i) {
                        if (toUpperCase.indexOf(new String(cArr, 0, 3), i) != i) {
                            if (toUpperCase.indexOf(new String(cArr, 0, 2), i) != i) {
                                if (str.indexOf(new String(cArr, 0, 1), i) != i) {
                                    stringBuffer.append(str.charAt(i));
                                    i++;
                                    break;
                                }
                                stringBuffer.append(wDDate.m2531r());
                                i++;
                                break;
                            }
                            stringBuffer.append(wDDate.m2526l());
                            i += 2;
                            break;
                        }
                        d = wDDate.m2517d();
                        substring = str.substring(i, i + 3);
                        if (substring.equals(f2067H[34]) || substring.equals(f2067H[29])) {
                            stringBuffer.append(C0808l.m4062t(d));
                        } else if (substring.equals(f2067H[30]) || substring.equals(f2067H[33])) {
                            stringBuffer.append(d.toUpperCase());
                        } else {
                            stringBuffer.append(d);
                        }
                        i += 3;
                        break;
                    }
                    d = wDDate.m2532s();
                    substring = str.substring(i, i + 4);
                    if (substring.equals(f2067H[28]) || substring.equals(f2067H[25])) {
                        stringBuffer.append(C0808l.m4062t(d));
                    } else if (substring.equals(f2067H[24]) || substring.equals(f2067H[26])) {
                        stringBuffer.append(d.toUpperCase());
                    } else {
                        stringBuffer.append(d);
                    }
                    i += 4;
                    break;
                    break;
                case 'L':
                    if (str.charAt(i) == charAt) {
                        stringBuffer.append(m3930e(wDDate.m2521g()).toUpperCase());
                    } else {
                        stringBuffer.append(str.charAt(i));
                    }
                    i++;
                    break;
                case 'M':
                    if (str.indexOf(f2067H[31], i) != i) {
                        if (str.indexOf(f2067H[22], i) != i) {
                            if (toUpperCase.indexOf(f2067H[21], i) != i) {
                                if (str.indexOf(f2067H[23], i) != i) {
                                    if (str.indexOf(f2067H[27], i) != i) {
                                        if (toUpperCase.indexOf(f2067H[32], i) != i) {
                                            if (toUpperCase.indexOf(f2067H[5], i) != i) {
                                                if (str.indexOf("M", i) != i) {
                                                    stringBuffer.append(str.charAt(i));
                                                    i++;
                                                    break;
                                                }
                                                stringBuffer.append(wDDate.m2529p());
                                                i++;
                                                break;
                                            }
                                            stringBuffer.append(wDDate.m2535x());
                                            i += 2;
                                            break;
                                        }
                                        stringBuffer.append(wDDate.m2534u());
                                        i += 3;
                                        break;
                                    }
                                    stringBuffer.append(wDDate.m2534u().toUpperCase());
                                    i += 3;
                                    break;
                                }
                                stringBuffer.append(C0808l.m4062t(wDDate.m2534u()));
                                i += 3;
                                break;
                            }
                            stringBuffer.append(wDDate.m2522h());
                            i += 4;
                            break;
                        }
                        stringBuffer.append(wDDate.m2522h().toUpperCase());
                        i += 4;
                        break;
                    }
                    stringBuffer.append(C0808l.m4062t(wDDate.m2522h()));
                    i += 4;
                    break;
                default:
                    stringBuffer.append(str.charAt(i));
                    i++;
                    break;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m3905a(WDDateHeure wDDateHeure, WDDateHeure wDDateHeure2) {
        WDDuree wDDuree = new WDDuree(wDDateHeure2.m2339G() - wDDateHeure.m2339G());
        StringBuffer stringBuffer = new StringBuffer(16);
        int i = 1;
        if (wDDuree.m2403d()) {
            i = -1;
            stringBuffer.append('-');
        } else {
            stringBuffer.append('+');
        }
        stringBuffer.append(C0725i.m3024a(wDDuree.m2408h() * i, 7));
        stringBuffer.append(C0725i.m3024a(wDDuree.m2404e() * i, 2));
        stringBuffer.append(C0725i.m3024a(wDDuree.m2409i() * i, 2));
        stringBuffer.append(C0725i.m3024a(wDDuree.m2402c() * i, 2));
        stringBuffer.append(C0725i.m3024a(i * wDDuree.m2410j(), 2));
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static final String m3906a(WDDateHeure wDDateHeure, String str) {
        boolean equals = str.equals(f2067H[8]);
        if (!equals) {
            str = C0808l.m4018a(str, "m", C0607n.Xh);
        }
        String a = m3904a(wDDateHeure.getPartieDate(), str);
        if (!equals) {
            a = C0808l.m4018a(a, C0607n.Xh, "m");
        }
        return m3908a(wDDateHeure.getPartieHeure(), a);
    }

    /* renamed from: a */
    public static final String m3907a(WDDuree wDDuree, String str) {
        StringBuffer stringBuffer = new StringBuffer("");
        int i = 1;
        if (wDDuree.m2403d()) {
            i = -1;
        }
        int i2 = 0;
        int i3 = 0;
        Object obj = null;
        Object obj2 = null;
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(str);
        char first = stringCharacterIterator.first();
        for (int index = stringCharacterIterator.getIndex(); index < stringCharacterIterator.getEndIndex(); index = stringCharacterIterator.getIndex()) {
            int i4;
            int e;
            switch (first) {
                case '+':
                    if (i < 0) {
                        stringBuffer.append('-');
                    }
                    i4 = index + 1;
                    index = 0;
                    while (i4 + index < str.length() && Character.isDigit(str.charAt(i4 + index))) {
                        index++;
                        stringCharacterIterator.next();
                    }
                    if (index > 0) {
                        i2 = C0725i.m3064d(str.substring(i4, index + i4));
                    }
                    first = stringCharacterIterator.next();
                    break;
                case 'H':
                    if (str.indexOf(f2067H[0], index) != index) {
                        if (obj2 == null) {
                            stringBuffer.append(first);
                        }
                        first = stringCharacterIterator.next();
                        break;
                    }
                    e = (obj != null || wDDuree.m2408h() == 0) ? wDDuree.m2404e() * i : ((int) wDDuree.m2400a(C0782g.HOUR)) * i;
                    if (i2 > 0 && i3 <= i2) {
                        if (e != 0 || i3 > 0) {
                            i3++;
                            obj2 = i3 > i2 ? 1 : null;
                        } else {
                            obj2 = 1;
                        }
                    }
                    if (obj2 == null) {
                        stringBuffer.append(C0725i.m3024a(e, 2));
                    }
                    first = stringCharacterIterator.setIndex(index + 2);
                    break;
                    break;
                case 'J':
                    obj = 1;
                    i4 = wDDuree.m2408h() * i;
                    if (i2 > 0 && i3 <= i2) {
                        if (i4 != 0 || i3 > 0) {
                            i3++;
                            obj2 = i3 > i2 ? 1 : null;
                        } else {
                            obj2 = 1;
                        }
                    }
                    if (obj2 == null) {
                        stringBuffer.append(i4);
                    }
                    first = stringCharacterIterator.next();
                    break;
                case 'L':
                    if (str.indexOf(f2067H[269], index) != index) {
                        if (str.indexOf(f2067H[C0607n.al], index) != index) {
                            if (obj2 == null) {
                                stringBuffer.append(String.valueOf(wDDuree.m2405f() * i));
                            }
                            first = stringCharacterIterator.next();
                            break;
                        }
                        e = wDDuree.m2406g() * i;
                        if (i2 > 0 && i3 <= i2) {
                            if (e != 0 || i3 > 0) {
                                i3++;
                                obj2 = i3 > i2 ? 1 : null;
                            } else {
                                obj2 = 1;
                            }
                        }
                        if (obj2 == null) {
                            stringBuffer.append(C0725i.m3024a(e, 2));
                        }
                        first = stringCharacterIterator.setIndex(index + 2);
                        break;
                    }
                    e = wDDuree.m2406g() * i;
                    if (i2 > 0 && i3 <= i2) {
                        if (e != 0 || i3 > 0) {
                            i3++;
                            obj2 = i3 > i2 ? 1 : null;
                        } else {
                            obj2 = 1;
                        }
                    }
                    if (obj2 == null) {
                        stringBuffer.append(C0725i.m3024a(e, 3));
                    }
                    first = stringCharacterIterator.setIndex(index + 3);
                    break;
                    break;
                case 'M':
                    if (str.indexOf(f2067H[5], index) != index) {
                        if (obj2 == null) {
                            stringBuffer.append(first);
                        }
                        first = stringCharacterIterator.next();
                        break;
                    }
                    e = wDDuree.m2409i() * i;
                    if (i2 > 0 && i3 <= i2) {
                        if (e != 0 || i3 > 0) {
                            i3++;
                            obj2 = i3 > i2 ? 1 : null;
                        } else {
                            obj2 = 1;
                        }
                    }
                    if (obj2 == null) {
                        stringBuffer.append(C0725i.m3024a(e, 2));
                    }
                    first = stringCharacterIterator.setIndex(index + 2);
                    break;
                case 'S':
                    if (str.indexOf(f2067H[7], index) != index) {
                        if (obj2 == null) {
                            stringBuffer.append(first);
                        }
                        first = stringCharacterIterator.next();
                        break;
                    }
                    e = wDDuree.m2402c() * i;
                    if (i2 > 0 && i3 <= i2) {
                        if (e != 0 || i3 > 0) {
                            i3++;
                            obj2 = i3 > i2 ? 1 : null;
                        } else {
                            obj2 = 1;
                        }
                    }
                    if (obj2 == null) {
                        stringBuffer.append(C0725i.m3024a(e, 2));
                    }
                    first = stringCharacterIterator.setIndex(index + 2);
                    break;
                default:
                    if (obj2 == null) {
                        stringBuffer.append(first);
                    }
                    first = stringCharacterIterator.next();
                    break;
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static final String m3908a(WDHeure wDHeure, String str) {
        int min = Math.min(wDHeure.m2482m().length(), 2);
        if (str == null || str.equals("")) {
            return "";
        }
        int i;
        if (str.equals(f2067H[8])) {
            str = WDProjet.getInstance().getFormatMasqueHeure();
        }
        int f = wDHeure.m2473f();
        String str2 = f2067H[4];
        if (str.toUpperCase().indexOf(f2067H[6]) >= 0) {
            String str3;
            String str4;
            if (f >= 12) {
                str2 = f2067H[3];
                if (f > 12) {
                    f -= 12;
                }
                str4 = str2;
                i = f;
                str3 = str4;
            } else if (f == 0) {
                str3 = str2;
                i = 12;
            } else {
                str4 = str2;
                i = f;
                str3 = str4;
            }
            str = C0808l.m4019a(str, f2067H[6], str3, 16);
        } else {
            i = f;
        }
        return C0808l.m4019a(C0808l.m4019a(C0808l.m4019a(C0808l.m4019a(C0808l.m4019a(str, f2067H[0], C0725i.m3024a(i, 2), 16), f2067H[1], C0725i.m3024a(i, 1) + ":", 16), f2067H[5], wDHeure.m2485o(), 16), f2067H[7], wDHeure.m2472e(), 16), f2067H[2], wDHeure.m2482m().substring(0, min), 16);
    }

    /* renamed from: a */
    public static final String m3909a(String str, String str2, String str3) {
        int lastIndexOf = str2.lastIndexOf(str3);
        if (lastIndexOf == -1) {
            return "";
        }
        String str4 = "";
        if (lastIndexOf < str.length()) {
            str4 = str3.length() + lastIndexOf < str.length() ? str.substring(lastIndexOf, str3.length() + lastIndexOf) : str.substring(lastIndexOf, str.length());
        }
        return (str3.compareTo(f2067H[38]) == 0 || str3.compareTo(f2067H[35]) == 0) ? C0725i.m3064d(str4) <= 50 ? f2067H[36] + str4 : f2067H[37] + str4 : str4;
    }

    /* renamed from: a */
    public static final TimeZone m3910a(String str) {
        if (str == null) {
            return null;
        }
        String stringBuffer;
        String trim = str.trim();
        int indexOf = trim.toUpperCase().indexOf(f2067H[46]);
        if (indexOf != -1) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(trim.substring(0, indexOf));
            stringBuffer2.append(f2067H[45]);
            stringBuffer2.append(trim.substring(indexOf + f2067H[46].length(), trim.length()));
            stringBuffer = stringBuffer2.toString();
        } else {
            stringBuffer = trim;
        }
        trim = (String) m3923c().get(stringBuffer);
        if (trim == null) {
            trim = stringBuffer;
        }
        return TimeZone.getTimeZone(trim);
    }

    /* renamed from: a */
    public static final boolean m3911a(WDDate wDDate) {
        return wDDate.getString().length() != 8 ? false : wDDate.m2520f();
    }

    /* renamed from: b */
    public static final long m3912b(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return j - ((long) (instance.get(15) + instance.get(16)));
    }

    /* renamed from: b */
    public static final long m3913b(long j, TimeZone timeZone) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance(timeZone);
        instance2.setTimeInMillis(j);
        return j - ((long) ((instance.get(15) + instance.get(16)) - (instance2.get(15) + instance2.get(16))));
    }

    /* renamed from: b */
    public static final WDDate m3914b(int i, int i2) {
        if (i2 < 1 || i2 > 12) {
            WDErreurManager.m2883a(C0745b.m3222b(f2067H[268], new String[0]));
        }
        WDDate wDDate = (WDDate) C0611a.m2309c(24);
        wDDate.setAnnee(i);
        wDDate.setMois(i2);
        wDDate.setJour(1);
        return wDDate;
    }

    /* renamed from: b */
    public static final WDDate m3915b(WDDate wDDate) {
        WDDate wDDate2 = !wDDate.isVariableInterne() ? (WDDate) wDDate.getClone() : wDDate;
        wDDate2.opDecProp(EWDPropriete.PROP_JOUR, new WDEntier4(wDDate2.m2521g() - 1));
        return wDDate2;
    }

    /* renamed from: b */
    public static final String m3916b() {
        return C0725i.m3032a(new Date());
    }

    /* renamed from: b */
    public static final String m3917b(WDDate wDDate, WDDate wDDate2) {
        if (!wDDate.m2520f() || !wDDate2.m2520f()) {
            return "";
        }
        if (wDDate2.opInf(wDDate)) {
            return "";
        }
        int p;
        int i;
        int q = wDDate2.m2530q() - wDDate.m2530q();
        if (wDDate2.m2529p() >= wDDate.m2529p()) {
            p = wDDate2.m2529p() - wDDate.m2529p();
        } else {
            q--;
            p = (12 - wDDate.m2529p()) + wDDate2.m2529p();
        }
        if (wDDate2.m2531r() >= wDDate.m2531r()) {
            i = q;
            q = p;
            p = wDDate2.m2531r() - wDDate.m2531r();
        } else {
            i = wDDate2.m2529p() - 1;
            if (i == 0) {
                i = 12;
            }
            int[] iArr = f2064E;
            if (wDDate2.m2527m()) {
                iArr[1] = 29;
            }
            i = (iArr[i - 1] - wDDate.m2531r()) + wDDate2.m2531r();
            int i2;
            if (p != 0) {
                i2 = i;
                i = q;
                q = p - 1;
                p = i2;
            } else {
                i2 = i;
                i = q - 1;
                q = 11;
                p = i2;
            }
        }
        if (i > 9999 || q >= 12 || p >= 31) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(8);
        stringBuffer.append(C0725i.m3024a(i, 4));
        stringBuffer.append(C0725i.m3024a(q, 2));
        stringBuffer.append(C0725i.m3024a(p, 2));
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static final boolean m3918b(String str) {
        return ((str.lastIndexOf(f2067H[43]) != -1 || str.matches(f2067H[44]) || str.lastIndexOf(f2067H[41]) != -1 || str.matches(f2067H[42])) && str.indexOf(f2067H[5]) != -1) ? (str.indexOf(f2067H[40]) == -1 && str.indexOf(f2067H[39]) == -1) ? false : true : false;
    }

    /* renamed from: b */
    private static short[] m3919b(int i) {
        if (i <= 1583 || i > 9999) {
            return null;
        }
        int i2 = (i % 19) + 1;
        int i3 = (i / 100) + 1;
        int i4 = ((i3 * 3) / 4) - 12;
        int i5 = (((i * 5) / 4) - i4) - 10;
        i3 = ((((((i3 * 8) + 5) / 25) - 5) + ((i2 * 11) + 20)) - i4) % 30;
        if ((i3 == 25 && i2 > 11) || i3 == 24) {
            i3++;
        }
        i3 = 44 - i3;
        if (i3 < 21) {
            i3 += 30;
        }
        i2 = (i3 + 7) - ((i3 + i5) % 7);
        if (i2 > 31) {
            i3 = 4;
            i2 -= 31;
        } else {
            i3 = 3;
        }
        return new short[]{(short) i, (short) i3, (short) i2};
    }

    /* renamed from: c */
    public static final int m3920c(String str) {
        Integer num = (Integer) f2089v.get(str.toUpperCase());
        return num == null ? -1 : num.intValue();
    }

    /* renamed from: c */
    public static final WDDate m3921c(WDDate wDDate) {
        WDDate wDDate2 = !wDDate.isVariableInterne() ? (WDDate) wDDate.getClone() : wDDate;
        wDDate2.setJour(1);
        return wDDate2;
    }

    /* renamed from: c */
    public static final String m3922c(int i) {
        String jourSemaine = WDProjet.getInstance().getJourSemaine();
        String[] b = jourSemaine != null ? C0808l.m4040b(jourSemaine) : null;
        switch (i) {
            case 1:
                return (b == null || b.length < 1) ? C0745b.m3224c(f2067H[277], new String[0]) : b[0];
            case 2:
                return (b == null || b.length < 2) ? C0745b.m3224c(f2067H[C0607n.Hw], new String[0]) : b[1];
            case 3:
                return (b == null || b.length < 3) ? C0745b.m3224c(f2067H[276], new String[0]) : b[2];
            case 4:
                return (b == null || b.length < 4) ? C0745b.m3224c(f2067H[C0607n.wf], new String[0]) : b[3];
            case 5:
                return (b == null || b.length < 5) ? C0745b.m3224c(f2067H[C0607n.vk], new String[0]) : b[4];
            case 6:
                return (b == null || b.length < 6) ? C0745b.m3224c(f2067H[C0607n.hp], new String[0]) : b[5];
            case 7:
                return (b == null || b.length < 7) ? C0745b.m3224c(f2067H[271], new String[0]) : b[6];
            default:
                return "";
        }
    }

    /* renamed from: c */
    private static HashMap<String, String> m3923c() {
        if (f2085r == null) {
            f2085r = new HashMap(C0607n.hu);
            f2085r.put(f2067H[90], f2067H[128]);
            f2085r.put(f2067H[262], f2067H[128]);
            f2085r.put(f2067H[C0607n.Xn], f2067H[C0542t.f1193i]);
            f2085r.put(f2067H[190], f2067H[57]);
            f2085r.put(f2067H[C0607n.Dt], f2067H[57]);
            f2085r.put(f2067H[C0607n.f1465w], f2067H[57]);
            f2085r.put(f2067H[123], f2067H[C0607n.hu]);
            f2085r.put(f2067H[C0536n.f995G], f2067H[226]);
            f2085r.put(f2067H[114], f2067H[226]);
            f2085r.put(f2067H[188], f2067H[C0607n.me]);
            f2085r.put(f2067H[171], f2067H[C0607n.me]);
            f2085r.put(f2067H[99], f2067H[C0607n.me]);
            f2085r.put(f2067H[119], f2067H[C0607n.me]);
            f2085r.put(f2067H[265], f2067H[106]);
            f2085r.put(f2067H[136], f2067H[106]);
            f2085r.put(f2067H[84], f2067H[121]);
            f2085r.put(f2067H[214], f2067H[121]);
            f2085r.put(f2067H[52], f2067H[C0607n.Tv]);
            f2085r.put(f2067H[252], f2067H[70]);
            f2085r.put(f2067H[240], f2067H[70]);
            f2085r.put(f2067H[225], f2067H[121]);
            f2085r.put(f2067H[174], f2067H[121]);
            f2085r.put(f2067H[108], f2067H[258]);
            f2085r.put(f2067H[50], f2067H[258]);
            f2085r.put(f2067H[C0607n.no], f2067H[138]);
            f2085r.put(f2067H[223], f2067H[138]);
            f2085r.put(f2067H[85], f2067H[147]);
            f2085r.put(f2067H[238], f2067H[147]);
            f2085r.put(f2067H[64], f2067H[81]);
            f2085r.put(f2067H[218], f2067H[133]);
            f2085r.put(f2067H[151], f2067H[213]);
            f2085r.put(f2067H[125], f2067H[213]);
            f2085r.put(f2067H[C0607n.Wj], f2067H[C0607n.Gk]);
            f2085r.put(f2067H[63], f2067H[C0607n.Gk]);
            f2085r.put(f2067H[100], f2067H[C0607n.Gk]);
            f2085r.put(f2067H[80], f2067H[73]);
            f2085r.put(f2067H[117], f2067H[73]);
            f2085r.put(f2067H[C0607n.Ug], f2067H[49]);
            f2085r.put(f2067H[104], f2067H[49]);
            f2085r.put(f2067H[227], f2067H[181]);
            f2085r.put(f2067H[68], f2067H[181]);
            f2085r.put(f2067H[157], f2067H[56]);
            f2085r.put(f2067H[263], f2067H[56]);
            f2085r.put(f2067H[199], f2067H[C0607n.pw]);
            f2085r.put(f2067H[C0607n.qj], f2067H[C0607n.pw]);
            f2085r.put(f2067H[102], f2067H[C0607n.co]);
            f2085r.put(f2067H[C0607n.Nr], f2067H[261]);
            f2085r.put(f2067H[155], f2067H[261]);
            f2085r.put(f2067H[C0607n.yk], f2067H[C0607n.Hn]);
            f2085r.put(f2067H[148], f2067H[C0607n.Hn]);
            f2085r.put(f2067H[83], f2067H[C0607n.Hn]);
            f2085r.put(f2067H[C0607n.Ao], f2067H[C0607n.Hn]);
            f2085r.put(f2067H[C0607n.Ep], f2067H[193]);
            f2085r.put(f2067H[C0607n.Cv], f2067H[193]);
            f2085r.put(f2067H[C0607n.oq], f2067H[103]);
            f2085r.put(f2067H[74], f2067H[103]);
            f2085r.put(f2067H[C0536n.f1002n], f2067H[260]);
            f2085r.put(f2067H[231], f2067H[235]);
            f2085r.put(f2067H[192], f2067H[235]);
            f2085r.put(f2067H[95], f2067H[260]);
            f2085r.put(f2067H[184], f2067H[260]);
            f2085r.put(f2067H[86], f2067H[254]);
            f2085r.put(f2067H[C0536n.f1006y], f2067H[254]);
            f2085r.put(f2067H[65], f2067H[C0607n.kh]);
            f2085r.put(f2067H[153], f2067H[C0607n.kh]);
            f2085r.put(f2067H[C0607n.bx], f2067H[111]);
            f2085r.put(f2067H[87], f2067H[111]);
            f2085r.put(f2067H[122], f2067H[105]);
            f2085r.put(f2067H[139], f2067H[105]);
            f2085r.put(f2067H[236], f2067H[89]);
            f2085r.put(f2067H[242], f2067H[89]);
            f2085r.put(f2067H[169], f2067H[172]);
            f2085r.put(f2067H[191], f2067H[259]);
            f2085r.put(f2067H[48], f2067H[259]);
            f2085r.put(f2067H[61], f2067H[C0607n.Qt]);
            f2085r.put(f2067H[59], f2067H[259]);
            f2085r.put(f2067H[145], f2067H[259]);
            f2085r.put(f2067H[C0607n.Au], f2067H[251]);
            f2085r.put(f2067H[152], f2067H[51]);
            f2085r.put(f2067H[118], f2067H[51]);
            f2085r.put(f2067H[96], f2067H[116]);
            f2085r.put(f2067H[224], f2067H[116]);
            f2085r.put(f2067H[183], f2067H[216]);
            f2085r.put(f2067H[62], f2067H[216]);
            f2085r.put(f2067H[53], f2067H[131]);
            f2085r.put(f2067H[C0607n.Yw], f2067H[131]);
            f2085r.put(f2067H[C0607n.lh], f2067H[247]);
            f2085r.put(f2067H[253], f2067H[247]);
            f2085r.put(f2067H[66], f2067H[C0538a.tb]);
            f2085r.put(f2067H[91], f2067H[C0538a.tb]);
            f2085r.put(f2067H[185], f2067H[130]);
            f2085r.put(f2067H[110], f2067H[130]);
            f2085r.put(f2067H[182], f2067H[166]);
            f2085r.put(f2067H[245], f2067H[166]);
            f2085r.put(f2067H[C0607n.aw], f2067H[78]);
            f2085r.put(f2067H[72], f2067H[78]);
            f2085r.put(f2067H[156], f2067H[160]);
            f2085r.put(f2067H[113], f2067H[160]);
            f2085r.put(f2067H[C0607n.Bf], f2067H[98]);
            f2085r.put(f2067H[88], f2067H[98]);
            f2085r.put(f2067H[60], f2067H[160]);
            f2085r.put(f2067H[255], f2067H[58]);
            f2085r.put(f2067H[67], f2067H[58]);
            f2085r.put(f2067H[126], f2067H[107]);
            f2085r.put(f2067H[InputDeviceCompat.SOURCE_KEYBOARD], f2067H[107]);
            f2085r.put(f2067H[93], f2067H[233]);
            f2085r.put(f2067H[217], f2067H[233]);
            f2085r.put(f2067H[82], f2067H[215]);
            f2085r.put(f2067H[101], f2067H[215]);
            f2085r.put(f2067H[C0607n.Fn], f2067H[115]);
            f2085r.put(f2067H[232], f2067H[115]);
            f2085r.put(f2067H[164], f2067H[C0607n.nn]);
            f2085r.put(f2067H[55], f2067H[C0607n.nn]);
            f2085r.put(f2067H[228], f2067H[C0607n.Bs]);
            f2085r.put(f2067H[256], f2067H[C0607n.Bs]);
            f2085r.put(f2067H[189], f2067H[C0607n.Jn]);
            f2085r.put(f2067H[167], f2067H[154]);
            f2085r.put(f2067H[219], f2067H[154]);
            f2085r.put(f2067H[54], f2067H[79]);
            f2085r.put(f2067H[187], f2067H[79]);
            f2085r.put(f2067H[C0607n.Eg], f2067H[47]);
            f2085r.put(f2067H[C0607n.af], f2067H[47]);
            f2085r.put(f2067H[71], f2067H[137]);
            f2085r.put(f2067H[249], f2067H[137]);
            f2085r.put(f2067H[C0607n.f1441Y], f2067H[92]);
            f2085r.put(f2067H[109], f2067H[92]);
            f2085r.put(f2067H[C0607n.Uk], f2067H[146]);
            f2085r.put(f2067H[C0538a.Lb], f2067H[146]);
            f2085r.put(f2067H[149], f2067H[112]);
            f2085r.put(f2067H[204], f2067H[112]);
            f2085r.put(f2067H[C0607n.Ux], f2067H[77]);
            f2085r.put(f2067H[173], f2067H[77]);
            f2085r.put(f2067H[159], f2067H[246]);
            f2085r.put(f2067H[248], f2067H[246]);
            f2085r.put(f2067H[C0607n.bh], f2067H[180]);
            f2085r.put(f2067H[C0607n.jk], f2067H[180]);
            f2085r.put(f2067H[94], f2067H[C0607n.uw]);
            f2085r.put(f2067H[C0607n.Gu], f2067H[76]);
            f2085r.put(f2067H[165], f2067H[76]);
            f2085r.put(f2067H[158], f2067H[97]);
            f2085r.put(f2067H[C0607n.Cw], f2067H[97]);
            f2085r.put(f2067H[75], f2067H[C0607n.yt]);
            f2085r.put(f2067H[C0538a.Nb], f2067H[143]);
            f2085r.put(f2067H[C0607n.Fb], f2067H[143]);
            f2085r.put(f2067H[69], f2067H[168]);
            f2085r.put(f2067H[141], f2067H[168]);
            f2085r.put(f2067H[153], f2067H[65]);
            f2085r.put(f2067H[C0607n.Px], f2067H[65]);
            f2085r.put(f2067H[C0607n.Ru], f2067H[65]);
        }
        return f2085r;
    }

    /* renamed from: d */
    public static final int m3924d(int i) {
        switch (i) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 1;
        }
    }

    /* renamed from: d */
    public static final int m3925d(String str) {
        Integer num = (Integer) f2061B.get(str.toUpperCase());
        return num == null ? -1 : num.intValue();
    }

    /* renamed from: d */
    public static final WDDate m3926d(WDDate wDDate) {
        WDDate wDDate2 = !wDDate.isVariableInterne() ? (WDDate) wDDate.getClone() : wDDate;
        wDDate2.setJour(1);
        wDDate2.setMois(1);
        return wDDate2;
    }

    /* renamed from: d */
    public static final String m3927d() {
        return C0725i.m3070e(new Date());
    }

    /* renamed from: e */
    public static final int m3928e() {
        return new WDDate().m2530q();
    }

    /* renamed from: e */
    public static final WDDate m3929e(WDDate wDDate) {
        WDDate wDDate2 = !wDDate.isVariableInterne() ? (WDDate) wDDate.getClone() : wDDate;
        wDDate2.setJour(31);
        return wDDate2;
    }

    /* renamed from: e */
    public static final String m3930e(int i) {
        String c = m3922c(i);
        return c.length() > 1 ? c.substring(0, 1) : c;
    }

    /* renamed from: f */
    public static final int m3931f(int i) {
        return i + 1;
    }

    /* renamed from: f */
    public static final WDDate m3932f(WDDate wDDate) {
        WDDate wDDate2 = !wDDate.isVariableInterne() ? (WDDate) wDDate.getClone() : wDDate;
        wDDate2.opIncProp(EWDPropriete.PROP_JOUR, new WDEntier4(7 - wDDate2.m2521g()));
        return wDDate2;
    }

    /* renamed from: f */
    public static final String m3933f() {
        return C0725i.m3051b(new Date()).substring(0, 8);
    }

    /* renamed from: g */
    public static final String m3934g(int i) {
        String moisAnnee = WDProjet.getInstance().getMoisAnnee();
        String[] b = moisAnnee != null ? C0808l.m4040b(moisAnnee) : null;
        switch (i) {
            case 1:
                return (b == null || b.length < 1) ? C0745b.m3224c(f2067H[11], new String[0]) : b[0];
            case 2:
                return (b == null || b.length < 2) ? C0745b.m3224c(f2067H[12], new String[0]) : b[1];
            case 3:
                return (b == null || b.length < 3) ? C0745b.m3224c(f2067H[10], new String[0]) : b[2];
            case 4:
                return (b == null || b.length < 4) ? C0745b.m3224c(f2067H[15], new String[0]) : b[3];
            case 5:
                return (b == null || b.length < 5) ? C0745b.m3224c(f2067H[18], new String[0]) : b[4];
            case 6:
                return (b == null || b.length < 6) ? C0745b.m3224c(f2067H[17], new String[0]) : b[5];
            case 7:
                return (b == null || b.length < 7) ? C0745b.m3224c(f2067H[16], new String[0]) : b[6];
            case 8:
                return (b == null || b.length < 8) ? C0745b.m3224c(f2067H[13], new String[0]) : b[7];
            case 9:
                return (b == null || b.length < 9) ? C0745b.m3224c(f2067H[19], new String[0]) : b[8];
            case 10:
                return (b == null || b.length < 10) ? C0745b.m3224c(f2067H[9], new String[0]) : b[9];
            case 11:
                return (b == null || b.length < 11) ? C0745b.m3224c(f2067H[14], new String[0]) : b[10];
            case 12:
                return (b == null || b.length < 12) ? C0745b.m3224c(f2067H[20], new String[0]) : b[11];
            default:
                return "";
        }
    }

    /* renamed from: h */
    public static String m3935h(int i) {
        short[] b = m3919b(i);
        if (b == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(8);
        stringBuffer.append(b[0]);
        stringBuffer.append(C0725i.m3024a(b[1], 2));
        stringBuffer.append(C0725i.m3024a(b[2], 2));
        return stringBuffer.toString();
    }

    /* renamed from: i */
    public static final byte m3936i(int i) {
        switch (i) {
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            case 7:
                return (byte) 6;
            default:
                return (byte) 7;
        }
    }

    /* renamed from: j */
    public static final int m3937j(int i) {
        return i - 1;
    }

    /* renamed from: k */
    public static final String m3938k(int i) {
        String g = m3934g(i);
        return (WDProjet.getInstance().getLangueCourante() == 5 && (i == 6 || i == 7)) ? g.length() > 4 ? g.substring(0, 4) + "." : g : g.length() > 3 ? g.substring(0, 3) + "." : g;
    }

    /* renamed from: l */
    public static final WDDate m3939l(int i) {
        WDDate wDDate = (WDDate) C0611a.m2309c(24);
        wDDate.setAnnee(i);
        wDDate.setMois(1);
        wDDate.setJour(1);
        return wDDate;
    }

    /* renamed from: z */
    private static String m3940z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 78;
                    break;
                case 1:
                    i2 = 67;
                    break;
                case 2:
                    i2 = 25;
                    break;
                case 3:
                    i2 = 25;
                    break;
                default:
                    i2 = 39;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m3941z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 39);
        }
        return toCharArray;
    }
}
