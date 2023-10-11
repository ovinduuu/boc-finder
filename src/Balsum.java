/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ovidu
 */
class Balsum {
    private String date,fno,type;
    private int qty;
    private final float unitprice,balance;
    
    public Balsum(String date, String fno, String type, int qty, float unitprice, float balance){
        this.date=date;
        this.fno=fno;
        this.type=type;
        this.qty=qty;
        this.unitprice=unitprice;
        this.balance=balance;
        
    }
    public String getdate(){
        return date;
    }
    public String getfno(){
        return fno;
    }
    public String gettype(){
        return type;
    }public int getqty(){
        return qty;
    }
    public float getunitprice(){
        return unitprice;
    }public float getbalance(){
        return balance;
    }
}
