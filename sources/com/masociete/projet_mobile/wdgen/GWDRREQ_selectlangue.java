package com.masociete.projet_mobile.wdgen;

import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.Requete;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;

public class GWDRREQ_selectlangue extends WDDescRequeteWDR {
    public String getNomLogique() {
        return "REQ_selectlangue";
    }

    public String getCodeSQLOriginal() {
        return " SELECT  langues.IDlangues AS IDlangues,\t langues.langue AS langue,\t langues.num_serie_tel AS num_serie_tel  FROM  langues  WHERE   langues.num_serie_tel = {Param1#0}";
    }

    public Requete initArbre() throws WDInvalidSQLException {
        Select varSelect = new Select();
        varSelect.setType(1);
        Rubrique rub_IDlangues = new Rubrique();
        rub_IDlangues.setNom("IDlangues");
        rub_IDlangues.setAlias("IDlangues");
        rub_IDlangues.setNomFichier("langues");
        rub_IDlangues.setAliasFichier("langues");
        varSelect.ajouterElement(rub_IDlangues);
        Rubrique rub_langue = new Rubrique();
        rub_langue.setNom("langue");
        rub_langue.setAlias("langue");
        rub_langue.setNomFichier("langues");
        rub_langue.setAliasFichier("langues");
        varSelect.ajouterElement(rub_langue);
        Rubrique rub_num_serie_tel = new Rubrique();
        rub_num_serie_tel.setNom("num_serie_tel");
        rub_num_serie_tel.setAlias("num_serie_tel");
        rub_num_serie_tel.setNomFichier("langues");
        rub_num_serie_tel.setAliasFichier("langues");
        varSelect.ajouterElement(rub_num_serie_tel);
        From varFrom = new From();
        Fichier fic_langues = new Fichier();
        fic_langues.setNom("langues");
        fic_langues.setAlias("langues");
        varFrom.ajouterElement(fic_langues);
        Requete varReqSelect = new Requete(1);
        varReqSelect.ajouterClause(varSelect);
        varReqSelect.ajouterClause(varFrom);
        Expression expr__ = new Expression(9, "=", "langues.num_serie_tel = {Param1}");
        Rubrique rub_num_serie_tel_1 = new Rubrique();
        rub_num_serie_tel_1.setNom("langues.num_serie_tel");
        rub_num_serie_tel_1.setAlias("num_serie_tel");
        rub_num_serie_tel_1.setNomFichier("langues");
        rub_num_serie_tel_1.setAliasFichier("langues");
        expr__.ajouterElement(rub_num_serie_tel_1);
        Parametre param_Param1 = new Parametre();
        param_Param1.setNom("Param1");
        expr__.ajouterElement(param_Param1);
        Where varWhere = new Where();
        varWhere.ajouterElement(expr__);
        varReqSelect.ajouterClause(varWhere);
        Limit varLimit = new Limit();
        varLimit.setType(0);
        varLimit.setNbEnregs(0);
        varLimit.setOffset(0);
        varReqSelect.ajouterClause(varLimit);
        return varReqSelect;
    }

    public String getNomFichier(int nIndex) {
        switch (nIndex) {
            case 0:
                return "langues";
            default:
                return null;
        }
    }

    public String getAliasFichier(int nIndex) {
        switch (nIndex) {
            case 0:
                return "langues";
            default:
                return null;
        }
    }
}
