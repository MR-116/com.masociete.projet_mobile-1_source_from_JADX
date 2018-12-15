package fr.pcsoft.wdjava.core.types.collection;

import fr.pcsoft.wdjava.api.WDAPICollection;
import fr.pcsoft.wdjava.core.C0723g;
import fr.pcsoft.wdjava.core.allocation.IWDAllocateur;
import fr.pcsoft.wdjava.core.ressources.messages.C0745b;

@C0723g(a = {WDAPICollection.class})
public class WDPile extends C0753g {
    /* renamed from: z */
    private static final String f1962z = m3346z(m3347z("\u0002:d}W"));

    public WDPile(int i) {
        super(C0757h.STACK, i, null);
    }

    public WDPile(IWDAllocateur iWDAllocateur) {
        super(C0757h.STACK, iWDAllocateur.getTypeWL(), iWDAllocateur);
    }

    /* renamed from: z */
    private static String m3346z(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; length > i; i++) {
            int i2;
            char c = cArr[i];
            switch (i % 5) {
                case 0:
                    i2 = 33;
                    break;
                case 1:
                    i2 = 106;
                    break;
                case 2:
                    i2 = 45;
                    break;
                case 3:
                    i2 = 49;
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
    private static char[] m3347z(String str) {
        char[] toCharArray = str.toCharArray();
        if (toCharArray.length < 2) {
            toCharArray[0] = (char) (toCharArray[0] ^ 18);
        }
        return toCharArray;
    }

    public String getNomType() {
        return C0745b.m3220a(f1962z, new String[0]);
    }

    public int getTypeVar() {
        return 113;
    }

    /* renamed from: n */
    public C0753g mo2630n() {
        return this.a != null ? new WDPile(this.a) : new WDPile(this.d);
    }
}
