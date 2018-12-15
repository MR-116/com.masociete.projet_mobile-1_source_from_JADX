package fr.pcsoft.wdjava.ui.champs.zr;

import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.core.erreur.WDErreurManager;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;
import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.ui.champs.dc;

public class WDAttributZR extends dc {
    /* renamed from: z */
    private static final String[] f972z = new String[]{m1484z(m1485z("FX.N\u000b,[/N\u0006?K")), m1484z(m1485z("FO;V\u001c0K%L\u0018)P>_\u0006&Q;W\t:+")), m1484z(m1485z("FX*J\u001c)F5J\u001c7X._\f7F9H\u0016&Q?N")), m1484z(m1485z("FU3I\r F,S\u001d ")), m1484z(m1485z("FP4^\u0010&\\%S\u00173X6S\u001d F9R\u0018(I"))};
    /* renamed from: k */
    private lc f973k = null;

    /* renamed from: a */
    private void m1483a(ec ecVar, WDObjet wDObjet) {
        if (ecVar != null) {
            int b = ecVar.mo3394b();
            ecVar.m9101a(this.g, wDObjet);
            this.f973k.notifModifValeurAttribut(this, b, wDObjet);
            this.f973k.redessinerCellule(b, true);
        }
    }

    /* renamed from: z */
    private static String m1484z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 101;
                    break;
                case 1:
                    i2 = 25;
                    break;
                case 2:
                    i2 = 122;
                    break;
                case 3:
                    i2 = 26;
                    break;
                default:
                    i2 = 89;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m1485z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 89);
        }
        return toCharArray;
    }

    protected WDObjet _getValeur() {
        ec itemCourant = this.f973k.getItemCourant();
        if (itemCourant == null) {
            return new WDChaine();
        }
        WDObjet b = itemCourant.m9107b(this.g);
        return b != null ? b : getValeurDefautAttribut();
    }

    protected void _setValeur(WDObjet wDObjet) {
        m1483a(this.f973k.getItemCourant(), wDObjet);
    }

    public int chercherElement(String str, int i, int i2) {
        return this.f973k.chercherElementSurAttribut(this, str, i, i2);
    }

    public WDObjet get(int i) {
        int _getOccurrence = this.f973k._getOccurrence();
        if (_getOccurrence <= 0) {
            WDErreurManager.m2883a(C0745b.m3222b(f972z[3], new String[0]) + "\n" + C0745b.m3222b(f972z[4], this.f973k.getName(), String.valueOf(i)));
        }
        if (i - 1 >= 0 && i - 1 < _getOccurrence) {
            return new dc(this, i - 1);
        }
        WDErreurManager.m2883a(C0745b.m3222b(f972z[2], this.f973k.getName()) + "\n" + C0745b.m3222b(f972z[1], String.valueOf(i), this.f973k.getName(), "1", String.valueOf(_getOccurrence)));
        return null;
    }

    public WDChaine getNomComplet() {
        return new WDChaine(this.f973k.getNomComplet().getString() + getName());
    }

    public String getNomType() {
        return C0745b.m3220a(f972z[0], new String[0]);
    }

    public final lc getZoneRepetee() {
        return this.f973k;
    }

    public boolean isAttributZR() {
        return true;
    }

    public void notifModifChamp() {
        this.f973k.notifModifChamp(this.i);
    }

    public void release() {
        super.release();
        this.f973k = null;
    }

    public void setZoneRepetee(lc lcVar) {
        this.f973k = lcVar;
    }
}
