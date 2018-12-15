package fr.pcsoft.wdjava.ui.champs.zr;

import android.content.Context;
import android.view.View;
import fr.pcsoft.wdjava.core.EWDPropriete;
import fr.pcsoft.wdjava.core.WDObjet;
import fr.pcsoft.wdjava.ui.activite.C1056i;
import fr.pcsoft.wdjava.ui.champs.dc;
import fr.pcsoft.wdjava.ui.champs.gc;
import fr.pcsoft.wdjava.ui.champs.zr.WDAbstractZRRenderer.AbstractRepetitionView;

/* renamed from: fr.pcsoft.wdjava.ui.champs.zr.f */
public class C1295f extends WDAbstractZRRenderer {
    /* renamed from: z */
    private static final String f3867z = C1295f.m9124z(C1295f.m9125z("V,Ft\u0005U7X`\u0005N7"));

    public C1295f(WDZoneRepetee wDZoneRepetee) {
        super(wDZoneRepetee);
    }

    /* renamed from: z */
    private static String m9124z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 104;
                    break;
                case 2:
                    i2 = 25;
                    break;
                case 3:
                    i2 = 53;
                    break;
                default:
                    i2 = 81;
                    break;
            }
            cArr[i] = (char) (i2 ^ c);
        }
        return new String(cArr).intern();
    }

    /* renamed from: z */
    private static char[] m9125z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 81);
        }
        return toCharArray;
    }

    /* renamed from: a */
    public AbstractRepetitionView mo3543a(int i, View view) {
        return view == null ? m9127a(C1056i.m7562a()) : (eb) view;
    }

    /* renamed from: a */
    protected eb m9127a(Context context) {
        return new eb(this, context);
    }

    /* renamed from: a */
    protected sb mo3544a(Context context, int[] iArr) {
        return new tb(this, context, iArr);
    }

    /* renamed from: a */
    public void mo3549a(gc gcVar, EWDPropriete eWDPropriete, WDObjet wDObjet) {
        super.mo3549a(gcVar, eWDPropriete, wDObjet);
        if (!this.b.isPropNeedUpdateLayout(eWDPropriete)) {
            dc attribut = gcVar.getAttribut(eWDPropriete);
            if (attribut == null) {
                attribut = this.b.creerAttribut(f3867z + gcVar.getName() + String.valueOf(eWDPropriete.ordinal()), eWDPropriete, gcVar);
            }
            attribut.setValeurDefautAttribut(wDObjet);
        }
        this.b.updateContenu();
    }
}
