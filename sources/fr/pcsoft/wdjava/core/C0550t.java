package fr.pcsoft.wdjava.core;

import fr.pcsoft.wdjava.core.types.WDBooleen;
import fr.pcsoft.wdjava.core.types.WDEntier4;
import fr.pcsoft.wdjava.core.types.WDProcedure;
import fr.pcsoft.wdjava.core.types.cb;
import java.math.BigDecimal;

/* renamed from: fr.pcsoft.wdjava.core.t */
public abstract class C0550t extends WDObjet {
    public <T> T checkType(Class<T> cls) {
        T checkType = super.checkType(cls);
        return checkType != null ? checkType : getRefProxy().checkType(cls);
    }

    public WDObjet extraireChaine(int i) {
        return getRefProxy().extraireChaine(i);
    }

    public WDObjet extraireChaine(int i, WDObjet wDObjet) {
        return getRefProxy().extraireChaine(i, wDObjet);
    }

    public WDObjet extraireDebutChaine(int i) {
        return getRefProxy().extraireDebutChaine(i);
    }

    public WDObjet extraireDebutChaine(int i, WDObjet wDObjet) {
        return getRefProxy().extraireDebutChaine(i, wDObjet);
    }

    public WDObjet extraireFinChaine(int i) {
        return getRefProxy().extraireFinChaine(i);
    }

    public WDObjet extraireFinChaine(int i, WDObjet wDObjet) {
        return getRefProxy().extraireFinChaine(i, wDObjet);
    }

    public WDObjet extrairePartieChaine(int i, int i2) {
        return getRefProxy().extrairePartieChaine(i, i2);
    }

    public WDObjet extrairePartieChaine(int i, int i2, WDObjet wDObjet) {
        return getRefProxy().extrairePartieChaine(i, i2, wDObjet);
    }

    public WDObjet extraireSousChaine(int i, int i2) {
        return getRefProxy().extraireSousChaine(i, i2);
    }

    public WDObjet extraireSousChaine(int i, int i2, WDObjet wDObjet) {
        return getRefProxy().extraireSousChaine(i, i2, wDObjet);
    }

    public WDObjet get(int i) {
        return getRefProxy().get(i);
    }

    public WDObjet get(int i, int i2) {
        return getRefProxy().get(i, i2);
    }

    public WDObjet get(WDObjet wDObjet) {
        return getRefProxy().get(wDObjet);
    }

    public WDObjet get(WDObjet wDObjet, int i) {
        return getRefProxy().get(wDObjet, i);
    }

    public WDObjet getAjoutTermine() {
        return getRefProxy().getAjoutTermine();
    }

    public BigDecimal getBigDecimal() {
        return getRefProxy().getBigDecimal();
    }

    public boolean getBoolean() {
        return getRefProxy().getBoolean();
    }

    public byte getByte() {
        return getRefProxy().getByte();
    }

    public WDObjet getClone() {
        return new C0798u(this);
    }

    public String getDate() {
        return getRefProxy().getDate();
    }

    public String getDateHeure() {
        return getRefProxy().getDateHeure();
    }

    public byte[] getDonneeBinaire() {
        return getRefProxy().getDonneeBinaire();
    }

    public double getDouble() {
        return getRefProxy().getDouble();
    }

    public long getDuree() {
        return getRefProxy().getDuree();
    }

    public WDObjet getElement(String str) {
        return getRefProxy().getElement(str);
    }

    public WDObjet getElement(String str, boolean z) {
        return getRefProxy().getElement(str, z);
    }

    public String getHeure() {
        return getRefProxy().getHeure();
    }

    public int getInt() {
        return getRefProxy().getInt();
    }

    public Object getJSONValue() {
        return getRefProxy().getJSONValue();
    }

    public long getLong() {
        return getRefProxy().getLong();
    }

    public WDObjet getMembre(String str) {
        return getRefProxy().getMembre(str);
    }

    public WDObjet getNbThreadAttente() {
        return getRefProxy().getNbThreadAttente();
    }

    public String getNomType() {
        return getRefProxy().getNomType();
    }

    public WDEntier4 getOccurrence() {
        return getRefProxy().getOccurrence();
    }

    public WDProcedure getProcedure() {
        return getRefProxy().getProcedure();
    }

    public WDObjet getProp(EWDPropriete eWDPropriete) {
        return getRefProxy().getProp(eWDPropriete);
    }

    public abstract WDObjet getRefProxy();

    public short getShort() {
        return getRefProxy().getShort();
    }

    public String getString() {
        return getRefProxy().getString();
    }

    public int getTypeVar() {
        return getRefProxy().getTypeVar();
    }

    public int getTypeVarExt() {
        return getRefProxy().getTypeVarExt();
    }

    public String getTypeXMLPourSerialisation() {
        return getRefProxy().getTypeXMLPourSerialisation();
    }

    public WDObjet getValeur() {
        return getRefProxy().getValeur();
    }

    public WDBooleen getVide() {
        return getRefProxy().getVide();
    }

    public boolean hasProperty(String str) {
        return getRefProxy().hasProperty(str);
    }

    public WDObjet invoquerMethode(String str, WDObjet... wDObjetArr) {
        return getRefProxy().invoquerMethode(str, wDObjetArr);
    }

    public WDObjet invoquerMethode(String str, String[] strArr, WDObjet... wDObjetArr) {
        return getRefProxy().invoquerMethode(str, strArr, wDObjetArr);
    }

    public boolean isAllloue() {
        return getRefProxy().isAllloue();
    }

    public boolean isEvaluable() {
        return getRefProxy().isEvaluable();
    }

    public boolean isMemoBinaire() {
        return getRefProxy().isMemoBinaire();
    }

    public boolean isNull() {
        return getRefProxy().isNull();
    }

    public boolean isNumerique() {
        return getRefProxy().isNumerique();
    }

    public boolean isReleased() {
        return getRefProxy() == null || getRefProxy().isReleased();
    }

    public boolean isUnicode() {
        return getRefProxy().isUnicode();
    }

    public boolean isValeurNull() {
        return getRefProxy().isValeurNull();
    }

    public void liberer() {
        getRefProxy().liberer();
    }

    public boolean opCommencePar(WDObjet wDObjet) {
        return getRefProxy().opCommencePar(wDObjet);
    }

    public void opCopie(WDObjet wDObjet) {
        getRefProxy().opCopie(wDObjet);
    }

    public cb opDec() {
        return getRefProxy().opDec();
    }

    public void opDecProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        getRefProxy().opDecProp(eWDPropriete, wDObjet);
    }

    public boolean opDiff(WDObjet wDObjet) {
        return getRefProxy().opDiff(wDObjet);
    }

    public cb opDiv(WDObjet wDObjet) {
        return getRefProxy().opDiv(wDObjet);
    }

    public boolean opEgal(WDObjet wDObjet) {
        return getRefProxy().opEgal(wDObjet);
    }

    public boolean opEgalSouple(WDObjet wDObjet) {
        return getRefProxy().opEgalSouple(wDObjet);
    }

    public boolean opEgalTresSouple(WDObjet wDObjet) {
        return getRefProxy().opEgalTresSouple(wDObjet);
    }

    public cb opInc() {
        return getRefProxy().opInc();
    }

    public void opIncProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        getRefProxy().opIncProp(eWDPropriete, wDObjet);
    }

    public boolean opInf(WDObjet wDObjet) {
        return getRefProxy().opInf(wDObjet);
    }

    public boolean opInfEgal(WDObjet wDObjet) {
        return getRefProxy().opInfEgal(wDObjet);
    }

    public boolean opInstanceOf(Class cls) {
        return getRefProxy().opInstanceOf(cls);
    }

    public cb opMod(WDObjet wDObjet) {
        return getRefProxy().opMod(wDObjet);
    }

    public cb opMoins(WDObjet wDObjet) {
        return getRefProxy().opMoins(wDObjet);
    }

    public cb opMoinsUnaire() {
        return getRefProxy().opMoinsUnaire();
    }

    public cb opMult(WDObjet wDObjet) {
        return getRefProxy().opMult(wDObjet);
    }

    public cb opPlus(WDObjet wDObjet) {
        return getRefProxy().opPlus(wDObjet);
    }

    public void opPriseReference(WDObjet wDObjet) {
        getRefProxy().opPriseReference(wDObjet);
    }

    public cb opPuissance(WDObjet wDObjet) {
        return getRefProxy().opPuissance(wDObjet);
    }

    public boolean opSup(WDObjet wDObjet) {
        return getRefProxy().opSup(wDObjet);
    }

    public boolean opSupEgal(WDObjet wDObjet) {
        return getRefProxy().opSupEgal(wDObjet);
    }

    public void razVariable() {
        getRefProxy().razVariable();
    }

    public void setAjoutTermine(boolean z) {
        getRefProxy().setAjoutTermine(z);
    }

    public void setProp(EWDPropriete eWDPropriete, double d) {
        getRefProxy().setProp(eWDPropriete, d);
    }

    public void setProp(EWDPropriete eWDPropriete, int i) {
        getRefProxy().setProp(eWDPropriete, i);
    }

    public void setProp(EWDPropriete eWDPropriete, long j) {
        getRefProxy().setProp(eWDPropriete, j);
    }

    public void setProp(EWDPropriete eWDPropriete, WDObjet wDObjet) {
        getRefProxy().setProp(eWDPropriete, wDObjet);
    }

    public void setProp(EWDPropriete eWDPropriete, String str) {
        getRefProxy().setProp(eWDPropriete, str);
    }

    public void setProp(EWDPropriete eWDPropriete, boolean z) {
        getRefProxy().setProp(eWDPropriete, z);
    }

    public void setValeur(double d) {
        getRefProxy().setValeur(d);
    }

    public void setValeur(int i) {
        getRefProxy().setValeur(i);
    }

    public void setValeur(long j) {
        getRefProxy().setValeur(j);
    }

    public void setValeur(WDObjet wDObjet) {
        getRefProxy().setValeur(wDObjet);
    }

    public void setValeur(String str) {
        getRefProxy().setValeur(str);
    }

    public void setValeur(boolean z) {
        getRefProxy().setValeur(z);
    }
}
