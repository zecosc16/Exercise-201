/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_201;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author oskar
 */
public class VelocityTableModel extends AbstractTableModel{

    private ArrayList<Measurement> me = new ArrayList<>();
    private String[] colNames= {"Datum","Uhrzeit","Kennzeichen","Erlaubt","Übertretung"};
    
    
    public void add(Measurement m){
     me.add(m);
        fireTableRowsInserted(me.size()-1, me.size()-1);
    }

    @Override
    public int getRowCount() {
        return me.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Measurement m =me.get(rowIndex);
        return m;
    }

    @Override
    public String getColumnName(int column) {
        return colNames[column];
    }
    
    
    
    
    

    
    
}
