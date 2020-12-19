/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThiCuoiKi.De6;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
/**
 *
 * @author PhamDoanHieu
 */
public class DictionaryController {
    DictionaryFrm dictionaryFrm;
    ArrayList<Word> dictionary;

    public DictionaryController(DictionaryFrm dictionaryFrm) {
        this.dictionaryFrm = dictionaryFrm;
        dictionary = new ArrayList<>();
        dictionary.add(new Word("1", "Hello", "xin chao"));
        dictionary.add(new Word("2", "Array", "mang"));
        dictionary.add(new Word("3", "apple", "tao"));
        dictionary.add(new Word("4", "any", "bat ky"));
        dictionary.add(new Word("5", "book", "sach"));
        dictionary.add(new Word("6", "center", "trung tam"));
        dictionary.add(new Word("7", "dictionary", "tu dien"));
        dictionary.add(new Word("8", "element", "phan tu"));
        dictionary.add(new Word("9", "friend", "ban be"));
        dictionary.add(new Word("10", "why", "tai sao"));
        dictionary.add(new Word("11", "fire", "lửa"));
        Collections.sort(dictionary);
    }
    public void search(String keyWord)
    {
        int index = searchBinary(0, dictionary.size()-1, keyWord);
        if(index == -1)
        {
            JOptionPane.showMessageDialog(dictionaryFrm, "Not Found!"
                    + "\nPlease add this word :D");
            dictionaryFrm.getTxtVn().setText("");
        }
        else
        {
            dictionaryFrm.getTxtVn().setText(dictionary.get(index).getVn());
        }
    }
    public int searchBinary(int left, int right, String keyWord)
    {
        int mid = (left + right) /2;
        if(left>right)
            return -1;
        int compareValue = keyWord.compareToIgnoreCase(dictionary.get(mid).getEn());
        if(compareValue ==0)
            return mid;
        else if(compareValue >0)
        {
            left = mid +1;
        }
        else {
            right = mid -1;
        }
        return  searchBinary(left, right, keyWord);
    }

    void addWord(String en, String vn) {
        dictionary.add(new Word(String.valueOf(dictionary.size()), en, vn));
        Collections.sort(dictionary);
        System.out.println(dictionary);
        JOptionPane.showMessageDialog(dictionaryFrm, "Add complete!");
    }

}
