package fr.pcsoft.wdjava.ui.champs.saisie;

import android.text.InputFilter;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import fr.pcsoft.wdjava.core.C0607n;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.ui.p083l.C1443c;
import fr.pcsoft.wdjava.ui.p083l.C1449i;
import fr.pcsoft.wdjava.ui.p083l.C1453n;
import fr.pcsoft.wdjava.ui.utils.C1503b;

/* renamed from: fr.pcsoft.wdjava.ui.champs.saisie.f */
class C1254f implements InputFilter {
    /* renamed from: z */
    private static final String[] f3679z = new String[]{C1254f.m8694z(C1254f.m8695z("2\u00010\u000f2\b\u0017.Ju\n©")), C1254f.m8694z(C1254f.m8695z("f:\u0001.M 7\u0012'S2x"))};
    final C0517i this$0;

    C1254f(C0517i c0517i) {
        this.this$0 = c0517i;
    }

    /* renamed from: a */
    private void m8693a(String str, boolean z) {
        C1503b.m10451e(this.this$0.Yc).post(new C1253e(this, str, z));
    }

    /* renamed from: z */
    private static String m8694z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 102;
                    break;
                case 1:
                    i2 = C0607n.co;
                    break;
                case 2:
                    i2 = 64;
                    break;
                case 3:
                    i2 = 106;
                    break;
                default:
                    i2 = 18;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8695z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 18);
        }
        return toCharArray;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int access$1000 = this.this$0.md;
        if (this.this$0.d == 1 && !this.this$0.hd) {
            return "";
        }
        if (this.this$0.hd && this.this$0.ad) {
            this.this$0.ad = false;
            return null;
        }
        CharSequence a;
        String charSequence2 = charSequence.subSequence(i, i2).toString();
        CharSequence subSequence;
        boolean z;
        switch (this.this$0.Ec) {
            case 0:
                C1453n c1453n = (C1453n) this.this$0.sd;
                boolean d = c1453n.m10248d(this.this$0.getTexteAffiche());
                a = c1453n.mo3782a(this.this$0, charSequence2, i3, i4 - i3, this.this$0.hd, this.this$0.od, this.this$0.Jc);
                if (!a.equals(f3679z[1])) {
                    int i5 = c1453n.m10252i() > 0 ? c1453n.m10252i() : access$1000;
                    if (i5 <= 0) {
                        if (!this.this$0.hd) {
                            m8693a(null, false);
                            break;
                        }
                    }
                    int length = i5 - (spanned.length() - (i4 - i3));
                    if (length > 0) {
                        subSequence = length < i2 - i ? charSequence.subSequence(i, i + length) : a;
                        if (!this.this$0.hd) {
                            boolean z2 = this.this$0.Ic && length > 0 && i2 - i > 0 && length <= i2 - i;
                            m8693a(null, z2);
                        }
                        a = subSequence;
                        break;
                    }
                    return "";
                }
                if (!d) {
                    this.this$0.selectionnerTout();
                }
                return "";
                break;
            case 1:
            case 4:
            case 7:
                int i6;
                z = this.this$0.hd;
                if (z && this.this$0.Yc.hasFocus()) {
                    z = false;
                    i4 = this.this$0.Yc.getText().length();
                    i6 = 0;
                } else {
                    i6 = i3;
                }
                if (z) {
                    a = ((C1443c) (this.this$0.Jc != null ? this.this$0.Jc : this.this$0.sd)).m10134e(charSequence2);
                    break;
                }
                a = this.this$0.sd.mo3782a(this.this$0, charSequence2, i6, i4 - i6, this.this$0.hd, this.this$0.od, this.this$0.Jc);
                if (this.this$0.sd.mo3786d()) {
                    m8693a(null, false);
                    break;
                }
                if (this.this$0.hd) {
                    this.this$0.modifValeurInterne("");
                }
                return "";
                break;
            case 2:
            case 3:
                if (this.this$0.hd) {
                    a = ((C1449i) this.this$0.sd).m10185a(charSequence2, true, (C1449i) (this.this$0.Jc != null ? this.this$0.Jc : null));
                    if (this.this$0.Yc.hasFocus()) {
                        subSequence = ((C1449i) this.this$0.sd).m10208o();
                        this.this$0.ad = true;
                        this.this$0.Yc.setText(subSequence);
                        this.this$0.ad = false;
                        break;
                    }
                }
                subSequence = this.this$0.sd.mo3781a(this.this$0, charSequence2, i3, i4 - i3, this.this$0.Jc);
                String charSequence3 = subSequence.toString();
                z = this.this$0.isFinSaisieAutomatique() && this.this$0.sd.mo3780a() == this.this$0.sd.mo3784b() && this.this$0.sd.mo3780a() >= subSequence.length();
                m8693a(charSequence3, z);
                return "";
                break;
            default:
                C0691a.m2856a(f3679z[0]);
                return null;
        }
        if (!(charSequence instanceof Spanned) || a == null) {
            return a;
        }
        CharSequence spannableString = new SpannableString(a);
        TextUtils.copySpansFrom((Spanned) charSequence, i, Math.min(i2, a.length()), null, spannableString, 0);
        return spannableString;
    }
}
