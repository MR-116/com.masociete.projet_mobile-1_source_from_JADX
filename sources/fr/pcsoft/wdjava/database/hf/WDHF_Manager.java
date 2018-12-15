package fr.pcsoft.wdjava.database.hf;

import android.support.v4.media.session.PlaybackStateCompat;
import fr.pcsoft.wdjava.core.C0486m;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.WDCallback;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0548s;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.collection.C0582d;
import fr.pcsoft.wdjava.core.types.collection.tableau.C0758k;
import fr.pcsoft.wdjava.core.types.database.C0776b;
import fr.pcsoft.wdjava.core.types.database.WDSourceDonnees;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.database.hf.p049c.C0832f;
import fr.pcsoft.wdjava.database.hf.p049c.C0841b;
import fr.pcsoft.wdjava.database.hf.p052d.C0847a;
import fr.pcsoft.wdjava.database.hf.requete.C0778b;
import fr.pcsoft.wdjava.file.C0897o;
import fr.pcsoft.wdjava.jni.WDJNIException;
import fr.pcsoft.wdjava.jni.WDJaugeJNI;
import fr.pcsoft.wdjava.p032m.C0938m;
import fr.pcsoft.wdjava.ui.dialogue.C1372f;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class WDHF_Manager implements C0542t {
    private static WDCallback Rd = null;
    private static WDCallback Sd = null;
    private static final String[] Td = new String[]{m5282z(m5283z("`aMh\u0000\u0016v@r\u0003\u001cvJx\u0017\nuJ\u001a\nj\\u\u000b\rqZ")), m5282z(m5283z("\u0006Gw_&c@z\u001a)\"\u0004y_7.AkO7&\u0004{Oe%HjBe'A?Vb\"J~V<0A1")), m5282z(m5283z("`aMh\u0000\u0016v@y\r\u0002vX\b\u0006jKe\u001d\u0007`")), m5282z(m5283z("\u0017AqN$7Mi_e'\u0003pO3&VkO7&\u0004{_e/\u0003~T$/]l_e\"HpH6cUj\u001d$6GjT cEq[):Wz\u001a+dAlNe\"WlU&*Íz\u001a$6\u0004oH*)Ak\u0014")), m5282z(m5283z("`bPt\u0006\u0017mPt\u001a\u000bb@o\u000b\nuJ\b\u0006jK")), m5282z(m5283z("\u0017]o_e'\u0003zH7&Qm\u001a+,J?]¬1Í?J$1\u0004s_e.Í|[+*Wr_e'A?N7\"Mk_(&Jk\u001a$6PpW$7MnO c@zIe&Vm_01W?r\u0003\u0010uS\u001a!6\u0004yH$.AhU7(")), m5282z(m5283z("\u0002Q|O+cGpT1&\\k_e-A?Y*1VzI5,J{\u001a¥cH8S!&JkS#*EqNe0TöY,%Mö\u0014")), m5282z(m5283z("\fTöH$7MpTe'A?N7\"Jl[&7MpTe-Kq\u001a7&GpT+6A1")), m5282z(m5283z("`aMh\u0000\u0016v@{\u0015\u0013aSe\b\u0006pWu\u0001\u0006{Q{\u0011\nrZ")), m5282z(m5283z("\u0014Mq~ 5lY\r")), m5282z(m5283z("`aMh\u0000\u0016v@r\u0003\u001ceSs\u0004\u0010{Vt\u0006\fjQo")), m5282z(m5283z("`aMh\u0000\u0016v@r\u0003\u001ct^i\u001a\njI{\t\n`Z")), m5282z(m5283z("`aMh\u0000\u0016v@r\u0003\u001ceJy\u0010\ra@{\u000b\u0002hFi\u0000")), m5282z(m5283z("`aMh\u0000\u0016v@r\u0003\u001cgPt\u000b\u0006|Vu\u000b\u001cmQy\n\rjJ")), m5282z(m5283z("`l@n\u0017\u0002jL{\u0006\u0017mPt\u001a\u000fmLn\u0000")), m5282z(m5283z("N.")), m5282z(m5283z("`aMh\u0000\u0016v@r\u0003\u001cvJx\u0017\nuJ\u001a\u000eaRu\u001a\u0001mQ{\f\u0011a")), m5282z(m5283z("`aMh\u0000\u0016v@r\u0003\u001cbVy\r\naMe\f\rgPt\u000b\u0016")), m5282z(m5283z("`aMh\u0000\u0016v@r\u0003\u001c`Zh\u000b\naMe\u0003\ngWs\u0000\u0011")), m5282z(m5283z("`aMh\u001a\rf@y\n\u000etPi\u0004\rpZ")), m5282z(m5283z("\u0014Mq^ 5wNv,7A")), m5282z(m5283z("\u0014Mq~ 5wNv,7A@{+'VpS!")), m5282z(m5283z("\u0011iV\u0007")), m5282z(m5283z("`gPt\u0016\u0017eQn\u0000\u001cmQy\n\u0011vZy\u0011\u0006")), m5282z(m5283z("\u0014Mq~ 5gsS -PL_75AjH\r\u0005")), m5282z(m5283z("`l@i\u0010\u0013tMs\b\u0006{Ku\u0010\u0017")), m5282z(m5283z("`vZy\n\rjZy\u0011\u0006v")), m5282z(m5283z("`a\\r\u0000\u0000{M\u0006\fjQ\u001d\nkQ")), m5282z(m5283z("`vZy\n\rjZb\f\fj@s\b\u0013kLi\f\u0001hZ")), m5282z(m5283z("`uJs\u0011\u0017aMe\u0004\u0013tSs\u0006\u0002pVu\u000b")), m5282z(m5283z("`iZi\u0016\u0002cZe\u0001\u0006gPt\u000b\u0006|Vu\u000b\u001ceQ~\u0017\fm[")), m5282z(m5283z("\u0006Vm_01\u0004{O7\"Jk\u001a)dAgN7\"GkS*-\u0004{Oe.ÍrUe'EqIe/A?\\, Lv_7c")), m5282z(m5283z("`aGn\u0017\u0002gKs\n\r{R\b\f{Vw\u0015\fwLs\u0007\u000fa")), m5282z(m5283z("`mRj\n\u0010wVx\t\u0006{\\h\u0000\u0006v@|\f\u0000lV\u0017")), m5282z(m5283z("`aMh\u0000\u0016v@r\u0003\u001ctPi\f\u0017mPt\u001a\njI{\t\n`Z"))};

    /* renamed from: a */
    public static final int m5049a(int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        C0860m d = instance.m5013d();
        if (d != null) {
            try {
                return d.m6077i();
            } catch (C0841b e) {
                throw e;
            }
        }
        if (instance.m5041v()) {
            C0832f c0832f = null;
            try {
                c0832f = instance.m5043x();
                return c0832f.mo2915d(i);
            } catch (Exception e2) {
                WDErreurManager.m2882a(e2);
            } catch (WDJNIException e3) {
                m5075a(e3, c0832f);
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static final int m5050a(int i, WDObjet wDObjet, WDObjet wDObjet2, int i2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        try {
            db d;
            eb a;
            C0832f x;
            int a2;
            instance.m5033n();
            if (wDObjet != null) {
                if (!wDObjet.getString().equals(C0607n.Vc)) {
                    d = m5183d(instance, wDObjet, false);
                    if (wDObjet2 != null) {
                        try {
                            if (!wDObjet2.getString().equals(C0607n.Vc)) {
                                a = m5059a(instance, wDObjet2, false);
                                x = instance.m5043x();
                                if (wDObjet == null) {
                                    try {
                                    } catch (C0841b e) {
                                        throw e;
                                    } catch (WDJNIException e2) {
                                        m5075a(e2, x);
                                        return 0;
                                    } catch (C0841b e3) {
                                        throw e3;
                                    } catch (Exception e4) {
                                        WDErreurManager.m2882a(e4);
                                        return 0;
                                    }
                                }
                                a2 = x.mo2772a(i, wDObjet == null ? 0 : d.m3717k(), wDObjet2 == null ? a.m5852i() : 0, i2);
                                if (a2 == 0) {
                                    m5074a(x);
                                }
                                return a2;
                            }
                        } catch (C0841b e5) {
                            throw e5;
                        }
                    }
                    a = null;
                    x = instance.m5043x();
                    if (wDObjet2 == null) {
                    }
                    a2 = x.mo2772a(i, wDObjet == null ? 0 : d.m3717k(), wDObjet2 == null ? a.m5852i() : 0, i2);
                    if (a2 == 0) {
                        m5074a(x);
                    }
                    return a2;
                }
            }
            d = null;
            if (wDObjet2 != null) {
                if (wDObjet2.getString().equals(C0607n.Vc)) {
                    a = m5059a(instance, wDObjet2, false);
                    x = instance.m5043x();
                    if (wDObjet == null) {
                    }
                    if (wDObjet2 == null) {
                    }
                    a2 = x.mo2772a(i, wDObjet == null ? 0 : d.m3717k(), wDObjet2 == null ? a.m5852i() : 0, i2);
                    if (a2 == 0) {
                        m5074a(x);
                    }
                    return a2;
                }
            }
            a = null;
            x = instance.m5043x();
            if (wDObjet == null) {
            }
            if (wDObjet2 == null) {
            }
            a2 = x.mo2772a(i, wDObjet == null ? 0 : d.m3717k(), wDObjet2 == null ? a.m5852i() : 0, i2);
            if (a2 == 0) {
                m5074a(x);
            }
            return a2;
        } catch (C0841b e52) {
            throw e52;
        } catch (C0841b e522) {
            throw e522;
        }
    }

    /* renamed from: a */
    public static final int m5051a(WDObjet wDObjet, int i, int i2) {
        int i3 = 0;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        if (!wDObjet.getString().equals(C0607n.Vc)) {
            return m5183d(instance, wDObjet, true).m3622a(i, i2);
        }
        C0832f c0832f = null;
        try {
            c0832f = instance.m5043x();
            return c0832f.mo2771a(i, i2);
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
            return i3;
        } catch (WDJNIException e2) {
            m5075a(e2, c0832f);
            return i3;
        }
    }

    /* renamed from: a */
    public static final int m5052a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, false);
        eb a = m5059a(instance, wDObjet2, false);
        C0832f x = instance.m5043x();
        try {
            int a2 = x.mo2775a(d.m3717k(), a.m5852i(), wDObjet3, wDObjet4);
            if (a2 != -2) {
                return a2;
            }
            m5074a(x);
            return 0;
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
            return 0;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return 0;
        }
    }

    /* renamed from: a */
    public static final int m5053a(WDObjet wDObjet, String str, String str2, boolean z, String str3, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            int a = x.mo2778a(c.m4941a(), str, str2, z, str3, wDObjet2 != null ? WDJaugeJNI.create(wDObjet2) : null);
            if (a != 0) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return 0;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return 0;
        }
    }

    /* renamed from: a */
    public static final WDObjet m5054a(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        C0832f x = instance.m5043x();
        try {
            return wDObjet2.checkType(C0548s.class) != null ? x.mo2784a(m5129b(instance, wDObjet, false).m3717k(), i, wDObjet2.getInt()) : x.mo2896c(m5129b(instance, wDObjet, false).m3717k(), i, wDObjet2.getString());
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
            return null;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return null;
        }
    }

    /* renamed from: a */
    public static final WDObjet m5055a(WDObjet wDObjet, String str, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            WDObjet c2 = x.mo2897c(c.m4941a(), str, i);
            if (c2 != null) {
                return c2;
            }
            m5074a(x);
            return c2;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return null;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return null;
        }
    }

    /* renamed from: a */
    public static final WDObjet m5056a(WDObjet wDObjet, String str, WDObjet[] wDObjetArr) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            WDObjet a = x.mo2785a(c.m4941a(), str, wDObjetArr);
            if (a != null) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return null;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return null;
        }
    }

    /* renamed from: a */
    public static final WDHF_Connexion m5057a(WDHF_Contexte wDHF_Contexte, WDObjet wDObjet) {
        return m5162c(wDHF_Contexte, wDObjet, false);
    }

    /* renamed from: a */
    private static final db m5058a(WDHF_Contexte wDHF_Contexte) {
        db k = wDHF_Contexte.m5026k();
        if (k != null) {
            return k;
        }
        WDErreurManager.m2883a(C0745b.m3222b(Td[18], new String[0]));
        return null;
    }

    /* renamed from: a */
    public static eb m5059a(WDHF_Contexte wDHF_Contexte, WDObjet wDObjet, boolean z) {
        WDObjet c = wDObjet == null ? m5164c(wDHF_Contexte) : wDObjet;
        eb a = c.isRubrique() ? (eb) c : m5060a(wDHF_Contexte, c.getString());
        if (a != null && z) {
            a.m5799A().m3705f(a);
        }
        return a;
    }

    /* renamed from: a */
    public static eb m5060a(WDHF_Contexte wDHF_Contexte, String str) {
        db s = wDHF_Contexte.m5039s();
        String str2 = "";
        if (s != null) {
            str2 = s.mo2719a();
            eb i = s.m3714i(str);
            if (i != null) {
                return i;
            }
        }
        WDErreurManager.m2883a(C0745b.m3222b(Td[0], str, str2));
        return null;
    }

    /* renamed from: a */
    public static final String m5061a(WDObjet wDObjet, int i, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion a = m5057a(instance, wDObjet);
        try {
            if (a.m4953c()) {
                C0832f c0832f = null;
                try {
                    c0832f = instance.m5043x();
                    return c0832f.mo2870b(a.m4941a(), i, str);
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                    return "";
                } catch (WDJNIException e2) {
                    m5075a(e2, c0832f);
                    return "";
                }
            }
            WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Td[4], WDAppelContexte.getContexte().m2731r()), ""));
            return "";
        } catch (C0841b e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    public static final String m5062a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        if (wDObjet3.isMemoBinaire()) {
            return m5183d(instance, wDObjet, true).m3633a(m5059a(instance, wDObjet2, true), 1, wDObjet3);
        }
        return m5183d(instance, wDObjet, true).m3634a(m5059a(instance, wDObjet2, true), 1, new String[]{wDObjet3.getString()});
    }

    /* renamed from: a */
    public static final String m5063a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4, String str) {
        eb a;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, true);
        if (wDObjet2 != null) {
            a = m5059a(instance, wDObjet2, true);
        } else {
            WDObjet wDObjet5 = wDObjet2;
        }
        return d.m3635a(a, wDObjet3, wDObjet4, str);
    }

    /* renamed from: a */
    public static final String m5064a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet[] wDObjetArr) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, false);
        eb a = m5059a(instance, wDObjet2, false);
        C0832f x = instance.m5043x();
        try {
            String a2 = x.mo2800a(d.m3717k(), a.m5852i(), wDObjetArr);
            if (!C0808l.m4053k(a2)) {
                return a2;
            }
            m5074a(x);
            return a2;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: a */
    public static final String m5065a(WDObjet wDObjet, WDObjet wDObjet2, String[] strArr) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3634a(m5059a(instance, wDObjet2, true), 1, strArr);
    }

    /* renamed from: a */
    public static final String m5066a(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            return x.mo2802a(c.m4941a(), str);
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
            return "";
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        }
    }

    /* renamed from: a */
    public static final String m5067a(WDObjet wDObjet, String str, long j) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion g = instance.m5019g(wDObjet.getString());
        db d = g == null ? m5183d(instance, wDObjet, false) : null;
        C0832f x = instance.m5043x();
        if (g != null) {
            try {
                String a = x.mo2803a(g.m4941a(), str, j);
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                m5075a(e2, x);
                return "";
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
                return "";
            }
        }
        a = x.mo2947f(d.m3717k(), j);
        if (!C0808l.m4053k(a)) {
            return a;
        }
        m5074a(x);
        return a;
    }

    /* renamed from: a */
    public static final String m5068a(WDObjet wDObjet, String str, String str2, int i) {
        long j = 0;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        try {
            instance.m5033n();
            db b = wDObjet.getString().equals(C0607n.Vc) ? null : m5129b(instance, wDObjet, false);
            C0832f x = instance.m5043x();
            try {
                String b2;
                WDHF_Connexion g = C0808l.m4053k(str2) ? instance.m5019g(str) : null;
                if (g != null) {
                    if (b != null) {
                        j = b.m3717k();
                    }
                    b2 = x.mo2872b(j, g.m4941a(), i);
                } else {
                    if (b != null) {
                        j = b.m3717k();
                    }
                    b2 = x.mo2804a(j, !C0808l.m4053k(str) ? C0897o.m6290j(str).getPath() : str, str2, i);
                }
                if (b2 == null) {
                    m5074a(x);
                }
                return b2;
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                m5075a(e2, x);
                return null;
            } catch (C0841b e3) {
                throw e3;
            } catch (C0841b e32) {
                throw e32;
            } catch (C0841b e322) {
                throw e322;
            } catch (Exception e4) {
                WDErreurManager.m2882a(e4);
                return null;
            }
        } catch (C0841b e3222) {
            throw e3222;
        }
    }

    /* renamed from: a */
    public static final String m5069a(WDObjet wDObjet, String str, String str2, String str3) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            String c2 = x.mo2905c(c.m4941a(), str, str2, str3);
            if (!C0808l.m4053k(c2)) {
                return c2;
            }
            m5074a(x);
            return c2;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: a */
    public static final String m5070a(WDObjet wDObjet, String str, String str2, String str3, String str4, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            String a = x.mo2806a(c.m4941a(), str, str2, str3, str4, i);
            if (!C0808l.m4053k(a)) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: a */
    public static final String m5071a(String str, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        C0832f x = instance.m5043x();
        try {
            String e = x.mo2935e(str, i);
            if (!C0808l.m4053k(e)) {
                return e;
            }
            m5074a(x);
            return e;
        } catch (C0841b e2) {
            throw e2;
        } catch (WDJNIException e3) {
            m5075a(e3, x);
            return "";
        } catch (Exception e4) {
            WDErreurManager.m2882a(e4);
            return "";
        }
    }

    /* renamed from: a */
    public static final String m5072a(String str, String str2, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        C0832f x = instance.m5043x();
        try {
            if (!C0808l.m4053k(str)) {
                str = C0897o.m6290j(str).getPath();
            }
            String a = x.mo2807a(str, str2, i);
            if (!C0808l.m4053k(a)) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: a */
    public static final void m5073a(int i, String str, String str2, String str3, String str4, String str5) {
        WDHF_Contexte.getInstance().m5000a(new C0860m(i, str, 0, "", str2, str3, str4, str5));
        WDErreurManager.m2874a(i, str);
    }

    /* renamed from: a */
    public static final void m5074a(C0832f c0832f) {
        WDHF_Contexte.getInstance().m5018f();
        try {
            if (c0832f.mo3066y()) {
                WDErreurManager.m2873a(c0832f.mo2915d(2000), c0832f.mo2932e((int) C0542t.Vc), c0832f.mo2932e((int) C0542t.mb));
                return;
            }
            WDErreurManager.m2881a(WDAppelContexte.getContexte(), c0832f.mo2932e((int) C0542t.mb), true);
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
        } catch (WDJNIException e2) {
            m5075a(e2, c0832f);
        }
    }

    /* renamed from: a */
    public static final void m5075a(WDJNIException wDJNIException, C0832f c0832f) {
        if (!(wDJNIException instanceof WDHF_Exception) || c0832f == null) {
            WDErreurManager.m2883a(C0745b.m3222b(Td[8], new String[0]) + "\n" + wDJNIException.getMessage());
        } else {
            m5074a(c0832f);
        }
    }

    /* renamed from: a */
    public static final void m5076a(String str, int i, String str2, String str3, String str4, String str5, String str6) {
        WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, str, i, str2, str3, str4, str5, str6));
        WDErreurManager.m2874a((int) C0607n.yr, str);
    }

    /* renamed from: a */
    public static final boolean m5077a() {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        boolean z = false;
        if (instance.m5016e()) {
            try {
                z = instance.m5043x().mo2958g();
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
            } catch (WDJNIException e2) {
                m5075a(e2, instance.m5043x());
            }
        }
        return z;
    }

    /* renamed from: a */
    public static final boolean m5078a(int i, int i2) {
        db dbVar = null;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        Integer num = new Integer(i);
        Iterator l = instance.m5029l();
        ib ibVar = null;
        while (l.hasNext()) {
            dbVar = (db) l.next();
            ibVar = dbVar.m3630a(num);
            if (ibVar != null) {
                break;
            }
        }
        if (ibVar == null) {
            Iterator q = instance.m5037q();
            while (q.hasNext()) {
                dbVar = (C0778b) q.next();
                ibVar = dbVar.m3630a(num);
                if (ibVar != null) {
                    break;
                }
            }
        }
        if (ibVar == null || dbVar == null) {
            WDErreurManager.m2883a(C0745b.m3222b(Td[34], new String[0]));
        }
        return dbVar.m3663a(num, ibVar, i2);
    }

    /* renamed from: a */
    public static final boolean m5079a(int i, C0486m c0486m, int i2) {
        if (i == C0542t.f1207w) {
            if (c0486m != null && !c0486m.toString().equals("")) {
                Sd = WDCallback.m2239a(c0486m, -1, true);
            } else if (Sd != null) {
                Sd.m2261c();
                Sd = null;
            }
        } else if (c0486m != null && !c0486m.toString().equals("")) {
            Rd = WDCallback.m2239a(c0486m, -1, true);
        } else if (Rd != null) {
            Rd.m2261c();
            Rd = null;
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m5080a(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3738z();
    }

    /* renamed from: a */
    public static final boolean m5081a(WDObjet wDObjet, int i) {
        C0832f c0832f = null;
        boolean z = false;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion a = m5057a(instance, wDObjet);
        if (a.m4953c()) {
            try {
                c0832f = instance.m5043x();
                return c0832f.mo2815a(i, a.m4948b());
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
                return z;
            } catch (WDJNIException e2) {
                m5075a(e2, c0832f);
                return z;
            }
        }
        if (!a.m4962j()) {
            if (i != 1) {
                return z;
            }
            try {
                if (!a.m4947a(true, null)) {
                    return z;
                }
            } catch (C0841b e3) {
                throw e3;
            }
        }
        switch (i) {
            case 1:
                try {
                    return a.m4967o().mo3117o();
                } catch (C0841b e32) {
                    throw e32;
                }
            case 2:
                return a.m4967o().mo3122u();
            case 3:
                return a.m4967o().mo3115l();
            default:
                C0691a.m2856a(Td[7]);
                return z;
        }
    }

    /* renamed from: a */
    public static final boolean m5082a(WDObjet wDObjet, int i, WDObjet wDObjet2, int i2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3649a(i, wDObjet2 != null ? WDJaugeJNI.create(wDObjet2) : null, i2);
    }

    /* renamed from: a */
    public static final boolean m5083a(WDObjet wDObjet, int i, WDObjet wDObjet2, WDObjet wDObjet3) {
        boolean b;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        if (wDObjet2 == null) {
            try {
                b = x.mo2880b(d.m3717k(), i, wDObjet3);
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                m5075a(e2, x);
                return false;
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
                return false;
            }
        } else if (wDObjet2.checkType(C0548s.class) != null) {
            b = x.mo2818a(d.m3717k(), i, wDObjet2.getInt(), wDObjet3);
        } else {
            b = x.mo2822a(d.m3717k(), i, wDObjet2.getString(), wDObjet3);
        }
        if (!b) {
            m5074a(x);
        }
        return b;
    }

    /* renamed from: a */
    public static final boolean m5084a(WDObjet wDObjet, int i, C0486m c0486m) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        String string = wDObjet.getString().equals(C0607n.Vc) ? null : wDObjet.getString();
        C0875w c0876x = (c0486m == null || C0808l.m4053k(c0486m.toString())) ? new C0876x(i, string) : new C0877y(i, string, WDCallback.m2239a(c0486m, -1, true));
        instance.m5002a(c0876x);
        return true;
    }

    /* renamed from: a */
    public static final boolean m5085a(WDObjet wDObjet, int i, String str, String str2) {
        WDJNIException e;
        Exception e2;
        if (!C0808l.m4053k(str2)) {
            str2 = C0897o.m6290j(str2).getPath();
        }
        if (str != null) {
            i |= 1;
        } else {
            str = "";
        }
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        if (!wDObjet.getString().equals(C0607n.Vc)) {
            return m5183d(instance, wDObjet, true).m3677b(i, str, str2);
        }
        C0832f c0832f = null;
        boolean a;
        try {
            c0832f = instance.m5043x();
            a = c0832f.mo2816a(i, str, str2);
            if (a) {
                return a;
            }
            try {
                m5074a(c0832f);
                return a;
            } catch (C0841b e3) {
                throw e3;
            } catch (WDJNIException e4) {
                e = e4;
                m5075a(e, c0832f);
                return a;
            } catch (C0841b e5) {
                e2 = e5;
            }
        } catch (Exception e6) {
            Exception exception = e6;
            a = false;
            e2 = exception;
            WDErreurManager.m2882a(e2);
            return a;
        } catch (WDJNIException e7) {
            WDJNIException wDJNIException = e7;
            a = false;
            e = wDJNIException;
            m5075a(e, c0832f);
            return a;
        }
    }

    /* renamed from: a */
    public static final boolean m5086a(WDObjet wDObjet, long j) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3695d(j);
    }

    /* renamed from: a */
    public static final boolean m5087a(WDObjet wDObjet, long j, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3687c(j, i);
    }

    /* renamed from: a */
    public static final boolean m5088a(WDObjet wDObjet, long j, long j2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3679b(j, j2);
    }

    /* renamed from: a */
    public static final boolean m5089a(WDObjet wDObjet, long j, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3653a(j, wDObjet2 != null ? WDJaugeJNI.create(wDObjet2) : null);
    }

    /* renamed from: a */
    public static final boolean m5090a(WDObjet wDObjet, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3709g(m5059a(instance, wDObjet2, false));
    }

    /* renamed from: a */
    public static final boolean m5091a(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3657a(m5059a(instance, wDObjet2, true), i);
    }

    /* renamed from: a */
    public static final boolean m5092a(WDObjet wDObjet, WDObjet wDObjet2, int i, int i2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3658a(m5059a(instance, wDObjet2, true), i, i2);
    }

    /* renamed from: a */
    public static final boolean m5093a(WDObjet wDObjet, WDObjet wDObjet2, long j, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        if (j <= 0) {
            WDErreurManager.m2883a(C0745b.m3222b(Td[11], new String[0]));
        }
        return m5183d(instance, wDObjet, true).m3662a(m5059a(instance, wDObjet2, true), false, true, j, (long) i);
    }

    /* renamed from: a */
    public static final boolean m5094a(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, boolean z, long j) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3659a(m5059a(instance, wDObjet2, true), wDObjet3, true, z, j);
    }

    /* renamed from: a */
    public static final boolean m5095a(WDObjet wDObjet, WDObjet wDObjet2, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, true);
        WDObjet a = m5059a(instance, wDObjet2, false);
        if (((eb) a).m5848f() != 30) {
            WDErreurManager.m2883a(C0745b.m3222b(Td[16], ((eb) a).mo3137b(), d.mo2719a()));
        }
        return m5217f(a.getValeur(), str);
    }

    /* renamed from: a */
    public static final boolean m5096a(WDObjet wDObjet, WDObjet wDObjet2, String str, int i, String str2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3660a(m5059a(instance, wDObjet2, false), str, i, str2);
    }

    /* renamed from: a */
    public static final boolean m5097a(WDObjet wDObjet, WDObjet wDObjet2, String str, WDObjet wDObjet3) {
        WDJaugeJNI wDJaugeJNI = null;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean a;
            long a2;
            if (wDObjet2.checkType(C0548s.class) != null) {
                a2 = c.m4941a();
                int i = wDObjet2.getInt();
                if (wDObjet3 != null) {
                    wDJaugeJNI = WDJaugeJNI.create(wDObjet3);
                }
                a = x.mo2823a(a2, i, str, wDJaugeJNI);
            } else {
                a2 = c.m4941a();
                String string = wDObjet2.getString();
                if (wDObjet3 != null) {
                    wDJaugeJNI = WDJaugeJNI.create(wDObjet3);
                }
                a = x.mo2839a(a2, string, str, wDJaugeJNI);
            }
            if (a) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (C0841b e3) {
            throw e3;
        } catch (C0841b e32) {
            throw e32;
        } catch (Exception e4) {
            WDErreurManager.m2882a(e4);
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m5098a(WDObjet wDObjet, WDObjet wDObjet2, String str, String str2, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDEnregistrement wDEnregistrement = (WDEnregistrement) wDObjet2.checkType(WDEnregistrement.class);
        return m5183d(instance, wDObjet, true).m3656a(wDEnregistrement != null ? wDEnregistrement.m4272c() : m5183d(instance, wDObjet2, true), wDEnregistrement, str, str2, i);
    }

    /* renamed from: a */
    public static final boolean m5099a(WDObjet wDObjet, WDObjet wDObjet2, String str, String str2, WDObjet wDObjet3) {
        WDJaugeJNI wDJaugeJNI = null;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean a;
            long a2;
            if (wDObjet2.checkType(C0548s.class) != null) {
                a2 = c.m4941a();
                int i = wDObjet2.getInt();
                if (wDObjet3 != null) {
                    wDJaugeJNI = WDJaugeJNI.create(wDObjet3);
                }
                a = x.mo2825a(a2, i, str, str2, wDJaugeJNI);
            } else {
                a2 = c.m4941a();
                String string = wDObjet2.getString();
                if (wDObjet3 != null) {
                    wDJaugeJNI = WDJaugeJNI.create(wDObjet3);
                }
                a = x.mo2842a(a2, string, str, str2, wDJaugeJNI);
            }
            if (a) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (C0841b e3) {
            throw e3;
        } catch (C0841b e32) {
            throw e32;
        } catch (Exception e4) {
            WDErreurManager.m2882a(e4);
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m5100a(WDObjet wDObjet, WDObjet wDObjet2, boolean z) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        try {
            db d;
            eb a;
            C0832f x;
            boolean a2;
            instance.m5033n();
            if (wDObjet != null) {
                if (!wDObjet.getString().equals(C0607n.Vc)) {
                    d = m5183d(instance, wDObjet, false);
                    if (wDObjet2 != null) {
                        try {
                            if (!wDObjet2.getString().equals(C0607n.Vc)) {
                                a = m5059a(instance, wDObjet2, false);
                                x = instance.m5043x();
                                if (wDObjet == null) {
                                    try {
                                    } catch (C0841b e) {
                                        throw e;
                                    } catch (WDJNIException e2) {
                                        m5075a(e2, x);
                                        return false;
                                    } catch (C0841b e3) {
                                        throw e3;
                                    } catch (Exception e4) {
                                        WDErreurManager.m2882a(e4);
                                        return false;
                                    }
                                }
                                a2 = x.mo2831a(wDObjet == null ? 0 : d.m3717k(), wDObjet2 == null ? a.m5852i() : 0, z);
                                if (a2) {
                                    return a2;
                                }
                                m5074a(x);
                                return a2;
                            }
                        } catch (C0841b e32) {
                            throw e32;
                        }
                    }
                    a = null;
                    x = instance.m5043x();
                    if (wDObjet2 == null) {
                    }
                    a2 = x.mo2831a(wDObjet == null ? 0 : d.m3717k(), wDObjet2 == null ? a.m5852i() : 0, z);
                    if (a2) {
                        return a2;
                    }
                    m5074a(x);
                    return a2;
                }
            }
            d = null;
            if (wDObjet2 != null) {
                if (wDObjet2.getString().equals(C0607n.Vc)) {
                    a = m5059a(instance, wDObjet2, false);
                    x = instance.m5043x();
                    if (wDObjet == null) {
                    }
                    if (wDObjet2 == null) {
                    }
                    a2 = x.mo2831a(wDObjet == null ? 0 : d.m3717k(), wDObjet2 == null ? a.m5852i() : 0, z);
                    if (a2) {
                        return a2;
                    }
                    m5074a(x);
                    return a2;
                }
            }
            a = null;
            x = instance.m5043x();
            if (wDObjet == null) {
            }
            if (wDObjet2 == null) {
            }
            a2 = x.mo2831a(wDObjet == null ? 0 : d.m3717k(), wDObjet2 == null ? a.m5852i() : 0, z);
            if (a2) {
                return a2;
            }
            m5074a(x);
            return a2;
        } catch (C0841b e322) {
            throw e322;
        } catch (C0841b e3222) {
            throw e3222;
        }
    }

    /* renamed from: a */
    public static final boolean m5101a(WDObjet wDObjet, WDObjet wDObjet2, boolean z, long j) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3662a(m5059a(instance, wDObjet2, true), false, z, 1, j);
    }

    /* renamed from: a */
    public static final boolean m5102a(WDObjet wDObjet, WDEnregistrement wDEnregistrement, long j) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, true);
        if (wDEnregistrement != null) {
            wDEnregistrement.m4268a(d);
        }
        if (!d.m3699e(j)) {
            return false;
        }
        if (wDEnregistrement == null) {
            return true;
        }
        wDEnregistrement.m4270a(d.m3733u(), d);
        return true;
    }

    /* renamed from: a */
    public static final boolean m5103a(WDObjet wDObjet, String str, int i, String str2) {
        boolean a;
        Throwable th;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDObjet j = instance.m5024j(wDObjet.getString());
        if (j != null) {
            try {
                if (str2.equalsIgnoreCase(j.lb()) && str.equalsIgnoreCase(j.m3704f())) {
                    a = j.m3760a(str, i, null, true);
                    if (wDObjet instanceof WDSourceDonnees) {
                        ((WDSourceDonnees) wDObjet).setValeur(j);
                    }
                } else {
                    j.mo2745e(true);
                    j.m3600C();
                    j.m3770t(str2);
                    a = j.m3760a(str, i, null, false);
                    if (wDObjet instanceof WDSourceDonnees) {
                        ((WDSourceDonnees) wDObjet).setValeur(j);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (wDObjet instanceof WDSourceDonnees) {
                    ((WDSourceDonnees) wDObjet).setValeur(j);
                }
                throw th;
            }
        }
        WDObjet c0778b = new C0778b(wDObjet.getString());
        try {
            instance.m5001a((C0778b) c0778b);
            instance.m4999a((db) c0778b, true);
            j = c0778b;
            j.m3770t(str2);
            a = j.m3760a(str, i, null, false);
            if (wDObjet instanceof WDSourceDonnees) {
                ((WDSourceDonnees) wDObjet).setValeur(j);
            }
        } catch (Throwable th3) {
            th = th3;
            j = c0778b;
            if (wDObjet instanceof WDSourceDonnees) {
                ((WDSourceDonnees) wDObjet).setValeur(j);
            }
            throw th;
        }
        return a;
    }

    /* renamed from: a */
    public static final boolean m5104a(WDObjet wDObjet, String str, int i, WDObjet[] wDObjetArr) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        C0778b j = instance.m5024j(wDObjet.getString());
        if (j == null || !j.hb()) {
            j = m5130b(instance, wDObjet);
        } else {
            j.mo2745e(true);
        }
        return j.m3760a(str, i, wDObjetArr, false);
    }

    /* renamed from: a */
    public static final boolean m5105a(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean a = x.mo2834a(c.m4941a(), str, wDObjet2);
            if (a) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: a */
    public static final boolean m5106a(fr.pcsoft.wdjava.core.WDObjet r11, java.lang.String r12, fr.pcsoft.wdjava.core.WDObjet r13, java.lang.String r14, int r15, fr.pcsoft.wdjava.core.WDObjet r16, java.lang.String r17) {
        /*
        r0 = fr.pcsoft.wdjava.database.hf.WDHF_Contexte.getInstance();
        r0.m5033n();
        r1 = -1;
        r3 = r11.getString();
        r3 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r3);
        if (r3 != 0) goto L_0x004f;
    L_0x0013:
        r1 = m5057a(r0, r11);
        r2 = r1.m4953c();	 Catch:{ b -> 0x0049 }
        if (r2 != 0) goto L_0x004b;
    L_0x001d:
        r0 = fr.pcsoft.wdjava.database.hf.WDHF_Contexte.getInstance();	 Catch:{ b -> 0x0049 }
        r1 = new fr.pcsoft.wdjava.database.hf.m;	 Catch:{ b -> 0x0049 }
        r2 = 73001; // 0x11d29 float:1.02296E-40 double:3.60673E-319;
        r3 = Td;	 Catch:{ b -> 0x0049 }
        r4 = 4;
        r3 = r3[r4];	 Catch:{ b -> 0x0049 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ b -> 0x0049 }
        r5 = 0;
        r6 = Td;	 Catch:{ b -> 0x0049 }
        r7 = 25;
        r6 = r6[r7];	 Catch:{ b -> 0x0049 }
        r6 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3221b(r6);	 Catch:{ b -> 0x0049 }
        r4[r5] = r6;	 Catch:{ b -> 0x0049 }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);	 Catch:{ b -> 0x0049 }
        r4 = "";
        r1.<init>(r2, r3, r4);	 Catch:{ b -> 0x0049 }
        r0.m5000a(r1);	 Catch:{ b -> 0x0049 }
        r0 = 0;
    L_0x0048:
        return r0;
    L_0x0049:
        r0 = move-exception;
        throw r0;
    L_0x004b:
        r1 = r1.m4941a();
    L_0x004f:
        r4 = -1;
        r3 = r13.getString();
        r3 = fr.pcsoft.wdjava.core.utils.C0808l.m4053k(r3);
        if (r3 != 0) goto L_0x0097;
    L_0x005b:
        r3 = m5057a(r0, r13);
        r4 = r3.m4953c();	 Catch:{ b -> 0x0091 }
        if (r4 != 0) goto L_0x0093;
    L_0x0065:
        r0 = fr.pcsoft.wdjava.database.hf.WDHF_Contexte.getInstance();	 Catch:{ b -> 0x0091 }
        r1 = new fr.pcsoft.wdjava.database.hf.m;	 Catch:{ b -> 0x0091 }
        r2 = 73001; // 0x11d29 float:1.02296E-40 double:3.60673E-319;
        r3 = Td;	 Catch:{ b -> 0x0091 }
        r4 = 4;
        r3 = r3[r4];	 Catch:{ b -> 0x0091 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ b -> 0x0091 }
        r5 = 0;
        r6 = Td;	 Catch:{ b -> 0x0091 }
        r7 = 25;
        r6 = r6[r7];	 Catch:{ b -> 0x0091 }
        r6 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3221b(r6);	 Catch:{ b -> 0x0091 }
        r4[r5] = r6;	 Catch:{ b -> 0x0091 }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);	 Catch:{ b -> 0x0091 }
        r4 = "";
        r1.<init>(r2, r3, r4);	 Catch:{ b -> 0x0091 }
        r0.m5000a(r1);	 Catch:{ b -> 0x0091 }
        r0 = 0;
        goto L_0x0048;
    L_0x0091:
        r0 = move-exception;
        throw r0;
    L_0x0093:
        r4 = r3.m4941a();
    L_0x0097:
        r3 = 0;
        r0 = r0.m5043x();	 Catch:{ b -> 0x00b4, WDJNIException -> 0x00c7 }
        if (r16 == 0) goto L_0x00ba;
    L_0x009e:
        r8 = fr.pcsoft.wdjava.jni.WDJaugeJNI.create(r16);	 Catch:{ b -> 0x00b2, WDJNIException -> 0x00be }
    L_0x00a2:
        r3 = r12;
        r6 = r14;
        r7 = r15;
        r9 = r17;
        r1 = r0.mo2833a(r1, r3, r4, r6, r7, r8, r9);	 Catch:{ b -> 0x00b4, WDJNIException -> 0x00be }
        if (r1 != 0) goto L_0x00b0;
    L_0x00ad:
        m5074a(r0);	 Catch:{ b -> 0x00bc, WDJNIException -> 0x00be }
    L_0x00b0:
        r0 = r1;
        goto L_0x0048;
    L_0x00b2:
        r1 = move-exception;
        throw r1;	 Catch:{ b -> 0x00b4, WDJNIException -> 0x00be }
    L_0x00b4:
        r0 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2882a(r0);
        r0 = 0;
        goto L_0x0048;
    L_0x00ba:
        r8 = 0;
        goto L_0x00a2;
    L_0x00bc:
        r1 = move-exception;
        throw r1;	 Catch:{ b -> 0x00b4, WDJNIException -> 0x00be }
    L_0x00be:
        r1 = move-exception;
        r10 = r1;
        r1 = r0;
        r0 = r10;
    L_0x00c2:
        m5075a(r0, r1);
        r0 = 0;
        goto L_0x0048;
    L_0x00c7:
        r0 = move-exception;
        r1 = r3;
        goto L_0x00c2;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.WDHF_Manager.a(fr.pcsoft.wdjava.core.WDObjet, java.lang.String, fr.pcsoft.wdjava.core.WDObjet, java.lang.String, int, fr.pcsoft.wdjava.core.WDObjet, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static final boolean m5107a(WDObjet wDObjet, String str, String str2) {
        boolean d;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = str2 != null ? m5162c(instance, wDObjet, true) : instance.m5019g(wDObjet.getString());
        C0832f x = instance.m5043x();
        if (str2 != null) {
            try {
                d = x.mo2927d(c.m4941a(), str, str2);
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                m5075a(e2, x);
                return false;
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
                return false;
            }
        } else if (c != null) {
            d = x.mo2927d(c.m4941a(), str, "");
        } else {
            x.mo2998k(wDObjet.getString(), str);
            d = true;
        }
        if (d) {
            return d;
        }
        m5074a(x);
        return d;
    }

    /* renamed from: a */
    public static final boolean m5108a(WDObjet wDObjet, String str, String str2, int i, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db b = m5129b(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        try {
            boolean a = x.mo2837a(b.m3717k(), !C0808l.m4053k(str) ? C0897o.m6290j(str).getPath() : str, str2, i, wDObjet2 != null ? WDJaugeJNI.create(wDObjet2) : null);
            if (a) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (C0841b e3) {
            throw e3;
        } catch (Exception e4) {
            WDErreurManager.m2882a(e4);
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m5109a(WDObjet wDObjet, String str, String str2, int i, String str3, String str4) {
        boolean a;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion g = instance.m5019g(wDObjet.getString());
        C0832f x = instance.m5043x();
        if (g != null) {
            try {
                a = x.mo2838a(g.m4941a(), str, str2, i, str3, str4);
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                m5075a(e2, x);
                return false;
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
                return false;
            }
        }
        a = x.mo2838a(-1, wDObjet.getString(), str2, i, str3, str4);
        if (!a) {
            m5074a(x);
        }
        return a;
    }

    /* renamed from: a */
    public static final boolean m5110a(WDObjet wDObjet, String str, String str2, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean b = x.mo2887b(c.m4941a(), str, str2, wDObjet2 != null ? WDJaugeJNI.create(wDObjet2) : null);
            if (b) {
                return b;
            }
            m5074a(x);
            return b;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m5111a(WDObjet wDObjet, String str, String str2, String str3, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        if (wDObjet == null || !wDObjet.getString().equals(C0607n.Vc)) {
            return m5183d(instance, wDObjet, false).m3666a(str, str2, str3, i, true);
        }
        Iterator l = instance.m5029l();
        while (l.hasNext()) {
            if (!((db) l.next()).m3666a(str, str2, str3, i, true)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static final boolean m5112a(WDObjet wDObjet, String str, String str2, String str3, int i, WDObjet wDObjet2) {
        return false;
    }

    /* renamed from: a */
    public static final boolean m5113a(WDObjet wDObjet, String str, String str2, String str3, String str4) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean b = x.mo2891b(c.m4941a(), str, str2, str3, str4);
            if (b) {
                return b;
            }
            m5074a(x);
            return b;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m5114a(WDObjet wDObjet, String str, String str2, String str3, String str4, String str5) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean a = x.mo2844a(c.m4941a(), str, str2, str3, str4, str5);
            if (a) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m5115a(WDObjet wDObjet, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2) {
        WDHF_Connexion wDHF_Connexion;
        WDJNIException e;
        Exception e2;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        boolean z = false;
        WDHF_Connexion wDHF_Connexion2 = (WDHF_Connexion) wDObjet.checkType(WDHF_Connexion.class);
        if (wDHF_Connexion2 == null) {
            wDHF_Connexion = new WDHF_Connexion(wDObjet.getString(), str5);
        } else {
            wDHF_Connexion2.m4950b(str5);
            wDHF_Connexion = wDHF_Connexion2;
        }
        try {
            boolean a;
            wDHF_Connexion.m4957e(str);
            wDHF_Connexion.m4946a(str2);
            wDHF_Connexion.m4955d(str3);
            wDHF_Connexion.m4952c(str4);
            wDHF_Connexion.m4959f(str6);
            wDHF_Connexion.m4951b(true);
            if (!str5.equalsIgnoreCase(Td[9])) {
                if (!str5.equalsIgnoreCase(Td[24])) {
                    try {
                        if (!str5.equalsIgnoreCase(Td[21])) {
                            if (!str5.equalsIgnoreCase(Td[20])) {
                                WDErreurManager.m2883a(C0745b.m3222b(Td[23], new String[0]));
                                if (z) {
                                    try {
                                        instance.m4996a(wDHF_Connexion);
                                    } catch (C0841b e3) {
                                        throw e3;
                                    }
                                }
                                return z;
                            }
                        }
                        z = wDHF_Connexion.m4947a(true, null);
                        if (z) {
                            instance.m4996a(wDHF_Connexion);
                        }
                        return z;
                    } catch (C0841b e32) {
                        throw e32;
                    }
                }
            }
            String str7 = "";
            if (str6 != null) {
                try {
                    if (str6.length() > 0) {
                        String[] split = str6.split(";");
                        String str8 = str7;
                        for (String trim : split) {
                            String trim2 = trim2.trim();
                            if (trim2.trim().startsWith(Td[22])) {
                                str8 = trim2.substring(4, trim2.length()).trim();
                                C0808l.m4018a(str6, trim2, "");
                            }
                        }
                        str7 = str8;
                    }
                } catch (C0841b e322) {
                    throw e322;
                }
            }
            C0832f n = instance.m5032n(str7);
            try {
                long a2 = wDHF_Connexion.m4941a();
                a = n.mo2845a(a2, str, str2, str3, str4, str5, i, str6, i2);
                if (!a) {
                    try {
                        m5074a(n);
                        n.mo3021o(a2);
                    } catch (C0841b e4) {
                        throw e4;
                    } catch (WDJNIException e5) {
                        e = e5;
                        m5075a(e, n);
                        z = a;
                        if (z) {
                            instance.m4996a(wDHF_Connexion);
                        }
                        return z;
                    } catch (C0841b e6) {
                        e2 = e6;
                    }
                }
            } catch (Exception e7) {
                e2 = e7;
                a = false;
                WDErreurManager.m2882a(e2);
                z = a;
                if (z) {
                    instance.m4996a(wDHF_Connexion);
                }
                return z;
            } catch (WDJNIException e8) {
                e = e8;
                a = false;
                m5075a(e, n);
                z = a;
                if (z) {
                    instance.m4996a(wDHF_Connexion);
                }
                return z;
            }
            z = a;
            if (z) {
                instance.m4996a(wDHF_Connexion);
            }
            return z;
        } catch (C0841b e3222) {
            throw e3222;
        }
    }

    /* renamed from: a */
    public static final boolean m5116a(WDObjet wDObjet, String str, boolean z) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean b = x.mo2893b(c.m4941a(), str, z);
            if (b) {
                return b;
            }
            m5074a(x);
            return b;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: a */
    public static final boolean m5117a(WDObjet wDObjet, boolean z) {
        boolean z2 = true;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        try {
            instance.m5033n();
            if (wDObjet == null || !wDObjet.getString().equals(C0607n.Vc)) {
                return m5183d(instance, wDObjet, z2).m3719k(z);
            }
            C0832f c0832f = null;
            try {
                c0832f = instance.m5043x();
                return c0832f.mo2855a(z);
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
                return false;
            } catch (WDJNIException e2) {
                m5075a(e2, c0832f);
                return z2;
            }
        } catch (C0841b e3) {
            throw e3;
        }
    }

    /* renamed from: a */
    public static final boolean m5118a(String str) {
        boolean t;
        WDJNIException e;
        Exception e2;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        C0832f c0832f = null;
        try {
            c0832f = instance.m5043x();
            if (str.equals(Td[9])) {
                t = c0832f.mo3046t(-1);
            } else {
                WDHF_Connexion g = instance.m5019g(str);
                t = g != null ? c0832f.mo3046t(g.m4941a()) : c0832f.mo2997k(str);
            }
            if (!t) {
                try {
                    m5074a(c0832f);
                } catch (C0841b e3) {
                    throw e3;
                } catch (WDJNIException e4) {
                    e = e4;
                    m5075a(e, c0832f);
                    return t;
                } catch (C0841b e5) {
                    e2 = e5;
                }
            }
        } catch (Exception e6) {
            Exception exception = e6;
            t = false;
            e2 = exception;
            WDErreurManager.m2882a(e2);
            return t;
        } catch (WDJNIException e7) {
            WDJNIException wDJNIException = e7;
            t = false;
            e = wDJNIException;
            m5075a(e, c0832f);
            return t;
        }
        return t;
    }

    /* renamed from: a */
    public static final boolean m5119a(String str, WDObjet wDObjet, int i, boolean z) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        try {
            db d;
            C0832f x;
            boolean a;
            instance.m5033n();
            if (wDObjet != null) {
                if (!wDObjet.getString().equals(C0607n.Vc)) {
                    d = m5183d(instance, wDObjet, false);
                    x = instance.m5043x();
                    if (wDObjet == null) {
                        try {
                        } catch (C0841b e) {
                            throw e;
                        } catch (WDJNIException e2) {
                            m5075a(e2, x);
                            return false;
                        } catch (Exception e3) {
                            WDErreurManager.m2882a(e3);
                            return false;
                        }
                    }
                    a = x.mo2851a(str, wDObjet == null ? 0 : d.m3717k(), i, z);
                    if (!a) {
                        m5074a(x);
                    }
                    return a;
                }
            }
            d = null;
            x = instance.m5043x();
            a = x.mo2851a(str, wDObjet == null ? 0 : d.m3717k(), i, z);
            if (a) {
                m5074a(x);
            }
            return a;
        } catch (C0841b e4) {
            throw e4;
        } catch (C0841b e42) {
            throw e42;
        }
    }

    /* renamed from: a */
    public static final boolean m5120a(String str, WDObjet wDObjet, String str2) {
        C0832f c0832f = null;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        try {
            instance.m5033n();
            WDHF_Connexion g = !C0808l.m4053k(str2) ? instance.m5019g(str2) : null;
            if (g != null) {
                try {
                    if (!g.m4953c()) {
                        WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Td[4], WDAppelContexte.getContexte().m2731r()), ""));
                        return false;
                    }
                } catch (C0841b e) {
                    throw e;
                }
            }
            try {
                byte[] a;
                String string = wDObjet.getString();
                c0832f = instance.m5043x();
                if (g != null) {
                    a = c0832f.mo2856a(str, string, g.m4941a());
                } else {
                    if (!C0808l.m4053k(str)) {
                        str = C0897o.m6290j(str).getPath();
                    }
                    a = c0832f.mo2857a(str, string, str2);
                }
                if (a == null) {
                    m5074a(c0832f);
                    return false;
                }
                db a2 = db.m3573a(a);
                if (a2 == null) {
                    return false;
                }
                a2.m3728q(g != null ? g.m4948b() : "");
                instance.m4998a(a2);
                if (wDObjet instanceof WDSourceDonnees) {
                    ((WDSourceDonnees) wDObjet).setValeur(a2);
                }
                return true;
            } catch (C0841b e2) {
                throw e2;
            } catch (WDJNIException e3) {
                m5075a(e3, c0832f);
                return false;
            } catch (Exception e4) {
                WDErreurManager.m2882a(e4);
                return false;
            }
        } catch (C0841b e22) {
            throw e22;
        }
    }

    /* renamed from: a */
    public static final boolean m5121a(String str, String str2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        C0832f c0832f = null;
        try {
            c0832f = instance.m5043x();
            boolean f = c0832f.mo2953f(str, str2);
            if (f) {
                return f;
            }
            m5074a(c0832f);
            return f;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, c0832f);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m5122a(String str, String str2, String str3) {
        boolean z = false;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        C0832f c0832f = null;
        try {
            c0832f = instance.m5043x();
            if (str == null) {
                z = c0832f.mo2852a(str2, str3);
            } else if (str.equals("") || str.equals(Td[9])) {
                z = c0832f.mo2964g(-1, str2, str3);
            } else {
                WDHF_Connexion g = instance.m5019g(str);
                if (g != null) {
                    z = c0832f.mo2964g(g.m4941a(), str2, str3);
                }
                return z;
            }
            if (!z) {
                m5074a(c0832f);
            }
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, c0832f);
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
        }
        return z;
    }

    /* renamed from: b */
    public static final int m5123b(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3723n();
    }

    /* renamed from: b */
    public static final int m5124b(WDObjet wDObjet, long j) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3701f(j);
    }

    /* renamed from: b */
    public static final int m5125b(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        C0832f x;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        try {
            db d;
            eb a;
            int d2;
            instance.m5033n();
            if (wDObjet != null) {
                if (!wDObjet.getString().equals(C0607n.Vc)) {
                    d = m5183d(instance, wDObjet, false);
                    if (wDObjet2 != null) {
                        try {
                            if (!wDObjet2.getString().equals(C0607n.Vc)) {
                                a = m5059a(instance, wDObjet2, false);
                                x = instance.m5043x();
                                if (wDObjet == null) {
                                    try {
                                    } catch (C0841b e) {
                                        throw e;
                                    } catch (WDJNIException e2) {
                                        m5075a(e2, x);
                                        return 0;
                                    } catch (C0841b e3) {
                                        throw e3;
                                    } catch (Exception e4) {
                                        WDErreurManager.m2882a(e4);
                                        return 0;
                                    }
                                }
                                d2 = x.mo2916d(wDObjet == null ? 0 : d.m3717k(), wDObjet2 == null ? a.m5852i() : 0, i);
                                if (d2 != 0) {
                                    return d2;
                                }
                                m5074a(x);
                                return d2;
                            }
                        } catch (C0841b e32) {
                            throw e32;
                        }
                    }
                    a = null;
                    x = instance.m5043x();
                    if (wDObjet2 == null) {
                    }
                    d2 = x.mo2916d(wDObjet == null ? 0 : d.m3717k(), wDObjet2 == null ? a.m5852i() : 0, i);
                    if (d2 != 0) {
                        return d2;
                    }
                    m5074a(x);
                    return d2;
                }
            }
            d = null;
            if (wDObjet2 != null) {
                if (wDObjet2.getString().equals(C0607n.Vc)) {
                    a = m5059a(instance, wDObjet2, false);
                    x = instance.m5043x();
                    if (wDObjet == null) {
                    }
                    if (wDObjet2 == null) {
                    }
                    d2 = x.mo2916d(wDObjet == null ? 0 : d.m3717k(), wDObjet2 == null ? a.m5852i() : 0, i);
                    if (d2 != 0) {
                        return d2;
                    }
                    m5074a(x);
                    return d2;
                }
            }
            a = null;
            x = instance.m5043x();
            if (wDObjet == null) {
            }
            if (wDObjet2 == null) {
            }
            d2 = x.mo2916d(wDObjet == null ? 0 : d.m3717k(), wDObjet2 == null ? a.m5852i() : 0, i);
            if (d2 != 0) {
                return d2;
            }
            m5074a(x);
            return d2;
        } catch (C0841b e322) {
            throw e322;
        } catch (C0841b e3222) {
            throw e3222;
        }
    }

    /* renamed from: b */
    private static final int m5126b(WDHF_Contexte wDHF_Contexte) {
        String a = wDHF_Contexte.mo3084a((int) C0542t.Eb);
        if (m5213f()) {
            return Integer.MIN_VALUE;
        }
        while (true) {
            WDProjet instance = WDProjet.getInstance();
            int delaiAvantFermeture = instance.getDelaiAvantFermeture();
            if (delaiAvantFermeture == 0) {
                instance.setDelaiAvantFermeture(12000);
            }
            if (C1372f.m9828a().mo3743a(C0745b.m3224c(Td[30], a), null, new String[]{C0745b.m3224c(Td[26], new String[0]), C0745b.m3224c(Td[29], new String[0])}, new int[]{1, 2}, 0, 1, 48, "", 0, 0) == 1) {
                if (!m5213f()) {
                    int a2 = m5049a(2000);
                    String a3 = wDHF_Contexte.mo3084a((int) C0542t.mb);
                    switch (a2) {
                        case 75100:
                        case 75101:
                        case 75102:
                        case 75103:
                        case 75104:
                        case 75105:
                            C1372f.m9828a().m9832a(0, C0745b.m3224c(Td[28], a3), null, 0);
                            WDProjet.getInstance().terminerApplication();
                            break;
                        default:
                            C1372f.m9828a().m9832a(0, C0745b.m3224c(Td[27], a3), null, 0);
                            break;
                    }
                }
                return Integer.MIN_VALUE;
            }
            WDProjet.getInstance().terminerApplication();
            instance.setDelaiAvantFermeture(delaiAvantFermeture);
        }
    }

    /* renamed from: b */
    public static final long m5127b(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, WDObjet wDObjet4) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, false);
        eb a = m5059a(instance, wDObjet2, false);
        C0832f x = instance.m5043x();
        try {
            long k = d.m3717k();
            long i = a.m5852i();
            C0582d c0582d = wDObjet3 != null ? (C0582d) wDObjet3.checkType(C0582d.class) : null;
            C0582d c0582d2 = wDObjet4 != null ? (C0582d) wDObjet4.checkType(C0582d.class) : null;
            if (c0582d == null || c0582d2 == null) {
                k = x.mo2861b(k, i, wDObjet3, wDObjet4);
            } else {
                int i2;
                WDObjet[] wDObjetArr = new WDObjet[((int) c0582d.mo2483h())];
                for (i2 = 0; i2 < wDObjetArr.length; i2++) {
                    wDObjetArr[i2] = c0582d.mo2469a((long) i2);
                }
                WDObjet[] wDObjetArr2 = new WDObjet[((int) c0582d2.mo2483h())];
                for (i2 = 0; i2 < wDObjetArr2.length; i2++) {
                    wDObjetArr2[i2] = c0582d2.mo2469a((long) i2);
                }
                k = x.mo2782a(k, i, wDObjetArr, wDObjetArr2);
            }
            if (k == -1) {
                m5074a(x);
            }
            return k;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return -1;
        } catch (C0841b e3) {
            throw e3;
        } catch (C0841b e32) {
            throw e32;
        } catch (C0841b e322) {
            throw e322;
        } catch (C0841b e3222) {
            throw e3222;
        } catch (Exception e4) {
            WDErreurManager.m2882a(e4);
            return -1;
        }
    }

    /* renamed from: b */
    public static WDChaine m5128b(WDObjet wDObjet, WDObjet wDObjet2, String[] strArr) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDObjet d = m5183d(instance, wDObjet, true);
        eb a = m5059a(instance, wDObjet2, false);
        if (!a.m5853j()) {
            if (strArr.length == 1) {
                return new WDChaine(strArr[0]);
            }
            WDErreurManager.m2883a(C0745b.m3222b(Td[19], a.mo3137b(), m5183d(instance, d, true).mo2719a(), "1"));
        }
        return ((db) d).m3628a(a, strArr);
    }

    /* renamed from: b */
    public static db m5129b(WDHF_Contexte wDHF_Contexte, WDObjet wDObjet, boolean z) {
        db d = m5183d(wDHF_Contexte, wDObjet, z);
        if (!d.m3716j()) {
            String[] strArr = new String[2];
            strArr[0] = C0745b.m3222b(Td[4], WDAppelContexte.getContexte().m2731r());
            strArr[1] = d.mo2719a();
            WDErreurManager.m2886a(strArr);
        }
        return d;
    }

    /* renamed from: b */
    public static C0778b m5130b(WDHF_Contexte wDHF_Contexte, WDObjet wDObjet) {
        db dbVar;
        if (wDObjet.isSourceDonnees()) {
            C0776b sourceDonnees = ((C0776b) wDObjet).getSourceDonnees();
            dbVar = sourceDonnees instanceof C0778b ? (C0778b) sourceDonnees : null;
        } else {
            dbVar = wDHF_Contexte.m5017f(wDObjet.getString());
        }
        if (dbVar != null) {
            wDHF_Contexte.m4999a(dbVar, true);
        } else {
            wDHF_Contexte.m5000a(new C0860m(C0542t.wd, C0745b.m3222b(Td[17], wDObjet.getString()), 0, "", "", "", "", ""));
            WDErreurManager.m2874a((int) C0542t.wd, r0.m6073e());
        }
        return dbVar;
    }

    /* renamed from: b */
    public static final String m5131b(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            String s = x.mo3040s(c.m4941a(), i);
            if (s != null) {
                return s;
            }
            m5074a(x);
            return s;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return null;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return null;
        }
    }

    /* renamed from: b */
    public static final String m5132b(WDObjet wDObjet, int i, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        if (wDObjet2 == null) {
            try {
                String p = x.mo3026p(c.m4941a(), i);
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                m5075a(e2, x);
                return "";
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
                return "";
            }
        }
        p = x.mo2794a(c.m4941a(), i, wDObjet2);
        if (!C0808l.m4053k(p)) {
            return p;
        }
        m5074a(x);
        return p;
    }

    /* renamed from: b */
    public static final String m5133b(WDObjet wDObjet, String str, String str2, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            String e = x.mo2933e(c.m4941a(), str, str2, i);
            if (!C0808l.m4053k(e)) {
                return e;
            }
            m5074a(x);
            return e;
        } catch (C0841b e2) {
            throw e2;
        } catch (WDJNIException e3) {
            m5075a(e3, x);
            return "";
        } catch (Exception e4) {
            WDErreurManager.m2882a(e4);
            return "";
        }
    }

    /* renamed from: b */
    public static final String m5134b(WDObjet wDObjet, String str, String str2, String str3, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            String a = x.mo2805a(c.m4941a(), str, str2, str3, i);
            if (!C0808l.m4053k(a)) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: b */
    public static final String m5135b(WDObjet wDObjet, String str, String str2, String str3, String str4, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            String b = x.mo2876b(c.m4941a(), str, str2, str3, str4, i);
            if (!C0808l.m4053k(b)) {
                return b;
            }
            m5074a(x);
            return b;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: b */
    public static final String m5136b(String str, String str2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        C0832f x = instance.m5043x();
        try {
            if (!C0808l.m4053k(str)) {
                str = C0897o.m6290j(str).getPath();
            }
            return x.mo2978i(str, str2);
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
            return "";
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        }
    }

    /* renamed from: b */
    public static final boolean m5137b() {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        boolean z = false;
        if (instance.m5016e()) {
            try {
                z = instance.m5043x().mo2970h();
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
            } catch (WDJNIException e2) {
                m5075a(e2, instance.m5043x());
            }
        }
        return z;
    }

    /* renamed from: b */
    public static final boolean m5138b(int i) {
        db dbVar = null;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        Integer num = new Integer(i);
        Iterator l = instance.m5029l();
        ib ibVar = null;
        while (l.hasNext()) {
            dbVar = (db) l.next();
            ibVar = dbVar.m3630a(num);
            if (ibVar != null) {
                break;
            }
        }
        if (ibVar == null) {
            Iterator q = instance.m5037q();
            while (q.hasNext()) {
                dbVar = (C0778b) q.next();
                ibVar = dbVar.m3630a(num);
                if (ibVar != null) {
                    break;
                }
            }
        }
        if (ibVar == null || dbVar == null) {
            WDErreurManager.m2883a(C0745b.m3222b(Td[34], new String[0]));
        }
        dbVar.m3664a(num, dbVar.m3716j(), true);
        for (eb ebVar : dbVar.m3614S().values()) {
            if (ebVar.m5855l() != null) {
                ebVar.m5855l().m6030a(num);
            }
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m5139b(WDObjet wDObjet, long j, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3651a(j, i);
    }

    /* renamed from: b */
    public static final boolean m5140b(WDObjet wDObjet, long j, long j2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3652a(j, j2);
    }

    /* renamed from: b */
    public static final boolean m5141b(WDObjet wDObjet, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3654a(wDObjet2);
    }

    /* renamed from: b */
    public static final boolean m5142b(WDObjet wDObjet, WDObjet wDObjet2, long j, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        if (j <= 0) {
            WDErreurManager.m2883a(C0745b.m3222b(Td[11], new String[0]));
        }
        return m5183d(instance, wDObjet, true).m3662a(m5059a(instance, wDObjet2, true), true, true, j, (long) i);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: b */
    public static final boolean m5143b(fr.pcsoft.wdjava.core.WDObjet r8, fr.pcsoft.wdjava.core.WDObjet r9, fr.pcsoft.wdjava.core.WDObjet r10) {
        /*
        r7 = 0;
        r0 = 0;
        r1 = fr.pcsoft.wdjava.database.hf.WDHF_Contexte.getInstance();
        r1.m5033n();
        r2 = 1;
        r2 = m5162c(r1, r8, r2);
        r1 = r1.m5043x();
        r3 = fr.pcsoft.wdjava.core.types.C0548s.class;
        r3 = r9.checkType(r3);	 Catch:{ b -> 0x0034, WDJNIException -> 0x005b }
        if (r3 == 0) goto L_0x003a;
    L_0x001a:
        r2 = r2.m4941a();	 Catch:{ b -> 0x0032, WDJNIException -> 0x005b }
        r4 = r9.getInt();	 Catch:{ b -> 0x0032, WDJNIException -> 0x005b }
        if (r10 == 0) goto L_0x0028;
    L_0x0024:
        r0 = fr.pcsoft.wdjava.jni.WDJaugeJNI.create(r10);	 Catch:{ b -> 0x0032, WDJNIException -> 0x005b }
    L_0x0028:
        r0 = r1.mo2819a(r2, r4, r0);	 Catch:{ b -> 0x0034, WDJNIException -> 0x005b }
    L_0x002c:
        if (r0 != 0) goto L_0x0031;
    L_0x002e:
        m5074a(r1);	 Catch:{ b -> 0x0073, WDJNIException -> 0x005b }
    L_0x0031:
        return r0;
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x0034, WDJNIException -> 0x005b }
    L_0x0034:
        r0 = move-exception;
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2882a(r0);
        r0 = r7;
        goto L_0x0031;
    L_0x003a:
        if (r10 == 0) goto L_0x0044;
    L_0x003c:
        r3 = fr.pcsoft.wdjava.ui.champs.jauge.C1225d.class;
        r3 = r10.checkType(r3);	 Catch:{ b -> 0x0057, WDJNIException -> 0x005b }
        if (r3 == 0) goto L_0x0061;
    L_0x0044:
        r2 = r2.m4941a();	 Catch:{ b -> 0x0059, WDJNIException -> 0x005b }
        r4 = r9.getString();	 Catch:{ b -> 0x0059, WDJNIException -> 0x005b }
        if (r10 == 0) goto L_0x0052;
    L_0x004e:
        r0 = fr.pcsoft.wdjava.jni.WDJaugeJNI.create(r10);	 Catch:{ b -> 0x0059, WDJNIException -> 0x005b }
    L_0x0052:
        r0 = r1.mo2884b(r2, r4, r0);	 Catch:{ b -> 0x0034, WDJNIException -> 0x005b }
        goto L_0x002c;
    L_0x0057:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x0059, WDJNIException -> 0x005b }
    L_0x0059:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x0034, WDJNIException -> 0x005b }
    L_0x005b:
        r0 = move-exception;
        m5075a(r0, r1);
        r0 = r7;
        goto L_0x0031;
    L_0x0061:
        r2 = r2.m4941a();	 Catch:{ b -> 0x0034, WDJNIException -> 0x005b }
        r4 = r9.getString();	 Catch:{ b -> 0x0034, WDJNIException -> 0x005b }
        r5 = r10.getString();	 Catch:{ b -> 0x0034, WDJNIException -> 0x005b }
        r6 = 0;
        r0 = r1.mo2887b(r2, r4, r5, r6);	 Catch:{ b -> 0x0034, WDJNIException -> 0x005b }
        goto L_0x002c;
    L_0x0073:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x0034, WDJNIException -> 0x005b }
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.WDHF_Manager.b(fr.pcsoft.wdjava.core.WDObjet, fr.pcsoft.wdjava.core.WDObjet, fr.pcsoft.wdjava.core.WDObjet):boolean");
    }

    /* renamed from: b */
    public static final boolean m5144b(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, boolean z, long j) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3659a(m5059a(instance, wDObjet2, true), wDObjet3, true, z, (j & PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) == PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED ? j - PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED : j + PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
    }

    /* renamed from: b */
    public static final boolean m5145b(WDObjet wDObjet, WDObjet wDObjet2, boolean z, long j) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3661a(m5059a(instance, wDObjet2, true), true, z, j);
    }

    /* renamed from: b */
    public static final boolean m5146b(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean p = x.mo3029p(c.m4941a(), str);
            if (p) {
                return p;
            }
            m5074a(x);
            return p;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m5147b(WDObjet wDObjet, String str, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean f = x.mo2951f(c.m4941a(), str, i);
            if (f) {
                return f;
            }
            m5074a(x);
            return f;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m5148b(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean a = x.mo2835a(c.m4941a(), str, wDObjet2 != null ? WDJaugeJNI.create(wDObjet2) : null);
            if (a) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m5149b(WDObjet wDObjet, String str, String str2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = str2 != null ? m5162c(instance, wDObjet, true) : instance.m5019g(wDObjet.getString());
        C0832f x = instance.m5043x();
        if (str2 != null) {
            try {
                boolean e = x.mo2941e(c.m4941a(), str, str2);
            } catch (C0841b e2) {
                throw e2;
            } catch (WDJNIException e3) {
                m5075a(e3, x);
                return false;
            } catch (Exception e4) {
                WDErreurManager.m2882a(e4);
                return false;
            }
        }
        e = c != null ? x.mo2941e(c.m4941a(), str, "") : x.mo2941e(-1, wDObjet.getString(), str);
        if (e) {
            return e;
        }
        m5074a(x);
        return e;
    }

    /* renamed from: b */
    public static final boolean m5150b(WDObjet wDObjet, String str, String str2, int i, WDObjet wDObjet2) {
        return false;
    }

    /* renamed from: b */
    public static final boolean m5151b(WDObjet wDObjet, String str, String str2, String str3) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean b = x.mo2888b(c.m4941a(), str, str2, str3);
            if (b) {
                return b;
            }
            m5074a(x);
            return b;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m5152b(WDObjet wDObjet, String str, String str2, String str3, int i, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db b = m5129b(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        try {
            boolean b2 = x.mo2890b(b.m3717k(), !C0808l.m4053k(str) ? C0897o.m6290j(str).getPath() : str, str2, str3, i, wDObjet2 != null ? WDJaugeJNI.create(wDObjet2) : null);
            if (b2) {
                return b2;
            }
            m5074a(x);
            return b2;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (C0841b e3) {
            throw e3;
        } catch (Exception e4) {
            WDErreurManager.m2882a(e4);
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m5153b(WDObjet wDObjet, String str, String str2, String str3, String str4) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean a = x.mo2843a(c.m4941a(), str, str2, str3, str4);
            if (a) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m5154b(WDObjet wDObjet, String str, String str2, String str3, String str4, String str5) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean b = x.mo2892b(c.m4941a(), str, str2, str3, str4, str5);
            if (b) {
                return b;
            }
            m5074a(x);
            return b;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m5155b(WDObjet wDObjet, String str, String str2, String str3, String str4, String str5, int i, String str6, int i2) {
        WDHF_Connexion wDHF_Connexion;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion wDHF_Connexion2 = (WDHF_Connexion) wDObjet.checkType(WDHF_Connexion.class);
        if (wDHF_Connexion2 == null) {
            wDHF_Connexion = new WDHF_Connexion(wDObjet.getString(), str5);
        } else {
            wDHF_Connexion2.m4950b(str5);
            wDHF_Connexion = wDHF_Connexion2;
        }
        try {
            wDHF_Connexion.m4957e(str);
            wDHF_Connexion.m4946a(str2);
            wDHF_Connexion.m4955d(str3);
            wDHF_Connexion.m4952c(str4);
            wDHF_Connexion.m4959f(str6);
            wDHF_Connexion.m4951b(true);
            if (!str5.equalsIgnoreCase(Td[9])) {
                if (!str5.equalsIgnoreCase(Td[24])) {
                    try {
                        if (!str5.equalsIgnoreCase(Td[21])) {
                            if (!str5.equalsIgnoreCase(Td[20])) {
                                WDErreurManager.m2883a(C0745b.m3222b(Td[23], new String[0]));
                            }
                        }
                        instance.m4996a(wDHF_Connexion);
                        return true;
                    } catch (C0841b e) {
                        throw e;
                    } catch (C0841b e2) {
                        throw e2;
                    }
                }
            }
            String str7 = "";
            if (str6 != null) {
                try {
                    if (str6.length() > 0) {
                        String[] split = str6.split(";");
                        String str8 = str7;
                        for (String trim : split) {
                            String trim2 = trim2.trim();
                            if (trim2.trim().startsWith(Td[22])) {
                                str8 = trim2.substring(4, trim2.length()).trim();
                                C0808l.m4018a(str6, trim2, "");
                            }
                        }
                        str7 = str8;
                    }
                } catch (C0841b e22) {
                    throw e22;
                }
            }
            C0832f n = instance.m5032n(str7);
            try {
                if (!n.mo2854a(wDHF_Connexion.m4948b(), str, str2, str3, str4, str5, i, str6, i2)) {
                    m5074a(n);
                }
            } catch (C0841b e3) {
                throw e3;
            } catch (WDJNIException e4) {
                m5075a(e4, n);
            } catch (Exception e5) {
                WDErreurManager.m2882a(e5);
            }
            instance.m4996a(wDHF_Connexion);
            return true;
        } catch (C0841b e222) {
            throw e222;
        }
    }

    /* renamed from: b */
    public static final boolean m5156b(WDObjet wDObjet, String str, boolean z) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean a = x.mo2846a(c.m4941a(), str, z);
            if (a) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: b */
    public static final boolean m5157b(String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db k = instance.m5027k(str);
        if (k != null && k.m3612P()) {
            return k.m3713h(str);
        }
        instance.m5000a(new C0860m(C0542t.fb, C0745b.m3222b(Td[10], str), 0, "", "", "", "", ""));
        return false;
    }

    /* renamed from: c */
    public static final int m5158c(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3670b(m5059a(instance, wDObjet2, true), i);
    }

    /* renamed from: c */
    public static final int m5159c(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        WDJaugeJNI wDJaugeJNI = null;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, true);
        eb a = wDObjet2 != null ? m5059a(instance, wDObjet2, false) : null;
        if (wDObjet3 != null) {
            wDJaugeJNI = WDJaugeJNI.create(wDObjet3);
        }
        return d.m3623a(a, wDJaugeJNI);
    }

    /* renamed from: c */
    public static final long m5160c(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3626a(i, "", null, false);
    }

    /* renamed from: c */
    public static final WDObjet m5161c(WDObjet wDObjet, String str, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            WDObjet b = x.mo2863b(c.m4941a(), str, wDObjet2);
            if (b != null) {
                return b;
            }
            m5074a(x);
            return b;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return null;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return null;
        }
    }

    /* renamed from: c */
    public static final WDHF_Connexion m5162c(WDHF_Contexte wDHF_Contexte, WDObjet wDObjet, boolean z) {
        if (wDObjet.isConnexion()) {
            return (WDHF_Connexion) wDObjet;
        }
        WDHF_Connexion g = wDHF_Contexte.m5019g(wDObjet.getValeur().getString());
        if (g == null) {
            WDErreurManager.m2883a(C0745b.m3222b(Td[13], r0));
        }
        if (!z || g.m4953c()) {
            return g;
        }
        WDErreurManager.m2883a(C0745b.m3222b(Td[4], new String[0]));
        return g;
    }

    /* renamed from: c */
    public static final WDHF_Connexion m5163c(String str) {
        WDHF_Connexion g = WDHF_Contexte.getInstance().m5019g(str);
        if (g != null) {
            return g;
        }
        WDErreurManager.m2883a(C0745b.m3222b(Td[13], str));
        return null;
    }

    /* renamed from: c */
    private static final eb m5164c(WDHF_Contexte wDHF_Contexte) {
        return m5060a(wDHF_Contexte, "");
    }

    /* renamed from: c */
    public static final String m5165c(int i) {
        int i2 = 0;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        StringBuffer stringBuffer = new StringBuffer("");
        int i3 = (i & 128) == 128 ? 1 : 0;
        int i4 = (i & 65536) == 65536 ? 1 : 0;
        int i5 = (i & 32) == 32 ? 1 : 0;
        ArrayList arrayList = new ArrayList();
        Iterator w = instance.m5042w();
        while (w.hasNext()) {
            WDHF_Connexion wDHF_Connexion = (WDHF_Connexion) w.next();
            if (i5 != 0 || ((i4 == 0 && !wDHF_Connexion.m4964l()) || (i4 != 0 && wDHF_Connexion.m4962j()))) {
                if (i3 != 0) {
                    StringBuffer append = new StringBuffer(wDHF_Connexion.m4948b()).append(C0607n.Gc);
                    append.append(wDHF_Connexion.m4960h()).append(C0607n.Gc);
                    append.append(wDHF_Connexion.m4961i()).append(C0607n.Gc);
                    append.append(wDHF_Connexion.m4954d());
                    arrayList.add(append.toString());
                } else {
                    arrayList.add(wDHF_Connexion.m4948b());
                }
            }
        }
        Object[] toArray = arrayList.toArray();
        if ((i & 64) == 64) {
            Arrays.sort(toArray);
        }
        while (i2 < toArray.length) {
            if (i2 > 0) {
                stringBuffer.append(Td[15]);
            }
            stringBuffer.append(toArray[i2]);
            i2++;
        }
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static final String m5166c(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        try {
            long a;
            instance.m5033n();
            WDHF_Connexion c = wDObjet != null ? m5162c(instance, wDObjet, true) : null;
            C0832f x = instance.m5043x();
            if (c != null) {
                try {
                    a = c.m4941a();
                } catch (C0841b e) {
                    throw e;
                } catch (WDJNIException e2) {
                    m5075a(e2, x);
                    return null;
                } catch (Exception e3) {
                    WDErreurManager.m2882a(e3);
                    return null;
                }
            }
            a = 0;
            String u = x.mo3051u(a);
            if (u == null) {
                m5074a(x);
            }
            return u;
        } catch (C0841b e4) {
            throw e4;
        }
    }

    /* renamed from: c */
    public static final String m5167c(WDObjet wDObjet, WDObjet wDObjet2, String[] strArr) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3634a(m5059a(instance, wDObjet2, true), 2, strArr);
    }

    /* renamed from: c */
    public static final String m5168c(WDObjet wDObjet, String str, String str2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDEnregistrement wDEnregistrement = (WDEnregistrement) wDObjet.checkType(WDEnregistrement.class);
        if (wDEnregistrement == null) {
            return m5183d(instance, wDObjet, true).m3643a(null, str);
        }
        Object[] a = wDEnregistrement.m4271a();
        return a != null ? wDEnregistrement.m4272c().m3643a(a, str) : "";
    }

    /* renamed from: c */
    public static final String m5169c(WDObjet wDObjet, String str, String str2, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDEnregistrement wDEnregistrement = (WDEnregistrement) wDObjet.checkType(WDEnregistrement.class);
        return (wDEnregistrement != null ? wDEnregistrement.m4272c() : m5183d(instance, wDObjet, true)).m3641a(str, str2, i);
    }

    /* renamed from: c */
    public static final String m5170c(WDObjet wDObjet, String str, String str2, String str3) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db b = m5129b(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        try {
            String e = x.mo2934e(b.m3717k(), str, !C0808l.m4053k(str2) ? C0897o.m6290j(str2).getPath() : str2, str3);
            if (e != null) {
                return e;
            }
            m5074a(x);
            return e;
        } catch (C0841b e2) {
            throw e2;
        } catch (WDJNIException e3) {
            m5075a(e3, x);
            return "";
        } catch (Exception e4) {
            WDErreurManager.m2882a(e4);
            return "";
        }
    }

    /* renamed from: c */
    public static final boolean m5171c() {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        boolean z = false;
        if (instance.m5016e()) {
            try {
                z = instance.m5043x().mo3054v();
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
            } catch (WDJNIException e2) {
                m5075a(e2, instance.m5043x());
            }
        }
        return z;
    }

    /* renamed from: c */
    public static boolean m5172c(WDObjet wDObjet, long j) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3650a(j);
    }

    /* renamed from: c */
    public static boolean m5173c(WDObjet wDObjet, long j, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3678b(j, i);
    }

    /* renamed from: c */
    public static final boolean m5174c(WDObjet wDObjet, long j, long j2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3688c(j, j2);
    }

    /* renamed from: c */
    public static final boolean m5175c(WDObjet wDObjet, WDObjet wDObjet2) {
        boolean z;
        db dbVar;
        boolean a;
        WDJNIException e;
        Exception e2;
        C0832f c0832f = null;
        boolean z2 = false;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        boolean equals = wDObjet2.getString().equals("");
        WDObjet a2 = !equals ? m5057a(instance, wDObjet2) : wDObjet2;
        boolean equals2 = wDObjet.getString().equals(C0607n.Vc);
        db dbVar2;
        db dbVar3;
        if (equals2) {
            Iterator l = instance.m5029l();
            db dbVar4 = null;
            while (l.hasNext()) {
                dbVar4 = (db) l.next();
                if (!dbVar4.m3610N()) {
                    dbVar2 = dbVar4;
                    break;
                } else if (equals) {
                    try {
                        dbVar4.m3728q("");
                    } catch (C0841b e3) {
                        throw e3;
                    }
                } else {
                    dbVar4.m3728q(((WDHF_Connexion) a2).m4948b());
                }
            }
            dbVar2 = dbVar4;
            z2 = true;
            Iterator q = instance.m5037q();
            while (q.hasNext()) {
                C0778b c0778b = (C0778b) q.next();
                try {
                    if (c0778b.hb()) {
                        c0778b.mo2745e(true);
                    }
                } catch (C0841b e32) {
                    throw e32;
                }
            }
            dbVar3 = dbVar2;
            z = z2;
            dbVar = dbVar3;
        } else {
            dbVar2 = m5183d(instance, wDObjet, true);
            if (!dbVar2.m3610N()) {
                dbVar3 = dbVar2;
                z = false;
                dbVar = dbVar3;
            } else if (equals) {
                try {
                    dbVar2.m3728q("");
                    dbVar = dbVar2;
                    z = true;
                } catch (C0841b e322) {
                    throw e322;
                }
            } else {
                dbVar2.m3707g(((WDHF_Connexion) a2).m4948b());
                dbVar = dbVar2;
                z = true;
            }
        }
        try {
            if (!a2.isConnexion() || !((WDHF_Connexion) a2).m4953c()) {
                return z;
            }
            try {
                c0832f = instance.m5043x();
                a = equals2 ? c0832f.mo2817a(((WDHF_Connexion) a2).m4941a()) : dbVar != null ? c0832f.mo2960g(dbVar.m3717k(), ((WDHF_Connexion) a2).m4941a()) : z;
                if (a) {
                    return a;
                }
                try {
                    m5074a(c0832f);
                    return a;
                } catch (C0841b e4) {
                    throw e4;
                } catch (WDJNIException e5) {
                    e = e5;
                    m5075a(e, c0832f);
                    return a;
                } catch (C0841b e6) {
                    e2 = e6;
                }
            } catch (Exception e7) {
                Exception exception = e7;
                a = z;
                e2 = exception;
                WDErreurManager.m2882a(e2);
                return a;
            } catch (WDJNIException e8) {
                WDJNIException wDJNIException = e8;
                a = z;
                e = wDJNIException;
                m5075a(e, c0832f);
                return a;
            }
        } catch (C0841b e3222) {
            throw e3222;
        }
    }

    /* renamed from: c */
    public static final boolean m5176c(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3, boolean z, long j) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3659a(m5059a(instance, wDObjet2, true), wDObjet3, false, z, j);
    }

    /* renamed from: c */
    public static final boolean m5177c(WDObjet wDObjet, WDObjet wDObjet2, boolean z, long j) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3661a(m5059a(instance, wDObjet2, true), false, z, j);
    }

    /* renamed from: c */
    public static final boolean m5178c(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean c2 = x.mo2912c(c.m4941a(), str);
            if (c2) {
                return c2;
            }
            m5074a(x);
            return c2;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: c */
    public static final boolean m5179c(WDObjet wDObjet, String str, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean e = x.mo2940e(c.m4941a(), str, i);
            if (e) {
                return e;
            }
            m5074a(x);
            return e;
        } catch (C0841b e2) {
            throw e2;
        } catch (WDJNIException e3) {
            m5075a(e3, x);
            return false;
        } catch (Exception e4) {
            WDErreurManager.m2882a(e4);
            return false;
        }
    }

    /* renamed from: c */
    public static final boolean m5180c(WDObjet wDObjet, String str, String str2, String str3, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, false).m3666a(str, str2, str3, i, false);
    }

    /* renamed from: c */
    public static boolean m5181c(String str, String str2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        if (str != null && (instance.m5019g(str) != null || str.equals("") || str.equals(Td[9]))) {
            return m5122a(str, "", str2);
        }
        if (str == null) {
            str = "";
        }
        return m5122a(null, str, str2);
    }

    /* renamed from: d */
    public static final WDObjet m5182d(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db b = m5129b(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        try {
            WDObjet k = x.mo2991k(b.m3717k(), i);
            if (k != null) {
                return k;
            }
            m5074a(x);
            return k;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return null;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return null;
        }
    }

    /* renamed from: d */
    public static db m5183d(WDHF_Contexte wDHF_Contexte, WDObjet wDObjet, boolean z) {
        db dbVar;
        WDObjet a = wDObjet == null ? m5058a(wDHF_Contexte) : wDObjet;
        if (a.isSourceDonnees()) {
            C0776b sourceDonnees = ((C0776b) a).getSourceDonnees();
            dbVar = sourceDonnees instanceof db ? (db) sourceDonnees : null;
        } else {
            dbVar = wDHF_Contexte.m4991a(a.getString(), false);
        }
        if (dbVar != null) {
            wDHF_Contexte.m4999a(dbVar, true);
        } else {
            wDHF_Contexte.m5000a(new C0860m(C0542t.wd, C0745b.m3222b(Td[17], a.getString()), 0, "", "", "", "", ""));
            WDErreurManager.m2874a((int) C0542t.wd, r0.m6073e());
        }
        if (dbVar.isRequete() && z) {
            ((C0778b) dbVar).kb();
        }
        return dbVar;
    }

    /* renamed from: d */
    public static final C0778b m5184d(String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        db h = instance.m5021h(str);
        if (h == null) {
            h = instance.m5028l(str);
        }
        if (h != null) {
            instance.m5008b(h);
            return h;
        }
        WDErreurManager.m2883a(C0745b.m3222b(Td[17], str));
        return null;
    }

    /* renamed from: d */
    public static final String m5185d(WDObjet wDObjet, long j) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3672b(j);
    }

    /* renamed from: d */
    public static final String m5186d(WDObjet wDObjet, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3682c(wDObjet2 != null ? m5059a(instance, wDObjet2, false) : null);
    }

    /* renamed from: d */
    public static final String m5187d(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3634a(m5059a(instance, wDObjet2, true), 64, new String[]{wDObjet3.getString()});
    }

    /* renamed from: d */
    public static final String m5188d(WDObjet wDObjet, String str, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db b = m5129b(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        try {
            String str2 = "";
            if (b.m3604G()) {
                return x.mo2920d(b.m3717k(), str, i);
            }
            m5074a(x);
            return str2;
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
            return "";
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        }
    }

    /* renamed from: d */
    public static final String m5189d(WDObjet wDObjet, String str, String str2, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        try {
            String d2 = x.mo2921d(d.m3717k(), !C0808l.m4053k(str) ? C0897o.m6290j(str).getPath() : str, str2, i);
            if (!C0808l.m4053k(d2)) {
                return d2;
            }
            m5074a(x);
            return d2;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: d */
    public static void m5190d(WDHF_Contexte wDHF_Contexte) {
        try {
            if (WDProjet.getInstance().getNomAnalyseProjet().equals("")) {
                C0691a.m2856a(Td[3]);
                return;
            }
            InputStream ouvrirFluxAnalyseProjet = WDProjet.getInstance().ouvrirFluxAnalyseProjet();
            if (ouvrirFluxAnalyseProjet != null) {
                try {
                    C0847a.m5779b(wDHF_Contexte, ouvrirFluxAnalyseProjet);
                } catch (IOException e) {
                    throw e;
                } catch (Throwable th) {
                    if (ouvrirFluxAnalyseProjet != null) {
                        try {
                            ouvrirFluxAnalyseProjet.close();
                        } catch (Exception e2) {
                            C0691a.m2857a(Td[1], e2);
                        }
                    }
                }
            }
            if (!wDHF_Contexte.mo3087c()) {
                WDErreurManager.m2883a(C0745b.m3222b(Td[2], new String[0]));
            }
            if (ouvrirFluxAnalyseProjet != null) {
                try {
                    ouvrirFluxAnalyseProjet.close();
                } catch (Exception e3) {
                    C0691a.m2857a(Td[1], e3);
                }
            }
        } catch (IOException e4) {
            throw e4;
        }
    }

    /* renamed from: d */
    public static final boolean m5191d() {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        if (instance.m5016e()) {
            try {
                if (instance.m5043x().mo2924d()) {
                    return true;
                }
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
            } catch (WDJNIException e2) {
                m5075a(e2, instance.m5043x());
            }
        }
        return instance.m5035o();
    }

    /* renamed from: d */
    public static final boolean m5192d(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        if (!wDObjet.getString().equals(C0607n.Vc)) {
            return m5183d(instance, wDObjet, true).m3654a(null);
        }
        ArrayList arrayList = new ArrayList(instance.m5038r());
        Iterator l = instance.m5029l();
        while (l.hasNext()) {
            db dbVar = (db) l.next();
            if (!dbVar.m3612P() && dbVar.m3727p()) {
                arrayList.add(dbVar);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((db) it.next()).m3654a(null)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m5193d(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        String string = wDObjet2 != null ? wDObjet2.getString() : null;
        boolean z = wDObjet != null && wDObjet.getString().equals(C0607n.Vc);
        if (!z) {
            return m5183d(instance, wDObjet, false).mo2743b(string, i);
        }
        Iterator l = instance.m5029l();
        while (l.hasNext()) {
            if (!((db) l.next()).mo2743b(string, i)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static final boolean m5194d(WDObjet wDObjet, WDObjet wDObjet2, boolean z, long j) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3662a(m5059a(instance, wDObjet2, true), true, z, 1, j);
    }

    /* renamed from: d */
    public static final boolean m5195d(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        String string = wDObjet.getString();
        if (string.equals("")) {
            string = m5058a(instance).mo2719a();
        }
        C0832f c0832f = null;
        try {
            c0832f = instance.m5043x();
            boolean g = string.equals(C0607n.Vc) ? c0832f.mo2965g(str) : c0832f.mo2928d(string, str);
            if (g) {
                return g;
            }
            m5074a(c0832f);
            return g;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, c0832f);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: d */
    public static final boolean m5196d(WDObjet wDObjet, String str, String str2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean a = x.mo2836a(c.m4941a(), str, str2);
            if (a) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: d */
    public static final boolean m5197d(WDObjet wDObjet, String str, String str2, String str3) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean a = x.mo2840a(c.m4941a(), str, str2, str3);
            if (a) {
                return a;
            }
            m5074a(x);
            return a;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: e */
    public static final long m5198e(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3692d();
    }

    /* renamed from: e */
    public static final db m5199e(String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        db b = instance.m5004b(str);
        if (b == null) {
            b = instance.m5021h(str);
            if (b == null) {
                b = instance.m4991a(str, false);
            }
        }
        if (b != null) {
            instance.m5008b(b);
            return b;
        }
        WDErreurManager.m2883a(C0745b.m3222b(Td[17], str));
        return null;
    }

    /* renamed from: e */
    public static final String m5200e(WDObjet wDObjet, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, false);
        eb a = m5059a(instance, wDObjet2, false);
        C0832f x = instance.m5043x();
        try {
            String b = x.mo2871b(d.m3717k(), a.m5852i());
            if (!C0808l.m4053k(b)) {
                return b;
            }
            m5074a(x);
            return b;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: e */
    public static final String m5201e(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        if (wDObjet3.isMemoBinaire()) {
            return m5183d(instance, wDObjet, true).m3633a(m5059a(instance, wDObjet2, true), 2, wDObjet3);
        }
        return m5183d(instance, wDObjet, true).m3634a(m5059a(instance, wDObjet2, true), 2, new String[]{wDObjet3.getString()});
    }

    /* renamed from: e */
    public static final String m5202e(WDObjet wDObjet, String str, String str2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            String f = x.mo2949f(c.m4941a(), str, str2);
            if (!C0808l.m4053k(f)) {
                return f;
            }
            m5074a(x);
            return f;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: e */
    public static final String m5203e(WDObjet wDObjet, String str, String str2, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db b = m5129b(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        try {
            String b2 = x.mo2875b(b.m3717k(), !C0808l.m4053k(str) ? C0897o.m6290j(str).getPath() : str, str2, i);
            if (b2 != null) {
                return b2;
            }
            m5074a(x);
            return b2;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: e */
    public static final String m5204e(WDObjet wDObjet, String str, String str2, String str3) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db b = m5129b(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        try {
            String d = x.mo2922d(b.m3717k(), str, !C0808l.m4053k(str2) ? C0897o.m6290j(str2).getPath() : str2, str3);
            if (d != null) {
                return d;
            }
            m5074a(x);
            return d;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: e */
    private static final void m5205e(WDHF_Contexte wDHF_Contexte) {
        if (!wDHF_Contexte.mo3087c()) {
            WDErreurManager.m2883a(C0745b.m3222b(Td[12], new String[0]));
        }
    }

    /* renamed from: e */
    public static final boolean m5206e() {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        C0832f x = instance.m5043x();
        try {
            boolean l = x.mo3001l();
            if (l) {
                return l;
            }
            m5074a(x);
            return l;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: e */
    public static final boolean m5207e(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean o = x.mo3023o(c.m4941a(), i);
            if (o) {
                return o;
            }
            m5074a(x);
            return o;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: e */
    public static final boolean m5208e(WDObjet wDObjet, long j) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, false).m3686c(j);
    }

    /* renamed from: e */
    public static final boolean m5209e(WDObjet wDObjet, WDObjet wDObjet2, int i) {
        C0832f x;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        try {
            eb a;
            boolean g;
            instance.m5033n();
            db d = wDObjet.getString().equals(C0607n.Vc) ? null : m5183d(instance, wDObjet, false);
            if (wDObjet2 != null) {
                try {
                    if (!wDObjet2.getString().equals(C0607n.Vc)) {
                        a = m5059a(instance, wDObjet2, false);
                        x = instance.m5043x();
                        if (wDObjet == null) {
                            try {
                            } catch (C0841b e) {
                                throw e;
                            } catch (WDJNIException e2) {
                                m5075a(e2, x);
                                return false;
                            } catch (C0841b e3) {
                                throw e3;
                            } catch (Exception e4) {
                                WDErreurManager.m2882a(e4);
                                return false;
                            }
                        }
                        g = x.mo2961g(wDObjet == null ? 0 : d.m3717k(), wDObjet2 == null ? a.m5852i() : 0, i);
                        if (!g) {
                            return g;
                        }
                        m5074a(x);
                        return g;
                    }
                } catch (C0841b e32) {
                    throw e32;
                }
            }
            a = null;
            x = instance.m5043x();
            if (wDObjet2 == null) {
            }
            g = x.mo2961g(wDObjet == null ? 0 : d.m3717k(), wDObjet2 == null ? a.m5852i() : 0, i);
            if (!g) {
                return g;
            }
            m5074a(x);
            return g;
        } catch (C0841b e322) {
            throw e322;
        }
    }

    /* renamed from: e */
    public static final boolean m5210e(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean i = x.mo2982i(c.m4941a(), str);
            if (i) {
                return i;
            }
            m5074a(x);
            return i;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: e */
    public static final boolean m5211e(WDObjet wDObjet, String str, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean g = x.mo2963g(c.m4941a(), str, i);
            if (g) {
                return g;
            }
            m5074a(x);
            return g;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: f */
    public static final void m5212f(WDObjet wDObjet, WDObjet wDObjet2, WDObjet wDObjet3) {
        C0758k c0758k = (C0758k) wDObjet.checkType(C0758k.class);
        if (c0758k != null) {
            WDHF_Contexte instance = WDHF_Contexte.getInstance();
            instance.m5033n();
            m5183d(instance, wDObjet2, true).m3645a(c0758k, wDObjet3 != null ? m5059a(instance, wDObjet3, false) : null);
        }
    }

    /* renamed from: f */
    public static final boolean m5213f() {
        C0832f c0832f = null;
        try {
            c0832f = WDHF_Contexte.getInstance().m5043x();
            return c0832f.mo2813a();
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
            return false;
        } catch (WDJNIException e2) {
            m5075a(e2, c0832f);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m5214f(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean l = x.mo3002l(c.m4941a());
            if (l) {
                return l;
            }
            m5074a(x);
            return l;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m5215f(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean t = x.mo3047t(c.m4941a(), i);
            if (t) {
                return t;
            }
            m5074a(x);
            return t;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: f */
    public static final boolean m5216f(WDObjet wDObjet, WDObjet wDObjet2) {
        WDEnregistrement wDEnregistrement = null;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        eb a = wDObjet2.getString().equals(C0607n.Vc) ? null : m5059a(instance, wDObjet2, false);
        if (wDObjet != null) {
            wDEnregistrement = (WDEnregistrement) wDObjet.checkType(WDEnregistrement.class);
        }
        if (wDEnregistrement == null) {
            return m5183d(instance, wDObjet, true).m3700e(a);
        }
        wDEnregistrement.m4269a(a);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: f */
    public static final boolean m5217f(fr.pcsoft.wdjava.core.WDObjet r8, java.lang.String r9) {
        /*
        r2 = 0;
        r1 = 1;
        r0 = 0;
        if (r9 == 0) goto L_0x000d;
    L_0x0005:
        r3 = "";
        r3 = r9.equals(r3);	 Catch:{ IOException -> 0x005b }
        if (r3 == 0) goto L_0x001d;
    L_0x000d:
        r3 = Td;	 Catch:{ IOException -> 0x005b }
        r4 = 32;
        r3 = r3[r4];	 Catch:{ IOException -> 0x005b }
        r4 = 0;
        r4 = new java.lang.String[r4];	 Catch:{ IOException -> 0x005b }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);	 Catch:{ IOException -> 0x005b }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r3);	 Catch:{ IOException -> 0x005b }
    L_0x001d:
        r6 = fr.pcsoft.wdjava.file.C0897o.m6290j(r9);
        r3 = r6.exists();	 Catch:{ IOException -> 0x005d }
        if (r3 == 0) goto L_0x002d;
    L_0x0027:
        r3 = r6.isDirectory();	 Catch:{ IOException -> 0x005f }
        if (r3 != 0) goto L_0x003b;
    L_0x002d:
        r3 = r6.getAbsoluteFile();	 Catch:{ IOException -> 0x0061 }
        r3 = r3.getParentFile();	 Catch:{ IOException -> 0x0061 }
        r3 = r3.exists();	 Catch:{ IOException -> 0x0061 }
        if (r3 != 0) goto L_0x004e;
    L_0x003b:
        r3 = Td;	 Catch:{ IOException -> 0x0061 }
        r4 = 33;
        r3 = r3[r4];	 Catch:{ IOException -> 0x0061 }
        r4 = 1;
        r4 = new java.lang.String[r4];	 Catch:{ IOException -> 0x0061 }
        r5 = 0;
        r4[r5] = r9;	 Catch:{ IOException -> 0x0061 }
        r3 = fr.pcsoft.wdjava.core.ressources.messages.C0745b.m3222b(r3, r4);	 Catch:{ IOException -> 0x0061 }
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2883a(r3);	 Catch:{ IOException -> 0x0061 }
    L_0x004e:
        r3 = r8.isMemoBinaire();	 Catch:{ IOException -> 0x0063 }
        if (r3 != 0) goto L_0x0067;
    L_0x0054:
        r3 = r8.isChaine();	 Catch:{ IOException -> 0x0065 }
        if (r3 != 0) goto L_0x0067;
    L_0x005a:
        return r0;
    L_0x005b:
        r0 = move-exception;
        throw r0;
    L_0x005d:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x005f }
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r0 = move-exception;
        throw r0;	 Catch:{ IOException -> 0x0065 }
    L_0x0065:
        r0 = move-exception;
        throw r0;
    L_0x0067:
        r3 = r6.exists();	 Catch:{ IOException -> 0x00f8, all -> 0x00d8 }
        if (r3 != 0) goto L_0x0070;
    L_0x006d:
        r6.createNewFile();	 Catch:{ IOException -> 0x00f8, all -> 0x00d8 }
    L_0x0070:
        r3 = r8.getDonneeBinaire();	 Catch:{ IOException -> 0x00f8, all -> 0x00d8 }
        if (r3 != 0) goto L_0x00fe;
    L_0x0076:
        r3 = r8.toString();	 Catch:{ IOException -> 0x00f8, all -> 0x00d8 }
        r3 = fr.pcsoft.wdjava.core.C0725i.m3082k(r3);	 Catch:{ IOException -> 0x00f8, all -> 0x00d8 }
        r5 = r3;
    L_0x007f:
        r4 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x00f8, all -> 0x00d8 }
        r4.<init>(r6);	 Catch:{ IOException -> 0x00f8, all -> 0x00d8 }
        r3 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x00fb, all -> 0x00ef }
        r3.<init>(r5);	 Catch:{ IOException -> 0x00fb, all -> 0x00ef }
        r2 = 4096; // 0x1000 float:5.74E-42 double:2.0237E-320;
        r5 = new byte[r2];	 Catch:{ IOException -> 0x009c, all -> 0x00f2 }
    L_0x008d:
        r6 = 0;
        r6 = r3.read(r5, r6, r2);	 Catch:{ IOException -> 0x009c, all -> 0x00f2 }
        r7 = -1;
        if (r6 == r7) goto L_0x00cc;
    L_0x0095:
        r7 = 0;
        r4.write(r5, r7, r6);	 Catch:{ IOException -> 0x009a, all -> 0x00f2 }
        goto L_0x008d;
    L_0x009a:
        r1 = move-exception;
        throw r1;	 Catch:{ IOException -> 0x009c, all -> 0x00f2 }
    L_0x009c:
        r1 = move-exception;
        r2 = r3;
        r3 = r4;
    L_0x009f:
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00f6 }
        r4.<init>();	 Catch:{ all -> 0x00f6 }
        r5 = Td;	 Catch:{ all -> 0x00f6 }
        r6 = 31;
        r5 = r5[r6];	 Catch:{ all -> 0x00f6 }
        r4 = r4.append(r5);	 Catch:{ all -> 0x00f6 }
        r4 = r4.append(r9);	 Catch:{ all -> 0x00f6 }
        r5 = ".";
        r4 = r4.append(r5);	 Catch:{ all -> 0x00f6 }
        r4 = r4.toString();	 Catch:{ all -> 0x00f6 }
        fr.pcsoft.wdjava.core.debug.C0691a.m2863b(r4, r1);	 Catch:{ all -> 0x00f6 }
        if (r3 == 0) goto L_0x00c4;
    L_0x00c1:
        r3.close();	 Catch:{ IOException -> 0x00e9 }
    L_0x00c4:
        if (r2 == 0) goto L_0x005a;
    L_0x00c6:
        r2.close();	 Catch:{ IOException -> 0x00ca }
        goto L_0x005a;
    L_0x00ca:
        r1 = move-exception;
        goto L_0x005a;
    L_0x00cc:
        if (r4 == 0) goto L_0x00d1;
    L_0x00ce:
        r4.close();	 Catch:{ IOException -> 0x00e5 }
    L_0x00d1:
        if (r3 == 0) goto L_0x00d6;
    L_0x00d3:
        r3.close();	 Catch:{ IOException -> 0x00e7 }
    L_0x00d6:
        r0 = r1;
        goto L_0x005a;
    L_0x00d8:
        r0 = move-exception;
        r3 = r2;
    L_0x00da:
        if (r3 == 0) goto L_0x00df;
    L_0x00dc:
        r3.close();	 Catch:{ IOException -> 0x00eb }
    L_0x00df:
        if (r2 == 0) goto L_0x00e4;
    L_0x00e1:
        r2.close();	 Catch:{ IOException -> 0x00ed }
    L_0x00e4:
        throw r0;
    L_0x00e5:
        r0 = move-exception;
        goto L_0x00d1;
    L_0x00e7:
        r0 = move-exception;
        goto L_0x00d6;
    L_0x00e9:
        r1 = move-exception;
        goto L_0x00c4;
    L_0x00eb:
        r1 = move-exception;
        goto L_0x00df;
    L_0x00ed:
        r1 = move-exception;
        goto L_0x00e4;
    L_0x00ef:
        r0 = move-exception;
        r3 = r4;
        goto L_0x00da;
    L_0x00f2:
        r0 = move-exception;
        r2 = r3;
        r3 = r4;
        goto L_0x00da;
    L_0x00f6:
        r0 = move-exception;
        goto L_0x00da;
    L_0x00f8:
        r1 = move-exception;
        r3 = r2;
        goto L_0x009f;
    L_0x00fb:
        r1 = move-exception;
        r3 = r4;
        goto L_0x009f;
    L_0x00fe:
        r5 = r3;
        goto L_0x007f;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.WDHF_Manager.f(fr.pcsoft.wdjava.core.WDObjet, java.lang.String):boolean");
    }

    /* renamed from: f */
    public static final boolean m5218f(WDObjet wDObjet, String str, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion a = m5057a(instance, wDObjet);
        try {
            if (a.m4953c()) {
                C0832f c0832f = null;
                try {
                    c0832f = instance.m5043x();
                    boolean b = c0832f.mo2883b(a.m4941a(), str, i);
                    if (!b) {
                        m5074a(c0832f);
                    }
                    return b;
                } catch (C0841b e) {
                    throw e;
                } catch (WDJNIException e2) {
                    m5075a(e2, c0832f);
                    return false;
                } catch (Exception e3) {
                    WDErreurManager.m2882a(e3);
                    return false;
                }
            }
            WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Td[4], WDAppelContexte.getContexte().m2731r()), ""));
            return false;
        } catch (C0841b e4) {
            throw e4;
        }
    }

    /* renamed from: f */
    public static final boolean m5219f(WDObjet wDObjet, String str, String str2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = str2 != null ? m5162c(instance, wDObjet, true) : instance.m5019g(wDObjet.getString());
        C0832f x = instance.m5043x();
        if (str2 != null) {
            try {
                boolean b = x.mo2885b(c.m4941a(), str, str2);
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                m5075a(e2, x);
                return false;
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
                return false;
            }
        }
        b = c != null ? x.mo2885b(c.m4941a(), str, "") : x.mo2895b(wDObjet.getString(), str);
        if (b) {
            return b;
        }
        m5074a(x);
        return b;
    }

    /* renamed from: f */
    public static final boolean m5220f(String str) {
        boolean a;
        WDJNIException e;
        Exception e2;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        C0832f c0832f = null;
        try {
            c0832f = instance.m5043x();
            a = c0832f.mo2850a(str);
            if (!a) {
                try {
                    m5074a(c0832f);
                } catch (C0841b e3) {
                    throw e3;
                } catch (WDJNIException e4) {
                    e = e4;
                    m5075a(e, c0832f);
                    return a;
                } catch (C0841b e5) {
                    e2 = e5;
                }
            }
        } catch (Exception e6) {
            Exception exception = e6;
            a = false;
            e2 = exception;
            WDErreurManager.m2882a(e2);
            return a;
        } catch (WDJNIException e7) {
            WDJNIException wDJNIException = e7;
            a = false;
            e = wDJNIException;
            m5075a(e, c0832f);
            return a;
        }
        return a;
    }

    /* renamed from: g */
    public static final int m5221g(WDObjet wDObjet) {
        int i = 0;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            i = x.mo3035r(c.m4941a());
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
        } catch (WDJNIException e2) {
            m5075a(e2, x);
        }
        return i;
    }

    /* renamed from: g */
    public static final long m5222g(WDObjet wDObjet, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, false);
        eb a = m5059a(instance, wDObjet2, false);
        C0832f x = instance.m5043x();
        try {
            long q = x.mo3030q(d.m3717k(), a.m5852i());
            if (q != -1) {
                return q;
            }
            m5074a(x);
            return q;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return -1;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return -1;
        }
    }

    /* renamed from: g */
    public static final String m5223g(WDObjet wDObjet, String str, String str2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            String c2 = x.mo2903c(c.m4941a(), str, str2);
            if (!C0808l.m4053k(c2)) {
                return c2;
            }
            m5074a(x);
            return c2;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: g */
    public static final boolean m5224g() {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        C0832f x = instance.m5043x();
        try {
            boolean r = x.mo3037r();
            if (r) {
                return r;
            }
            m5074a(x);
            return r;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: g */
    public static final boolean m5225g(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3675b(i);
    }

    /* renamed from: g */
    public static final boolean m5226g(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean h = x.mo2974h(c.m4941a(), str);
            if (h) {
                return h;
            }
            m5074a(x);
            return h;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: g */
    public static final boolean m5227g(String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        C0832f x = instance.m5043x();
        try {
            boolean l = x.mo3005l(str);
            if (l) {
                return l;
            }
            m5074a(x);
            return l;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: h */
    public static final int m5228h(WDObjet wDObjet, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3625a(wDObjet2 != null ? WDJaugeJNI.create(wDObjet2) : null);
    }

    /* renamed from: h */
    public static final String m5229h(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db b = m5129b(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        try {
            String q = x.mo3031q(b.m3717k(), i);
            if (q != null) {
                return q;
            }
            m5074a(x);
            return q;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return null;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return null;
        }
    }

    /* renamed from: h */
    public static final boolean m5230h() {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        C0832f x = instance.m5043x();
        try {
            boolean z = x.mo3067z();
            if (z) {
                return z;
            }
            m5074a(x);
            return z;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: h */
    public static final boolean m5231h(WDObjet wDObjet) {
        return m5183d(WDHF_Contexte.getInstance(), wDObjet, false).m3599B();
    }

    /* renamed from: h */
    public static final boolean m5232h(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db b = m5129b(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        try {
            boolean o = x.mo3024o(b.m3717k(), str);
            if (o) {
                return o;
            }
            m5074a(x);
            return o;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: i */
    public static final String m5233i(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            return x.mo2946f(c.m4941a(), i);
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
            return "";
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        }
    }

    /* renamed from: i */
    public static final String m5234i(WDObjet wDObjet, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, false);
        eb a = m5059a(instance, wDObjet2, false);
        C0832f x = instance.m5043x();
        try {
            String p = x.mo3027p(d.m3717k(), a.m5852i());
            if (!C0808l.m4053k(p)) {
                return p;
            }
            m5074a(x);
            return p;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: i */
    public static final boolean m5235i(WDObjet wDObjet) {
        return m5183d(WDHF_Contexte.getInstance(), wDObjet, true).ab();
    }

    /* renamed from: i */
    public static final boolean m5236i(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean l = x.mo3004l(c.m4941a(), str);
            if (l) {
                return l;
            }
            m5074a(x);
            return l;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: j */
    public static final int m5237j(WDObjet wDObjet, WDObjet wDObjet2) {
        eb a;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        if (wDObjet2 != null) {
            a = m5059a(instance, wDObjet2, false);
        } else {
            WDObjet wDObjet3 = wDObjet2;
        }
        return m5183d(instance, wDObjet, true).m3669b(a);
    }

    /* renamed from: j */
    public static final String m5238j(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            String F = x.mo2767F(c.m4941a());
            if (F != null) {
                return F;
            }
            m5074a(x);
            return F;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return null;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return null;
        }
    }

    /* renamed from: j */
    public static final boolean m5239j(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean l = x.mo3003l(c.m4941a(), i);
            if (l) {
                return l;
            }
            m5074a(x);
            return l;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: j */
    public static final boolean m5240j(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean k = x.mo2996k(c.m4941a(), str);
            if (k) {
                return k;
            }
            m5074a(x);
            return k;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: k */
    public static final String m5241k(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion g = instance.m5019g(wDObjet.getString());
        C0832f x = instance.m5043x();
        if (g != null) {
            try {
                String a = x.mo2793a(g.m4941a(), i);
            } catch (C0841b e) {
                throw e;
            } catch (WDJNIException e2) {
                m5075a(e2, x);
                return "";
            } catch (Exception e3) {
                WDErreurManager.m2882a(e3);
                return "";
            }
        }
        a = x.mo2957g(wDObjet.getString(), i);
        if (!C0808l.m4053k(a)) {
            return a;
        }
        m5074a(x);
        return a;
    }

    /* renamed from: k */
    public static final String m5242k(WDObjet wDObjet, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db b = m5129b(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        try {
            String l = x.mo3000l(b.m3717k(), m5059a(instance, wDObjet2, false).m5852i());
            if (l != null) {
                return l;
            }
            m5074a(x);
            return l;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return null;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return null;
        }
    }

    /* renamed from: k */
    public static final boolean m5243k(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean I = x.mo2770I(c.m4941a());
            if (I) {
                return I;
            }
            m5074a(x);
            return I;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: k */
    public static final String[] m5244k(WDObjet wDObjet, String str) {
        String[] strArr = null;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db b = m5129b(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        try {
            strArr = x.mo3012m(b.m3717k(), str);
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
        } catch (WDJNIException e2) {
            m5075a(e2, x);
        }
        return strArr;
    }

    /* renamed from: l */
    public static final long m5245l(WDObjet wDObjet, WDObjet wDObjet2) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, false);
        eb a = m5059a(instance, wDObjet2, false);
        C0832f x = instance.m5043x();
        try {
            long o = x.mo3019o(d.m3717k(), a.m5852i());
            if (o != -1) {
                return o;
            }
            m5074a(x);
            return o;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return -1;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return -1;
        }
    }

    /* renamed from: l */
    public static final String m5246l(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            String h = x.mo2967h(c.m4941a(), i);
            if (!C0808l.m4053k(h)) {
                return h;
            }
            m5074a(x);
            return h;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: l */
    public static final boolean m5247l(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3618X();
    }

    /* renamed from: l */
    public static final boolean m5248l(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean j = x.mo2989j(c.m4941a(), str);
            if (j) {
                return j;
            }
            m5074a(x);
            return j;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: m */
    public static final int m5249m(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        try {
            instance.m5033n();
            if (wDObjet == null || wDObjet.getString().equals(C0607n.Vc)) {
                C0832f c0832f = null;
                try {
                    c0832f = instance.m5043x();
                    int u = c0832f.mo3050u(-1, i);
                    if (u < 0) {
                        m5074a(c0832f);
                        return u;
                    }
                    instance.m5007b(i);
                    return u;
                } catch (C0841b e) {
                    throw e;
                } catch (WDJNIException e2) {
                    m5075a(e2, c0832f);
                } catch (Exception e3) {
                    WDErreurManager.m2882a(e3);
                }
            }
            return m5183d(instance, wDObjet, true).m3621a(i);
        } catch (C0841b e4) {
            throw e4;
        }
    }

    /* renamed from: m */
    public static final boolean m5250m(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3735w();
    }

    /* renamed from: m */
    public static final boolean m5251m(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean r = x.mo3039r(c.m4941a(), str);
            if (r) {
                return r;
            }
            m5074a(x);
            return r;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: n */
    public static final int m5252n(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        try {
            long k;
            instance.m5033n();
            db d = wDObjet != null ? m5183d(instance, wDObjet, false) : null;
            C0832f x = instance.m5043x();
            if (d != null) {
                try {
                    k = d.m3717k();
                } catch (Exception e) {
                    WDErreurManager.m2882a(e);
                    return 0;
                } catch (WDJNIException e2) {
                    m5075a(e2, x);
                    return 0;
                }
            }
            k = 0;
            int n = x.mo3013n(k, i);
            if (n < 0) {
                m5074a(x);
                n = 0;
            }
            return n;
        } catch (C0841b e3) {
            throw e3;
        }
    }

    /* renamed from: n */
    public static final boolean m5253n(WDObjet wDObjet) {
        return m5183d(WDHF_Contexte.getInstance(), wDObjet, false).m3724o();
    }

    /* renamed from: n */
    public static final boolean m5254n(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean b = x.mo2882b(c.m4941a(), str);
            if (b) {
                return b;
            }
            m5074a(x);
            return b;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: o */
    public static final boolean m5255o(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5057a(instance, wDObjet).m4947a(true, null);
    }

    /* renamed from: o */
    public static final boolean m5256o(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean w = x.mo3059w(c.m4941a(), i);
            if (w) {
                return w;
            }
            m5074a(x);
            return w;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: o */
    public static final boolean m5257o(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean v = x.mo3056v(c.m4941a(), str);
            if (v) {
                return v;
            }
            m5074a(x);
            return v;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    public static final void onActionClient(int i, String[] strArr, WDObjet... wDObjetArr) {
        boolean z = i == C0542t.f1207w;
        C0938m.m6810a(new C0874v(z ? Sd : Rd, strArr, wDObjetArr, i, z));
    }

    public static final int onErreurHF(long j, int i, int i2, String str) {
        WDHF_Contexte b = WDHF_Contexte.m4980b(j);
        C0691a.m2860a(b != null, Td[6]);
        if (b == null) {
            return 0;
        }
        b.m5018f();
        C0875w b2 = b.m5005b(i2, str);
        if (b2 != null) {
            return b2.mo3181d();
        }
        if (!WDProjet.getInstance().isAssistanceAutoHFActive()) {
            return 0;
        }
        switch (i2) {
            case 1024:
                return m5126b(b);
            default:
                C0691a.m2856a(Td[5]);
                return 0;
        }
    }

    /* renamed from: p */
    public static final String m5258p(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            String g = x.mo2956g(c.m4941a(), i);
            if (!C0808l.m4053k(g)) {
                return g;
            }
            m5074a(x);
            return g;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: p */
    public static final String m5259p(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            String x2 = x.mo3063x(c.m4941a(), str);
            if (!C0808l.m4053k(x2)) {
                return x2;
            }
            m5074a(x);
            return x2;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: p */
    public static final void m5260p(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        try {
            instance.m5033n();
            if (wDObjet == null || !wDObjet.getString().equals(C0607n.Vc)) {
                m5183d(instance, wDObjet, true).m3737y();
                return;
            }
            C0832f c0832f = null;
            try {
                c0832f = instance.m5043x();
                c0832f.mo2979i(-1);
            } catch (Exception e) {
                WDErreurManager.m2882a(e);
            } catch (WDJNIException e2) {
                m5075a(e2, c0832f);
            }
        } catch (C0841b e3) {
            throw e3;
        }
    }

    /* renamed from: q */
    public static final String m5261q(WDObjet wDObjet, String str) {
        return "";
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* renamed from: q */
    public static final boolean m5262q(fr.pcsoft.wdjava.core.WDObjet r9) {
        /*
        r0 = 1;
        r2 = 0;
        r3 = fr.pcsoft.wdjava.database.hf.WDHF_Contexte.getInstance();
        r3.m5033n();
        r1 = r9.getString();	 Catch:{ b -> 0x005f }
        r4 = "*";
        r1 = r1.equals(r4);	 Catch:{ b -> 0x005f }
        if (r1 != 0) goto L_0x0021;
    L_0x0015:
        r1 = r9.getString();	 Catch:{ b -> 0x0061 }
        r4 = "";
        r1 = r1.equals(r4);	 Catch:{ b -> 0x0061 }
        if (r1 == 0) goto L_0x0063;
    L_0x0021:
        r1 = r0;
    L_0x0022:
        if (r1 == 0) goto L_0x007a;
    L_0x0024:
        r4 = r3.m5029l();
        r1 = r0;
    L_0x0029:
        r0 = r4.hasNext();
        if (r0 == 0) goto L_0x005e;
    L_0x002f:
        r0 = r4.next();
        r0 = (fr.pcsoft.wdjava.database.hf.db) r0;
        if (r0 == 0) goto L_0x0055;
    L_0x0037:
        r3 = r0.m3716j();	 Catch:{ b -> 0x0065 }
        if (r3 == 0) goto L_0x0055;
    L_0x003d:
        r3 = r0.m3731s();	 Catch:{ b -> 0x0067 }
        if (r3 == 0) goto L_0x0029;
    L_0x0043:
        r5 = r0.mo2753v();
        r6 = r0.m3717k();	 Catch:{ b -> 0x00d6, WDJNIException -> 0x0071 }
        r3 = r5.mo3028p(r6);	 Catch:{ b -> 0x00d6, WDJNIException -> 0x0071 }
        if (r3 != 0) goto L_0x0054;
    L_0x0051:
        m5074a(r5);	 Catch:{ b -> 0x0069, WDJNIException -> 0x00d4 }
    L_0x0054:
        r1 = r3;
    L_0x0055:
        if (r1 == 0) goto L_0x0029;
    L_0x0057:
        r0 = r0.m3610N();
        if (r0 != 0) goto L_0x0029;
    L_0x005d:
        r1 = r2;
    L_0x005e:
        return r1;
    L_0x005f:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x0061 }
    L_0x0061:
        r0 = move-exception;
        throw r0;
    L_0x0063:
        r1 = r2;
        goto L_0x0022;
    L_0x0065:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x0067 }
    L_0x0067:
        r0 = move-exception;
        throw r0;
    L_0x0069:
        r1 = move-exception;
        throw r1;	 Catch:{ b -> 0x006b, WDJNIException -> 0x00d4 }
    L_0x006b:
        r1 = move-exception;
    L_0x006c:
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2882a(r1);
        r1 = r3;
        goto L_0x0055;
    L_0x0071:
        r3 = move-exception;
        r8 = r3;
        r3 = r1;
        r1 = r8;
    L_0x0075:
        m5075a(r1, r5);
        r1 = r3;
        goto L_0x0055;
    L_0x007a:
        r3 = m5183d(r3, r9, r2);
        if (r3 == 0) goto L_0x00db;
    L_0x0080:
        r1 = r3.m3716j();	 Catch:{ b -> 0x00af }
        if (r1 == 0) goto L_0x00db;
    L_0x0086:
        r1 = r3.m3731s();	 Catch:{ b -> 0x00af }
        if (r1 == 0) goto L_0x00db;
    L_0x008c:
        r2 = 0;
        r2 = r3.mo2753v();	 Catch:{ b -> 0x00cf, WDJNIException -> 0x00b8 }
        r4 = r3.m3717k();	 Catch:{ b -> 0x00cf, WDJNIException -> 0x00c4 }
        r1 = r2.mo3028p(r4);	 Catch:{ b -> 0x00cf, WDJNIException -> 0x00c4 }
        if (r1 != 0) goto L_0x00a2;
    L_0x009b:
        r0 = r3.mo2753v();	 Catch:{ b -> 0x00b1, WDJNIException -> 0x00ca }
        m5074a(r0);	 Catch:{ b -> 0x00b1, WDJNIException -> 0x00ca }
    L_0x00a2:
        r0 = r3.m3716j();	 Catch:{ b -> 0x00c2 }
        if (r0 == 0) goto L_0x00aa;
    L_0x00a8:
        if (r1 == 0) goto L_0x005e;
    L_0x00aa:
        r1 = r3.m3610N();
        goto L_0x005e;
    L_0x00af:
        r0 = move-exception;
        throw r0;
    L_0x00b1:
        r0 = move-exception;
        throw r0;	 Catch:{ b -> 0x00b3, WDJNIException -> 0x00ca }
    L_0x00b3:
        r0 = move-exception;
    L_0x00b4:
        fr.pcsoft.wdjava.core.erreur.WDErreurManager.m2882a(r0);
        goto L_0x00a2;
    L_0x00b8:
        r1 = move-exception;
        r8 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r8;
    L_0x00bd:
        m5075a(r0, r1);
        r1 = r2;
        goto L_0x00a2;
    L_0x00c2:
        r0 = move-exception;
        throw r0;
    L_0x00c4:
        r1 = move-exception;
        r8 = r1;
        r1 = r2;
        r2 = r0;
        r0 = r8;
        goto L_0x00bd;
    L_0x00ca:
        r0 = move-exception;
        r8 = r2;
        r2 = r1;
        r1 = r8;
        goto L_0x00bd;
    L_0x00cf:
        r1 = move-exception;
        r8 = r1;
        r1 = r0;
        r0 = r8;
        goto L_0x00b4;
    L_0x00d4:
        r1 = move-exception;
        goto L_0x0075;
    L_0x00d6:
        r3 = move-exception;
        r8 = r3;
        r3 = r1;
        r1 = r8;
        goto L_0x006c;
    L_0x00db:
        r1 = r0;
        goto L_0x00a2;
        */
        throw new UnsupportedOperationException("Method not decompiled: fr.pcsoft.wdjava.database.hf.WDHF_Manager.q(fr.pcsoft.wdjava.core.WDObjet):boolean");
    }

    /* renamed from: q */
    public static final boolean m5263q(WDObjet wDObjet, int i) {
        WDHF_Contexte.getInstance().m4994a(i, wDObjet.getString().equals(C0607n.Vc) ? null : wDObjet.getString());
        return true;
    }

    /* renamed from: r */
    public static final boolean m5264r(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, false).mo2737H();
    }

    /* renamed from: r */
    public static final boolean m5265r(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean t = x.mo3047t(c.m4941a(), i);
            if (t) {
                return t;
            }
            m5074a(x);
            return t;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: r */
    public static final boolean m5266r(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        try {
            boolean u = x.mo3052u(d.m3717k(), str);
            if (u) {
                return u;
            }
            m5074a(x);
            return u;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: s */
    public static final String m5267s(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        WDHF_Connexion a = m5057a(instance, wDObjet);
        try {
            if (a.m4953c()) {
                C0832f c0832f = null;
                try {
                    c0832f = instance.m5043x();
                    String w = c0832f.mo3058w(a.m4941a());
                    if (w != null) {
                        return w;
                    }
                    m5074a(c0832f);
                    return w;
                } catch (C0841b e) {
                    throw e;
                } catch (WDJNIException e2) {
                    m5075a(e2, c0832f);
                    return "";
                } catch (Exception e3) {
                    WDErreurManager.m2882a(e3);
                    return "";
                }
            }
            WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Td[4], C0745b.m3221b(Td[14])), ""));
            return "";
        } catch (C0841b e4) {
            throw e4;
        }
    }

    /* renamed from: s */
    public static final boolean m5268s(WDObjet wDObjet, int i) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        try {
            long a;
            instance.m5033n();
            WDHF_Connexion c = wDObjet != null ? m5162c(instance, wDObjet, true) : null;
            C0832f x = instance.m5043x();
            if (c != null) {
                try {
                    a = c.m4941a();
                } catch (C0841b e) {
                    throw e;
                } catch (WDJNIException e2) {
                    m5075a(e2, x);
                    return false;
                } catch (Exception e3) {
                    WDErreurManager.m2882a(e3);
                    return false;
                }
            }
            a = -1;
            boolean v = x.mo3055v(a, i);
            if (v) {
                return v;
            }
            m5074a(x);
            return v;
        } catch (C0841b e4) {
            throw e4;
        }
    }

    /* renamed from: s */
    public static final boolean m5269s(WDObjet wDObjet, String str) {
        WDJNIException e;
        Exception e2;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        if (!wDObjet.getString().equals(C0607n.Vc)) {
            return m5183d(instance, wDObjet, true).m3690c(str);
        }
        C0832f c0832f = null;
        boolean m;
        try {
            c0832f = instance.m5043x();
            m = c0832f.mo3011m(str);
            if (m) {
                return m;
            }
            try {
                m5074a(c0832f);
                return m;
            } catch (C0841b e3) {
                throw e3;
            } catch (WDJNIException e4) {
                e = e4;
                m5075a(e, c0832f);
                return m;
            } catch (C0841b e5) {
                e2 = e5;
            }
        } catch (Exception e6) {
            Exception exception = e6;
            m = false;
            e2 = exception;
            WDErreurManager.m2882a(e2);
            return m;
        } catch (WDJNIException e7) {
            WDJNIException wDJNIException = e7;
            m = false;
            e = wDJNIException;
            m5075a(e, c0832f);
            return m;
        }
    }

    /* renamed from: t */
    public static final int m5270t(WDObjet wDObjet, int i) {
        int i2 = 0;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            i2 = x.mo2859b(c.m4941a(), i);
        } catch (Exception e) {
            WDErreurManager.m2882a(e);
        } catch (WDJNIException e2) {
            m5075a(e2, x);
        }
        return i2;
    }

    /* renamed from: t */
    public static final boolean m5271t(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5057a(instance, wDObjet).m4969q();
    }

    /* renamed from: t */
    public static final boolean m5272t(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean e = x.mo2939e(c.m4941a(), str);
            if (e) {
                return e;
            }
            m5074a(x);
            return e;
        } catch (C0841b e2) {
            throw e2;
        } catch (WDJNIException e3) {
            m5075a(e3, x);
            return false;
        } catch (Exception e4) {
            WDErreurManager.m2882a(e4);
            return false;
        }
    }

    /* renamed from: u */
    public static final String m5273u(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            String G = x.mo2768G(c.m4941a());
            if (!C0808l.m4053k(G)) {
                return G;
            }
            m5074a(x);
            return G;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: u */
    public static final boolean m5274u(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3725o(str);
    }

    /* renamed from: v */
    public static final boolean m5275v(WDObjet wDObjet) {
        boolean q;
        WDJNIException e;
        Exception e2;
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        C0832f c0832f = null;
        try {
            c0832f = instance.m5043x();
            q = wDObjet != null ? wDObjet.getString().equals(Td[9]) ? c0832f.mo3032q(-1) : c0832f.mo3032q(m5057a(instance, wDObjet).m4941a()) : c0832f.mo3008m();
            if (!q) {
                try {
                    m5074a(c0832f);
                } catch (C0841b e3) {
                    throw e3;
                } catch (WDJNIException e4) {
                    e = e4;
                    m5075a(e, c0832f);
                    return q;
                } catch (C0841b e5) {
                    e2 = e5;
                }
            }
        } catch (C0841b e6) {
            throw e6;
        } catch (WDJNIException e7) {
            WDJNIException wDJNIException = e7;
            q = false;
            e = wDJNIException;
            m5075a(e, c0832f);
            return q;
        } catch (Exception e8) {
            Exception exception = e8;
            q = false;
            e2 = exception;
        }
        return q;
        WDErreurManager.m2882a(e2);
        return q;
    }

    /* renamed from: v */
    public static final boolean m5276v(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean t = x.mo3048t(c.m4941a(), str);
            if (t) {
                return t;
            }
            m5074a(x);
            return t;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: w */
    public static final boolean m5277w(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        db d = m5183d(instance, wDObjet, false);
        C0832f x = instance.m5043x();
        try {
            boolean s = x.mo3042s(d.m3717k());
            if (s) {
                return s;
            }
            m5074a(x);
            return s;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: w */
    public static final boolean m5278w(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion a = m5057a(instance, wDObjet);
        try {
            if (a.m4953c()) {
                C0832f c0832f = null;
                try {
                    c0832f = instance.m5043x();
                    boolean s = c0832f.mo3044s(a.m4941a(), str);
                    if (!s) {
                        m5074a(c0832f);
                    }
                    return s;
                } catch (C0841b e) {
                    throw e;
                } catch (WDJNIException e2) {
                    m5075a(e2, c0832f);
                    return false;
                } catch (Exception e3) {
                    WDErreurManager.m2882a(e3);
                    return false;
                }
            }
            WDHF_Contexte.getInstance().m5000a(new C0860m(C0607n.yr, C0745b.m3222b(Td[4], WDAppelContexte.getContexte().m2731r()), ""));
            return false;
        } catch (C0841b e4) {
            throw e4;
        }
    }

    /* renamed from: x */
    public static final boolean m5279x(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        return m5183d(instance, wDObjet, true).m3730r();
    }

    /* renamed from: x */
    public static final boolean m5280x(WDObjet wDObjet, String str) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            boolean g = x.mo2962g(c.m4941a(), str);
            if (g) {
                return g;
            }
            m5074a(x);
            return g;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return false;
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return false;
        }
    }

    /* renamed from: y */
    public static final String m5281y(WDObjet wDObjet) {
        WDHF_Contexte instance = WDHF_Contexte.getInstance();
        instance.m5033n();
        WDHF_Connexion c = m5162c(instance, wDObjet, true);
        C0832f x = instance.m5043x();
        try {
            String y = x.mo3064y(c.m4941a());
            if (!C0808l.m4053k(y)) {
                return y;
            }
            m5074a(x);
            return y;
        } catch (C0841b e) {
            throw e;
        } catch (WDJNIException e2) {
            m5075a(e2, x);
            return "";
        } catch (Exception e3) {
            WDErreurManager.m2882a(e3);
            return "";
        }
    }

    /* renamed from: z */
    private static String m5282z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 67;
                    break;
                case 1:
                    i2 = 36;
                    break;
                case 2:
                    i2 = 31;
                    break;
                case 3:
                    i2 = 58;
                    break;
                default:
                    i2 = 69;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m5283z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 69);
        }
        return toCharArray;
    }
}
