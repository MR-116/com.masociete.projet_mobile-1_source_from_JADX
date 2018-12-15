package fr.pcsoft.wdjava.ui.champs.fenetre;

import android.os.Message;
import fr.pcsoft.wdjava.core.debug.C0691a;
import fr.pcsoft.wdjava.core.erreur.WDException;
import fr.pcsoft.wdjava.core.p035c.C0667i;
import fr.pcsoft.wdjava.core.utils.C0806j;
import fr.pcsoft.wdjava.tlm.WDTelemetrie;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.k */
class C1159k implements Runnable {
    /* renamed from: z */
    private static final String f3524z = C1159k.m8393z(C1159k.m8394z("\u0011DaFs&\u0016wVt5Xg\u0003jsS}Ui=\u0016wF&8W3Gs&ßv\u0003bsYjVp1DgVt1\u0016wF&8W3Ec:ÜgQctF|VttZr\u0003r½ZúNï DzF("));
    final WDFenetre this$0;

    C1159k(WDFenetre wDFenetre) {
        this.this$0 = wDFenetre;
    }

    /* renamed from: z */
    private static String m8393z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 84;
                    break;
                case 1:
                    i2 = 54;
                    break;
                case 2:
                    i2 = 19;
                    break;
                case 3:
                    i2 = 35;
                    break;
                default:
                    i2 = 6;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m8394z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 6);
        }
        return toCharArray;
    }

    public void run() {
        try {
            if (this.this$0.estOuverte()) {
                try {
                    this.this$0.appelPCode(14);
                } catch (WDException e) {
                    this.this$0.ferme(false, false, e);
                }
                this.this$0.hd = true;
                if (this.this$0.estOuverte()) {
                    this.this$0.appelPCode(35);
                    if (WDTelemetrie.m7399e().mo3313h()) {
                        if (this.this$0.Sc != null) {
                            try {
                                WDTelemetrie.m7399e().m7407a(this.this$0.Sc.m7441i(), this.this$0.Sc.m7429d());
                            } catch (Exception e2) {
                                C0691a.m2857a(f3524z, e2);
                            }
                        }
                    }
                    if (!(this.this$0.Bc == null || this.this$0.Bc.isEmpty())) {
                        for (int size = this.this$0.Bc.size() - 1; size >= 0; size--) {
                            if (size < this.this$0.Bc.size()) {
                                C1162n c1162n = (C1162n) this.this$0.Bc.get(size);
                                if (c1162n != null) {
                                    c1162n.mo3569c(this.this$0);
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    this.this$0.focusInitial();
                    if (!this.this$0.m1418g() && this.this$0.estOuverte()) {
                        Message.obtain(C0806j.m3954d(), 5182).sendToTarget();
                        return;
                    }
                    return;
                }
                try {
                    if (!this.this$0.m1418g() && this.this$0.estOuverte()) {
                        Message.obtain(C0806j.m3954d(), 5182).sendToTarget();
                        return;
                    }
                    return;
                } catch (WDException e3) {
                    throw e3;
                }
            }
            try {
                if (!this.this$0.m1418g() && this.this$0.estOuverte()) {
                    Message.obtain(C0806j.m3954d(), 5182).sendToTarget();
                }
            } catch (WDException e32) {
                throw e32;
            }
        } catch (WDException e322) {
            throw e322;
        } catch (WDException e3222) {
            throw e3222;
        } catch (WDException e32222) {
            throw e32222;
        } catch (WDException e322222) {
            throw e322222;
        } catch (C0667i e4) {
            try {
                if (!this.this$0.m1418g() && this.this$0.estOuverte()) {
                    Message.obtain(C0806j.m3954d(), 5182).sendToTarget();
                }
            } catch (WDException e3222222) {
                throw e3222222;
            }
        } catch (Throwable th) {
            try {
                if (!this.this$0.m1418g() && this.this$0.estOuverte()) {
                    Message.obtain(C0806j.m3954d(), 5182).sendToTarget();
                }
            } catch (WDException e32222222) {
                throw e32222222;
            }
        }
    }
}
