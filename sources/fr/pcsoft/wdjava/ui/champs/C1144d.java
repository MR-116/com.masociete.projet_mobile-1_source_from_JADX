package fr.pcsoft.wdjava.ui.champs;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.p047f.C0715d;
import fr.pcsoft.wdjava.ui.champs.fenetre.WDFenetre;
import fr.pcsoft.wdjava.ui.p064a.C1031a;
import fr.pcsoft.wdjava.ui.p064a.C1034d;
import fr.pcsoft.wdjava.ui.p079e.C1399b;
import fr.pcsoft.wdjava.ui.p080h.C1424g;
import fr.pcsoft.wdjava.ui.p080h.C1426i;
import fr.pcsoft.wdjava.ui.utils.C1503b;

/* renamed from: fr.pcsoft.wdjava.ui.champs.d */
public class C1144d extends ArrayAdapter<bc> {
    /* renamed from: z */
    private static final String f3498z = C1144d.m8316z(C1144d.m8317z("\u0006,bIk?,\u0000{q*eErv't\u0000s?0eE??-gAs?'t\u000e"));
    /* renamed from: a */
    private int f3499a = 0;
    /* renamed from: b */
    public kc f3500b = null;
    final kc this$0;

    public C1144d(kc kcVar, Context context, int i) {
        this.this$0 = kcVar;
        super(context, i);
        if (!kcVar.isCombo() && kcVar.Zc != null && kcVar.Zc.mo3616b() == C0715d.DIRECT_ACCESS) {
            ((ListView) kcVar.dd).setOnScrollListener(new lb(this, kcVar));
        }
    }

    static int access$000(C1144d c1144d) {
        return c1144d.f3499a;
    }

    static int access$002(C1144d c1144d, int i) {
        c1144d.f3499a = i;
        return i;
    }

    /* renamed from: z */
    private static String m8316z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 86;
                    break;
                case 1:
                    i2 = 67;
                    break;
                case 2:
                    i2 = 17;
                    break;
                case 3:
                    i2 = 32;
                    break;
                default:
                    i2 = 31;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8317z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 31);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public final int m8318a() {
        return super.getCount();
    }

    /* renamed from: a */
    public bc m8319a(int i) {
        return (i < 0 || i >= m8318a()) ? null : (bc) super.getItem(i);
    }

    /* renamed from: a */
    public final void m8320a(kc kcVar) {
        this.f3500b = kcVar;
    }

    public int getCount() {
        return (this.this$0.Zc == null || this.this$0.Zc.mo3616b() != C0715d.DIRECT_ACCESS) ? super.getCount() : this.this$0.Zc.mo3626f();
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        boolean isCombo = this.this$0.isCombo();
        if (!(isCombo || this.this$0.Zc == null || this.this$0.Zc.mo3616b() != C0715d.DIRECT_ACCESS)) {
            i -= this.f3499a;
        }
        if (this.this$0.isCombo() && viewGroup != null && (viewGroup instanceof ListView)) {
            Object obj;
            OnItemClickListener onItemClickListener = ((ListView) viewGroup).getOnItemClickListener();
            OnItemLongClickListener onItemLongClickListener = ((ListView) viewGroup).getOnItemLongClickListener();
            kc kcVar = this.this$0;
            if (this.f3500b != null) {
                obj = this.f3500b;
            } else {
                kc kcVar2 = kcVar;
            }
            if (onItemClickListener != obj) {
                obj.gd = onItemClickListener;
                ((ListView) viewGroup).setOnItemClickListener(obj);
            }
            if (onItemLongClickListener != obj) {
                ((ListView) viewGroup).setOnItemLongClickListener(obj);
            }
        }
        C1145e creerRenderer = view == null ? this.this$0.creerRenderer(getContext()) : (C1145e) view;
        bc a = m8319a(i);
        if (a == null) {
            C0691a.m2856a(f3498z);
        } else {
            creerRenderer.m8322a(i);
            TextView a2 = creerRenderer.m8321a();
            C1034d c1034d = (C1034d) a.m8263b(2);
            C1034d c1034d2 = c1034d == null ? (C1034d) this.this$0.ad.mo3797a(2) : c1034d;
            c1034d = (C1034d) a.m8263b(3);
            C1034d c1034d3 = c1034d == null ? (C1034d) this.this$0.ad.mo3797a(3) : c1034d;
            C1399b c1399b = (C1399b) a.m8263b(4);
            C1399b c1399b2 = c1399b == null ? (C1399b) this.this$0.ad.mo3797a(4) : c1399b;
            int i2 = 48;
            if (((Integer) a.m8263b(10)) == null) {
                Integer num = (Integer) this.this$0.ad.mo3797a(10);
                if (num != null) {
                    i2 = num.intValue();
                }
            }
            int b = c1034d2.mo3315b();
            int b2 = c1034d3.mo3315b();
            if (isCombo && C1031a.m7448a(b2) == 0 && this.this$0.l != null && ((WDFenetre) this.this$0.l).isThemeDark() == C1031a.m7474r(b)) {
                b = C1031a.m7470n(b);
            }
            creerRenderer.m8323a(a.m8259a(false), b, b2, c1399b2, i2);
            C1503b.m10431a(a2, this.this$0.hd);
        }
        return creerRenderer.m8321a();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return m8319a(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.this$0.isCombo()) {
            return getDropDownView(i, view, viewGroup);
        }
        if (view != null) {
            return super.getView(i, view, viewGroup);
        }
        View view2 = super.getView(i, view, viewGroup);
        if (!(view2 instanceof TextView)) {
            return view2;
        }
        TextView textView = (TextView) view2;
        C1034d c1034d = (C1034d) this.this$0.ad.mo3797a(2);
        if (c1034d != null) {
            textView.setTextColor(c1034d.mo3315b());
        }
        C1503b.m10431a(textView, this.this$0.hd);
        C1399b c1399b = (C1399b) this.this$0.ad.mo3797a(4);
        if (c1399b != null) {
            c1399b.m9954a(textView);
        }
        String charSequence = textView.getText().toString();
        if (!C1426i.m10042c(charSequence)) {
            return view2;
        }
        C1424g.m10031a(textView, charSequence);
        return view2;
    }
}
