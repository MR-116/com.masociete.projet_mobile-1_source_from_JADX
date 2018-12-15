package fr.pcsoft.wdjava.ui.champs.groupeoptions;

import android.view.ViewGroup;
import android.widget.RadioGroup;
import fr.pcsoft.wdjava.core.C0725i;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.ui.activite.C1056i;

public class WDSelecteur extends C0501o {
    private static final String Wc = m1353z(m1354z("&OLt\u0003FHLm\u0014"));
    private boolean Uc = false;
    private WDObjet Vc = null;

    /* renamed from: z */
    private static String m1353z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 5;
                    break;
                case 1:
                    i2 = 28;
                    break;
                case 2:
                    i2 = 9;
                    break;
                case 3:
                    i2 = 56;
                    break;
                default:
                    i2 = 70;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1354z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 70);
        }
        return toCharArray;
    }

    protected ViewGroup creerConteneur() {
        ViewGroup c1195b = new C1195b(this, C1056i.m7562a());
        c1195b.setOnCheckedChangeListener(new C1196d(this));
        return c1195b;
    }

    public String getNomType() {
        return C0745b.m3220a(Wc, new String[0]);
    }

    public WDObjet getValeur() {
        int i = 0;
        while (i < this.Jc && !this.Pc[i].isSelectionnee()) {
            i++;
        }
        if (i == this.Jc) {
            return new WDEntier4(-1);
        }
        if (this.Uc) {
            String _getValeurRenvoyee = this.Pc[i]._getValeurRenvoyee();
            if (!_getValeurRenvoyee.equals("")) {
                return new WDChaine(_getValeurRenvoyee);
            }
        }
        return new WDEntier4(i + 1);
    }

    public WDObjet getValeurInitiale() {
        return this.Vc;
    }

    protected int insertOption(C0500n c0500n, int i) {
        int insertOption = super.insertOption(c0500n, i);
        this.Cc = true;
        try {
            if (this.Uc) {
                if (this.Jc == 1 && (this.Vc == null || this.Vc.opEgal("") || this.Vc.opEgal(1))) {
                    c0500n.setValeur(true);
                } else if (this.Vc != null && c0500n._getValeurRenvoyee().equals(this.Vc.getString())) {
                    c0500n.setValeur(true);
                }
            } else if (this.Vc.getInt() != -1 && this.Jc == 1) {
                c0500n.setValeur(true);
            } else if (this.Jc == this.Vc.getInt()) {
                c0500n.setValeur(true);
            }
            this.Cc = false;
            return insertOption;
        } catch (Throwable th) {
            this.Cc = false;
        }
    }

    public void raz(boolean z) {
        if (this.Vc != null) {
            setValeur(this.Vc);
        }
    }

    public void release() {
        super.release();
        this.Vc = null;
    }

    public void setValeur(int i) {
        if (this.Uc) {
            setValeur(String.valueOf(i));
            return;
        }
        this.Cc = true;
        int i2;
        if (i == -1) {
            i2 = 0;
            while (i2 < this.Jc) {
                try {
                    this.Pc[i2].setValeur(false);
                    i2++;
                } catch (Throwable th) {
                    this.Cc = false;
                }
            }
            if (this.Sc instanceof RadioGroup) {
                ((RadioGroup) this.Sc).clearCheck();
            }
        } else {
            i2 = i - 1;
            if (i2 >= 0) {
                if (i2 < this.Jc) {
                    this.Pc[i2].setValeur(true);
                }
            }
            if (this.z != null) {
                i2 = this.Vc.getInt();
                if (i2 <= 0 || i2 > this.Jc) {
                    setValeur(-1);
                } else {
                    this.Pc[i2 - 1].setValeur(true);
                }
            }
        }
        this.Cc = false;
    }

    public void setValeur(WDObjet wDObjet) {
        if (this.Uc) {
            setValeur(wDObjet.getString());
        } else {
            setValeur(wDObjet.getInt());
        }
    }

    public void setValeur(String str) {
        if (this.Uc) {
            this.Cc = true;
            int i = 0;
            boolean z = false;
            while (i < this.Jc) {
                try {
                    if (this.Pc[i]._getValeurRenvoyee().equals(str)) {
                        this.Pc[i].setValeur(true);
                        z = true;
                    } else {
                        this.Pc[i].setValeur(false);
                    }
                    i++;
                } catch (Throwable th) {
                    this.Cc = false;
                }
            }
            if (!z) {
                if (this.Sc instanceof RadioGroup) {
                    ((RadioGroup) this.Sc).clearCheck();
                }
            }
            this.Cc = false;
            return;
        }
        setValeur(C0725i.m3064d(str));
    }

    public void setValeurInitiale(WDObjet wDObjet) {
        this.Vc = wDObjet;
        setValeur(wDObjet);
    }

    protected void setValeurRenvoyeeParProgrammation(boolean z) {
        this.Uc = z;
    }
}
