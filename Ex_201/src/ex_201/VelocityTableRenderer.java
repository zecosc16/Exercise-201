/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex_201;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author oskar
 */
public class VelocityTableRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Measurement measurement = (Measurement) value;
        JLabel label = new JLabel();
        label.setOpaque(true);
        int velocityDiff = measurement.calculateVelocityDiff();
        if (column == 4) {
            if (velocityDiff <= 10) {

            } else if (velocityDiff <= 20) {

            } else if (velocityDiff <= 30) {

            } else {

            }
        }
        return label;
    }

}
