/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiCuoiKi.De6;
/**
 *
 * @author Admin
 */
public class Word implements Comparable<Word>{
    private String id;
    private String en;
    private String vn;

    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    public Word() {
        this.id = "null";
    }

    public Word(String id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }

    @Override
    public String toString() {
        return "Word{" + "id=" + id + ", en=" + en + ", vn=" + vn + '}';
    }
    public String[] toArrayStrings()
    {
        String[] st = {id,en,vn};
        return st;
    }

    @Override
    public int compareTo(Word t) {
        return this.en.compareToIgnoreCase(t.getEn());
    }

    
    
}

