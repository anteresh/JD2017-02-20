package by.it.smirnov.jd03_02.crud;

import by.it.smirnov.jd03_02.Connection.ConnectorCreator;
import by.it.smirnov.jd03_02.bean.Bank;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static java.sql.Statement.RETURN_GENERATED_KEYS;

/**
 * Created by aleksey.smirnov on 01.05.2017.
 */
public class BankCrud extends AbstractCrud<Bank>{

    private static final String selectSQL = "SELECT `id`,`name`,`idcountry`,`bic`,`idgroupbank`,`idsysoper` FROM `banks` WHERE ID=?";
    private static final String insertSQL = "INSERT INTO `banks`(`id`,`name`,`idcountry`,`bic`,`idgroupbank`,`idsysoper`) VALUES (?,?,?,?,?,?);";
    private static final String updateSQL = "UPDATE `banks` SET `name`=?,`idcountry`=?,`bic`=?,`idgroupbank`=?,`idsysoper`=? WHERE ID=?";
    private static final String deleteSQL = "DELETE FROM `banks` WHERE ID=?";

    @Override
    Bank CreateElement(ResultSet rs) throws SQLException {
        return new Bank(
                rs.getInt("ID"),
                rs.getString("name"),
                rs.getInt("idcountry"),
                rs.getString("bic"),
                rs.getInt("idgroupbank"),
                rs.getInt("idsysoper")
        );
    }
    @Override
    Bank CreateElement(int id) {
        Bank bank = new Bank();
        bank.setId(id);
        return bank;
    }

    @Override
    PreparedStatement getStatementInsertSQL(Bank bank) throws SQLException {
        PreparedStatement ps = ConnectorCreator.getConnection().prepareStatement(insertSQL, RETURN_GENERATED_KEYS);
        ps.setInt(1,bank.getId());
        ps.setString(2,bank.getName());
        ps.setInt(3,bank.getIdcountry());
        ps.setString(4,bank.getBic());
        ps.setInt(5,bank.getIdgroupbank());
        ps.setInt(6,bank.getIdsysoper());
        return ps;
    }

    @Override
    PreparedStatement getStatementUpdateSQL(Bank bank) throws SQLException {
        PreparedStatement ps = ConnectorCreator.getConnection().prepareStatement(updateSQL);
        ps.setString(1,bank.getName());
        ps.setInt(2,bank.getIdcountry());
        ps.setString(3,bank.getBic());
        ps.setInt(4,bank.getIdgroupbank());
        ps.setInt(5,bank.getIdsysoper());
        ps.setInt(6,bank.getId());
        return ps;
    }

    @Override
    PreparedStatement getStatementDeleteSQL(Bank bank) throws SQLException {
        PreparedStatement ps = ConnectorCreator.getConnection().prepareStatement(deleteSQL);
        ps.setInt(1,bank.getId());
        return ps;
    }

    @Override
    PreparedStatement getStatementSelectSQL(Bank bank) throws SQLException{
        PreparedStatement ps = ConnectorCreator.getConnection().prepareStatement(selectSQL);
        ps.setInt(1,bank.getId());
        return ps;
    }

}