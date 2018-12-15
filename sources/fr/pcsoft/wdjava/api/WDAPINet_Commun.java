package fr.pcsoft.wdjava.api;

import fr.pcsoft.wdjava.core.types.WDChaine;
import fr.pcsoft.wdjava.net.C0974g;

public class WDAPINet_Commun {
    public static WDChaine netNomMachine() {
        return new WDChaine(C0974g.m7036a(""));
    }

    public static WDChaine netNomMachine(String str) {
        return new WDChaine(C0974g.m7036a(str));
    }
}
