package Database.Weight;

import Database.DBConnector;

import javax.swing.*;

public class DBMenuWeightHelper {

    static public JMenu getMenu(JTextPane jTextPane) {

        JMenu dbMenu = new JMenu("Database");

        JMenuItem dbUpdateMenuItem = new JMenuItem("update");
        JMenuItem dbRollbackMenuItem = new JMenuItem("rollback");

        dbUpdateMenuItem.addActionListener(e -> {

            DBConnector dbConnector = DBConnector.getInstance();
            dbConnector.createDocumentModel(jTextPane);
        });

        dbRollbackMenuItem.addActionListener(e -> {
            DBConnector dbConnector = DBConnector.getInstance();
            dbConnector.rollbackToNewstDocumentModel(jTextPane);
        });

        dbMenu.add((dbUpdateMenuItem));
        dbMenu.add(dbRollbackMenuItem);

        return dbMenu;
    }


}
