package com.masociete.projet_mobile.wdgen;

import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.Element;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDDescRequeteWDR.Requete;
import fr.pcsoft.wdjava.database.hf.requete.parsing.WDInvalidSQLException;

public class GWDRREQ_selectidentite extends WDDescRequeteWDR {
    public String getNomLogique() {
        return "REQ_selectidentite";
    }

    public String getCodeSQLOriginal() {
        return "SELECT \r\n\tUtilisateur.IDUtilisateur AS IDUtilisateur,\t\r\n\tUtilisateur.nom_u AS nom_u,\t\r\n\tUtilisateur.tel_u AS tel_u,\t\r\n\tUtilisateur.num_serie_tel AS num_serie_tel,\t\r\n\tUtilisateur.email_u AS email_u,\t\r\n\tUtilisateur.multimedia_vocal AS ch1,\t\r\n\tUtilisateur.ch2 AS ch2,\t\r\n\tUtilisateur.IDlangue AS IDlangue\r\nFROM \r\n\tUtilisateur\r\nWHERE \r\n\tUtilisateur.num_serie_tel = {Param1#0}";
    }

    public Requete initArbre() throws WDInvalidSQLException {
        Select varSelect = new Select();
        varSelect.setType(1);
        Rubrique rub_IDUtilisateur = new Rubrique();
        rub_IDUtilisateur.setNom("IDUtilisateur");
        rub_IDUtilisateur.setAlias("IDUtilisateur");
        rub_IDUtilisateur.setNomFichier("Utilisateur");
        rub_IDUtilisateur.setAliasFichier("Utilisateur");
        varSelect.ajouterElement(rub_IDUtilisateur);
        Rubrique rub_nom_u = new Rubrique();
        rub_nom_u.setNom("nom_u");
        rub_nom_u.setAlias("nom_u");
        rub_nom_u.setNomFichier("Utilisateur");
        rub_nom_u.setAliasFichier("Utilisateur");
        varSelect.ajouterElement(rub_nom_u);
        Rubrique rub_tel_u = new Rubrique();
        rub_tel_u.setNom("tel_u");
        rub_tel_u.setAlias("tel_u");
        rub_tel_u.setNomFichier("Utilisateur");
        rub_tel_u.setAliasFichier("Utilisateur");
        varSelect.ajouterElement(rub_tel_u);
        Rubrique rub_num_serie_tel = new Rubrique();
        rub_num_serie_tel.setNom("num_serie_tel");
        rub_num_serie_tel.setAlias("num_serie_tel");
        rub_num_serie_tel.setNomFichier("Utilisateur");
        rub_num_serie_tel.setAliasFichier("Utilisateur");
        varSelect.ajouterElement(rub_num_serie_tel);
        Rubrique rub_email_u = new Rubrique();
        rub_email_u.setNom("email_u");
        rub_email_u.setAlias("email_u");
        rub_email_u.setNomFichier("Utilisateur");
        rub_email_u.setAliasFichier("Utilisateur");
        varSelect.ajouterElement(rub_email_u);
        Rubrique rub_ch1 = new Rubrique();
        rub_ch1.setNom("multimedia_vocal");
        rub_ch1.setAlias("ch1");
        rub_ch1.setNomFichier("Utilisateur");
        rub_ch1.setAliasFichier("Utilisateur");
        varSelect.ajouterElement(rub_ch1);
        Rubrique rub_ch2 = new Rubrique();
        rub_ch2.setNom("ch2");
        rub_ch2.setAlias("ch2");
        rub_ch2.setNomFichier("Utilisateur");
        rub_ch2.setAliasFichier("Utilisateur");
        varSelect.ajouterElement(rub_ch2);
        Rubrique rub_IDlangue = new Rubrique();
        rub_IDlangue.setNom("IDlangue");
        rub_IDlangue.setAlias("IDlangue");
        rub_IDlangue.setNomFichier("Utilisateur");
        rub_IDlangue.setAliasFichier("Utilisateur");
        varSelect.ajouterElement(rub_IDlangue);
        From varFrom = new From();
        Fichier fic_Utilisateur = new Fichier();
        fic_Utilisateur.setNom("Utilisateur");
        fic_Utilisateur.setAlias("Utilisateur");
        varFrom.ajouterElement(fic_Utilisateur);
        Requete requete = new Requete(1);
        requete.ajouterClause(varSelect);
        requete.ajouterClause(varFrom);
        Expression expr__ = new Expression(9, "=", "Utilisateur.num_serie_tel = {Param1}");
        Rubrique rub_num_serie_tel_1 = new Rubrique();
        rub_num_serie_tel_1.setNom("Utilisateur.num_serie_tel");
        rub_num_serie_tel_1.setAlias("num_serie_tel");
        rub_num_serie_tel_1.setNomFichier("Utilisateur");
        rub_num_serie_tel_1.setAliasFichier("Utilisateur");
        expr__.ajouterElement(rub_num_serie_tel_1);
        Parametre param_Param1 = new Parametre();
        param_Param1.setNom("Param1");
        expr__.ajouterElement(param_Param1);
        Element varWhere = new Where();
        varWhere.ajouterElement(expr__);
        requete.ajouterClause(varWhere);
        Element varLimit = new Limit();
        varLimit.setType(0);
        varLimit.setNbEnregs(0);
        varLimit.setOffset(0);
        requete.ajouterClause(varLimit);
        return requete;
    }

    public String getNomFichier(int nIndex) {
        switch (nIndex) {
            case 0:
                return "Utilisateur";
            default:
                return null;
        }
    }

    public String getAliasFichier(int nIndex) {
        switch (nIndex) {
            case 0:
                return "Utilisateur";
            default:
                return null;
        }
    }
}
