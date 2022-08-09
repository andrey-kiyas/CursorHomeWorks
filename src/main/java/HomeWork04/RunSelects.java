package HomeWork04;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class RunSelects {

    public static final String SQL_SELECT_01 = "USE STORE; SELECT MODEL_YEAR FROM PRODUCTS GROUP BY MODEL_YEAR ORDER BY MODEL_YEAR;";
    public static final String SQL_SELECT_02 = "USE STORE; SELECT MODEL_YEAR, COUNT(ID) as \"QTY\" FROM PRODUCTS GROUP BY MODEL_YEAR HAVING MODEL_YEAR >= 2017 ORDER BY \"QTY\" DESC;";
    public static final String SQL_SELECT_03 = "USE STORE; SELECT t1.\"NAME\" as \"PRODUCT_NAME\", t2.\"NAME\" as \"CATEGORY_NAME\", t1.PRICE FROM PRODUCTS as t1 JOIN CATEGORIES as t2 on t2.ID = t1.CATEGORY_ID and t2.\"NAME\" like '%Bikes%' and t1.PRICE > 6000 ORDER BY t1.PRICE DESC;";
    public static final String SQL_SELECT_04 = "USE STORE; SELECT t1.\"NAME\" as \"PRODUCT_NAME\", t2.\"NAME\" as \"CATEGORY_NAME\", t3.\"NAME\" as \"BRAND_NAME\", t1.PRICE FROM PRODUCTS as t1 JOIN CATEGORIES as t2 on t2.ID = t1.CATEGORY_ID and (t2.\"NAME\" like '%Comfort%' or  t2.\"NAME\" like '%Mountain%') JOIN BRANDS     as t3 on t3.ID      = t1.BRAND_ID and t3.\"NAME\"  != 'Sun Bicycles' and t1.PRICE   BETWEEN 500 and 550 ORDER BY t1.PRICE DESC;";
    public static final String SQL_SELECT_05 = "USE STORE; SELECT TOP 3 t1.\"NAME\" as \"PRODUCT_NAME\", t1.PRICE FROM PRODUCTS   as t1 ORDER BY t1.\"NAME\" DESC;";

    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433";
        String userName = "DN140484KAS";
        String password = "12121212";

        try {
            DriverManager.registerDriver(new SQLServerDriver());
            Connection connectionSelect01 = DriverManager.getConnection(url, userName, password);
            Statement statementSelect01 = connectionSelect01.createStatement();
            ResultSet resultSelect01 = statementSelect01.executeQuery(SQL_SELECT_01);

            List<Select01> Select01List = new LinkedList<>();
            while (resultSelect01.next()) {
                Select01 select01 = buildSelect01(resultSelect01);
                Select01List.add(select01);
            }

            System.out.println("Result of Select01:\n" + Select01List + "\n");
            resultSelect01.close();
            statementSelect01.close();
            connectionSelect01.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            DriverManager.registerDriver(new SQLServerDriver());
            Connection connectionSelect02 = DriverManager.getConnection(url, userName, password);
            Statement statementSelect02 = connectionSelect02.createStatement();
            ResultSet resultSelect02 = statementSelect02.executeQuery(SQL_SELECT_02);

            List<Select02> Select02List = new LinkedList<>();
            while (resultSelect02.next()) {
                Select02 select02 = buildSelect02(resultSelect02);
                Select02List.add(select02);
            }

            System.out.println("Result of Select02:\n" + Select02List + "\n");
            resultSelect02.close();
            statementSelect02.close();
            connectionSelect02.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            DriverManager.registerDriver(new SQLServerDriver());
            Connection connectionSelect03 = DriverManager.getConnection(url, userName, password);
            Statement statementSelect03 = connectionSelect03.createStatement();
            ResultSet resultSelect03 = statementSelect03.executeQuery(SQL_SELECT_03);

            List<Select03> Select03List = new LinkedList<>();
            while (resultSelect03.next()) {
                Select03 select03 = buildSelect03(resultSelect03);
                Select03List.add(select03);
            }

            System.out.println("Result of Select03:\n" + Select03List + "\n");
            resultSelect03.close();
            statementSelect03.close();
            connectionSelect03.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            DriverManager.registerDriver(new SQLServerDriver());
            Connection connectionSelect04 = DriverManager.getConnection(url, userName, password);
            Statement statementSelect04 = connectionSelect04.createStatement();
            ResultSet resultSelect04 = statementSelect04.executeQuery(SQL_SELECT_04);

            List<Select04> Select04List = new LinkedList<>();
            while (resultSelect04.next()) {
                Select04 select04 = buildSelect04(resultSelect04);
                Select04List.add(select04);
            }

            System.out.println("Result of Select04:\n" + Select04List + "\n");
            resultSelect04.close();
            statementSelect04.close();
            connectionSelect04.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {
            DriverManager.registerDriver(new SQLServerDriver());
            Connection connectionSelect05 = DriverManager.getConnection(url, userName, password);
            Statement statementSelect05 = connectionSelect05.createStatement();
            ResultSet resultSelect05 = statementSelect05.executeQuery(SQL_SELECT_05);

            List<Select05> Select05List = new LinkedList<>();
            while (resultSelect05.next()) {
                Select05 select05 = buildSelect05(resultSelect05);
                Select05List.add(select05);
            }

            System.out.println("Result of Select05:\n" + Select05List + "\n");
            resultSelect05.close();
            statementSelect05.close();
            connectionSelect05.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    private static Select01 buildSelect01(ResultSet resultSelect01) throws SQLException {
        Select01 select01 = new Select01();
        select01.setModelYear(resultSelect01.getInt(1));
        return select01;
    }

    private static Select02 buildSelect02(ResultSet resultSelect02) throws SQLException {
        Select02 select02 = new Select02();
        select02.setModelYear(resultSelect02.getInt(1));
        select02.setModelYearQTY(resultSelect02.getInt(2));
        return select02;
    }

    private static Select03 buildSelect03(ResultSet resultSelect03) throws SQLException {
        Select03 select03 = new Select03();
        select03.setProductName(resultSelect03.getString(1));
        select03.setCategoryName(resultSelect03.getString(2));
        select03.setPrice(resultSelect03.getDouble(3));
        return select03;
    }

    private static Select04 buildSelect04(ResultSet resultSelect04) throws SQLException {
        Select04 select04 = new Select04();
        select04.setProductName(resultSelect04.getString(1));
        select04.setCategoryName(resultSelect04.getString(2));
        select04.setBrandName(resultSelect04.getString(3));
        select04.setPrice(resultSelect04.getDouble(4));
        return select04;
    }

    private static Select05 buildSelect05(ResultSet resultSelect05) throws SQLException {
        Select05 select05 = new Select05();
        select05.setCategoryName(resultSelect05.getString(1));
        select05.setPrice(resultSelect05.getDouble(2));
        return select05;
    }
}