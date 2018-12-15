package fr.pcsoft.wdjava.ui.champs.zr;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.types.C0548s;
import fr.pcsoft.wdjava.core.utils.C0808l;
import fr.pcsoft.wdjava.ui.champs.ic;
import java.util.ArrayList;

class rb extends Filter {
    /* renamed from: a */
    private WDAttributZR f3909a = null;
    /* renamed from: b */
    private int f3910b = ic.Nc;
    /* renamed from: c */
    private boolean f3911c = false;
    final C1297h this$1;

    public rb(C1297h c1297h) {
        this.this$1 = c1297h;
    }

    static WDAttributZR access$1702(rb rbVar, WDAttributZR wDAttributZR) {
        rbVar.f3909a = wDAttributZR;
        return wDAttributZR;
    }

    static boolean access$1802(rb rbVar, boolean z) {
        rbVar.f3911c = z;
        return z;
    }

    static int access$1902(rb rbVar, int i) {
        rbVar.f3910b = i;
        return i;
    }

    /* renamed from: a */
    public void m9201a() {
        this.f3909a = null;
    }

    protected FilterResults performFiltering(CharSequence charSequence) {
        String charSequence2 = charSequence != null ? charSequence.toString() : null;
        FilterResults filterResults = new FilterResults();
        if (C0808l.m4053k(charSequence2)) {
            ArrayList arrayList;
            if (C1297h.access$2000(this.this$1) != null) {
                synchronized (C1297h.access$2100(this.this$1)) {
                    arrayList = new ArrayList(C1297h.access$2000(this.this$1));
                }
                C1297h.access$2000(this.this$1).clear();
                C1297h.access$2002(this.this$1, null);
            } else {
                arrayList = C1297h.access$2200(this.this$1);
            }
            filterResults.values = arrayList;
            filterResults.count = arrayList.size();
        } else {
            ArrayList arrayList2;
            if (C1297h.access$2000(this.this$1) == null) {
                synchronized (C1297h.access$2100(this.this$1)) {
                    C1297h.access$2002(this.this$1, new ArrayList(C1297h.access$2200(this.this$1)));
                }
            }
            synchronized (C1297h.access$2100(this.this$1)) {
                arrayList2 = new ArrayList(C1297h.access$2000(this.this$1));
            }
            int size = arrayList2.size();
            ArrayList arrayList3 = new ArrayList();
            ec ecVar;
            WDObjet b;
            if (this.f3911c) {
                double m = C0725i.m3084m(charSequence2);
                for (int i = 0; i < size; i++) {
                    Object obj;
                    ecVar = (ec) arrayList2.get(i);
                    b = ecVar.m9107b(this.f3909a.getIndiceAttribut());
                    double d = b != null ? b instanceof C0548s ? b.getDouble() : (double) b.getInt() : 0.0d;
                    int i2;
                    switch (this.f3910b) {
                        case ic.Rc /*31982*/:
                            if (m == d) {
                                obj = null;
                                break;
                            }
                            i2 = 1;
                            break;
                        case ic.Ec /*31986*/:
                            if (d <= m) {
                                obj = null;
                                break;
                            }
                            i2 = 1;
                            break;
                        case ic.Pc /*31987*/:
                            if (d < m) {
                                obj = null;
                                break;
                            }
                            i2 = 1;
                            break;
                        case ic.Cc /*31988*/:
                            if (d >= m) {
                                obj = null;
                                break;
                            }
                            i2 = 1;
                            break;
                        case ic.Oc /*31989*/:
                            if (d > m) {
                                obj = null;
                                break;
                            }
                            i2 = 1;
                            break;
                        default:
                            if (m != d) {
                                obj = null;
                                break;
                            }
                            obj = 1;
                            break;
                    }
                    if (obj != null) {
                        arrayList3.add(ecVar);
                    }
                }
            } else {
                String toLowerCase = charSequence2.toLowerCase();
                for (int i3 = 0; i3 < size; i3++) {
                    boolean z;
                    ecVar = (ec) arrayList2.get(i3);
                    b = ecVar.m9107b(this.f3909a.getIndiceAttribut());
                    String toLowerCase2 = b != null ? b.getString().toLowerCase() : "";
                    switch (this.f3910b) {
                        case 31000:
                            if (toLowerCase2.length() != 0) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        case ic.Mc /*31978*/:
                            z = toLowerCase2.equals(toLowerCase);
                            break;
                        case ic.Tc /*31979*/:
                            z = toLowerCase2.startsWith(toLowerCase);
                            break;
                        case ic.Qc /*31981*/:
                            z = toLowerCase2.endsWith(toLowerCase);
                            break;
                        case ic.Rc /*31982*/:
                            if (!toLowerCase2.equals(toLowerCase)) {
                                z = true;
                                break;
                            }
                            z = false;
                            break;
                        case ic.Uc /*31983*/:
                            if (!toLowerCase2.startsWith(toLowerCase)) {
                                z = true;
                                break;
                            }
                            z = false;
                            break;
                        case ic.Kc /*31984*/:
                            if (toLowerCase2.indexOf(toLowerCase) >= 0) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                        case ic.Sc /*31985*/:
                            if (!toLowerCase2.endsWith(toLowerCase)) {
                                z = true;
                                break;
                            }
                            z = false;
                            break;
                        default:
                            if (toLowerCase2.indexOf(toLowerCase) < 0) {
                                z = false;
                                break;
                            }
                            z = true;
                            break;
                    }
                    if (z) {
                        arrayList3.add(ecVar);
                    }
                }
            }
            filterResults.values = arrayList3;
            filterResults.count = arrayList3.size();
        }
        return filterResults;
    }

    protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
        try {
            C1297h.access$2202(this.this$1, (ArrayList) filterResults.values);
            if (filterResults.count > 0) {
                this.this$1.notifyDataSetChanged();
                this.this$1.this$0.Vc.mo3489c(0, 0);
                this.this$1.this$0.setFirstVisibleElement(0);
                if (this.this$1.this$0.Vc.mo3496h() != 99) {
                    this.this$1.this$0.appelPCode(33);
                }
            } else {
                this.this$1.notifyDataSetInvalidated();
            }
            this.this$1.this$0.updateIndiceItem(0);
            this.this$1.this$0.invalidateDrawCache();
        } finally {
            C1297h.access$2502(this.this$1, false);
        }
    }
}
