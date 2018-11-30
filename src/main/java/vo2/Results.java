/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo2;

/**
 *
 * @author Asus-PC
 */
public class Results {

    int IDresultado;// INT NOT NULL auto_increment PRIMARY KEY , 
    int idEstudiante;// INT NOT NULL,
    String CAT;// varchar(30) NOT NULL,
    int ENO;// int not null,
    int POINTS;// int not null,
    int idexercises;//INT NOT NULL,    

    public Results(int IDresultado, int idEstudiante, String CAT, int ENO, int POINTS, int idexercises) {
        this.IDresultado = IDresultado;
        this.idEstudiante = idEstudiante;
        this.CAT = CAT;
        this.ENO = ENO;
        this.POINTS = POINTS;
        this.idexercises = idexercises;
    }
        public Results() {
        this.IDresultado = 0;
        this.idEstudiante = 0;
        this.CAT = "aaa";
        this.ENO = 122;
        this.POINTS = 10;
        this.idexercises = 1;
    }

    public int getIDresultado() {
        return IDresultado;
    }

    public void setIDresultado(int IDresultado) {
        this.IDresultado = IDresultado;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getCAT() {
        return CAT;
    }

    public void setCAT(String CAT) {
        this.CAT = CAT;
    }

    public int getENO() {
        return ENO;
    }

    public void setENO(int ENO) {
        this.ENO = ENO;
    }

    public int getPOINTS() {
        return POINTS;
    }

    public void setPOINTS(int POINTS) {
        this.POINTS = POINTS;
    }

    public int getIdexercises() {
        return idexercises;
    }

    public void setIdexercises(int idexercises) {
        this.idexercises = idexercises;
    }

}
