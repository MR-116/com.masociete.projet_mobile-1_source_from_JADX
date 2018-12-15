package fr.pcsoft.wdjava.ui.dialogue;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.C0728o;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.application.C0638a;
import fr.pcsoft.wdjava.core.application.C0651k;
import fr.pcsoft.wdjava.core.application.WDAppManager;
import fr.pcsoft.wdjava.core.application.WDProjet;
import fr.pcsoft.wdjava.core.context.WDAppelContexte;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.report.C0697b;
import fr.pcsoft.wdjava.core.p042b.C0657a;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.C0548s;
import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDDate;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDHeure;
import fr.pcsoft.wdjava.core.types.WDVariant;
import fr.pcsoft.wdjava.core.types.hb;
import fr.pcsoft.wdjava.core.utils.C0806j;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.core.utils.ac;
import fr.pcsoft.wdjava.core.utils.bb;
import fr.pcsoft.wdjava.core.utils.kb;
import fr.pcsoft.wdjava.tlm.C1029b;
import fr.pcsoft.wdjava.tlm.WDTelemetrie;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.activite.WDActivite.BlankActivity;
import fr.pcsoft.wdjava.ui.champs.fenetre.C0508h;
import fr.pcsoft.wdjava.ui.champs.fenetre.C1155i;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.p065b.C1093d;
import fr.pcsoft.wdjava.ui.p080h.C1424g;
import fr.pcsoft.wdjava.ui.p080h.C1426i;
import fr.pcsoft.wdjava.ui.utils.C1503b;
import fr.pcsoft.wdjava.ui.utils.C1511l;
import java.io.File;

class WDMsgBoxManagerImpl extends C1372f {
    /* renamed from: H */
    private static final String f4116H = m9858z(m9859z("\u001cXN\u001e(\u001cT(\u0007!\u001cU(\u0019*\u0011S2\u0016"));
    /* renamed from: I */
    private static final String f4117I = m9858z(m9859z("\u001cXN\u001e(\u001cF=\u0019:\u0007B;\u0016 \u000eF$\u0005:\u001c"));
    /* renamed from: J */
    private static final String[] f4118J;

    static {
        r0 = new String[35];
        r0[0] = m9858z(m9859z("`I\"\u0007"));
        r0[1] = m9858z(m9859z("`H8\u0000"));
        r0[2] = m9858z(m9859z("!h\u0018=\n-W\f;!&a\f<\u0011"));
        r0[3] = m9858z(m9859z("/n\u000f"));
        r0[4] = m9858z(m9859z("7~\u001d,"));
        r0[5] = m9858z(m9859z("7f\u000f\u000b\n6s\u0002'"));
        r0[6] = m9858z(m9859z("5f\u0001"));
        r0[7] = m9858z(m9859z("\u000bO \u00046\u0010"));
        r0[8] = m9858z(m9859z("\u0016S+d]"));
        r0[9] = m9858z(m9859z("7n\u0019;\u0000"));
        r0[10] = m9858z(m9859z(".b\u001e:\u0004$b"));
        r0[11] = m9858z(m9859z("\u0014n\u0003\r\u00005J\u0002+\f/b) \u0004/h\n\u000b\n;"));
        r0[12] = m9858z(m9859z("\u0002F,\b(\u000eM'"));
        r0[13] = m9858z(m9859z("%h\u001f$\u00047J\b$\n1n\u001e,"));
        r0[14] = m9858z(m9859z(".t\n+\n;X\u001d,\u00170h"));
        r0[15] = m9858z(m9859z("!h\u0018=\n-F\u0003'\u0010/f\u0019 \n-"));
        r0[16] = m9858z(m9859z("\"c\f9\u0011&K\f;\u0002&r\u001f"));
        r0[17] = m9858z(m9859z("\nj\u001d&\u00160n\u000f%\u0000cc\bi\u0006+f\u001f.\u00001'\u0001(E'b\u001e*\u0017*w\u0019 \n-'\t,E/fM+\n*s\bi\u0001&'\t \u0004/h\n<\u0000cf\u0018i\u0003,u\u0000(\u0011cM>\u0006+"));
        r0[18] = m9858z(m9859z("0f\u0004:\f&"));
        r0[19] = m9858z(m9859z(".f\u001e8\u0010&T\f \u0016*b"));
        r0[20] = m9858z(m9859z("5f\u0001,\u00101"));
        r0[21] = m9858z(m9859z("6s\u0004%\f0b9&\u00107b!()\"u\n,\u00101"));
        r0[22] = m9858z(m9859z("`H&"));
        r0[23] = m9858z(m9859z("`F#\u00070\u000fB?"));
        r0[24] = m9858z(m9859z("`U(\u0019*\u0011S2\f7\u0011H?"));
        r0[25] = m9858z(m9859z("`F?\u001b \u0017X,\u00195\u000fN.\b1\nH#"));
        r0[26] = m9858z(m9859z("`$N"));
        r0[27] = m9858z(m9859z("`U(\u0019*\u0011S2\f+\u0015H$\u0016 \u000eF$\u0005:q"));
        r0[28] = m9858z(m9859z("N\r"));
        r0[29] = m9858z(m9859z("\u0010F \u001a0\r@"));
        r0[30] = m9858z(m9859z("\u0014n\u0003\r\u00005J\u0002+\f/b ,\u00160f\n,',"));
        r0[31] = m9858z(m9859z("`F>\u001a \u0011S"));
        r0[32] = m9858z(m9859z("\u0013n\u0001,Ey\r"));
        r0[33] = m9858z(m9859z("`V8\u00001\u0017B?\u0016$\u0013W!\u0000&\u0002S$\u0006+"));
        r0[34] = m9858z(m9859z("`D\"\u00071\nI8\f7"));
        f4118J = r0;
    }

    WDMsgBoxManagerImpl() {
    }

    /* renamed from: a */
    private void m9854a(Dialog dialog, boolean z) {
        C1029b monitor;
        int[] iArr = new int[]{C0806j.m3952b()};
        dialog.setOnDismissListener(new C1377e(this, dialog, z, iArr));
        if (z && WDTelemetrie.m7399e().mo3313h()) {
            WDFenetre wDFenetre = (WDFenetre) WDAppelContexte.getContexte().m2722h();
            monitor = wDFenetre != null ? wDFenetre.getMonitor() : null;
            if (monitor != null) {
                monitor.m7440h();
            }
        } else {
            monitor = null;
        }
        dialog.show();
        if (z) {
            C0806j.m3950a(0, iArr[0], 3, null);
            if (monitor != null) {
                monitor.m7442j();
            }
        }
    }

    /* renamed from: a */
    private final void m9855a(Context context) {
        if (context != null) {
            if ((context instanceof BlankActivity) || ((context instanceof ContextWrapper) && (((ContextWrapper) context).getBaseContext() instanceof BlankActivity))) {
                BlankActivity.m7538a();
            }
        }
    }

    /* renamed from: b */
    private static final Activity m9856b() {
        C0806j.m3949a();
        Activity a = C1056i.m7563a(true);
        return (a == null || a.isFinishing()) ? BlankActivity.m7539b() : a;
    }

    /* renamed from: d */
    private AlertDialog m9857d(String str) {
        CharSequence a;
        String a2 = C0808l.m4018a(str, f4118J[28], "\n");
        Builder builder = new Builder(m9856b());
        WDFenetre wDFenetre = (WDFenetre) WDAppelContexte.getContexte().m2722h();
        if (wDFenetre != null) {
            a = m9841a((C0508h) wDFenetre);
            if (a.equals("")) {
                a = " ";
            }
            if (C1426i.m10042c(a)) {
                a = C1424g.m10030a(a);
            }
            builder.setTitle(a);
        }
        if (a2.length() < 15) {
            a = C0808l.m4017a(a2, 15, " ");
        } else {
            Object obj = a2;
        }
        builder.setMessage(a);
        builder.setCancelable(true);
        return builder.create();
    }

    /* renamed from: z */
    private static String m9858z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 67;
                    break;
                case 1:
                    i2 = 7;
                    break;
                case 2:
                    i2 = 109;
                    break;
                case 3:
                    i2 = 73;
                    break;
                default:
                    i2 = 101;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9859z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 101);
        }
        return toCharArray;
    }

    /* renamed from: a */
    protected final int mo3740a(int i, String str, int i2, C0508h c0508h) {
        if (C0651k.m2646a(C0638a.APP, f4118J[14], false)) {
            if (c0508h == null) {
                c0508h = (WDFenetre) WDAppelContexte.getContexte().m2722h();
            }
            C0508h h = WDAppelContexte.getContexte().m2722h();
            if (h != null && h.getNomFenetre().equals(f4118J[30])) {
                return 65536;
            }
            WDFenetre wDFenetre = (WDFenetre) WDProjet.getInstance().getFenetre(f4118J[30]);
            if (wDFenetre != null) {
                String a = C1372f.m9828a().m9841a(c0508h);
                wDFenetre.ajouterEcouteurFenetre(new C1395y(this));
                wDFenetre.ouvre(C1155i.MODALE, new WDObjet[]{new WDChaine(a), new WDChaine(str), new WDEntier4(i), new WDEntier4(i2)});
                return wDFenetre.getValeurRenvoyee().getInt();
            }
        }
        return 65536;
    }

    /* renamed from: a */
    public int m9861a(int i, String str, String[] strArr, int[] iArr, int i2, int i3, int i4, String str2, WDObjet wDObjet) {
        if (C0651k.m2646a(C0638a.APP, f4118J[14], false)) {
            C0508h h = WDAppelContexte.getContexte().m2722h();
            if (h != null) {
                try {
                    if (h.getNomFenetre().equals(f4118J[11])) {
                        return 65536;
                    }
                } catch (Exception e) {
                    throw e;
                }
            }
            WDFenetre wDFenetre = (WDFenetre) WDProjet.getInstance().getFenetre(f4118J[11]);
            if (wDFenetre != null) {
                WDObjet wDObjet2;
                WDObjet wDObjet3 = null;
                if (i > 0) {
                    try {
                        wDObjet3 = new ac(C0725i.m3035a(bb.m3846b(WDAppManager.m2569b().openRawResource(i)), f4118J[8])).m3840a();
                    } catch (Exception e2) {
                        C0691a.m2857a(f4118J[17], e2);
                    }
                }
                if (wDObjet3 == null) {
                    wDObjet3 = new WDVariant();
                    wDObjet3.get(f4118J[10]).setValeur(str);
                    wDObjet3.get(f4118J[2]).setValeur(C0725i.m3069e(i2));
                    wDObjet3.get(f4118J[15]).setValeur(C0725i.m3069e(i3));
                    wDObjet3.get(f4118J[4]).setValeur(i4);
                    int i5 = 0;
                    while (i5 < strArr.length) {
                        try {
                            wDObjet3.get(f4118J[5]).get(i5 + 1).get(f4118J[3]).setValeur(strArr[i5]);
                            wDObjet3.get(f4118J[5]).get(i5 + 1).get(f4118J[6]).setValeur(iArr[i5]);
                            i5++;
                        } catch (Exception e3) {
                            throw e3;
                        }
                    }
                    if (wDObjet != null) {
                        try {
                            wDObjet3.get(f4118J[18]).get(f4118J[16]).setValeur(0);
                            wDObjet3.get(f4118J[18]).get(f4118J[4]).setValeur(0);
                            wDObjet3.get(f4118J[18]).get(f4118J[21]).setValeur(1);
                            wDObjet3.get(f4118J[18]).get(f4118J[20]).setValeur(wDObjet);
                            wDObjet2 = wDObjet3;
                        } catch (Exception e32) {
                            throw e32;
                        }
                    }
                    wDObjet2 = wDObjet3;
                } else {
                    wDObjet2 = wDObjet3;
                }
                wDObjet2.get(f4118J[9]).setValeur(m9841a(h));
                if (wDObjet != null) {
                    if (((WDBooleen) wDObjet.checkType(WDBooleen.class)) != null) {
                        try {
                            wDObjet2.get(f4118J[18]).get(f4118J[4]).setValeur(5);
                        } catch (Exception e322) {
                            throw e322;
                        }
                    }
                    if (((C0548s) wDObjet.checkType(C0548s.class)) != null) {
                        try {
                            wDObjet2.get(f4118J[18]).get(f4118J[4]).setValeur(1);
                        } catch (Exception e3222) {
                            throw e3222;
                        }
                    }
                    hb hbVar = (hb) wDObjet.checkType(hb.class);
                    if (hbVar != null) {
                        try {
                            switch (((WDObjet) hbVar).getTypeVar()) {
                                case 24:
                                    wDObjet2.get(f4118J[18]).get(f4118J[4]).setValeur(2);
                                    wDObjet2.get(f4118J[18]).get(f4118J[19]).setValeur(WDProjet.getInstance().getFormatMasqueDate());
                                    wDObjet2.get(f4118J[18]).get(f4118J[13]).setValeur(f4118J[12]);
                                    break;
                                case 25:
                                    wDObjet2.get(f4118J[18]).get(f4118J[4]).setValeur(3);
                                    wDObjet2.get(f4118J[18]).get(f4118J[19]).setValeur(WDProjet.getInstance().getFormatMasqueHeure());
                                    wDObjet2.get(f4118J[18]).get(f4118J[13]).setValeur(f4118J[7]);
                                    break;
                                default:
                                    break;
                            }
                        } catch (Exception e32222) {
                            throw e32222;
                        }
                    }
                }
                try {
                    wDFenetre.ouvre(C1155i.MODALE, new WDObjet[]{wDObjet2});
                    if (wDObjet != null) {
                        wDObjet.setValeur(wDObjet2.get(f4118J[18]).get(f4118J[20]));
                    }
                    return wDFenetre.getValeurRenvoyee().getInt();
                } catch (Exception e322222) {
                    throw e322222;
                }
            }
        }
        return 65536;
    }

    /* renamed from: a */
    public int mo3741a(C0883q c0883q, File file, File file2) {
        return 1;
    }

    /* renamed from: a */
    protected int mo3742a(String str, int i) {
        Dialog d = m9857d(str);
        WDEntier4 wDEntier4 = new WDEntier4(0);
        d.setButton(-1, C0745b.m3224c(f4118J[1], new String[0]), new C1380i(this, wDEntier4));
        d.setButton(-2, C0745b.m3224c(f4118J[0], new String[0]), new C1379h(this, wDEntier4));
        d.setButton(-3, C0745b.m3224c(f4118J[23], new String[0]), new C1393w(this, wDEntier4));
        m9854a(d, true);
        return wDEntier4.getInt();
    }

    /* renamed from: a */
    public int mo3743a(String str, WDObjet wDObjet, String[] strArr, int[] iArr, int i, int i2, int i3, String str2, int i4, int i5) {
        int i6;
        switch (i3) {
            case 1:
                i6 = 32;
                break;
            case 2:
                i6 = 48;
                break;
            case 3:
                i6 = 64;
                break;
            default:
                i6 = i3;
                break;
        }
        int a = m9861a(i5, str, strArr, iArr, i, i2, i6, str2, wDObjet);
        if (a != 65536) {
            return a;
        }
        int i7;
        WDEntier4 wDEntier4 = new WDEntier4(0);
        Dialog d = m9857d(str);
        switch (i6) {
            case 32:
            case 48:
            case 64:
                break;
            default:
                if (str2 != null) {
                    if (!str2.equals("")) {
                        Drawable a2 = C1093d.m7924a(str2);
                        if (a2 != null) {
                            d.setIcon(a2);
                            break;
                        }
                    }
                }
                break;
        }
        for (a = 0; a < strArr.length; a++) {
            StringBuffer stringBuffer = new StringBuffer();
            C0808l.m4009a(strArr[a].toString(), stringBuffer);
            strArr[a] = stringBuffer.toString();
        }
        Object obj = (i4 & 1) > 0 ? 1 : null;
        i6 = Math.min(3, strArr.length);
        int i8 = 0;
        while (i8 < i6) {
            if (obj == null) {
                WDFenetre wDFenetre = (WDFenetre) WDAppelContexte.getContexte().m2722h();
                boolean a3 = (wDFenetre == null || wDFenetre.getIdThemeActivity() <= 0) ? false : kb.m3965a(C0657a.ICE_CREAM_SANDWICH);
                if (!kb.m3965a(C0657a.JELLY_BEAN) && Build.BRAND.equalsIgnoreCase(f4118J[29])) {
                    a3 = false;
                }
                if (!a3) {
                    switch (i8) {
                        case 0:
                            a = -1;
                            break;
                        case 1:
                            if (i6 <= 2) {
                                a = -2;
                                break;
                            }
                            a = -3;
                            break;
                        case 2:
                            a = -2;
                            break;
                        default:
                            break;
                    }
                }
                switch (i8) {
                    case 0:
                        a = -2;
                        break;
                    case 1:
                        if (i6 <= 2) {
                            a = -1;
                            break;
                        }
                        a = -3;
                        break;
                    case 2:
                        a = -1;
                        break;
                }
            }
            if (i8 == i) {
                a = -1;
            } else if (i8 == i2) {
                a = -2;
            }
            i7 = i8 >= iArr.length ? iArr[i8] : 0;
            if (i8 == i2) {
                wDEntier4.setValeur(i7);
            }
            d.setButton(a, strArr[i8], new C1389s(this, wDEntier4, i7));
            i8++;
            a = -3;
            if (i8 >= iArr.length) {
            }
            if (i8 == i2) {
                wDEntier4.setValeur(i7);
            }
            d.setButton(a, strArr[i8], new C1389s(this, wDEntier4, i7));
            i8++;
        }
        EditText editText = null;
        Object obj2 = null;
        if (wDObjet != null) {
            View linearLayout = new LinearLayout(d.getContext());
            linearLayout.setOrientation(0);
            View editText2 = new EditText(d.getContext());
            CharSequence string = wDObjet.getString();
            obj = string.indexOf(f4118J[28]) >= 0 ? 1 : null;
            if (obj == null) {
                editText2.setSingleLine();
            }
            editText2.setText(string);
            if (wDObjet.checkType(C0548s.class) != null) {
                editText2.setRawInputType(((wDObjet.checkType(WDEntier4.class) == null ? 8192 : 0) | 2) | 4096);
            }
            LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(8, 2, 8, 2);
            linearLayout.addView(editText2, layoutParams);
            d.setView(linearLayout);
            obj2 = obj;
            editText = editText2;
        }
        m9854a(d, true);
        i7 = wDEntier4.getInt();
        if (wDObjet != null) {
            Activity a4;
            View currentFocus;
            int i9 = 0;
            while (i9 < i6) {
                if (iArr[i9] == i7 && i9 == i) {
                    String obj3 = editText != null ? editText.getText().toString() : "";
                    wDObjet.setValeur(obj2 != null ? C0808l.m4049g(obj3) : obj3);
                    a4 = C1056i.m7562a();
                    if (a4 != null) {
                        currentFocus = a4.getCurrentFocus();
                        if (currentFocus == null || !(currentFocus instanceof EditText)) {
                            C1503b.m10425a();
                        }
                    }
                } else {
                    i9++;
                }
            }
            a4 = C1056i.m7562a();
            if (a4 != null) {
                currentFocus = a4.getCurrentFocus();
                C1503b.m10425a();
            }
        }
        return i7;
    }

    /* renamed from: a */
    public int mo3744a(String[] strArr) {
        int[] iArr = new int[]{-1};
        Builder builder = new Builder(C1056i.m7562a());
        builder.setItems(strArr, new C1375c(this, iArr));
        m9854a(builder.create(), true);
        return iArr[0];
    }

    /* renamed from: a */
    public WDObjet mo3745a(String str, WDObjet wDObjet) {
        return null;
    }

    /* renamed from: a */
    public WDDate mo3746a(WDDate wDDate, String str) {
        if (wDDate == null) {
            wDDate = new WDDate();
        }
        WDDate[] wDDateArr = new WDDate[1];
        m9854a(new C1383l(this, C1056i.m7562a(), new C1391u(this, wDDateArr), wDDate.m2530q(), wDDate.m2529p() - 1, wDDate.m2531r(), str), true);
        return wDDateArr[0];
    }

    /* renamed from: a */
    public WDHeure mo3747a(WDHeure wDHeure, boolean z, String str) {
        if (wDHeure == null) {
            wDHeure = new WDHeure();
        }
        WDHeure[] wDHeureArr = new WDHeure[1];
        m9854a(new C1382k(this, C1056i.m7562a(), new C1381j(this, wDHeureArr), wDHeure.m2473f(), wDHeure.m2484n(), z, str), true);
        return wDHeureArr[0];
    }

    /* renamed from: a */
    public String mo3748a(C0883q c0883q, String str, String str2, String str3, String str4) {
        return null;
    }

    /* renamed from: a */
    public String mo3749a(C0883q c0883q, String str, String str2, String str3, String str4, String str5, int i) {
        return null;
    }

    /* renamed from: a */
    public void mo3750a(C0697b c0697b) {
        Dialog create = new Builder(m9856b()).create();
        Context context = create.getContext();
        create.setMessage(C0745b.m3224c(f4118J[25], WDProjet.getInstance().getNomApplication()));
        create.setCancelable(false);
        View linearLayout = new LinearLayout(context);
        linearLayout.setPadding(C1511l.f4629c + C1511l.f4645s, C1511l.f4629c, 0, 0);
        linearLayout.setOrientation(0);
        View checkBox = new CheckBox(context);
        linearLayout.addView(checkBox, new LinearLayout.LayoutParams(-2, -2));
        SharedPreferences E = WDAppManager.m2546E();
        String adresseEmail = WDProjet.getInstance().getAdresseEmail();
        if (E.contains(f4116H) && adresseEmail.equals(E.getString(f4117I, ""))) {
            checkBox.setChecked(E.getBoolean(f4116H, false));
        } else {
            checkBox.setChecked(!C0808l.m4053k(adresseEmail));
        }
        String c = C0745b.m3224c(f4118J[27], new String[0]);
        String c2 = C0745b.m3224c(f4118J[24], new String[0]);
        String str = f4118J[26];
        int indexOf = c.indexOf(str);
        CharSequence spannableString = new SpannableString(c.substring(0, indexOf) + c2 + c.substring(str.length() + indexOf));
        spannableString.setSpan(new C1388r(this, c0697b, context), indexOf, c2.length() + indexOf, 33);
        View textView = new TextView(context);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        create.setView(linearLayout);
        create.setButton(-1, C0745b.m3224c(f4118J[22], new String[0]), new C1390t(this, checkBox, c0697b, adresseEmail, r5, create));
        m9854a(create, true);
    }

    /* renamed from: a */
    public void mo3751a(String str) {
        Dialog d = m9857d(str);
        d.setButton(-1, C0745b.m3224c(f4118J[22], new String[0]), new C1384m(this));
        m9854a(d, true);
    }

    /* renamed from: a */
    public void mo3752a(String str, String str2, String str3) {
        Dialog d = m9857d(C0745b.m3224c(f4118J[31], str, str2));
        d.setIconAttribute(16843605);
        d.setTitle("");
        d.setButton(-2, C0745b.m3224c(f4118J[34], new String[0]), new C1374b(this));
        d.setButton(-1, C0745b.m3224c(f4118J[33], new String[0]), new C1396z(this));
        View linearLayout = new LinearLayout(d.getContext());
        linearLayout.setPadding(C1511l.f4646t + C1511l.f4645s, C1511l.f4629c, 0, 0);
        linearLayout.setOrientation(0);
        View textView = new TextView(d.getContext());
        textView.setText(f4118J[32] + str3);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        d.setView(linearLayout);
        m9854a(d, true);
    }

    /* renamed from: a */
    public boolean mo3753a(int i, String str) {
        C0728o c0728o = new C0728o();
        c0728o.m3094a(Boolean.TRUE);
        Dialog errorDialog = GoogleApiAvailability.getInstance().getErrorDialog(m9856b(), i, 0, new C1373a(this, c0728o));
        if (errorDialog == null) {
            return false;
        }
        m9854a(errorDialog, true);
        return ((Boolean) c0728o.m3093a()).booleanValue();
    }

    /* renamed from: b */
    public String mo3754b(C0883q c0883q, String str, String str2, String str3, String str4, String str5, int i) {
        return null;
    }

    /* renamed from: b */
    protected void mo3755b(String str) {
        mo3757c(str);
    }

    /* renamed from: b */
    public boolean mo3756b(String str, int i) {
        Dialog d = m9857d(str);
        WDBooleen wDBooleen = new WDBooleen(false);
        d.setButton(-1, C0745b.m3224c(f4118J[22], new String[0]), new C1386o(this, wDBooleen));
        d.setButton(-2, C0745b.m3224c(f4118J[23], new String[0]), new C1392v(this, wDBooleen));
        m9854a(d, true);
        return wDBooleen.getBoolean();
    }

    /* renamed from: c */
    protected void mo3757c(String str) {
        Dialog d = m9857d(str);
        d.setButton(-1, C0745b.m3224c(f4118J[22], new String[0]), new C1394x(this));
        m9854a(d, true);
    }

    /* renamed from: c */
    public void mo3758c(String str, int i) {
    }

    /* renamed from: d */
    public int mo3759d(String str, int i) {
        Dialog d = m9857d(str);
        WDEntier4 wDEntier4 = new WDEntier4(0);
        d.setButton(-1, C0745b.m3224c(f4118J[1], new String[0]), new C1376d(this, wDEntier4));
        d.setButton(-2, C0745b.m3224c(f4118J[0], new String[0]), new C1387p(this, wDEntier4));
        m9854a(d, true);
        return wDEntier4.getInt();
    }
}
