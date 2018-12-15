package fr.pcsoft.wdjava.ui.champs.fenetre;

import fr.pcsoft.wdjava.core.C0607n;

/* renamed from: fr.pcsoft.wdjava.ui.champs.fenetre.a */
class C1147a {
    /* renamed from: a */
    private int f3505a = 0;

    public C1147a(int i, int i2, boolean z) {
        if (z) {
            i = m8333b(i);
            i2 = m8332a(i2);
        }
        this.f3505a = (65535 & i) | (i2 << 16);
    }

    /* renamed from: a */
    private final int m8332a(int i) {
        int i2 = 0;
        if ((i & 32) == 32) {
        }
        if ((i & 16) == 16) {
            i2 = 1;
        }
        return (i & 64) == 64 ? i2 + 2 : i2;
    }

    /* renamed from: b */
    private final int m8333b(int i) {
        switch (i) {
            case 8:
                return 67;
            case 13:
                return 23;
            case 27:
                return 4;
            case 32:
                return 62;
            case 37:
                return 21;
            case 38:
                return 19;
            case 39:
                return 22;
            case 40:
                return 20;
            case 44:
                return 55;
            case 45:
                return 69;
            case 46:
                return 56;
            case 47:
                return 76;
            case 48:
            case 96:
                return 7;
            case 49:
            case 97:
                return 8;
            case 50:
            case 98:
                return 9;
            case 51:
            case 99:
                return 10;
            case 52:
            case 100:
                return 11;
            case 53:
            case 101:
                return 12;
            case 54:
            case 102:
                return 13;
            case 55:
            case 103:
                return 14;
            case 56:
            case 104:
                return 15;
            case 57:
            case 105:
                return 16;
            case 65:
                return 29;
            case 66:
                return 30;
            case 67:
                return 31;
            case 68:
                return 32;
            case 69:
                return 33;
            case 70:
                return 34;
            case 71:
                return 35;
            case 72:
                return 36;
            case 73:
                return 37;
            case 74:
                return 38;
            case 75:
                return 39;
            case 76:
                return 40;
            case 77:
                return 41;
            case 78:
                return 42;
            case 79:
                return 43;
            case 80:
                return 44;
            case 81:
                return 45;
            case 82:
                return 46;
            case 83:
                return 47;
            case 84:
                return 48;
            case 85:
                return 49;
            case 86:
                return 50;
            case 87:
                return 51;
            case 88:
                return 52;
            case 89:
                return 53;
            case 90:
                return 54;
            case 91:
                return 3;
            case 114:
                return 5;
            case 115:
                return 6;
            case 117:
                return 24;
            case 118:
                return 25;
            case 119:
                return 17;
            case C0607n.co /*120*/:
                return 18;
            case 137:
                return 82;
            case 138:
                return 84;
            case 139:
                return 27;
            case 521:
                return 81;
            case 61443:
                return 91;
            case 61445:
                return 26;
            default:
                return 0;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C1147a) && ((C1147a) obj).f3505a == this.f3505a;
    }

    public int hashCode() {
        return this.f3505a;
    }
}
